package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<k> CREATOR = n.a();

    /* renamed from: a, reason: collision with root package name */
    private static final k f4863a = new j().a();

    /* renamed from: b, reason: collision with root package name */
    private final m f4864b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4865c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4866d;

    static {
        j jVar = new j();
        jVar.f4862b = true;
        jVar.a();
    }

    k(m mVar, boolean z) {
        this.f4864b = mVar;
        this.f4865c = z;
    }

    public static final k a() {
        return f4863a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f4864b, kVar.f4864b) && this.f4866d == kVar.f4866d && this.f4865c == kVar.f4865c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4864b, Boolean.valueOf(this.f4866d), Boolean.valueOf(this.f4865c)});
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.f4864b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.f4866d) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f4864b, i2);
        bb.f(parcel, 2, this.f4865c);
        bb.e(parcel, iD);
    }
}
