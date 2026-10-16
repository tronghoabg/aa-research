package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<m> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    private final int f4870a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4871b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4872c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4873d;

    static {
        l lVar = new l();
        lVar.b();
        lVar.c();
        lVar.d();
        lVar.a();
        CREATOR = new n(0);
    }

    m(int i2, int i3, int i4, boolean z) {
        this.f4870a = i2;
        this.f4871b = i3;
        this.f4872c = i4;
        this.f4873d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f4870a == mVar.f4870a && this.f4871b == mVar.f4871b && this.f4872c == mVar.f4872c && this.f4873d == mVar.f4873d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4870a), Integer.valueOf(this.f4871b), Integer.valueOf(this.f4872c), Boolean.valueOf(this.f4873d)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f4870a + ", dataOwnerProductId=" + this.f4871b + ", processingReason=" + this.f4872c + ", isUserData=" + this.f4873d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f4870a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.g(parcel, 2, this.f4871b);
        bb.g(parcel, 3, this.f4872c);
        bb.f(parcel, 4, this.f4873d);
        bb.e(parcel, iD);
    }
}
