package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import defpackage.dc;
import defpackage.ea;
import defpackage.yw;

@Deprecated
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final yw a;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private MediaDescriptionCompat g;

    static {
        yw ywVar = new yw();
        a = ywVar;
        ywVar.put("android.media.metadata.TITLE", 1);
        ywVar.put("android.media.metadata.ARTIST", 1);
        ywVar.put("android.media.metadata.DURATION", 0);
        ywVar.put("android.media.metadata.ALBUM", 1);
        ywVar.put("android.media.metadata.AUTHOR", 1);
        ywVar.put("android.media.metadata.WRITER", 1);
        ywVar.put("android.media.metadata.COMPOSER", 1);
        ywVar.put("android.media.metadata.COMPILATION", 1);
        ywVar.put("android.media.metadata.DATE", 1);
        ywVar.put("android.media.metadata.YEAR", 0);
        ywVar.put("android.media.metadata.GENRE", 1);
        ywVar.put("android.media.metadata.TRACK_NUMBER", 0);
        ywVar.put("android.media.metadata.NUM_TRACKS", 0);
        ywVar.put("android.media.metadata.DISC_NUMBER", 0);
        ywVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        ywVar.put("android.media.metadata.ART", 2);
        ywVar.put("android.media.metadata.ART_URI", 1);
        ywVar.put("android.media.metadata.ALBUM_ART", 2);
        ywVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        ywVar.put("android.media.metadata.USER_RATING", 3);
        ywVar.put("android.media.metadata.RATING", 3);
        ywVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        ywVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        ywVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        ywVar.put("android.media.metadata.DISPLAY_ICON", 2);
        ywVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        ywVar.put("android.media.metadata.MEDIA_ID", 1);
        ywVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        ywVar.put("android.media.metadata.MEDIA_URI", 1);
        ywVar.put("android.media.metadata.ADVERTISEMENT", 0);
        ywVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new ea(1);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat d(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.c = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public final long a(String str) {
        return this.b.getLong(str, 0L);
    }

    public final Bitmap b(String str) {
        try {
            return (Bitmap) this.b.getParcelable(str);
        } catch (Exception e2) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e2);
            return null;
        }
    }

    public final MediaDescriptionCompat c() {
        Bitmap bitmapB;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String strF = f("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequenceE = e("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequenceE)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = d;
                int length = strArr.length;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequenceE2 = e(strArr[i2]);
                if (!TextUtils.isEmpty(charSequenceE2)) {
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
            String[] strArr2 = e;
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
            String[] strArr3 = f;
            int length3 = strArr3.length;
            if (i5 >= 3) {
                uri = null;
                break;
            }
            String strF2 = f(strArr3[i5]);
            if (!TextUtils.isEmpty(strF2)) {
                uri = Uri.parse(strF2);
                break;
            }
            i5++;
        }
        String strF3 = f("android.media.metadata.MEDIA_URI");
        Uri uri2 = TextUtils.isEmpty(strF3) ? null : Uri.parse(strF3);
        dc dcVar = new dc();
        dcVar.a = strF;
        dcVar.b = charSequenceArr[0];
        dcVar.c = charSequenceArr[1];
        dcVar.d = charSequenceArr[2];
        dcVar.e = bitmapB;
        dcVar.f = uri;
        dcVar.h = uri2;
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.b;
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dcVar.g = bundle;
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dcVar.a();
        this.g = mediaDescriptionCompatA;
        return mediaDescriptionCompatA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CharSequence e(String str) {
        return this.b.getCharSequence(str);
    }

    public final String f(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        MediaSessionCompat.c(bundle2);
    }
}
