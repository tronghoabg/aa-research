package com.google.android.gms.fido.u2f.api.common;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import w7.C4375c;
import w7.C4379g;
import w7.C4380h;
import w7.C4381i;

@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C4381i(5);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f26707a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f26708b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f26709c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26710d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f26711e;

    /* renamed from: f, reason: collision with root package name */
    public final C4375c f26712f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26713g;

    public RegisterRequestParams(Integer num, Double d3, Uri uri, ArrayList arrayList, ArrayList arrayList2, C4375c c4375c, String str) {
        this.f26707a = num;
        this.f26708b = d3;
        this.f26709c = uri;
        AbstractC1732v.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f26710d = arrayList;
        this.f26711e = arrayList2;
        this.f26712f = c4375c;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4379g c4379g = (C4379g) it.next();
            AbstractC1732v.a("register request has null appId and no request appId is provided", (uri == null && c4379g.f47387d == null) ? false : true);
            String str2 = c4379g.f47387d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C4380h c4380h = (C4380h) it2.next();
            AbstractC1732v.a("registered key has null appId and no request appId is provided", (uri == null && c4380h.f47389b == null) ? false : true);
            String str3 = c4380h.f47389b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        AbstractC1732v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f26713g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (!AbstractC1732v.m(this.f26707a, registerRequestParams.f26707a) || !AbstractC1732v.m(this.f26708b, registerRequestParams.f26708b) || !AbstractC1732v.m(this.f26709c, registerRequestParams.f26709c) || !AbstractC1732v.m(this.f26710d, registerRequestParams.f26710d)) {
            return false;
        }
        ArrayList arrayList = this.f26711e;
        ArrayList arrayList2 = registerRequestParams.f26711e;
        return ((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && AbstractC1732v.m(this.f26712f, registerRequestParams.f26712f) && AbstractC1732v.m(this.f26713g, registerRequestParams.f26713g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26707a, this.f26709c, this.f26708b, this.f26710d, this.f26711e, this.f26712f, this.f26713g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.X(parcel, 2, this.f26707a);
        AbstractC1304a.U(parcel, 3, this.f26708b);
        AbstractC1304a.Z(parcel, 4, this.f26709c, i5, false);
        AbstractC1304a.e0(parcel, 5, this.f26710d, false);
        AbstractC1304a.e0(parcel, 6, this.f26711e, false);
        AbstractC1304a.Z(parcel, 7, this.f26712f, i5, false);
        AbstractC1304a.a0(parcel, 8, this.f26713g, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
