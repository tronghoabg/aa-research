package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tss {
    private static volatile rdx a;

    public static final void A(abnp abnpVar) {
        abnpVar.t();
        szm szmVar = (szm) abnpVar.b;
        szm szmVar2 = szm.a;
        szmVar.b |= 8;
        szmVar.f = true;
    }

    public static synchronized rdx B(Context context) {
        nfh nfhVar;
        nfhVar = new nfh(Collections.singletonList(new wex(new rju(context))));
        spu spuVar = ssr.a;
        return C(nfhVar, spu.aF(4));
    }

    public static synchronized rdx C(nfh nfhVar, Executor executor) {
        if (a == null) {
            wha whaVar = wha.a;
            HashMap map = new HashMap();
            woy.aA(wgr.a, map);
            a = new rdx(executor, nfhVar, whaVar, map);
        }
        return a;
    }

    public static void D(erb erbVar, uku ukuVar) {
        int iOrdinal = ukuVar.a.ordinal();
        if (iOrdinal == 0) {
            return;
        }
        if (iOrdinal == 1) {
        } else if (iOrdinal == 2) {
        } else {
            if (iOrdinal != 3) {
                return;
            }
        }
    }

    private static boolean E(too tooVar, too tooVar2, too tooVar3) {
        int i;
        int iMin = Math.min(tooVar.a, tooVar2.a);
        int iMax = Math.max(tooVar.a, tooVar2.a);
        int iMin2 = Math.min(tooVar.b, tooVar2.b);
        int iMax2 = Math.max(tooVar.b, tooVar2.b);
        int i2 = tooVar3.a;
        if (i2 <= iMax && i2 >= iMin && (i = tooVar3.b) <= iMax2 && i >= iMin2) {
            int i3 = tooVar2.b;
            int i4 = tooVar.b;
            int i5 = tooVar.a;
            if ((i3 - i4) * (i2 - i5) == (i - i4) * (tooVar2.a - i5)) {
                return true;
            }
        }
        return false;
    }

    public static void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            abeg abegVar = (abeg) list.get(i);
            int i2 = 0;
            while (true) {
                abeh abehVar = abegVar.e;
                if (abehVar == null) {
                    abehVar = abeh.a;
                }
                if (i2 >= abehVar.d.size()) {
                    break;
                }
                abeh abehVar2 = abegVar.e;
                if (abehVar2 == null) {
                    abehVar2 = abeh.a;
                }
                abehVar2.d.e(i2);
                i2++;
            }
            int i3 = 0;
            while (true) {
                abeh abehVar3 = abegVar.e;
                if (abehVar3 == null) {
                    abehVar3 = abeh.a;
                }
                if (i3 < abehVar3.b.size()) {
                    abeh abehVar4 = abegVar.e;
                    if (abehVar4 == null) {
                        abehVar4 = abeh.a;
                    }
                    abehVar4.b.e(i3);
                    i3++;
                }
            }
        }
    }

    public static void b(abeg abegVar) {
        abeh abehVar = abegVar.e;
        if (abehVar == null) {
            abehVar = abeh.a;
        }
        c(abehVar, 2);
    }

    public static void c(abeh abehVar, int i) {
        int i2 = i - 1;
        int size = i2 != 0 ? i2 != 1 ? abehVar.c.size() : abehVar.d.size() : abehVar.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i2 == 0) {
                abehVar.b.e(i3);
            } else if (i2 != 1) {
                abehVar.c.e(i3);
            } else {
                abehVar.d.e(i3);
            }
        }
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? "LONG_PRESS" : "TAP";
    }

    public static trm e(Bitmap bitmap) {
        Comparator comparator = ygz.a;
        return new uqj(ygz.s(yli.a, 0, bitmap));
    }

    public static abah f(too tooVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer intBufferAsIntBuffer = byteBufferAllocate.asIntBuffer();
        intBufferAsIntBuffer.put((int) Math.round(tooVar.a() * 1.0E7d));
        intBufferAsIntBuffer.put((int) Math.round(tooVar.b() * 1.0E7d));
        abnp abnpVarN = abah.a.n();
        abms abmsVarV = abms.v(byteBufferAllocate.array());
        abnpVarN.t();
        abah abahVar = (abah) abnpVarN.b;
        abmsVarV.getClass();
        abahVar.b |= 1;
        abahVar.c = abmsVarV;
        return (abah) abnpVarN.q();
    }

    public static abms g(double[] dArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dArr.length * 8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asDoubleBuffer().put(dArr);
        return abms.u(byteBufferAllocate);
    }

    public static double h(double d, double d2) {
        double dAbs = Math.abs(d2 - d);
        return dAbs < 180.0d ? dAbs : 360.0d - dAbs;
    }

    public static int i(int i, float f) {
        float f2 = f * (((i >> 24) & 255) / 255.0f);
        return (((int) (f2 * ((i >> 16) & 255))) << 24) + (((int) (((i >> 8) & 255) * f2)) << 16) + (((int) ((i & 255) * f2)) << 8) + ((int) (255.0f * f2));
    }

    public static int j(too tooVar, too tooVar2, too tooVar3) {
        int i = tooVar3.a - tooVar.a;
        int i2 = tooVar3.b;
        long j = (i * (i2 - tooVar2.b)) - ((i2 - tooVar.b) * (r0 - tooVar2.a));
        return (int) ((j != 0 ? 1 : 0) | (j >> 63));
    }

    public static boolean k(too tooVar, too tooVar2, too tooVar3) {
        int i = tooVar.a;
        int i2 = tooVar.b;
        int i3 = tooVar2.a;
        int i4 = tooVar2.b;
        int i5 = tooVar3.a;
        int i6 = tooVar3.b;
        if (i2 <= i6 && i4 <= i6) {
            return false;
        }
        if (i5 >= i && i5 >= i3) {
            return false;
        }
        if (i5 < i && i5 < i3) {
            return false;
        }
        long j = i6 - i2;
        long j2 = (i5 - i) * (i4 - i2);
        return i3 >= i ? j2 > j * ((long) (i3 - i)) : j2 < j * ((long) (i3 - i));
    }

    public static boolean l(too tooVar, too tooVar2, too tooVar3, too tooVar4) {
        int i = tooVar2.a;
        int i2 = tooVar.a;
        int i3 = i - i2;
        int i4 = tooVar2.b;
        int i5 = tooVar.b;
        int i6 = i4 - i5;
        int i7 = tooVar4.a;
        int i8 = tooVar3.a;
        int i9 = i7 - i8;
        int i10 = tooVar4.b;
        int i11 = tooVar3.b;
        int i12 = i10 - i11;
        int i13 = i8 - i2;
        int i14 = i11 - i5;
        long j = i3;
        long j2 = i9;
        long j3 = i6;
        long j4 = (j2 * j3) - (i12 * j);
        if (j4 == 0) {
            if (i13 == 0) {
                if (i14 == 0) {
                    return true;
                }
                i13 = 0;
            }
            if ((i13 * j3) - (i14 * j) != 0) {
                return false;
            }
            return (i3 == 0 && i6 == 0) ? E(tooVar3, tooVar4, tooVar) : (i9 == 0 && i12 == 0) ? E(tooVar, tooVar2, tooVar3) : E(tooVar, tooVar2, tooVar3) || E(tooVar, tooVar2, tooVar4) || E(tooVar3, tooVar4, tooVar) || E(tooVar3, tooVar4, tooVar2);
        }
        long j5 = i14;
        double d = (((-i13) * j3) + (j * j5)) / j4;
        if (d >= 0.0d && d <= 1.0d) {
            double d2 = ((i13 * r12) - (j5 * j2)) / (-j4);
            if (d2 >= 0.0d && d2 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public static void m(too tooVar, too tooVar2, too tooVar3, too tooVar4, too tooVar5) {
        int i = tooVar.b - tooVar2.b;
        int i2 = tooVar2.a;
        int i3 = tooVar.a;
        int i4 = tooVar4.a;
        int i5 = tooVar3.a;
        int i6 = tooVar4.b;
        int i7 = tooVar3.b;
        long j = i;
        long j2 = ((i4 - i5) * j) + ((i6 - i7) * (i2 - i3));
        double d = j2 == 0 ? j(tooVar, tooVar2, tooVar3) == 0 ? 0.0d : j(tooVar, tooVar2, tooVar4) == 0 ? 1.0d : Double.NaN : (((i3 - i5) * j) + ((r5 - i7) * r7)) / j2;
        if (Double.isNaN(d) || d < 0.0d || d > 1.0d) {
            return;
        }
        tooVar5.a = (int) (tooVar3.a + ((tooVar4.a - r5) * d));
        tooVar5.b = (int) (tooVar3.b + ((tooVar4.b - r2) * d));
    }

    public static final deu n(String str) {
        str.getClass();
        return new deu(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final boolean r18, defpackage.cfy r19, defpackage.asw r20, defpackage.atc r21, defpackage.cfr r22, defpackage.cfm r23, final defpackage.afeh r24, defpackage.bux r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tss.o(boolean, cfy, asw, atc, cfr, cfm, afeh, bux, int, int):void");
    }

    public static final void p(String str, String str2, Object... objArr) {
        q(str, str2, Arrays.copyOf(objArr, objArr.length));
        throw new IllegalStateException();
    }

    @ResultIgnorabilityUnspecified
    public static Object q(String str, String str2, Object... objArr) {
        ((ype) ((ype) yph.c(str).g()).ai(8985)).Y(str2, objArr);
        throw new IllegalStateException(String.format(str2, objArr));
    }

    @ResultIgnorabilityUnspecified
    public static Object r(String str, Throwable th, String str2, Object... objArr) {
        ((ype) ((ype) ((ype) yph.c(str).g()).p(th)).ai(8986)).Y(str2, objArr);
        throw new IllegalStateException(String.format(str2, objArr), th);
    }

    public static final /* synthetic */ tah s(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (tah) abnvVarN;
    }

    public static final /* synthetic */ void t(Iterable iterable, abnp abnpVar) {
        abnpVar.t();
        tah tahVar = (tah) abnpVar.b;
        tah tahVar2 = tah.a;
        aboh abohVar = tahVar.b;
        if (!abohVar.c()) {
            tahVar.b = abnv.I(abohVar);
        }
        abmc.i(iterable, tahVar.b);
    }

    public static final /* synthetic */ szy v(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (szy) abnvVarN;
    }

    public static final /* synthetic */ szm w(abnp abnpVar) {
        abnv abnvVarN = abnpVar.q();
        abnvVarN.getClass();
        return (szm) abnvVarN;
    }

    public static final void x(tbc tbcVar, abnp abnpVar) {
        abnpVar.t();
        szm szmVar = (szm) abnpVar.b;
        szm szmVar2 = szm.a;
        szmVar.e = tbcVar;
        szmVar.b |= 4;
    }

    public static final void y(tak takVar, abnp abnpVar) {
        abnpVar.t();
        szm szmVar = (szm) abnpVar.b;
        szm szmVar2 = szm.a;
        szmVar.d = takVar;
        szmVar.b |= 2;
    }

    public static final void z(abnp abnpVar) {
        abnpVar.t();
        szm szmVar = (szm) abnpVar.b;
        szm szmVar2 = szm.a;
        szmVar.b |= 1;
        szmVar.c = true;
    }
}
