package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import defpackage.khy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ParcelableList<E> implements Parcelable {
    public static final Parcelable.Creator<ParcelableList> CREATOR = new khy(14);
    public final List a;
    private final Bundler b;
    private final BundlerType c;

    /* JADX WARN: Multi-variable type inference failed */
    public ParcelableList(Parcel parcel) {
        this.b = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        int i = parcel.readInt();
        if (i == -1) {
            this.c = null;
            this.a = null;
            return;
        }
        this.a = new ArrayList();
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.c = bundlerType;
        if (i > 0) {
            BundlerType bundlerType2 = (BundlerType) bundlerType.b.get(0);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.add(this.b.b(parcel, bundlerType2));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundler bundler = this.b;
        parcel.writeParcelable(bundler, i);
        List list = this.a;
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        BundlerType bundlerType = this.c;
        parcel.writeParcelable(bundlerType, i);
        if (list.isEmpty()) {
            return;
        }
        BundlerType bundlerType2 = (BundlerType) bundlerType.b.get(0);
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            bundler.d(parcel, it.next(), bundlerType2, i);
        }
    }

    public ParcelableList(Bundler bundler, BundlerType bundlerType, List list) {
        bundlerType.getClass();
        this.b = bundler;
        this.c = bundlerType;
        this.a = list;
    }
}
