package com.google.android.gms.auth.api.identity;

import T6.f;
import a.AbstractC1304a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class AuthorizationRequest extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new f(10);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26367b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26369d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f26370e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26371f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26372g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26373h;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z2, boolean z10, Account account, String str2, String str3, boolean z11) {
        boolean z12 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = true;
        }
        AbstractC1732v.a("requestedScopes cannot be null or empty", z12);
        this.f26366a = arrayList;
        this.f26367b = str;
        this.f26368c = z2;
        this.f26369d = z10;
        this.f26370e = account;
        this.f26371f = str2;
        this.f26372g = str3;
        this.f26373h = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f26366a;
        return arrayList.size() == authorizationRequest.f26366a.size() && arrayList.containsAll(authorizationRequest.f26366a) && this.f26368c == authorizationRequest.f26368c && this.f26373h == authorizationRequest.f26373h && this.f26369d == authorizationRequest.f26369d && AbstractC1732v.m(this.f26367b, authorizationRequest.f26367b) && AbstractC1732v.m(this.f26370e, authorizationRequest.f26370e) && AbstractC1732v.m(this.f26371f, authorizationRequest.f26371f) && AbstractC1732v.m(this.f26372g, authorizationRequest.f26372g);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f26368c);
        Boolean boolValueOf2 = Boolean.valueOf(this.f26373h);
        Boolean boolValueOf3 = Boolean.valueOf(this.f26369d);
        return Arrays.hashCode(new Object[]{this.f26366a, this.f26367b, boolValueOf, boolValueOf2, boolValueOf3, this.f26370e, this.f26371f, this.f26372g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f26366a, false);
        AbstractC1304a.a0(parcel, 2, this.f26367b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f26368c ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f26369d ? 1 : 0);
        AbstractC1304a.Z(parcel, 5, this.f26370e, i5, false);
        AbstractC1304a.a0(parcel, 6, this.f26371f, false);
        AbstractC1304a.a0(parcel, 7, this.f26372g, false);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f26373h ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
