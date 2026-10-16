package defpackage;

/* loaded from: classes2.dex */
public final class gdq {
    public final Throwable a;
    public final String b;
    public final Runnable c;
    public final boolean d;
    public final int e;

    public gdq(gdp gdpVar) {
        this.e = gdpVar.e;
        this.a = gdpVar.a;
        this.b = gdpVar.b;
        this.c = gdpVar.c;
        this.d = gdpVar.d;
    }

    public final String toString() {
        String str;
        int i = this.e;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "FEATURE_NOT_SUPPORTED" : "MISSING_PERMISSION" : "INCOMPATIBLE_CLIENT_VERSION" : "ANR_WAITING" : "ANR_TIMEOUT";
        Throwable th = this.a;
        if (th != null) {
            str = th.getClass().getCanonicalName() + ": " + th.getMessage();
        } else {
            str = null;
        }
        return "[type: " + str2 + ", cause: " + str + ", debug msg: " + this.b + "]";
    }
}
