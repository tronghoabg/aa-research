package com.google.android.libraries.phenotype.client.b;

import com.google.d.d.bq;
import com.google.d.d.co;
import com.google.d.d.cq;
import com.google.d.d.eq;
import com.google.d.d.fu;
import com.google.v.eu;
import com.google.v.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final h f5979a = new h(cq.z());

    /* renamed from: b, reason: collision with root package name */
    private final cq f5980b;

    h(cq cqVar) {
        this.f5980b = cqVar;
    }

    public static h b() {
        return f5979a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.libraries.phenotype.client.b.h c(com.google.android.libraries.phenotype.client.b.h r22, com.google.d.d.bs r23) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.b.h.c(com.google.android.libraries.phenotype.client.b.h, com.google.d.d.bs):com.google.android.libraries.phenotype.client.b.h");
    }

    public static h d(z zVar) throws eu {
        long j2;
        String strC;
        g gVar;
        int iK = zVar.k();
        if (iK < 0) {
            throw new eu("Negative number of flags");
        }
        co coVar = new co(eq.d());
        long j3 = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            long jW = zVar.w();
            int i3 = (int) jW;
            long j4 = jW >>> 3;
            if (j4 == 0) {
                j2 = 0;
                strC = zVar.C();
            } else {
                long j5 = j4 + j3;
                if (j5 > 2305843009213693951L) {
                    throw new eu("Flag name larger than max size");
                }
                j2 = j5;
                strC = null;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                gVar = new g(j2, strC, i4, 0L, null);
            } else if (i4 == 2) {
                gVar = new g(j2, strC, i4, zVar.w(), null);
            } else if (i4 == 3) {
                gVar = new g(j2, strC, i4, Double.doubleToRawLongBits(zVar.b()), null);
            } else if (i4 == 4) {
                gVar = new g(j2, strC, i4, 0L, zVar.C());
            } else {
                if (i4 != 5) {
                    throw new eu("Unrecognized flag type " + i4);
                }
                gVar = new g(j2, strC, i4, 0L, zVar.M());
            }
            long j6 = gVar.f5973a;
            if (j6 != 0) {
                j3 = j6;
            }
            coVar.k(gVar);
        }
        return new h(coVar.j());
    }

    public final int a() {
        return this.f5980b.size();
    }

    public final cq e() {
        return this.f5980b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5980b.equals(((h) obj).f5980b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(bq bqVar) {
        fu fuVarListIterator = this.f5980b.listIterator();
        while (fuVarListIterator.hasNext()) {
            g gVar = (g) fuVarListIterator.next();
            bqVar.d(gVar.b(), gVar.a());
        }
    }

    public final int hashCode() {
        return this.f5980b.hashCode();
    }
}
