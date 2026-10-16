package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bf extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<bf> CREATOR = new e(20, null);

    /* renamed from: a, reason: collision with root package name */
    private final int f5369a;

    /* renamed from: b, reason: collision with root package name */
    private final short f5370b;

    /* renamed from: c, reason: collision with root package name */
    private final short f5371c;

    bf(int i2, short s, short s2) {
        this.f5369a = i2;
        this.f5370b = s;
        this.f5371c = s2;
    }

    public final int a() {
        return this.f5369a;
    }

    public final short b() {
        return this.f5370b;
    }

    public final short c() {
        return this.f5371c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.f5369a == bfVar.f5369a && this.f5370b == bfVar.f5370b && this.f5371c == bfVar.f5371c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5369a), Short.valueOf(this.f5370b), Short.valueOf(this.f5371c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.g(parcel, 1, this.f5369a);
        com.google.android.gms.common.internal.bb.i(parcel, 2, this.f5370b);
        com.google.android.gms.common.internal.bb.i(parcel, 3, this.f5371c);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
