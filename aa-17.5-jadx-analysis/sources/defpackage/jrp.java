package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class jrp extends hss {
    @Override // defpackage.hss
    public final /* bridge */ /* synthetic */ hsq b() {
        return (jro) super.b();
    }

    @Override // defpackage.hss
    public final /* bridge */ /* synthetic */ hsq c() {
        return a(Drawable.class);
    }

    @Override // defpackage.hss
    public final /* bridge */ /* synthetic */ hsq d(Bitmap bitmap) {
        return (jro) super.d(bitmap);
    }

    @Override // defpackage.hss
    public final /* bridge */ /* synthetic */ hsq e(Uri uri) {
        return (jro) super.e(uri);
    }

    @Override // defpackage.hss
    public final /* bridge */ /* synthetic */ hsq f(Object obj) {
        return (jro) super.f(obj);
    }

    @Override // defpackage.hss
    protected final void o(iek iekVar) {
        super.o(new jrn().n(iekVar));
    }

    @Override // defpackage.hss
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final jro a(Class cls) {
        return new jro(this.a, this, cls, this.b);
    }
}
