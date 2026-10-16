package com.google.android.gms.auth;

import T6.f;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TokenData extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f26357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26358b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f26359c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26360d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26361e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f26362f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26363g;

    public TokenData(int i5, String str, Long l10, boolean z2, boolean z10, ArrayList arrayList, String str2) {
        this.f26357a = i5;
        AbstractC1732v.f(str);
        this.f26358b = str;
        this.f26359c = l10;
        this.f26360d = z2;
        this.f26361e = z10;
        this.f26362f = arrayList;
        this.f26363g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f26358b, tokenData.f26358b) && AbstractC1732v.m(this.f26359c, tokenData.f26359c) && this.f26360d == tokenData.f26360d && this.f26361e == tokenData.f26361e && AbstractC1732v.m(this.f26362f, tokenData.f26362f) && AbstractC1732v.m(this.f26363g, tokenData.f26363g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26358b, this.f26359c, Boolean.valueOf(this.f26360d), Boolean.valueOf(this.f26361e), this.f26362f, this.f26363g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26357a);
        AbstractC1304a.a0(parcel, 2, this.f26358b, false);
        AbstractC1304a.Y(parcel, 3, this.f26359c);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f26360d ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f26361e ? 1 : 0);
        AbstractC1304a.c0(parcel, 6, this.f26362f);
        AbstractC1304a.a0(parcel, 7, this.f26363g, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
