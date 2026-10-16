package com.google.android.gms.common.api;

import Y2.B;
import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Status extends AbstractC2614a implements t, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f26429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26430b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f26431c;

    /* renamed from: d, reason: collision with root package name */
    public final d7.b f26432d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f26424e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f26425f = new Status(14, null, null, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f26426g = new Status(8, null, null, null);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f26427h = new Status(15, null, null, null);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f26428i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new A(1);

    public Status(int i5, String str, PendingIntent pendingIntent, d7.b bVar) {
        this.f26429a = i5;
        this.f26430b = str;
        this.f26431c = pendingIntent;
        this.f26432d = bVar;
    }

    public final boolean V() {
        return this.f26429a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f26429a == status.f26429a && AbstractC1732v.m(this.f26430b, status.f26430b) && AbstractC1732v.m(this.f26431c, status.f26431c) && AbstractC1732v.m(this.f26432d, status.f26432d);
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26429a), this.f26430b, this.f26431c, this.f26432d});
    }

    public final String toString() {
        B b5 = new B(this);
        String strA = this.f26430b;
        if (strA == null) {
            strA = x7.z.a(this.f26429a);
        }
        b5.g(strA, "statusCode");
        b5.g(this.f26431c, "resolution");
        return b5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26429a);
        AbstractC1304a.a0(parcel, 2, this.f26430b, false);
        AbstractC1304a.Z(parcel, 3, this.f26431c, i5, false);
        AbstractC1304a.Z(parcel, 4, this.f26432d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
