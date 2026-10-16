package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.moa.cq;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class lw extends yo {

    /* renamed from: ab, reason: collision with root package name */
    private AtomicBoolean f24740ab;
    private int bs;
    private int cq;
    private float dj;
    private AtomicInteger dz;
    private cq oib;
    private String sy;
    private int wk;
    private float wrv;

    public lw(Context context) {
        super(context);
        this.cq = 0;
        this.dz = new AtomicInteger(f.API_PRIORITY_OTHER);
        this.wk = f.API_PRIORITY_OTHER;
        this.f24740ab = new AtomicBoolean(true);
        this.bs = 0;
        this.sy = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, Object> map = this.lw;
        if (map != null) {
            Object obj3 = map.get("direction");
            String strValueOf = "all";
            if (obj3 != null && !TextUtils.isEmpty(String.valueOf(obj3))) {
                strValueOf = String.valueOf(obj3);
            }
            this.sy = strValueOf;
            Object obj4 = this.lw.get("distance");
            if (obj4 == null) {
                this.cq = 0;
            } else {
                this.cq = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj4), 0);
            }
            if (this.dz.get() == Integer.MAX_VALUE && (obj2 = this.lw.get("frequency")) != null) {
                this.dz.set(com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj2), f.API_PRIORITY_OTHER));
            }
            if (this.wk == Integer.MAX_VALUE && (obj = this.lw.get("effectiveDuration")) != null) {
                this.wk = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), f.API_PRIORITY_OTHER);
            }
            Object obj5 = this.lw.get("inView");
            if (obj5 != null) {
                this.bs = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj5), 0);
            }
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.dz + ", mEffectiveDuration: " + this.wk + ", inEffectiveDuation: " + this.f24740ab.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        uef();
        cq cqVar = this.oib;
        return cqVar != null ? cqVar.uef(this.f24741oa, motionEvent, this.uef, this, this.sy, this.cq, this.dz, this.bs, this.f24740ab.get()) : uef(this.f24741oa, motionEvent);
    }

    private void uef() {
        if (this.wk == Integer.MAX_VALUE || this.f24741oa == null || System.currentTimeMillis() - this.f24741oa.rt() < this.wk) {
            return;
        }
        this.f24740ab.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean uef(com.bytedance.adsdk.ugeno.oa.yo r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            int r0 = r14.getAction()
            r1 = 1
            if (r0 == 0) goto Lbc
            r2 = 3
            if (r0 == r1) goto Le
            if (r0 == r2) goto Le
            goto Lc8
        Le:
            float r0 = r14.getX()
            float r14 = r14.getY()
            int r3 = r12.cq
            java.lang.String r4 = "Slide event, check limit"
            java.lang.String r5 = "GesThrough_UGSlideEvent"
            if (r3 != 0) goto L2a
            com.bytedance.adsdk.ugeno.moa.dj r3 = r12.uef
            if (r3 == 0) goto L2a
            android.util.Log.d(r5, r4)
            boolean r13 = r12.uef(r13, r0, r14)
            return r13
        L2a:
            android.content.Context r3 = r12.zjm
            float r6 = r12.dj
            float r6 = r0 - r6
            int r3 = com.bytedance.adsdk.ugeno.xs.bcc.oa(r3, r6)
            android.content.Context r6 = r12.zjm
            float r7 = r12.wrv
            float r7 = r14 - r7
            int r6 = com.bytedance.adsdk.ugeno.xs.bcc.oa(r6, r7)
            java.lang.String r7 = r12.sy
            int r8 = r7.hashCode()
            r9 = 0
            r10 = 2
            switch(r8) {
                case 3739: goto L72;
                case 96673: goto L68;
                case 3089570: goto L5e;
                case 3317767: goto L54;
                case 108511772: goto L4a;
                default: goto L49;
            }
        L49:
            goto L7c
        L4a:
            java.lang.String r8 = "right"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r2
            goto L7d
        L54:
            java.lang.String r8 = "left"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r10
            goto L7d
        L5e:
            java.lang.String r8 = "down"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r1
            goto L7d
        L68:
            java.lang.String r8 = "all"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = 4
            goto L7d
        L72:
            java.lang.String r8 = "up"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7c
            r7 = r9
            goto L7d
        L7c:
            r7 = -1
        L7d:
            if (r7 == 0) goto La0
            if (r7 == r1) goto L9e
            if (r7 == r10) goto L9c
            if (r7 == r2) goto La1
            double r2 = (double) r3
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r7)
            double r10 = (double) r6
            double r6 = java.lang.Math.pow(r10, r7)
            double r6 = r6 + r2
            double r2 = java.lang.Math.sqrt(r6)
            double r2 = java.lang.Math.abs(r2)
            int r3 = (int) r2
            goto La1
        L9c:
            int r3 = -r3
            goto La1
        L9e:
            r3 = r6
            goto La1
        La0:
            int r3 = -r6
        La1:
            int r2 = r12.cq
            if (r3 < r2) goto Lb6
            android.util.Log.d(r5, r4)
            com.bytedance.adsdk.ugeno.moa.dj r2 = r12.uef
            if (r2 == 0) goto Lc8
            r1 = 0
            r12.dj = r1
            r12.wrv = r1
            boolean r13 = r12.uef(r13, r0, r14)
            return r13
        Lb6:
            java.lang.String r13 = "Non-slide event"
            android.util.Log.d(r5, r13)
            return r9
        Lbc:
            float r13 = r14.getX()
            r12.dj = r13
            float r13 = r14.getY()
            r12.wrv = r13
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.moa.moa.lw.uef(com.bytedance.adsdk.ugeno.oa.yo, android.view.MotionEvent):boolean");
    }

    private boolean uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, float f10, float f11) {
        if (this.dz.get() <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.f24740ab.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.bs == 1 && !uef(yoVar.dj(), f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.uef.uef(yoVar, this.ivm, this.yo.oa(), this.yo);
        if (this.dz.get() != Integer.MAX_VALUE) {
            this.dz.decrementAndGet();
        }
        return true;
    }

    private boolean uef(View view, float f10, float f11) {
        return f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < ((float) view.getWidth()) && f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < ((float) view.getHeight());
    }

    public void uef(cq cqVar) {
        this.oib = cqVar;
    }
}
