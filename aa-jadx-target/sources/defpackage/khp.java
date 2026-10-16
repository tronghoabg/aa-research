package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khp implements kfl {
    private final /* synthetic */ int a;

    public khp(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object a(android.database.Cursor cursor) {
        java.lang.String str;
        java.lang.String str2;
        defpackage.ygw ygwVar;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.ygw ygwVar2;
        android.database.Cursor cursor2 = cursor;
        java.lang.String str5 = "Missing required properties:";
        java.lang.String str6 = " phoneNumbers";
        java.lang.String str7 = " location";
        java.lang.String str8 = " title";
        java.lang.String str9 = " calendarId";
        java.lang.String str10 = " id";
        int i = 2;
        int i2 = 8;
        int i3 = 1;
        if (this.a != 0) {
            int i4 = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            if (cursor2 != null) {
                cursor2.moveToPosition(-1);
                while (cursor2.moveToNext()) {
                    boolean zA = defpackage.kwu.b().d.e().a();
                    defpackage.ygw ygwVarA = khl.a(cursor2.getString(i2), zA);
                    long j = cursor2.getLong(0);
                    java.lang.String str11 = str5;
                    java.lang.String str12 = str6;
                    long j2 = cursor2.getLong(i3);
                    int i5 = i;
                    java.lang.String strBv = defpackage.ysr.bv(cursor2.getString(i));
                    java.lang.String str13 = str7;
                    java.lang.String str14 = str8;
                    int i6 = i3;
                    long j3 = cursor2.getLong(3);
                    java.lang.String str15 = str9;
                    java.lang.String str16 = str10;
                    long j4 = cursor2.getLong(4);
                    int i7 = cursor2.getInt(5);
                    java.lang.String strBv2 = defpackage.ysr.bv(cursor2.getString(6));
                    int i8 = i2;
                    int i9 = cursor2.getInt(7);
                    khm khmVar = new khm();
                    defpackage.ygr ygrVar2 = ygrVar;
                    khmVar.d(0L);
                    khmVar.a(0L);
                    khmVar.c = "";
                    khmVar.h(0L);
                    khmVar.c(0L);
                    khmVar.e(false);
                    khmVar.g = "";
                    khmVar.b(0);
                    khmVar.g(defpackage.ymx.a);
                    khmVar.f(false);
                    khmVar.d(j);
                    khmVar.a(j2);
                    khmVar.c = strBv;
                    khmVar.h(j3);
                    khmVar.c(j4);
                    khmVar.e(i7 != 0 ? i6 : 0);
                    khmVar.g = strBv2;
                    khmVar.b(i9);
                    khmVar.g(ygwVarA);
                    khmVar.f(zA);
                    if (khmVar.k != 127 || (str3 = khmVar.c) == null || (str4 = khmVar.g) == null || (ygwVar2 = khmVar.i) == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        if ((khmVar.k & 1) == 0) {
                            sb.append(str16);
                        }
                        if ((khmVar.k & 2) == 0) {
                            sb.append(str15);
                        }
                        if (khmVar.c == null) {
                            sb.append(str14);
                        }
                        if ((khmVar.k & 4) == 0) {
                            sb.append(" startTime");
                        }
                        if ((khmVar.k & 8) == 0) {
                            sb.append(" endTime");
                        }
                        if ((khmVar.k & 16) == 0) {
                            sb.append(" isAllDay");
                        }
                        if (khmVar.g == null) {
                            sb.append(str13);
                        }
                        if ((khmVar.k & 32) == 0) {
                            sb.append(" color");
                        }
                        if (khmVar.i == null) {
                            sb.append(str12);
                        }
                        if ((khmVar.k & 64) == 0) {
                            sb.append(" isWorkData");
                        }
                        throw new java.lang.IllegalStateException(str11.concat(sb.toString()));
                    }
                    com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent autoValue_CalendarEvent = new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent(khmVar.a, khmVar.b, str3, khmVar.d, khmVar.e, khmVar.f, str4, khmVar.h, ygwVar2, khmVar.j);
                    ygrVar = ygrVar2;
                    ygrVar.i(autoValue_CalendarEvent);
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
            defpackage.ygw ygwVarG = ygrVar.g();
            int i10 = defpackage.khn.a;
            int i11 = ((defpackage.ymx) ygwVarG).c;
            return ygwVarG;
        }
        java.lang.String str17 = " phoneNumbers";
        java.lang.String str18 = " title";
        java.lang.String str19 = "Missing required properties:";
        java.lang.String str20 = " calendarId";
        java.lang.String str21 = " id";
        int i12 = 8;
        int i13 = 1;
        int i14 = 2;
        int i15 = defpackage.ygw.d;
        defpackage.ygr ygrVar3 = new defpackage.ygr(4);
        if (cursor != null) {
            android.database.Cursor cursor3 = cursor;
            cursor3.moveToPosition(-1);
            while (cursor3.moveToNext()) {
                boolean zA2 = defpackage.kwu.b().d.e().a();
                defpackage.ygw ygwVarA2 = khl.a(cursor3.getString(i12), zA2);
                long j5 = cursor3.getLong(0);
                java.lang.String str22 = str19;
                long j6 = cursor3.getLong(i13);
                java.lang.String str23 = str7;
                java.lang.String str24 = str17;
                long j7 = cursor3.getLong(i14);
                java.lang.String strBv3 = defpackage.ysr.bv(cursor3.getString(3));
                java.lang.String str25 = str20;
                java.lang.String str26 = str18;
                long j8 = cursor3.getLong(4);
                defpackage.ygr ygrVar4 = ygrVar3;
                java.lang.String str27 = str21;
                long j9 = cursor3.getLong(5);
                long j10 = cursor3.getLong(6);
                java.lang.String strBv4 = defpackage.ysr.bv(cursor3.getString(7));
                kho khoVar = new kho();
                khoVar.f(0L);
                khoVar.d(0L);
                khoVar.b(0L);
                khoVar.d = "";
                khoVar.a(0L);
                khoVar.e(0L);
                khoVar.c(0L);
                khoVar.h = "";
                khoVar.h(defpackage.ymx.a);
                khoVar.g(false);
                khoVar.f(j5);
                khoVar.d(j6);
                khoVar.b(j7);
                khoVar.d = strBv3;
                khoVar.a(j8);
                khoVar.e(j9);
                khoVar.c(j10);
                khoVar.h = strBv4;
                khoVar.h(ygwVarA2);
                khoVar.g(zA2);
                if (khoVar.k != 127 || (str = khoVar.d) == null || (str2 = khoVar.h) == null || (ygwVar = khoVar.i) == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    if ((khoVar.k & 1) == 0) {
                        sb2.append(str27);
                    }
                    if ((khoVar.k & 2) == 0) {
                        sb2.append(" eventId");
                    }
                    if ((khoVar.k & 4) == 0) {
                        sb2.append(str25);
                    }
                    if (khoVar.d == null) {
                        sb2.append(str26);
                    }
                    if ((khoVar.k & 8) == 0) {
                        sb2.append(" alarmTime");
                    }
                    if ((khoVar.k & 16) == 0) {
                        sb2.append(" eventStartTime");
                    }
                    if ((khoVar.k & 32) == 0) {
                        sb2.append(" eventEndTime");
                    }
                    if (khoVar.h == null) {
                        sb2.append(str23);
                    }
                    if (khoVar.i == null) {
                        sb2.append(str24);
                    }
                    if ((khoVar.k & 64) == 0) {
                        sb2.append(" isWorkData");
                    }
                    throw new java.lang.IllegalStateException(str22.concat(sb2.toString()));
                }
                com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder autoValue_CalendarReminder = new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder(khoVar.a, khoVar.b, khoVar.c, str, khoVar.e, khoVar.f, khoVar.g, str2, ygwVar, khoVar.j);
                ygrVar3 = ygrVar4;
                ygrVar3.i(autoValue_CalendarReminder);
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
        defpackage.ygw ygwVarG2 = ygrVar3.g();
        defpackage.ygw ygwVar3 = defpackage.khq.a;
        int i16 = ((defpackage.ymx) ygwVarG2).c;
        return ygwVarG2;
    }
}
