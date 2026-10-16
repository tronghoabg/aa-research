package com.waze.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.v.eu;
import com.waze.jni.protos.InboxMessage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    private InboxMessage f24673a;

    /* synthetic */ n(Parcel parcel) {
        int i2 = parcel.readInt();
        InboxMessage from = null;
        if (i2 != 0) {
            byte[] bArr = new byte[i2];
            parcel.readByteArray(bArr);
            try {
                from = InboxMessage.parseFrom(bArr);
            } catch (eu unused) {
            }
        }
        this.f24673a = from;
    }

    final long a() {
        return this.f24673a.getSentTimeSeconds();
    }

    final InboxMessage.Type b() {
        return this.f24673a.getType();
    }

    final String c() {
        return this.f24673a.getId();
    }

    final String d() {
        return this.f24673a.getMessage();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final String e() {
        return this.f24673a.getPreview();
    }

    final String f() {
        return this.f24673a.getSentFormattedString();
    }

    final String g() {
        return this.f24673a.getTitle();
    }

    final void h() {
        InboxMessage.Builder builderNewBuilder = InboxMessage.newBuilder(this.f24673a);
        builderNewBuilder.setUnread(false);
        this.f24673a = builderNewBuilder.build();
    }

    final boolean i() {
        return this.f24673a.getUnread();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        InboxMessage inboxMessage = this.f24673a;
        if (inboxMessage == null) {
            parcel.writeInt(0);
            return;
        }
        byte[] byteArray = inboxMessage.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public n(InboxMessage inboxMessage) {
        this.f24673a = inboxMessage;
    }
}
