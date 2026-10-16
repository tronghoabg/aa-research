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
import w7.C4380h;
import w7.C4381i;

@Deprecated
/* loaded from: classes3.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C4381i(7);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f26714a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f26715b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f26716c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26717d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f26718e;

    /* renamed from: f, reason: collision with root package name */
    public final C4375c f26719f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26720g;

    public SignRequestParams(Integer num, Double d3, Uri uri, byte[] bArr, ArrayList arrayList, C4375c c4375c, String str) {
        this.f26714a = num;
        this.f26715b = d3;
        this.f26716c = uri;
        this.f26717d = bArr;
        AbstractC1732v.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f26718e = arrayList;
        this.f26719f = c4375c;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4380h c4380h = (C4380h) it.next();
            AbstractC1732v.a("registered key has null appId and no request appId is provided", (c4380h.f47389b == null && uri == null) ? false : true);
            String str2 = c4380h.f47389b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        AbstractC1732v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f26720g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (!AbstractC1732v.m(this.f26714a, signRequestParams.f26714a) || !AbstractC1732v.m(this.f26715b, signRequestParams.f26715b) || !AbstractC1732v.m(this.f26716c, signRequestParams.f26716c) || !Arrays.equals(this.f26717d, signRequestParams.f26717d)) {
            return false;
        }
        ArrayList arrayList = this.f26718e;
        ArrayList arrayList2 = signRequestParams.f26718e;
        return arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && AbstractC1732v.m(this.f26719f, signRequestParams.f26719f) && AbstractC1732v.m(this.f26720g, signRequestParams.f26720g);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.f26717d));
        return Arrays.hashCode(new Object[]{this.f26714a, this.f26716c, this.f26715b, this.f26718e, this.f26719f, this.f26720g, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.X(parcel, 2, this.f26714a);
        AbstractC1304a.U(parcel, 3, this.f26715b);
        AbstractC1304a.Z(parcel, 4, this.f26716c, i5, false);
        AbstractC1304a.T(parcel, 5, this.f26717d, false);
        AbstractC1304a.e0(parcel, 6, this.f26718e, false);
        AbstractC1304a.Z(parcel, 7, this.f26719f, i5, false);
        AbstractC1304a.a0(parcel, 8, this.f26720g, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
