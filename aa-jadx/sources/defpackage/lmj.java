package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lmj extends defpackage.lma {
    public lmj(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        this.b = mediaDescriptionCompat;
    }

    public final android.graphics.Bitmap O() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).e;
    }

    public final android.net.Uri P() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).f;
    }

    public final java.lang.CharSequence Q() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).d;
    }

    public final java.lang.CharSequence R() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).c;
    }

    public final java.lang.CharSequence S() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).b;
    }

    @Override // defpackage.lma
    public final java.lang.String i() {
        return ((android.support.v4.media.MediaDescriptionCompat) this.b).a;
    }

    @Override // defpackage.lma
    public final android.os.Bundle n() {
        return (android.os.Bundle) new defpackage.nub(((android.support.v4.media.MediaDescriptionCompat) this.b).g).i(android.os.Bundle.EMPTY);
    }
}
