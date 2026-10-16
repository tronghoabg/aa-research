package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<i> CREATOR = new j(18);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5687a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5688b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5689c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5690d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5691e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5692f;

    public i(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5687a = z;
        this.f5688b = z2;
        this.f5689c = z3;
        this.f5690d = z4;
        this.f5691e = z5;
        this.f5692f = z6;
    }

    public final boolean a() {
        return this.f5690d || this.f5691e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5687a;
        int iD = bb.d(parcel);
        bb.f(parcel, 1, z);
        bb.f(parcel, 2, this.f5688b);
        bb.f(parcel, 3, this.f5689c);
        bb.f(parcel, 4, this.f5690d);
        bb.f(parcel, 5, this.f5691e);
        bb.f(parcel, 6, this.f5692f);
        bb.e(parcel, iD);
    }
}
