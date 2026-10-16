package com.google.gson.internal.sql;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import la.InterfaceC3449A;
import la.l;
import la.p;
import la.z;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class SqlDateTypeAdapter extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27500b = new InterfaceC3449A() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // la.InterfaceC3449A
        public final z create(l lVar, C3883a c3883a) {
            if (c3883a.f44183a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f27501a;

    public /* synthetic */ SqlDateTypeAdapter(int i5) {
        this();
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        Date date;
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        synchronized (this) {
            TimeZone timeZone = this.f27501a.getTimeZone();
            try {
                try {
                    date = new Date(this.f27501a.parse(strC0).getTime());
                } catch (ParseException e7) {
                    throw new p("Failed parsing '" + strC0 + "' as SQL Date; at path " + c3962a.B(), e7, 13);
                }
            } finally {
                this.f27501a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3963b.z();
            return;
        }
        synchronized (this) {
            str = this.f27501a.format((java.util.Date) date);
        }
        c3963b.Y(str);
    }

    private SqlDateTypeAdapter() {
        this.f27501a = new SimpleDateFormat("MMM d, yyyy");
    }
}
