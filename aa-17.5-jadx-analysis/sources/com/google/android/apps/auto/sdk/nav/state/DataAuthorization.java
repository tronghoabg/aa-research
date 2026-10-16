package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class DataAuthorization extends AbstractBundleable {
    public static final Parcelable.Creator<DataAuthorization> CREATOR = new AbstractBundleable.BundleableCreator(DataAuthorization.class);
    public String a;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getString("id");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putString("id", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataAuthorization) {
            return Objects.equals(this.a, ((DataAuthorization) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "DataAuthorization{id=" + this.a + "}";
    }
}
