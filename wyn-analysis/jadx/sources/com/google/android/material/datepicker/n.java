package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import c6.C1559a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new C1559a(16);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f26949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26953e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26954f;

    /* renamed from: g, reason: collision with root package name */
    public String f26955g;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = v.a(calendar);
        this.f26949a = calendarA;
        this.f26950b = calendarA.get(2);
        this.f26951c = calendarA.get(1);
        this.f26952d = calendarA.getMaximum(7);
        this.f26953e = calendarA.getActualMaximum(5);
        this.f26954f = calendarA.getTimeInMillis();
    }

    public static n c(int i5, int i10) {
        Calendar calendarC = v.c(null);
        calendarC.set(1, i5);
        calendarC.set(2, i10);
        return new n(calendarC);
    }

    public static n e(long j8) {
        Calendar calendarC = v.c(null);
        calendarC.setTimeInMillis(j8);
        return new n(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26949a.compareTo(((n) obj).f26949a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f26950b == nVar.f26950b && this.f26951c == nVar.f26951c;
    }

    public final String f() {
        String dateTime;
        if (this.f26955g == null) {
            long timeInMillis = this.f26949a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = v.f26968a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                dateTime = instanceForSkeleton.format(new Date(timeInMillis));
            } else {
                dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f26955g = dateTime;
        }
        return this.f26955g;
    }

    public final int g(n nVar) {
        if (!(this.f26949a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (nVar.f26950b - this.f26950b) + ((nVar.f26951c - this.f26951c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26950b), Integer.valueOf(this.f26951c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f26951c);
        parcel.writeInt(this.f26950b);
    }
}
