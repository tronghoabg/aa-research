package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class MediaBrowserCompat {
    public static final boolean a = android.util.Log.isLoggable("MediaBrowserCompat", 3);
    public final defpackage.cw b;

    public static class SearchResultReceiver extends android.support.v4.os.ResultReceiver {
        private final java.lang.String d;
        private final android.os.Bundle e;
        private final defpackage.cy f;

        public SearchResultReceiver(java.lang.String str, android.os.Bundle bundle, defpackage.cy cyVar, android.os.Handler handler) {
            super(handler);
            this.d = str;
            this.e = bundle;
            this.f = cyVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, android.os.Bundle bundle) {
            if (bundle != null) {
                bundle = android.support.v4.media.session.MediaSessionCompat.a(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f.a(this.d, this.e);
                return;
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray == null) {
                this.f.a(this.d, this.e);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
            for (android.os.Parcelable parcelable : parcelableArray) {
                arrayList.add((android.support.v4.media.MediaBrowserCompat.MediaItem) parcelable);
            }
            this.f.b(this.d, this.e, arrayList);
        }
    }

    public MediaBrowserCompat(android.content.Context context, android.content.ComponentName componentName, defpackage.cv cvVar, android.os.Bundle bundle) {
        this.b = new defpackage.cx(context, componentName, cvVar, bundle);
    }

    @java.lang.Deprecated
    public static class MediaItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat.MediaItem> CREATOR = new defpackage.x(5);
        public final int a;
        public final android.support.v4.media.MediaDescriptionCompat b;

        public MediaItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new java.lang.IllegalArgumentException("description cannot be null");
            }
            if (android.text.TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                throw new java.lang.IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        public static java.util.List b(java.util.List list) {
            android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (java.lang.Object obj : list) {
                if (obj == null) {
                    mediaItem = null;
                } else {
                    android.media.browse.MediaBrowser.MediaItem mediaItem2 = (android.media.browse.MediaBrowser.MediaItem) obj;
                    mediaItem = new android.support.v4.media.MediaBrowserCompat.MediaItem(android.support.v4.media.MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public final java.lang.String a() {
            return this.b.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        public MediaItem(android.os.Parcel parcel) {
            this.a = parcel.readInt();
            this.b = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
