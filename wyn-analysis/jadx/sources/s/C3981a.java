package s;

import java.util.HashMap;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3981a extends C3986f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f44810e = new HashMap();

    @Override // s.C3986f
    public final C3983c a(Object obj) {
        return (C3983c) this.f44810e.get(obj);
    }

    @Override // s.C3986f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f44810e.remove(obj);
        return objB;
    }
}
