package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class InputFocusChangedEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InputFocusChangedEvent> CREATOR = new ea(19);
    public final boolean a;
    public final boolean b;
    public final int c;
    public final Rect d;

    public InputFocusChangedEvent(boolean z, boolean z2, int i, Rect rect) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) obj;
        if (this.a == inputFocusChangedEvent.a && this.b == inputFocusChangedEvent.b && this.c == inputFocusChangedEvent.c) {
            return Objects.equals(this.d, inputFocusChangedEvent.d);
        }
        return false;
    }

    public final int hashCode() {
        Rect rect = this.d;
        return ((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        return "InputFocusChangedEvent{focused=" + this.a + ", inTouchMode=" + this.b + ", direction=" + this.c + ", focusedRect=" + String.valueOf(this.d) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(262146);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        spu.E(parcel, 4, this.d, i);
        spu.m(parcel, iL);
    }
}
