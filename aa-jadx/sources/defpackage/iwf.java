package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iwf implements defpackage.jju {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iwf(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jju
    public final java.lang.String a() {
        java.lang.String str;
        java.lang.String str2;
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            synchronized (((defpackage.iwe) obj).a) {
                str2 = java.lang.String.format("PowerBasedLimiter{lowPower=%b, interactive=%b}", java.lang.Boolean.valueOf(((defpackage.iwe) obj).b), java.lang.Boolean.valueOf(((defpackage.iwe) obj).c));
            }
            return str2;
        }
        synchronized (((defpackage.iwg) obj).c) {
            str = java.lang.String.format("RestrictionLevelLimiter{level=%s}", ((defpackage.iwg) obj).d.name());
        }
        return str;
    }
}
