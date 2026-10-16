package com.google.android.gms.f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.gms.a.b.b.b(13);

    /* renamed from: a, reason: collision with root package name */
    final Intent f5206a;

    public a(Intent intent) {
        this.f5206a = intent;
    }

    public final Intent a() {
        return this.f5206a;
    }

    final Integer b() {
        Intent intent = this.f5206a;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public final String c() {
        Intent intent = this.f5206a;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.t(parcel, 1, this.f5206a, i2);
        bb.e(parcel, iD);
    }
}
