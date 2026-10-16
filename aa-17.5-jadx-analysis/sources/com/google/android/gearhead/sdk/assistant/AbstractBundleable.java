package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class AbstractBundleable implements Parcelable {
    protected static AbstractBundleable e(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        try {
            AbstractBundleable abstractBundleable = (AbstractBundleable) Class.forName(bundle2.getString("BUNDLEABLE_CLASS_NAME")).getConstructor(null).newInstance(null);
            abstractBundleable.a(bundle2);
            return abstractBundleable;
        } catch (Exception e) {
            Log.e("Bundleable", "Could not read out ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    protected static void f(Bundle bundle, String str, AbstractBundleable abstractBundleable) {
        if (abstractBundleable == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        abstractBundleable.b(bundle2);
        bundle2.putString("BUNDLEABLE_CLASS_NAME", abstractBundleable.getClass().getName());
        bundle.putBundle(str, bundle2);
    }

    public abstract void a(Bundle bundle);

    protected abstract void b(Bundle bundle);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        Bundle bundle = new Bundle();
        b(bundle);
        return bundle.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLEABLE_CLASS_NAME", getClass().getName());
        b(bundle);
        parcel.writeBundle(bundle);
    }
}
