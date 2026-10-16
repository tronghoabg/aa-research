package com.waze.realtime_report_feedback;

import android.content.Context;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.ResultStruct;
import com.waze.av.d.p;
import com.waze.av.d.q;
import com.waze.config.ConfigValues;
import com.waze.navigate.location_preview.av;
import com.waze.navigate.location_preview.aw;
import com.waze.navigate.s;
import h.g.b.x;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class c {
    public c() {
    }

    private static boolean a(q qVar, Calendar calendar) {
        x.f(qVar, "<this>");
        x.f(calendar, "time");
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        Parcelable.Creator<com.waze.av.d.e> creator = com.waze.av.d.e.CREATOR;
        com.waze.av.d.e eVarP = com.waze.ad.c.b.p(calendar.get(7));
        x.f(qVar, "<this>");
        x.f(eVarP, "day");
        List list = (List) qVar.a().get(eVarP);
        if (list == null) {
            return true;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (k((p) it.next(), i2, i3)) {
                return false;
            }
        }
        return true;
    }

    public static int e() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_SHOWN_COUNTER.b().longValue();
    }

    public static boolean f() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_ZERO_SPEED_EDUCATION_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static int h(Context context) {
        x.f(context, "context");
        return ContextCompat.getColor(context, R.color.content_default);
    }

    public static ResultStruct j() {
        return new ResultStruct(-1, com.waze.shared_infra.o.b.a().c(R.string.CARPOOL_ERR_GENERAL_TEMP, new Object[0]), null, null, false, false);
    }

    public static boolean k(p pVar, int i2, int i3) {
        x.f(pVar, "<this>");
        if (pVar.e()) {
            if (pVar.a() >= i2) {
                return pVar.a() == i2 && pVar.b() <= i3;
            }
            return true;
        }
        if (pVar.a() >= i2 && (pVar.a() != i2 || pVar.b() > i3)) {
            return false;
        }
        if (pVar.c() <= i2) {
            return pVar.c() == i2 && pVar.d() > i3;
        }
        return true;
    }

    public static boolean l(p pVar) {
        x.f(pVar, "<this>");
        return pVar.a() == 0 && pVar.b() == 0 && pVar.c() == 24 && pVar.d() == 0;
    }

    public static s m(q qVar, Calendar calendar, int i2) {
        x.f(qVar, "openingTimes");
        x.f(calendar, "currentTime");
        if (qVar.a().isEmpty()) {
            return s.f31803a;
        }
        Map mapA = qVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            Iterable iterable = (Iterable) entry.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (l((p) it.next())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        if (linkedHashMap.size() == 7) {
            return s.f31807e;
        }
        Object objClone = calendar.clone();
        x.d(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.add(12, i2);
        return a(qVar, calendar) ? s.f31805c : a(qVar, calendar2) ? s.f31806d : s.f31804b;
    }

    public final boolean i() {
        return ((this instanceof aw) || (this instanceof av)) ? false : true;
    }

    public /* synthetic */ c(byte[] bArr, byte[] bArr2) {
    }
}
