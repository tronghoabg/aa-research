package com.waze.design_components.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import h.g.b.o;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeIconButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f23329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeIconButton(Context context, AttributeSet attributeSet, int i2) {
        h hVar;
        super(context, attributeSet, i2);
        x.f(context, "context");
        FrameLayout.inflate(context, R.layout.icon_button_layout, this);
        View viewFindViewById = findViewById(R.id.iconButtonImage);
        x.e(viewFindViewById, "findViewById(...)");
        this.f23329a = (ImageView) viewFindViewById;
        int[] iArr = com.waze.design_components.a.f23286e;
        x.e(iArr, "WazeIconButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, com.waze.design_components.b.d.f23300a.a());
        int i4 = typedArrayObtainStyledAttributes.getInt(3, com.waze.design_components.b.e.f23312a.a());
        int color = typedArrayObtainStyledAttributes.getColor(1, ContextCompat.getColor(context, R.color.content_default));
        h hVar2 = h.f23364a;
        int i5 = typedArrayObtainStyledAttributes.getInt(0, hVar2.a());
        h[] hVarArrValues = h.values();
        int length = hVarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i6];
            if (hVar.a() == i5) {
                break;
            } else {
                i6++;
            }
        }
        hVar2 = hVar != null ? hVar : hVar2;
        a(com.waze.x.g.h(i3), com.waze.x.g.g(i4));
        ImageViewCompat.setImageTintList(this.f23329a, ColorStateList.valueOf(color));
        x.f(hVar2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        int iOrdinal = hVar2.ordinal();
        if (iOrdinal == 0) {
            setBackgroundColor(0);
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            setBackgroundResource(R.drawable.waze_icon_button_circle_bg);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar) {
        x.f(dVar, "systemIcon");
        x.f(eVar, "systemIconType");
        this.f23329a.setImageResource(dVar.c(eVar));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(R.dimen.icon_button_tap_area), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeIconButton(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeIconButton(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
