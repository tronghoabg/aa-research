package androidx.datastore.preferences.protobuf;

import com.google.protobuf.F1;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18220a;

    /* renamed from: b, reason: collision with root package name */
    public int f18221b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18222c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f18223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f18224e;

    public /* synthetic */ h0(AbstractMap abstractMap, int i5) {
        this.f18220a = i5;
        this.f18224e = abstractMap;
    }

    public final Iterator a() {
        switch (this.f18220a) {
            case 0:
                if (this.f18223d == null) {
                    this.f18223d = ((d0) this.f18224e).f18195c.entrySet().iterator();
                }
                break;
            default:
                if (this.f18223d == null) {
                    this.f18223d = ((F1) this.f18224e).f27558c.entrySet().iterator();
                }
                break;
        }
        return this.f18223d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18220a) {
            case 0:
                int i5 = this.f18221b + 1;
                d0 d0Var = (d0) this.f18224e;
                if (i5 >= d0Var.f18194b.size()) {
                    if (d0Var.f18195c.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            default:
                int i10 = this.f18221b + 1;
                F1 f1 = (F1) this.f18224e;
                if (i10 >= f1.f27557b.size()) {
                    if (f1.f27558c.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18220a) {
            case 0:
                this.f18222c = true;
                int i5 = this.f18221b + 1;
                this.f18221b = i5;
                d0 d0Var = (d0) this.f18224e;
                if (i5 >= d0Var.f18194b.size()) {
                    break;
                } else {
                    break;
                }
            default:
                this.f18222c = true;
                int i10 = this.f18221b + 1;
                this.f18221b = i10;
                F1 f1 = (F1) this.f18224e;
                if (i10 >= f1.f27557b.size()) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f18224e;
        switch (this.f18220a) {
            case 0:
                if (!this.f18222c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18222c = false;
                int i5 = d0.f18192g;
                d0 d0Var = (d0) abstractMap;
                d0Var.c();
                if (this.f18221b >= d0Var.f18194b.size()) {
                    a().remove();
                    return;
                }
                int i10 = this.f18221b;
                this.f18221b = i10 - 1;
                d0Var.h(i10);
                return;
            default:
                if (!this.f18222c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18222c = false;
                int i11 = F1.f27555h;
                F1 f1 = (F1) abstractMap;
                f1.c();
                if (this.f18221b >= f1.f27557b.size()) {
                    a().remove();
                    return;
                }
                int i12 = this.f18221b;
                this.f18221b = i12 - 1;
                f1.h(i12);
                return;
        }
    }
}
