package P4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e extends V4.a {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f9119d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9120e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9121f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f9122g;

    public e(Handler handler, int i5, long j8) {
        this.f9119d = handler;
        this.f9120e = i5;
        this.f9121f = j8;
    }

    @Override // V4.a
    public final void c(Drawable drawable) {
        this.f9122g = null;
    }

    @Override // V4.a
    public final void e(Object obj) {
        this.f9122g = (Bitmap) obj;
        Handler handler = this.f9119d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f9121f);
    }
}
