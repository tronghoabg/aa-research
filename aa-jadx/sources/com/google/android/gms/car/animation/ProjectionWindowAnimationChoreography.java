package com.google.android.gms.car.animation;

/* JADX INFO: loaded from: classes.dex */
public final class ProjectionWindowAnimationChoreography extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography> CREATOR = new defpackage.qua(18);
    final java.util.List a;
    final java.util.List b;
    final java.util.List c;
    final java.util.List d;
    public final boolean e;
    public final boolean f;

    public ProjectionWindowAnimationChoreography(java.util.Map map, java.util.Map map2, boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.b.add((java.lang.Integer) entry.getValue());
            this.a.add((com.google.android.gms.car.display.CarRegionId) entry.getKey());
        }
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            defpackage.ysr.aY(((com.google.android.gms.car.animation.ProjectionWindowAnimationParams) entry2.getValue()).c == null, "Specifying a choreography in a custom animation is not supported");
            this.d.add((com.google.android.gms.car.animation.ProjectionWindowAnimationParams) entry2.getValue());
            this.c.add((com.google.android.gms.car.display.CarRegionId) entry2.getKey());
        }
    }

    public final defpackage.yhe a() {
        defpackage.yha yhaVar = new defpackage.yha(4);
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return yhaVar.d(true);
            }
            yhaVar.f((com.google.android.gms.car.display.CarRegionId) list.get(i), (java.lang.Integer) this.b.get(i));
            i++;
        }
    }

    public final defpackage.yhe b() {
        defpackage.yha yhaVar = new defpackage.yha(4);
        int i = 0;
        while (true) {
            java.util.List list = this.c;
            if (i >= list.size()) {
                return yhaVar.d(true);
            }
            yhaVar.f((com.google.android.gms.car.display.CarRegionId) list.get(i), (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) this.d.get(i));
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography)) {
            return false;
        }
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) obj;
        return this.b.equals(projectionWindowAnimationChoreography.b) && this.a.equals(projectionWindowAnimationChoreography.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        java.util.List list = this.d;
        java.util.List list2 = this.c;
        java.util.List list3 = this.a;
        return "ProjectionWindowAnimationChoreography{actionsToChoreograph=" + java.lang.String.valueOf(this.b) + ", regionsToChoreograph=" + java.lang.String.valueOf(list3) + ", regionsWithCustomAnimations=" + java.lang.String.valueOf(list2) + ", customAnimations=" + java.lang.String.valueOf(list) + ", castInsetsBeforeAnimations=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, this.a);
        defpackage.sqs.E(parcel, 2, this.b);
        defpackage.sqs.N(parcel, 3, this.c);
        defpackage.sqs.N(parcel, 4, this.d);
        defpackage.sqs.r(parcel, 5, this.e);
        defpackage.sqs.r(parcel, 6, this.f);
        defpackage.sqs.q(parcel, iP);
    }

    public ProjectionWindowAnimationChoreography(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, boolean z, boolean z2) {
        this.b = list2;
        this.a = list;
        this.c = list3;
        this.d = list4;
        this.e = z;
        this.f = z2;
    }
}
