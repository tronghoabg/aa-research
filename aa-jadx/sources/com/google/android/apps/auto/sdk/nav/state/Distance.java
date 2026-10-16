package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: classes2.dex */
public final class Distance extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.Distance> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.Distance.class);
    public int a;
    public java.lang.String b;
    public int c;

    public Distance() {
        this.a = -1;
        this.c = 0;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("meters", -1);
        this.b = bundle.getString("display_value");
        this.c = bundle.getInt("display_unit", 0);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("meters", this.a);
        bundle.putString("display_value", this.b);
        bundle.putInt("display_unit", this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.apps.auto.sdk.nav.state.Distance distance = (com.google.android.apps.auto.sdk.nav.state.Distance) obj;
            if (this.a == distance.a && j$.util.Objects.equals(this.b, distance.b) && this.c == distance.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b, java.lang.Integer.valueOf(this.c));
    }

    public Distance(int i, java.lang.String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
