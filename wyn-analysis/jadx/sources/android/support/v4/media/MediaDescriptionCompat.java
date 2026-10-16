package android.support.v4.media;

import Z6.c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new c(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f17658a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17659b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f17660c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f17661d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f17662e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f17663f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f17664g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f17665h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f17666i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17658a = str;
        this.f17659b = charSequence;
        this.f17660c = charSequence2;
        this.f17661d = charSequence3;
        this.f17662e = bitmap;
        this.f17663f = uri;
        this.f17664g = bundle;
        this.f17665h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17659b) + ", " + ((Object) this.f17660c) + ", " + ((Object) this.f17661d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        MediaDescription mediaDescriptionA = this.f17666i;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.f17658a);
            a.p(builderB, this.f17659b);
            a.o(builderB, this.f17660c);
            a.j(builderB, this.f17661d);
            a.l(builderB, this.f17662e);
            a.m(builderB, this.f17663f);
            a.k(builderB, this.f17664g);
            b.b(builderB, this.f17665h);
            mediaDescriptionA = a.a(builderB);
            this.f17666i = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i5);
    }
}
