package com.google.android.apps.auto.components.telecom;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class PhoneCall implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.telecom.PhoneCall> CREATOR = new defpackage.kid(9);
    public final int a;
    public final defpackage.oeg b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final android.content.ComponentName f;
    public final java.lang.String g;
    public final android.graphics.Bitmap h;
    public final int i;

    public PhoneCall(int i, defpackage.oeg oegVar, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, int i2, android.content.ComponentName componentName, java.lang.String str4) {
        this.a = i;
        this.b = oegVar;
        str.getClass();
        this.c = str;
        this.d = str2;
        str3.getClass();
        this.e = str3;
        this.h = bitmap;
        this.f = componentName;
        this.i = i2;
        this.g = str4;
    }

    public final boolean a() {
        defpackage.oeg oegVar = this.b;
        return oegVar == defpackage.oeg.HOLDING || oegVar == defpackage.oeg.ACTIVE || oegVar == defpackage.oeg.CONNECTING || oegVar == defpackage.oeg.DIALING;
    }

    public final boolean b() {
        return defpackage.mkt.b.equals(this.f);
    }

    public final boolean c() {
        return this.b == defpackage.oeg.RINGING;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.apps.auto.components.telecom.PhoneCall)) {
            return false;
        }
        com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
        return this.a == phoneCall.a && j$.util.Objects.equals(this.b, phoneCall.b) && j$.util.Objects.equals(this.c, phoneCall.c) && j$.util.Objects.equals(this.d, phoneCall.d) && j$.util.Objects.equals(this.e, phoneCall.e) && j$.util.Objects.equals(this.f, phoneCall.f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.f("callId", this.a);
        xymVarBy.b("state", this.b);
        xymVarBy.b("contactType", this.e);
        xymVarBy.b("callingComponentName", this.f);
        return xymVarBy.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.l);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.g);
    }
}
