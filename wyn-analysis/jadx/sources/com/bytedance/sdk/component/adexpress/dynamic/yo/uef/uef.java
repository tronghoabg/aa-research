package com.bytedance.sdk.component.adexpress.dynamic.yo.uef;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class uef implements View.OnTouchListener {
    private static int yo = 10;
    private int lw;
    private com.bytedance.sdk.component.adexpress.dynamic.yo.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24888oa;
    private float uef;
    private RectF ivm = new RectF();
    private long xs = 0;
    private final int bcc = 200;
    private final int cz = 3;
    private SoftReference<ViewGroup> zjm = new SoftReference<>(null);

    public uef(com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar, int i5, final ViewGroup viewGroup) {
        this.lw = yo;
        this.moa = bccVar;
        if (i5 > 0) {
            this.lw = i5;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.uef.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.zjm = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ivm = uef(this.zjm.get());
            this.uef = motionEvent.getRawX();
            this.f24888oa = motionEvent.getRawY();
            this.xs = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.ivm;
            if (rectF != null && !rectF.contains(this.uef, this.f24888oa)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.uef);
            float fAbs2 = Math.abs(rawY - this.f24888oa);
            int i5 = this.lw;
            if (fAbs >= i5 && fAbs2 >= i5) {
                com.bytedance.sdk.component.adexpress.dynamic.yo.bcc bccVar2 = this.moa;
                if (bccVar2 != null) {
                    bccVar2.uef();
                }
            } else if ((System.currentTimeMillis() - this.xs < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (bccVar = this.moa) != null) {
                bccVar.uef();
            }
        }
        return true;
    }

    private RectF uef(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
