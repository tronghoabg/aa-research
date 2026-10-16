package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import defpackage.dc;
import defpackage.x;

@Deprecated
/* loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new x(6);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    private final Uri h;
    private MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        dc dcVar = new dc();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dcVar.a = mediaDescription.getMediaId();
        dcVar.b = mediaDescription.getTitle();
        dcVar.c = mediaDescription.getSubtitle();
        dcVar.d = mediaDescription.getDescription();
        dcVar.e = mediaDescription.getIconBitmap();
        dcVar.f = mediaDescription.getIconUri();
        Bundle bundleA = MediaSessionCompat.a(mediaDescription.getExtras());
        if (bundleA != null) {
            bundleA = new Bundle(bundleA);
        }
        Uri uri = bundleA != null ? (Uri) bundleA.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
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
        MediaDescriptionCompat mediaDescriptionCompatA = dcVar.a();
        mediaDescriptionCompatA.i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionBuild = this.i;
        if (mediaDescriptionBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
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
