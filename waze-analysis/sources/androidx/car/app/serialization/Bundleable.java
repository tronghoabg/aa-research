package androidx.car.app.serialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Bundleable implements Parcelable {
    public static final Parcelable.Creator<Bundleable> CREATOR = new Parcelable.Creator<Bundleable>() { // from class: androidx.car.app.serialization.Bundleable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundleable createFromParcel(Parcel parcel) {
            return new Bundleable((Bundle) Objects.requireNonNull(parcel.readBundle(getClass().getClassLoader())));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundleable[] newArray(int i2) {
            return new Bundleable[i2];
        }
    };
    private final Bundle mBundle;

    private Bundleable(Object obj) {
        this.mBundle = Bundler.toBundle(obj);
    }

    public static Bundleable create(Object obj) {
        return new Bundleable(obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object get() {
        return Bundler.fromBundle(this.mBundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.mBundle);
    }

    Bundleable(Bundle bundle) {
        this.mBundle = bundle;
    }
}
