package apache.jdo.tck;

import org.apache.jdo.tck.pc.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiniTest {

    private static int pass = 0;

    @Test
    void test() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        // Create Threads for each candidate() method.
        // The methods are implemented in separate methods to avoid the classloader
        // loading the respective Q-classes.
        threads.add(new Thread(this::testA1)); // This is the candidate() that is usually involved in hangs.
        threads.add(new Thread(this::testA2));
        threads.add(new Thread(this::testA3));
        threads.add(new Thread(this::testA4));
        threads.add(new Thread(this::testA5));
        threads.add(new Thread(this::testA6));
        threads.add(new Thread(this::testA7));
        threads.add(new Thread(this::testA8));
        threads.add(new Thread(this::testA9));
        threads.add(new Thread(this::testA0));

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join(1000);
            // If this fails then the threads hang (-> deadlock)!
            if (t.isAlive()) {
                for (Thread t2 : threads) {
                    System.out.println("------------- Thread: " + t2.getId() + "   " + t2.getName());
                    for (StackTraceElement e : t2.getStackTrace()) {
                        System.out.println(t2.getId() + "  " + e);
                    }
                }
                fail();
            }
        }

        assertEquals(1, pass);
    }

    void testA1() {
        assertNotNull(QCompany.candidate("this"));
        pass++;
    }

    void testA2() {
        assertNotNull(QDentalInsurance.candidate("this"));
    }

    void testA3() {
        assertNotNull(QDepartment.candidate("this"));
    }

    void testA4() {
        assertNotNull(QEmployee.candidate("this"));
    }

    void testA5() {
        assertNotNull(QFullTimeEmployee.candidate("this"));
    }

    void testA6() {
        assertNotNull(QInsurance.candidate("this"));
    }

    void testA7() {
        assertNotNull(QMedicalInsurance.candidate("this"));
    }

    void testA8() {
        assertNotNull(QMeetingRoom.candidate("this"));
    }

    void testA9() {
        assertNotNull(QPerson.candidate("this"));
    }

    void testA0() {
        assertNotNull(QProject.candidate());
    }
}
