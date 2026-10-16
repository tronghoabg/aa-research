package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class lyv {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public Bitmap g;
    public Uri h;
    public CharSequence i;
    private yfq j;
    private yfq k;
    private long l;
    private byte m;

    public final lyw a() {
        yfq yfqVar;
        yfq yfqVar2;
        if (this.m == 1 && (yfqVar = this.j) != null && (yfqVar2 = this.k) != null) {
            return new lyw(this.a, this.b, this.c, this.d, this.e, this.f, yfqVar, yfqVar2, this.g, this.h, this.l, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" icons");
        }
        if (this.k == null) {
            sb.append(" tertiaryIcons");
        }
        if (this.m == 0) {
            sb.append(" imageLoadTimeoutMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.j = yfq.o(list);
    }

    public final void c(long j) {
        this.l = j;
        this.m = (byte) 1;
    }

    public final void d(List list) {
        this.k = yfq.o(list);
    }
}
