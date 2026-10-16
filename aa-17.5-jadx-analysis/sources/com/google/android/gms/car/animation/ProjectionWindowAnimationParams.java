package com.google.android.gms.car.animation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public class ProjectionWindowAnimationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProjectionWindowAnimationParams> CREATOR = new rcd(0);
    public final int a;
    public final boolean b;
    public final ProjectionWindowAnimationChoreography c;
    public final int d;

    public ProjectionWindowAnimationParams(int i, boolean z, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography, int i2) {
        this.a = i;
        this.b = z;
        this.c = projectionWindowAnimationChoreography;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowAnimationParams)) {
            return false;
        }
        ProjectionWindowAnimationParams projectionWindowAnimationParams = (ProjectionWindowAnimationParams) obj;
        return this.a == projectionWindowAnimationParams.a && this.b == projectionWindowAnimationParams.b && this.d == projectionWindowAnimationParams.d && Objects.equals(this.c, projectionWindowAnimationParams.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b), this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        return "ProjectionWindowAnimationParams{animationResId=" + this.a + ", useRevealForTranslation=" + this.b + ", choreography=" + String.valueOf(this.c) + ", startOffset=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b ? 1 : 0);
        spu.E(parcel, 3, this.c, i);
        parcel.writeInt(262148);
        parcel.writeInt(this.d);
        spu.m(parcel, iL);
    }
}
