package com.waze.ifs.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.waze.settings.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class SpringyNestedScrollView extends NestedScrollView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24478a;

    /* renamed from: b, reason: collision with root package name */
    public av f24479b;

    public SpringyNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24478a = true;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingChild2
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        av avVar = this.f24479b;
        if (avVar != null) {
            avVar.c(i3, i5, i6);
        }
        return super.dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24478a && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingChild2
    public final void stopNestedScroll(int i2) {
        super.stopNestedScroll(i2);
        av avVar = this.f24479b;
        if (avVar != null) {
            avVar.a();
        }
    }
}
