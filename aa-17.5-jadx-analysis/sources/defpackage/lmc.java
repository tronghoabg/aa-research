package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes2.dex */
public final class lmc extends llu {
    public lmc(MediaDescriptionCompat mediaDescriptionCompat) {
        this.b = mediaDescriptionCompat;
    }

    public final Bitmap O() {
        return ((MediaDescriptionCompat) this.b).e;
    }

    public final Uri P() {
        return ((MediaDescriptionCompat) this.b).f;
    }

    public final CharSequence Q() {
        return ((MediaDescriptionCompat) this.b).d;
    }

    public final CharSequence R() {
        return ((MediaDescriptionCompat) this.b).c;
    }

    public final CharSequence S() {
        return ((MediaDescriptionCompat) this.b).b;
    }

    @Override // defpackage.llu
    public final String i() {
        return ((MediaDescriptionCompat) this.b).a;
    }

    @Override // defpackage.llu
    public final Bundle n() {
        return (Bundle) new ntn(((MediaDescriptionCompat) this.b).g).i(Bundle.EMPTY);
    }
}
