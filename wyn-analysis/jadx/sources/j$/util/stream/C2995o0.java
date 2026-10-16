package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2995o0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3029v0 f38266b;

    public /* synthetic */ C2995o0(EnumC3029v0 enumC3029v0, int i5) {
        this.f38265a = i5;
        this.f38266b = enumC3029v0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f38265a) {
            case 0:
                return new C3014s0(this.f38266b);
            default:
                return new C3019t0(this.f38266b);
        }
    }
}
