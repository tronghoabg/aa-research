package com.google.android.apps.auto.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class SearchItem extends com.google.android.apps.auto.sdk.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.sdk.SearchItem> CREATOR = new com.google.android.apps.auto.sdk.AbstractBundleable.BundleableCreator(com.google.android.apps.auto.sdk.SearchItem.class);
    public int a;
    public java.lang.CharSequence b;
    public java.lang.CharSequence c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public int f;
    public android.graphics.Bitmap g;
    private android.os.Bundle h;

    public class a {
        private final com.google.android.apps.auto.sdk.SearchItem a = new com.google.android.apps.auto.sdk.SearchItem();

        public com.google.android.apps.auto.sdk.SearchItem a() {
            com.google.android.apps.auto.sdk.SearchItem searchItem = this.a;
            if (android.text.TextUtils.isEmpty(searchItem.b)) {
                throw new java.lang.IllegalArgumentException("SearchItem title must be non-empty");
            }
            boolean z = (android.text.TextUtils.isEmpty(searchItem.c) && android.text.TextUtils.isEmpty(searchItem.d) && android.text.TextUtils.isEmpty(searchItem.e) && searchItem.f == 0) ? false : true;
            if (searchItem.a == 1 && z) {
                throw new java.lang.IllegalArgumentException("Search suggestion can only contain title");
            }
            if (searchItem.g == null || searchItem.f == 0) {
                return searchItem;
            }
            throw new java.lang.IllegalArgumentException("Cannot set both icon resId and bitmap");
        }
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        this.a = bundle.getInt(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        this.h = bundle.getBundle("extras");
        java.lang.CharSequence charSequence = bundle.getCharSequence("title");
        this.b = charSequence;
        if (charSequence != null) {
            this.b = charSequence.toString();
        }
        java.lang.CharSequence charSequence2 = bundle.getCharSequence("subtitle");
        this.c = charSequence2;
        if (charSequence2 != null) {
            this.c = charSequence2.toString();
        }
        this.d = bundle.getCharSequence("description");
        this.e = bundle.getCharSequence("sub_description");
        this.f = bundle.getInt("icon_res_id");
        this.g = (android.graphics.Bitmap) bundle.getParcelable("icon_bitmap_id");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void d(android.os.Bundle bundle) {
        bundle.putInt(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.a);
        bundle.putBundle("extras", this.h);
        bundle.putCharSequence("title", this.b);
        bundle.putCharSequence("subtitle", this.c);
        bundle.putCharSequence("description", this.d);
        bundle.putCharSequence("sub_description", this.e);
        bundle.putInt("icon_res_id", this.f);
        bundle.putParcelable("icon_bitmap_id", this.g);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final java.lang.String toString() {
        return "[SearchItem type " + this.a + ", extras " + this.h + ", title " + this.b + ", subtitle " + this.c + ", description " + this.d + ", sub-description " + this.e + ", iconResId " + this.f + ", iconBitmap " + this.g + "]";
    }
}
