package br.com.caelum.stella.nfe.builder.generated;

import java.math.BigDecimal;

public final class CIDEImplTest {
    @org.junit.Test
    public void testCIDEInterface() {
        CIDE cIDE = new CIDEImpl().withBC(new BigDecimal("1")).withAliquota(new BigDecimal("1")).withValor(
                new BigDecimal("1"));
        assertModelWasFilled(cIDE);
    }

    private void assertModelWasFilled(final CIDE cIDE) {
        new br.com.caelum.stella.nfe.builder.BuilderTestHelper(cIDE).assertModelWasFilled();
    }
}