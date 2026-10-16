package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rot {
    public final qwd a;
    public java.io.InputStream b;
    public volatile int c = 0;
    public final defpackage.qwf d;
    private final defpackage.ros e;

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public rot(defpackage.ros rosVar, qwd qwdVar) throws defpackage.qsu, defpackage.qst, rlo {
        defpackage.qwf qwfVar = new defpackage.qwf();
        this.d = qwfVar;
        this.e = rosVar;
        this.a = qwdVar;
        try {
            qwdVar.f(qwfVar);
        } catch (android.os.RemoteException e) {
            a(e);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.H(e2);
        }
    }

    private final void e(android.os.RemoteException remoteException) {
        java.io.InputStream inputStream;
        if (defpackage.rrx.e("CAR.AUDIO.RECORD", 4)) {
            defpackage.rrx.d(4, "CAR.AUDIO.RECORD", remoteException, "CarAudioRecord RemoteException from car service: %s", remoteException.getMessage());
        }
        if (this.c == 1 && (inputStream = this.b) != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        if (this.c != 2) {
            defpackage.ros rosVar = this.e;
            synchronized (rosVar.b) {
                rosVar.c.remove(this);
            }
            this.c = 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void a(android.os.RemoteException remoteException) throws rlo {
        e(remoteException);
        defpackage.oml.I(remoteException);
    }

    public final synchronized void b() throws java.lang.IllegalStateException, defpackage.qst {
        if (this.c == 1) {
            throw new java.lang.IllegalStateException("already started");
        }
        if (this.c == 2) {
            throw new java.lang.IllegalStateException("already released");
        }
        try {
            qwd qwdVar = this.a;
            defpackage.qwf qwfVar = this.d;
            this.b = new android.os.ParcelFileDescriptor.AutoCloseInputStream(qwdVar.a(qwfVar));
            qwdVar.h(qwfVar);
        } catch (android.os.RemoteException e) {
            a(e);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.G(e2);
        }
        this.c = 1;
        if (defpackage.omv.c("CAR.AUDIO.RECORD", 3)) {
            defpackage.rrx.a("CAR.AUDIO.RECORD", null, "CarAudioRecord startRecording ok");
        }
    }

    public final synchronized void c() {
        if (this.c == 1) {
            this.c = 0;
            try {
                this.a.i(this.d);
                this.b.close();
            } catch (android.os.RemoteException e) {
                e(e);
            } catch (java.io.IOException unused) {
            }
            if (defpackage.omv.c("CAR.AUDIO.RECORD", 3)) {
                defpackage.rrx.a("CAR.AUDIO.RECORD", null, "CarAudioRecord stopped");
            }
        } else if (defpackage.omv.c("CAR.AUDIO.RECORD", 3)) {
            defpackage.rrx.a("CAR.AUDIO.RECORD", null, "CarAudioRecord stop while not started");
        }
    }

    public final synchronized void d() {
        if (this.c != 2) {
            c();
            try {
                this.a.g(this.d);
            } catch (android.os.RemoteException unused) {
            }
            this.c = 2;
            if (defpackage.omv.c("CAR.AUDIO.RECORD", 3)) {
                defpackage.rrx.a("CAR.AUDIO.RECORD", null, "CarAudioRecord released");
            }
        }
    }
}
