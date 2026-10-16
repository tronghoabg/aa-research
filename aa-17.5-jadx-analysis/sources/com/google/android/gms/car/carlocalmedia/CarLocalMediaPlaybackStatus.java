package com.google.android.gms.car.carlocalmedia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import j$.time.Duration;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class CarLocalMediaPlaybackStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarLocalMediaPlaybackStatus> CREATOR = new rhl(0);
    public final int a;
    public final String b;
    public final yfq c;
    private final long d;

    public CarLocalMediaPlaybackStatus(int i, String str, long j, List list) {
        yfq yfqVarO;
        this.a = i;
        this.b = str;
        this.d = j;
        if (list == null) {
            int i2 = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.c = yfqVarO;
    }

    public final Duration a() {
        return Duration.ofMillis(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocalMediaPlaybackStatus)) {
            return false;
        }
        CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus = (CarLocalMediaPlaybackStatus) obj;
        return this.a == carLocalMediaPlaybackStatus.a && this.b.equals(carLocalMediaPlaybackStatus.b) && this.d == carLocalMediaPlaybackStatus.d && Objects.equals(this.c, carLocalMediaPlaybackStatus.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Long.valueOf(this.d), this.c);
    }

    public final String toString() {
        return "CarLocalMediaPlaybackStatus{state=" + this.a + ", mediaSource='" + this.b + "', playbackPosition=" + this.d + ", actions=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.F(parcel, 2, this.b);
        long j = this.d;
        Long.valueOf(j).getClass();
        spu.s(parcel, 3, j);
        spu.A(parcel, 4, this.c);
        spu.m(parcel, iL);
    }
}
