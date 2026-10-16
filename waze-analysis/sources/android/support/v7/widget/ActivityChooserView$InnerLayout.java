package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f902a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gc gcVarM = gc.m(context, attributeSet, f902a);
        setBackgroundDrawable(gcVarM.j(0));
        gcVarM.q();
    }
}
