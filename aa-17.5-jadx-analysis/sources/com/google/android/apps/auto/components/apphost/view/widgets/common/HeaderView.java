package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.fyv;
import defpackage.geu;
import defpackage.ghw;
import defpackage.hbz;
import defpackage.hlb;
import defpackage.hmb;
import defpackage.ie;
import defpackage.jmq;
import defpackage.kdv;
import defpackage.ols;
import defpackage.uq;
import java.util.List;

/* loaded from: classes2.dex */
public class HeaderView extends fyv {
    private TextView a;
    private FrameLayout b;
    private LinearLayout c;
    private final int d;
    private final boolean e;

    public HeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.header_view, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateHeaderButtonIconTint});
        this.d = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kdv.d, i, i2);
        this.e = typedArrayObtainStyledAttributes2.getBoolean(0, false);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @ResultIgnorabilityUnspecified
    private final boolean b(geu geuVar, ViewGroup viewGroup, Action action) {
        if (action == null) {
            viewGroup.setVisibility(8);
            return false;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(geuVar);
        boolean z = this.e;
        layoutInflaterFrom.inflate(true != z ? R.layout.header_action_view : R.layout.header_card_action_view, this.b);
        viewGroup.setVisibility(0);
        CarIcon carIconH = hbz.h(action);
        boolean z2 = (action.getType() == 1 && (carIconH == null || carIconH.getTint() == null)) ? false : true;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.header_button_icon);
        int i = this.d;
        hmb hmbVar = hmb.a;
        hbz.j(geuVar, carIconH, imageView, new hmb(i, z2, false, ghw.b, null, z, 0));
        if (action.getType() == 65538) {
            viewGroup.setFocusable(false);
            viewGroup.setClickable(false);
        } else if (action.getType() == 65539) {
            viewGroup.setOnClickListener(new ie(geuVar, 20, null));
            viewGroup.setFocusable(true);
            viewGroup.setClickable(true);
        } else {
            uq onClickDelegate = action.getOnClickDelegate();
            if (onClickDelegate != null) {
                viewGroup.setOnClickListener(new jmq(geuVar, onClickDelegate, 5, null));
                viewGroup.setFocusable(true);
                viewGroup.setClickable(true);
            } else {
                viewGroup.setFocusable(false);
                viewGroup.setClickable(false);
            }
        }
        return true;
    }

    @Override // defpackage.fyv
    public final void a(geu geuVar, CarText carText, Action action, List list) {
        boolean zB = b(geuVar, this.b, action);
        int i = 0;
        boolean z = carText != null;
        TextView textView = this.a;
        if (z) {
            textView.setText(hlb.d(geuVar, carText));
            this.a.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean z2 = this.e;
        if (z2) {
            int dimensionPixelSize = geuVar.getResources().getDimensionPixelSize(R.dimen.template_width_keyline_0);
            this.a.setPadding(zB ? dimensionPixelSize : geuVar.getResources().getDimensionPixelSize(R.dimen.template_padding_5), 0, dimensionPixelSize, 0);
        }
        this.c.removeAllViews();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Action action2 = (Action) list.get(i2);
                if (action2 != null) {
                    LayoutInflater.from(geuVar).inflate(z2 ? R.layout.header_card_action_view : R.layout.header_action_view, this.c);
                    b(geuVar, (FrameLayout) this.c.getChildAt(r6.getChildCount() - 1), action2);
                }
            }
        }
        boolean z3 = (list == null || list.isEmpty()) ? false : true;
        if (z2 && z3) {
            this.c.setPadding(getPaddingLeft(), getPaddingTop(), geuVar.getResources().getDimensionPixelSize(R.dimen.template_padding_0), getPaddingBottom());
        }
        this.c.setVisibility(true != z3 ? 8 : 0);
        if (!z && !zB && !z3) {
            i = 8;
        }
        setVisibility(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.header_title);
        this.b = (FrameLayout) findViewById(R.id.primary_header_action);
        this.c = (LinearLayout) findViewById(R.id.secondary_header_actions);
        ols.e(this.b, getResources().getDimensionPixelSize(R.dimen.template_min_tap_target_size));
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public HeaderView(Context context) {
        this(context, null);
    }
}
