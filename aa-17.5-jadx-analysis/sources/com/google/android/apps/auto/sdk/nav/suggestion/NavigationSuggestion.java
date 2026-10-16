package com.google.android.apps.auto.sdk.nav.suggestion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import defpackage.owt;

/* loaded from: classes.dex */
public class NavigationSuggestion extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationSuggestion> CREATOR = new AbstractBundleable.BundleableCreator(NavigationSuggestion.class);
    public Intent a;
    public CharSequence b;
    public CharSequence c;
    public IconCompat d;
    public int e;
    private CharSequence f;
    private CharSequence g;
    private int h;
    private double i = Double.MAX_VALUE;
    private double j = Double.MAX_VALUE;
    private owt[] k;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        owt[] owtVarArr;
        this.b = bundle.getCharSequence("name");
        this.f = bundle.getCharSequence("route");
        this.a = (Intent) bundle.getParcelable("intent");
        this.g = bundle.getCharSequence("address");
        this.i = bundle.getDouble("lat");
        this.j = bundle.getDouble("lng");
        this.h = bundle.getInt("sec_to_dest");
        this.c = bundle.getCharSequence("formatted_tta");
        double[] doubleArray = bundle.getDoubleArray("waypoints");
        if (doubleArray == null) {
            owtVarArr = null;
        } else {
            owt[] owtVarArr2 = new owt[doubleArray.length >> 1];
            for (int i = 0; i < (doubleArray.length >> 1); i++) {
                int i2 = i + i;
                owtVarArr2[i] = new owt(doubleArray[i2], doubleArray[i2 + 1]);
            }
            owtVarArr = owtVarArr2;
        }
        this.k = owtVarArr;
        this.e = bundle.getInt("traffic");
        Bundle bundle2 = bundle.getBundle("icon");
        if (bundle2 != null) {
            this.d = IconCompat.h(bundle2);
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        double[] dArr;
        bundle.putCharSequence("name", this.b);
        bundle.putCharSequence("route", this.f);
        bundle.putParcelable("intent", this.a);
        bundle.putCharSequence("address", this.g);
        bundle.putDouble("lat", this.i);
        bundle.putDouble("lng", this.j);
        bundle.putCharSequence("formatted_tta", this.c);
        bundle.putInt("sec_to_dest", this.h);
        owt[] owtVarArr = this.k;
        if (owtVarArr == null) {
            dArr = null;
        } else {
            int length = owtVarArr.length;
            double[] dArr2 = new double[length + length];
            for (int i = 0; i < owtVarArr.length; i++) {
                owt owtVar = owtVarArr[i];
                int i2 = i + i;
                dArr2[i2] = owtVar.a;
                dArr2[i2 + 1] = owtVar.b;
            }
            dArr = dArr2;
        }
        bundle.putDoubleArray("waypoints", dArr);
        bundle.putInt("traffic", this.e);
        IconCompat iconCompat = this.d;
        if (iconCompat != null) {
            bundle.putBundle("icon", iconCompat.g());
        }
    }
}
