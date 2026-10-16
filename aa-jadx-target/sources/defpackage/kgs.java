package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kgs {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CalendarActions");

    public static final void a(java.lang.String str, defpackage.zbe zbeVar, boolean z) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3069)).u("Navigating to location");
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.ta);
        rrvVarH.y(z);
        oimVarU.F(rrvVarH.l());
        defpackage.mpk mpkVarA = defpackage.mpk.a();
        defpackage.ygw ygwVar = defpackage.maw.a;
        mpkVarA.i(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://maps.google.com/maps?nav=1&q=".concat(java.lang.String.valueOf(str.replaceAll("\\s", "+"))))));
    }

    public static final void b(com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber calendarEventPhoneNumber, defpackage.zbe zbeVar, java.lang.String str) {
        java.lang.String str2;
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3072)).u("Placing call");
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.sZ);
        rrvVarH.y(calendarEventPhoneNumber.e);
        java.lang.String str3 = calendarEventPhoneNumber.d;
        if (str3 != null) {
            rrvVarH.p(new android.content.ComponentName("regex", str3));
        }
        defpackage.omf.u().F(rrvVarH.l());
        java.lang.String str4 = calendarEventPhoneNumber.c;
        if (str4 == null) {
            str2 = calendarEventPhoneNumber.b;
        } else {
            str2 = java.lang.String.format(java.util.Locale.US, "%s,,,%s", calendarEventPhoneNumber.b, str4.replace("#", com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber.a));
        }
        defpackage.mpk.a().i(new android.content.Intent(str, android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(str2)))));
    }

    public static void c() {
    }
}
