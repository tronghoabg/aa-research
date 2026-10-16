package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class gh extends android.support.v7.app.a {

    /* renamed from: b, reason: collision with root package name */
    int f1555b;

    public gh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1555b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public gh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1555b = 0;
    }

    public gh(android.support.v7.app.a aVar) {
        super(aVar);
        this.f1555b = 0;
    }

    public gh(gh ghVar) {
        super((android.support.v7.app.a) ghVar);
        this.f1555b = 0;
        this.f1555b = ghVar.f1555b;
    }

    public gh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1555b = 0;
    }

    public gh() {
        this.f1555b = 0;
        this.f498a = 8388627;
    }
}
