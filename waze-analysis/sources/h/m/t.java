package h.m;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t<T> implements h, b {

    /* renamed from: a, reason: collision with root package name */
    private final h f48204a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48205b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48206c;

    public t(h hVar, int i2, int i3) {
        this.f48206c = i3;
        x.f(hVar, "sequence");
        this.f48204a = hVar;
        this.f48205b = i2;
    }

    @Override // h.m.b
    public final h a(int i2) {
        int i3 = this.f48206c;
        int i4 = this.f48205b;
        if (i3 == 0) {
            return i2 >= i4 ? k.e() : new r(this.f48204a, i2, i4);
        }
        int i5 = i4 + i2;
        return i5 < 0 ? new t(this, i2, 1, null) : new t(this.f48204a, i5, 1, null);
    }

    @Override // h.m.b
    public final h b(int i2) {
        int i3 = this.f48206c;
        int i4 = this.f48205b;
        if (i3 == 0) {
            return i2 >= i4 ? this : new t(this.f48204a, i2, 0);
        }
        int i5 = i4 + i2;
        return i5 < 0 ? new t(this, i2, 0) : new r(this.f48204a, i4, i5);
    }

    @Override // h.m.h
    public final Iterator iterator() {
        return this.f48206c != 0 ? new s(this, 1, null) : new s(this, 0);
    }

    public t(h hVar, int i2, int i3, byte[] bArr) {
        this.f48206c = i3;
        x.f(hVar, "sequence");
        this.f48204a = hVar;
        this.f48205b = i2;
    }
}
