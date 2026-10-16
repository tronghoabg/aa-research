package com.google.android.apps.auto.components.telecom;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khy;
import defpackage.mkn;
import defpackage.odm;
import defpackage.woy;
import defpackage.xxg;
import j$.util.Objects;

/* loaded from: classes.dex */
public class PhoneCall implements Parcelable {
    public static final Parcelable.Creator<PhoneCall> CREATOR = new khy(9);
    public final int a;
    public final odm b;
    public final String c;
    public final String d;
    public final String e;
    public final ComponentName f;
    public final String g;
    public final Bitmap h;
    public final int i;

    public PhoneCall(int i, odm odmVar, String str, String str2, String str3, Bitmap bitmap, int i2, ComponentName componentName, String str4) {
        this.a = i;
        this.b = odmVar;
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
        odm odmVar = this.b;
        return odmVar == odm.HOLDING || odmVar == odm.ACTIVE || odmVar == odm.CONNECTING || odmVar == odm.DIALING;
    }

    public final boolean b() {
        return mkn.b.equals(this.f);
    }

    public final boolean c() {
        return this.b == odm.RINGING;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneCall)) {
            return false;
        }
        PhoneCall phoneCall = (PhoneCall) obj;
        return this.a == phoneCall.a && Objects.equals(this.b, phoneCall.b) && Objects.equals(this.c, phoneCall.c) && Objects.equals(this.d, phoneCall.d) && Objects.equals(this.e, phoneCall.e) && Objects.equals(this.f, phoneCall.f);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("callId", this.a);
        xxgVarAo.b("state", this.b);
        xxgVarAo.b("contactType", this.e);
        xxgVarAo.b("callingComponentName", this.f);
        return xxgVarAo.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
