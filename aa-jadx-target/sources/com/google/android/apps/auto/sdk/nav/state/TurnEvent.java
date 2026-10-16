package com.google.android.apps.auto.sdk.nav.state;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class TurnEvent extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.nav.state.TurnEvent> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.nav.state.TurnEvent.class);
    public int a;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    public int j;
    public java.util.List l;
    public java.util.List m;
    public java.util.List n;
    public java.util.List o;
    public java.util.List p;
    public java.lang.String q;
    public java.lang.CharSequence b = "";
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int k = 0;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt("turn_event");
        this.b = bundle.getCharSequence("turn_event_road", "");
        this.c = bundle.getInt("turn_event_side");
        this.d = bundle.getInt("turn_angle");
        this.e = bundle.getInt("turn_number");
        this.f = bundle.getByteArray("turn_image");
        this.g = bundle.getInt("turn_distance", -1);
        this.h = bundle.getInt("sec_to_turn", -1);
        this.j = bundle.getInt("turn_unit");
        this.i = bundle.getInt("turn_distance_e3", -1);
        this.k = bundle.getInt("maneuver_type", 0);
        this.l = bundle.getStringArrayList("cue_alternate_texts");
        this.q = bundle.getString("current_road", null);
        this.m = a(bundle, "lanes", "lanes_bundles", com.google.android.apps.auto.sdk.nav.state.Lane.class);
        this.n = bundle.getStringArrayList("destination_addresses");
        this.o = a(bundle, "destination_distances", "destination_distances_bundles", com.google.android.apps.auto.sdk.nav.state.DestinationDistance.class);
        this.p = a(bundle, "destination_details", "destination_details_bundles", com.google.android.apps.auto.sdk.nav.state.DestinationDetails.class);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt("turn_event", this.a);
        bundle.putCharSequence("turn_event_road", this.b);
        bundle.putInt("turn_event_side", this.c);
        bundle.putInt("turn_angle", this.d);
        bundle.putInt("turn_number", this.e);
        bundle.putByteArray("turn_image", this.f);
        bundle.putInt("turn_distance", this.g);
        bundle.putInt("sec_to_turn", this.h);
        bundle.putInt("turn_unit", this.j);
        bundle.putInt("turn_distance_e3", this.i);
        bundle.putInt("maneuver_type", this.k);
        java.util.List list = this.l;
        bundle.putStringArrayList("cue_alternate_texts", list == null ? null : new java.util.ArrayList<>(list));
        bundle.putString("current_road", this.q);
        c(bundle, "lanes_bundles", this.m);
        java.util.List list2 = this.n;
        bundle.putStringArrayList("destination_addresses", list2 != null ? new java.util.ArrayList<>(list2) : null);
        c(bundle, "destination_distances_bundles", this.o);
        c(bundle, "destination_details_bundles", this.p);
    }

    public final java.util.List e() {
        java.util.List list = this.l;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final java.util.List f() {
        java.util.List list = this.n;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final java.util.List g() {
        java.util.List list = this.p;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final java.util.List h() {
        java.util.List list = this.o;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final java.util.List i() {
        java.util.List list = this.m;
        if (list == null) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final boolean j() {
        return this.h != -1;
    }

    public final boolean k() {
        return this.d > 0;
    }

    public final boolean l() {
        return this.i != -1;
    }

    public final boolean m() {
        return this.g != -1;
    }

    public final boolean n() {
        return this.e > 0;
    }
}
