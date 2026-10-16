package com.google.l.b.c;

import com.google.l.q;
import com.google.l.u;
import com.google.l.v;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends u {

    /* renamed from: a, reason: collision with root package name */
    static final v f12348a = new b(1);

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f12349b = new SimpleDateFormat("MMM d, yyyy");

    /* synthetic */ a() {
    }

    @Override // com.google.l.u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Date b(com.google.l.d.b bVar) throws IOException {
        Date date;
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        synchronized (this) {
            DateFormat dateFormat = this.f12349b;
            TimeZone timeZone = dateFormat.getTimeZone();
            try {
                try {
                    date = new Date(dateFormat.parse(strH).getTime());
                } catch (ParseException e2) {
                    throw new q("Failed parsing '" + strH + "' as SQL Date; at path " + bVar.f(), e2);
                }
            } finally {
                this.f12349b.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.g();
            return;
        }
        synchronized (this) {
            str = this.f12349b.format((java.util.Date) date);
        }
        cVar.l(str);
    }
}
