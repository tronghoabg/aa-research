package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class ufw {
    public final Paint a;
    public final float b;
    private final Paint c;
    private final uwg d;
    private final float e;

    public ufw(uwg uwgVar, float f, Paint paint, Paint paint2) {
        this.d = uwgVar;
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.b = f;
        this.e = f < 1.001f ? 1.03f : 1.0f;
    }

    public static ujf a(abjh abjhVar) {
        abju abjuVar = abjhVar.b;
        if (abjuVar == null) {
            abjuVar = abju.a;
        }
        ujf ujfVar = ujf.c;
        uje ujeVar = new uje();
        int i = abjhVar.c;
        int i2 = abjhVar.d;
        int i3 = (int) abjuVar.c;
        float f = abjuVar.f;
        float f2 = abjuVar.e;
        int iAy = a.ay(abjuVar.d);
        if (iAy == 0) {
            iAy = 1;
        }
        ujeVar.n = ukn.a(i, i2, i3, f / 8.0f, BitmapDescriptorFactory.HUE_RED, f2 / 1000.0f, uqw.E(iAy, abjuVar.g), false);
        return new ujf(ujeVar);
    }

    private final float h(ujf ujfVar) {
        if (!ujfVar.p()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        uke ukeVar = ujfVar.s.c;
        return Color.alpha(ukeVar.b) != 0 ? ukeVar.d * this.b : BitmapDescriptorFactory.HUE_RED;
    }

    public final uwi b(abjh abjhVar, ueu ueuVar) {
        abju abjuVar = abjhVar.b;
        if (abjuVar == null) {
            abjuVar = abju.a;
        }
        String str = abjuVar.b;
        ujf ujfVarA = a(abjhVar);
        float f = abjuVar.c * ueuVar.e;
        float f2 = ueuVar.c;
        int i = ueuVar.d;
        return c(str, ujfVarA, dlz.i(f, f2, 32.0f) * this.b);
    }

    @ResultIgnorabilityUnspecified
    public final uwi c(String str, ujf ujfVar, float f) {
        float f2;
        int i;
        int i2;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Canvas canvas;
        Paint paint;
        float f4;
        float f5;
        Canvas canvas2;
        Paint paint2;
        float f6;
        int iD = uqw.D(ujfVar);
        int iC = uqw.C(ujfVar);
        float fA = uqw.A(ujfVar);
        float fH = h(ujfVar);
        if (ujfVar.p()) {
            ukl uklVar = ujfVar.s;
            i = uklVar.b;
            i2 = uklVar.c.b;
            float f7 = uklVar.h;
            float f8 = this.b;
            f3 = f7 * f8;
            f2 = uklVar.i * f8;
            if (Color.alpha(i2) != 0) {
                i |= -16777216;
            }
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
            i = 0;
            i2 = 0;
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        Float fValueOf = Float.valueOf(f);
        ukn uknVar = ujfVar.r;
        boolean z = false;
        int iHash = Objects.hash(str, fValueOf, uknVar, ujfVar.s);
        uwg uwgVar = this.d;
        uwi uwiVarG = uwgVar.g(iHash);
        if (uwiVarG != null) {
            return uwiVarG;
        }
        if (iC == 0) {
            if (i != 0) {
                iC = 0;
            } else {
                fA = 0.0f;
                iC = 0;
                i = 0;
            }
        }
        float f9 = this.b;
        float[] fArrG = g(str, ujfVar, f);
        float f10 = fA;
        int iCeil = (int) Math.ceil(fArrG[0]);
        int iCeil2 = (int) Math.ceil(fArrG[1]);
        if (iCeil <= 0 || iCeil2 <= 0) {
            return null;
        }
        uwf uwfVarJ = uwgVar.j(iHash, iCeil, iCeil2);
        int i9 = uwfVarJ.a;
        if (uwfVarJ.b) {
            i8 = iCeil + 2;
            i3 = i9;
            i4 = iCeil2 + 2;
            i5 = iCeil2;
            i7 = 0;
            i6 = 1;
        } else {
            i3 = i9;
            i4 = iCeil2;
            i5 = i4;
            i6 = 0;
            i7 = 1;
            i8 = iCeil;
        }
        float f11 = f2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap);
        d(uknVar);
        Paint paint3 = this.a;
        paint3.setTextSize(f);
        Paint paint4 = this.c;
        paint4.setTextSize(f);
        e(uknVar);
        if (i != 0) {
            float f12 = i6;
            float f13 = i6 + iCeil;
            float f14 = i6 + i5;
            if (i2 != 0) {
                paint3.setColor(i2);
                f4 = f13;
                f5 = f14;
                canvas2 = canvas3;
                f6 = f12;
                canvas2.drawRect(f6, f12, f4, f5, paint3);
                paint2 = paint3;
            } else {
                f4 = f13;
                f5 = f14;
                canvas2 = canvas3;
                paint2 = paint3;
                f6 = f12;
            }
            paint2.setColor(i);
            float f15 = f6 + fH;
            Paint paint5 = paint2;
            canvas2.drawRect(f15, f15, f4 - fH, f5 - fH, paint5);
            canvas = canvas2;
            paint = paint5;
        } else {
            canvas = canvas3;
            paint = paint3;
        }
        float f16 = f10 * f9;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint4.setColor(iC);
        paint4.setStrokeWidth(f16);
        paint.setColor(iD);
        if (iC != 0 && f16 > BitmapDescriptorFactory.HUE_RED) {
            z = true;
        }
        float f17 = f16 / 2.0f;
        float fCeil = ((int) Math.ceil(f17 + fH + f3)) + i6;
        float fCeil2 = ((int) Math.ceil(Math.max(-fontMetrics.top, (-fontMetrics.ascent) + f11) + f17 + fH)) + i6;
        if (z) {
            canvas.drawText(str, fCeil, fCeil2, paint4);
        }
        if (iD != 0) {
            canvas.drawText(str, fCeil, fCeil2, paint);
        }
        return uwgVar.f(bitmapCreateBitmap, iHash, i3, i7, i6, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(ukn uknVar) {
        int i;
        Typeface typefaceDefaultFromStyle = null;
        if (uknVar != null) {
            int i2 = uknVar.h;
            boolean zX = uqw.x(1, i2);
            i = zX;
            if (uqw.x(2, i2)) {
                i = (zX ? 1 : 0) | 2;
            }
            if (uqw.x(16, i2)) {
                typefaceDefaultFromStyle = Typeface.create("sans-serif-light", i == true ? 1 : 0);
            } else if (uqw.x(8, i2)) {
                try {
                    typefaceDefaultFromStyle = Typeface.create("sans-serif-medium", i == true ? 1 : 0);
                } catch (Exception unused) {
                }
            }
        } else {
            i = 0;
        }
        if (typefaceDefaultFromStyle == null) {
            typefaceDefaultFromStyle = Typeface.defaultFromStyle(i);
        }
        this.a.setTypeface(typefaceDefaultFromStyle);
        this.c.setTypeface(typefaceDefaultFromStyle);
    }

    public final void e(ukn uknVar) {
        if (uknVar != null) {
            Paint paint = this.a;
            float f = uknVar.g;
            paint.setLetterSpacing(f);
            this.c.setLetterSpacing(f);
        }
    }

    public final float[] f(String str, ujf ujfVar, float f) {
        int length = str.length();
        int i = length + 1;
        ukn uknVar = ujfVar.r;
        float[] fArr = new float[i];
        d(uknVar);
        Paint paint = this.a;
        paint.setTextSize(f);
        e(uknVar);
        paint.getTextWidths(str, fArr);
        float fCeil = (int) Math.ceil((uqw.A(ujfVar) * this.b) / 2.0f);
        float f2 = fCeil;
        int i2 = 0;
        while (i2 < i) {
            float f3 = fArr[i2] + f2;
            fArr[i2] = f2;
            i2++;
            f2 = f3;
        }
        fArr[0] = fArr[0] - fCeil;
        float f4 = fArr[length] + fCeil;
        fArr[length] = f4;
        fArr[length] = f4 * this.e;
        return fArr;
    }

    public final float[] g(String str, ujf ujfVar, float f) {
        float f2;
        float f3;
        float f4;
        ukn uknVar = ujfVar.r;
        d(uknVar);
        Paint paint = this.a;
        paint.setTextSize(f);
        e(uknVar);
        float fMeasureText = paint.measureText(str);
        float fA = uqw.A(ujfVar);
        float f5 = ujfVar.q() ? uknVar.f : 1.0f;
        float fH = h(ujfVar);
        boolean zP = ujfVar.p();
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (zP) {
            ukl uklVar = ujfVar.s;
            float f7 = uklVar.h;
            float f8 = this.b;
            f3 = f7 * f8;
            f2 = uklVar.i * f8;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fCeil = (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        float f9 = fontMetrics.ascent - fontMetrics.top;
        float f10 = fontMetrics.bottom - fontMetrics.descent;
        float f11 = f5 - 1.0f;
        if (fA > BitmapDescriptorFactory.HUE_RED && fMeasureText > BitmapDescriptorFactory.HUE_RED) {
            fMeasureText += r5 + r5;
            float fCeil2 = (int) Math.ceil((fA * this.b) / 2.0f);
            f9 += fCeil2;
            f10 += fCeil2;
        }
        float f12 = this.e;
        float f13 = (f11 * fCeil) / 2.0f;
        float fMax = fCeil + f9 + f10 + Math.max(BitmapDescriptorFactory.HUE_RED, f2 - (fontMetrics.ascent - fontMetrics.top)) + Math.max(BitmapDescriptorFactory.HUE_RED, f2 - (fontMetrics.bottom - fontMetrics.descent));
        float f14 = (fMeasureText * f12) + f3 + f3;
        if (fH > BitmapDescriptorFactory.HUE_RED) {
            float f15 = fH + fH;
            f14 += f15;
            fMax += f15;
            f4 = 0.0f;
        } else {
            f6 = f9 - f13;
            f4 = f10 - f13;
        }
        return new float[]{f14, fMax, f6, f4};
    }
}
