package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class isv {
    private static final yph a = yph.c("CAR.AUDIO.Policy");
    private Integer b;
    private Integer c;
    private final itd d;
    private volatile ite e;
    private boolean f;
    private final Object g = new Object();
    private final boolean h;
    private final jfg i;

    public isv(boolean z, itc itcVar, itk itkVar, jfg jfgVar) {
        itd itdVarA = itkVar.a();
        this.d = itdVarA;
        this.i = jfgVar;
        this.h = z;
        itdVarA.e(itcVar);
        itdVarA.f(Looper.getMainLooper());
    }

    private final synchronized void f() throws RemoteException, isu, ist {
        woy.O(this.e == null, "AudioPolicy has been initialized");
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 1328)).u("Registering audio policy");
        synchronized (this.g) {
            if (this.f) {
                throw new ist();
            }
        }
        ite iteVarB = this.d.b();
        int iA = iteVarB.a();
        if (iA != 0) {
            ((ype) ((ype) yphVar.h()).ai((char) 1329)).w("Audio policy initialization failed with %d.", iA);
            iteVarB.d();
            this.i.e(yzz.AUDIO_DIAGNOSTICS, yzy.wx);
            throw new isu(a.bp(iA, "registerAudioPolicy failed with "));
        }
        synchronized (this.g) {
            if (this.f) {
                iteVarB.d();
                throw new ist();
            }
            this.e = iteVarB;
        }
    }

    @ResultIgnorabilityUnspecified
    public final synchronized itf a(int i) throws RemoteException, isu, ist {
        itf itfVarB;
        woy.O(!this.h, "Separate audio records cannot be created in single channel mode.");
        d();
        this.e.getClass();
        if (i == 3) {
            this.b.getClass();
            itfVarB = this.e.b(this.b.intValue());
        } else {
            if (i != 5) {
                throw new IllegalStateException(a.bp(i, "Unsupported stream type: "));
            }
            this.c.getClass();
            itfVarB = this.e.b(this.c.intValue());
        }
        return itfVarB;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized itf b(int i) throws RemoteException, isu, ist {
        yfl yflVar;
        woy.aa(spu.c(), "Platform version must be at least Q");
        d();
        this.e.getClass();
        int i2 = yfq.d;
        yflVar = new yfl(4);
        yflVar.i(1);
        yflVar.i(12);
        if (a.O()) {
            yflVar.k(acnd.b().b);
        }
        if (a.O()) {
            yflVar.i(16);
        }
        return this.e.c(i, yflVar.g());
    }

    public final synchronized void c(int i, int i2) {
        if (!this.h) {
            woy.aa(this.e == null, "Cannot add mixes after policy has been registered");
            if (i != 3) {
                if (i != 5) {
                    ((ype) ((ype) a.h()).ai((char) 1327)).w("Unsupported stream type: %s", i);
                } else if (this.c == null) {
                    boolean zO = a.O();
                    itd itdVar = this.d;
                    int iD = zO ? itdVar.d(yfq.r(16, 12), i2) : itdVar.a(12, 16, i2);
                    if (iD != -1) {
                        this.c = Integer.valueOf(iD);
                    }
                }
            } else if (this.b == null) {
                int i3 = yfq.d;
                yfl yflVar = new yfl(4);
                yflVar.i(1);
                if (a.O()) {
                    yflVar.k(acnd.a.gu().a().b);
                }
                int iC = this.d.c(yflVar.g());
                if (iC != -1) {
                    this.b = Integer.valueOf(iC);
                }
            }
        }
    }

    public final synchronized void d() throws isu, RemoteException, ist {
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
            } catch (RemoteException e) {
                this.i.e(yzz.AUDIO_SERVICE_MIGRATION, yzy.yr);
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 1330)).u("Exception unregistering remote audio policy.");
            }
        }
    }
}
