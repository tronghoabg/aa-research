package com.bytedance.adsdk.oa.lw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class dhk {

    /* renamed from: oa, reason: collision with root package name */
    private static SparseArray<WeakReference<Interpolator>> f24565oa;
    private static final Interpolator uef = new LinearInterpolator();

    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.bytedance.adsdk.oa.xs.uef<T> oa(com.bytedance.adsdk.oa.xs r26, android.util.JsonReader r27, float r28, com.bytedance.adsdk.oa.lw.rl<T> r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.dhk.oa(com.bytedance.adsdk.oa.xs, android.util.JsonReader, float, com.bytedance.adsdk.oa.lw.rl):com.bytedance.adsdk.oa.xs.uef");
    }

    private static SparseArray<WeakReference<Interpolator>> uef() {
        if (f24565oa == null) {
            f24565oa = new SparseArray<>();
        }
        return f24565oa;
    }

    private static WeakReference<Interpolator> uef(int i5) {
        WeakReference<Interpolator> weakReference;
        synchronized (dhk.class) {
            weakReference = uef().get(i5);
        }
        return weakReference;
    }

    private static void uef(int i5, WeakReference<Interpolator> weakReference) {
        synchronized (dhk.class) {
            f24565oa.put(i5, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.oa.xs.uef<T> uef(JsonReader jsonReader, com.bytedance.adsdk.oa.xs xsVar, float f10, rl<T> rlVar, boolean z2, boolean z10) throws IOException {
        if (z2 && z10) {
            return oa(xsVar, jsonReader, f10, rlVar);
        }
        if (z2) {
            return uef(xsVar, jsonReader, f10, rlVar);
        }
        return uef(jsonReader, f10, rlVar);
    }

    private static <T> com.bytedance.adsdk.oa.xs.uef<T> uef(com.bytedance.adsdk.oa.xs xsVar, JsonReader jsonReader, float f10, rl<T> rlVar) throws IOException {
        Interpolator interpolatorUef;
        jsonReader.beginObject();
        PointF pointFOa = null;
        T tOa = null;
        T tOa2 = null;
        PointF pointFOa2 = null;
        PointF pointFOa3 = null;
        float fNextDouble = 0.0f;
        boolean z2 = false;
        PointF pointFOa4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tOa = rlVar.oa(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case "i":
                    pointFOa4 = oib.oa(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFOa = oib.oa(jsonReader, 1.0f);
                    break;
                case "s":
                    tOa2 = rlVar.oa(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFOa3 = oib.oa(jsonReader, f10);
                    break;
                case "to":
                    pointFOa2 = oib.oa(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z2) {
            if (pointFOa != null && pointFOa4 != null) {
                interpolatorUef = uef(pointFOa, pointFOa4);
            }
            com.bytedance.adsdk.oa.xs.uef<T> uefVar = new com.bytedance.adsdk.oa.xs.uef<>(xsVar, tOa2, tOa, interpolatorUef, fNextDouble, null);
            uefVar.bcc = pointFOa2;
            uefVar.cz = pointFOa3;
            return uefVar;
        }
        tOa = tOa2;
        interpolatorUef = uef;
        com.bytedance.adsdk.oa.xs.uef<T> uefVar2 = new com.bytedance.adsdk.oa.xs.uef<>(xsVar, tOa2, tOa, interpolatorUef, fNextDouble, null);
        uefVar2.bcc = pointFOa2;
        uefVar2.cz = pointFOa3;
        return uefVar2;
    }

    private static Interpolator uef(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.oa.ivm.lw.oa(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.oa.ivm.lw.oa(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.oa.ivm.lw.oa(pointF2.x, -1.0f, 1.0f);
        float fOa = com.bytedance.adsdk.oa.ivm.lw.oa(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOa;
        int iUef = com.bytedance.adsdk.oa.ivm.ivm.uef(pointF.x, pointF.y, pointF2.x, fOa);
        WeakReference<Interpolator> weakReferenceUef = com.bytedance.adsdk.oa.lw.uef() ? null : uef(iUef);
        Interpolator interpolator = weakReferenceUef != null ? weakReferenceUef.get() : null;
        if (weakReferenceUef != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.oa.bs.uef(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e7) {
            if ("The Path cannot loop back on itself.".equals(e7.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.oa.bs.uef(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.oa.lw.uef()) {
            try {
                uef(iUef, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.oa.xs.uef<T> uef(JsonReader jsonReader, float f10, rl<T> rlVar) throws IOException {
        return new com.bytedance.adsdk.oa.xs.uef<>(rlVar.oa(jsonReader, f10));
    }
}
