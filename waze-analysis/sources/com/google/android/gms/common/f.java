package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.gms.a.b.b.b(14);

    /* renamed from: a, reason: collision with root package name */
    private final String f4939a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f4940b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4941c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4942d;

    public f(String str, int i2, long j2, boolean z) {
        this.f4939a = str;
        this.f4940b = i2;
        this.f4941c = j2;
        this.f4942d = z;
    }

    public final long a() {
        long j2 = this.f4941c;
        return j2 == -1 ? this.f4940b : j2;
    }

    public final String b() {
        return this.f4939a;
    }

    public final boolean c() {
        return this.f4942d;
    }

    public final boolean equals(Object obj) {
        f fVar;
        return (obj instanceof f) && (fVar = (f) obj) != null && Objects.equals(this.f4939a, fVar.f4939a) && a() == fVar.a() && this.f4942d == fVar.f4942d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4939a, Long.valueOf(a()), Boolean.valueOf(this.f4942d)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        bb.c(HintConstants.AUTOFILL_HINT_NAME, this.f4939a, arrayList);
        bb.c("version", Long.valueOf(a()), arrayList);
        bb.c("is_fully_rolled_out", Boolean.valueOf(this.f4942d), arrayList);
        return bb.b(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 1, this.f4939a);
        bb.g(parcel, 2, this.f4940b);
        bb.h(parcel, 3, a());
        bb.f(parcel, 4, this.f4942d);
        bb.e(parcel, iD);
    }

    public f(String str, long j2, boolean z) {
        this(str, -1, j2, z);
    }
}
