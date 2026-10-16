package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.Point;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aaak {
    private static final String e = "aaak";
    public static final aaak a = new aaak();
    public static final ThreadLocal b = new aaai();
    private static final ThreadLocal f = new aaai();
    public static final ThreadLocal c = new aaai();
    private static final ThreadLocal g = new aaaj();
    public static final ThreadLocal d = new aaai();

    private aaak() {
    }

    static void d(Canvas canvas, Path path, int i, float f2, int i2, Paint paint) {
        zkt.n(canvas, "canvas");
        zkt.n(paint, "paint");
        if (path.isEmpty() || f2 <= BitmapDescriptorFactory.HUE_RED || Color.alpha(i) == 0) {
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(null);
        e(paint, i2, f2);
        canvas.drawPath(path, paint);
    }

    static void e(Paint paint, int i, float f2) {
        zkt.n(paint, "paint");
        zkt.e(f2 > BitmapDescriptorFactory.HUE_RED, a.bG(f2, "strokeWidthPx <= 0: "));
        if (i == 1) {
            paint.setStrokeJoin(Paint.Join.BEVEL);
        } else if (i == 2) {
            paint.setStrokeJoin(Paint.Join.ROUND);
        } else {
            paint.setStrokeMiter(f2 * 0.5f);
            paint.setStrokeJoin(Paint.Join.MITER);
        }
    }

    public final void a(List list, aaao aaaoVar, List list2, Path path) {
        float fD = aaaoVar.d();
        int iCeil = (int) Math.ceil((aaaoVar.f - fD) / (fD + fD));
        for (int i = -iCeil; i <= iCeil; i++) {
            int i2 = 0;
            Point pointA = aaaoVar.a((LatLng) list.get(0));
            ArrayList<Point> arrayList = new ArrayList();
            float f2 = i * fD;
            path.moveTo(pointA.x + f2, pointA.y);
            arrayList.add(new Point((int) (pointA.x + f2), pointA.y));
            int i3 = 1;
            int i4 = 0;
            Point point = pointA;
            while (i3 < list.size()) {
                Point pointA2 = aaaoVar.a((LatLng) list.get(i3));
                if (pointA2.x - point.x > fD / 2.0f) {
                    i4--;
                } else {
                    if (pointA2.x - point.x < (-fD) / 2.0f) {
                        i4++;
                    }
                }
                float f3 = (i + i4) * fD;
                path.lineTo(pointA2.x + f3, pointA2.y);
                arrayList.add(new Point((int) (pointA2.x + f3), pointA2.y));
                i3++;
                point = pointA2;
            }
            if (pointA.x == point.x + (i4 * fD) && pointA.y == point.y) {
                path.close();
            }
            int size = arrayList.size();
            int[] iArr = new int[size + size];
            for (Point point2 : arrayList) {
                iArr[i2] = point2.x;
                iArr[i2 + 1] = point2.y;
                i2 += 2;
            }
            list2.add(new zzr(iArr));
        }
    }

    public final void b(Canvas canvas, Path path, PatternItem[] patternItemArr, int i, int i2, float f2) {
        int length;
        int i3;
        float f3;
        boolean z;
        float fFloatValue;
        int length2;
        Paint paint = (Paint) c.get();
        Path path2 = (Path) g.get();
        zkt.n(canvas, "canvas");
        zkt.n(paint, "paint");
        zkt.n(path2, "dotShapePath");
        int i4 = 5;
        int i5 = 1;
        if (!path.isEmpty() && (length2 = patternItemArr.length) != 0 && f2 > BitmapDescriptorFactory.HUE_RED && Color.alpha(i) != 0) {
            float f4 = 0.5f * f2;
            ArrayList arrayList = new ArrayList(length2);
            float fFloatValue2 = 0.0f;
            int i6 = 0;
            while (i6 < patternItemArr.length) {
                PatternItem patternItem = patternItemArr[i6];
                if (patternItem == null) {
                    String str = e;
                    if (zrn.e(str, i4)) {
                        Log.w(str, "Skipping null PatternItem");
                    }
                } else if (patternItem.getType() == 1) {
                    arrayList.add(Float.valueOf(-(fFloatValue2 + f4)));
                    fFloatValue2 += f2;
                } else {
                    Float length3 = patternItem.getLength();
                    zkt.m(length3);
                    fFloatValue2 += length3.floatValue();
                }
                i6++;
                i4 = 5;
            }
            if (!arrayList.isEmpty()) {
                paint.reset();
                paint.setAntiAlias(true);
                paint.setColor(i);
                paint.setStyle(Paint.Style.STROKE);
                path2.reset();
                path2.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, Path.Direction.CCW);
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    paint.setPathEffect(new PathDashPathEffect(path2, fFloatValue2, ((Float) arrayList.get(i7)).floatValue(), PathDashPathEffect.Style.TRANSLATE));
                    canvas.drawPath(path, paint);
                    i7++;
                    i5 = i5;
                }
            }
        }
        int i8 = i5;
        Paint paint2 = (Paint) f.get();
        zkt.n(canvas, "canvas");
        zkt.n(paint2, "paint");
        if (path.isEmpty() || f2 <= BitmapDescriptorFactory.HUE_RED || (length = patternItemArr.length) == 0 || Color.alpha(i) == 0) {
            return;
        }
        List arrayList2 = new ArrayList(length + 1);
        arrayList2.clear();
        int i9 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i9 < patternItemArr.length) {
            PatternItem patternItem2 = patternItemArr[i9];
            if (patternItem2 == null) {
                String str2 = e;
                if (zrn.e(str2, 5)) {
                    Log.w(str2, "Skipping null PatternItem");
                }
            } else {
                int type = patternItem2.getType();
                if (type == i8) {
                    fFloatValue = f2;
                } else {
                    Float length4 = patternItem2.getLength();
                    zkt.m(length4);
                    fFloatValue = length4.floatValue();
                }
                boolean z4 = type == 0;
                if (arrayList2.isEmpty()) {
                    arrayList2.add(Float.valueOf(fFloatValue));
                    z2 = z4;
                } else if (z3 == z4) {
                    int size2 = arrayList2.size() - 1;
                    arrayList2.set(size2, Float.valueOf(((Float) arrayList2.get(size2)).floatValue() + fFloatValue));
                } else {
                    arrayList2.add(Float.valueOf(fFloatValue));
                }
                z3 = z4;
            }
            i9++;
            i8 = 1;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1) {
            if (z2) {
                d(canvas, path, i, f2, i2, paint2);
                return;
            }
            return;
        }
        if (arrayList2.size() % 2 == 1) {
            float fFloatValue3 = ((Float) arrayList2.remove(arrayList2.size() - 1)).floatValue();
            i3 = 0;
            arrayList2.set(0, Float.valueOf(((Float) arrayList2.get(0)).floatValue() + fFloatValue3));
            f3 = fFloatValue3 + BitmapDescriptorFactory.HUE_RED;
        } else {
            i3 = 0;
            f3 = 0.0f;
        }
        if (z2) {
            z = true;
        } else {
            Float f5 = (Float) arrayList2.get(i3);
            float fFloatValue4 = f5.floatValue();
            arrayList2.add(f5);
            z = true;
            arrayList2 = arrayList2.subList(1, arrayList2.size());
            f3 -= fFloatValue4;
        }
        paint2.reset();
        paint2.setAntiAlias(z);
        paint2.setColor(i);
        paint2.setStrokeWidth(f2);
        paint2.setStyle(Paint.Style.STROKE);
        zkt.n(arrayList2, "List<Float>");
        int size3 = arrayList2.size();
        float[] fArr = new float[size3];
        for (int i10 = i3; i10 < size3; i10++) {
            fArr[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
        paint2.setPathEffect(new DashPathEffect(fArr, f3));
        e(paint2, i2, f2);
        canvas.drawPath(path, paint2);
    }

    public final void c(Canvas canvas, Path path, int i, float f2, int i2) {
        d(canvas, path, i, f2, i2, (Paint) b.get());
    }

    public final boolean f(float f2, float f3, List list) {
        zkt.n(list, "outlinesCanvasXY");
        int i = (int) f2;
        int iQ = zkt.q(15.0d);
        int i2 = i - iQ;
        int i3 = (int) f3;
        int i4 = i3 - iQ;
        int i5 = i + iQ;
        int i6 = i3 + iQ;
        zzp zzpVar = new zzp(new zzq[]{new zzq(i2, i4), new zzq(i5, i4), new zzq(i5, i6), new zzq(i2, i6)});
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzr zzrVar = (zzr) it.next();
            int iD = zzrVar.d();
            if (iD > 1) {
                zzq zzqVar = new zzq(0, 0);
                zzrVar.g(0, zzqVar);
                zzq zzqVar2 = new zzq(0, 0);
                for (int i7 = 1; i7 < iD; i7++) {
                    zzrVar.g(i7, zzqVar2);
                    if (!zzpVar.Y(zzqVar) && !zzpVar.Y(zzqVar2)) {
                        zzq[] zzqVarArr = zzpVar.a;
                        if (!zzq.f(zzqVar, zzqVar2, zzqVarArr[0], zzqVarArr[1]) && !zzq.f(zzqVar, zzqVar2, zzqVarArr[1], zzqVarArr[2]) && !zzq.f(zzqVar, zzqVar2, zzqVarArr[2], zzqVarArr[3]) && !zzq.f(zzqVar, zzqVar2, zzqVarArr[3], zzqVarArr[0])) {
                            zzqVar.c(zzqVar2);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
