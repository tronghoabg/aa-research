package com.waze.ifs.ui;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ak extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f24514a;

    ak(at atVar) {
        Objects.requireNonNull(atVar);
        this.f24514a = atVar;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f24514a.b() * 10;
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        ((as) feVar).b(i2);
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        at atVar = this.f24514a;
        View viewInflate = View.inflate(atVar.getContext(), R.layout.waze_horizontal_scroll_card_selector_item, null);
        if (atVar.f24538h) {
            float f2 = atVar.getContext().getResources().getDisplayMetrics().density;
            View viewFindViewById = viewInflate.findViewById(R.id.card);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            float f3 = 120.0f * f2;
            layoutParams.height = Math.round(f3);
            layoutParams.width = Math.round(f3);
            viewFindViewById.setLayoutParams(layoutParams);
            View viewFindViewById2 = viewInflate.findViewById(R.id.image);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            float f4 = f2 * 80.0f;
            layoutParams2.height = Math.round(f4);
            layoutParams2.width = Math.round(f4);
            viewFindViewById2.setLayoutParams(layoutParams2);
            View viewFindViewById3 = viewInflate.findViewById(R.id.selectedImage);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
            layoutParams3.height = Math.round(f4);
            layoutParams3.width = Math.round(f4);
            viewFindViewById3.setLayoutParams(layoutParams3);
            ((WazeTextView) viewInflate.findViewById(R.id.title)).setTextSize(1, 17.0f);
        }
        return new as(atVar, viewInflate);
    }
}
