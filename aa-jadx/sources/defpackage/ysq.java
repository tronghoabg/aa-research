package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysq extends defpackage.ysm {
    public static final defpackage.ysq a = new defpackage.ysq();

    @Override // defpackage.ysm
    public final long a() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    public final java.lang.String toString() {
        return "Default millisecond precision clock";
    }
}
