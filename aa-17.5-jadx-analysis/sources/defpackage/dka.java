package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dka {
    public dka(byte[] bArr, byte[] bArr2) {
        emr emrVar = emr.b;
    }

    public static final Void a(String str) {
        throw new IllegalArgumentException("Unsupported unit.");
    }

    public static final Void b(String str) {
        throw new IllegalStateException("Text drawing wrapper is missing a Canvas!");
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? "Rtl" : "Ltr";
    }

    public static final boolean f(dfm dfmVar) {
        return (dfmVar.f == null && dfmVar.d == null && dfmVar.c == null) ? false : true;
    }

    public static final void g(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = clj.a;
            spannable.setSpan(new BackgroundColorSpan((int) (cjv.e(j, clj.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void h(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            float[] fArr = clj.a;
            spannable.setSpan(new ForegroundColorSpan((int) (cjv.e(j, clj.e) >>> 32)), i, i2, 33);
        }
    }

    public static final void i(Spannable spannable, long j, dlg dlgVar, int i, int i2) {
        long j2 = dlt.a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 4294967296L) {
            spannable.setSpan(new AbsoluteSizeSpan(afgi.k(dlgVar.ez(j)), false), i, i2, 33);
        } else if (j2 == 8589934592L) {
            spannable.setSpan(new RelativeSizeSpan(Float.intBitsToFloat((int) (j & 4294967295L))), i, i2, 33);
        }
    }

    public static final void j(Spannable spannable, dkd dkdVar, int i, int i2) {
        if (dkdVar != null) {
            ArrayList arrayList = new ArrayList(woy.bp(dkdVar, 10));
            Iterator<E> it = dkdVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((dkc) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void k(float f, dlg dlgVar) {
        dlu[] dluVarArr = dlt.a;
        if ((Float.floatToRawIntBits(Float.NaN) & 4294967295L) != 0) {
            long j = dlt.a[0].a;
            if (j == 4294967296L) {
                dlgVar.ez(0L);
            } else if (j == 8589934592L) {
                Float.intBitsToFloat(0);
            }
        }
    }

    public static final int l() {
        long j = dlt.a[1].a;
        if (j == 4294967296L) {
            return 0;
        }
        return j != 8589934592L ? 2 : 1;
    }
}
