package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public class RadioConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RadioConfiguration> CREATOR = new qte(10);
    public final List a;

    public static class RadioBandGroup extends AbstractSafeParcelable {
        public static final Parcelable.Creator<RadioBandGroup> CREATOR = new qte(9);
        public final List a;
        public final boolean b;
        public final String c;
        public final boolean d;

        public RadioBandGroup(List list, boolean z, String str, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = str;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RadioBandGroup) {
                RadioBandGroup radioBandGroup = (RadioBandGroup) obj;
                if (this.b == radioBandGroup.b && this.d == radioBandGroup.d && Objects.equals(this.a, radioBandGroup.a) && Objects.equals(this.c, radioBandGroup.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d));
        }

        public final String toString() {
            return "RadioBandGroup{bands=" + String.valueOf(this.a) + ", hideEmptyGroup=" + this.b + ", bandScanAction=" + this.c + ", keepOriginalStationOrder=" + this.d + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.A(parcel, 1, this.a);
            spu.n(parcel, 2, this.b);
            spu.F(parcel, 3, this.c);
            spu.n(parcel, 4, this.d);
            spu.m(parcel, iL);
        }
    }

    public RadioConfiguration(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadioConfiguration) {
            return Objects.equals(this.a, ((RadioConfiguration) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "RadioConfiguration{bandConfigs=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, this.a);
        spu.m(parcel, iL);
    }
}
