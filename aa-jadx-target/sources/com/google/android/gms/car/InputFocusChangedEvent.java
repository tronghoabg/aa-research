package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class InputFocusChangedEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.InputFocusChangedEvent> CREATOR = new defpackage.ea(19);
    public final boolean a;
    public final boolean b;
    public final int c;
    public final android.graphics.Rect d;

    public InputFocusChangedEvent(boolean z, boolean z2, int i, android.graphics.Rect rect) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = rect;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent = (com.google.android.gms.car.InputFocusChangedEvent) obj;
        if (this.a == inputFocusChangedEvent.a && this.b == inputFocusChangedEvent.b && this.c == inputFocusChangedEvent.c) {
            return j$.util.Objects.equals(this.d, inputFocusChangedEvent.d);
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.Rect rect = this.d;
        return ((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + (rect != null ? rect.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "InputFocusChangedEvent{focused=" + this.a + ", inTouchMode=" + this.b + ", direction=" + this.c + ", focusedRect=" + java.lang.String.valueOf(this.d) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(262146);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.q(parcel, iP);
    }
}
