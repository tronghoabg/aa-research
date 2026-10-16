package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.thg;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new rcd(18);
    public final String a;

    @Deprecated
    public final int b;
    public final boolean c;
    private final long d;

    public Feature(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.c = z;
    }

    public final long a() {
        long j = this.d;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        Feature feature;
        return (obj instanceof Feature) && (feature = (Feature) obj) != null && Objects.equals(this.a, feature.a) && a() == feature.a() && this.c == feature.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a()), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("name", this.a, arrayList);
        thg.w("version", Long.valueOf(a()), arrayList);
        thg.w("is_fully_rolled_out", Boolean.valueOf(this.c), arrayList);
        return thg.v(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        if (str != null) {
            int iL2 = spu.l(parcel, 1);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        long jA = a();
        parcel.writeInt(524291);
        parcel.writeLong(jA);
        boolean z = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        spu.m(parcel, iL);
    }
}
