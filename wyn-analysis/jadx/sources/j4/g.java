package J4;

import I4.o;
import I4.p;
import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class g implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final p f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f5613d;

    public g(Context context, p pVar, p pVar2, Class cls) {
        this.f5610a = context.getApplicationContext();
        this.f5611b = pVar;
        this.f5612c = pVar2;
        this.f5613d = cls;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && Fe.g.D((Uri) obj);
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        Uri uri = (Uri) obj;
        return new o(new X4.b(uri), new f(this.f5610a, this.f5611b, this.f5612c, uri, i5, i10, gVar, this.f5613d));
    }
}
