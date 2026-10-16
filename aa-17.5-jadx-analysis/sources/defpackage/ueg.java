package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ueg {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/SharedLabelerCallbacksHandler");
    public static final byte[] b = new byte[0];
    public final uiw c;
    public final uel d;
    public final udd e;
    public final ucp f;
    public final ucy g;
    public final ucm h;
    public final Resources i;
    public final Map j = new HashMap();
    public final Map k = new HashMap();
    public final Map l = new HashMap();
    public ujk m = ujk.a;
    public final rfe n = new rfe();
    private final upr o;
    private final Paint p;
    private final rjs q;

    public ueg(uel uelVar, uiw uiwVar, upr uprVar, rjs rjsVar, Paint paint, udd uddVar, ucp ucpVar, ucy ucyVar, ucm ucmVar, Resources resources) {
        this.c = uiwVar;
        this.o = uprVar;
        this.q = rjsVar;
        this.d = uelVar;
        this.p = paint;
        this.e = uddVar;
        this.h = ucmVar;
        this.f = ucpVar;
        this.g = ucyVar;
        this.i = resources;
    }

    public static abis a(abiq abiqVar) {
        abnp abnpVarN = abis.a.n();
        long j = abiqVar.c;
        abnpVarN.t();
        abis abisVar = (abis) abnpVarN.b;
        abisVar.b |= 1;
        abisVar.c = j;
        abnpVarN.t();
        abis abisVar2 = (abis) abnpVarN.b;
        abisVar2.f = 2;
        abisVar2.b |= 8;
        return (abis) abnpVarN.q();
    }

    public static abis b(abiq abiqVar, Bitmap bitmap, Resources resources) {
        int i;
        float f = (abiqVar.b & 4) != 0 ? abiqVar.e : resources.getDisplayMetrics().density;
        abid abidVar = abiqVar.d;
        if (abidVar == null) {
            abidVar = abid.a;
        }
        int i2 = 1;
        if ((abidVar.b == 1 ? (String) abidVar.c : "").startsWith("direct-bitmap")) {
            f = resources.getDisplayMetrics().density;
        }
        abnp abnpVarN = abis.a.n();
        long j = abiqVar.c;
        abnpVarN.t();
        abis abisVar = (abis) abnpVarN.b;
        abisVar.b |= 1;
        abisVar.c = j;
        abid abidVar2 = abiqVar.d;
        if (abidVar2 == null) {
            abidVar2 = abid.a;
        }
        if ((abidVar2.b == 1 ? (String) abidVar2.c : "").contains(".9.png")) {
            woy.Z(bitmap.getHeight() > 0 && (bitmap.getHeight() + (-2)) % 4 == 0);
            woy.Z(bitmap.getWidth() > 0 && (bitmap.getWidth() + (-2)) % 4 == 0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = height - 1;
            int i4 = width - 2;
            int i5 = height - 2;
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            aeiy aeiyVar = new aeiy();
            int i6 = -1;
            int i7 = 1;
            int i8 = -1;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i = -16777216;
                if (i7 >= width - 1) {
                    break;
                }
                int i12 = iArr[i7] == -16777216 ? i2 : 0;
                int i13 = i2;
                int i14 = iArr[i7 + (i3 * width)];
                if (i12 != i10) {
                    aeiyVar.c(i9);
                    i10 = i12;
                    i9 = 0;
                }
                i9++;
                if (i14 == -16777216) {
                    if (i8 == -1) {
                        i8 = i7 - 1;
                    }
                    i11++;
                }
                i7++;
                i2 = i13;
            }
            int i15 = i2;
            aeiyVar.c(i9);
            int[] iArrL = aeiyVar.L(new int[aeiyVar.b]);
            aeiyVar.clear();
            int i16 = -1;
            int i17 = i15;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i17 < i3) {
                int i21 = i6;
                int i22 = iArr[i17 * width] == i ? i15 : 0;
                int i23 = iArr[(r16 + width) - 1];
                if (i22 != i19) {
                    aeiyVar.c(i18);
                    i19 = i22;
                    i18 = 0;
                }
                i18++;
                if (i23 == -16777216) {
                    if (i16 == i21) {
                        i16 = i17 - 1;
                    }
                    i20++;
                }
                i17++;
                i = -16777216;
                i6 = -1;
            }
            int i24 = i20;
            aeiyVar.c(i18);
            int[] iArrL2 = aeiyVar.L(new int[aeiyVar.b]);
            abka abkaVar = abka.a;
            abnp abnpVarN2 = abkaVar.n();
            abnpVarN2.t();
            abka abkaVar2 = (abka) abnpVarN2.b;
            abkaVar2.b |= 1;
            abkaVar2.c = i4 / 4.0f;
            abnpVarN2.t();
            abka abkaVar3 = (abka) abnpVarN2.b;
            abkaVar3.b |= 2;
            abkaVar3.d = i5 / 4.0f;
            abnpVarN.t();
            abis abisVar2 = (abis) abnpVarN.b;
            abka abkaVar4 = (abka) abnpVarN2.q();
            abkaVar4.getClass();
            abisVar2.d = abkaVar4;
            abisVar2.b |= 2;
            abnp abnpVarN3 = abiz.a.n();
            int length = iArrL.length;
            int i25 = 0;
            int i26 = 0;
            boolean z = false;
            while (i25 < length) {
                int i27 = iArrL[i25] + i26;
                if (z) {
                    abnpVarN3.ad(i26);
                    abnpVarN3.ad(i27);
                }
                z = !z;
                i25++;
                i26 = i27;
            }
            int length2 = iArrL2.length;
            int i28 = 0;
            int i29 = 0;
            boolean z2 = false;
            while (i28 < length2) {
                int i30 = iArrL2[i28] + i29;
                if (z2) {
                    abnpVarN3.ae(i29);
                    abnpVarN3.ae(i30);
                }
                z2 = !z2;
                i28++;
                i29 = i30;
            }
            abnp abnpVarN4 = abht.a.n();
            abnp abnpVarN5 = abkaVar.n();
            abnpVarN5.t();
            abka abkaVar5 = (abka) abnpVarN5.b;
            abkaVar5.b |= 1;
            abkaVar5.c = i8 / 4.0f;
            abnpVarN5.t();
            abka abkaVar6 = (abka) abnpVarN5.b;
            abkaVar6.b |= 2;
            abkaVar6.d = i16 / 4.0f;
            abnpVarN4.t();
            abht abhtVar = (abht) abnpVarN4.b;
            abka abkaVar7 = (abka) abnpVarN5.q();
            abkaVar7.getClass();
            abhtVar.c = abkaVar7;
            abhtVar.b |= 1;
            abnp abnpVarN6 = abkaVar.n();
            abnpVarN6.t();
            abka abkaVar8 = (abka) abnpVarN6.b;
            abkaVar8.b |= 1;
            abkaVar8.c = i11 / 4.0f;
            abnpVarN6.t();
            abka abkaVar9 = (abka) abnpVarN6.b;
            abkaVar9.b |= 2;
            abkaVar9.d = i24 / 4.0f;
            abnpVarN4.t();
            abht abhtVar2 = (abht) abnpVarN4.b;
            abka abkaVar10 = (abka) abnpVarN6.q();
            abkaVar10.getClass();
            abhtVar2.d = abkaVar10;
            abhtVar2.b |= 2;
            abnpVarN3.t();
            abiz abizVar = (abiz) abnpVarN3.b;
            abht abhtVar3 = (abht) abnpVarN4.q();
            abhtVar3.getClass();
            abizVar.e = abhtVar3;
            abizVar.b |= 1;
            abiz abizVar2 = (abiz) abnpVarN3.q();
            abnpVarN.t();
            abis abisVar3 = (abis) abnpVarN.b;
            abizVar2.getClass();
            abisVar3.e = abizVar2;
            abisVar3.b |= 4;
        } else {
            abnp abnpVarN7 = abka.a.n();
            abnpVarN7.t();
            abka abkaVar11 = (abka) abnpVarN7.b;
            abkaVar11.b |= 1;
            abkaVar11.c = bitmap.getWidth() / f;
            float height2 = bitmap.getHeight() / f;
            abnpVarN7.t();
            abka abkaVar12 = (abka) abnpVarN7.b;
            abkaVar12.b |= 2;
            abkaVar12.d = height2;
            abnpVarN.t();
            abis abisVar4 = (abis) abnpVarN.b;
            abka abkaVar13 = (abka) abnpVarN7.q();
            abkaVar13.getClass();
            abisVar4.d = abkaVar13;
            abisVar4.b |= 2;
        }
        return (abis) abnpVarN.q();
    }

    public static final abhy e(int i, wnq wnqVar) {
        abnp abnpVarN = abhy.a.n();
        abnp abnpVarN2 = abhl.a.n();
        abnpVarN2.t();
        abhl abhlVar = (abhl) abnpVarN2.b;
        abhlVar.b |= 1;
        abhlVar.c = i;
        abnpVarN.t();
        abhy abhyVar = (abhy) abnpVarN.b;
        abhl abhlVar2 = (abhl) abnpVarN2.q();
        abhlVar2.getClass();
        abhyVar.c = abhlVar2;
        abhyVar.b |= 1;
        if (wnqVar != null) {
            Object obj = ((rhj) wnqVar.e).b;
            if (obj != null) {
                abnpVarN.t();
                abhy abhyVar2 = (abhy) abnpVarN.b;
                abhyVar2.b |= 2;
                abhyVar2.d = (abms) obj;
            }
            List listE = ((ukh) wnqVar.c).e();
            abnpVarN.t();
            abhy abhyVar3 = (abhy) abnpVarN.b;
            aboh abohVar = abhyVar3.e;
            if (!abohVar.c()) {
                abhyVar3.e = abnv.I(abohVar);
            }
            abmc.i(listE, abhyVar3.e);
            abnp abnpVarN3 = abfy.a.n();
            zdf zdfVar = new zdf((zdg) wnqVar.f);
            abnpVarN3.t();
            abfy abfyVar = (abfy) abnpVarN3.b;
            abod abodVar = abfyVar.b;
            if (!abodVar.c()) {
                abfyVar.b = abnv.G(abodVar);
            }
            abmc.i(zdfVar, abfyVar.b);
            yno it = ((yfy) wnqVar.b).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                abnp abnpVarN4 = abfx.a.n();
                int iIntValue = ((Integer) entry.getKey()).intValue();
                abnpVarN4.t();
                abfx abfxVar = (abfx) abnpVarN4.b;
                abfxVar.b |= 1;
                abfxVar.c = iIntValue;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                abnpVarN4.t();
                abfx abfxVar2 = (abfx) abnpVarN4.b;
                abfxVar2.b |= 2;
                abfxVar2.d = iIntValue2;
                abnpVarN3.t();
                abfy abfyVar2 = (abfy) abnpVarN3.b;
                abfx abfxVar3 = (abfx) abnpVarN4.q();
                abfxVar3.getClass();
                aboh abohVar2 = abfyVar2.c;
                if (!abohVar2.c()) {
                    abfyVar2.c = abnv.I(abohVar2);
                }
                abfyVar2.c.add(abfxVar3);
            }
            abnpVarN.t();
            abhy abhyVar4 = (abhy) abnpVarN.b;
            abfy abfyVar3 = (abfy) abnpVarN3.q();
            abfyVar3.getClass();
            abhyVar4.f = abfyVar3;
            abhyVar4.b |= 8;
        } else {
            abnpVarN.t();
            abhy abhyVar5 = (abhy) abnpVarN.b;
            abhyVar5.g = 2;
            abhyVar5.b |= 16;
        }
        return (abhy) abnpVarN.q();
    }

    public final void c(abiq abiqVar) {
        abid abidVar = abiqVar.d;
        if (abidVar == null) {
            abidVar = abid.a;
        }
        if (abidVar.b == 1) {
            abid abidVar2 = abiqVar.d;
            if (abidVar2 == null) {
                abidVar2 = abid.a;
            }
            if (!(abidVar2.b == 1 ? (String) abidVar2.c : "").isEmpty()) {
                abid abidVar3 = abiqVar.d;
                if (abidVar3 == null) {
                    abidVar3 = abid.a;
                }
                if ((abidVar3.b == 1 ? (String) abidVar3.c : "").startsWith("direct-bitmap")) {
                    rjs rjsVar = this.q;
                    abid abidVar4 = abiqVar.d;
                    if (abidVar4 == null) {
                        abidVar4 = abid.a;
                    }
                    Bitmap bitmapB = rjsVar.b(abidVar4.b == 1 ? (String) abidVar4.c : "");
                    this.d.j(bitmapB == null ? a(abiqVar) : b(abiqVar, bitmapB, this.i));
                    return;
                }
                ued uedVar = new ued(this, abiqVar);
                upr uprVar = this.o;
                abid abidVar5 = abiqVar.d;
                if (abidVar5 == null) {
                    abidVar5 = abid.a;
                }
                upy upyVarC = uprVar.c(abidVar5.b == 1 ? (String) abidVar5.c : "", String.valueOf(getClass().getName()).concat("#measureIconLayer()"), uedVar);
                if (upyVarC.l()) {
                    abis abisVarB = ued.b(abiqVar, upyVarC, this.i);
                    if (uedVar.a.compareAndSet(false, true)) {
                        this.d.j(abisVarB);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.d.j(a(abiqVar));
    }

    public final void d(long j, String str, float f, int i, int i2, boolean z, ueu ueuVar) {
        int iAy;
        if (str.isEmpty() || (iAy = a.ay(i)) == 0) {
            this.d.k(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        Paint paint = this.p;
        paint.setTypeface(uqw.F(uqw.E(iAy, z)));
        float f2 = this.i.getDisplayMetrics().density;
        float f3 = ueuVar.c;
        int i3 = ueuVar.d;
        paint.setTextSize(Math.max(f3, Math.min(32.0f, ueuVar.e * f)) * f2);
        paint.setLetterSpacing(i2 / 1000.0f);
        float fMeasureText = paint.measureText(str) * (f2 < 1.001f ? 1.03f : 1.0f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.d.k(j, fMeasureText / f2, ((float) Math.ceil(fontMetrics.descent - fontMetrics.ascent)) / f2, (-fontMetrics.ascent) / f2, (fontMetrics.ascent - fontMetrics.top) / f2, (fontMetrics.bottom - fontMetrics.descent) / f2);
    }
}
