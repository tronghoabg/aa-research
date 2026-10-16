package com.google.android.gms.f;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    final Messenger f5219a;

    public d(IBinder iBinder) {
        this.f5219a = new Messenger(iBinder);
    }

    public final IBinder a() {
        return this.f5219a.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        this.f5219a.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((d) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.f5219a.getBinder());
    }
}
