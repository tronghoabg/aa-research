package com.google.android.apps.auto.components.apphost.basewidgets.action.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.afeu;
import defpackage.bux;
import defpackage.bxc;
import defpackage.bxf;
import defpackage.cil;
import defpackage.fwl;
import defpackage.gfh;
import defpackage.gfy;
import defpackage.gpv;
import defpackage.gsl;
import defpackage.gzc;
import defpackage.hju;
import defpackage.jtr;
import defpackage.kmf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\""}, d2 = {"Lcom/google/android/apps/auto/components/apphost/basewidgets/action/ui/ContentActionsViewShim;", "Lcom/android/car/libraries/apphost/compose/ComposableView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uiModelRenderer", "Lcom/android/car/libraries/apphost/compose/UiModelRenderer;", "getUiModelRenderer", "()Lcom/android/car/libraries/apphost/compose/UiModelRenderer;", "composeView", "Lcom/google/android/apps/auto/components/compose/CarComposeView;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "ComponentContent", "", "useCoolwalkPalette", "", "(ZLandroidx/compose/runtime/Composer;I)V", "setActions", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "actionList", "", "Landroidx/car/app/model/Action;", "buttonStyle", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonStyle;", "stretchButtons", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/StretchButtons;", "getView", "Landroid/view/View;", "java.com.google.android.apps.auto.components.apphost.basewidgets.action.ui_ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentActionsViewShim extends LinearLayout implements gfh {
    public final gfy a;
    public final kmf b;
    public final cil c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentActionsViewShim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new gfy(null, null);
        this.b = new kmf(context);
        this.c = new cil();
    }

    @Override // defpackage.gfh
    /* renamed from: b, reason: from getter */
    public final gfy getA() {
        return this.a;
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void c() {
        fwl.j(this);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void d(hju hjuVar, String str) {
        fwl.k(this, hjuVar, str);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void e(gzc gzcVar) {
        fwl.l(this, gzcVar);
    }

    public final void f(boolean z, bux buxVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(710095479);
        if (i3 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(this) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            z2 = z;
            jtr.b(z2, false, null, bxc.i(1276385495, true, new gsl(this, 19), buxVarC), buxVarC, (i2 & 14) | 3072, 6);
        } else {
            z2 = z;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(this, z2, i, 4);
        }
    }

    @Override // defpackage.gfh
    public final View a() {
        return this;
    }

    public /* synthetic */ ContentActionsViewShim(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
