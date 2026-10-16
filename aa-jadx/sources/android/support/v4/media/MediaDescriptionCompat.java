package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = new defpackage.x(6);
    public final java.lang.String a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;
    public final java.lang.CharSequence d;
    public final android.graphics.Bitmap e;
    public final android.net.Uri f;
    public final android.os.Bundle g;
    private final android.net.Uri h;
    private android.media.MediaDescription i;

    public MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object obj) {
        android.os.Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        defpackage.dc dcVar = new defpackage.dc();
        android.media.MediaDescription mediaDescription = (android.media.MediaDescription) obj;
        dcVar.a = mediaDescription.getMediaId();
        dcVar.b = mediaDescription.getTitle();
        dcVar.c = mediaDescription.getSubtitle();
        dcVar.d = mediaDescription.getDescription();
        dcVar.e = mediaDescription.getIconBitmap();
        dcVar.f = mediaDescription.getIconUri();
        android.os.Bundle bundleA = android.support.v4.media.session.MediaSessionCompat.a(mediaDescription.getExtras());
        if (bundleA != null) {
            bundleA = new android.os.Bundle(bundleA);
        }
        android.net.Uri uri = bundleA != null ? (android.net.Uri) bundleA.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleA;
        } else if (!bundleA.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleA.size() != 2) {
            bundleA.remove("android.support.v4.media.description.MEDIA_URI");
            bundleA.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleA;
        }
        dcVar.g = bundle;
        if (uri != null) {
            dcVar.h = uri;
        } else {
            dcVar.h = mediaDescription.getMediaUri();
        }
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompatA = dcVar.a();
        mediaDescriptionCompatA.i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return ((java.lang.Object) this.b) + ", " + ((java.lang.Object) this.c) + ", " + ((java.lang.Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.media.MediaDescription mediaDescriptionBuild = this.i;
        if (mediaDescriptionBuild == null) {
            android.media.MediaDescription.Builder builder = new android.media.MediaDescription.Builder();
            builder.setMediaId(this.a);
            builder.setTitle(this.b);
            builder.setSubtitle(this.c);
            builder.setDescription(this.d);
            builder.setIconBitmap(this.e);
            builder.setIconUri(this.f);
            builder.setExtras(this.g);
            builder.setMediaUri(this.h);
            mediaDescriptionBuild = builder.build();
            this.i = mediaDescriptionBuild;
        }
        mediaDescriptionBuild.writeToParcel(parcel, i);
    }
}
