package h.n;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements h.m.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f48260a;

    public n(CharSequence charSequence) {
        this.f48260a = charSequence;
    }

    @Override // h.m.h
    public final Iterator<String> iterator() {
        return new e(this.f48260a);
    }
}
