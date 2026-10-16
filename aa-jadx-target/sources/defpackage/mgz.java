package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mgz implements defpackage.mgu {
    private final defpackage.mhb a;
    private final java.util.EnumSet b;

    public mgz(defpackage.mhb mhbVar, java.util.EnumSet enumSet) {
        this.a = mhbVar;
        java.util.EnumSet enumSetOf = java.util.EnumSet.of(defpackage.mgt.b, defpackage.mgt.d, defpackage.mgt.a);
        this.b = enumSetOf;
        enumSetOf.addAll(enumSet);
    }

    @Override // defpackage.mgu
    public final void a(defpackage.mgt mgtVar) {
        if (this.b.contains(mgtVar)) {
            ((defpackage.yqj) defpackage.mhc.a.l().ai((char) 4905)).y("FinishListener Received event: %s, finishing", mgtVar);
            this.a.finish();
        }
    }
}
