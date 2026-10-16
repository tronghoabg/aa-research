package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final class lne extends lnb {
    public static final yph m = yph.c("GH.GhMediaPlayback");
    public qrx n;
    public boolean o;
    private final kfn p;

    public lne(Context context, lsq lsqVar) {
        super(context);
        this.o = false;
        this.p = new lnd(this);
    }

    private final boolean s() {
        if (this.n == null || !kio.b().r()) {
            ((ype) m.l().ai((char) 4047)).u("Cannot update state. Car not connected.");
            return false;
        }
        if (lmi.a().e()) {
            return !this.o;
        }
        ljv ljvVar = this.c;
        if (((lmu) ljvVar).h) {
            ((ype) m.l().ai((char) 4049)).u("Should not update state. Playback is remote.");
            return false;
        }
        if (!ljvVar.a().j) {
            return true;
        }
        ((ype) m.l().ai((char) 4048)).u("Should not update state. Playback is from the car.");
        return false;
    }

    @Override // defpackage.lnb, defpackage.lhg
    public final void d() {
        if (!lmi.a().e()) {
            lmu lmuVar = (lmu) this.c;
            lol lolVar = lmuVar.e;
            if (lolVar instanceof lod) {
                lod lodVar = (lod) lolVar;
                if (!lmuVar.h) {
                    lkc lkcVarD = lodVar.i.d(yzz.MEDIA_SESSION_LIFECYCLE);
                    AaPlaybackState aaPlaybackStateC = lmuVar.c();
                    long jR = aaPlaybackStateC != null ? aaPlaybackStateC.R() : 0L;
                    if ((2 & jR) != 0) {
                        if (aaPlaybackStateC.Q() != 2) {
                            lkcVarD.b();
                        }
                    } else if ((jR & 1) != 0) {
                        lkcVarD.i();
                    } else {
                        ((ype) ((ype) lmu.a.h()).ai((char) 4012)).u("Both pause() and stop() are not supported");
                        lkcVarD.b();
                        lkcVarD.i();
                    }
                }
            }
        }
        super.d();
    }

    @Override // defpackage.lnb
    protected final void n() {
        kio.b().v(this.p);
        if (lmi.a().e()) {
            ((ltn) this.f).s.fE(lbh.d(), new lnc(this, 0));
        }
    }

    @Override // defpackage.lnb
    protected final void o() {
        kio.b().w(this.p);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qwu] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qwx] */
    @Override // defpackage.lnb
    protected final void p(String str, String str2, String str3, byte[] bArr, long j) {
        wer.c();
        if (s()) {
            try {
                qrx qrxVar = this.n;
                try {
                    qrxVar.a.f(qrxVar.e, str, str2, str3, bArr, null, (int) (j / 1000), 0);
                } catch (RemoteException e) {
                    olm.h(e);
                } catch (IllegalStateException e2) {
                    olm.f(e2);
                }
            } catch (IllegalArgumentException | qrz e3) {
                ((ype) ((ype) ((ype) m.h()).p(e3)).ai((char) 4050)).u("Error updating metadata status.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qwu] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qwx] */
    @Override // defpackage.lnb
    protected final void q(AaPlaybackState aaPlaybackState, String str) {
        wer.c();
        if (s()) {
            int iQ = aaPlaybackState.Q();
            int i = iQ != 2 ? iQ != 3 ? 1 : 2 : 3;
            try {
                qrx qrxVar = this.n;
                int iU = (int) (aaPlaybackState.U() / 1000);
                try {
                    aaPlaybackState.n();
                } catch (RuntimeException e) {
                    ((ype) ((ype) ((ype) m.h()).p(e)).ai((char) 4046)).u("Suppressing exception thrown when unparcelling");
                }
                boolean z = aaPlaybackState.n().getBoolean("shuffle_mode");
                try {
                    qrxVar.a.g(qrxVar.e, i, str, iU, z, false, false);
                } catch (RemoteException e2) {
                    olm.h(e2);
                } catch (IllegalStateException e3) {
                    olm.f(e3);
                }
            } catch (IllegalArgumentException | qrz e4) {
                ((ype) ((ype) ((ype) m.h()).p(e4)).ai((char) 4052)).u("Error updating playback status.");
                m();
            }
        }
    }
}
