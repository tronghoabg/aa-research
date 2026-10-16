package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aw implements com.google.android.gms.o.k {

    /* renamed from: a, reason: collision with root package name */
    private final ah f4765a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4766b;

    /* renamed from: c, reason: collision with root package name */
    private final i f4767c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4768d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4769e;

    aw(ah ahVar, int i2, i iVar, long j2, long j3) {
        this.f4765a = ahVar;
        this.f4766b = i2;
        this.f4767c = iVar;
        this.f4768d = j2;
        this.f4769e = j3;
    }

    static aw b(ah ahVar, int i2, i iVar) {
        boolean zE;
        if (!ahVar.z()) {
            return null;
        }
        com.google.android.gms.common.internal.bg bgVarB = com.google.android.gms.common.internal.bf.a().b();
        if (bgVarB == null) {
            zE = true;
        } else {
            if (!bgVarB.d()) {
                return null;
            }
            zE = bgVarB.e();
            ad adVarJ = ahVar.j(iVar);
            if (adVarJ != null) {
                if (!(adVarJ.f() instanceof com.google.android.gms.common.internal.m)) {
                    return null;
                }
                com.google.android.gms.common.internal.m mVar = (com.google.android.gms.common.internal.m) adVarJ.f();
                if (mVar.V() && !mVar.p()) {
                    com.google.android.gms.common.internal.u uVarC = c(adVarJ, mVar, i2);
                    if (uVarC == null) {
                        return null;
                    }
                    adVarJ.q();
                    zE = uVarC.d();
                }
            }
        }
        return new aw(ahVar, i2, iVar, zE ? System.currentTimeMillis() : 0L, zE ? SystemClock.elapsedRealtime() : 0L);
    }

    private static com.google.android.gms.common.internal.u c(ad adVar, com.google.android.gms.common.internal.m mVar, int i2) {
        int[] iArrE;
        int[] iArrF;
        com.google.android.gms.common.internal.u uVarC = mVar.C();
        if (uVarC == null || !uVarC.c() || ((iArrE = uVarC.e()) != null ? !a.a.Q(iArrE, i2) : !((iArrF = uVarC.f()) == null || !a.a.Q(iArrF, i2))) || adVar.d() >= uVarC.a()) {
            return null;
        }
        return uVarC;
    }

    @Override // com.google.android.gms.o.k
    public final void a(com.google.android.gms.o.t tVar) {
        ad adVarJ;
        long j2;
        int iC;
        int i2;
        int i3;
        int iA;
        int iA2;
        int i4;
        long j3;
        long j4;
        ah ahVar = this.f4765a;
        if (ahVar.z()) {
            com.google.android.gms.common.internal.bg bgVarB = com.google.android.gms.common.internal.bf.a().b();
            if ((bgVarB == null || bgVarB.d()) && (adVarJ = ahVar.j(this.f4767c)) != null && (adVarJ.f() instanceof com.google.android.gms.common.internal.m)) {
                com.google.android.gms.common.internal.m mVar = (com.google.android.gms.common.internal.m) adVarJ.f();
                long j5 = this.f4768d;
                boolean zE = j5 > 0;
                int iV = mVar.v();
                if (bgVarB != null) {
                    zE &= bgVarB.e();
                    int iA3 = bgVarB.a();
                    int iB = bgVarB.b();
                    iC = bgVarB.c();
                    if (!mVar.V() || mVar.p()) {
                        j2 = j5;
                        i3 = iA3;
                    } else {
                        com.google.android.gms.common.internal.u uVarC = c(adVarJ, mVar, this.f4766b);
                        if (uVarC == null) {
                            return;
                        }
                        boolean z = uVarC.d() && j5 > 0;
                        iB = uVarC.a();
                        zE = z;
                        i3 = iA3;
                        j2 = j5;
                    }
                    i2 = iB;
                } else {
                    j2 = j5;
                    iC = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                int iElapsedRealtime = -1;
                if (tVar.k()) {
                    i4 = 0;
                    iA2 = 0;
                } else if (tVar.i()) {
                    iA2 = -1;
                    i4 = 100;
                } else {
                    Exception excF = tVar.f();
                    if (excF instanceof com.google.android.gms.common.api.i) {
                        Status statusB = ((com.google.android.gms.common.api.i) excF).b();
                        iA = statusB.a();
                        com.google.android.gms.common.d dVarB = statusB.b();
                        if (dVarB != null) {
                            iA2 = dVarB.a();
                        }
                        i4 = iA;
                    } else {
                        iA = 101;
                    }
                    iA2 = -1;
                    i4 = iA;
                }
                if (zE) {
                    long j6 = this.f4769e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j6);
                    j3 = j2;
                    j4 = jCurrentTimeMillis;
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                ahVar.q(new com.google.android.gms.common.internal.az(this.f4766b, i4, iA2, j3, j4, null, null, iV, iElapsedRealtime), iC, i3, i2);
            }
        }
    }
}
