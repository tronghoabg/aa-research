package com.google.android.gms.car.animation;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ProjectionWindowAnimationParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.animation.ProjectionWindowAnimationParams> CREATOR = new defpackage.rcy(0);
    public final int a;
    public final boolean b;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography c;
    public final int d;

    public ProjectionWindowAnimationParams(int i, boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography, int i2) {
        this.a = i;
        this.b = z;
        this.c = projectionWindowAnimationChoreography;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.animation.ProjectionWindowAnimationParams)) {
            return false;
        }
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) obj;
        return this.a == projectionWindowAnimationParams.a && this.b == projectionWindowAnimationParams.b && this.d == projectionWindowAnimationParams.d && j$.util.Objects.equals(this.c, projectionWindowAnimationParams.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Boolean.valueOf(this.b), this.c, java.lang.Integer.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        return "ProjectionWindowAnimationParams{animationResId=" + this.a + ", useRevealForTranslation=" + this.b + ", choreography=" + java.lang.String.valueOf(this.c) + ", startOffset=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b ? 1 : 0);
        defpackage.sqs.I(parcel, 3, this.c, i);
        parcel.writeInt(262148);
        parcel.writeInt(this.d);
        defpackage.sqs.q(parcel, iP);
    }
}
