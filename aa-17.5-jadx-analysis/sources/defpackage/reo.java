package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class reo implements ren {
    private static final ypf a = ols.R("CAR.AUDIO.PolicyAltImpl");
    private Integer b;
    private Integer c;
    private final boolean d;
    private final rwz e;
    private rhj f;
    private final rhj g;

    public reo(boolean z, rfx rfxVar, erb erbVar, rwz rwzVar) {
        rhj rhjVarP = erbVar.P();
        this.g = rhjVarP;
        this.e = rwzVar;
        this.d = z;
        rhjVarP.h(rfxVar);
        rhjVarP.i(Looper.getMainLooper());
    }

    private final synchronized void f() {
        woy.O(this.f == null, "AudioPolicy has been initialized");
        rhj rhjVarK = this.g.k();
        this.f = rhjVarK;
        int iB = rhjVarK.b();
        if (iB != 0) {
            this.e.d(yzz.AUDIO_DIAGNOSTICS, yzy.ww);
            throw new IllegalStateException(a.bp(iB, "registerAudioPolicy failed "));
        }
    }

    @Override // defpackage.ren
    @ResultIgnorabilityUnspecified
    public final synchronized rfy a(int i) throws RemoteException {
        rge rgeVarD;
        woy.O(!this.d, "Separate audio records cannot be created in single channel mode.");
        this.b.getClass();
        this.c.getClass();
        d();
        rhj rhjVar = this.f;
        rhjVar.getClass();
        if (i == 3) {
            Integer num = this.b;
            num.getClass();
            rgeVarD = rhjVar.d(num.intValue());
        } else {
            if (i != 5) {
                throw new IllegalStateException(a.bp(i, "Unsupported stream type: "));
            }
            Integer num2 = this.c;
            num2.getClass();
            rgeVarD = rhjVar.d(num2.intValue());
        }
        return rgeVarD;
    }

    @Override // defpackage.ren
    @ResultIgnorabilityUnspecified
    public final synchronized rfy b(int i) throws RemoteException {
        rhj rhjVar;
        if (!spu.c()) {
            throw new IllegalStateException("Platform version must be at least Q");
        }
        d();
        rhjVar = this.f;
        rhjVar.getClass();
        return rhjVar.e(i, yfq.r(1, 12));
    }

    @Override // defpackage.ren
    public final synchronized void c(int i, int i2) {
        int iG;
        int iG2;
        if (!this.d) {
            woy.aa(this.f == null, "Cannot add mixes after policy has been registered");
            if (i != 3) {
                if (i != 5) {
                    ((ype) ((ype) ols.R("CAR.AUDIO").h()).ai((char) 7912)).y("Unsupported stream type: %s", new zjd(zjc.a, Integer.valueOf(i)));
                } else if (this.c == null && (iG2 = this.g.g(12, 16, i2)) != -1) {
                    this.c = Integer.valueOf(iG2);
                }
            } else if (this.b == null && (iG = this.g.g(1, 12, 48000)) != -1) {
                this.b = Integer.valueOf(iG);
            }
        }
    }

    @Override // defpackage.ren
    public final synchronized void d() {
        if (this.f == null) {
            f();
        }
    }

    @Override // defpackage.ren
    public final synchronized void e() {
        rhj rhjVar = this.f;
        if (rhjVar != null) {
            try {
                rhjVar.f();
            } catch (RemoteException e) {
                this.e.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yr);
                a.h().p(e).ai(7913).u("Exception unregistering remote audio policy.");
            }
        }
    }
}
