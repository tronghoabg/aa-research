package r9;

import k8.InterfaceC3207p;

/* renamed from: r9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3947d implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3955l f44609b;

    public /* synthetic */ C3947d(C3955l c3955l, int i5) {
        this.f44608a = i5;
        this.f44609b = c3955l;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f44608a) {
            case 0:
                return this.f44609b.f44632b;
            default:
                return this.f44609b.f44636f;
        }
    }
}
