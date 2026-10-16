package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public class RadioProgramSelector extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RadioProgramSelector> CREATOR = new qte(14);
    public final RadioProgramIdentifier a;
    public final List b;

    public static class RadioProgramIdentifier extends AbstractSafeParcelable {
        public static final Parcelable.Creator<RadioProgramIdentifier> CREATOR = new qte(12);
        public final int a;
        public final long b;

        public RadioProgramIdentifier(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadioProgramIdentifier)) {
                return false;
            }
            RadioProgramIdentifier radioProgramIdentifier = (RadioProgramIdentifier) obj;
            return this.a == radioProgramIdentifier.a && this.b == radioProgramIdentifier.b;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b));
        }

        public final String toString() {
            return "RadioProgramIdentifier{type=" + this.a + " value=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.r(parcel, 1, this.a);
            spu.s(parcel, 2, this.b);
            spu.m(parcel, iL);
        }
    }

    public RadioProgramSelector(RadioProgramIdentifier radioProgramIdentifier, List list) {
        this.a = radioProgramIdentifier;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadioProgramSelector) {
            return Objects.equals(this.a, ((RadioProgramSelector) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        List list = this.b;
        return "RadioProgramSelector{primary=" + String.valueOf(this.a) + " secondary=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.J(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
