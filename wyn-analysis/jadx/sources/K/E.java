package K;

import N.C0740o;
import e0.InterfaceC2442E;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class E extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z.i f6158i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f6159j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f6161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V.d f6162n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6163o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Z.i iVar, InterfaceC2442E interfaceC2442E, long j8, long j10, float f10, V.d dVar, int i5) {
        super(2);
        this.f6158i = iVar;
        this.f6159j = interfaceC2442E;
        this.k = j8;
        this.f6160l = j10;
        this.f6161m = f10;
        this.f6162n = dVar;
        this.f6163o = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f6163o | 1;
        V.d dVar = this.f6162n;
        long j8 = this.k;
        long j10 = this.f6160l;
        Fe.g.e(this.f6158i, this.f6159j, j8, j10, this.f6161m, dVar, (C0740o) obj, i5);
        return C2515C.f34653a;
    }
}
