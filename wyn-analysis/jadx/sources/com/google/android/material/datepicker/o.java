package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class o extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26956d = v.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f26957e = (v.c(null).getMaximum(7) + v.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final n f26958a;

    /* renamed from: b, reason: collision with root package name */
    public c f26959b;

    /* renamed from: c, reason: collision with root package name */
    public final b f26960c;

    public o(n nVar, b bVar) {
        this.f26958a = nVar;
        this.f26960c = bVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f26960c.f26896e;
        n nVar = this.f26958a;
        Calendar calendar = nVar.f26949a;
        int i5 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i10 = i5 - firstDayOfWeek;
        return i10 < 0 ? i10 + nVar.f26952d : i10;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i5) {
        if (i5 < a() || i5 > c()) {
            return null;
        }
        int iA = (i5 - a()) + 1;
        Calendar calendarA = v.a(this.f26958a.f26949a);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f26958a.f26953e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f26957e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5 / this.f26958a.f26952d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getContext()
            com.google.android.material.datepicker.c r3 = r4.f26959b
            if (r3 != 0) goto L11
            com.google.android.material.datepicker.c r3 = new com.google.android.material.datepicker.c
            r3.<init>(r2)
            r4.f26959b = r3
        L11:
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r6 != 0) goto L28
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r2 = 2131558544(0x7f0d0090, float:1.8742407E38)
            android.view.View r6 = r6.inflate(r2, r7, r1)
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
        L28:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.n r7 = r4.f26958a
            int r3 = r7.f26953e
            if (r6 < r3) goto L37
            goto L5d
        L37:
            int r6 = r6 + r0
            r2.setTag(r7)
            android.content.res.Resources r7 = r2.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r2.setText(r6)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L65
        L5d:
            r6 = 8
            r2.setVisibility(r6)
            r2.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r2 != 0) goto L6f
        L6e:
            return r2
        L6f:
            r2.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.v.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
