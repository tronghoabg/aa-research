package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class s extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<s> CREATOR = new n(2);

    /* renamed from: a, reason: collision with root package name */
    private final String f4545a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4546b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4547c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4548d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4549e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4550f;

    /* renamed from: g, reason: collision with root package name */
    private final List f4551g;

    s(String str, String str2, String str3, String str4, boolean z, int i2, List list) {
        av.m(str);
        this.f4545a = str;
        this.f4546b = str2;
        this.f4547c = str3;
        this.f4548d = str4;
        this.f4549e = z;
        this.f4550f = i2;
        this.f4551g = list;
    }

    public static r a(s sVar) {
        r rVar = new r();
        rVar.f(sVar.f4545a);
        rVar.d(sVar.f4548d);
        rVar.b(sVar.f4546b);
        rVar.e(sVar.f4549e);
        rVar.h(sVar.f4550f);
        rVar.c(sVar.f4551g);
        String str = sVar.f4547c;
        if (str != null) {
            rVar.g(str);
        }
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(this.f4545a, sVar.f4545a) && Objects.equals(this.f4548d, sVar.f4548d) && Objects.equals(this.f4546b, sVar.f4546b) && Objects.equals(Boolean.valueOf(this.f4549e), Boolean.valueOf(sVar.f4549e)) && this.f4550f == sVar.f4550f && Objects.equals(this.f4551g, sVar.f4551g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4545a, this.f4546b, this.f4548d, Boolean.valueOf(this.f4549e), Integer.valueOf(this.f4550f), this.f4551g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f4545a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.u(parcel, 2, this.f4546b);
        bb.u(parcel, 3, this.f4547c);
        bb.u(parcel, 4, this.f4548d);
        bb.f(parcel, 5, this.f4549e);
        bb.g(parcel, 6, this.f4550f);
        bb.y(parcel, 7, this.f4551g);
        bb.e(parcel, iD);
    }
}
