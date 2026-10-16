package com.waze.menus;

import android.content.Context;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.ViewGroup;
import com.waze.design_components.text_view.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u extends eb {

    /* renamed from: a, reason: collision with root package name */
    private String f29757a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29758b = false;

    public final void a(boolean z) {
        boolean z2 = this.f29758b;
        this.f29758b = z;
        if (z2 && !z) {
            notifyItemRemoved(0);
        } else {
            if (z2 || !z) {
                return;
            }
            notifyItemInserted(0);
        }
    }

    public final void b() {
        this.f29757a = "AUTOCOMPLETE_CLICK";
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f29758b ? 1 : 0;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        return 10;
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        ad adVar = (ad) feVar;
        h.g.b.x.f(adVar, "holder");
        if (this.f29757a != null) {
            adVar.a();
        }
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        h.g.b.x.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        h.g.b.x.e(context, "getContext(...)");
        return new ad(new WazeTextView(context, null, 0, 6, null));
    }
}
