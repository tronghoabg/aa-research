package N;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class I0 implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f7707a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7708b;

    /* renamed from: c, reason: collision with root package name */
    public final C0718d f7709c;

    public I0(w0 w0Var, int i5, H h10, C0718d c0718d) {
        this.f7707a = w0Var;
        this.f7708b = i5;
        this.f7709c = c0718d;
        h10.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new G(this.f7707a, this.f7708b, null, this.f7709c);
    }
}
