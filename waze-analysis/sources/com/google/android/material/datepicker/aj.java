package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements Comparable<aj>, Parcelable {
    public static final Parcelable.Creator<aj> CREATOR = new i(3);

    /* renamed from: a, reason: collision with root package name */
    final int f6398a;

    /* renamed from: b, reason: collision with root package name */
    final int f6399b;

    /* renamed from: c, reason: collision with root package name */
    final int f6400c;

    /* renamed from: d, reason: collision with root package name */
    final int f6401d;

    /* renamed from: e, reason: collision with root package name */
    final long f6402e;

    /* renamed from: f, reason: collision with root package name */
    private final Calendar f6403f;

    /* renamed from: g, reason: collision with root package name */
    private String f6404g;

    private aj(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarI = ax.i(calendar);
        this.f6403f = calendarI;
        this.f6398a = calendarI.get(2);
        this.f6399b = calendarI.get(1);
        this.f6400c = calendarI.getMaximum(7);
        this.f6401d = calendarI.getActualMaximum(5);
        this.f6402e = calendarI.getTimeInMillis();
    }

    static aj g(long j2) {
        Calendar calendarK = ax.k();
        calendarK.setTimeInMillis(j2);
        return new aj(calendarK);
    }

    static aj h(int i2, int i3) {
        Calendar calendarK = ax.k();
        calendarK.set(1, i2);
        calendarK.set(2, i3);
        return new aj(calendarK);
    }

    static aj i() {
        return new aj(ax.j());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aj ajVar) {
        return this.f6403f.compareTo(ajVar.f6403f);
    }

    final int b(int i2) {
        Calendar calendar = this.f6403f;
        int i3 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + this.f6400c : i4;
    }

    final int c(long j2) {
        Calendar calendarI = ax.i(this.f6403f);
        calendarI.setTimeInMillis(j2);
        return calendarI.get(5);
    }

    final int d(aj ajVar) {
        if (!(this.f6403f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return ((ajVar.f6399b - this.f6399b) * 12) + (ajVar.f6398a - this.f6398a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final long e(int i2) {
        Calendar calendarI = ax.i(this.f6403f);
        calendarI.set(5, i2);
        return calendarI.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.f6398a == ajVar.f6398a && this.f6399b == ajVar.f6399b;
    }

    final long f() {
        return this.f6403f.getTimeInMillis();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6398a), Integer.valueOf(this.f6399b)});
    }

    final aj j(int i2) {
        Calendar calendarI = ax.i(this.f6403f);
        calendarI.add(2, i2);
        return new aj(calendarI);
    }

    final String k() {
        String str = this.f6404g;
        if (str != null) {
            return str;
        }
        String str2 = ax.e(Locale.getDefault()).format(new Date(this.f6403f.getTimeInMillis()));
        this.f6404g = str2;
        return str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6399b);
        parcel.writeInt(this.f6398a);
    }
}
