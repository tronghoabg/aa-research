package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class byx {
    public static final long A(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final cjc B(cjb cjbVar, long j, long j2, long j3, long j4) {
        return new cjc(cjbVar.b, cjbVar.c, cjbVar.d, cjbVar.e, j, j2, j3, j4);
    }

    public static final cjc C(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new cjc(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean D(cjc cjcVar) {
        long j = cjcVar.e;
        return (j >>> 32) == (4294967295L & j) && j == cjcVar.f && j == cjcVar.g && j == cjcVar.h;
    }

    public static final cjb E(long j, long j2) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        return new cjb(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final cjb F(ciz cizVar) {
        return new cjb(cizVar.a, cizVar.b, cizVar.c, cizVar.d);
    }

    public static final String G(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < BitmapDescriptorFactory.HUE_RED ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    private static final void H(int i, int i2) {
        throw new IndexOutOfBoundsException(a.bB(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void I(int i) {
        throw new IndexOutOfBoundsException(a.bn(i, "fromIndex (", ") is less than 0."));
    }

    private static final void J(int i, int i2) {
        throw new IndexOutOfBoundsException(a.bB(i2, i, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void K(int i, int i2) {
        throw new IllegalArgumentException(a.bB(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            H(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            K(i, i2);
        }
        if (i < 0) {
            I(i);
        }
        if (i2 > list.size()) {
            J(i2, list.size());
        }
    }

    public static final bym c(Object obj, bux buxVar) {
        Object objG = buxVar.g();
        if (objG == buw.a) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        bwqVar.b(obj);
        return bwqVar;
    }

    public static final aiyk d(afdr afdrVar) {
        return new aiyb(new byl(afdrVar, null));
    }

    public static final bym e(aiyk aiykVar, Object obj, afco afcoVar, byi byiVar, bux buxVar, int i) {
        if ((i & 2) != 0) {
            afcoVar = afcp.a;
        }
        if ((i & 4) != 0) {
            byiVar = bxp.c;
        }
        boolean zE = buxVar.E(afcoVar) | buxVar.E(aiykVar);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new aqs(afcoVar, aiykVar, (afck) null, 2);
            buxVar.x(objG);
        }
        afeg afegVar = (afeg) objG;
        Object objG2 = buxVar.g();
        Object obj2 = buw.a;
        if (objG2 == obj2) {
            objG2 = new ParcelableSnapshotMutableState(obj, byiVar);
            buxVar.x(objG2);
        }
        bwq bwqVar = (bwq) objG2;
        boolean zE2 = buxVar.E(afegVar);
        Object objG3 = buxVar.g();
        if (zE2 || objG3 == obj2) {
            Object amsVar = new ams(afegVar, bwqVar, (afck) null, 7, (byte[]) null);
            buxVar.x(amsVar);
            objG3 = amsVar;
        }
        bvq.f(aiykVar, afcoVar, (afeg) objG3, buxVar);
        return bwqVar;
    }

    public static final bym f(aizz aizzVar, afco afcoVar, byi byiVar, bux buxVar, int i) {
        if ((i & 1) != 0) {
            afcoVar = afcp.a;
        }
        afco afcoVar2 = afcoVar;
        if ((i & 2) != 0) {
            byiVar = bxp.c;
        }
        return e(aizzVar, aizzVar.b(), afcoVar2, byiVar, buxVar, 0);
    }

    public static final bym g(Object obj, Object obj2, afeg afegVar, bux buxVar) {
        Object objG = buxVar.g();
        Object obj3 = buw.a;
        if (objG == obj3) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        boolean zE = buxVar.E(afegVar);
        Object objG2 = buxVar.g();
        if (zE || objG2 == obj3) {
            objG2 = new ams(afegVar, bwqVar, (afck) null, 6);
            buxVar.x(objG2);
        }
        bvq.g(obj2, (afeg) objG2, buxVar);
        return bwqVar;
    }

    public static final cec h() {
        return (cec) cek.i.j();
    }

    public static final cec i(cec cecVar) {
        if (cecVar instanceof cfa) {
            cfa cfaVar = (cfa) cecVar;
            if (cfaVar.n == Thread.currentThread().getId()) {
                cfaVar.l = null;
                return cecVar;
            }
        }
        if (cecVar instanceof cfb) {
            cfb cfbVar = (cfb) cecVar;
            if (cfbVar.b == Thread.currentThread().getId()) {
                cfbVar.a = null;
                return cecVar;
            }
        }
        cec cecVarA = cek.a(cecVar, null, false);
        cecVarA.w();
        return cecVarA;
    }

    public static final cdz j(afeg afegVar) {
        cek.k(cek.a);
        synchronized (cek.b) {
            cek.f = woy.bZ(cek.f, afegVar);
        }
        return new ceb(afegVar, 1);
    }

    public static final cdz k(afec afecVar) {
        synchronized (cek.b) {
            cek.g = woy.bZ(cek.g, afecVar);
        }
        cek.k(cek.a);
        return new ceb(afecVar, 0);
    }

    public static final void l(cec cecVar, cec cecVar2, afec afecVar) {
        if (cecVar != cecVar2) {
            cek.i.k(cecVar);
            cecVar2.d();
        } else if (cecVar instanceof cfa) {
            ((cfa) cecVar).l = afecVar;
        } else if (cecVar instanceof cfb) {
            ((cfb) cecVar).a = afecVar;
        } else {
            Objects.toString(cecVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(cecVar)));
        }
    }

    public static final void m() {
        boolean z;
        synchronized (cek.b) {
            aap aapVar = cek.h.g;
            z = false;
            if (aapVar != null) {
                if (aapVar.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            cek.k(cek.a);
        }
    }

    public static final cdw n(afec afecVar, afec afecVar2) {
        cdw cdwVarA;
        cec cecVarB = cek.b();
        cdw cdwVar = cecVarB instanceof cdw ? (cdw) cecVarB : null;
        if (cdwVar == null || (cdwVarA = cdwVar.a(afecVar, afecVar2)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return cdwVarA;
    }

    public static /* synthetic */ void o() {
        throw new UnsupportedOperationException();
    }

    public static final String p(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final Object q(Object[] objArr, afdr afdrVar, bux buxVar) {
        return s(Arrays.copyOf(objArr, 0), cdu.a, afdrVar, buxVar, 3456);
    }

    public static final Object r(Object[] objArr, cdt cdtVar, afdr afdrVar, bux buxVar, int i) {
        int i2 = i & 112;
        return s(Arrays.copyOf(objArr, objArr.length), cdtVar, afdrVar, buxVar, ((i << 3) & 7168) | i2 | 384);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [afec, java.lang.Object] */
    public static final Object s(Object[] objArr, cdt cdtVar, afdr afdrVar, bux buxVar, int i) {
        Object[] objArr2;
        cdt cdtVar2;
        final Object obj;
        Object objA;
        final String string = Long.toString(buxVar.b(), 36);
        string.getClass();
        cdtVar.getClass();
        final cdp cdpVar = (cdp) buxVar.f(cdr.a);
        Object objG = buxVar.g();
        Object obj2 = buw.a;
        if (objG == obj2) {
            Object objInvoke = (cdpVar == null || (objA = cdpVar.a(string)) == null) ? null : cdtVar.b.invoke(objA);
            if (objInvoke == null) {
                objInvoke = afdrVar.invoke();
            }
            objArr2 = objArr;
            cdtVar2 = cdtVar;
            Object cdlVar = new cdl(cdtVar2, cdpVar, string, objInvoke, objArr2);
            buxVar.x(cdlVar);
            objG = cdlVar;
        } else {
            objArr2 = objArr;
            cdtVar2 = cdtVar;
        }
        final cdl cdlVar2 = (cdl) objG;
        Object objInvoke2 = Arrays.equals(objArr2, cdlVar2.d) ? cdlVar2.c : null;
        if (objInvoke2 == null) {
            objInvoke2 = afdrVar.invoke();
        }
        boolean zE = buxVar.E(cdlVar2);
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !buxVar.E(cdtVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zE2 = zE | z | buxVar.E(cdpVar) | buxVar.C(string) | buxVar.E(objInvoke2) | buxVar.E(objArr2);
        Object objG2 = buxVar.g();
        if (zE2 || objG2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke2;
            final cdt cdtVar3 = cdtVar2;
            Object obj3 = new afdr() { // from class: cdk
                @Override // defpackage.afdr
                public final Object invoke() {
                    boolean z2;
                    cdl cdlVar3 = cdlVar2;
                    cdp cdpVar2 = cdlVar3.a;
                    cdp cdpVar3 = cdpVar;
                    boolean z3 = true;
                    if (cdpVar2 != cdpVar3) {
                        cdlVar3.a = cdpVar3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str = string;
                    if (affa.f(cdlVar3.b, str)) {
                        z3 = z2;
                    } else {
                        cdlVar3.b = str;
                    }
                    Object[] objArr4 = objArr3;
                    Object obj4 = obj;
                    cdlVar3.e = cdtVar3;
                    cdlVar3.c = obj4;
                    cdlVar3.d = objArr4;
                    rpp rppVar = cdlVar3.f;
                    if (rppVar != null && z3) {
                        rppVar.b();
                        cdlVar3.f = null;
                        cdlVar3.d();
                    }
                    return afak.a;
                }
            };
            buxVar.x(obj3);
            objG2 = obj3;
        } else {
            obj = objInvoke2;
        }
        buxVar.r((afdr) objG2);
        return obj;
    }

    public static final cdt t(afeg afegVar, afec afecVar) {
        alx alxVar = new alx(afegVar, 17);
        affz.g(afecVar, 1);
        return new cdt(alxVar, afecVar);
    }

    public static final Bitmap u(cjj cjjVar) {
        if (cjjVar instanceof cjj) {
            return cjjVar.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long v(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        float[] fArr = clj.a;
        return i != clj.u.c ? ((i == clj.v.c || i == clj.w.c) && Build.VERSION.SDK_INT < 34) ? (int) (cjv.e(j, clj.e) >>> 32) : (i != clj.x.c || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : (int) (cjv.e(j, clj.e) >>> 32) : (int) (cjv.e(j, clj.e) >>> 32);
    }

    public static final long w(long j) {
        float[] fArr = clj.a;
        int i = (int) (63 & j);
        return (i == clj.x.c || i == clj.s.c || i == clj.t.c) ? v(cjv.e(j, clj.e)) : v(j);
    }

    public static final long x(long j) {
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public static final BlendMode y(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : BlendMode.SCREEN;
    }

    public static final PorterDuff.Mode z(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : PorterDuff.Mode.MULTIPLY;
    }
}
