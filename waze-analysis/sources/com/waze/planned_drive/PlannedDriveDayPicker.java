package com.waze.planned_drive;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class PlannedDriveDayPicker extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f33163a;

    /* renamed from: b, reason: collision with root package name */
    private e f33164b;

    /* renamed from: c, reason: collision with root package name */
    private f f33165c;

    public PlannedDriveDayPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f33165c = new c();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.planned_drive_day_picker, (ViewGroup) this, false);
        this.f33164b = new e(this);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler);
        this.f33163a = recyclerView;
        getContext();
        recyclerView.al(new LinearLayoutManager());
        this.f33163a.A(new h(this));
        this.f33163a.ak(this.f33164b);
        addView(viewInflate);
    }

    public final void c(f fVar) {
        this.f33165c = fVar;
    }

    public final void d(List list) {
        this.f33164b.a(list);
    }

    public PlannedDriveDayPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlannedDriveDayPicker(Context context) {
        this(context, null);
    }
}
