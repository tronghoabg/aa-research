package com.google.android.gms.clearcut.internal;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class LogErrorParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.clearcut.internal.LogErrorParcelable> CREATOR = new defpackage.rcy(16);
    public final java.lang.String a;
    public final int b;
    public int c;

    public LogErrorParcelable(java.lang.String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.clearcut.internal.LogErrorParcelable)) {
            return false;
        }
        com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable = (com.google.android.gms.clearcut.internal.LogErrorParcelable) obj;
        return j$.util.Objects.equals(this.a, logErrorParcelable.a) && this.b == logErrorParcelable.b && this.c == logErrorParcelable.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        java.lang.String str = this.a;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 1);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        int i3 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        defpackage.sqs.q(parcel, iP);
    }
}
