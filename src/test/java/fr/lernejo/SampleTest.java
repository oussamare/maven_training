package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void sample_op_ADD_return() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.ADD, 3, 4);
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    void sample_op_MULT_return() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.MULT, 3, 4);
        Assertions.assertThat(result).isEqualTo(12);

    }
    @Test

    public void test_fact_nombre_positifs() {
        Sample sample = new Sample();
        int a = 3;
        Assertions.assertThat(sample.fact(a)).isEqualTo(6);
    }

    @Test
    public void test_fact_nombre_negatif () {
        Sample sample = new Sample();

        int n = -5;

        Assertions.assertThatIllegalArgumentException()
            .isThrownBy(() -> sample.fact(n))
            .withMessage("N should be positive");
    }
}
