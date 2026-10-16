package com.google.android.enterprise.connectedapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khy;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class BundlerType implements Parcelable {
    public static final Parcelable.Creator<BundlerType> CREATOR = new khy(13);
    public final String a;
    public final List b;

    public BundlerType(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createTypedArrayList(CREATOR);
    }

    public static BundlerType a(String str) {
        return new BundlerType(str, Collections.EMPTY_LIST);
    }

    public static BundlerType b(BundlerType... bundlerTypeArr) {
        return new BundlerType("java.util.List", Arrays.asList(bundlerTypeArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BundlerType bundlerType = (BundlerType) obj;
            if (this.a.equals(bundlerType.a) && this.b.equals(bundlerType.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedList(this.b);
    }

    private BundlerType(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
