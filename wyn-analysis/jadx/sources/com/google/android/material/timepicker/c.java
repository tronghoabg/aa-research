package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.wynauto.wyn.R;
import k1.C3115b;
import l1.C3373c;
import l1.C3375e;

/* loaded from: classes4.dex */
public final class c extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27118d;

    public c(ClockFaceView clockFaceView) {
        this.f27118d = clockFaceView;
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f27118d.f27101z.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c3375e.b(C3373c.f39848e);
    }

    @Override // k1.C3115b
    public final boolean g(View view, int i5, Bundle bundle) {
        if (i5 != 16) {
            return super.g(view, i5, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f27118d;
        view.getHitRect(clockFaceView.f27098w);
        float fCenterX = clockFaceView.f27098w.centerX();
        float fCenterY = clockFaceView.f27098w.centerY();
        clockFaceView.f27097v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f27097v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
