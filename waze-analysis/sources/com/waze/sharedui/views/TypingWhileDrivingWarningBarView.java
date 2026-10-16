package com.waze.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class TypingWhileDrivingWarningBarView extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingWhileDrivingWarningBarView(Context context) {
        this(context, null, 0, 6, null);
        h.g.b.x.f(context, "context");
    }

    private final void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.typing_while_driving_warning_bar, (ViewGroup) this, true);
        com.waze.shared_infra.g.e.c(this);
    }

    public final void a() {
        removeAllViews();
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingWhileDrivingWarningBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingWhileDrivingWarningBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h.g.b.x.f(context, "context");
        b();
    }

    public /* synthetic */ TypingWhileDrivingWarningBarView(Context context, AttributeSet attributeSet, int i2, int i3, h.g.b.o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
