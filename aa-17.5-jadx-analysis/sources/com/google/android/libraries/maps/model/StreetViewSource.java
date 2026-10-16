package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new StreetViewSourceCreator();
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    public static final String UNRECOGNIZED_STREETVIEWSOURCE_ERROR_MESSAGE_TEMPLATE = "Unrecognized StreetViewSource value [%s], using StreetViewSource.DEFAULT value instead.";
    private final int a;

    public StreetViewSource(int i) {
        this.a = i;
    }

    public static boolean isRecognizedStreetViewSource(int i) {
        return i == 0 || i == 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.a == ((StreetViewSource) obj).a;
    }

    public int getType() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public String toString() {
        int i = this.a;
        return String.format("StreetViewSource:%s", i != 0 ? i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, getType());
        spu.m(parcel, iL);
    }
}
