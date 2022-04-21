package com.geekbrains.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BoxTest {
    Box box;

    @Nested
    class WhenEmpty {
        @BeforeEach
        void createEmptyBox() {
            box = new Box();
        }

        @Test
        void exceptionWhenTryToShuffleBoxTest() {
            Assertions.assertThrows(NullPointerException.class, () -> box.shuffleBalls());
        }

        @Test
        void addBallTest() {
            box.addBall();
            Assertions.assertEquals(box.getBallsCount(), 1);
        }

        @Nested
        class WhenOneBall {
            @BeforeEach
            void addBall() {
                box.addBall();
            }

            @Test
            void deleteBallTest() throws BoxIsAlreadyEmptyException {
                box.deleteBall();
                Assertions.assertEquals(box.getBallsCount(), 0);
            }
        }
    }
}
