package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.provider.CalendarContract;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import androidx.car.app.model.Action;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class jxa implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ jxa(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        AttributeSet attributeSet = null;
        int i = 2;
        switch (this.a) {
            case 0:
                ((ggk) obj).getClass();
                return false;
            case 1:
                ((ggk) obj).getClass();
                return false;
            case 2:
                yph yphVar = jxd.a;
                return loy.j().f((ComponentName) obj);
            case 3:
                Integer num = (Integer) obj;
                if (num.intValue() != -1) {
                    return num;
                }
                return null;
            case 4:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return (PlaybackStateCompat) aaPlaybackState.b;
            case 5:
                List list = (List) obj;
                if (list == null) {
                    return -1;
                }
                if (list.isEmpty()) {
                    return 0;
                }
                return list.get(0);
            case 6:
                Context context = (Context) obj;
                context.getClass();
                return new MaterialCarRestrictedEditText(context, attributeSet, i, null == true ? 1 : 0);
            case 7:
                MinimizedStateNavigationTemplate minimizedStateNavigationTemplate = (MinimizedStateNavigationTemplate) obj;
                minimizedStateNavigationTemplate.getClass();
                return minimizedStateNavigationTemplate.getOriginalTemplate();
            case 8:
                MinimizedStateMapBasedTemplate minimizedStateMapBasedTemplate = (MinimizedStateMapBasedTemplate) obj;
                minimizedStateMapBasedTemplate.getClass();
                wb originalTemplate = minimizedStateMapBasedTemplate.getOriginalTemplate();
                originalTemplate.getClass();
                return originalTemplate;
            case 9:
                GridWrapperTemplate gridWrapperTemplate = (GridWrapperTemplate) obj;
                gridWrapperTemplate.getClass();
                return Boolean.valueOf(gridWrapperTemplate.getTemplate().isLoading());
            case 10:
                geu geuVar = (geu) obj;
                geuVar.getClass();
                return jzg.b(geuVar) ? new jvc(geuVar) : new jva(geuVar);
            case 11:
                Action action = (Action) obj;
                action.getClass();
                return Boolean.valueOf(1 == (action.getFlags() & 1));
            case 12:
                Long l = (Long) obj;
                kgr kgrVar = kgs.a;
                l.getClass();
                return Instant.ofEpochMilli(l.longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
            case 13:
                Long l2 = (Long) obj;
                kgr kgrVar2 = kgs.a;
                Context context2 = mki.a.c;
                l2.getClass();
                return DateUtils.formatDateTime(context2, l2.longValue(), 26);
            case 14:
                Long l3 = (Long) obj;
                kgr kgrVar3 = kgs.a;
                l3.getClass();
                long jLongValue = l3.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue);
                calendar.add(5, 0);
                calendar.set(11, 23);
                calendar.set(12, 59);
                calendar.set(13, 59);
                calendar.set(14, 0);
                return Long.valueOf(calendar.getTimeInMillis());
            case 15:
                CalendarEventPhoneNumber calendarEventPhoneNumber = (CalendarEventPhoneNumber) obj;
                calendarEventPhoneNumber.getClass();
                String strA = calendarEventPhoneNumber.a();
                strA.getClass();
                return strA;
            case 16:
                int i2 = khj.a;
                long epochMilli = ((LocalDate) obj).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli() + 1;
                return khj.b(epochMilli, epochMilli, true);
            case 17:
                dzi dziVar = (dzi) obj;
                int i3 = khj.a;
                Long l4 = (Long) dziVar.a;
                l4.getClass();
                long jLongValue2 = l4.longValue();
                Long l5 = (Long) dziVar.b;
                l5.getClass();
                return khj.b(jLongValue2, l5.longValue(), false);
            case 18:
                long jLongValue3 = ((Long) obj).longValue();
                yfq yfqVar = khm.a;
                wu wuVarA = kfk.a();
                wuVarA.d(CalendarContract.CalendarAlerts.CONTENT_URI);
                wuVarA.b(khm.a);
                wuVarA.b = String.format(Locale.US, "(%s < ?) AND (%s > ?) AND (%s != %d) AND (%s = 1) AND (%s != ?) AND (%s = 0)", "alarmTime", "begin", "state", 2, "visible", "selfAttendeeStatus", "allDay");
                String strValueOf = String.valueOf(jLongValue3);
                wuVarA.c(yfq.s(strValueOf, strValueOf, "2"));
                wuVarA.a = String.format(Locale.US, "%s ASC, %s ASC, %s ASC, %s ASC", "begin", "end", "event_id", "alarmTime");
                return wuVarA.a();
            case 19:
                return yfq.z(civ.e, (List) obj);
            default:
                yph yphVar2 = khx.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Map) obj).values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((List) it.next());
                }
                List.EL.sort(arrayList, civ.e);
                return arrayList;
        }
    }
}
