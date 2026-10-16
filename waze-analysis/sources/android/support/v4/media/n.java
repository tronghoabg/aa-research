package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private String f466a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f467b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f468c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f469d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f470e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f471f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f472g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f473h;

    public final MediaDescriptionCompat a() {
        return new MediaDescriptionCompat(this.f466a, this.f467b, this.f468c, this.f469d, this.f470e, this.f471f, this.f472g, this.f473h);
    }

    public final void b(CharSequence charSequence) {
        this.f469d = charSequence;
    }

    public final void c(Bundle bundle) {
        this.f472g = bundle;
    }

    public final void d(Bitmap bitmap) {
        this.f470e = bitmap;
    }

    public final void e(Uri uri) {
        this.f471f = uri;
    }

    public final void f(String str) {
        this.f466a = str;
    }

    public final void g(Uri uri) {
        this.f473h = uri;
    }

    public final void h(CharSequence charSequence) {
        this.f468c = charSequence;
    }

    public final void i(CharSequence charSequence) {
        this.f467b = charSequence;
    }
}
