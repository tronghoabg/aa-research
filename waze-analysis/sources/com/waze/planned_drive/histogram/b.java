package com.waze.planned_drive.histogram;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final List f33329a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private l f33330b;

    static final void d(b bVar, int i2) {
        l lVar = bVar.f33330b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i2));
        }
    }

    public final f a(int i2) {
        return (f) i.S(this.f33329a, i2);
    }

    public final void b(l lVar) {
        this.f33330b = lVar;
    }

    public final void c(List list) {
        List list2 = this.f33329a;
        list2.clear();
        List list3 = list2;
        if (list == null) {
            list = i.h();
        }
        i.aD(list3, list);
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f33329a.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, final int i2) {
        e eVar = (e) feVar;
        x.f(eVar, "holder");
        eVar.a((f) this.f33329a.get(i2));
        eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.planned_drive.histogram.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.d(this.f33327a, i2);
            }
        });
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        x.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.planned_drive_option_view, viewGroup, false);
        x.c(viewInflate);
        return new e(viewInflate);
    }
}
