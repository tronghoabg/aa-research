package com.bytedance.adsdk.ugeno.core.oa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;
import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lw {

    /* renamed from: ab, reason: collision with root package name */
    private uef f24684ab;
    private boolean cq;
    private cq cz;
    private String dj;
    private boolean dz;
    private boolean wk;
    private Context wrv;
    private cq zjm;
    private int uef = 0;

    /* renamed from: oa, reason: collision with root package name */
    private int f24685oa = f.API_PRIORITY_OTHER;
    private int yo = f.API_PRIORITY_OTHER;
    private AtomicBoolean moa = new AtomicBoolean(true);
    private float lw = Float.MIN_VALUE;
    private float ivm = Float.MIN_VALUE;
    private Map<Integer, Float> xs = new HashMap();
    private Map<Integer, Float> bcc = new HashMap();

    public lw(Context context, cq cqVar, boolean z2, boolean z10, boolean z11) {
        this.wrv = context;
        this.cz = cqVar;
        this.cq = z2;
        this.dz = z10;
        this.wk = z11;
        yo();
    }

    private void yo() {
        if (this.dz) {
            this.f24684ab = new uef();
        }
        cq cqVar = this.cz;
        if (cqVar == null) {
            return;
        }
        this.uef = cqVar.yo().optInt("slideThreshold");
        this.dj = this.cz.yo().optString("slideDirection");
        this.f24685oa = this.cz.yo().optInt("frequency", f.API_PRIORITY_OTHER);
        this.yo = this.cz.yo().optInt("effectiveDuration", f.API_PRIORITY_OTHER);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.f24685oa + ", mEffectiveDuration: " + this.yo + ", inEffectiveDuation: " + this.moa.get());
    }

    public void oa() {
        this.lw = Float.MIN_VALUE;
        this.ivm = Float.MIN_VALUE;
        this.xs.clear();
        this.bcc.clear();
    }

    public void uef() {
        if (this.yo == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.oa.lw.1
            @Override // java.lang.Runnable
            public void run() {
                lw.this.moa.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.yo);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean oa(com.bytedance.adsdk.ugeno.core.wk r11, com.bytedance.adsdk.ugeno.oa.yo r12, android.view.MotionEvent r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.oa.lw.oa(com.bytedance.adsdk.ugeno.core.wk, com.bytedance.adsdk.ugeno.oa.yo, android.view.MotionEvent, boolean):boolean");
    }

    private void uef(int i5) {
        this.xs.remove(Integer.valueOf(i5));
        this.bcc.remove(Integer.valueOf(i5));
    }

    public boolean uef(wk wkVar, com.bytedance.adsdk.ugeno.oa.yo yoVar, MotionEvent motionEvent, boolean z2) {
        uef uefVar = this.f24684ab;
        if (uefVar != null) {
            if (uefVar.uef(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.f24684ab.uef(yoVar, motionEvent);
        }
        if (this.wk) {
            return oa(wkVar, yoVar, motionEvent, z2);
        }
        return yo(wkVar, yoVar, motionEvent, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean yo(com.bytedance.adsdk.ugeno.core.wk r8, com.bytedance.adsdk.ugeno.oa.yo r9, android.view.MotionEvent r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.oa.lw.yo(com.bytedance.adsdk.ugeno.core.wk, com.bytedance.adsdk.ugeno.oa.yo, android.view.MotionEvent, boolean):boolean");
    }

    private void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        if (this.f24684ab != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f24684ab.uef(yoVar);
        }
    }

    public lw(Context context, cq cqVar, cq cqVar2, boolean z2, boolean z10, boolean z11) {
        this.wrv = context;
        this.cz = cqVar;
        this.zjm = cqVar2;
        this.cq = z2;
        this.dz = z10;
        this.wk = z11;
        yo();
    }

    private void uef(wk wkVar, cq cqVar, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        if (this.f24685oa <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            uef(yoVar);
        } else {
            if (!this.moa.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                uef(yoVar);
                return;
            }
            wkVar.uef(cqVar, yoVar, yoVar);
            int i5 = this.f24685oa;
            if (i5 != Integer.MAX_VALUE) {
                this.f24685oa = i5 - 1;
            }
        }
    }
}
