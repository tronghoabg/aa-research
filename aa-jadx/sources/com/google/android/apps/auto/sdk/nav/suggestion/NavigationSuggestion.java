package com.google.android.apps.auto.sdk.nav.suggestion;

/* JADX INFO: loaded from: classes.dex */
public class NavigationSuggestion extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion.class);
    public android.content.Intent a;
    public java.lang.CharSequence b;
    public java.lang.CharSequence c;
    public androidx.core.graphics.drawable.IconCompat d;
    public int e;
    private java.lang.CharSequence f;
    private java.lang.CharSequence g;
    private int h;
    private double i = Double.MAX_VALUE;
    private double j = Double.MAX_VALUE;
    private defpackage.oxq[] k;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        defpackage.oxq[] oxqVarArr;
        this.b = bundle.getCharSequence("name");
        this.f = bundle.getCharSequence("route");
        this.a = (android.content.Intent) bundle.getParcelable("intent");
        this.g = bundle.getCharSequence("address");
        this.i = bundle.getDouble("lat");
        this.j = bundle.getDouble("lng");
        this.h = bundle.getInt("sec_to_dest");
        this.c = bundle.getCharSequence("formatted_tta");
        double[] doubleArray = bundle.getDoubleArray("waypoints");
        if (doubleArray == null) {
            oxqVarArr = null;
        } else {
            defpackage.oxq[] oxqVarArr2 = new defpackage.oxq[doubleArray.length >> 1];
            for (int i = 0; i < (doubleArray.length >> 1); i++) {
                int i2 = i + i;
                oxqVarArr2[i] = new defpackage.oxq(doubleArray[i2], doubleArray[i2 + 1]);
            }
            oxqVarArr = oxqVarArr2;
        }
        this.k = oxqVarArr;
        this.e = bundle.getInt("traffic");
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        if (bundle2 != null) {
            this.d = androidx.core.graphics.drawable.IconCompat.h(bundle2);
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        double[] dArr;
        bundle.putCharSequence("name", this.b);
        bundle.putCharSequence("route", this.f);
        bundle.putParcelable("intent", this.a);
        bundle.putCharSequence("address", this.g);
        bundle.putDouble("lat", this.i);
        bundle.putDouble("lng", this.j);
        bundle.putCharSequence("formatted_tta", this.c);
        bundle.putInt("sec_to_dest", this.h);
        defpackage.oxq[] oxqVarArr = this.k;
        if (oxqVarArr == null) {
            dArr = null;
        } else {
            int length = oxqVarArr.length;
            double[] dArr2 = new double[length + length];
            for (int i = 0; i < oxqVarArr.length; i++) {
                defpackage.oxq oxqVar = oxqVarArr[i];
                int i2 = i + i;
                dArr2[i2] = oxqVar.a;
                dArr2[i2 + 1] = oxqVar.b;
            }
            dArr = dArr2;
        }
        bundle.putDoubleArray("waypoints", dArr);
        bundle.putInt("traffic", this.e);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.d;
        if (iconCompat != null) {
            bundle.putBundle("icon", iconCompat.g());
        }
    }
}
