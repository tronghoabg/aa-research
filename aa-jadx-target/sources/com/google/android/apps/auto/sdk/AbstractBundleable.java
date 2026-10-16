package com.google.android.apps.auto.sdk;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class AbstractBundleable implements android.os.Parcelable {

    public final class BundleableCreator<T extends com.google.android.apps.auto.sdk.AbstractBundleable> implements android.os.Parcelable.Creator<T> {
        private final java.lang.Class<T> clazz;

        public BundleableCreator(java.lang.Class<T> cls) {
            this.clazz = cls;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            T tNewInstance;
            try {
                java.lang.Class<T> cls = this.clazz;
                tNewInstance = cls.newInstance();
                try {
                    tNewInstance.b(parcel.readBundle(cls.getClassLoader()));
                    return tNewInstance;
                } catch (java.lang.Exception e) {
                    e = e;
                    android.util.Log.e("CSL.AbstractBundleable", "Failed to instantiate ".concat(java.lang.String.valueOf(this.clazz.getSimpleName())), e);
                    return tNewInstance;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                tNewInstance = null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
            return (com.google.android.apps.auto.sdk.AbstractBundleable[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.clazz, i);
        }
    }

    protected static java.util.List a(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.Class cls) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList == null) {
            try {
                return bundle.getParcelableArrayList(str);
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("CSL.AbstractBundleable", "Failed to read legacy list ".concat(str), e);
                return null;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayList.size());
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList.get(i);
            try {
                com.google.android.apps.auto.sdk.AbstractBundleable abstractBundleable = (com.google.android.apps.auto.sdk.AbstractBundleable) cls.newInstance();
                abstractBundleable.b(bundle2);
                arrayList.add(abstractBundleable);
            } catch (java.lang.Exception e2) {
                android.util.Log.e("CSL.AbstractBundleable", "Failed to instantiate " + cls.getSimpleName() + " from bundle list", e2);
            }
        }
        return arrayList;
    }

    protected static void c(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        if (list != null) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.apps.auto.sdk.AbstractBundleable abstractBundleable = (com.google.android.apps.auto.sdk.AbstractBundleable) it.next();
                android.os.Bundle bundle2 = new android.os.Bundle();
                abstractBundleable.d(bundle2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
    }

    protected abstract void b(android.os.Bundle bundle);

    protected abstract void d(android.os.Bundle bundle);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        android.os.Bundle bundle = new android.os.Bundle();
        d(bundle);
        return bundle.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        d(bundle);
        parcel.writeBundle(bundle);
    }
}
