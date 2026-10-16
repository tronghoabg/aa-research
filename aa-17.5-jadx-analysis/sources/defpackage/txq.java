package defpackage;

/* loaded from: classes3.dex */
public final class txq {
    private uly a;
    private int b;
    private byte c = 1;

    public txq(txr txrVar) {
        this.a = txrVar.a;
        this.b = txrVar.b;
    }

    public final txr a() {
        uly ulyVar;
        if (this.c != 1 || (ulyVar = this.a) == null) {
            throw new IllegalStateException();
        }
        return new txr(ulyVar, this.b);
    }

    public final void b(uly ulyVar) {
        ulyVar.getClass();
        this.a = ulyVar;
    }

    public final void c(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
