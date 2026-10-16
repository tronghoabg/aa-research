package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lmk extends defpackage.lma {
    public static final defpackage.lmk a = new defpackage.lmk(((defpackage.knb) new defpackage.lma((boolean[]) null).b).e());

    public lmk(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        this.b = mediaMetadataCompat;
    }

    public final long O(java.lang.String str) {
        return ((android.support.v4.media.MediaMetadataCompat) this.b).a(str);
    }

    public final android.graphics.Bitmap P(java.lang.String str) {
        return ((android.support.v4.media.MediaMetadataCompat) this.b).b(str);
    }

    public final java.lang.String Q(java.lang.String str) {
        return ((android.support.v4.media.MediaMetadataCompat) this.b).f(str);
    }

    @Override // defpackage.lma
    public final lmj h() {
        return new lmj(((android.support.v4.media.MediaMetadataCompat) this.b).c());
    }

    @Override // defpackage.lma
    public final java.lang.String toString() {
        return ((android.support.v4.media.MediaMetadataCompat) this.b).c().toString();
    }
}
