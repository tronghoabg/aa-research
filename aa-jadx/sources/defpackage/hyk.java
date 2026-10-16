package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyk {
    public java.lang.String a;
    private final boolean b;
    private int c;
    private int d;

    public hyk(boolean z) {
        this.b = z;
    }

    public final defpackage.hyn a() {
        if (android.text.TextUtils.isEmpty(this.a)) {
            throw new java.lang.IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(java.lang.String.valueOf(this.a)));
        }
        return new defpackage.hyn(new java.util.concurrent.ThreadPoolExecutor(this.c, this.d, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new defpackage.hym(this.a, this.b)));
    }

    public final void b(int i) {
        this.c = i;
        this.d = i;
    }
}
