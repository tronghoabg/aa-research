package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f26908c;

    public /* synthetic */ f(k kVar, r rVar, int i5) {
        this.f26906a = i5;
        this.f26908c = kVar;
        this.f26907b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26906a) {
            case 0:
                k kVar = this.f26908c;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) kVar.f26922h.getLayoutManager()).findLastVisibleItemPosition() - 1;
                if (iFindLastVisibleItemPosition >= 0) {
                    Calendar calendarA = v.a(this.f26907b.f26965i.f26892a.f26949a);
                    calendarA.add(2, iFindLastVisibleItemPosition);
                    kVar.G(new n(calendarA));
                    break;
                }
                break;
            default:
                k kVar2 = this.f26908c;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) kVar2.f26922h.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < kVar2.f26922h.getAdapter().getItemCount()) {
                    Calendar calendarA2 = v.a(this.f26907b.f26965i.f26892a.f26949a);
                    calendarA2.add(2, iFindFirstVisibleItemPosition);
                    kVar2.G(new n(calendarA2));
                    break;
                }
                break;
        }
    }
}
