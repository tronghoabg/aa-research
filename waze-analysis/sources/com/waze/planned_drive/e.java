package com.waze.planned_drive;

import android.content.res.Resources;
import android.support.v7.widget.eb;
import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlannedDriveDayPicker f33319a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33320b;

    /* synthetic */ e(PlannedDriveDayPicker plannedDriveDayPicker) {
        Objects.requireNonNull(plannedDriveDayPicker);
        this.f33319a = plannedDriveDayPicker;
        this.f33320b = new ArrayList();
    }

    final void a(List list) {
        List list2 = this.f33320b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f33320b.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        g gVar = (g) feVar;
        final bx bxVar = (bx) this.f33320b.get(i2);
        gVar.a(bxVar.b());
        gVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.planned_drive.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33317a.f33319a.f33165c.a(bxVar);
            }
        });
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        Resources resources = viewGroup.getContext().getResources();
        PlannedDriveDayPicker plannedDriveDayPicker = this.f33319a;
        WazeTextView wazeTextView = new WazeTextView(plannedDriveDayPicker.getContext());
        eo eoVar = new eo(-1, -2);
        eoVar.leftMargin = com.waze.ui.z.as.h(resources, 16);
        eoVar.bottomMargin = com.waze.ui.z.as.h(resources, 16);
        eoVar.topMargin = com.waze.ui.z.as.h(resources, 16);
        wazeTextView.setLayoutParams(eoVar);
        wazeTextView.setTextSize(20.0f);
        wazeTextView.setSingleLine(true);
        wazeTextView.setMaxLines(1);
        wazeTextView.setTextColor(plannedDriveDayPicker.getResources().getColor(R.color.content_p2));
        return new g(wazeTextView);
    }
}
