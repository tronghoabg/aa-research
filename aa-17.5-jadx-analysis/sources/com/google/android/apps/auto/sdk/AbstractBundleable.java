package com.google.android.apps.auto.sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AbstractBundleable implements Parcelable {

    public final class BundleableCreator<T extends AbstractBundleable> implements Parcelable.Creator<T> {
        private final Class<T> clazz;

        public BundleableCreator(Class<T> cls) {
            this.clazz = cls;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws IllegalAccessException, InstantiationException {
            T tNewInstance;
            Class<T> cls;
            try {
                cls = this.clazz;
                tNewInstance = cls.newInstance();
            } catch (Exception e) {
                e = e;
                tNewInstance = null;
            }
            try {
                tNewInstance.b(parcel.readBundle(cls.getClassLoader()));
                return tNewInstance;
            } catch (Exception e2) {
                e = e2;
                Log.e("CSL.AbstractBundleable", "Failed to instantiate ".concat(String.valueOf(this.clazz.getSimpleName())), e);
                return tNewInstance;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return (AbstractBundleable[]) Array.newInstance((Class<?>) this.clazz, i);
        }
    }

    protected static List a(Bundle bundle, String str, String str2, Class cls) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList == null) {
            try {
                return bundle.getParcelableArrayList(str);
            } catch (RuntimeException e) {
                Log.w("CSL.AbstractBundleable", "Failed to read legacy list ".concat(str), e);
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(parcelableArrayList.size());
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
            try {
                AbstractBundleable abstractBundleable = (AbstractBundleable) cls.newInstance();
                abstractBundleable.b(bundle2);
                arrayList.add(abstractBundleable);
            } catch (Exception e2) {
                Log.e("CSL.AbstractBundleable", "Failed to instantiate " + cls.getSimpleName() + " from bundle list", e2);
            }
        }
        return arrayList;
    }

    protected static void c(Bundle bundle, String str, List list) {
        if (list != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractBundleable abstractBundleable = (AbstractBundleable) it.next();
                Bundle bundle2 = new Bundle();
                abstractBundleable.d(bundle2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
    }

    protected abstract void b(Bundle bundle);

    protected abstract void d(Bundle bundle);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        Bundle bundle = new Bundle();
        d(bundle);
        return bundle.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        d(bundle);
        parcel.writeBundle(bundle);
    }
}
