package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bi extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<bi> CREATOR = new com.google.android.gms.auth.api.identity.n(10);

    /* renamed from: a, reason: collision with root package name */
    private final int f5036a;

    /* renamed from: b, reason: collision with root package name */
    private List f5037b;

    public bi(int i2, List list) {
        this.f5036a = i2;
        this.f5037b = list;
    }

    public final int a() {
        return this.f5036a;
    }

    public final List b() {
        return this.f5037b;
    }

    public final void c(az azVar) {
        if (this.f5037b == null) {
            this.f5037b = new ArrayList();
        }
        this.f5037b.add(azVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f5036a);
        bb.y(parcel, 2, this.f5037b);
        bb.e(parcel, iD);
    }
}
