package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.d.d.bn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<r> CREATOR = new com.google.android.gms.a.b.b.b(17);

    /* renamed from: a, reason: collision with root package name */
    private List f5086a;

    public r(List list) {
        this.f5086a = list;
    }

    public final List a() {
        List list = this.f5086a;
        return list != null ? list : bn.p();
    }

    public final void b(q qVar) {
        if (this.f5086a == null) {
            this.f5086a = new ArrayList();
        }
        this.f5086a.add(qVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.y(parcel, 1, a());
        bb.e(parcel, iD);
    }
}
