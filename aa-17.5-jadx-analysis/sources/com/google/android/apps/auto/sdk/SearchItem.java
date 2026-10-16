package com.google.android.apps.auto.sdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public class SearchItem extends AbstractBundleable {
    public static final Parcelable.Creator<SearchItem> CREATOR = new AbstractBundleable.BundleableCreator(SearchItem.class);
    public int a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public Bitmap g;
    private Bundle h;

    public class a {
        private final SearchItem a = new SearchItem();

        public SearchItem a() {
            SearchItem searchItem = this.a;
            if (TextUtils.isEmpty(searchItem.b)) {
                throw new IllegalArgumentException("SearchItem title must be non-empty");
            }
            boolean z = (TextUtils.isEmpty(searchItem.c) && TextUtils.isEmpty(searchItem.d) && TextUtils.isEmpty(searchItem.e) && searchItem.f == 0) ? false : true;
            if (searchItem.a == 1 && z) {
                throw new IllegalArgumentException("Search suggestion can only contain title");
            }
            if (searchItem.g == null || searchItem.f == 0) {
                return searchItem;
            }
            throw new IllegalArgumentException("Cannot set both icon resId and bitmap");
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(Bundle bundle) {
        this.a = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        this.h = bundle.getBundle("extras");
        CharSequence charSequence = bundle.getCharSequence("title");
        this.b = charSequence;
        if (charSequence != null) {
            this.b = charSequence.toString();
        }
        CharSequence charSequence2 = bundle.getCharSequence("subtitle");
        this.c = charSequence2;
        if (charSequence2 != null) {
            this.c = charSequence2.toString();
        }
        this.d = bundle.getCharSequence("description");
        this.e = bundle.getCharSequence("sub_description");
        this.f = bundle.getInt("icon_res_id");
        this.g = (Bitmap) bundle.getParcelable("icon_bitmap_id");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(Bundle bundle) {
        bundle.putInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.a);
        bundle.putBundle("extras", this.h);
        bundle.putCharSequence("title", this.b);
        bundle.putCharSequence("subtitle", this.c);
        bundle.putCharSequence("description", this.d);
        bundle.putCharSequence("sub_description", this.e);
        bundle.putInt("icon_res_id", this.f);
        bundle.putParcelable("icon_bitmap_id", this.g);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "[SearchItem type " + this.a + ", extras " + this.h + ", title " + this.b + ", subtitle " + this.c + ", description " + this.d + ", sub-description " + this.e + ", iconResId " + this.f + ", iconBitmap " + this.g + "]";
    }
}
