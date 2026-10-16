package com.waze.design_components.text_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.bn;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.waze.design_components.d.b;
import com.waze.design_components.g.c;
import com.waze.design_components.g.d;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class WazeTextView extends bn {

    /* renamed from: a, reason: collision with root package name */
    private int f23479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeTextView(Context context, AttributeSet attributeSet, int i2) {
        a aVar;
        super(context, attributeSet, i2);
        x.f(context, "context");
        int[] iArr = com.waze.design_components.a.f23287f;
        x.e(iArr, "WazeTextView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f23479a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        a aVar2 = a.f23480a;
        int i3 = typedArrayObtainStyledAttributes.getInt(10, aVar2.a());
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i4];
            if (aVar.a() == i3) {
                break;
            } else {
                i4++;
            }
        }
        a(aVar != null ? aVar : aVar2);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, -1));
            Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
            if (num != null) {
                setTextColor(ContextCompat.getColor(getContext(), num.intValue()));
            } else {
                setTextColor(typedArrayObtainStyledAttributes.getColor(1, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        c cVarN = b.n(attributeSet, d.f23464a, "text");
        if (cVarN.a() != null) {
            setText(com.waze.design_components.g.b.d(this).c(cVarN.a().intValue(), new Object[0]));
        } else if (cVarN.b() != null) {
            setText(cVarN.b());
        }
    }

    public final void a(a aVar) {
        x.f(aVar, "typography");
        TextViewCompat.setTextAppearance(this, aVar.b());
    }

    @Override // android.support.v7.widget.bn, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getSize(i2) < this.f23479a) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f23479a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i2, i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeTextView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeTextView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
