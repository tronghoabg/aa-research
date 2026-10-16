package com.google.android.material.datepicker;

import com.waze.R;
import java.text.SimpleDateFormat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af {

    /* renamed from: b, reason: collision with root package name */
    c f6376b;

    /* renamed from: g, reason: collision with root package name */
    final at f6381g;

    /* renamed from: a, reason: collision with root package name */
    int f6375a = 0;

    /* renamed from: c, reason: collision with root package name */
    int f6377c = 0;

    /* renamed from: d, reason: collision with root package name */
    CharSequence f6378d = null;

    /* renamed from: e, reason: collision with root package name */
    Object f6379e = null;

    /* renamed from: f, reason: collision with root package name */
    int f6380f = 0;

    private af(at atVar) {
        this.f6381g = atVar;
    }

    public static af a() {
        return new af(new at());
    }

    private static boolean i(aj ajVar, c cVar) {
        return ajVar.compareTo(cVar.m()) >= 0 && ajVar.compareTo(cVar.k()) <= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.material.datepicker.ag b() {
        /*
            r5 = this;
            com.google.android.material.datepicker.c r0 = r5.f6376b
            if (r0 != 0) goto Lf
            com.google.android.material.datepicker.a r0 = new com.google.android.material.datepicker.a
            r0.<init>()
            com.google.android.material.datepicker.c r0 = r0.a()
            r5.f6376b = r0
        Lf:
            int r0 = r5.f6377c
            if (r0 != 0) goto L18
            r0 = 2131890310(0x7f121086, float:1.9415308E38)
            r5.f6377c = r0
        L18:
            java.lang.Object r0 = r5.f6379e
            if (r0 == 0) goto L23
            com.google.android.material.datepicker.at r1 = r5.f6381g
            java.lang.Long r0 = (java.lang.Long) r0
            r1.i(r0)
        L23:
            com.google.android.material.datepicker.c r0 = r5.f6376b
            com.google.android.material.datepicker.aj r0 = r0.l()
            if (r0 != 0) goto L6c
            com.google.android.material.datepicker.c r0 = r5.f6376b
            com.google.android.material.datepicker.at r1 = r5.f6381g
            java.util.Collection r2 = r1.e()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L57
            java.util.Collection r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.material.datepicker.aj r1 = com.google.android.material.datepicker.aj.g(r1)
            com.google.android.material.datepicker.c r2 = r5.f6376b
            boolean r2 = i(r1, r2)
            if (r2 != 0) goto L69
        L57:
            com.google.android.material.datepicker.aj r1 = com.google.android.material.datepicker.aj.i()
            com.google.android.material.datepicker.c r2 = r5.f6376b
            boolean r2 = i(r1, r2)
            if (r2 != 0) goto L69
            com.google.android.material.datepicker.c r1 = r5.f6376b
            com.google.android.material.datepicker.aj r1 = r1.m()
        L69:
            r0.n(r1)
        L6c:
            com.google.android.material.datepicker.ag r0 = new com.google.android.material.datepicker.ag
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            int r2 = r5.f6375a
            java.lang.String r3 = "OVERRIDE_THEME_RES_ID"
            r1.putInt(r3, r2)
            com.google.android.material.datepicker.at r2 = r5.f6381g
            java.lang.String r3 = "DATE_SELECTOR_KEY"
            r1.putParcelable(r3, r2)
            com.google.android.material.datepicker.c r2 = r5.f6376b
            java.lang.String r3 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r3, r2)
            java.lang.String r2 = "DAY_VIEW_DECORATOR_KEY"
            r3 = 0
            r1.putParcelable(r2, r3)
            int r2 = r5.f6377c
            java.lang.String r4 = "TITLE_TEXT_RES_ID_KEY"
            r1.putInt(r4, r2)
            java.lang.CharSequence r2 = r5.f6378d
            java.lang.String r4 = "TITLE_TEXT_KEY"
            r1.putCharSequence(r4, r2)
            int r5 = r5.f6380f
            java.lang.String r2 = "INPUT_MODE_KEY"
            r1.putInt(r2, r5)
            java.lang.String r5 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            r2 = 0
            r1.putInt(r5, r2)
            java.lang.String r5 = "POSITIVE_BUTTON_TEXT_KEY"
            r1.putCharSequence(r5, r3)
            java.lang.String r5 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            r1.putInt(r5, r2)
            java.lang.String r5 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            r1.putCharSequence(r5, r3)
            java.lang.String r5 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            r1.putInt(r5, r2)
            java.lang.String r5 = "NEGATIVE_BUTTON_TEXT_KEY"
            r1.putCharSequence(r5, r3)
            java.lang.String r5 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            r1.putInt(r5, r2)
            java.lang.String r5 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            r1.putCharSequence(r5, r3)
            r0.setArguments(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.af.b():com.google.android.material.datepicker.ag");
    }

    public final void c(c cVar) {
        this.f6376b = cVar;
    }

    public final void d() {
        this.f6380f = 1;
    }

    public final void e(Object obj) {
        this.f6379e = obj;
    }

    public final void f(SimpleDateFormat simpleDateFormat) {
        this.f6381g.j(simpleDateFormat);
    }

    public final void g() {
        this.f6375a = R.style.CustomMaterialCalendarTheme;
    }

    public final void h(CharSequence charSequence) {
        this.f6378d = charSequence;
        this.f6377c = 0;
    }
}
