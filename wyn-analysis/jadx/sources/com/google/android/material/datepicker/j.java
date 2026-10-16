package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class j extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f26914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f26915c;

    public j(k kVar, r rVar, MaterialButton materialButton) {
        this.f26915c = kVar;
        this.f26913a = rVar;
        this.f26914b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        if (i5 == 0) {
            recyclerView.announceForAccessibility(this.f26914b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        String dateTime;
        k kVar = this.f26915c;
        int iFindFirstVisibleItemPosition = i5 < 0 ? ((LinearLayoutManager) kVar.f26922h.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) kVar.f26922h.getLayoutManager()).findLastVisibleItemPosition();
        b bVar = this.f26913a.f26965i;
        Calendar calendarA = v.a(bVar.f26892a.f26949a);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        kVar.f26918d = new n(calendarA);
        Calendar calendarA2 = v.a(bVar.f26892a.f26949a);
        calendarA2.add(2, iFindFirstVisibleItemPosition);
        calendarA2.set(5, 1);
        Calendar calendarA3 = v.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f26968a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f26914b.setText(dateTime);
    }
}
