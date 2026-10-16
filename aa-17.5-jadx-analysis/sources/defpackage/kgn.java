package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import com.google.android.apps.auto.components.calendar.model.CalendarEvent;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kgn extends kae {
    public static final /* synthetic */ int h = 0;
    private static final rrc i = (rrc) rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, yzy.ti).l();
    public String f;
    public boolean g;
    private final List j;
    private String k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kgn(qn qnVar, CalendarEvent calendarEvent) {
        this(qnVar, calendarEvent.f());
        calendarEvent.getClass();
        this.f = calendarEvent.g();
        this.k = calendarEvent.h();
        this.g = calendarEvent.j();
    }

    private final Row a(String str, int i2, us usVar) {
        vf vfVar = new vf();
        vfVar.i(str);
        vfVar.g(new gec(usVar, 18));
        vfVar.e(new CarIcon(new tj(IconCompat.m(this.a, i2))), 4);
        return vfVar.a();
    }

    @Override // defpackage.qw
    public final wb h() {
        ug ugVar = new ug();
        String str = this.f;
        if (str != null && !afyh.v(str)) {
            String str2 = this.f;
            str2.getClass();
            ugVar.b(a(str2, R.drawable.gs_navigation_vd_theme_24, new gec(this, 19)));
        }
        List<CalendarEventPhoneNumber> list = this.j;
        if (!list.isEmpty()) {
            for (CalendarEventPhoneNumber calendarEventPhoneNumber : list) {
                String strA = calendarEventPhoneNumber.a();
                strA.getClass();
                ugVar.b(a(strA, R.drawable.gs_call_vd_theme_24, new gec(calendarEventPhoneNumber, 20)));
            }
        }
        uj ujVar = new uj();
        ujVar.f(ugVar.a());
        ujVar.e(Action.BACK);
        String string = this.k;
        if (string == null) {
            string = this.a.getString(R.string.phone_number_disambiguation_title);
            string.getClass();
        }
        ujVar.g(string);
        return ujVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kgn(qn qnVar, List list) {
        rrc rrcVar = i;
        rrcVar.getClass();
        super(qnVar, rrcVar);
        this.j = list;
    }
}
