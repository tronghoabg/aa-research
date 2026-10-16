package com.bytedance.adsdk.ugeno.core.oa;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class uef {
    public String uef = "GesThrough_";

    /* renamed from: oa, reason: collision with root package name */
    private List<MotionEvent> f24687oa = new ArrayList();
    private Set<String> yo = DesugarCollections.synchronizedSet(new HashSet());

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, MotionEvent motionEvent) {
        if (yoVar == null || motionEvent == null || this.f24687oa == null) {
            return;
        }
        uef(yoVar.dj(), yoVar.lz(), motionEvent);
    }

    public void uef(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.f24687oa == null) {
            return;
        }
        this.uef = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i10 = iArr[1];
        if (motionEvent.getAction() == 0) {
            uef();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i5, i10);
        this.f24687oa.add(motionEventObtain);
    }

    public boolean uef(MotionEvent motionEvent) {
        if (motionEvent == null || this.yo == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.yo.contains(motionEvent.getDownTime() + Constants.USER_ID_SEPARATOR + pointerId);
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        if (!this.f24687oa.isEmpty() && this.yo != null) {
            if (yoVar == null || yoVar.dj() == null || yoVar.dj().getRootView() == null) {
                return;
            }
            uef(yoVar.dj());
            return;
        }
        Log.d(this.uef, "motionEvents is empty or mockUniqueId is null");
    }

    public void uef(View view) {
        if (!this.f24687oa.isEmpty() && this.yo != null) {
            if (view == null || view.getRootView() == null) {
                return;
            }
            final View rootView = view.getRootView();
            Log.d(this.uef, "Re-dispatch motionEvents.size(): " + this.f24687oa.size());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.oa.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    for (MotionEvent motionEvent : uef.this.f24687oa) {
                        if (motionEvent != null) {
                            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                            uef.this.yo.add(motionEvent.getDownTime() + Constants.USER_ID_SEPARATOR + pointerId);
                            rootView.dispatchTouchEvent(motionEvent);
                            motionEvent.recycle();
                        }
                    }
                    uef.this.uef();
                }
            }, 300L);
            return;
        }
        Log.d(this.uef, "motionEvents is empty or mockUniqueId is null");
    }

    public void uef() {
        Log.d(this.uef, "clear all recorded motionEvents");
        List<MotionEvent> list = this.f24687oa;
        if (list != null) {
            list.clear();
        }
    }
}
