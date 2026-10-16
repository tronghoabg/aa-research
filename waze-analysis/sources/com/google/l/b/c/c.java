package com.google.l.b.c;

import com.google.l.q;
import com.google.l.u;
import com.google.l.v;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends u {

    /* renamed from: a, reason: collision with root package name */
    static final v f12351a = new b(0);

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f12352b = new SimpleDateFormat("hh:mm:ss a");

    /* synthetic */ c() {
    }

    @Override // com.google.l.u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Time b(com.google.l.d.b bVar) throws IOException {
        Time time;
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        synchronized (this) {
            DateFormat dateFormat = this.f12352b;
            TimeZone timeZone = dateFormat.getTimeZone();
            try {
                try {
                    time = new Time(dateFormat.parse(strH).getTime());
                } catch (ParseException e2) {
                    throw new q("Failed parsing '" + strH + "' as SQL Time; at path " + bVar.f(), e2);
                }
            } finally {
                this.f12352b.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            cVar.g();
            return;
        }
        synchronized (this) {
            str = this.f12352b.format((Date) time);
        }
        cVar.l(str);
    }
}
