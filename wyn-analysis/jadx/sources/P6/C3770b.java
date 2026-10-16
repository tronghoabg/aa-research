package p6;

import h6.C2783b;
import h6.InterfaceC2787f;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3770b implements InterfaceC2787f {

    /* renamed from: b, reason: collision with root package name */
    public static final C3770b f43261b = new C3770b();

    /* renamed from: a, reason: collision with root package name */
    public final List f43262a;

    public C3770b(C2783b c2783b) {
        this.f43262a = Collections.singletonList(c2783b);
    }

    @Override // h6.InterfaceC2787f
    public final int a(long j8) {
        return j8 < 0 ? 0 : -1;
    }

    @Override // h6.InterfaceC2787f
    public final List g(long j8) {
        return j8 >= 0 ? this.f43262a : Collections.EMPTY_LIST;
    }

    @Override // h6.InterfaceC2787f
    public final long k(int i5) {
        AbstractC4256a.e(i5 == 0);
        return 0L;
    }

    @Override // h6.InterfaceC2787f
    public final int p() {
        return 1;
    }

    public C3770b() {
        this.f43262a = Collections.EMPTY_LIST;
    }
}
