package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class Month implements java.lang.Comparable<com.google.android.material.datepicker.Month>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.Month> CREATOR = new defpackage.wpd(0);
    public final java.util.Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    private java.lang.String g;

    public Month(java.util.Calendar calendar) {
        calendar.set(5, 1);
        java.util.Calendar calendarC = defpackage.wpn.c(calendar);
        this.a = calendarC;
        this.b = calendarC.get(2);
        this.c = calendarC.get(1);
        this.d = calendarC.getMaximum(7);
        this.e = calendarC.getActualMaximum(5);
        this.f = calendarC.getTimeInMillis();
    }

    public static com.google.android.material.datepicker.Month c(long j) {
        java.util.Calendar calendarE = defpackage.wpn.e(null);
        calendarE.setTimeInMillis(j);
        return new com.google.android.material.datepicker.Month(calendarE);
    }

    public static com.google.android.material.datepicker.Month d(int i, int i2) {
        java.util.Calendar calendarE = defpackage.wpn.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new com.google.android.material.datepicker.Month(calendarE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.material.datepicker.Month month) {
        return this.a.compareTo(month.a);
    }

    public final int b(com.google.android.material.datepicker.Month month) {
        if (!(this.a instanceof java.util.GregorianCalendar)) {
            throw new java.lang.IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return ((month.c - this.c) * 12) + (month.b - this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.google.android.material.datepicker.Month e(int i) {
        java.util.Calendar calendarC = defpackage.wpn.c(this.a);
        calendarC.add(2, i);
        return new com.google.android.material.datepicker.Month(calendarC);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.Month)) {
            return false;
        }
        com.google.android.material.datepicker.Month month = (com.google.android.material.datepicker.Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final java.lang.String f() {
        java.lang.String str = this.g;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = defpackage.wpn.b("yMMMM", java.util.Locale.getDefault()).format(new java.util.Date(this.a.getTimeInMillis()));
        this.g = str2;
        return str2;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
