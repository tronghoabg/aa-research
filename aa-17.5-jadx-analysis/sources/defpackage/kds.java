package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class kds extends fyv {
    private LinearLayout a;
    public MaterialActionButtonView b;
    public LinearLayout c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kds(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kdv.d, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.material_header_view, this);
        View viewFindViewById = viewInflate.findViewById(R.id.leading_action);
        viewFindViewById.getClass();
        this.b = (MaterialActionButtonView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.center_content_container);
        viewFindViewById2.getClass();
        this.a = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.trailing_actions_container);
        viewFindViewById3.getClass();
        this.c = (LinearLayout) viewFindViewById3;
    }

    public static /* synthetic */ void e(kds kdsVar, geu geuVar, Action action, List list, int i) {
        if ((i & 4) != 0) {
            list = afbe.a;
        }
        kdsVar.d(geuVar, action, list, true);
    }

    static /* synthetic */ void f(geu geuVar, MaterialActionButtonView materialActionButtonView, Action action, fwh fwhVar, hls hlsVar, int i) {
        fwf fwfVar = (i & 16) != 0 ? fwf.b : null;
        if ((i & 32) != 0) {
            hlsVar = new hls(false, false, false);
        }
        hls hlsVar2 = hlsVar;
        if (action == null) {
            materialActionButtonView.setVisibility(8);
        } else {
            MaterialActionButtonView.p(materialActionButtonView, geuVar, action, fwhVar, fwfVar, hlsVar2, 224);
            materialActionButtonView.setVisibility(0);
        }
    }

    public final void c(View view) {
        this.a.removeAllViews();
        this.a.addView(view);
    }

    public void d(geu geuVar, Action action, List list, boolean z) {
        int iA;
        int iIntValue;
        int iA2;
        fyy fyyVar = this.d ? fyy.b : fyy.a;
        f(geuVar, this.b, action, fwh.a, new hls(false, z, false), 16);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (action == null) {
            gjk gjkVar = fyyVar.d;
            Context context = getContext();
            context.getClass();
            iA = gjkVar.a(context);
        } else {
            gjk gjkVar2 = fyyVar.c;
            Context context2 = getContext();
            context2.getClass();
            iA = gjkVar2.a(context2);
        }
        int paddingTop = getPaddingTop();
        gjk gjkVar3 = fyyVar.e;
        Context context3 = getContext();
        context3.getClass();
        setPadding(iA, paddingTop, gjkVar3.a(context3), getPaddingBottom());
        setLayoutParams(layoutParams3);
        LinearLayout linearLayout = this.a;
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        if (action != null) {
            gjk gjkVar4 = fyyVar.f;
            Context context4 = getContext();
            context4.getClass();
            iIntValue = Integer.valueOf(gjkVar4.a(context4)).intValue();
        } else {
            iIntValue = 0;
        }
        layoutParams5.setMarginStart(iIntValue);
        if (list == null || list.isEmpty()) {
            iA2 = 0;
        } else {
            gjk gjkVar5 = fyyVar.f;
            Context context5 = getContext();
            context5.getClass();
            iA2 = gjkVar5.a(context5);
        }
        layoutParams5.setMarginEnd(iA2);
        linearLayout.setLayoutParams(layoutParams5);
        this.c.removeAllViews();
        Iterator it = (list == null ? afbe.a : list).iterator();
        while (it.hasNext()) {
            Action action2 = (Action) it.next();
            LayoutInflater.from(geuVar).inflate(R.layout.material_action_button, this.c);
            View childAt = this.c.getChildAt(r4.getChildCount() - 1);
            childAt.getClass();
            MaterialActionButtonView materialActionButtonView = (MaterialActionButtonView) childAt;
            f(geuVar, materialActionButtonView, action2, fyyVar.h, null, 48);
            if (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams6 = materialActionButtonView.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                gjk gjkVar6 = fyyVar.g;
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
                Context context6 = getContext();
                context6.getClass();
                layoutParams7.setMarginEnd(gjkVar6.a(context6));
                materialActionButtonView.setLayoutParams(layoutParams7);
            }
        }
        this.c.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kds(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kds(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kds(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ kds(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
