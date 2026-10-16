package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class hzp implements hzi, hzq {
    private final ContentResolver a;
    private final boolean b;
    private final /* synthetic */ int c;

    public hzp(ContentResolver contentResolver, boolean z, int i) {
        this.c = i;
        this.a = contentResolver;
        this.b = z;
    }

    @Override // defpackage.hzq
    public final huv a(Uri uri) {
        int i = this.c;
        return i != 0 ? i != 1 ? new hvk(this.a, uri, this.b) : new hur(this.a, uri, this.b) : new hvd(this.a, uri, this.b);
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        int i = this.c;
        return i != 0 ? i != 1 ? new hzr(this) : new hzr(this) : new hzr(this);
    }
}
