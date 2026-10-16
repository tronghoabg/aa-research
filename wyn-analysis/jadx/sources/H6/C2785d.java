package h6;

import java.util.ArrayDeque;
import java.util.List;
import u6.AbstractC4256a;

/* renamed from: h6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2785d extends H5.a implements InterfaceC2787f {

    /* renamed from: c, reason: collision with root package name */
    public long f36186c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2787f f36187d;

    /* renamed from: e, reason: collision with root package name */
    public long f36188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f36189f;

    /* renamed from: g, reason: collision with root package name */
    public Object f36190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2785d() {
        super(0);
        this.f36189f = 2;
    }

    @Override // h6.InterfaceC2787f
    public final int a(long j8) {
        InterfaceC2787f interfaceC2787f = this.f36187d;
        interfaceC2787f.getClass();
        return interfaceC2787f.a(j8 - this.f36188e);
    }

    @Override // h6.InterfaceC2787f
    public final List g(long j8) {
        InterfaceC2787f interfaceC2787f = this.f36187d;
        interfaceC2787f.getClass();
        return interfaceC2787f.g(j8 - this.f36188e);
    }

    @Override // h6.InterfaceC2787f
    public final long k(int i5) {
        InterfaceC2787f interfaceC2787f = this.f36187d;
        interfaceC2787f.getClass();
        return interfaceC2787f.k(i5) + this.f36188e;
    }

    public final void o() {
        switch (this.f36189f) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((N7.e) this.f36190g).f8591e;
                AbstractC4256a.i(arrayDeque.size() < 2);
                AbstractC4256a.e(!arrayDeque.contains(this));
                this.f4893b = 0;
                this.f36187d = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                AbstractC2786e abstractC2786e = (AbstractC2786e) this.f36190g;
                synchronized (abstractC2786e.f36192b) {
                    this.f4893b = 0;
                    this.f36187d = null;
                    int i5 = abstractC2786e.f36198h;
                    abstractC2786e.f36198h = i5 + 1;
                    abstractC2786e.f36196f[i5] = this;
                    if (!abstractC2786e.f36193c.isEmpty() && abstractC2786e.f36198h > 0) {
                        abstractC2786e.f36192b.notify();
                    }
                }
                return;
            default:
                i6.h hVar = (i6.h) ((com.unity3d.services.core.webview.b) this.f36190g).f32729b;
                hVar.getClass();
                this.f4893b = 0;
                this.f36187d = null;
                hVar.f36869b.add(this);
                return;
        }
    }

    @Override // h6.InterfaceC2787f
    public final int p() {
        InterfaceC2787f interfaceC2787f = this.f36187d;
        interfaceC2787f.getClass();
        return interfaceC2787f.p();
    }

    public final void q(long j8, InterfaceC2787f interfaceC2787f, long j10) {
        this.f36186c = j8;
        this.f36187d = interfaceC2787f;
        if (j10 != Long.MAX_VALUE) {
            j8 = j10;
        }
        this.f36188e = j8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2785d(InterfaceC2788g interfaceC2788g, int i5) {
        super(0);
        this.f36189f = i5;
        this.f36190g = interfaceC2788g;
    }
}
