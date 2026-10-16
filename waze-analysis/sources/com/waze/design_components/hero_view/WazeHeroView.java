package com.waze.design_components.hero_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import com.waze.design_components.a;
import com.waze.design_components.g.b;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeHeroView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeHeroView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        int[] iArr = a.f23285d;
        x.e(iArr, "WazeHeroView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.waze_hero_view_layout, this);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        com.waze.shared_infra.o.a aVarD = b.d(this);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        if (resourceId != -1) {
            b(aVarD.c(resourceId, new Object[0]));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        if (resourceId2 != -1) {
            a(aVarD.c(resourceId2, new Object[0]));
        }
        ((ImageView) findViewById(R.id.heroViewImage)).setVisibility(true != z ? 8 : 0);
        if (drawable != null) {
            ((ImageView) findViewById(R.id.heroViewImage)).setImageDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(String str) {
        ((TextView) findViewById(R.id.heroViewSubtitle)).setText(str);
    }

    public final void b(String str) {
        ((TextView) findViewById(R.id.heroViewTitle)).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeHeroView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeHeroView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeHeroView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
