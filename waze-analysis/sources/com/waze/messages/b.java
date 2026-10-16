package com.waze.messages;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29764a;

    b(int i2) {
        this.f29764a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.f29764a != 0 ? new PushQuestionData(parcel) : new c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return this.f29764a != 0 ? new PushQuestionData[i2] : new c[i2];
    }
}
