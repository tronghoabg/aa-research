package com.bytedance.adsdk.ugeno.bcc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class uef implements Parcelable {

    /* renamed from: oa, reason: collision with root package name */
    private final Parcelable f24670oa;
    public static final uef uef = new uef() { // from class: com.bytedance.adsdk.ugeno.bcc.uef.1
    };
    public static final Parcelable.Creator<uef> CREATOR = new Parcelable.ClassLoaderCreator<uef>() { // from class: com.bytedance.adsdk.ugeno.bcc.uef.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public uef createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public uef createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return uef.uef;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public uef[] newArray(int i5) {
            return new uef[i5];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable uef() {
        return this.f24670oa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f24670oa, i5);
    }

    private uef() {
        this.f24670oa = null;
    }

    public uef(Parcelable parcelable) {
        if (parcelable != null) {
            this.f24670oa = parcelable == uef ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public uef(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f24670oa = parcelable == null ? uef : parcelable;
    }
}
