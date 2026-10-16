package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
public final class dzq implements dzr {
    private final ContentInfo.Builder a;

    public dzq(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.dzr
    public final dzw a() {
        return new dzw(new dzt(this.a.build()));
    }

    @Override // defpackage.dzr
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.dzr
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.dzr
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
