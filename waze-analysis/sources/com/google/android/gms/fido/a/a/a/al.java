package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<al> CREATOR = new am();

    /* renamed from: a, reason: collision with root package name */
    private final aq f5310a;

    /* renamed from: b, reason: collision with root package name */
    private final at f5311b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5312c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5313d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f5314e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5315f;

    /* renamed from: g, reason: collision with root package name */
    private final r f5316g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f5317h;

    /* renamed from: i, reason: collision with root package name */
    private final ba f5318i;

    /* renamed from: j, reason: collision with root package name */
    private final g f5319j;

    /* renamed from: k, reason: collision with root package name */
    private final i f5320k;

    /* renamed from: l, reason: collision with root package name */
    private final String f5321l;
    private ResultReceiver m;
    private final List n;
    private List o;

    al(aq aqVar, at atVar, byte[] bArr, List list, Double d2, List list2, r rVar, Integer num, ba baVar, String str, i iVar, String str2, ResultReceiver resultReceiver, List list3, List list4) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                al alVarA = a(new JSONObject(str2));
                this.f5310a = alVarA.f5310a;
                this.f5311b = alVarA.f5311b;
                this.f5312c = alVarA.f5312c;
                this.f5313d = alVarA.f5313d;
                this.f5314e = alVarA.f5314e;
                this.f5315f = alVarA.f5315f;
                this.f5316g = alVarA.f5316g;
                this.f5317h = alVarA.f5317h;
                this.f5318i = alVarA.f5318i;
                this.f5319j = alVarA.f5319j;
                this.f5320k = alVarA.f5320k;
                this.n = alVarA.n;
                this.o = alVarA.o;
                this.f5321l = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        com.google.android.gms.common.api.internal.av.m(aqVar);
        this.f5310a = aqVar;
        com.google.android.gms.common.api.internal.av.m(atVar);
        this.f5311b = atVar;
        com.google.android.gms.common.api.internal.av.m(bArr);
        this.f5312c = bArr;
        com.google.android.gms.common.api.internal.av.m(list);
        this.f5313d = list;
        this.f5314e = d2;
        this.f5315f = list2;
        this.f5316g = rVar;
        this.f5317h = num;
        this.f5318i = baVar;
        if (str != null) {
            try {
                this.f5319j = g.a(str);
            } catch (f e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            this.f5319j = null;
        }
        this.f5320k = iVar;
        this.o = list4;
        this.f5321l = null;
        this.n = list3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.fido.a.a.a.al a(org.json.JSONObject r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.a.a.a.al.a(org.json.JSONObject):com.google.android.gms.fido.a.a.a.al");
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        List list3;
        List list4;
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (Objects.equals(this.f5310a, alVar.f5310a) && Objects.equals(this.f5311b, alVar.f5311b) && Arrays.equals(this.f5312c, alVar.f5312c) && Objects.equals(this.f5314e, alVar.f5314e)) {
            List list5 = this.f5313d;
            List list6 = alVar.f5313d;
            if (list5.containsAll(list6) && list6.containsAll(list5) && ((((list = this.f5315f) == null && alVar.f5315f == null) || (list != null && (list2 = alVar.f5315f) != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.equals(this.f5316g, alVar.f5316g) && Objects.equals(this.f5317h, alVar.f5317h) && Objects.equals(this.f5318i, alVar.f5318i) && Objects.equals(this.f5319j, alVar.f5319j) && Objects.equals(this.f5320k, alVar.f5320k) && Objects.equals(this.f5321l, alVar.f5321l) && ((((list3 = this.n) == null && alVar.n == null) || (list3 != null && (list4 = alVar.n) != null && list3.containsAll(list4) && list4.containsAll(list3))) && Objects.equals(this.o, alVar.o)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5310a, this.f5311b, Integer.valueOf(Arrays.hashCode(this.f5312c)), this.f5313d, this.f5314e, this.f5315f, this.f5316g, this.f5317h, this.f5318i, this.f5319j, this.f5320k, this.f5321l, this.n, this.o});
    }

    public final String toString() {
        List list = this.n;
        i iVar = this.f5320k;
        g gVar = this.f5319j;
        ba baVar = this.f5318i;
        r rVar = this.f5316g;
        List list2 = this.f5315f;
        List list3 = this.f5313d;
        byte[] bArr = this.f5312c;
        at atVar = this.f5311b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.f5310a.toString() + ", \n user=" + atVar.toString() + ", \n challenge=" + a.a.O(bArr) + ", \n parameters=" + list3.toString() + ", \n timeoutSeconds=" + this.f5314e + ", \n excludeList=" + String.valueOf(list2) + ", \n authenticatorSelection=" + String.valueOf(rVar) + ", \n requestId=" + this.f5317h + ", \n tokenBinding=" + String.valueOf(baVar) + ", \n attestationConveyancePreference=" + String.valueOf(gVar) + ", \n authenticationExtensions=" + String.valueOf(iVar) + ", \n attestationFormats=" + String.valueOf(list) + ", \n hints=" + String.valueOf(this.o) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        aq aqVar = this.f5310a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.t(parcel, 2, aqVar, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 3, this.f5311b, i2);
        com.google.android.gms.common.internal.bb.l(parcel, 4, this.f5312c);
        com.google.android.gms.common.internal.bb.y(parcel, 5, this.f5313d);
        com.google.android.gms.common.internal.bb.o(parcel, this.f5314e);
        com.google.android.gms.common.internal.bb.y(parcel, 7, this.f5315f);
        com.google.android.gms.common.internal.bb.t(parcel, 8, this.f5316g, i2);
        com.google.android.gms.common.internal.bb.s(parcel, 9, this.f5317h);
        com.google.android.gms.common.internal.bb.t(parcel, 10, this.f5318i, i2);
        g gVar = this.f5319j;
        com.google.android.gms.common.internal.bb.u(parcel, 11, gVar == null ? null : gVar.toString());
        com.google.android.gms.common.internal.bb.t(parcel, 12, this.f5320k, i2);
        com.google.android.gms.common.internal.bb.u(parcel, 13, this.f5321l);
        com.google.android.gms.common.internal.bb.t(parcel, 14, this.m, i2);
        com.google.android.gms.common.internal.bb.w(parcel, 15, this.n);
        com.google.android.gms.common.internal.bb.y(parcel, 16, this.o);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }

    public al(String str) {
        try {
            al alVarA = a(new JSONObject(str));
            this.f5310a = alVarA.f5310a;
            this.f5311b = alVarA.f5311b;
            this.f5312c = alVarA.f5312c;
            this.f5313d = alVarA.f5313d;
            this.f5314e = alVarA.f5314e;
            this.f5315f = alVarA.f5315f;
            this.f5316g = alVarA.f5316g;
            this.f5317h = alVarA.f5317h;
            this.f5318i = alVarA.f5318i;
            this.f5319j = alVarA.f5319j;
            this.f5320k = alVarA.f5320k;
            this.n = alVarA.n;
            this.o = alVarA.o;
            this.f5321l = str;
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
