package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class GearheadStateSnapshot extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot.class);

    @java.lang.Deprecated
    public int a;
    public int b;
    public boolean c;
    public long d;
    public java.lang.String e;
    public int f;
    public java.lang.String g;
    public final defpackage.abb h = new defpackage.abb(null);
    public android.location.Location i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getInt("UI_MODE");
        this.b = bundle.getInt("FACET_TYPE");
        this.c = bundle.getBoolean("IS_NAVIGATING");
        this.d = bundle.getLong("ARRIVAL_TIME_IN_SECONDS_KEY");
        this.e = bundle.getString("DISTANCE_VALUE_KEY");
        this.f = bundle.getInt("DISTANCE_UNIT_KEY");
        this.g = bundle.getString("PRIMARY_REGION_APP_PACKAGE");
        android.os.Bundle bundle2 = bundle.getBundle("DEFAULT_PACKAGES");
        if (bundle2 != null) {
            defpackage.abb abbVar = this.h;
            abbVar.f(1, bundle2.getString(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE));
            abbVar.f(2, bundle2.getString("2"));
            abbVar.f(3, bundle2.getString("3"));
            abbVar.f(4, bundle2.getString("4"));
            abbVar.f(5, bundle2.getString("5"));
        }
        this.i = (android.location.Location) bundle.getParcelable("LOCATION_KEY");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("UI_MODE", this.a);
        bundle.putInt("FACET_TYPE", this.b);
        bundle.putBoolean("IS_NAVIGATING", this.c);
        bundle.putString("DISTANCE_VALUE_KEY", this.e);
        bundle.putInt("DISTANCE_UNIT_KEY", this.f);
        bundle.putLong("ARRIVAL_TIME_IN_SECONDS_KEY", this.d);
        bundle.putString("PRIMARY_REGION_APP_PACKAGE", this.g);
        android.os.Bundle bundle2 = new android.os.Bundle();
        defpackage.abb abbVar = this.h;
        bundle2.putString(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE, (java.lang.String) defpackage.abc.a(abbVar, 1));
        bundle2.putString("2", (java.lang.String) defpackage.abc.a(abbVar, 2));
        bundle2.putString("3", (java.lang.String) defpackage.abc.a(abbVar, 3));
        bundle2.putString("4", (java.lang.String) defpackage.abc.a(abbVar, 4));
        bundle2.putString("5", (java.lang.String) defpackage.abc.a(abbVar, 5));
        bundle.putBundle("DEFAULT_PACKAGES", bundle2);
        bundle.putParcelable("LOCATION_KEY", this.i);
    }
}
