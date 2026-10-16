package androidx.car.app.serialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class Bundleable implements Parcelable {
    public static final Parcelable.Creator<Bundleable> CREATOR = new Parcelable.Creator<Bundleable>() { // from class: androidx.car.app.serialization.Bundleable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundleable createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(getClass().getClassLoader());
            Objects.requireNonNull(bundle);
            return new Bundleable(bundle);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundleable[] newArray(int i) {
            return new Bundleable[i];
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
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }

    public Bundleable(Bundle bundle) {
        this.mBundle = bundle;
    }
}
