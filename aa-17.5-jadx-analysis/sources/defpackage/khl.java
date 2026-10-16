package defpackage;

import android.database.Cursor;
import com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent;
import com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder;

/* loaded from: classes.dex */
public final class khl implements kfj {
    private final /* synthetic */ int a;

    public khl(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kfj
    public final /* synthetic */ Object a(Cursor cursor) {
        String str;
        String str2;
        yfq yfqVar;
        String str3;
        String str4;
        yfq yfqVar2;
        Cursor cursor2 = cursor;
        String str5 = "Missing required properties:";
        String str6 = " phoneNumbers";
        String str7 = " location";
        String str8 = " title";
        String str9 = " calendarId";
        String str10 = " id";
        int i = 2;
        int i2 = 8;
        int i3 = 1;
        if (this.a != 0) {
            int i4 = yfq.d;
            yfl yflVar = new yfl(4);
            if (cursor2 != null) {
                cursor2.moveToPosition(-1);
                while (cursor2.moveToNext()) {
                    boolean zA = kwo.b().d.e().a();
                    yfq yfqVarA = khh.a(cursor2.getString(i2), zA);
                    long j = cursor2.getLong(0);
                    String str11 = str5;
                    String str12 = str6;
                    long j2 = cursor2.getLong(i3);
                    int i5 = i;
                    String strAl = woy.al(cursor2.getString(i));
                    String str13 = str7;
                    String str14 = str8;
                    int i6 = i3;
                    long j3 = cursor2.getLong(3);
                    String str15 = str9;
                    String str16 = str10;
                    long j4 = cursor2.getLong(4);
                    int i7 = cursor2.getInt(5);
                    String strAl2 = woy.al(cursor2.getString(6));
                    int i8 = i2;
                    int i9 = cursor2.getInt(7);
                    khi khiVar = new khi();
                    yfl yflVar2 = yflVar;
                    khiVar.d(0L);
                    khiVar.a(0L);
                    khiVar.c = "";
                    khiVar.h(0L);
                    khiVar.c(0L);
                    khiVar.e(false);
                    khiVar.g = "";
                    khiVar.b(0);
                    khiVar.g(yls.a);
                    khiVar.f(false);
                    khiVar.d(j);
                    khiVar.a(j2);
                    khiVar.c = strAl;
                    khiVar.h(j3);
                    khiVar.c(j4);
                    khiVar.e(i7 != 0 ? i6 : 0);
                    khiVar.g = strAl2;
                    khiVar.b(i9);
                    khiVar.g(yfqVarA);
                    khiVar.f(zA);
                    if (khiVar.k != 127 || (str3 = khiVar.c) == null || (str4 = khiVar.g) == null || (yfqVar2 = khiVar.i) == null) {
                        StringBuilder sb = new StringBuilder();
                        if ((khiVar.k & 1) == 0) {
                            sb.append(str16);
                        }
                        if ((khiVar.k & 2) == 0) {
                            sb.append(str15);
                        }
                        if (khiVar.c == null) {
                            sb.append(str14);
                        }
                        if ((khiVar.k & 4) == 0) {
                            sb.append(" startTime");
                        }
                        if ((khiVar.k & 8) == 0) {
                            sb.append(" endTime");
                        }
                        if ((khiVar.k & 16) == 0) {
                            sb.append(" isAllDay");
                        }
                        if (khiVar.g == null) {
                            sb.append(str13);
                        }
                        if ((khiVar.k & 32) == 0) {
                            sb.append(" color");
                        }
                        if (khiVar.i == null) {
                            sb.append(str12);
                        }
                        if ((khiVar.k & 64) == 0) {
                            sb.append(" isWorkData");
                        }
                        throw new IllegalStateException(str11.concat(sb.toString()));
                    }
                    AutoValue_CalendarEvent autoValue_CalendarEvent = new AutoValue_CalendarEvent(khiVar.a, khiVar.b, str3, khiVar.d, khiVar.e, khiVar.f, str4, khiVar.h, yfqVar2, khiVar.j);
                    yflVar = yflVar2;
                    yflVar.i(autoValue_CalendarEvent);
                    cursor2 = cursor;
                    str6 = str12;
                    i3 = i6;
                    i = i5;
                    str7 = str13;
                    str8 = str14;
                    str9 = str15;
                    str10 = str16;
                    i2 = i8;
                    str5 = str11;
                }
            }
            yfq yfqVarG = yflVar.g();
            int i10 = khj.a;
            int i11 = ((yls) yfqVarG).c;
            return yfqVarG;
        }
        String str17 = " phoneNumbers";
        String str18 = " title";
        String str19 = "Missing required properties:";
        String str20 = " calendarId";
        String str21 = " id";
        int i12 = 8;
        int i13 = 1;
        int i14 = 2;
        int i15 = yfq.d;
        yfl yflVar3 = new yfl(4);
        if (cursor != null) {
            Cursor cursor3 = cursor;
            cursor3.moveToPosition(-1);
            while (cursor3.moveToNext()) {
                boolean zA2 = kwo.b().d.e().a();
                yfq yfqVarA2 = khh.a(cursor3.getString(i12), zA2);
                long j5 = cursor3.getLong(0);
                String str22 = str19;
                long j6 = cursor3.getLong(i13);
                String str23 = str7;
                String str24 = str17;
                long j7 = cursor3.getLong(i14);
                String strAl3 = woy.al(cursor3.getString(3));
                String str25 = str20;
                String str26 = str18;
                long j8 = cursor3.getLong(4);
                yfl yflVar4 = yflVar3;
                String str27 = str21;
                long j9 = cursor3.getLong(5);
                long j10 = cursor3.getLong(6);
                String strAl4 = woy.al(cursor3.getString(7));
                khk khkVar = new khk();
                khkVar.f(0L);
                khkVar.d(0L);
                khkVar.b(0L);
                khkVar.d = "";
                khkVar.a(0L);
                khkVar.e(0L);
                khkVar.c(0L);
                khkVar.h = "";
                khkVar.h(yls.a);
                khkVar.g(false);
                khkVar.f(j5);
                khkVar.d(j6);
                khkVar.b(j7);
                khkVar.d = strAl3;
                khkVar.a(j8);
                khkVar.e(j9);
                khkVar.c(j10);
                khkVar.h = strAl4;
                khkVar.h(yfqVarA2);
                khkVar.g(zA2);
                if (khkVar.k != 127 || (str = khkVar.d) == null || (str2 = khkVar.h) == null || (yfqVar = khkVar.i) == null) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((khkVar.k & 1) == 0) {
                        sb2.append(str27);
                    }
                    if ((khkVar.k & 2) == 0) {
                        sb2.append(" eventId");
                    }
                    if ((khkVar.k & 4) == 0) {
                        sb2.append(str25);
                    }
                    if (khkVar.d == null) {
                        sb2.append(str26);
                    }
                    if ((khkVar.k & 8) == 0) {
                        sb2.append(" alarmTime");
                    }
                    if ((khkVar.k & 16) == 0) {
                        sb2.append(" eventStartTime");
                    }
                    if ((khkVar.k & 32) == 0) {
                        sb2.append(" eventEndTime");
                    }
                    if (khkVar.h == null) {
                        sb2.append(str23);
                    }
                    if (khkVar.i == null) {
                        sb2.append(str24);
                    }
                    if ((khkVar.k & 64) == 0) {
                        sb2.append(" isWorkData");
                    }
                    throw new IllegalStateException(str22.concat(sb2.toString()));
                }
                AutoValue_CalendarReminder autoValue_CalendarReminder = new AutoValue_CalendarReminder(khkVar.a, khkVar.b, khkVar.c, str, khkVar.e, khkVar.f, khkVar.g, str2, yfqVar, khkVar.j);
                yflVar3 = yflVar4;
                yflVar3.i(autoValue_CalendarReminder);
                cursor3 = cursor;
                str17 = str24;
                str7 = str23;
                str18 = str26;
                str20 = str25;
                str21 = str27;
                str19 = str22;
                i13 = 1;
                i14 = 2;
                i12 = 8;
            }
        }
        yfq yfqVarG2 = yflVar3.g();
        yfq yfqVar3 = khm.a;
        int i16 = ((yls) yfqVarG2).c;
        return yfqVarG2;
    }
}
