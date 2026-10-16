package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpd implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public wpd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        if (this.a == 0) {
            return com.google.android.material.datepicker.Month.d(parcel.readInt(), parcel.readInt());
        }
        return new com.google.android.material.datepicker.CalendarConstraints((com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (com.google.android.material.datepicker.CalendarConstraints.DateValidator) parcel.readParcelable(com.google.android.material.datepicker.CalendarConstraints.DateValidator.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return this.a != 0 ? new com.google.android.material.datepicker.CalendarConstraints[i] : new com.google.android.material.datepicker.Month[i];
    }
}
