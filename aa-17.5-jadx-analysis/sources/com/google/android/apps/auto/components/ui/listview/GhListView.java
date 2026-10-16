package com.google.android.apps.auto.components.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import defpackage.krj;
import defpackage.lt;
import defpackage.nrd;
import defpackage.omg;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class GhListView extends PagedListView {
    public List a;

    public GhListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new CopyOnWriteArrayList();
        this.n = nrd.a().c();
        q(new omg(this));
        i().setOnFocusChangeListener(new krj((Object) this, 4));
    }

    public final void f(lt ltVar) {
        super.c(ltVar);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    public GhListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GhListView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
