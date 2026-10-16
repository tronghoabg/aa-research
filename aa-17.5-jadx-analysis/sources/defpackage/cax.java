package defpackage;

/* loaded from: classes.dex */
public abstract class cax {
    public final int b;
    public final int c;

    public cax(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar);

    protected bzb b(cba cbaVar) {
        return null;
    }

    public final String toString() {
        String simpleName = affw.a.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }
}
