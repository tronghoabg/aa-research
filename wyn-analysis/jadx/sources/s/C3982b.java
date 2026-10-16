package s;

import java.util.Iterator;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3982b extends AbstractC3985e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C3983c f44811a;

    /* renamed from: b, reason: collision with root package name */
    public C3983c f44812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44813c;

    public C3982b(C3983c c3983c, C3983c c3983c2, int i5) {
        this.f44813c = i5;
        this.f44811a = c3983c2;
        this.f44812b = c3983c;
    }

    @Override // s.AbstractC3985e
    public final void a(C3983c c3983c) {
        C3983c c3983c2;
        C3983c c3983cB = null;
        if (this.f44811a == c3983c && c3983c == this.f44812b) {
            this.f44812b = null;
            this.f44811a = null;
        }
        C3983c c3983c3 = this.f44811a;
        if (c3983c3 == c3983c) {
            switch (this.f44813c) {
                case 0:
                    c3983c2 = c3983c3.f44817d;
                    break;
                default:
                    c3983c2 = c3983c3.f44816c;
                    break;
            }
            this.f44811a = c3983c2;
        }
        C3983c c3983c4 = this.f44812b;
        if (c3983c4 == c3983c) {
            C3983c c3983c5 = this.f44811a;
            if (c3983c4 != c3983c5 && c3983c5 != null) {
                c3983cB = b(c3983c4);
            }
            this.f44812b = c3983cB;
        }
    }

    public final C3983c b(C3983c c3983c) {
        switch (this.f44813c) {
            case 0:
                return c3983c.f44816c;
            default:
                return c3983c.f44817d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44812b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3983c c3983c = this.f44812b;
        C3983c c3983c2 = this.f44811a;
        this.f44812b = (c3983c == c3983c2 || c3983c2 == null) ? null : b(c3983c);
        return c3983c;
    }
}
