package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class tsv implements tth {
    private final tti[] a;
    private final int[] b;
    private final HashSet c;
    private final tsy d;
    private final tsu e;
    private final int[] f;

    public tsv(tsy tsyVar) {
        int i = ttn.b;
        this.a = new tti[i];
        this.b = new int[i];
        this.c = new HashSet();
        this.e = new tsu();
        this.f = tmo.v();
        tsyVar.getClass();
        this.d = tsyVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized int a(long j, ttl ttlVar) {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f;
            if (i2 < 8) {
                int i3 = iArr[i2];
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                tti[] ttiVarArr = this.a;
                tti ttiVar = ttiVarArr[i4];
                if (ttiVar == null) {
                    this.b[i4] = 0;
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            this.b[i4] = ttiVar.a(j);
                            break;
                        }
                        if (ttiVarArr[i5] == ttiVar) {
                            int[] iArr2 = this.b;
                            iArr2[i4] = iArr2[i5];
                            break;
                        }
                        i5++;
                    }
                    ttlVar.c(i3, ttiVar.f(i3));
                }
                i2++;
            } else {
                this.d.c(ttlVar);
                tsu tsuVar = this.e;
                long j2 = tsuVar.a;
                long j3 = j - j2;
                if (j2 >= 0) {
                    float f = j3;
                    Object obj = tsuVar.c;
                    ((ttm) obj).a(ttlVar);
                    Object obj2 = tsuVar.b;
                    ((ttm) obj).a -= ((ttm) obj2).a;
                    ((ttm) obj).b -= ((ttm) obj2).b;
                    float fB = uzg.b(((ttm) obj).c - ((ttm) obj2).c);
                    float f2 = ((ttm) obj).d - ((ttm) obj2).d;
                    float f3 = ((ttm) obj).e - ((ttm) obj2).e;
                    float f4 = ((ttm) obj).f - ((ttm) obj2).f;
                    float f5 = ((ttm) obj).g - ((ttm) obj2).g;
                    float f6 = 1.0f / (f / 1000.0f);
                    ((ttm) obj).a *= f6;
                    ((ttm) obj).b *= f6;
                    ((ttm) obj).c = fB * f6;
                    ((ttm) obj).d = f2 * f6;
                    ((ttm) obj).e = f3 * f6;
                    ((ttm) obj).f = f4 * f6;
                    ((ttm) obj).g = f5 * f6;
                }
                tsuVar.a = j;
                ((ttm) tsuVar.b).a(ttlVar);
                i = 0;
                for (int i6 = 0; i6 < 8; i6++) {
                    int i7 = iArr[i6];
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    tti ttiVar2 = this.a[i8];
                    if (ttiVar2 != null && this.b[i8] == 0) {
                        f(ttiVar2);
                    }
                    i |= this.b[i8];
                }
            }
        }
        return i;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized int b(tti ttiVar) {
        boolean zD = ttiVar.d();
        int iB = ttiVar.b();
        if (zD) {
            int[] iArr = this.f;
            for (int i = 0; i < 8; i++) {
                int i2 = iArr[i];
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                tti ttiVar2 = this.a[i3];
                if (((1 << i3) & iB) != 0 && ttiVar2 != null && !ttiVar2.j(ttiVar)) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if (iArr[i4] == i2) {
                            return 0;
                        }
                    }
                }
            }
        }
        int[] iArr2 = this.f;
        int i5 = 0;
        for (int i6 = 0; i6 < 8; i6++) {
            int i7 = iArr2[i6];
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            int i9 = 1 << i8;
            int i10 = iB & i9;
            tti[] ttiVarArr = this.a;
            if (i10 != 0) {
                tti ttiVar3 = ttiVarArr[i8];
                if (ttiVar3 == null || ttiVar.d() || ttiVar3.j(ttiVar)) {
                    i5 |= i9;
                    if (ttiVar3 != null) {
                        ttiVar3.h(ttiVar, i7);
                        if (ttiVar3.d() && ttiVar3 != ttiVar) {
                            this.c.add(ttiVar3);
                        }
                    }
                    ttiVarArr[i8] = ttiVar;
                }
            } else if (ttiVarArr[i8] == ttiVar) {
                i5 |= i9;
            }
        }
        HashSet hashSet = this.c;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f((tti) it.next());
        }
        hashSet.clear();
        if (i5 != 0) {
            ttiVar.k(i5);
        }
        return i5;
    }

    public final synchronized long c() {
        long jMax;
        jMax = -1;
        for (int i = 0; i < ttn.b; i++) {
            tti ttiVar = this.a[i];
            if (ttiVar != null) {
                jMax = Math.max(jMax, ttiVar.c());
            }
        }
        return jMax;
    }

    @Override // defpackage.tth
    public final synchronized boolean d() {
        for (int i = 0; i < 8; i++) {
            int i2 = this.f[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (this.a[i3] != null && this.b[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean e(ttl ttlVar) {
        boolean z;
        Object objG;
        z = false;
        for (int i = 0; i < 8; i++) {
            int[] iArr = this.f;
            tti[] ttiVarArr = this.a;
            int i2 = iArr[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            tti ttiVar = ttiVarArr[i3];
            if (ttiVar != null && (objG = ttiVar.g(i2)) != null) {
                ttlVar.c(i2, objG);
                z = true;
            }
        }
        return z;
    }

    @ResultIgnorabilityUnspecified
    final synchronized void f(tti ttiVar) {
        if (ttiVar != null) {
            int[] iArr = this.f;
            for (int i = 0; i < 8; i++) {
                int i2 = iArr[i];
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                tti[] ttiVarArr = this.a;
                tti ttiVar2 = ttiVarArr[i3];
                if (ttiVar2 == ttiVar) {
                    if (ttiVar2.j(null)) {
                        ttiVarArr[i3].h(null, i2);
                        ttiVarArr[i3] = null;
                    } else {
                        ttiVarArr[i3].i();
                    }
                }
            }
        }
    }

    public final synchronized void g() {
        tti ttiVar;
        for (int i = 0; i < ttn.b && ((ttiVar = this.a[i]) == null || !ttiVar.e()); i++) {
        }
    }
}
