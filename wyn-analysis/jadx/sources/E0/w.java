package e0;

import d0.AbstractC2382a;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class w extends z {

    /* renamed from: e, reason: collision with root package name */
    public final d0.e f34391e;

    /* renamed from: f, reason: collision with root package name */
    public final C2454f f34392f;

    public w(d0.e eVar) {
        C2454f c2454f;
        this.f34391e = eVar;
        long j8 = eVar.f33948h;
        float fB = AbstractC2382a.b(j8);
        long j10 = eVar.f33947g;
        float fB2 = AbstractC2382a.b(j10);
        boolean z2 = false;
        long j11 = eVar.f33945e;
        long j12 = eVar.f33946f;
        boolean z10 = fB == fB2 && AbstractC2382a.b(j10) == AbstractC2382a.b(j12) && AbstractC2382a.b(j12) == AbstractC2382a.b(j11);
        if (AbstractC2382a.c(j8) == AbstractC2382a.c(j10) && AbstractC2382a.c(j10) == AbstractC2382a.c(j12) && AbstractC2382a.c(j12) == AbstractC2382a.c(j11)) {
            z2 = true;
        }
        if (z10 && z2) {
            c2454f = null;
        } else {
            C2454f c2454fE = z.e();
            c2454fE.a(eVar);
            c2454f = c2454fE;
        }
        this.f34392f = c2454f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return AbstractC3340k.a(this.f34391e, ((w) obj).f34391e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34391e.hashCode();
    }
}
