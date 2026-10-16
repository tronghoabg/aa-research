package com.google.android.apps.auto.components.apphost.basewidgets.action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.fvp;
import defpackage.fwf;
import defpackage.fwh;
import defpackage.geu;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006%"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/basewidgets/action/MaterialActionStripView;", "Landroid/widget/LinearLayout;", "Lcom/android/car/libraries/apphost/basewidgets/action/BaseActionStripView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "floatingActionMargin", "setActionStrip", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "actionStripWrapper", "Lcom/android/car/libraries/apphost/template/view/model/ActionStripWrapper;", "constraints", "Lcom/android/car/libraries/apphost/distraction/constraints/ActionsConstraints;", "allowTwoLines", "", "setActions", "actions", "", "Landroidx/car/app/model/Action;", "bottomMargin", "endMargin", "updateButton", "buttonView", "Lcom/google/android/apps/auto/components/apphost/basewidgets/action/ui/MaterialActionButtonView;", "action", "buttonType", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonStyle;", "buttonSize", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonSize;", "java.com.google.android.apps.auto.components.apphost.basewidgets.action_action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialActionStripView extends LinearLayout implements fvp {
    private final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialActionStripView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = (int) context.getResources().getDimension(R.dimen.padding_p2);
    }

    public final void a(geu geuVar, List list) {
        geuVar.getClass();
        list.getClass();
        int i = getOrientation() == 1 ? this.a : 0;
        int i2 = getOrientation() == 1 ? 0 : this.a;
        removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            LayoutInflater.from(getContext()).inflate(R.layout.material_action_button, this);
            View childAt = getChildAt(getChildCount() - 1);
            childAt.getClass();
            MaterialActionButtonView materialActionButtonView = (MaterialActionButtonView) childAt;
            geu geuVar2 = geuVar;
            MaterialActionButtonView.p(materialActionButtonView, geuVar2, action, fwh.f, fwf.b, null, 240);
            materialActionButtonView.setVisibility(0);
            if (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams = materialActionButtonView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i2, i);
                materialActionButtonView.setLayoutParams(marginLayoutParams);
            }
            geuVar = geuVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialActionStripView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialActionStripView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialActionStripView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MaterialActionStripView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
