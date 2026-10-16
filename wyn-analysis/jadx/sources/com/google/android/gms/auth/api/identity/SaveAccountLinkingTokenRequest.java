package com.google.android.gms.auth.api.identity;

import T6.f;
import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class SaveAccountLinkingTokenRequest extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new f(20);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f26374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26376c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26377d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26378e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26379f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i5) {
        this.f26374a = pendingIntent;
        this.f26375b = str;
        this.f26376c = str2;
        this.f26377d = arrayList;
        this.f26378e = str3;
        this.f26379f = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f26377d;
        return arrayList.size() == saveAccountLinkingTokenRequest.f26377d.size() && arrayList.containsAll(saveAccountLinkingTokenRequest.f26377d) && AbstractC1732v.m(this.f26374a, saveAccountLinkingTokenRequest.f26374a) && AbstractC1732v.m(this.f26375b, saveAccountLinkingTokenRequest.f26375b) && AbstractC1732v.m(this.f26376c, saveAccountLinkingTokenRequest.f26376c) && AbstractC1732v.m(this.f26378e, saveAccountLinkingTokenRequest.f26378e) && this.f26379f == saveAccountLinkingTokenRequest.f26379f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26374a, this.f26375b, this.f26376c, this.f26377d, this.f26378e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f26374a, i5, false);
        AbstractC1304a.a0(parcel, 2, this.f26375b, false);
        AbstractC1304a.a0(parcel, 3, this.f26376c, false);
        AbstractC1304a.c0(parcel, 4, this.f26377d);
        AbstractC1304a.a0(parcel, 5, this.f26378e, false);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f26379f);
        AbstractC1304a.m0(iL0, parcel);
    }
}
