package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f49761a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.desugar.sun.nio.fs.o f49762b;

    public o(j$.desugar.sun.nio.fs.o oVar) {
        this.f49762b = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49761a < this.f49762b.f49680c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f49761a;
        j$.desugar.sun.nio.fs.o oVar = this.f49762b;
        if (i2 >= oVar.f49680c.size()) {
            throw new NoSuchElementException();
        }
        j$.desugar.sun.nio.fs.o name = oVar.getName(this.f49761a);
        this.f49761a++;
        return name;
    }
}
