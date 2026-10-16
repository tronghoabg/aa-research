package com.bytedance.adsdk.oa.ivm;

import N0.a;
import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.oa.yo.oa.dz;

/* loaded from: classes.dex */
public class lw {
    private static final PointF uef = new PointF();

    private static int oa(int i5, int i10) {
        int i11 = i5 / i10;
        return (((i5 ^ i10) >= 0) || i5 % i10 == 0) ? i11 : i11 - 1;
    }

    public static int uef(int i5, int i10, float f10) {
        return (int) ((f10 * (i10 - i5)) + i5);
    }

    public static boolean yo(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static PointF uef(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float oa(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void uef(dz dzVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFUef = dzVar.uef();
        path.moveTo(pointFUef.x, pointFUef.y);
        uef.set(pointFUef.x, pointFUef.y);
        int i5 = 0;
        while (i5 < dzVar.yo().size()) {
            com.bytedance.adsdk.oa.yo.uef uefVar = dzVar.yo().get(i5);
            PointF pointFUef2 = uefVar.uef();
            PointF pointFOa = uefVar.oa();
            PointF pointFYo = uefVar.yo();
            PointF pointF = uef;
            if (pointFUef2.equals(pointF) && pointFOa.equals(pointFYo)) {
                path.lineTo(pointFYo.x, pointFYo.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFUef2.x, pointFUef2.y, pointFOa.x, pointFOa.y, pointFYo.x, pointFYo.y);
            }
            pointF.set(pointFYo.x, pointFYo.y);
            i5++;
            path = path2;
        }
        Path path3 = path;
        if (dzVar.oa()) {
            path3.close();
        }
    }

    public static float uef(float f10, float f11, float f12) {
        return a.b(f11, f10, f12, f10);
    }

    public static int uef(float f10, float f11) {
        return uef((int) f10, (int) f11);
    }

    private static int uef(int i5, int i10) {
        return i5 - (i10 * oa(i5, i10));
    }

    public static int uef(int i5, int i10, int i11) {
        return Math.max(i10, Math.min(i11, i5));
    }
}
