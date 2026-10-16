package com.waze.design_components.text_view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import h.a.aj;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class MinWidthMultilineTextView extends WazeTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinWidthMultilineTextView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    @Override // com.waze.design_components.text_view.WazeTextView, android.support.v7.widget.bn, android.widget.TextView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        Layout layout;
        super.onMeasure(i2, i3);
        if (getLineCount() <= 1 || View.MeasureSpec.getMode(i2) == 1073741824 || (layout = getLayout()) == null) {
            return;
        }
        int compoundPaddingLeft = getCompoundPaddingLeft() + getCompoundPaddingRight();
        j jVarU = n.u(0, layout.getLineCount());
        ArrayList arrayList = new ArrayList(i.q(jVarU, 10));
        Iterator<Integer> it = jVarU.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(layout.getLineWidth(((aj) it).nextInt())));
        }
        ArrayList arrayList2 = arrayList;
        x.f(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it2.next()).floatValue());
        }
        setMeasuredDimension(((int) Math.ceil(fFloatValue)) + compoundPaddingLeft, getMeasuredHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinWidthMultilineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinWidthMultilineTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        setBreakStrategy(2);
    }

    public /* synthetic */ MinWidthMultilineTextView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
