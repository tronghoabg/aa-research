package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.projection.gearhead.R;
import defpackage.acsx;
import defpackage.afeu;
import defpackage.affa;
import defpackage.ebf;
import defpackage.geu;
import defpackage.hlb;
import defpackage.kds;
import defpackage.krr;
import defpackage.krz;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialTitleHeaderView;", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialHeaderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "isCardHeader", "", "setContent", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "title", "Landroidx/car/app/model/CarText;", "action", "Landroidx/car/app/model/Action;", "secondaryActions", "", "renderCustomIconAsAppIcon", "versionedPalette", "Lcom/google/android/apps/auto/components/coolwalk/CoolwalkColors$VersionedPalette;", "contentRefreshDelegate", "Landroidx/car/app/model/OnContentRefreshDelegate;", "java.com.google.android.apps.auto.components.apphost.view.widgets.common_common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialTitleHeaderView extends kds {
    private TextView a;

    public /* synthetic */ MaterialTitleHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // defpackage.fyv
    public final void a(geu geuVar, CarText carText, Action action, List list) {
        geuVar.getClass();
        b(geuVar, carText, action, list, true, null);
    }

    public final void b(geu geuVar, CarText carText, Action action, List list, boolean z, krz krzVar) {
        geuVar.getClass();
        View viewInflate = LayoutInflater.from(this.d ? new ContextThemeWrapper(getContext(), R.style.ThemeOverlay_Template_Card_Material) : getContext()).inflate(R.layout.material_title_header_view, (ViewGroup) this, false);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate;
        this.a = textView;
        TextView textView2 = null;
        if (textView == null) {
            affa.d("titleView");
            textView = null;
        }
        c(textView);
        TextView textView3 = this.a;
        if (textView3 == null) {
            affa.d("titleView");
            textView3 = null;
        }
        textView3.setText(hlb.d(geuVar, carText));
        TextView textView4 = this.a;
        if (textView4 == null) {
            affa.d("titleView");
            textView4 = null;
        }
        textView4.setVisibility(0);
        if (krzVar != null) {
            boolean zN = acsx.N();
            TextView textView5 = this.a;
            if (zN) {
                if (textView5 == null) {
                    affa.d("titleView");
                } else {
                    textView2 = textView5;
                }
                krr krrVar = krr.C;
                Context context = getContext();
                context.getClass();
                textView2.setTextColor(krrVar.b(context, krzVar));
            } else {
                if (textView5 == null) {
                    affa.d("titleView");
                } else {
                    textView2 = textView5;
                }
                krr krrVar2 = krr.s;
                Context context2 = getContext();
                context2.getClass();
                textView2.setTextColor(krrVar2.b(context2, krzVar));
            }
        }
        d(geuVar, action, list, z);
        if (krzVar != null) {
            this.b.m(krzVar);
            Iterator itA = ebf.b(this.c).a();
            while (itA.hasNext()) {
                View view = (View) itA.next();
                view.getClass();
                ((MaterialActionButtonView) view).m(krzVar);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTitleHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTitleHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTitleHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTitleHeaderView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
