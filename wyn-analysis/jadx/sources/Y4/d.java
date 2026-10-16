package Y4;

import x.C4412e;
import x.C4429v;

/* loaded from: classes.dex */
public final class d extends C4412e {

    /* renamed from: g, reason: collision with root package name */
    public int f16683g;

    @Override // x.C4429v, java.util.Map
    public final void clear() {
        this.f16683g = 0;
        super.clear();
    }

    @Override // x.C4429v
    public final void h(C4429v c4429v) {
        this.f16683g = 0;
        super.h(c4429v);
    }

    @Override // x.C4429v, java.util.Map
    public final int hashCode() {
        if (this.f16683g == 0) {
            this.f16683g = super.hashCode();
        }
        return this.f16683g;
    }

    @Override // x.C4429v
    public final Object i(int i5) {
        this.f16683g = 0;
        return super.i(i5);
    }

    @Override // x.C4429v
    public final Object j(int i5, Object obj) {
        this.f16683g = 0;
        return super.j(i5, obj);
    }

    @Override // x.C4429v, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f16683g = 0;
        return super.put(obj, obj2);
    }
}
