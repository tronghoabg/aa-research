package com.google.android.enterprise.connectedapps.internal;

/* JADX INFO: loaded from: classes2.dex */
public interface Bundler extends android.os.Parcelable {
    java.lang.Object a(android.os.Bundle bundle, java.lang.String str, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType);

    java.lang.Object b(android.os.Parcel parcel, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType);

    void c(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType);

    void d(android.os.Parcel parcel, java.lang.Object obj, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType, int i);
}
