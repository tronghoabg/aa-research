package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    private final List f5682a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5683b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5684c;

    e(List list, boolean z, boolean z2) {
        this.f5682a = list;
        this.f5683b = z;
        this.f5684c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f5682a;
        int iD = bb.d(parcel);
        bb.y(parcel, 1, DesugarCollections.unmodifiableList(list));
        bb.f(parcel, 2, this.f5683b);
        bb.f(parcel, 3, this.f5684c);
        bb.e(parcel, iD);
    }
}
