package com.google.android.gms.car;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.StringBuilderPrinter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qoj;

/* loaded from: classes2.dex */
public class CrashInfoParcel implements ReflectedParcelable {
    public static final Parcelable.Creator<CrashInfoParcel> CREATOR = new qoj(20);
    public final ApplicationErrorReport.CrashInfo a;

    public CrashInfoParcel(Throwable th) {
        if (th == null) {
            this.a = null;
        } else {
            this.a = new ApplicationErrorReport.CrashInfo(th);
        }
    }

    public static String a(ApplicationErrorReport.CrashInfo crashInfo) {
        if (crashInfo == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        crashInfo.dump(new StringBuilderPrinter(sb), "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return a(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ApplicationErrorReport.CrashInfo crashInfo = this.a;
        if (crashInfo == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            crashInfo.writeToParcel(parcel, i);
        }
    }

    public CrashInfoParcel(Parcel parcel) {
        this.a = new ApplicationErrorReport.CrashInfo(parcel);
    }
}
