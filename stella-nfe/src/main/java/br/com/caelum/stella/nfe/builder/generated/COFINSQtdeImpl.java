package br.com.caelum.stella.nfe.builder.generated;

import java.math.BigDecimal;

public final class COFINSQtdeImpl implements COFINSQtde, br.com.caelum.stella.nfe.ObjectCreator {
    private final br.com.caelum.stella.nfe.modelo.COFINSQtde cOFINSQtde;

    public COFINSQtdeImpl() {
        cOFINSQtde = new br.com.caelum.stella.nfe.modelo.COFINSQtde();
    }

    public br.com.caelum.stella.nfe.modelo.COFINSQtde getInstance() {
        return cOFINSQtde;
    }

    public COFINSQtde withCodigoSituacaoTributaria(final String string) {
        cOFINSQtde.setCodigoSituacaoTributaria(string);
        return this;
    }

    public COFINSQtde withQuantidadeVendida(final BigDecimal string) {
        cOFINSQtde.setQuantidadeVendida(string.toString());
        return this;
    }

    public COFINSQtde withAliquota(final BigDecimal string) {
        cOFINSQtde.setAliquota(string.toString());
        return this;
    }

    public COFINSQtde withValor(final BigDecimal string) {
        cOFINSQtde.setValor(string.toString());
        return this;
    }
}