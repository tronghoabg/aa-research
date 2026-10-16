package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.moa.dz;

/* loaded from: classes.dex */
public class cz extends yo {
    private boolean cq;
    private float dj;
    private dz dz;
    private float wrv;

    public cz(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        dz dzVar = this.dz;
        return dzVar != null ? dzVar.uef(this.f24741oa, motionEvent, this.uef, this) : uef(this.f24741oa, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean uef(com.bytedance.adsdk.ugeno.oa.yo r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r10.getAction()
            r1 = 1
            if (r0 == 0) goto L8b
            r2 = 1097859072(0x41700000, float:15.0)
            r3 = 0
            if (r0 == r1) goto L38
            r4 = 2
            if (r0 == r4) goto L17
            r4 = 3
            if (r0 == r4) goto L14
            goto L97
        L14:
            r8.cq = r3
            goto L38
        L17:
            float r9 = r10.getRawX()
            float r10 = r10.getRawY()
            float r0 = r8.dj
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L35
            float r9 = r8.wrv
            float r10 = r10 - r9
            float r9 = java.lang.Math.abs(r10)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 < 0) goto L97
        L35:
            r8.cq = r1
            goto L97
        L38:
            boolean r0 = r8.cq
            java.lang.String r4 = "Non-tap event"
            java.lang.String r5 = "GesThrough_UGTapEvent"
            r6 = 0
            if (r0 == 0) goto L4b
            r8.cq = r3
            r8.dj = r6
            r8.wrv = r6
            android.util.Log.d(r5, r4)
            return r3
        L4b:
            float r0 = r10.getRawX()
            float r10 = r10.getRawY()
            float r7 = r8.dj
            float r0 = r0 - r7
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L85
            float r0 = r8.wrv
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 < 0) goto L6a
            goto L85
        L6a:
            java.lang.String r10 = "Tap event, direct handling"
            android.util.Log.d(r5, r10)
            com.bytedance.adsdk.ugeno.moa.dj r10 = r8.uef
            if (r10 == 0) goto L97
            java.lang.String r0 = r8.ivm
            com.bytedance.adsdk.ugeno.moa.ivm r2 = r8.yo
            java.util.List r2 = r2.oa()
            com.bytedance.adsdk.ugeno.moa.ivm r3 = r8.yo
            r10.uef(r9, r0, r2, r3)
            r8.dj = r6
            r8.wrv = r6
            return r1
        L85:
            r8.cq = r3
            android.util.Log.d(r5, r4)
            return r3
        L8b:
            float r9 = r10.getRawX()
            r8.dj = r9
            float r9 = r10.getRawY()
            r8.wrv = r9
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.moa.moa.cz.uef(com.bytedance.adsdk.ugeno.oa.yo, android.view.MotionEvent):boolean");
    }

    public void uef(dz dzVar) {
        this.dz = dzVar;
    }
}
