package com.google.android.apps.auto.components.calendar.calling;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeh;
import defpackage.mki;
import defpackage.odn;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class CalendarEventPhoneNumber implements Parcelable {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    private static final yph f = yph.c("GH.CalendarEvtPhoneNum");
    public static final Parcelable.Creator<CalendarEventPhoneNumber> CREATOR = new eeh(19);
    public static final String a = Uri.encode("#");

    public CalendarEventPhoneNumber(String str, String str2, String str3, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        ((ype) f.l().ai(3080)).D("Creating CalendarEventPhoneNumber. PIN length: %d. PIN regex: %s", str2 == null ? 0 : str2.length(), str3 == null ? "none" : str3);
    }

    public final String a() {
        return odn.a().r(mki.a.c, this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CalendarEventPhoneNumber)) {
            return false;
        }
        CalendarEventPhoneNumber calendarEventPhoneNumber = (CalendarEventPhoneNumber) obj;
        return Objects.equals(this.b, calendarEventPhoneNumber.b) && Objects.equals(this.c, calendarEventPhoneNumber.c) && Objects.equals(this.d, calendarEventPhoneNumber.d) && this.e == calendarEventPhoneNumber.e;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, Boolean.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }
}
