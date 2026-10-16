package com.google.android.apps.auto.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public class MenuItem extends AbstractBundleable {
    public static final Parcelable.Creator<MenuItem> CREATOR = new AbstractBundleable.BundleableCreator(MenuItem.class);
    public int a;
    public Bundle b;
    public CharSequence c;
    public CharSequence d;
    public int e;
    public int f;
    public Bitmap g;
    public Uri h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public RemoteViews n;
    public char o;
    private int p = -1;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.p = bundle.getInt("position", -2);
        this.a = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        this.b = bundle.getBundle("extras");
        CharSequence charSequence = bundle.getCharSequence("title");
        this.c = charSequence;
        if (charSequence != null) {
            this.c = charSequence.toString();
        }
        CharSequence charSequence2 = bundle.getCharSequence("subtitle");
        this.d = charSequence2;
        if (charSequence2 != null) {
            this.d = charSequence2.toString();
        }
        this.e = bundle.getInt("icon_res_id");
        this.k = bundle.containsKey("has_icon_tint_color") ? bundle.getBoolean("has_icon_tint_color") : bundle.containsKey("icon_tint_color");
        this.f = bundle.getInt("icon_tint_color");
        this.g = (Bitmap) bundle.getParcelable("icon_bitmap_id");
        this.h = (Uri) bundle.getParcelable("icon_uri");
        this.i = bundle.getInt("right_icon_uri_res_id");
        this.l = bundle.containsKey("has_right_icon_tint_color") ? bundle.getBoolean("has_right_icon_tint_color") : bundle.containsKey("right_icon_tint_color");
        this.j = bundle.getInt("right_icon_tint_color");
        this.m = bundle.getBoolean("is_checked");
        this.n = (RemoteViews) bundle.getParcelable("remote_views");
        this.o = bundle.getChar("normalized_title_initial");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void d(Bundle bundle) {
        bundle.putInt("position", this.p);
        bundle.putInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.a);
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
    public final String toString() {
        return "[MenuItem " + this.p + ", type " + this.a + ", extras " + this.b + ", title " + this.c + ", subtitle " + this.d + ", iconResId " + this.e + ", hasIconTintColor" + this.k + ", iconTintColor " + this.f + ", iconBitmap " + this.g + ", iconUri " + this.h + ", rightIconResId " + this.i + ", hasRightIconTintColor" + this.l + ", rightIconTintColor " + this.j + ", isChecked " + this.m + ", remoteViews " + this.n + ", normalizedTitleInitial " + this.o + "]";
    }
}
