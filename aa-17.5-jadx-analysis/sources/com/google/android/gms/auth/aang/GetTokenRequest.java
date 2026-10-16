package com.google.android.gms.auth.aang;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import defpackage.tqm;
import java.util.List;

/* loaded from: classes2.dex */
public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetTokenRequest> CREATOR = new qoj(5);
    public final GoogleAccount a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;
    public final boolean n;
    public final int o;

    public GetTokenRequest(GoogleAccount googleAccount, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2, Network network, boolean z3, int i2) {
        this.a = googleAccount;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
        this.n = z3;
        this.o = i2;
    }

    public static tqm a() {
        tqm tqmVar = new tqm((byte[]) null);
        tqmVar.b = (byte) (tqmVar.b | 2);
        tqmVar.g(0);
        tqmVar.h(false);
        tqmVar.i(false);
        tqmVar.a = 1;
        tqmVar.b = (byte) (tqmVar.b | 16);
        return tqmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, googleAccount, i);
        spu.F(parcel, 2, this.b);
        spu.H(parcel, 3, this.c);
        spu.H(parcel, 4, this.d);
        spu.H(parcel, 5, this.e);
        spu.H(parcel, 6, this.f);
        spu.r(parcel, 7, this.g);
        spu.F(parcel, 8, this.h);
        spu.n(parcel, 9, this.i);
        spu.v(parcel, 10, this.j);
        spu.F(parcel, 11, this.k);
        spu.n(parcel, 12, this.l);
        spu.E(parcel, 13, this.m, i);
        spu.n(parcel, 14, this.n);
        spu.r(parcel, 15, this.o);
        spu.m(parcel, iL);
    }
}
