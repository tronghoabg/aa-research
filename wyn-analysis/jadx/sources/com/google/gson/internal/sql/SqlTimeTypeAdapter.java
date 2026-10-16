package com.google.gson.internal.sql;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import la.InterfaceC3449A;
import la.l;
import la.p;
import la.z;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public final class SqlTimeTypeAdapter extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3449A f27502b = new InterfaceC3449A() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // la.InterfaceC3449A
        public final z create(l lVar, C3883a c3883a) {
            if (c3883a.f44183a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f27503a;

    public /* synthetic */ SqlTimeTypeAdapter(int i5) {
        this();
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        Time time;
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        synchronized (this) {
            TimeZone timeZone = this.f27503a.getTimeZone();
            try {
                try {
                    time = new Time(this.f27503a.parse(strC0).getTime());
                } catch (ParseException e7) {
                    throw new p("Failed parsing '" + strC0 + "' as SQL Time; at path " + c3962a.B(), e7, 13);
                }
            } finally {
                this.f27503a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c3963b.z();
            return;
        }
        synchronized (this) {
            str = this.f27503a.format((Date) time);
        }
        c3963b.Y(str);
    }

    private SqlTimeTypeAdapter() {
        this.f27503a = new SimpleDateFormat("hh:mm:ss a");
    }
}
