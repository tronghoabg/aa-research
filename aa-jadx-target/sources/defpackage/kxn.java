package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kxn extends android.os.Handler {
    public final java.util.concurrent.ExecutorService a;
    public volatile android.os.ParcelFileDescriptor.AutoCloseOutputStream b;
    public final byte[] c;
    public final defpackage.rot d;
    private final defpackage.yqm e;
    private long f;
    private final defpackage.lam g;
    private final java.util.concurrent.Semaphore h;
    private final android.content.Context i;

    public kxn(android.content.Context context, defpackage.rot rotVar, android.os.Looper looper) {
        super(looper);
        this.e = defpackage.yqm.c("GH.CarMicRecorder");
        this.f = 0L;
        this.g = defpackage.lam.a();
        this.h = new java.util.concurrent.Semaphore(1);
        this.a = java.util.concurrent.Executors.newCachedThreadPool();
        this.c = new byte[512];
        this.i = context;
        this.d = rotVar;
    }

    private final void c() {
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
        defpackage.yqm yqmVar = this.e;
        if (autoCloseOutputStream == null) {
            ((defpackage.yqj) yqmVar.l().ai(3476)).u("No clean up needed. Output stream was already closed.");
            this.g.h(410, null);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3475)).L("Clean up recording to output stream: %s, total bytes sent: %d", this.b, this.f);
        defpackage.lam lamVar = this.g;
        lamVar.h(307, null);
        lamVar.b(this.f);
        this.f = 0L;
        try {
            try {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = this.b;
                autoCloseOutputStream2.getClass();
                autoCloseOutputStream2.close();
                lamVar.h(309, null);
                this.d.c();
                this.h.release();
                this.b = null;
                this.g.h(312, null);
            } catch (java.io.IOException e) {
                e(e, 308);
                this.h.release();
                this.b = null;
            } catch (java.lang.RuntimeException e2) {
                e(e2, 311);
                this.h.release();
                this.b = null;
            }
        } catch (java.lang.Throwable th) {
            this.h.release();
            this.b = null;
            throw th;
        }
    }

    private final void d(android.os.Message message) {
        if (super.sendMessage(message)) {
            return;
        }
        e(new java.lang.IllegalStateException(defpackage.a.cb(message, "Failed to send message to the looper: ")), 315);
    }

    private final void e(java.lang.Exception exc, int i) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.e.g()).p(exc)).ai((char) 3486)).y("%s", new defpackage.zkf(defpackage.zke.a, defpackage.ytn.s(i)));
        byte[] bArr = null;
        this.g.h(i, null);
        defpackage.yzn yznVarB = defpackage.yzn.b((int) defpackage.acxb.b());
        if (yznVarB == null || !kxm.a.contains(yznVarB)) {
            return;
        }
        defpackage.wfp.e(new defpackage.kos(java.lang.String.format(java.util.Locale.US, "MicrophoneRecorderImpl Crash (event=%s, gearheadChannel=%s)", defpackage.ytn.s(i), yznVarB.name()), exc, 7, bArr));
    }

    public final synchronized android.os.ParcelFileDescriptor a() throws java.io.IOException {
        defpackage.yqm yqmVar = this.e;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3487)).u("Start new recording.");
        if (!this.h.tryAcquire()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3488)).u("Another recording is currently active.");
            this.g.h(403, null);
            return null;
        }
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = android.os.ParcelFileDescriptor.createReliablePipe();
        d(obtainMessage(0, parcelFileDescriptorArrCreateReliablePipe[1]));
        return parcelFileDescriptorArrCreateReliablePipe[0];
    }

    public final synchronized void b() {
        ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 3489)).u("Stop recording.");
        d(obtainMessage(2));
        getLooper().getThread().interrupt();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) message.obj;
            if (this.b != null) {
                e(new java.lang.IllegalStateException("Previous output stream not closed"), 316);
                return;
            }
            this.f = 0L;
            this.b = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai(3477)).y("Start new recording to output stream: %s", this.b);
            defpackage.kxk.b(this.i);
            try {
                this.d.b();
                java.lang.Thread.interrupted();
                d(obtainMessage(1));
                this.g.h(404, null);
                return;
            } catch (java.lang.SecurityException e) {
                e(e, 408);
                c();
                return;
            } catch (defpackage.qst e2) {
                e(e2, 314);
                c();
                return;
            } catch (java.lang.Exception e3) {
                e(e3, 306);
                c();
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("Unreachable state");
            }
            c();
            return;
        }
        if (this.b == null) {
            ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 3479)).u("Invalid recording action: output stream was already closed.");
            this.g.h(317, null);
            return;
        }
        try {
            int iIntValue = ((java.lang.Integer) this.a.submit(new defpackage.fma(this, 5)).get()).intValue();
            if (iIntValue == -1) {
                ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 3482)).u("Recording finished: no more data available");
                this.g.h(303, null);
                c();
                return;
            }
            java.lang.String strBo = defpackage.a.bo(iIntValue, "Unexpected bytes read: ");
            if (iIntValue < 0) {
                e(new java.lang.IllegalStateException(strBo), 318);
            }
            if (iIntValue < 0) {
                c();
                return;
            }
            if (iIntValue > 0) {
                try {
                    android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
                    autoCloseOutputStream.getClass();
                    autoCloseOutputStream.write(this.c, 0, iIntValue);
                    this.f += (long) iIntValue;
                } catch (java.io.IOException unused) {
                    ((defpackage.yqj) ((defpackage.yqj) this.e.f()).ai((char) 3481)).u("Recording finished: failed to write to output stream");
                    this.g.h(305, null);
                    c();
                    return;
                }
            }
            d(obtainMessage(1));
        } catch (java.lang.InterruptedException unused2) {
            ((defpackage.yqj) ((defpackage.yqj) this.e.h()).ai((char) 3483)).u("Read interrupted");
            this.g.h(304, null);
            c();
        } catch (java.util.concurrent.ExecutionException e4) {
            boolean z = e4.getCause() instanceof defpackage.rlq;
            defpackage.yqm yqmVar = this.e;
            if (z) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3485)).u("Car disconnected during carAudioRecord.read");
                this.g.h(319, null);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 3484)).u("Read failed");
                e(e4, 306);
            }
            c();
        }
    }
}
