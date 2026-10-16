package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.hg;
import defpackage.hu;

/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements hu {
    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ab(new LinearLayoutManager(1));
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.hu
    public final void a(hg hgVar) {
    }
}
