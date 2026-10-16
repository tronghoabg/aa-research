package com.google.android.gms.car;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.yfq;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public class ProjectionWindowDragParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProjectionWindowDragParams> CREATOR = new rcd(1);
    public final int a;
    public final List b;
    public final IBinder c;
    public final List d;
    public final List e;

    public ProjectionWindowDragParams(int i, List list, IBinder iBinder, List list2, List list3) {
        this.a = i;
        this.b = list;
        this.c = iBinder;
        this.d = list2;
        this.e = list3;
    }

    public final yfq a() {
        return yfq.o(this.b);
    }

    public final yfq b() {
        return yfq.o(this.d);
    }

    public final yfq c() {
        return yfq.o(this.e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ProjectionWindowDragParams) {
            ProjectionWindowDragParams projectionWindowDragParams = (ProjectionWindowDragParams) obj;
            if (this.a == projectionWindowDragParams.a && Objects.equals(this.b, projectionWindowDragParams.b) && Objects.equals(this.c, projectionWindowDragParams.c) && Objects.equals(this.d, projectionWindowDragParams.d) && Objects.equals(this.e, projectionWindowDragParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        List list = this.e;
        List list2 = this.d;
        IBinder iBinder = this.c;
        return "ProjectionWindowDragParams{dragType=" + this.a + ", dragStates=" + String.valueOf(this.b) + ", windowDragCallbackBinder=" + String.valueOf(iBinder) + ", flingRanges=" + String.valueOf(list2) + ", skipRecomputingInsetsAtStepIndices=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        spu.A(parcel, 2, a());
        IBinder iBinder = this.c;
        if (iBinder != null) {
            int iL2 = spu.l(parcel, 3);
            parcel.writeStrongBinder(iBinder);
            spu.m(parcel, iL2);
        }
        spu.J(parcel, 4, b());
        spu.A(parcel, 5, c());
        spu.m(parcel, iL);
    }
}
