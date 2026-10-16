package com.google.android.material.datepicker;

import android.content.Context;
import android.support.v7.widget.eb;
import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final c f6419a;

    /* renamed from: b, reason: collision with root package name */
    private final l f6420b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6421c;

    /* renamed from: d, reason: collision with root package name */
    private aj f6422d;

    /* renamed from: e, reason: collision with root package name */
    private int f6423e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final at f6424f;

    /* renamed from: g, reason: collision with root package name */
    private final s f6425g;

    /* renamed from: h, reason: collision with root package name */
    private final t f6426h;

    ao(Context context, at atVar, c cVar, l lVar, s sVar, t tVar) {
        aj ajVarM = cVar.m();
        aj ajVarK = cVar.k();
        aj ajVarL = cVar.l();
        if (ajVarM.compareTo(ajVarL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (ajVarL.compareTo(ajVarK) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f6421c = (ak.f6405a * z.a(context)) + (ag.e(context) ? z.a(context) : 0);
        this.f6419a = cVar;
        this.f6424f = atVar;
        this.f6420b = lVar;
        this.f6425g = sVar;
        this.f6426h = tVar;
        this.f6422d = ajVarL;
        setHasStableIds(true);
    }

    final int a(aj ajVar) {
        return this.f6419a.m().d(ajVar);
    }

    final aj b(int i2) {
        return this.f6419a.m().j(i2);
    }

    final CharSequence c(int i2) {
        return b(i2).k();
    }

    final void d(int i2) {
        this.f6423e = i2;
    }

    final void e(aj ajVar) {
        if (ajVar == null || ajVar.equals(this.f6422d)) {
            return;
        }
        int iA = a(this.f6422d);
        this.f6422d = ajVar;
        int iA2 = a(ajVar);
        notifyItemChanged(iA);
        notifyItemChanged(iA2);
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f6419a.c();
    }

    @Override // android.support.v7.widget.eb
    public final long getItemId(int i2) {
        return this.f6419a.m().j(i2).f();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        c cVar = this.f6419a;
        an anVar = (an) feVar;
        aj ajVarJ = cVar.m().j(i2);
        anVar.f6417a.setText(ajVarJ.k());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) anVar.f6418b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !ajVarJ.equals(materialCalendarGridView.getAdapter().f6407b)) {
            ak akVar = new ak(ajVarJ, this.f6424f, cVar, this.f6420b);
            materialCalendarGridView.setNumColumns(ajVarJ.f6400c);
            materialCalendarGridView.setAdapter((ListAdapter) akVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().j(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new am(this, materialCalendarGridView));
        materialCalendarGridView.b(this.f6426h);
        boolean zE = ag.e(anVar.itemView.getContext());
        if (zE || ajVarJ.equals(this.f6422d)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
            if (zE) {
                return;
            }
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (ajVarJ.equals(this.f6422d)) {
            final int i3 = this.f6423e;
            this.f6423e = 0;
            materialCalendarGridView.post(new Runnable() { // from class: com.google.android.material.datepicker.al
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    int iB;
                    MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                    if (!materialCalendarGridView2.hasFocus() || (i4 = i3) == 0) {
                        return;
                    }
                    ak adapter = materialCalendarGridView2.getAdapter();
                    if (i4 == 1) {
                        iB = adapter.c();
                        if (iB == -1) {
                            iB = adapter.h();
                        }
                    } else {
                        iB = adapter.b();
                        if (iB == -1) {
                            iB = adapter.g();
                        }
                    }
                    materialCalendarGridView2.setSelection(iB);
                }
            });
        }
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!ag.e(viewGroup.getContext())) {
            return new an(linearLayout, false);
        }
        linearLayout.setLayoutParams(new eo(-1, this.f6421c));
        return new an(linearLayout, true);
    }
}
