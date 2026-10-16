package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new a();

    /* renamed from: i, reason: collision with root package name */
    private final String f5472i;

    Transport(String str) {
        this.f5472i = str;
    }

    public static Transport a(String str) throws b {
        for (Transport transport : values()) {
            if (str.equals(transport.f5472i)) {
                return transport;
            }
        }
        throw new b(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5472i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5472i);
    }
}
