package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gearhead.sdk.assistant.AbstractBundleable;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class qiz implements Parcelable.Creator {
    private final Class a;

    public qiz(Class cls) {
        this.a = cls;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AbstractBundleable abstractBundleable = null;
        try {
            Bundle bundle = parcel.readBundle(getClass().getClassLoader());
            abstractBundleable = bundle.containsKey("BUNDLEABLE_CLASS_NAME") ? (AbstractBundleable) Class.forName(bundle.getString("BUNDLEABLE_CLASS_NAME")).getConstructor(null).newInstance(null) : (AbstractBundleable) this.a.getConstructor(null).newInstance(null);
            abstractBundleable.a(bundle);
            return abstractBundleable;
        } catch (Throwable th) {
            Log.e("Bundleable", "Failed to instantiate ".concat(String.valueOf(this.a.getSimpleName())), th);
            return abstractBundleable;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (AbstractBundleable[]) Array.newInstance((Class<?>) this.a, i);
    }
}
