package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class icq extends ieq {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public icq(Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }
}
