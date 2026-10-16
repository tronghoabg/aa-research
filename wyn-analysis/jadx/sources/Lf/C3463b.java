package lf;

import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* renamed from: lf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3463b implements InterfaceC3103c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3463b f40278a = new C3463b();

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
