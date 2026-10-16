package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wog;
import defpackage.woq;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new wog(0);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    private String g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = woq.c(calendar);
        this.a = calendarC;
        this.b = calendarC.get(2);
        this.c = calendarC.get(1);
        this.d = calendarC.getMaximum(7);
        this.e = calendarC.getActualMaximum(5);
        this.f = calendarC.getTimeInMillis();
    }

    public static Month c(long j) {
        Calendar calendarE = woq.e(null);
        calendarE.setTimeInMillis(j);
        return new Month(calendarE);
    }

    public static Month d(int i, int i2) {
        Calendar calendarE = woq.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new Month(calendarE);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final int b(Month month) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return ((month.c - this.c) * 12) + (month.b - this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Month e(int i) {
        Calendar calendarC = woq.c(this.a);
        calendarC.add(2, i);
        return new Month(calendarC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final String f() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        String str2 = woq.b("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        this.g = str2;
        return str2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
