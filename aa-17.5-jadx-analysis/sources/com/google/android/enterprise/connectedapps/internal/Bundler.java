package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public interface Bundler extends Parcelable {
    Object a(Bundle bundle, String str, BundlerType bundlerType);

    Object b(Parcel parcel, BundlerType bundlerType);

    void c(Bundle bundle, String str, Object obj, BundlerType bundlerType);

    void d(Parcel parcel, Object obj, BundlerType bundlerType, int i);
}
