package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<i> CREATOR = new e(3, null);

    /* renamed from: a, reason: collision with root package name */
    private final aa f5394a;

    /* renamed from: b, reason: collision with root package name */
    private final v f5395b;

    /* renamed from: c, reason: collision with root package name */
    private final bb f5396c;

    /* renamed from: d, reason: collision with root package name */
    private final ab f5397d;

    /* renamed from: e, reason: collision with root package name */
    private final ac f5398e;

    /* renamed from: f, reason: collision with root package name */
    private final ad f5399f;

    /* renamed from: g, reason: collision with root package name */
    private final w f5400g;

    /* renamed from: h, reason: collision with root package name */
    private final af f5401h;

    /* renamed from: i, reason: collision with root package name */
    private final ae f5402i;

    /* renamed from: j, reason: collision with root package name */
    private final ai f5403j;

    /* renamed from: k, reason: collision with root package name */
    private final ax f5404k;

    /* renamed from: l, reason: collision with root package name */
    private final ag f5405l;
    private final ah m;

    i(aa aaVar, v vVar, bb bbVar, ab abVar, ac acVar, ad adVar, w wVar, af afVar, ae aeVar, ai aiVar, ax axVar, ag agVar, ah ahVar) {
        this.f5394a = aaVar;
        this.f5396c = bbVar;
        this.f5395b = vVar;
        this.f5397d = abVar;
        this.f5398e = acVar;
        this.f5399f = adVar;
        this.f5400g = wVar;
        this.f5401h = afVar;
        this.f5402i = aeVar;
        this.f5403j = aiVar;
        this.f5404k = axVar;
        this.f5405l = agVar;
        this.m = ahVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f5394a, iVar.f5394a) && Objects.equals(this.f5395b, iVar.f5395b) && Objects.equals(this.f5396c, iVar.f5396c) && Objects.equals(this.f5397d, iVar.f5397d) && Objects.equals(this.f5398e, iVar.f5398e) && Objects.equals(this.f5399f, iVar.f5399f) && Objects.equals(this.f5400g, iVar.f5400g) && Objects.equals(this.f5401h, iVar.f5401h) && Objects.equals(this.f5402i, iVar.f5402i) && Objects.equals(this.f5403j, iVar.f5403j) && Objects.equals(this.f5404k, iVar.f5404k) && Objects.equals(this.f5405l, iVar.f5405l) && Objects.equals(this.m, iVar.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5394a, this.f5395b, this.f5396c, this.f5397d, this.f5398e, this.f5399f, this.f5400g, this.f5401h, this.f5402i, this.f5403j, this.f5404k, this.f5405l, this.m});
    }

    public final String toString() {
        ah ahVar = this.m;
        ax axVar = this.f5404k;
        ai aiVar = this.f5403j;
        ae aeVar = this.f5402i;
        af afVar = this.f5401h;
        w wVar = this.f5400g;
        ad adVar = this.f5399f;
        ac acVar = this.f5398e;
        ab abVar = this.f5397d;
        bb bbVar = this.f5396c;
        v vVar = this.f5395b;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f5394a) + ", \n cableAuthenticationExtension=" + String.valueOf(vVar) + ", \n userVerificationMethodExtension=" + String.valueOf(bbVar) + ", \n googleMultiAssertionExtension=" + String.valueOf(abVar) + ", \n googleSessionIdExtension=" + String.valueOf(acVar) + ", \n googleSilentVerificationExtension=" + String.valueOf(adVar) + ", \n devicePublicKeyExtension=" + String.valueOf(wVar) + ", \n googleTunnelServerIdExtension=" + String.valueOf(afVar) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(aeVar) + ", \n prfExtension=" + String.valueOf(aiVar) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(axVar) + ", \n paymentExtension=" + String.valueOf(ahVar) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        aa aaVar = this.f5394a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.t(parcel, 2, aaVar, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 3, this.f5395b, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 4, this.f5396c, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 5, this.f5397d, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 6, this.f5398e, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 7, this.f5399f, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 8, this.f5400g, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 9, this.f5401h, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 10, this.f5402i, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 11, this.f5403j, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 12, this.f5404k, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 13, this.f5405l, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 14, this.m, i2);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
