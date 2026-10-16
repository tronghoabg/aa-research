package com.google.android.material.c;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f6330a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6331b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6332c;

    public a(Dialog dialog, Rect rect) {
        this.f6330a = dialog;
        this.f6331b = rect.left;
        this.f6332c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f6331b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f6332c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f6330a.onTouchEvent(motionEventObtain);
    }
}
