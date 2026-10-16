package com.waze.search.v2;

import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    public static final cv f36308a = new cv();

    public static final List a(List list, h.g.a.l lVar) {
        Object next;
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(lVar, "predicate");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                break;
            }
        }
        if (next == null) {
            return list;
        }
        List listAq = h.a.i.aq(list);
        listAq.remove(next);
        listAq.add(0, next);
        return listAq;
    }

    public static final com.waze.search.stats.r b(com.waze.av.d.j jVar, com.waze.av.d.q qVar, com.waze.shared_infra.q.e eVar, String str, Integer num) {
        h.g.b.x.f(jVar, "openStatus");
        h.g.b.x.f(qVar, "openTimes");
        h.g.b.x.f(eVar, "clock");
        if (jVar == com.waze.av.d.j.f16082d) {
            return com.waze.search.stats.r.f36103g;
        }
        if (jVar == com.waze.av.d.j.f16081c) {
            return com.waze.search.stats.r.f36102f;
        }
        if (com.waze.ad.c.b.n(qVar)) {
            return null;
        }
        com.waze.realtime_report_feedback.c cVarE = e(qVar, eVar, str, num, new ae(11));
        if (cVarE instanceof com.waze.navigate.fb) {
            return com.waze.search.stats.r.f36098b;
        }
        if (cVarE instanceof com.waze.navigate.ey) {
            return com.waze.search.stats.r.f36100d;
        }
        if (h.g.b.x.n(cVarE, com.waze.navigate.ez.f31340a)) {
            return com.waze.search.stats.r.f36100d;
        }
        if (cVarE instanceof com.waze.navigate.fa) {
            return com.waze.search.stats.r.f36101e;
        }
        if (h.g.b.x.n(cVarE, com.waze.navigate.fc.f31347a)) {
            return com.waze.search.stats.r.f36099c;
        }
        if (cVarE instanceof com.waze.navigate.fd) {
            return com.waze.search.stats.r.f36097a;
        }
        throw new h.i();
    }

    public static final com.waze.z.a.a c(com.waze.av.d.j jVar, com.waze.av.d.q qVar, String str, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.q.e eVar, Integer num, h.g.a.p pVar) {
        h.g.b.x.f(jVar, "openStatus");
        h.g.b.x.f(qVar, "times");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(pVar, "formatTime");
        Parcelable.Creator<com.waze.av.d.j> creator = com.waze.av.d.j.CREATOR;
        int iOrdinal = jVar.ordinal();
        if (iOrdinal == 2) {
            return new com.waze.z.a.a(new com.waze.ui.ac.j(R.string.LOCATION_PREVIEW_TEMPORARILY_CLOSED), com.waze.z.a.c.f45817c, null, null, false, null, null, 508);
        }
        if (iOrdinal == 3) {
            return new com.waze.z.a.a(new com.waze.ui.ac.j(R.string.LOCATION_PREVIEW_PERMANENTLY_CLOSED), com.waze.z.a.c.f45817c, null, null, false, null, null, 508);
        }
        if (com.waze.ad.c.b.n(qVar)) {
            return null;
        }
        com.waze.bc.a.a aVarD = d(e(qVar, eVar, str, num, pVar), aVar);
        return new com.waze.z.a.a(aVarD.c(), null, false, com.waze.perf.tracer.a.a(aVarD.a()), 46);
    }

    public static final com.waze.bc.a.a d(com.waze.realtime_report_feedback.c cVar, com.waze.shared_infra.o.a aVar) {
        String strC;
        String strC2;
        String strC3;
        h.g.b.x.f(cVar, NotificationCompat.CATEGORY_STATUS);
        h.g.b.x.f(aVar, "stringProvider");
        if (cVar instanceof com.waze.navigate.ez) {
            return new com.waze.bc.a.a(aVar.c(R.string.LOCATION_PREVIEW_CLOSED_TODAY, new Object[0]), com.waze.bc.a.b.f16197b, null, null, 12);
        }
        if (cVar instanceof com.waze.navigate.fc) {
            return new com.waze.bc.a.a(aVar.c(R.string.LOCATION_PREVIEW_NOW_OPEN, new Object[0]), com.waze.bc.a.b.f16196a, aVar.c(R.string.LOCATION_PREVIEW_24_HOURS, new Object[0]), null, 8);
        }
        String str = "";
        if (cVar instanceof com.waze.navigate.fa) {
            String strC4 = aVar.c(R.string.LOCATION_PREVIEW_CLOSES_SOON, new Object[0]);
            com.waze.navigate.fa faVar = (com.waze.navigate.fa) cVar;
            long jA = faVar.a();
            TimeUnit timeUnit = TimeUnit.HOURS;
            String strC5 = jA > 60 ? aVar.c(R.string.LOCATION_PREVIEW_IN_1_HOUR, new Object[0]) : aVar.c(R.string.LOCATION_PREVIEW_IN_MINUTES_PS, Integer.valueOf(faVar.a()));
            String strB = faVar.b();
            if (strB != null && (strC3 = aVar.c(R.string.LOCATION_PREVIEW_CLOSES_AT_PS, strB)) != null) {
                str = strC3;
            }
            return new com.waze.bc.a.a(strC4, com.waze.bc.a.b.f16197b, strC5, str);
        }
        if (cVar instanceof com.waze.navigate.fd) {
            String strC6 = aVar.c(R.string.LOCATION_PREVIEW_OPENS_SOON, new Object[0]);
            com.waze.navigate.fd fdVar = (com.waze.navigate.fd) cVar;
            long jA2 = fdVar.a();
            TimeUnit timeUnit2 = TimeUnit.HOURS;
            return new com.waze.bc.a.a(strC6, com.waze.bc.a.b.f16197b, jA2 > 60 ? aVar.c(R.string.LOCATION_PREVIEW_IN_1_HOUR, new Object[0]) : aVar.c(R.string.LOCATION_PREVIEW_IN_MINUTES_PS, Integer.valueOf(fdVar.a())), null, 8);
        }
        if (cVar instanceof com.waze.navigate.fb) {
            String strC7 = aVar.c(R.string.LOCATION_PREVIEW_NOW_OPEN, new Object[0]);
            String strA = ((com.waze.navigate.fb) cVar).a();
            return new com.waze.bc.a.a(strC7, com.waze.bc.a.b.f16196a, null, (strA == null || (strC2 = aVar.c(R.string.LOCATION_PREVIEW_CLOSES_AT_PS, strA)) == null) ? "" : strC2, 4);
        }
        if (!(cVar instanceof com.waze.navigate.ey)) {
            throw new h.i();
        }
        String strC8 = aVar.c(R.string.LOCATION_PREVIEW_NOW_CLOSED, new Object[0]);
        String strA2 = ((com.waze.navigate.ey) cVar).a();
        return new com.waze.bc.a.a(strC8, com.waze.bc.a.b.f16198c, null, (strA2 == null || (strC = aVar.c(R.string.LOCATION_PREVIEW_OPENS_AT_PS, strA2)) == null) ? "" : strC, 4);
    }

    public static final com.waze.realtime_report_feedback.c e(com.waze.av.d.q qVar, com.waze.shared_infra.q.e eVar, String str, Integer num, h.g.a.p pVar) {
        Object next;
        List listAl;
        Object next2;
        boolean z;
        long j2;
        List list;
        TimeZone timeZone;
        h.g.b.x.f(qVar, "openingTimes");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(pVar, "formatTime");
        Calendar calendarC = eVar.c();
        String str2 = str;
        if (str2 != null && str2.length() != 0 && (timeZone = DesugarTimeZone.getTimeZone(str)) != null) {
            calendarC.setTimeZone(timeZone);
        }
        int i2 = calendarC.get(11);
        int i3 = calendarC.get(12);
        Parcelable.Creator<com.waze.av.d.e> creator = com.waze.av.d.e.CREATOR;
        com.waze.av.d.e eVarP = com.waze.ad.c.b.p(calendarC.get(7));
        List list2 = (List) qVar.a().get(eVarP);
        List listAk = list2 != null ? h.a.i.ak(list2) : null;
        List list3 = listAk;
        if (list3 == null || list3.isEmpty()) {
            return com.waze.navigate.ez.f31340a;
        }
        List list4 = listAk;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                if (com.waze.realtime_report_feedback.c.l((com.waze.av.d.p) it.next())) {
                    return com.waze.navigate.fc.f31347a;
                }
            }
        }
        int iIntValue = num != null ? num.intValue() + 30 : 60;
        Iterator it2 = list4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (com.waze.realtime_report_feedback.c.k((com.waze.av.d.p) next, i2, i3)) {
                break;
            }
        }
        com.waze.av.d.p pVar2 = (com.waze.av.d.p) next;
        List list5 = (List) qVar.a().get(com.waze.av.d.e.values()[((eVarP.ordinal() + com.waze.av.d.e.values().length) - 1) % com.waze.av.d.e.values().length]);
        if (list5 != null) {
            List list6 = list5;
            h.g.b.x.f(list6, "<this>");
            listAl = h.a.i.al(list6, h.b.a.d());
        } else {
            listAl = null;
        }
        if (pVar2 == null && (list = listAl) != null && !list.isEmpty() && ((com.waze.av.d.p) h.a.i.P(listAl)).e()) {
            com.waze.av.d.p pVar3 = new com.waze.av.d.p(0, 0, ((com.waze.av.d.p) h.a.i.P(listAl)).c(), ((com.waze.av.d.p) h.a.i.P(listAl)).d());
            if (com.waze.realtime_report_feedback.c.k(pVar3, i2, i3)) {
                pVar2 = pVar3;
            }
        }
        if (pVar2 != null) {
            int iF = f(i2, i3, pVar2.c(), pVar2.d());
            if (pVar2.e()) {
                TimeUnit timeUnit = TimeUnit.DAYS;
                j2 = 1440;
            } else {
                j2 = 0;
            }
            long j3 = iF + j2;
            return j3 < ((long) iIntValue) ? new com.waze.navigate.fa((int) j3, (String) pVar.invoke(Integer.valueOf(pVar2.c()), Integer.valueOf(pVar2.d()))) : new com.waze.navigate.fb((String) pVar.invoke(Integer.valueOf(pVar2.c()), Integer.valueOf(pVar2.d())));
        }
        Iterator it3 = list4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            com.waze.av.d.p pVar4 = (com.waze.av.d.p) next2;
            if (i2 < pVar4.a() || (i2 == pVar4.a() && i3 < pVar4.b())) {
                break;
            }
        }
        com.waze.av.d.p pVar5 = (com.waze.av.d.p) next2;
        if (pVar5 == null) {
            List list7 = (List) qVar.a().get(com.waze.av.d.e.values()[(eVarP.ordinal() + 1) % com.waze.av.d.e.values().length]);
            pVar5 = list7 != null ? (com.waze.av.d.p) h.a.i.K(list7) : null;
            z = true;
        } else {
            z = false;
        }
        if (pVar5 != null) {
            int iF2 = f(i2, i3, pVar5.a() + (true == z ? 24 : 0), pVar5.b());
            if (iF2 < iIntValue) {
                return new com.waze.navigate.fd(iF2);
            }
        }
        return new com.waze.navigate.ey(pVar5 != null ? (String) pVar.invoke(Integer.valueOf(pVar5.a()), Integer.valueOf(pVar5.b())) : null);
    }

    private static final int f(int i2, int i3, int i4, int i5) {
        return (((i4 - i2) * 60) + i5) - i3;
    }
}
