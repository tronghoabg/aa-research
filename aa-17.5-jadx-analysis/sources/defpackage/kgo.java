package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kgo {
    public static final yph a = yph.c("GH.CalendarActions");

    public static final void a(String str, yzz yzzVar, boolean z) {
        ((ype) ((ype) a.f()).ai((char) 3066)).u("Navigating to location");
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.sW);
        rrbVarH.y(z);
        ohsVarJ.F(rrbVarH.l());
        mpe mpeVarA = mpe.a();
        yfq yfqVar = map.a;
        mpeVarA.i(new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?nav=1&q=".concat(String.valueOf(str.replaceAll("\\s", "+"))))));
    }

    public static final void b(CalendarEventPhoneNumber calendarEventPhoneNumber, yzz yzzVar, String str) {
        String str2;
        ((ype) ((ype) a.f()).ai((char) 3069)).u("Placing call");
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.sV);
        rrbVarH.y(calendarEventPhoneNumber.e);
        String str3 = calendarEventPhoneNumber.d;
        if (str3 != null) {
            rrbVarH.p(new ComponentName("regex", str3));
        }
        ebf.j().F(rrbVarH.l());
        String str4 = calendarEventPhoneNumber.c;
        if (str4 == null) {
            str2 = calendarEventPhoneNumber.b;
        } else {
            str2 = String.format(Locale.US, "%s,,,%s", calendarEventPhoneNumber.b, str4.replace("#", CalendarEventPhoneNumber.a));
        }
        mpe.a().i(new Intent(str, Uri.parse("tel:".concat(String.valueOf(str2)))));
    }

    public static void c() {
    }
}
