package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<f> CREATOR = new n(3);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4506b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4507c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4508d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4509e;

    /* renamed from: f, reason: collision with root package name */
    private final List f4510f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4511g;

    /* renamed from: h, reason: collision with root package name */
    private final List f4512h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4513i;

    f(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3, List list2, String str4) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        av.d(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
        this.f4505a = z;
        if (z) {
            av.n(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f4506b = str;
        this.f4507c = str2;
        this.f4508d = z2;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList(list);
            Collections.sort(arrayList);
        }
        this.f4510f = arrayList;
        this.f4509e = str3;
        this.f4511g = z3;
        this.f4512h = list2;
        this.f4513i = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4505a == fVar.f4505a && Objects.equals(this.f4506b, fVar.f4506b) && Objects.equals(this.f4507c, fVar.f4507c) && this.f4508d == fVar.f4508d && Objects.equals(this.f4509e, fVar.f4509e) && Objects.equals(this.f4510f, fVar.f4510f) && this.f4511g == fVar.f4511g && Objects.equals(this.f4512h, fVar.f4512h) && Objects.equals(this.f4513i, fVar.f4513i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4505a), this.f4506b, this.f4507c, Boolean.valueOf(this.f4508d), this.f4509e, this.f4510f, Boolean.valueOf(this.f4511g), this.f4512h, this.f4513i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f4505a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.u(parcel, 2, this.f4506b);
        bb.u(parcel, 3, this.f4507c);
        bb.f(parcel, 4, this.f4508d);
        bb.u(parcel, 5, this.f4509e);
        bb.w(parcel, 6, this.f4510f);
        bb.f(parcel, 7, this.f4511g);
        bb.y(parcel, 8, this.f4512h);
        bb.u(parcel, 9, this.f4513i);
        bb.e(parcel, iD);
    }
}
