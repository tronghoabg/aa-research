package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.gms.a.b.b.b(2);

    /* renamed from: a, reason: collision with root package name */
    private final String f4490a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4491b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4492c;

    /* renamed from: d, reason: collision with root package name */
    private final List f4493d;

    /* renamed from: e, reason: collision with root package name */
    private final GoogleSignInAccount f4494e;

    /* renamed from: f, reason: collision with root package name */
    private final PendingIntent f4495f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f4496g;

    public d(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f4490a = str;
        this.f4491b = str2;
        this.f4492c = str3;
        av.m(list);
        this.f4493d = list;
        this.f4494e = googleSignInAccount;
        this.f4495f = pendingIntent;
        this.f4496g = bundle;
    }

    public final PendingIntent a() {
        return this.f4495f;
    }

    public final String b() {
        return this.f4490a;
    }

    public final boolean c() {
        return this.f4495f != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f4490a, dVar.f4490a) && Objects.equals(this.f4491b, dVar.f4491b) && Objects.equals(this.f4492c, dVar.f4492c) && Objects.equals(this.f4493d, dVar.f4493d) && Objects.equals(this.f4495f, dVar.f4495f) && Objects.equals(this.f4494e, dVar.f4494e) && Objects.equals(this.f4496g, dVar.f4496g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4490a, this.f4491b, this.f4492c, this.f4493d, this.f4495f, this.f4494e, this.f4496g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 1, this.f4490a);
        bb.u(parcel, 2, this.f4491b);
        bb.u(parcel, 3, this.f4492c);
        bb.w(parcel, 4, this.f4493d);
        bb.t(parcel, 5, this.f4494e, i2);
        bb.t(parcel, 6, this.f4495f, i2);
        bb.k(parcel, 7, this.f4496g);
        bb.e(parcel, iD);
    }
}
