package android.support.v4.media;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> CREATOR;
    public static final defpackage.zd a;
    private static final java.lang.String[] d;
    private static final java.lang.String[] e;
    private static final java.lang.String[] f;
    public final android.os.Bundle b;
    public android.media.MediaMetadata c;
    private android.support.v4.media.MediaDescriptionCompat g;

    static {
        defpackage.zd zdVar = new defpackage.zd();
        a = zdVar;
        zdVar.put("android.media.metadata.TITLE", 1);
        zdVar.put("android.media.metadata.ARTIST", 1);
        zdVar.put("android.media.metadata.DURATION", 0);
        zdVar.put("android.media.metadata.ALBUM", 1);
        zdVar.put("android.media.metadata.AUTHOR", 1);
        zdVar.put("android.media.metadata.WRITER", 1);
        zdVar.put("android.media.metadata.COMPOSER", 1);
        zdVar.put("android.media.metadata.COMPILATION", 1);
        zdVar.put("android.media.metadata.DATE", 1);
        zdVar.put("android.media.metadata.YEAR", 0);
        zdVar.put("android.media.metadata.GENRE", 1);
        zdVar.put("android.media.metadata.TRACK_NUMBER", 0);
        zdVar.put("android.media.metadata.NUM_TRACKS", 0);
        zdVar.put("android.media.metadata.DISC_NUMBER", 0);
        zdVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        zdVar.put("android.media.metadata.ART", 2);
        zdVar.put("android.media.metadata.ART_URI", 1);
        zdVar.put("android.media.metadata.ALBUM_ART", 2);
        zdVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        zdVar.put("android.media.metadata.USER_RATING", 3);
        zdVar.put("android.media.metadata.RATING", 3);
        zdVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        zdVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        zdVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        zdVar.put("android.media.metadata.DISPLAY_ICON", 2);
        zdVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        zdVar.put("android.media.metadata.MEDIA_ID", 1);
        zdVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        zdVar.put("android.media.metadata.MEDIA_URI", 1);
        zdVar.put("android.media.metadata.ADVERTISEMENT", 0);
        zdVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new java.lang.String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        e = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new defpackage.ea(1);
    }

    public MediaMetadataCompat(android.os.Parcel parcel) {
        this.b = parcel.readBundle(android.support.v4.media.session.MediaSessionCompat.class.getClassLoader());
    }

    public static android.support.v4.media.MediaMetadataCompat d(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.media.MediaMetadata mediaMetadata = (android.media.MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        android.support.v4.media.MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.c = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public final long a(java.lang.String str) {
        return this.b.getLong(str, 0L);
    }

    public final android.graphics.Bitmap b(java.lang.String str) {
        try {
            return (android.graphics.Bitmap) this.b.getParcelable(str);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e2);
            return null;
        }
    }

    public final android.support.v4.media.MediaDescriptionCompat c() {
        android.graphics.Bitmap bitmapB;
        android.net.Uri uri;
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        java.lang.String strF = f("android.media.metadata.MEDIA_ID");
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        java.lang.CharSequence charSequenceE = e("android.media.metadata.DISPLAY_TITLE");
        if (android.text.TextUtils.isEmpty(charSequenceE)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                java.lang.String[] strArr = d;
                int length = strArr.length;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 + 1;
                java.lang.CharSequence charSequenceE2 = e(strArr[i2]);
                if (!android.text.TextUtils.isEmpty(charSequenceE2)) {
                    charSequenceArr[i] = charSequenceE2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequenceE;
            charSequenceArr[1] = e("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = e("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            java.lang.String[] strArr2 = e;
            int length2 = strArr2.length;
            if (i4 >= 3) {
                bitmapB = null;
                break;
            }
            bitmapB = b(strArr2[i4]);
            if (bitmapB != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            java.lang.String[] strArr3 = f;
            int length3 = strArr3.length;
            if (i5 >= 3) {
                uri = null;
                break;
            }
            java.lang.String strF2 = f(strArr3[i5]);
            if (!android.text.TextUtils.isEmpty(strF2)) {
                uri = android.net.Uri.parse(strF2);
                break;
            }
            i5++;
        }
        java.lang.String strF3 = f("android.media.metadata.MEDIA_URI");
        android.net.Uri uri2 = android.text.TextUtils.isEmpty(strF3) ? null : android.net.Uri.parse(strF3);
        dc dcVar = new dc();
        dcVar.a = strF;
        dcVar.b = charSequenceArr[0];
        dcVar.c = charSequenceArr[1];
        dcVar.d = charSequenceArr[2];
        dcVar.e = bitmapB;
        dcVar.f = uri;
        dcVar.h = uri2;
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.b;
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dcVar.g = bundle;
        }
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompatA = dcVar.a();
        this.g = mediaDescriptionCompatA;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.CharSequence e(java.lang.String str) {
        return this.b.getCharSequence(str);
    }

    public final java.lang.String f(java.lang.String str) {
        java.lang.CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public MediaMetadataCompat(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.b = bundle2;
        android.support.v4.media.session.MediaSessionCompat.c(bundle2);
    }
}
