package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import com.google.android.apps.auto.components.calendar.model.CalendarReminder;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class kgw {
    public static final kgw a;
    public static final kgw b;
    public static final kgw c;
    public static final kgw d;
    public static final kgw e;
    private static final /* synthetic */ kgw[] f;

    static {
        kgw kgwVar = new kgw("OPEN_AGENDA", 0);
        a = kgwVar;
        kgw kgwVar2 = new kgw("NAVIGATE", 1);
        b = kgwVar2;
        kgw kgwVar3 = new kgw("CALL", 2);
        c = kgwVar3;
        kgw kgwVar4 = new kgw("CALL_DISAMBIGUATE", 3);
        d = kgwVar4;
        kgw kgwVar5 = new kgw("NONE", 4);
        e = kgwVar5;
        f = new kgw[]{kgwVar, kgwVar2, kgwVar3, kgwVar4, kgwVar5};
    }

    public static kgw valueOf(String str) {
        return (kgw) Enum.valueOf(kgw.class, str);
    }

    public static kgw[] values() {
        return (kgw[]) f.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PendingIntent a(CalendarReminder calendarReminder, yzz yzzVar) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            kgu kguVarC = kgu.c();
            Intent intentB = kgu.b();
            intentB.setAction("action_open_app");
            intentB.putExtra("key_telemetry_context", yzzVar);
            return kguVarC.a(intentB);
        }
        if (iOrdinal == 1) {
            kgu kguVarC2 = kgu.c();
            String strH = calendarReminder.h();
            boolean zJ = calendarReminder.j();
            Intent intentB2 = kgu.b();
            intentB2.setAction("action_navigate");
            intentB2.putExtra("key_location", strH);
            intentB2.putExtra("key_telemetry_context", yzzVar);
            intentB2.putExtra("key_is_work_data", zJ);
            return kguVarC2.a(intentB2);
        }
        if (iOrdinal == 2) {
            kgu kguVarC3 = kgu.c();
            CalendarEventPhoneNumber calendarEventPhoneNumber = (CalendarEventPhoneNumber) calendarReminder.g().get(0);
            Intent intentB3 = kgu.b();
            intentB3.setAction("action_call");
            intentB3.putExtra("key_phone_number", calendarEventPhoneNumber);
            intentB3.putExtra("key_telemetry_context", yzzVar);
            return kguVarC3.a(intentB3);
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return null;
            }
            throw new RuntimeException(null, null);
        }
        kgu kguVarC4 = kgu.c();
        yfq yfqVarG = calendarReminder.g();
        Intent intentB4 = kgu.b();
        intentB4.setAction("action_call_disambiguate");
        intentB4.putExtra("key_phone_number_list", new ArrayList(yfqVarG));
        intentB4.putExtra("key_telemetry_context", yzzVar);
        return kguVarC4.a(intentB4);
    }

    public final GhIcon b(Context context) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return GhIcon.p(context, 2131233133);
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                return GhIcon.p(context, 2131233093);
            }
            if (iOrdinal != 4) {
                throw new RuntimeException(null, null);
            }
        }
        return null;
    }
}
