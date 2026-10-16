package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class CarAudioConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarAudioConfiguration> CREATOR = new ea(11);
    public final int a;
    public final int b;
    public final int c;

    public CarAudioConfiguration(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final String toString() {
        return getClass().getName() + "[sampleRate=" + this.a + ",channelConfig=" + this.b + ",audioFormat=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
