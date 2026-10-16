package Nf;

import Jf.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8697e;

    public l(long j8, l lVar, int i5) {
        super(j8, lVar, i5);
        this.f8697e = new AtomicReferenceArray(k.f8696f);
    }

    @Override // Jf.r
    public final int g() {
        return k.f8696f;
    }

    @Override // Jf.r
    public final void h(int i5, InterfaceC3108h interfaceC3108h) {
        this.f8697e.set(i5, k.f8695e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6136c + ", hashCode=" + hashCode() + ']';
    }
}
