package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class thp implements defpackage.thl {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.SIP");
    private final boolean b;
    private final defpackage.thn c;
    private volatile java.lang.Object d;
    private boolean e;

    public thp(boolean z, defpackage.thn thnVar) {
        this.b = z;
        this.c = thnVar;
    }

    @Override // defpackage.thl
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Object a() {
        java.lang.Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            java.lang.Object obj2 = this.d;
            if (obj2 != null) {
                return obj2;
            }
            if (this.e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).q(defpackage.yqi.FULL)).ai(9048)).u("Dependency cycle detected");
                throw new java.lang.IllegalStateException("Dependency cycle detected");
            }
            this.e = true;
            try {
                java.lang.Object objA = this.c.a();
                this.d = objA;
                this.e = false;
                return objA;
            } catch (java.lang.Throwable th) {
                this.e = false;
                throw th;
            }
        }
    }

    @Override // defpackage.thl
    public final boolean b() {
        return this.d != null;
    }

    @Override // defpackage.thl
    public final boolean c() {
        return this.b;
    }
}
