package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FRDProductSpecificDataEntry> CREATOR = new sqy(5);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && Objects.equals(this.c, fRDProductSpecificDataEntry.c) && Objects.equals(this.d, fRDProductSpecificDataEntry.d) && Objects.equals(this.e, fRDProductSpecificDataEntry.e) && Objects.equals(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && Objects.equals(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, this.a);
        spu.r(parcel, 3, this.b);
        spu.H(parcel, 4, this.c);
        spu.C(parcel, 5, this.d);
        spu.H(parcel, 6, this.e);
        spu.C(parcel, 7, this.f);
        spu.w(parcel, 8, this.g);
        parcel.writeInt(262153);
        parcel.writeInt(this.h.booleanValue() ? 1 : 0);
        spu.m(parcel, iL);
    }
}
