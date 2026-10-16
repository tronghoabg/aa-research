package com.google.l.b.a;

import j$.util.Objects;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.l.v f12276a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final e f12277b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12278c;

    /* synthetic */ f(e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f12278c = arrayList;
        this.f12277b = (e) Objects.requireNonNull(eVar);
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.l.b.l.a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final Date a(com.google.l.d.b bVar) throws IOException {
        List<DateFormat> list = this.f12278c;
        String strH = bVar.h();
        synchronized (list) {
            for (DateFormat dateFormat : list) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    Date date = dateFormat.parse(strH);
                    dateFormat.setTimeZone(timeZone);
                    return date;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                return com.google.l.b.a.a.a.a(strH, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new com.google.l.q("Failed parsing '" + strH + "' as Date; at path " + bVar.f(), e2);
            }
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        return this.f12277b.a(a(bVar));
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            cVar.g();
            return;
        }
        List list = this.f12278c;
        DateFormat dateFormat = (DateFormat) list.get(0);
        synchronized (list) {
            str = dateFormat.format(date);
        }
        cVar.l(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f12278c.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }
}
