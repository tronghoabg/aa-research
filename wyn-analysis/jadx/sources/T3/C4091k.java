package t3;

import java.util.ArrayList;

/* renamed from: t3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4091k extends AbstractC4097q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f45684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f45685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f45687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4093m f45688e;

    public C4091k(C4093m c4093m, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f45688e = c4093m;
        this.f45684a = obj;
        this.f45685b = arrayList;
        this.f45686c = obj2;
        this.f45687d = arrayList2;
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        abstractC4096p.w(this);
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void e(AbstractC4096p abstractC4096p) {
        C4093m c4093m = this.f45688e;
        Object obj = this.f45684a;
        if (obj != null) {
            c4093m.t(obj, this.f45685b, null);
        }
        Object obj2 = this.f45686c;
        if (obj2 != null) {
            c4093m.t(obj2, this.f45687d, null);
        }
    }
}
