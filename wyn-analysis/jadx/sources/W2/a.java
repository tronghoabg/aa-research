package W2;

import P1.b;
import P2.d;
import P2.k;
import P2.l;
import Q1.c;
import Q1.o;
import Q1.x;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.apache.tika.fork.ForkServer;
import pd.f;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o f15139a = new o();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15141c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15142d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15143e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15145g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f15141c = 0;
            this.f15142d = -1;
            this.f15143e = "sans-serif";
            this.f15140b = false;
            this.f15144f = 0.85f;
            this.f15145g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f15141c = bArr[24];
        this.f15142d = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f15143e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i5 = bArr[25] * 20;
        this.f15145g = i5;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f15140b = z2;
        if (z2) {
            this.f15144f = x.h(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
        } else {
            this.f15144f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i5, int i10, int i11, int i12, int i13) {
        if (i5 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i5, int i10, int i11, int i12, int i13) {
        if (i5 != i10) {
            int i14 = i13 | 33;
            boolean z2 = (i5 & 1) != 0;
            boolean z10 = (i5 & 2) != 0;
            if (z2) {
                if (z10) {
                    N0.a.m(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    N0.a.m(1, spannableStringBuilder, i11, i12, i14);
                }
            } else if (z10) {
                N0.a.m(2, spannableStringBuilder, i11, i12, i14);
            }
            boolean z11 = (i5 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z2 || z10) {
                return;
            }
            N0.a.m(0, spannableStringBuilder, i11, i12, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P2.l
    public final void E(byte[] bArr, int i5, int i10, k kVar, c cVar) {
        String strS;
        int i11;
        int i12;
        int i13;
        int i14 = 1;
        o oVar = this.f15139a;
        oVar.E(i5 + i10, bArr);
        oVar.G(i5);
        int i15 = 2;
        int i16 = 0;
        Q1.k.c(oVar.a() >= 2);
        int iA = oVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i17 = oVar.f9703b;
            Charset charsetC = oVar.C();
            int i18 = iA - (oVar.f9703b - i17);
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strS = oVar.s(i18, charsetC);
        }
        if (strS.isEmpty()) {
            C3407I c3407i = AbstractC3409K.f40056b;
            cVar.accept(new P2.a(e0.f40101e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        b(spannableStringBuilder, this.f15141c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f15142d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f15143e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f15144f;
        while (oVar.a() >= 8) {
            int i19 = oVar.f9703b;
            int iH = oVar.h();
            int iH2 = oVar.h();
            if (iH2 == 1937013100) {
                Q1.k.c(oVar.a() >= i15 ? i14 : i16);
                int iA2 = oVar.A();
                int i20 = i16;
                while (i20 < iA2) {
                    Q1.k.c(oVar.a() >= 12 ? i14 : i16);
                    int iA3 = oVar.A();
                    int iA4 = oVar.A();
                    oVar.H(i15);
                    int i21 = i20;
                    int iU = oVar.u();
                    oVar.H(i14);
                    int iH3 = oVar.h();
                    int i22 = i14;
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbL = f.l(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbL.append(spannableStringBuilder.length());
                        sbL.append(").");
                        Q1.k.w("Tx3gParser", sbL.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        Q1.k.w("Tx3gParser", N0.a.e("Ignoring styl with start (", iA3, ") >= end (", iA4, ")."));
                        i13 = i21;
                    } else {
                        i13 = i21;
                        int i23 = iA4;
                        b(spannableStringBuilder, iU, this.f15141c, iA3, i23, 0);
                        a(spannableStringBuilder, iH3, this.f15142d, iA3, i23, 0);
                    }
                    i20 = i13 + 1;
                    i14 = i22;
                    i15 = 2;
                    i16 = 0;
                }
                i11 = i14;
                i12 = i15;
            } else {
                i11 = i14;
                if (iH2 == 1952608120 && this.f15140b) {
                    i12 = 2;
                    Q1.k.c(oVar.a() >= 2 ? i11 : 0);
                    fH = x.h(oVar.A() / this.f15145g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
                } else {
                    i12 = 2;
                }
            }
            oVar.G(i19 + iH);
            i15 = i12;
            i16 = 0;
            i14 = i11;
        }
        cVar.accept(new P2.a(AbstractC3409K.n(new b(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // P2.l
    public final /* synthetic */ d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public final int P() {
        return 2;
    }

    @Override // P2.l
    public final /* synthetic */ void reset() {
    }
}
