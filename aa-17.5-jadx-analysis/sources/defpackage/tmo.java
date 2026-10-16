package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class tmo {
    public static volatile tmo a;

    public tmo(Executor executor, qau qauVar, tnv tnvVar, uaj uajVar) {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        int i2 = tnvVar.e;
        new tul(executor, qauVar, uajVar.f());
    }

    public static boolean i(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static long j(tmb tmbVar, long j) {
        return (j - tmbVar.a()) + tmbVar.f().toEpochMilli();
    }

    public static abms k(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            throw new IllegalStateException("Could not encode Bitmap");
        }
        abms abmsVarV = abms.v(byteArrayOutputStream.toByteArray());
        abmsVarV.getClass();
        return abmsVarV;
    }

    public static abms l(Drawable drawable, int i) {
        return k(dti.e(drawable, i, i, 4));
    }

    public static int m(abms abmsVar) {
        abmo it = abmsVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.a() >= 0) {
                i++;
            }
        }
        return i;
    }

    @ResultIgnorabilityUnspecified
    public static int n(abms abmsVar, int i, int i2, int[] iArr, int i3) throws IOException {
        int i4;
        int i5 = i - 1;
        int i6 = 0;
        if (i5 == 1) {
            abmw abmwVarG = abmsVar.g();
            while (!abmwVarG.F()) {
                iArr[i3 + i6] = abmwVarG.p();
                i6++;
            }
            return i6;
        }
        if (i5 == 2) {
            ytw ytwVar = new ytw(abmsVar.h());
            while (ytwVar.available() > 0 && (i4 = i3 + i6) < iArr.length) {
                iArr[i4] = (short) ytwVar.readUnsignedShort();
                i6++;
            }
            return i6;
        }
        if (i5 != 3) {
            throw new IOException("Unknown vertex encoding :".concat(Integer.toString(i5)));
        }
        if (i2 != 3) {
            return w(abmsVar, iArr, i3);
        }
        abmw abmwVarG2 = abmsVar.g();
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        while (!abmwVarG2.F()) {
            iP += abmwVarG2.p();
            iP2 += abmwVarG2.p();
            iP3 += abmwVarG2.p();
            int i7 = i3 + i6;
            iArr[i7] = iP;
            iArr[i7 + 1] = iP2;
            iArr[i7 + 2] = iP3;
            i6 += 3;
        }
        return i6;
    }

    public static int[] o(abms abmsVar, int i, int i2, int i3) throws IOException {
        if (i3 <= 0) {
            int i4 = i - 1;
            if (i4 == 1) {
                i3 = m(abmsVar);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    throw new IOException("Unknown vertex encoding :".concat(Integer.toString(i4)));
                }
                i3 = m(abmsVar);
            } else {
                i3 = abmsVar.d() / 2;
            }
        }
        int[] iArr = new int[i3];
        n(abmsVar, i, i2, iArr, 0);
        return iArr;
    }

    public static toi p(too tooVar) {
        return new toi(tooVar.a(), tooVar.b());
    }

    public static too q(toi toiVar) {
        return too.l(toiVar.a, toiVar.b);
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? "null" : "PHONE_MAIN" : "UNSPECIFIED";
    }

    public static tyg s(tza tzaVar, tof tofVar, twf twfVar) {
        tyf twcVar = twfVar.l ? new twc(twfVar) : new twd(twfVar);
        int i = true == twfVar.k ? 2 : 1;
        utf utfVar = twfVar.m;
        float f = twfVar.g;
        int i2 = twf.c;
        twf.c = i2 + 1;
        return new tyg(tzaVar, twcVar, tofVar, i, f, i2, new ulw(utfVar, tyg.b(i2)));
    }

    public static /* bridge */ /* synthetic */ void t(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static Set u(ttv ttvVar, Set set, too tooVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ukp ukpVarB = ttvVar.b((ukp) it.next(), tooVar);
            if (ukpVarB != null) {
                linkedHashSet.add(ukpVarB);
            }
        }
        return linkedHashSet;
    }

    public static int[] v() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[PHI: r7 r8
  0x0019: PHI (r7v11 int) = (r7v1 int), (r7v3 int) binds: [B:9:0x0017, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0019: PHI (r8v10 int) = (r8v0 int), (r8v4 int) binds: [B:9:0x0017, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[PHI: r8 r9
  0x005b: PHI (r8v3 int) = (r8v2 int), (r8v5 int) binds: [B:12:0x0028, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v1 int) = (r9v0 int), (r9v3 int) binds: [B:12:0x0028, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int w(defpackage.abms r12, int[] r13, int r14) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r1
        L6:
            int r6 = r12.d()
            if (r0 >= r6) goto L78
            int r6 = r14 + r2
            int r7 = r13.length
            if (r6 >= r7) goto L78
            int r7 = r0 + 1
            byte r8 = r12.a(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            if (r8 < 0) goto L1b
        L19:
            r0 = r7
            goto L5c
        L1b:
            r8 = r8 & 127(0x7f, float:1.78E-43)
            int r9 = r0 + 2
            byte r7 = r12.a(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            r10 = r7 & 127(0x7f, float:1.78E-43)
            int r10 = r10 << 7
            r8 = r8 | r10
            if (r7 >= 0) goto L5b
            int r7 = r0 + 3
            byte r9 = r12.a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            r10 = r9 & 127(0x7f, float:1.78E-43)
            int r10 = r10 << 14
            r8 = r8 | r10
            if (r9 >= 0) goto L19
            int r9 = r0 + 4
            byte r7 = r12.a(r7)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            r10 = r7 & 127(0x7f, float:1.78E-43)
            int r10 = r10 << 21
            r8 = r8 | r10
            if (r7 >= 0) goto L5b
            int r0 = r0 + 5
            byte r7 = r12.a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            r9 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r9 << 28
            r8 = r8 | r9
        L4f:
            if (r7 >= 0) goto L5c
            int r7 = r0 + 1
            byte r0 = r12.a(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6f
            r11 = r7
            r7 = r0
            r0 = r11
            goto L4f
        L5b:
            r0 = r9
        L5c:
            int r7 = r8 >>> 1
            r8 = r8 & r1
            int r8 = -r8
            r7 = r7 ^ r8
            if (r5 == 0) goto L67
            int r3 = r3 + r7
            r13[r6] = r3
            goto L6a
        L67:
            int r4 = r4 + r7
            r13[r6] = r4
        L6a:
            r5 = r5 ^ 1
            int r2 = r2 + 1
            goto L6
        L6f:
            r12 = move-exception
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid vertex data"
            r13.<init>(r14, r12)
            throw r13
        L78:
            if (r5 == 0) goto L7b
            return r2
        L7b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Odd number of vertices"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmo.w(abms, int[], int):int");
    }

    public void a(twq twqVar, toi toiVar, tuz tuzVar) {
        twqVar.a(tqd.b, too.l(toiVar.a, toiVar.b));
    }

    public void b(twq twqVar, toi toiVar, tuz tuzVar) {
        twqVar.a(tqd.a, too.l(toiVar.a, toiVar.b));
    }

    public void f() {
    }

    public tmo(byte[] bArr, byte[] bArr2) {
    }

    public tmo() {
    }

    public void c(tuz tuzVar) {
    }

    public void d(tuz tuzVar) {
    }

    public void e(tuz tuzVar) {
    }

    public void h(tuz tuzVar) {
    }

    public void g(float f, boolean z, tuz tuzVar) {
    }
}
