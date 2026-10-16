package h.m;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r<T> implements h, b {

    /* renamed from: a, reason: collision with root package name */
    private final h f48198a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48199b;

    /* renamed from: c, reason: collision with root package name */
    private final int f48200c;

    public r(h hVar, int i2, int i3) {
        x.f(hVar, "sequence");
        this.f48198a = hVar;
        this.f48199b = i2;
        this.f48200c = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException("startIndex should be non-negative, but is " + i2);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex should be non-negative, but is " + i3);
        }
        if (i3 >= i2) {
            return;
        }
        throw new IllegalArgumentException("endIndex should be not less than startIndex, but was " + i3 + " < " + i2);
    }

    private final int f() {
        return this.f48200c - this.f48199b;
    }

    @Override // h.m.b
    public final h a(int i2) {
        if (i2 >= f()) {
            return k.e();
        }
        return new r(this.f48198a, this.f48199b + i2, this.f48200c);
    }

    @Override // h.m.b
    public final h b(int i2) {
        if (i2 >= f()) {
            return this;
        }
        h hVar = this.f48198a;
        int i3 = this.f48199b;
        return new r(hVar, i3, i2 + i3);
    }

    @Override // h.m.h
    public final Iterator<T> iterator() {
        return new q(this);
    }
}
