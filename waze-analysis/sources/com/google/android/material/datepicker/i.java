package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f6474a;

    i(int i2) {
        this.f6474a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f6474a;
        if (i2 == 0) {
            return new j(parcel.readLong(), null);
        }
        if (i2 == 1) {
            return new c((aj) parcel.readParcelable(aj.class.getClassLoader()), (aj) parcel.readParcelable(aj.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), (aj) parcel.readParcelable(aj.class.getClassLoader()), parcel.readInt());
        }
        if (i2 == 2) {
            return new k(parcel.readLong(), null);
        }
        if (i2 == 3) {
            return aj.h(parcel.readInt(), parcel.readInt());
        }
        at atVar = new at();
        atVar.f6433a = (Long) parcel.readValue(Long.class.getClassLoader());
        return atVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f6474a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? new at[i2] : new aj[i2] : new k[i2] : new c[i2] : new j[i2];
    }
}
