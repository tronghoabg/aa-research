package s;

import java.util.Iterator;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3984d extends AbstractC3985e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C3983c f44818a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44819b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3986f f44820c;

    public C3984d(C3986f c3986f) {
        this.f44820c = c3986f;
    }

    @Override // s.AbstractC3985e
    public final void a(C3983c c3983c) {
        C3983c c3983c2 = this.f44818a;
        if (c3983c == c3983c2) {
            C3983c c3983c3 = c3983c2.f44817d;
            this.f44818a = c3983c3;
            this.f44819b = c3983c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f44819b) {
            return this.f44820c.f44821a != null;
        }
        C3983c c3983c = this.f44818a;
        return (c3983c == null || c3983c.f44816c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f44819b) {
            this.f44819b = false;
            this.f44818a = this.f44820c.f44821a;
        } else {
            C3983c c3983c = this.f44818a;
            this.f44818a = c3983c != null ? c3983c.f44816c : null;
        }
        return this.f44818a;
    }
}
