package A7;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Iterator;
import k2.C3145b;
import ka.AbstractC3256n;
import l2.C3379d;

/* renamed from: A7.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0292u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1068a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f1069b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1070c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1071d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1072e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1073f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1074g;

    public C0292u(C0273n0 c0273n0, String str, String str2, String str3, long j8, long j10, Bundle bundle) {
        C0298w c0298w;
        AbstractC1732v.f(str2);
        AbstractC1732v.f(str3);
        this.f1071d = str2;
        this.f1072e = str3;
        this.f1073f = TextUtils.isEmpty(str) ? null : str;
        this.f1069b = j8;
        this.f1070c = j10;
        if (j10 != 0 && j10 > j8) {
            N n10 = c0273n0.f981i;
            C0273n0.d(n10);
            n10.f608i.d("Event created with reverse previous/current timestamps. appId", N.h0(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c0298w = new C0298w(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    N n11 = c0273n0.f981i;
                    C0273n0.d(n11);
                    n11.f605f.c("Param name can't be null");
                    it.remove();
                } else {
                    U1 u12 = c0273n0.f983l;
                    C0273n0.c(u12);
                    Object objX0 = u12.X0(bundle2.get(next), next);
                    if (objX0 == null) {
                        N n12 = c0273n0.f981i;
                        C0273n0.d(n12);
                        n12.f608i.d("Param value can't be null", c0273n0.f984m.f(next));
                        it.remove();
                    } else {
                        U1 u13 = c0273n0.f983l;
                        C0273n0.c(u13);
                        u13.F0(next, objX0, bundle2);
                    }
                }
            }
            c0298w = new C0298w(bundle2);
        }
        this.f1074g = c0298w;
    }

    public C0292u a(long j8, Y1.m mVar) throws C3145b {
        long jV;
        long jV2;
        X1.g gVarC = ((Y1.m) this.f1072e).c();
        X1.g gVarC2 = mVar.c();
        if (gVarC == null) {
            return new C0292u(j8, mVar, (Y1.b) this.f1073f, (C3379d) this.f1071d, this.f1070c, gVarC);
        }
        if (!gVarC.D()) {
            return new C0292u(j8, mVar, (Y1.b) this.f1073f, (C3379d) this.f1071d, this.f1070c, gVarC2);
        }
        long jW = gVarC.w(j8);
        if (jW == 0) {
            return new C0292u(j8, mVar, (Y1.b) this.f1073f, (C3379d) this.f1071d, this.f1070c, gVarC2);
        }
        Q1.k.h(gVarC2);
        long jE = gVarC.E();
        long jB = gVarC.b(jE);
        long j10 = jW + jE;
        long j11 = j10 - 1;
        long jO = gVarC.o(j11, j8) + gVarC.b(j11);
        long jE2 = gVarC2.E();
        long jB2 = gVarC2.b(jE2);
        long j12 = this.f1070c;
        if (jO == jB2) {
            jV = j10 - jE2;
        } else {
            if (jO < jB2) {
                throw new C3145b();
            }
            if (jB2 < jB) {
                jV2 = j12 - (gVarC2.v(jB, j8) - jE);
                return new C0292u(j8, mVar, (Y1.b) this.f1073f, (C3379d) this.f1071d, jV2, gVarC2);
            }
            jV = gVarC.v(jB2, j8) - jE2;
        }
        jV2 = jV + j12;
        return new C0292u(j8, mVar, (Y1.b) this.f1073f, (C3379d) this.f1071d, jV2, gVarC2);
    }

    public long b(long j8) {
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return gVar.q(this.f1069b, j8) + this.f1070c;
    }

    public long c(long j8) {
        long jB = b(j8);
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return (gVar.F(this.f1069b, j8) + jB) - 1;
    }

    public long d() {
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return gVar.w(this.f1069b);
    }

    public long e(long j8) {
        long jF = f(j8);
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return gVar.o(j8 - this.f1070c, this.f1069b) + jF;
    }

    public long f(long j8) {
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return gVar.b(j8 - this.f1070c);
    }

    public boolean g(long j8, long j10) {
        X1.g gVar = (X1.g) this.f1074g;
        Q1.k.h(gVar);
        return gVar.D() || j10 == -9223372036854775807L || e(j8) <= j10;
    }

    public C0292u h(C0273n0 c0273n0, long j8) {
        return new C0292u(c0273n0, (String) this.f1073f, (String) this.f1071d, (String) this.f1072e, this.f1069b, j8, (C0298w) this.f1074g);
    }

    public String toString() {
        switch (this.f1068a) {
            case 0:
                String strValueOf = String.valueOf((C0298w) this.f1074g);
                StringBuilder sb2 = new StringBuilder("Event{appId='");
                sb2.append((String) this.f1071d);
                sb2.append("', name='");
                return AbstractC3256n.h(sb2, (String) this.f1072e, "', params=", strValueOf, "}");
            default:
                return super.toString();
        }
    }

    public C0292u(C0273n0 c0273n0, String str, String str2, String str3, long j8, long j10, C0298w c0298w) {
        AbstractC1732v.f(str2);
        AbstractC1732v.f(str3);
        AbstractC1732v.i(c0298w);
        this.f1071d = str2;
        this.f1072e = str3;
        this.f1073f = TextUtils.isEmpty(str) ? null : str;
        this.f1069b = j8;
        this.f1070c = j10;
        if (j10 != 0 && j10 > j8) {
            N n10 = c0273n0.f981i;
            C0273n0.d(n10);
            n10.f608i.b(N.h0(str2), "Event created with reverse previous/current timestamps. appId, name", N.h0(str3));
        }
        this.f1074g = c0298w;
    }

    public C0292u(long j8, Y1.m mVar, Y1.b bVar, C3379d c3379d, long j10, X1.g gVar) {
        this.f1069b = j8;
        this.f1072e = mVar;
        this.f1073f = bVar;
        this.f1070c = j10;
        this.f1071d = c3379d;
        this.f1074g = gVar;
    }
}
