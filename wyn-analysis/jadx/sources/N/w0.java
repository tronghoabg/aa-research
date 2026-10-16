package N;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import uf.InterfaceC4291a;
import x.C4420m;

/* loaded from: classes.dex */
public final class w0 implements Iterable, InterfaceC4291a {

    /* renamed from: b, reason: collision with root package name */
    public int f7945b;

    /* renamed from: d, reason: collision with root package name */
    public int f7947d;

    /* renamed from: e, reason: collision with root package name */
    public int f7948e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7949f;

    /* renamed from: g, reason: collision with root package name */
    public int f7950g;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f7952i;

    /* renamed from: j, reason: collision with root package name */
    public C4420m f7953j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f7944a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7946c = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f7951h = new ArrayList();

    public final int a(C0716c c0716c) {
        if (this.f7949f) {
            C0718d.v("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0716c.a()) {
            return c0716c.f7752a;
        }
        C0718d.O("Anchor refers to a group that was removed");
        throw null;
    }

    public final void c() {
        this.f7952i = new HashMap();
    }

    public final v0 d() {
        if (this.f7949f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f7948e++;
        return new v0(this);
    }

    public final y0 e() {
        if (this.f7949f) {
            C0718d.v("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f7948e > 0) {
            C0718d.v("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f7949f = true;
        this.f7950g++;
        return new y0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new G(this, 0, this.f7945b);
    }
}
