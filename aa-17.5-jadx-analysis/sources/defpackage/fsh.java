package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;

/* loaded from: classes2.dex */
public final class fsh extends zu {
    final /* synthetic */ fsi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsh(int i, fsi fsiVar) {
        super(i);
        this.d = fsiVar;
    }

    @Override // defpackage.zu
    public final /* bridge */ /* synthetic */ int a(Object obj, Object obj2) {
        aagd aagdVar = (aagd) obj2;
        ((MemoryCache$Key) obj).getClass();
        aagdVar.getClass();
        return aagdVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.zu
    public final /* bridge */ /* synthetic */ void f(Object obj, Object obj2, Object obj3) {
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        aagd aagdVar = (aagd) obj2;
        memoryCache$Key.getClass();
        aagdVar.getClass();
        Object obj4 = aagdVar.b;
        ?? r0 = aagdVar.c;
        int i = aagdVar.a;
        this.d.a.p(memoryCache$Key, (Bitmap) obj4, r0, i);
    }
}
