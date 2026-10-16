package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnl extends defpackage.lni {
    public static final defpackage.yqm m = defpackage.yqm.c("GH.GhMediaPlayback");
    public defpackage.qsr n;
    public boolean o;
    private final defpackage.kfp p;

    public lnl(android.content.Context context, defpackage.lsx lsxVar) {
        super(context);
        this.o = false;
        this.p = new defpackage.lnk(this);
    }

    private final boolean s() {
        if (this.n == null || !defpackage.kit.b().r()) {
            ((defpackage.yqj) m.l().ai((char) 4050)).u("Cannot update state. Car not connected.");
            return false;
        }
        if (defpackage.lmp.a().e()) {
            return !this.o;
        }
        lkc lkcVar = this.c;
        if (((defpackage.lnb) lkcVar).h) {
            ((defpackage.yqj) m.l().ai((char) 4052)).u("Should not update state. Playback is remote.");
            return false;
        }
        if (!lkcVar.a().j) {
            return true;
        }
        ((defpackage.yqj) m.l().ai((char) 4051)).u("Should not update state. Playback is from the car.");
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lni, defpackage.lhn
    public final void d() throws wfo {
        if (!defpackage.lmp.a().e()) {
            defpackage.lnb lnbVar = (defpackage.lnb) this.c;
            lok lokVar = lnbVar.e;
            if (lokVar instanceof lok) {
                lok lokVar2 = lokVar;
                if (!lnbVar.h) {
                    lkj lkjVarH = lokVar2.i.h(defpackage.zbe.MEDIA_SESSION_LIFECYCLE);
                    com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackStateC = lnbVar.c();
                    long jR = aaPlaybackStateC != null ? aaPlaybackStateC.R() : 0L;
                    if ((2 & jR) != 0) {
                        if (aaPlaybackStateC.Q() != 2) {
                            lkjVarH.b();
                        }
                    } else if ((jR & 1) != 0) {
                        lkjVarH.i();
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lnb.a.h()).ai((char) 4015)).u("Both pause() and stop() are not supported");
                        lkjVarH.b();
                        lkjVarH.i();
                    }
                }
            }
        }
        super.d();
    }

    @Override // defpackage.lni
    protected final void n() {
        defpackage.kit.b().v(this.p);
        if (defpackage.lmp.a().e()) {
            ((defpackage.ltt) this.f).s.eM(defpackage.ler.c(), new defpackage.lnj(this, 0));
        }
    }

    @Override // defpackage.lni
    protected final void o() {
        defpackage.kit.b().w(this.p);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qxq] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qxt] */
    @Override // defpackage.lni
    protected final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, long j) throws wfo, rlo {
        defpackage.wfp.c();
        if (s()) {
            try {
                defpackage.qsr qsrVar = this.n;
                try {
                    qsrVar.a.f(qsrVar.e, str, str2, str3, bArr, null, (int) (j / 1000), 0);
                } catch (android.os.RemoteException e) {
                    defpackage.oml.I(e);
                } catch (java.lang.IllegalStateException e2) {
                    defpackage.oml.G(e2);
                }
            } catch (java.lang.IllegalArgumentException | defpackage.qst e3) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.h()).p(e3)).ai((char) 4053)).u("Error updating metadata status.");
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qxq] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qxt] */
    @Override // defpackage.lni
    protected final void q(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, java.lang.String str) throws wfo, rlo {
        int i;
        boolean z;
        defpackage.wfp.c();
        if (s()) {
            int iQ = aaPlaybackState.Q();
            if (iQ != 2) {
                i = iQ != 3 ? 1 : 2;
            } else {
                i = 3;
            }
            try {
                defpackage.qsr qsrVar = this.n;
                int iU = (int) (aaPlaybackState.U() / 1000);
                try {
                    aaPlaybackState.n();
                    z = aaPlaybackState.n().getBoolean("shuffle_mode");
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.h()).p(e)).ai((char) 4049)).u("Suppressing exception thrown when unparcelling");
                }
                try {
                    qsrVar.a.g(qsrVar.e, i, str, iU, z, false, false);
                } catch (android.os.RemoteException e2) {
                    defpackage.oml.I(e2);
                } catch (java.lang.IllegalStateException e3) {
                    defpackage.oml.G(e3);
                }
            } catch (java.lang.IllegalArgumentException | defpackage.qst e4) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.h()).p(e4)).ai((char) 4055)).u("Error updating playback status.");
                m();
            }
        }
    }
}
