package Hf;

/* loaded from: classes5.dex */
public final class p0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5178a;

    @Override // Hf.o0
    public final InterfaceC0602l a(If.E e7) {
        switch (this.f5178a) {
            case 0:
                return new C0605o(m0.f5159a, 1);
            default:
                return new f0(new r0(e7, null));
        }
    }

    public final String toString() {
        switch (this.f5178a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
