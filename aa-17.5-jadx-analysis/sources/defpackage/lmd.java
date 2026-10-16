package defpackage;

import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat;

/* loaded from: classes.dex */
public final class lmd extends llu {
    public static final lmd a = new lmd(((kmu) new llu((boolean[]) null).b).e());

    public lmd(MediaMetadataCompat mediaMetadataCompat) {
        this.b = mediaMetadataCompat;
    }

    public final long O(String str) {
        return ((MediaMetadataCompat) this.b).a(str);
    }

    public final Bitmap P(String str) {
        return ((MediaMetadataCompat) this.b).b(str);
    }

    public final String Q(String str) {
        return ((MediaMetadataCompat) this.b).f(str);
    }

    @Override // defpackage.llu
    public final lmc h() {
        return new lmc(((MediaMetadataCompat) this.b).c());
    }

    @Override // defpackage.llu
    public final String toString() {
        return ((MediaMetadataCompat) this.b).c().toString();
    }
}
