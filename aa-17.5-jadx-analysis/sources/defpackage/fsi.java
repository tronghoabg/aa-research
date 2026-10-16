package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fsi implements fsj {
    public final ajju a;
    private final fsh b;

    public fsi(int i, ajju ajjuVar) {
        this.a = ajjuVar;
        this.b = new fsh(i, this);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fsj
    public final fsg a(MemoryCache$Key memoryCache$Key) {
        aagd aagdVar = (aagd) this.b.b(memoryCache$Key);
        if (aagdVar == null) {
            return null;
        }
        return new fsg((Bitmap) aagdVar.b, aagdVar.c);
    }

    @Override // defpackage.fsj
    public final void b(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i;
        map.getClass();
        fsh fshVar = this.b;
        ca caVar = fshVar.c;
        int iBf = a.bf(bitmap);
        synchronized (caVar) {
            i = fshVar.a;
        }
        fsh fshVar2 = this.b;
        if (iBf <= i) {
            fshVar2.c(memoryCache$Key, new aagd(bitmap, map, iBf));
        } else {
            fshVar2.d(memoryCache$Key);
            this.a.p(memoryCache$Key, bitmap, map, iBf);
        }
    }

    @Override // defpackage.fsj
    public final void c(int i) {
        int i2;
        if (i >= 40) {
            this.b.e(-1);
            return;
        }
        if (i < 10 || i >= 20) {
            return;
        }
        fsh fshVar = this.b;
        synchronized (fshVar.c) {
            i2 = fshVar.b;
        }
        fshVar.e(i2 / 2);
    }
}
