package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aaam implements zxk, aaap {
    List a;
    final List b;
    private final zxl c;
    private final aaah d;
    private final aaak e;
    private final List f;

    public aaam(zxl zxlVar, aaah aaahVar) {
        aaak aaakVar = aaak.a;
        this.c = zxlVar;
        this.d = aaahVar;
        aaahVar.j(this);
        this.a = new ArrayList();
        this.f = new ArrayList();
        this.b = new ArrayList();
        zkt.n(aaakVar, "polyUtils");
        this.e = aaakVar;
    }

    private final void g(Canvas canvas, Path path, PatternItem[] patternItemArr, int i, aacq aacqVar) {
        aaak aaakVar = this.e;
        if (patternItemArr == null) {
            aaakVar.c(canvas, path, aacqVar.b(), aacqVar.a(), i);
        } else {
            aaakVar.b(canvas, path, patternItemArr, aacqVar.b(), i, aacqVar.a());
        }
    }

    @Override // defpackage.zxk
    public final void a(int i) {
        this.d.m();
    }

    @Override // defpackage.aaap
    public final float b() {
        return this.c.a();
    }

    @Override // defpackage.zxk
    public final void c() {
        this.d.n(this);
    }

    final void d(Canvas canvas, boolean z) {
        zzq zzqVarE;
        zzq zzqVarE2;
        Canvas canvas2 = canvas;
        if (this.a.isEmpty()) {
            return;
        }
        for (zzr zzrVar : this.a) {
            zxl zxlVar = this.c;
            zyh zyhVarL = z ? zxlVar.l() : zxlVar.k();
            zxl zxlVar2 = this.c;
            int iB = zyhVarL.b();
            float fA = zxlVar2.i().a();
            boolean z2 = false;
            if (iB == 3) {
                Object obj = zyhVarL.d;
                zkt.m(obj);
                Float fC = zyhVarL.c();
                zkt.m(fC);
                float fFloatValue = fC.floatValue();
                Paint paint = (Paint) aaak.d.get();
                zkt.n(canvas, "canvas");
                zkt.e(fFloatValue > BitmapDescriptorFactory.HUE_RED, a.bG(fFloatValue, "bitmapRefWidthPx="));
                zkt.n(zzrVar, "line");
                zkt.n(paint, "paint");
                if (fA > BitmapDescriptorFactory.HUE_RED && !zzrVar.i() && zzrVar.d() != 0) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                        if (z) {
                            zzqVarE = zzrVar.f(0);
                            z2 = true;
                        } else {
                            zzqVarE = zzrVar.e();
                        }
                        int i = zzqVarE.a;
                        int i2 = zzqVarE.b;
                        float f = fA / fFloatValue;
                        float degrees = ((float) Math.toDegrees(z2 ? zzrVar.a() : zzrVar.b())) + (z2 ? -90.0f : 90.0f);
                        paint.reset();
                        paint.setAntiAlias(true);
                        float f2 = i;
                        float f3 = i2;
                        canvas.rotate(degrees, f2, f3);
                        canvas.scale(f, f, f2, f3);
                        canvas.drawBitmap(bitmap, f2 - Math.round(bitmap.getWidth() * 0.5d), f3 - Math.round(bitmap.getHeight() * 0.5d), paint);
                        float f4 = 1.0f / f;
                        canvas.scale(f4, f4, f2, f3);
                        canvas.rotate(-degrees, f2, f3);
                    }
                }
            } else {
                int iB2 = this.b.isEmpty() ? zxlVar2.i().b() : ((aacq) zxlVar2.c().get(z ? 0 : zxlVar2.c().size() - 1)).b();
                Paint paint2 = (Paint) aaak.c.get();
                zkt.n(canvas, "canvas");
                zkt.n(zzrVar, "line");
                zkt.n(paint2, "paint");
                zkt.e(iB != 3, a.bp(iB, "Not a standard cap type: "));
                if (iB != 0 && fA > BitmapDescriptorFactory.HUE_RED && !zzrVar.i() && zzrVar.d() != 0 && Color.alpha(iB2) != 0) {
                    if (z) {
                        zzqVarE2 = zzrVar.f(0);
                        z2 = true;
                    } else {
                        zzqVarE2 = zzrVar.e();
                    }
                    int i3 = zzqVarE2.a;
                    int i4 = zzqVarE2.b;
                    float fA2 = z2 ? zzrVar.a() : zzrVar.b();
                    paint2.reset();
                    paint2.setAntiAlias(true);
                    paint2.setPathEffect(null);
                    paint2.setColor(iB2);
                    float f5 = 0.5f * fA;
                    if (iB == 1) {
                        float f6 = i4;
                        float f7 = fA2;
                        float f8 = i3;
                        float f9 = z2 ? 3.1415927f + f7 : f7;
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeWidth(fA);
                        double d = f9;
                        canvas2.drawLine(f8, f6, (((float) Math.cos(d)) * f5) + f8, (((float) Math.sin(d)) * f5) + f6, paint2);
                    } else {
                        float f10 = fA2;
                        if (iB == 2) {
                            float f11 = i4;
                            float f12 = i3;
                            float f13 = z2 ? 1.5707964f : -1.5707964f;
                            paint2.setStyle(Paint.Style.FILL);
                            canvas2 = canvas;
                            canvas2.drawArc(new RectF(f12 - f5, f11 - f5, f12 + f5, f11 + f5), (float) Math.toDegrees(f13 + f10), 180.0f, true, paint2);
                        }
                    }
                }
                canvas2 = canvas;
            }
        }
    }

    @Override // defpackage.aaap
    public final void e(Canvas canvas, aaao aaaoVar) {
        Canvas canvas2;
        zxl zxlVar = this.c;
        aacq aacqVarI = zxlVar.i();
        if (aacqVarI.e()) {
            Path path = new Path();
            this.a = new ArrayList();
            List list = this.f;
            List list2 = this.b;
            zxlVar.d(list, list2);
            aaak aaakVar = this.e;
            aaakVar.a(list, aaaoVar, this.a, path);
            if (list2.isEmpty()) {
                canvas2 = canvas;
                g(canvas2, path, zxlVar.h(), zxlVar.b(), aacqVarI);
            } else {
                List listC = zxlVar.c();
                int i = 0;
                while (i < listC.size()) {
                    aacq aacqVar = (aacq) listC.get(i);
                    if (aacqVar.e()) {
                        Path path2 = new Path();
                        aaakVar.a(list.subList(i == 0 ? 0 : ((Integer) list2.get(i - 1)).intValue(), (i == listC.size() + (-1) ? list.size() - 1 : ((Integer) list2.get(i)).intValue()) + 1), aaaoVar, new ArrayList(), path2);
                        g(canvas, path2, zxlVar.h(), zxlVar.b(), aacqVar);
                    }
                    i++;
                }
                canvas2 = canvas;
            }
            d(canvas2, true);
            d(canvas2, false);
        }
    }

    @Override // defpackage.aaap
    public final boolean f(float f, float f2) {
        zxl zxlVar = this.c;
        if (!zxlVar.g() || !this.e.f(f, f2, this.a)) {
            return false;
        }
        zxlVar.f();
        return true;
    }
}
