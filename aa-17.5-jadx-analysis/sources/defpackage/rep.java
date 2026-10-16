package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class rep implements ren {
    private static final ypf a = ols.R("CAR.AUDIO.PolicyImpl");
    private final Integer b;
    private final Integer c;
    private final rwz d;
    private rhj e;
    private final rhj f;

    public rep(boolean z, rfx rfxVar, erb erbVar, rwz rwzVar) {
        rhj rhjVarP = erbVar.P();
        this.f = rhjVarP;
        this.d = rwzVar;
        if (z) {
            this.b = null;
            this.c = null;
        } else {
            this.b = Integer.valueOf(rhjVarP.g(1, 12, 48000));
            this.c = Integer.valueOf(rhjVarP.g(12, 16, sk.AUDIO_CONTENT_SAMPLING_RATE));
        }
        rhjVarP.h(rfxVar);
        rhjVarP.i(Looper.getMainLooper());
    }

    @Override // defpackage.ren
    @ResultIgnorabilityUnspecified
    public final synchronized rfy a(int i) throws RemoteException {
        Integer num;
        d();
        Integer num2 = this.b;
        if (num2 == null || (num = this.c) == null) {
            throw new IllegalStateException("Mixes not initialized");
        }
        rhj rhjVar = this.e;
        return i == 3 ? rhjVar.d(num2.intValue()) : rhjVar.d(num.intValue());
    }

    @Override // defpackage.ren
    @ResultIgnorabilityUnspecified
    public final synchronized rfy b(int i) throws RemoteException {
        if (!spu.c()) {
            throw new IllegalStateException("Platform version must be at least Q");
        }
        d();
        return this.e.e(i, yfq.r(1, 12));
    }

    @Override // defpackage.ren
    public final synchronized void d() {
        if (this.e != null) {
            return;
        }
        rhj rhjVarK = this.f.k();
        int iB = rhjVarK.b();
        if (iB == 0) {
            this.e = rhjVarK;
            return;
        }
        rwz rwzVar = this.d;
        if (rwzVar != null) {
            rwzVar.d(yzz.AUDIO_DIAGNOSTICS, yzy.ww);
        }
        throw new RuntimeException(a.bp(iB, "registerAudioPolicy failed "));
    }

    @Override // defpackage.ren
    public final synchronized void e() {
        rhj rhjVar = this.e;
        if (rhjVar != null) {
            try {
                rhjVar.f();
            } catch (RemoteException e) {
                this.d.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yr);
                a.h().p(e).ai(7914).u("Exception unregistering remote audio policy.");
            }
        }
    }

    @Override // defpackage.ren
    public final void c(int i, int i2) {
    }
}
