package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.a.v;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f474a;

    public o(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.mBundle);
        this.f474a = bundle;
        v.b(bundle);
    }

    public final MediaMetadataCompat a() {
        return new MediaMetadataCompat(this.f474a);
    }

    public final void b(Bitmap bitmap) {
        if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(MediaMetadataCompat.METADATA_KEY_ART) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(MediaMetadataCompat.METADATA_KEY_ART).intValue() != 2) {
            throw new IllegalArgumentException("The android.media.metadata.ART key cannot be used to put a Bitmap");
        }
        this.f474a.putParcelable(MediaMetadataCompat.METADATA_KEY_ART, bitmap);
    }

    public final void c(long j2) {
        if (MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION) && MediaMetadataCompat.METADATA_KEYS_TYPE.get(MediaMetadataCompat.METADATA_KEY_DURATION).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.f474a.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j2);
    }

    public final void d(String str, String str2) {
        if (!MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(str) || MediaMetadataCompat.METADATA_KEYS_TYPE.get(str).intValue() == 1) {
            this.f474a.putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    public o() {
        this.f474a = new Bundle();
    }
}
