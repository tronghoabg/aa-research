package com.google.android.apps.auto.components.apphost.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import com.google.android.material.tabs.TabLayout;
import com.google.android.projection.gearhead.R;
import defpackage.afeu;
import defpackage.geu;
import defpackage.kds;
import defpackage.wwi;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006)"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/tab/MaterialTabHeaderView;", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialHeaderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "setContent", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "title", "Landroidx/car/app/model/CarText;", "action", "Landroidx/car/app/model/Action;", "secondaryActions", "", "contentRefreshDelegate", "Landroidx/car/app/model/OnContentRefreshDelegate;", "getTabs", "setTabs", "tabModels", "Lcom/android/car/libraries/apphost/internal/model/TabInternal;", "activeTabContentId", "", "onTabSelected", "Lkotlin/Function1;", "updateTypeface", "Lcom/google/android/material/tabs/TabLayout$TabView;", "selected", "", "addTab", "tabModel", "setSelected", "showIcon", "java.com.google.android.apps.auto.components.apphost.tab_tab"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialTabHeaderView extends kds {
    public final TabLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(new ContextThemeWrapper(context, R.style.ThemeOverlay_Template_Tab_Material), attributeSet, i, i2);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.material_tab_header_view, (ViewGroup) this, false);
        View viewFindViewById = viewInflate.findViewById(R.id.tab_layout);
        viewFindViewById.getClass();
        this.a = (TabLayout) viewFindViewById;
        c(viewInflate);
    }

    public static final void b(wwi wwiVar, boolean z) {
        TextView textView = (TextView) wwiVar.findViewById(R.id.tab_title);
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    @Override // defpackage.fyv
    public final void a(geu geuVar, CarText carText, Action action, List list) {
        kds.e(this, geuVar, action, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MaterialTabHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
