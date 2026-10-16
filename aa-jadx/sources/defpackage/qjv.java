package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qjv implements android.os.Parcelable.Creator {
    private final java.lang.Class a;

    public qjv(java.lang.Class cls) {
        this.a = cls;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.google.android.gearhead.sdk.assistant.AbstractBundleable abstractBundleable = null;
        try {
            android.os.Bundle bundle = parcel.readBundle(getClass().getClassLoader());
            abstractBundleable = bundle.containsKey("BUNDLEABLE_CLASS_NAME") ? (com.google.android.gearhead.sdk.assistant.AbstractBundleable) java.lang.Class.forName(bundle.getString("BUNDLEABLE_CLASS_NAME")).getConstructor(null).newInstance(null) : (com.google.android.gearhead.sdk.assistant.AbstractBundleable) this.a.getConstructor(null).newInstance(null);
            abstractBundleable.a(bundle);
            return abstractBundleable;
        } catch (java.lang.Throwable th) {
            android.util.Log.e("Bundleable", "Failed to instantiate ".concat(java.lang.String.valueOf(this.a.getSimpleName())), th);
            return abstractBundleable;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
        return (com.google.android.gearhead.sdk.assistant.AbstractBundleable[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.a, i);
    }
}
