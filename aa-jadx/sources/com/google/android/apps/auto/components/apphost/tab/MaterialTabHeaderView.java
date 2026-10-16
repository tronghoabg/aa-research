package com.google.android.apps.auto.components.apphost.tab;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0002\b\u000b¢\u0006\u0004\b\t\u0010\nÊ\u0001\u0010\b+\u0012\f\b,\u0012\b\b\fJ\u0004\b\b(-¨\u0006*"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/tab/MaterialTabHeaderView;", "Lcom/google/android/apps/auto/components/apphost/view/widgets/common/MaterialHeaderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "setContent", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "title", "Landroidx/car/app/model/CarText;", "action", "Landroidx/car/app/model/Action;", "secondaryActions", "", "contentRefreshDelegate", "Landroidx/car/app/model/OnContentRefreshDelegate;", "getTabs", "setTabs", "tabModels", "Lcom/android/car/libraries/apphost/internal/model/TabInternal;", "activeTabContentId", "", "onTabSelected", "Lkotlin/Function1;", "updateTypeface", "Lcom/google/android/material/tabs/TabLayout$TabView;", "selected", "", "addTab", "tabModel", "setSelected", "showIcon", "java.com.google.android.apps.auto.components.apphost.tab_tab", "Landroid/annotation/SuppressLint;", "value", "ResourceType"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MaterialTabHeaderView extends defpackage.kdv {
    public final com.google.android.material.tabs.TabLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(new android.view.ContextThemeWrapper(context, com.google.android.projection.gearhead.R.style.ThemeOverlay_Template_Tab_Material), attributeSet, i, i2);
        context.getClass();
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.material_tab_header_view, (android.view.ViewGroup) this, false);
        android.view.View viewFindViewById = viewInflate.findViewById(com.google.android.projection.gearhead.R.id.tab_layout);
        viewFindViewById.getClass();
        this.a = (com.google.android.material.tabs.TabLayout) viewFindViewById;
        c(viewInflate);
    }

    public static final void b(defpackage.wxf wxfVar, boolean z) {
        android.widget.TextView textView = (android.widget.TextView) wxfVar.findViewById(com.google.android.projection.gearhead.R.id.tab_title);
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    @Override // defpackage.fze
    public final void a(defpackage.gfa gfaVar, androidx.car.app.model.CarText carText, androidx.car.app.model.Action action, java.util.List list) {
        defpackage.kdv.e(this, gfaVar, action, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialTabHeaderView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MaterialTabHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
