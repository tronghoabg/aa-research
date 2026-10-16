package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfr extends defpackage.yrw {
    public static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(7);
    private final java.lang.String b;
    private final defpackage.yqu c;

    public tfr(java.lang.String str) {
        super(str);
        this.b = str.substring(0, java.lang.Math.min(str.length(), 23));
        this.c = defpackage.ysh.c.a(str);
    }

    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) {
        this.c.a(yqtVar);
    }

    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        return defpackage.sqs.aI(this.b, defpackage.ysr.f(level), a.get());
    }
}
