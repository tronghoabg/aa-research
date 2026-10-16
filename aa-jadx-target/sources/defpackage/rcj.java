package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rcj extends defpackage.rci {
    public final android.os.Handler b;
    public final defpackage.rcl c;
    private boolean d;
    private boolean e;

    public rcj(android.os.Handler handler, defpackage.rcl rclVar) {
        this.b = handler;
        this.c = rclVar;
    }

    @Override // defpackage.rci
    protected final synchronized void a() {
        if (this.d && defpackage.omv.c("CAR.TIME", 4)) {
            defpackage.rrx.d(4, "CAR.TIME", null, "Canceling posted timeout for handler: %s runnable: %s", this.b, this.c);
        }
        this.e = true;
        this.b.removeCallbacks(this.c);
    }

    @Override // defpackage.rci
    protected final synchronized void b() {
        if (!this.e) {
            this.b.post(this.c);
            this.d = true;
        } else if (defpackage.omv.c("CAR.TIME", 4)) {
            defpackage.rrx.d(4, "CAR.TIME", null, "Timeout for handler: %s runnable: %s was already canceled, ignoring run", this.b, this.c);
        }
    }

    @Override // defpackage.rci
    protected final boolean c() {
        return true;
    }
}
