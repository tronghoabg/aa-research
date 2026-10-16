package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
abstract class uhg {
    public final uwm a;

    public uhg(uwm uwmVar) {
        this.a = uwmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static uwm f(aert aertVar, float f, int i, boolean z) {
        float f2;
        float f3;
        float f4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        float f5;
        float fCeil = (float) Math.ceil(uhj.a * f);
        int iC = uzg.c(i, 1);
        if (z) {
            iC += iC;
        }
        float f6 = fCeil * 1.3333334f;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int iC2 = uzg.c((int) f6, 8);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC2, iC, config);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(true != z ? 1.0f : 2.0f);
        paint.setAntiAlias(true);
        float width = bitmapCreateBitmap.getWidth();
        aety it = aertVar.p().iterator();
        while (it.hasNext()) {
            aers aersVar = (aers) it.next();
            int iA = aersVar.a();
            uke[] ukeVarArrE = ((uhi) aersVar.getKey()).e();
            int iC3 = ((uhi) aersVar.getKey()).c();
            float f7 = iA;
            float height = canvas.getHeight();
            float f8 = iC3;
            int length = ukeVarArrE.length;
            int i7 = 0;
            while (i7 < length) {
                float f9 = iC2 / f6;
                float f10 = f6;
                uke ukeVar = ukeVarArrE[i7];
                float f11 = ukeVar.h;
                float f12 = ukeVar.d;
                int i8 = ukeVar.b;
                int[] iArr2 = ukeVar.e;
                paint.setColor(i8);
                float f13 = (width * 0.5f) - (f11 * f9);
                float f14 = f12 * f9 * 0.5f;
                if (iArr2.length == 0) {
                    float f15 = height;
                    float f16 = f13 + f14;
                    float f17 = f13 - f14;
                    if (iC3 == 1) {
                        float f18 = f7 + f7 + 1.0f;
                        f3 = f8;
                        f2 = f15;
                        f5 = f7;
                        i6 = iC3;
                        canvas.drawLine(f17, f18, f16, f18, paint);
                    } else {
                        f2 = f15;
                        i6 = iC3;
                        f5 = f7;
                        f3 = f8;
                        canvas.drawRect(f17, BitmapDescriptorFactory.HUE_RED, f16, canvas.getHeight(), paint);
                    }
                    i3 = i6;
                    f4 = f5;
                    i2 = iC2;
                } else {
                    float f19 = f7;
                    f2 = height;
                    f3 = f8;
                    float f20 = f19;
                    boolean z2 = true;
                    int i9 = 0;
                    while (true) {
                        f4 = f19;
                        i2 = iC2;
                        if (i9 >= iC3) {
                            break;
                        }
                        int i10 = 0;
                        while (true) {
                            int length2 = iArr2.length;
                            iArr = iArr2;
                            if (i10 <= (length2 & 1)) {
                                boolean z3 = z2;
                                float f21 = f20;
                                int i11 = i9;
                                int i12 = 0;
                                while (i12 < length2) {
                                    boolean z4 = z3;
                                    int i13 = iArr[i12];
                                    int i14 = i10;
                                    float f22 = f21 + ((i13 / 16.0f) * (f2 / f3) * 16.0f);
                                    if (z4) {
                                        i5 = i12;
                                        i4 = iC3;
                                        canvas.drawRect(f13 - f14, f21, f13 + f14, f22, paint);
                                    } else {
                                        i4 = iC3;
                                        i5 = i12;
                                    }
                                    i11 += i13;
                                    i12 = i5 + 1;
                                    z3 = !z4;
                                    f21 = f22;
                                    i10 = i14;
                                    iC3 = i4;
                                }
                                boolean z5 = z3;
                                i10++;
                                f20 = f21;
                                iArr2 = iArr;
                                i9 = i11;
                                z2 = z5;
                            }
                        }
                        f19 = f4;
                        iC2 = i2;
                        iArr2 = iArr;
                    }
                    i3 = iC3;
                }
                i7++;
                f7 = f4;
                height = f2;
                f6 = f10;
                f8 = f3;
                iC2 = i2;
                iC3 = i3;
            }
        }
        return new uwm(true != z ? "dashed_line_group" : "solid_line_group", new uuz(bitmapCreateBitmap, true), 3, 4);
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public abstract float c();

    public abstract float d(uhi uhiVar);
}
