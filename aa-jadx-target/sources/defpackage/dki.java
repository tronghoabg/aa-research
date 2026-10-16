package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dki {
    public dki() {
        defpackage.emx emxVar = defpackage.emx.b;
    }

    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException("Unsupported unit.");
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException("Text drawing wrapper is missing a Canvas!");
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final defpackage.dfb e(defpackage.dkd dkdVar) {
        return dkdVar.a.e(dkdVar.b);
    }

    public static final defpackage.dfb f(defpackage.dkd dkdVar, int i) {
        long j = dkdVar.b;
        int iC = defpackage.dgc.c(j);
        int iC2 = defpackage.dgc.c(j);
        int length = iC2 + i;
        if (((i ^ length) & (iC2 ^ length)) < 0) {
            length = dkdVar.a().length();
        }
        return dkdVar.a.subSequence(iC, java.lang.Math.min(length, dkdVar.a().length()));
    }

    public static final defpackage.dfb g(defpackage.dkd dkdVar, int i) {
        long j = dkdVar.b;
        int iD = defpackage.dgc.d(j);
        int i2 = iD - i;
        if (((i ^ iD) & (iD ^ i2)) < 0) {
            i2 = 0;
        }
        return dkdVar.a.subSequence(java.lang.Math.max(0, i2), defpackage.dgc.d(j));
    }

    public static final boolean h(defpackage.dft dftVar) {
        return (dftVar.f == null && dftVar.d == null && dftVar.c == null) ? false : true;
    }

    public static final void i(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = defpackage.clr.a;
            spannable.setSpan(new android.text.style.BackgroundColorSpan((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void j(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = defpackage.clr.a;
            spannable.setSpan(new android.text.style.ForegroundColorSpan((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void k(android.text.Spannable spannable, long j, defpackage.dlo dloVar, int i, int i2) {
        long j2 = defpackage.dmb.a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 4294967296L) {
            spannable.setSpan(new android.text.style.AbsoluteSizeSpan(defpackage.afhi.k(dloVar.dH(j)), false), i, i2, 33);
        } else if (j2 == 8589934592L) {
            spannable.setSpan(new android.text.style.RelativeSizeSpan(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))), i, i2, 33);
        }
    }

    public static final void l(android.text.Spannable spannable, defpackage.dkl dklVar, int i, int i2) {
        if (dklVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(dklVar, 10));
            java.util.Iterator<E> it = dklVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.dkk) it.next()).a);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            spannable.setSpan(new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void m(float f, defpackage.dlo dloVar) {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if (defpackage.dmb.a[0].a != 4294967296L) {
            return;
        }
        dloVar.dH(0L);
    }

    public static final int n() {
        long j = defpackage.dmb.a[1].a;
        if (j == 4294967296L) {
            return 0;
        }
        return j != 8589934592L ? 2 : 1;
    }

    public /* synthetic */ dki(byte[] bArr) {
    }
}
