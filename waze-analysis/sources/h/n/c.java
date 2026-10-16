package h.n;

import h.g.a.p;
import h.g.b.x;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements h.m.h {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f48230a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48231b;

    /* renamed from: c, reason: collision with root package name */
    private final p f48232c;

    public c(CharSequence charSequence, int i2, p pVar) {
        x.f(charSequence, "input");
        x.f(pVar, "getNextMatch");
        this.f48230a = charSequence;
        this.f48231b = i2;
        this.f48232c = pVar;
    }

    @Override // h.m.h
    public final Iterator<h.k.j> iterator() {
        return new b(this);
    }
}
