package com.google.android.gms.car.animation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import defpackage.woy;
import defpackage.yfu;
import defpackage.yfy;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ProjectionWindowAnimationChoreography extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProjectionWindowAnimationChoreography> CREATOR = new qte(18);
    final List a;
    final List b;
    final List c;
    final List d;
    public final boolean e;
    public final boolean f;

    public ProjectionWindowAnimationChoreography(Map map, Map map2, boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
        this.a = new ArrayList();
        this.b = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            this.b.add((Integer) entry.getValue());
            this.a.add((CarRegionId) entry.getKey());
        }
        this.c = new ArrayList();
        this.d = new ArrayList();
        for (Map.Entry entry2 : map2.entrySet()) {
            woy.O(((ProjectionWindowAnimationParams) entry2.getValue()).c == null, "Specifying a choreography in a custom animation is not supported");
            this.d.add((ProjectionWindowAnimationParams) entry2.getValue());
            this.c.add((CarRegionId) entry2.getKey());
        }
    }

    public final yfy a() {
        yfu yfuVar = new yfu(4);
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return yfuVar.d(true);
            }
            yfuVar.e((CarRegionId) list.get(i), (Integer) this.b.get(i));
            i++;
        }
    }

    public final yfy b() {
        yfu yfuVar = new yfu(4);
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return yfuVar.d(true);
            }
            yfuVar.e((CarRegionId) list.get(i), (ProjectionWindowAnimationParams) this.d.get(i));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowAnimationChoreography)) {
            return false;
        }
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (ProjectionWindowAnimationChoreography) obj;
        return this.b.equals(projectionWindowAnimationChoreography.b) && this.a.equals(projectionWindowAnimationChoreography.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        List list3 = this.a;
        return "ProjectionWindowAnimationChoreography{actionsToChoreograph=" + String.valueOf(this.b) + ", regionsToChoreograph=" + String.valueOf(list3) + ", regionsWithCustomAnimations=" + String.valueOf(list2) + ", customAnimations=" + String.valueOf(list) + ", castInsetsBeforeAnimations=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, this.a);
        spu.A(parcel, 2, this.b);
        spu.J(parcel, 3, this.c);
        spu.J(parcel, 4, this.d);
        spu.n(parcel, 5, this.e);
        spu.n(parcel, 6, this.f);
        spu.m(parcel, iL);
    }

    public ProjectionWindowAnimationChoreography(List list, List list2, List list3, List list4, boolean z, boolean z2) {
        this.b = list2;
        this.a = list;
        this.c = list3;
        this.d = list4;
        this.e = z;
        this.f = z2;
    }
}
