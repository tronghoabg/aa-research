package com.waze.trip_overview.views.trip_details_container;

import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends fe {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f41567a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f41568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        x.f(view, "itemView");
        View viewFindViewById = view.findViewById(R.id.link);
        x.e(viewFindViewById, "findViewById(...)");
        this.f41567a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.hashTag);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f41568b = (TextView) viewFindViewById2;
    }

    public final void a(h hVar, boolean z, boolean z2) {
        x.f(hVar, "data");
        String strC = com.waze.shared_infra.o.b.a().c(hVar.b(), new Object[0]);
        TextView textView = this.f41567a;
        textView.setText(strC);
        textView.setOnClickListener(new com.waze.profile.m(hVar, 20));
        Integer numC = hVar.c();
        if (numC != null) {
            this.f41568b.setText(com.waze.shared_infra.o.b.a().c(numC.intValue(), new Object[0]));
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(hVar.a(), 0, 0, 0);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        x.d(layoutParams, "null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        eo eoVar = (eo) layoutParams;
        eoVar.bottomMargin = z2 ? this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tripOverviewFooterVerticalMargin) : 0;
        eoVar.topMargin = z ? this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tripOverviewFooterVerticalMargin) : this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tripOverviewFooterElementsMargin);
        view.setLayoutParams(eoVar);
    }
}
