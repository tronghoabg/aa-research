package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;

/* loaded from: classes4.dex */
public final class i extends Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f26912a;

    public i(k kVar) {
        this.f26912a = kVar;
        v.c(null);
        v.c(null);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, j0 j0Var) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f26912a.getClass();
            throw null;
        }
    }
}
