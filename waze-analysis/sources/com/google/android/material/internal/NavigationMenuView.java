package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.view.menu.af;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NavigationMenuView extends RecyclerView implements af {
    public NavigationMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        al(new LinearLayoutManager(1));
    }

    @Override // android.support.v7.view.menu.af
    public final void a(android.support.v7.view.menu.q qVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }
}
