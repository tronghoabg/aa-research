package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class CrashInfoParcel implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CrashInfoParcel> CREATOR = new defpackage.qpf(20);
    public final android.app.ApplicationErrorReport.CrashInfo a;

    public CrashInfoParcel(java.lang.Throwable th) {
        if (th == null) {
            this.a = null;
        } else {
            this.a = new android.app.ApplicationErrorReport.CrashInfo(th);
        }
    }

    public static java.lang.String a(android.app.ApplicationErrorReport.CrashInfo crashInfo) {
        if (crashInfo == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        crashInfo.dump(new android.util.StringBuilderPrinter(sb), "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.app.ApplicationErrorReport.CrashInfo crashInfo = this.a;
        if (crashInfo == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            crashInfo.writeToParcel(parcel, i);
        }
    }

    public CrashInfoParcel(android.os.Parcel parcel) {
        this.a = new android.app.ApplicationErrorReport.CrashInfo(parcel);
    }
}
