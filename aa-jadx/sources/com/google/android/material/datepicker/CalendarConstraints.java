package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarConstraints implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CalendarConstraints> CREATOR = new defpackage.wpd(1);
    public final com.google.android.material.datepicker.Month a;
    public final com.google.android.material.datepicker.Month b;
    public final com.google.android.material.datepicker.CalendarConstraints.DateValidator c;
    public final com.google.android.material.datepicker.Month d;
    public final int e;
    public final int f;
    public final int g;

    public interface DateValidator extends android.os.Parcelable {
        boolean a();
    }

    public CalendarConstraints(com.google.android.material.datepicker.Month month, com.google.android.material.datepicker.Month month2, com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator, com.google.android.material.datepicker.Month month3, int i) {
        month.getClass();
        month2.getClass();
        dateValidator.getClass();
        this.a = month;
        this.b = month2;
        this.d = month3;
        this.e = i;
        this.c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new java.lang.IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new java.lang.IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > defpackage.wpn.e(null).getMaximum(7)) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = month.b(month2) + 1;
        this.f = (month2.c - month.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.CalendarConstraints)) {
            return false;
        }
        com.google.android.material.datepicker.CalendarConstraints calendarConstraints = (com.google.android.material.datepicker.CalendarConstraints) obj;
        return this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && j$.util.Objects.equals(this.d, calendarConstraints.d) && this.e == calendarConstraints.e && this.c.equals(calendarConstraints.c);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.d, java.lang.Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
