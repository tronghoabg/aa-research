package com.google.android.gearhead.sdk.assistant;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import defpackage.aau;
import defpackage.aav;
import defpackage.qiz;

/* loaded from: classes2.dex */
public class GearheadStateSnapshot extends AbstractBundleable {
    public static final Parcelable.Creator<GearheadStateSnapshot> CREATOR = new qiz(GearheadStateSnapshot.class);

    @Deprecated
    public int a;
    public int b;
    public boolean c;
    public long d;
    public String e;
    public int f;
    public String g;
    public final aau h = new aau(null);
    public Location i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getInt("UI_MODE");
        this.b = bundle.getInt("FACET_TYPE");
        this.c = bundle.getBoolean("IS_NAVIGATING");
        this.d = bundle.getLong("ARRIVAL_TIME_IN_SECONDS_KEY");
        this.e = bundle.getString("DISTANCE_VALUE_KEY");
        this.f = bundle.getInt("DISTANCE_UNIT_KEY");
        this.g = bundle.getString("PRIMARY_REGION_APP_PACKAGE");
        Bundle bundle2 = bundle.getBundle("DEFAULT_PACKAGES");
        if (bundle2 != null) {
            aau aauVar = this.h;
            aauVar.f(1, bundle2.getString(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE));
            aauVar.f(2, bundle2.getString("2"));
            aauVar.f(3, bundle2.getString("3"));
            aauVar.f(4, bundle2.getString("4"));
            aauVar.f(5, bundle2.getString("5"));
        }
        this.i = (Location) bundle.getParcelable("LOCATION_KEY");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("UI_MODE", this.a);
        bundle.putInt("FACET_TYPE", this.b);
        bundle.putBoolean("IS_NAVIGATING", this.c);
        bundle.putString("DISTANCE_VALUE_KEY", this.e);
        bundle.putInt("DISTANCE_UNIT_KEY", this.f);
        bundle.putLong("ARRIVAL_TIME_IN_SECONDS_KEY", this.d);
        bundle.putString("PRIMARY_REGION_APP_PACKAGE", this.g);
        Bundle bundle2 = new Bundle();
        aau aauVar = this.h;
        bundle2.putString(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE, (String) aav.a(aauVar, 1));
        bundle2.putString("2", (String) aav.a(aauVar, 2));
        bundle2.putString("3", (String) aav.a(aauVar, 3));
        bundle2.putString("4", (String) aav.a(aauVar, 4));
        bundle2.putString("5", (String) aav.a(aauVar, 5));
        bundle.putBundle("DEFAULT_PACKAGES", bundle2);
        bundle.putParcelable("LOCATION_KEY", this.i);
    }
}
