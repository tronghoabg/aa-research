package f6;

import k8.InterfaceC3207p;
import t6.InterfaceC4143k;

/* renamed from: f6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2599l implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35073c;

    public /* synthetic */ C2599l(int i5, Object obj, Object obj2) {
        this.f35071a = i5;
        this.f35072b = obj;
        this.f35073c = obj2;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f35071a) {
            case 0:
                return new C2586P((InterfaceC4143k) this.f35073c, (J5.i) ((C8.i) this.f35072b).f1939b);
            default:
                return new k2.Y((S3.c) this.f35073c, (s2.k) ((F6.r) this.f35072b).f4012c);
        }
    }
}
