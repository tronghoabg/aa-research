package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class dzs implements dzr {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public dzs(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.dzr
    public final dzw a() {
        return new dzw(new dzv(this));
    }

    @Override // defpackage.dzr
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.dzr
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.dzr
    public final void d(Uri uri) {
        this.d = uri;
    }
}
