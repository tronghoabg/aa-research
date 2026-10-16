package com.google.android.gms.car;

import android.media.AudioAttributes;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class AudioFocusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AudioFocusInfo> CREATOR = new ea(9);
    public final AudioAttributes a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public AudioFocusInfo(AudioAttributes audioAttributes, int i, String str, String str2, int i2, int i3, int i4) {
        this.a = audioAttributes;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioAttributes audioAttributes = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, audioAttributes, i);
        spu.r(parcel, 2, this.b);
        spu.F(parcel, 3, this.c);
        spu.F(parcel, 4, this.d);
        spu.r(parcel, 5, this.e);
        spu.r(parcel, 6, this.f);
        spu.r(parcel, 7, this.g);
        spu.m(parcel, iL);
    }
}
