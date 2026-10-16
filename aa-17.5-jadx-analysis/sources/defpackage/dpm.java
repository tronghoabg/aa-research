package defpackage;

/* loaded from: classes2.dex */
public final class dpm extends Exception {
    private final String a;
    private final String b;

    public dpm(String str, dph dphVar) {
        super(str);
        this.a = str;
        this.b = dphVar.y();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "CLParsingException (" + hashCode() + ") : " + (this.a + " (" + this.b + " at line 0)");
    }
}
