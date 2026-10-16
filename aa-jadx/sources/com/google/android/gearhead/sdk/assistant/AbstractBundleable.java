package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBundleable implements android.os.Parcelable {
    protected static com.google.android.gearhead.sdk.assistant.AbstractBundleable e(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        try {
            com.google.android.gearhead.sdk.assistant.AbstractBundleable abstractBundleable = (com.google.android.gearhead.sdk.assistant.AbstractBundleable) java.lang.Class.forName(bundle2.getString("BUNDLEABLE_CLASS_NAME")).getConstructor(null).newInstance(null);
            abstractBundleable.a(bundle2);
            return abstractBundleable;
        } catch (java.lang.Exception e) {
            android.util.Log.e("Bundleable", "Could not read out ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }

    protected static void f(android.os.Bundle bundle, java.lang.String str, com.google.android.gearhead.sdk.assistant.AbstractBundleable abstractBundleable) {
        if (abstractBundleable == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        abstractBundleable.b(bundle2);
        bundle2.putString("BUNDLEABLE_CLASS_NAME", abstractBundleable.getClass().getName());
        bundle.putBundle(str, bundle2);
    }

    public abstract void a(android.os.Bundle bundle);

    protected abstract void b(android.os.Bundle bundle);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        android.os.Bundle bundle = new android.os.Bundle();
        b(bundle);
        return bundle.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("BUNDLEABLE_CLASS_NAME", getClass().getName());
        b(bundle);
        parcel.writeBundle(bundle);
    }
}
