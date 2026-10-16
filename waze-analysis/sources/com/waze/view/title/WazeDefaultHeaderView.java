package com.waze.view.title;

import android.content.Context;
import android.util.AttributeSet;
import com.waze.design_components.header_view.WazeHeaderView;
import com.waze.uid.activities.c;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeDefaultHeaderView extends WazeHeaderView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeDefaultHeaderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        c(new c(context, 12));
        f(new c(context, 13));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeDefaultHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeDefaultHeaderView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeDefaultHeaderView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
