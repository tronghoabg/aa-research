package com.google.android.apps.auto.components.apphost.compose;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.afeu;
import defpackage.affa;
import defpackage.fwl;
import defpackage.geu;
import defpackage.hju;
import defpackage.jva;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/compose/ComposableShimLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "queuedUiModel", "Lcom/android/car/libraries/apphost/ui/UiModel;", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "setUiModel", "", "model", "onAttachedToWindow", "maybeCreateComposable", "java.com.google.android.apps.auto.components.apphost.compose_compose"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableShimLayout extends LinearLayout {
    private hju a;
    private geu b;

    public /* synthetic */ ComposableShimLayout(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void b() {
        if (isAttachedToWindow()) {
            synchronized (this) {
                if (this.a != null) {
                    removeAllViews();
                    geu geuVar = this.b;
                    if (geuVar == null) {
                        affa.d("templateContext");
                        geuVar = null;
                    }
                    jva jvaVar = new jva(geuVar);
                    hju hjuVar = this.a;
                    hjuVar.getClass();
                    fwl.k(jvaVar, hjuVar, null);
                    this.a = null;
                    addView(jvaVar);
                }
            }
        }
    }

    public final void a(geu geuVar, hju hjuVar) {
        geuVar.getClass();
        this.b = geuVar;
        synchronized (this) {
            this.a = hjuVar;
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        b();
        super.onAttachedToWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposableShimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableShimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposableShimLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
