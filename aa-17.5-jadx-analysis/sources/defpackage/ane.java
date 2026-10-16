package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ane extends cfx implements cwc, cxs {
    public api a;
    public final aqk b;
    public boolean c;
    public amy d;
    public final afdr e;
    public boolean f;
    public boolean h;
    public final kwp i = new kwp((byte[]) null, (byte[]) null, (char[]) null);
    public long g = -1;

    public ane(api apiVar, aqk aqkVar, boolean z, amy amyVar, afdr afdrVar) {
        this.a = apiVar;
        this.b = aqkVar;
        this.c = z;
        this.d = amyVar;
        this.e = afdrVar;
    }

    public static /* synthetic */ boolean i(ane aneVar, cjb cjbVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = aneVar.d();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jF = aneVar.f(cjbVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jF >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF & 4294967295L))) <= 0.5f;
    }

    private final amy j() {
        amy amyVar = this.d;
        return amyVar == null ? (amy) bzi.x(this, ana.b) : amyVar;
    }

    public final float b(amy amyVar, long j) {
        char c;
        long j2;
        Object obj;
        int iCompare;
        long j3 = this.g;
        byw bywVar = (byw) this.i.a;
        int i = bywVar.b - 1;
        Object[] objArr = bywVar.a;
        char c2 = ' ';
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    c = c2;
                    j2 = 4294967295L;
                    break;
                }
                Object objInvoke = ((anb) objArr[i]).a.invoke();
                if (objInvoke != null) {
                    long jB = ((cjb) objInvoke).b();
                    long jK = dln.k(d());
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jK & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new aezs();
                        }
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> c2)), Float.intBitsToFloat((int) (jK >> c)));
                    }
                    if (iCompare <= 0) {
                        obj = objInvoke;
                    } else if (obj == null) {
                        obj = objInvoke;
                    }
                } else {
                    c = c2;
                }
                i--;
                c2 = c;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            obj = null;
        }
        if (obj == null) {
            Object objInvoke2 = this.f ? this.e.invoke() : null;
            if (objInvoke2 == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            obj = objInvoke2;
        }
        long jK2 = dln.k(j3);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            cjb cjbVar = (cjb) obj;
            float f = cjbVar.c;
            return amyVar.a(f - ((int) (j & j2)), cjbVar.e - f, Float.intBitsToFloat((int) (jK2 & j2)));
        }
        if (iOrdinal2 != 1) {
            throw new aezs();
        }
        cjb cjbVar2 = (cjb) obj;
        float f2 = cjbVar2.b;
        return amyVar.a(f2 - ((int) (j >> c)), cjbVar2.d - f2, Float.intBitsToFloat((int) (jK2 >> c)));
    }

    public final long d() {
        long j = this.g;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.cxs
    public final void et(long j) {
        long j2;
        long j3;
        long jD = d();
        this.g = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = jD & 4294967295L;
            j3 = j & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            j2 = jD >> 32;
            j3 = j >> 32;
        }
        if (affa.b((int) j3, (int) j2) >= 0) {
            return;
        }
        long j4 = !this.c ? this.a == api.a ? (((int) (jD & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (jD >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        Object objInvoke = this.e.invoke();
        if (objInvoke == null || this.h || this.f) {
            return;
        }
        cjb cjbVar = (cjb) objInvoke;
        if (!i(this, cjbVar, jD, 0L, 2) || i(this, cjbVar, 0L, j4, 1)) {
            return;
        }
        this.f = true;
        h(j4);
    }

    public final long f(cjb cjbVar, long j, long j2) {
        long jK = dln.k(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            amy amyVarJ = j();
            float f = cjbVar.b;
            return (Float.floatToRawIntBits(amyVarJ.a(f - ((int) (j2 >> 32)), cjbVar.d - f, Float.intBitsToFloat((int) (jK >> 32)))) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L);
        }
        amy amyVarJ2 = j();
        float f2 = cjbVar.c;
        float fA = amyVarJ2.a(f2 - ((int) (j2 & 4294967295L)), cjbVar.e - f2, Float.intBitsToFloat((int) (jK & 4294967295L)));
        return (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
    }

    public final void h(long j) {
        amy amyVarJ = j();
        if (this.h) {
            asl.d("launchAnimation called when previous animation was running");
        }
        ahnc.d(N(), null, 4, new and(this, new arf(j().b()), amyVarJ, j, null), 1);
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
