package m2;

import Q1.k;
import java.util.ArrayList;
import kd.C3293D;
import l8.AbstractC3409K;
import l8.C3400B;
import l8.C3406H;
import l8.C3407I;
import l8.C3436r;
import l8.c0;
import l8.e0;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3480b implements InterfaceC3479a {

    /* renamed from: b, reason: collision with root package name */
    public static final C3400B f40306b = new C3400B(new C3436r(new C3293D(28), c0.f40090b), new C3436r(new C3293D(29), c0.f40091c));

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40307a = new ArrayList();

    @Override // m2.InterfaceC3479a
    public final boolean a(P2.a aVar, long j8) {
        long j10 = aVar.f9056b;
        k.c(j10 != -9223372036854775807L);
        k.c(aVar.f9057c != -9223372036854775807L);
        boolean z2 = j10 <= j8 && j8 < aVar.f9058d;
        ArrayList arrayList = this.f40307a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((P2.a) arrayList.get(size)).f9056b) {
                arrayList.add(size + 1, aVar);
                return z2;
            }
        }
        arrayList.add(0, aVar);
        return z2;
    }

    @Override // m2.InterfaceC3479a
    public final AbstractC3409K b(long j8) {
        ArrayList arrayList = this.f40307a;
        if (!arrayList.isEmpty()) {
            if (j8 >= ((P2.a) arrayList.get(0)).f9056b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    P2.a aVar = (P2.a) arrayList.get(i5);
                    if (j8 >= aVar.f9056b && j8 < aVar.f9058d) {
                        arrayList2.add(aVar);
                    }
                    if (j8 < aVar.f9056b) {
                        break;
                    }
                }
                e0 e0VarP = AbstractC3409K.p(f40306b, arrayList2);
                C3406H c3406hI = AbstractC3409K.i();
                for (int i10 = 0; i10 < e0VarP.f40103d; i10++) {
                    c3406hI.d(((P2.a) e0VarP.get(i10)).f9055a);
                }
                return c3406hI.g();
            }
        }
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // m2.InterfaceC3479a
    public final long c(long j8) {
        ArrayList arrayList = this.f40307a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j8 < ((P2.a) arrayList.get(0)).f9056b) {
            return -9223372036854775807L;
        }
        long jMax = ((P2.a) arrayList.get(0)).f9056b;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            long j10 = ((P2.a) arrayList.get(i5)).f9056b;
            long j11 = ((P2.a) arrayList.get(i5)).f9058d;
            if (j11 > j8) {
                if (j10 > j8) {
                    break;
                }
                jMax = Math.max(jMax, j10);
            } else {
                jMax = Math.max(jMax, j11);
            }
        }
        return jMax;
    }

    @Override // m2.InterfaceC3479a
    public final void clear() {
        this.f40307a.clear();
    }

    @Override // m2.InterfaceC3479a
    public final long d(long j8) {
        int i5 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f40307a;
            if (i5 >= arrayList.size()) {
                break;
            }
            long j10 = ((P2.a) arrayList.get(i5)).f9056b;
            long j11 = ((P2.a) arrayList.get(i5)).f9058d;
            if (j8 < j10) {
                jMin = jMin == -9223372036854775807L ? j10 : Math.min(jMin, j10);
            } else {
                if (j8 < j11) {
                    jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
                }
                i5++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // m2.InterfaceC3479a
    public final void e(long j8) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f40307a;
            if (i5 >= arrayList.size()) {
                return;
            }
            long j10 = ((P2.a) arrayList.get(i5)).f9056b;
            if (j8 > j10 && j8 > ((P2.a) arrayList.get(i5)).f9058d) {
                arrayList.remove(i5);
                i5--;
            } else if (j8 < j10) {
                return;
            }
            i5++;
        }
    }
}
