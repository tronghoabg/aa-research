package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.fido.a.a.a.aj;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class w extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<w> CREATOR = new n(8);

    /* renamed from: a, reason: collision with root package name */
    private final String f4559a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4560b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4561c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4562d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f4563e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4564f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4565g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4566h;

    /* renamed from: i, reason: collision with root package name */
    private final aj f4567i;

    w(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, aj ajVar) {
        av.m(str);
        this.f4559a = str;
        this.f4560b = str2;
        this.f4561c = str3;
        this.f4562d = str4;
        this.f4563e = uri;
        this.f4564f = str5;
        this.f4565g = str6;
        this.f4566h = str7;
        this.f4567i = ajVar;
    }

    public final Uri a() {
        return this.f4563e;
    }

    public final aj b() {
        return this.f4567i;
    }

    public final String c() {
        return this.f4560b;
    }

    public final String d() {
        return this.f4562d;
    }

    public final String e() {
        return this.f4561c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Objects.equals(this.f4559a, wVar.f4559a) && Objects.equals(this.f4560b, wVar.f4560b) && Objects.equals(this.f4561c, wVar.f4561c) && Objects.equals(this.f4562d, wVar.f4562d) && Objects.equals(this.f4563e, wVar.f4563e) && Objects.equals(this.f4564f, wVar.f4564f) && Objects.equals(this.f4565g, wVar.f4565g) && Objects.equals(this.f4566h, wVar.f4566h) && Objects.equals(this.f4567i, wVar.f4567i);
    }

    public final String f() {
        return this.f4565g;
    }

    public final String g() {
        return this.f4559a;
    }

    public final String h() {
        return this.f4564f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4559a, this.f4560b, this.f4561c, this.f4562d, this.f4563e, this.f4564f, this.f4565g, this.f4566h, this.f4567i});
    }

    @Deprecated
    public final String i() {
        return this.f4566h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 1, this.f4559a);
        bb.u(parcel, 2, this.f4560b);
        bb.u(parcel, 3, this.f4561c);
        bb.u(parcel, 4, this.f4562d);
        bb.t(parcel, 5, this.f4563e, i2);
        bb.u(parcel, 6, this.f4564f);
        bb.u(parcel, 7, this.f4565g);
        bb.u(parcel, 8, this.f4566h);
        bb.t(parcel, 9, this.f4567i, i2);
        bb.e(parcel, iD);
    }
}
