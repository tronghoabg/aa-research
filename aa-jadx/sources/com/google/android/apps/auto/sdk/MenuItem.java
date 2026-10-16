package com.google.android.apps.auto.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class MenuItem extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.MenuItem> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.MenuItem.class);
    public int a;
    public android.os.Bundle b;
    public java.lang.CharSequence c;
    public java.lang.CharSequence d;
    public int e;
    public int f;
    public android.graphics.Bitmap g;
    public android.net.Uri h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public android.widget.RemoteViews n;
    public char o;
    private int p = -1;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(android.os.Bundle bundle) {
        this.p = bundle.getInt("position", -2);
        this.a = bundle.getInt(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        this.b = bundle.getBundle("extras");
        java.lang.CharSequence charSequence = bundle.getCharSequence("title");
        this.c = charSequence;
        if (charSequence != null) {
            this.c = charSequence.toString();
        }
        java.lang.CharSequence charSequence2 = bundle.getCharSequence("subtitle");
        this.d = charSequence2;
        if (charSequence2 != null) {
            this.d = charSequence2.toString();
        }
        this.e = bundle.getInt("icon_res_id");
        this.k = bundle.containsKey("has_icon_tint_color") ? bundle.getBoolean("has_icon_tint_color") : bundle.containsKey("icon_tint_color");
        this.f = bundle.getInt("icon_tint_color");
        this.g = (android.graphics.Bitmap) bundle.getParcelable("icon_bitmap_id");
        this.h = (android.net.Uri) bundle.getParcelable("icon_uri");
        this.i = bundle.getInt("right_icon_uri_res_id");
        this.l = bundle.containsKey("has_right_icon_tint_color") ? bundle.getBoolean("has_right_icon_tint_color") : bundle.containsKey("right_icon_tint_color");
        this.j = bundle.getInt("right_icon_tint_color");
        this.m = bundle.getBoolean("is_checked");
        this.n = (android.widget.RemoteViews) bundle.getParcelable("remote_views");
        this.o = bundle.getChar("normalized_title_initial");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void d(android.os.Bundle bundle) {
        bundle.putInt("position", this.p);
        bundle.putInt(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.a);
        bundle.putBundle("extras", this.b);
        bundle.putCharSequence("title", this.c);
        bundle.putCharSequence("subtitle", this.d);
        bundle.putInt("icon_res_id", this.e);
        bundle.putBoolean("has_icon_tint_color", this.k);
        bundle.putInt("icon_tint_color", this.f);
        bundle.putParcelable("icon_bitmap_id", this.g);
        bundle.putParcelable("icon_uri", this.h);
        bundle.putInt("right_icon_uri_res_id", this.i);
        bundle.putBoolean("has_right_icon_tint_color", this.l);
        bundle.putInt("right_icon_tint_color", this.j);
        bundle.putBoolean("is_checked", this.m);
        bundle.putParcelable("remote_views", this.n);
        bundle.putChar("normalized_title_initial", this.o);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "[MenuItem " + this.p + ", type " + this.a + ", extras " + this.b + ", title " + this.c + ", subtitle " + this.d + ", iconResId " + this.e + ", hasIconTintColor" + this.k + ", iconTintColor " + this.f + ", iconBitmap " + this.g + ", iconUri " + this.h + ", rightIconResId " + this.i + ", hasRightIconTintColor" + this.l + ", rightIconTintColor " + this.j + ", isChecked " + this.m + ", remoteViews " + this.n + ", normalizedTitleInitial " + this.o + "]";
    }
}
