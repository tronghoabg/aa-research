package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class itd {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.Policy");
    private java.lang.Integer b;
    private java.lang.Integer c;
    private final defpackage.itl d;
    private volatile defpackage.itm e;
    private boolean f;
    private final java.lang.Object g = new java.lang.Object();
    private final boolean h;
    private final defpackage.jfo i;

    public itd(boolean z, defpackage.itk itkVar, defpackage.its itsVar, defpackage.jfo jfoVar) {
        defpackage.itl itlVarA = itsVar.a();
        this.d = itlVarA;
        this.i = jfoVar;
        this.h = z;
        itlVarA.e(itkVar);
        itlVarA.f(android.os.Looper.getMainLooper());
    }

    private final synchronized void f() throws defpackage.itb, defpackage.itc, android.os.RemoteException {
        defpackage.ysr.aY(this.e == null, "AudioPolicy has been initialized");
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1328)).u("Registering audio policy");
        synchronized (this.g) {
            if (this.f) {
                throw new defpackage.itb();
            }
        }
        defpackage.itm itmVarB = this.d.b();
        int iA = itmVarB.a();
        if (iA != 0) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1329)).w("Audio policy initialization failed with %d.", iA);
            itmVarB.d();
            this.i.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wB);
            throw new defpackage.itc(defpackage.a.bo(iA, "registerAudioPolicy failed with "));
        }
        synchronized (this.g) {
            if (this.f) {
                itmVarB.d();
                throw new defpackage.itb();
            }
            this.e = itmVarB;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized defpackage.itn a(int i) throws defpackage.itb, defpackage.itc, android.os.RemoteException {
        defpackage.itn itnVarB;
        defpackage.ysr.aY(!this.h, "Separate audio records cannot be created in single channel mode.");
        d();
        this.e.getClass();
        if (i == 3) {
            this.b.getClass();
            itnVarB = this.e.b(this.b.intValue());
        } else {
            if (i != 5) {
                throw new java.lang.IllegalStateException(defpackage.a.bo(i, "Unsupported stream type: "));
            }
            this.c.getClass();
            itnVarB = this.e.b(this.c.intValue());
        }
        return itnVarB;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized defpackage.itn b(int i) throws defpackage.itb, defpackage.itc, android.os.RemoteException {
        defpackage.ygr ygrVar;
        defpackage.ysr.bk(defpackage.sqs.e(), "Platform version must be at least Q");
        d();
        this.e.getClass();
        int i2 = defpackage.ygw.d;
        ygrVar = new defpackage.ygr(4);
        ygrVar.i(1);
        ygrVar.i(12);
        if (defpackage.a.N()) {
            ygrVar.k(defpackage.acof.b().b);
        }
        if (defpackage.a.N()) {
            ygrVar.i(16);
        }
        return this.e.c(i, ygrVar.g());
    }

    public final synchronized void c(int i, int i2) {
        if (!this.h) {
            defpackage.ysr.bk(this.e == null, "Cannot add mixes after policy has been registered");
            if (i != 3) {
                if (i != 5) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1327)).w("Unsupported stream type: %s", i);
                } else if (this.c == null) {
                    boolean zN = defpackage.a.N();
                    defpackage.itl itlVar = this.d;
                    int iD = zN ? itlVar.d(defpackage.ygw.r(16, 12), i2) : itlVar.a(12, 16, i2);
                    if (iD != -1) {
                        this.c = java.lang.Integer.valueOf(iD);
                    }
                }
            } else if (this.b == null) {
                int i3 = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                ygrVar.i(1);
                if (defpackage.a.N()) {
                    ygrVar.k(defpackage.acof.a.fF().a().b);
                }
                int iC = this.d.c(ygrVar.g());
                if (iC != -1) {
                    this.b = java.lang.Integer.valueOf(iC);
                }
            }
        }
    }

    public final synchronized void d() throws defpackage.itb, defpackage.itc, android.os.RemoteException {
        if (this.e == null) {
            f();
        }
    }

    public final void e() {
        synchronized (this.g) {
            this.f = true;
        }
        if (this.e != null) {
            try {
                this.e.d();
            } catch (android.os.RemoteException e) {
                this.i.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yv);
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 1330)).u("Exception unregistering remote audio policy.");
            }
        }
    }
}
