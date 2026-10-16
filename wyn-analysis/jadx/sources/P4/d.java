package P4;

import B4.k;
import E4.B;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: b, reason: collision with root package name */
    public final K4.a f9118b;

    public d(K4.a aVar) {
        gc.b.k(aVar, "Argument must not be null");
        this.f9118b = aVar;
    }

    @Override // B4.k
    public final B a(Context context, B b5, int i5, int i10) {
        c cVar = (c) b5.get();
        L4.c cVar2 = new L4.c(com.bumptech.glide.b.b(context).f24210a, ((h) cVar.f9108a.f9107b).f9135l);
        K4.a aVar = this.f9118b;
        aVar.getClass();
        if (!cVar2.equals(cVar2)) {
            cVar2.a();
        }
        ((h) cVar.f9108a.f9107b).c(aVar, (Bitmap) cVar2.f6895b);
        return b5;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        this.f9118b.getClass();
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f9118b.equals(((d) obj).f9118b);
        }
        return false;
    }

    @Override // B4.d
    public final int hashCode() {
        return this.f9118b.hashCode();
    }
}
