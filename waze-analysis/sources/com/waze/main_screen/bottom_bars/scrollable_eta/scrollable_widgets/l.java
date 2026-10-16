package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.navigate.AddressItem;
import com.waze.navigate.NavResultData;
import com.waze.navigate.fu;
import com.waze.planned_drive.bj;
import com.waze.planned_drive.r;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends h {

    /* renamed from: b, reason: collision with root package name */
    private CardView f26052b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f26053c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f26054d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f26055e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f26056f;

    /* renamed from: g, reason: collision with root package name */
    private View f26057g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26058h;

    /* renamed from: i, reason: collision with root package name */
    private AddressItem f26059i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f26060j;

    public l(Context context) {
        super(context);
        this.f26058h = true;
        this.f26059i = null;
        this.f26060j = com.waze.shared_infra.o.b.a();
    }

    public static /* synthetic */ void k(l lVar) {
        com.waze.main_screen.a.b.h.d().b(com.waze.main_screen.bottom_bars.scrollable_eta.l.f25983c);
        r.f33352a.a().d(lVar.f26059i).g().c(bj.f33257b).h();
        lVar.f26030a.j();
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void a(boolean z) {
        this.f26052b.setCardBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        this.f26053c.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p2));
        this.f26057g.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.separator_default));
        this.f26055e.setImageResource(true != z ? R.drawable.eta_planned_drive_illu_night : R.drawable.eta_planned_drive_illu);
        this.f26056f.setColorFilter(ContextCompat.getColor(getContext(), R.color.content_p2));
        this.f26054d.setTextColor(ContextCompat.getColor(getContext(), R.color.primary));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void b() {
        CardView cardView = (CardView) LayoutInflater.from(getContext()).inflate(R.layout.eta_widget_plan_drive, (ViewGroup) this, false);
        this.f26052b = cardView;
        this.f26053c = (TextView) cardView.findViewById(R.id.lblBestTimeToLeave);
        this.f26054d = (TextView) this.f26052b.findViewById(R.id.lblPlanDriveFooter);
        this.f26055e = (ImageView) this.f26052b.findViewById(R.id.imgPlannedDrive);
        this.f26057g = this.f26052b.findViewById(R.id.separator);
        this.f26056f = (ImageView) this.f26052b.findViewById(R.id.ivExpand);
        addView(this.f26052b);
        if (isInEditMode()) {
            return;
        }
        setOnClickListener(new com.waze.feedback.b(this, 14));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void d() {
        if (this.f26058h) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void e(fu fuVar) {
        this.f26058h = fuVar.b();
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void f(NavResultData navResultData) {
        if (navResultData == null) {
            this.f26059i = null;
            return;
        }
        AddressItem addressItem = navResultData.destination;
        this.f26059i = addressItem;
        addressItem.setTitle(navResultData.title);
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void g() {
        this.f26059i = null;
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void h() {
        TextView textView = this.f26053c;
        com.waze.shared_infra.o.a aVar = this.f26060j;
        textView.setText(aVar.c(R.string.ETA_SCREEN_PLAN_TITLE, new Object[0]));
        this.f26054d.setText(aVar.c(R.string.ETA_SCREEN_PLAN_FOOTER, new Object[0]));
    }
}
