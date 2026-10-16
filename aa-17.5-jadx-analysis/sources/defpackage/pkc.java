package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class pkc implements tti {
    private final ttl c;
    private final ttl d;
    private final Object e;
    private too f;
    private boolean g;
    private final double h;
    private int i;
    private final psj j;
    private final usy k;
    private final aacq l;
    private final gms m;
    private static final yob b = yob.c("com/google/android/apps/gmm/mylocation/controller/MyLocationFollowingCameraAnimator");
    public static final long a = (long) ((-Math.log(0.01d)) * 500.0d);

    public pkc(std stdVar, usy usyVar, psj psjVar, aacq aacqVar, Optional optional) {
        ttn ttnVar = ttn.a;
        this.c = new ttl();
        this.d = new ttl();
        this.e = new Object();
        this.h = (-a) / Math.log(0.01d);
        stdVar.getClass();
        usyVar.getClass();
        this.k = usyVar;
        psjVar.getClass();
        this.j = psjVar;
        this.l = aacqVar;
        this.m = (gms) optional.orElse(null);
    }

    @Override // defpackage.tti
    @ResultIgnorabilityUnspecified
    public final int a(long j) {
        too tooVar = new too();
        aacq aacqVar = this.l;
        ((pkb) aacqVar.a).a((pkd) aacqVar.b);
        synchronized (this.e) {
            this.g = false;
            this.f = new too(tooVar);
        }
        synchronized (this.e) {
        }
        return 0;
    }

    @Override // defpackage.tti
    public final int b() {
        throw null;
    }

    @Override // defpackage.tti
    public final long c() {
        return -1L;
    }

    @Override // defpackage.tti
    public final boolean d() {
        return false;
    }

    @Override // defpackage.tti
    public final boolean e() {
        return false;
    }

    @Override // defpackage.tti
    public final Object f(int i) {
        return null;
    }

    @Override // defpackage.tti
    public final Object g(int i) {
        return null;
    }

    @Override // defpackage.tti
    public final void h(tti ttiVar, int i) {
        if (ttiVar == null || ttiVar == this || i != 1) {
            return;
        }
        synchronized (this.e) {
            if (this.i == 1) {
                this.j.c(pst.b);
            }
        }
    }

    @Override // defpackage.tti
    @ResultIgnorabilityUnspecified
    public final boolean j(tti ttiVar) {
        return true;
    }

    @Override // defpackage.tti
    public final void k(int i) {
        throw null;
    }

    @Override // defpackage.tti
    public final void i() {
    }
}
