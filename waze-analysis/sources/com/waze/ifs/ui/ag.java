package com.waze.ifs.ui;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final List f24504a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f24505b = -1;

    /* renamed from: c, reason: collision with root package name */
    private com.waze.settings.tree.views.h f24506c;

    static final void d(ag agVar, ai aiVar) {
        if (agVar.f24505b == aiVar.getBindingAdapterPosition()) {
            return;
        }
        agVar.b(aiVar.getBindingAdapterPosition());
        com.waze.settings.tree.views.h hVar = agVar.f24506c;
        if (hVar != null) {
            hVar.a(aiVar.getBindingAdapterPosition());
        }
    }

    public final void a(ah ahVar) {
        h.g.b.x.f(ahVar, "data");
        this.f24504a.add(ahVar);
        notifyDataSetChanged();
    }

    public final void b(int i2) {
        c();
        this.f24505b = i2;
        notifyItemChanged(i2);
    }

    public final void c() {
        int i2 = this.f24505b;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        this.f24505b = -1;
    }

    public final void e(com.waze.settings.tree.views.h hVar) {
        this.f24506c = hVar;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f24504a.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        ai aiVar = (ai) feVar;
        h.g.b.x.f(aiVar, "holder");
        aiVar.b((ah) this.f24504a.get(i2));
        aiVar.a(this.f24505b == i2);
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int size;
        h.g.b.x.f(viewGroup, "parent");
        ab abVar = new ab(viewGroup.getContext());
        final ai aiVar = new ai(abVar);
        abVar.setOnClickListener(new View.OnClickListener() { // from class: com.waze.ifs.ui.af
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ag.d(this.f24502a, aiVar);
            }
        });
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth() - (viewGroup.getPaddingStart() + viewGroup.getPaddingEnd());
        List list = this.f24504a;
        if (list.size() < 4) {
            size = width / list.size();
        } else {
            float f2 = height;
            size = (int) (width * 0.2857143f);
            if (size / f2 > 1.3333334f) {
                size = (int) (f2 * 1.3333334f);
            }
        }
        aiVar.itemView.setLayoutParams(new LinearLayout.LayoutParams(size, -1));
        return aiVar;
    }
}
