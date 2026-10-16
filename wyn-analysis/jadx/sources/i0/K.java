package i0;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class K extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f36531i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f36532j;
    public final /* synthetic */ float k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f36533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V.d f36534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36535n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, String str, float f10, float f11, V.d dVar, int i5) {
        super(2);
        this.f36531i = l10;
        this.f36532j = str;
        this.k = f10;
        this.f36533l = f11;
        this.f36534m = dVar;
        this.f36535n = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f36535n | 1;
        V.d dVar = this.f36534m;
        String str = this.f36532j;
        float f10 = this.k;
        this.f36531i.h(str, f10, this.f36533l, dVar, (C0740o) obj, i5);
        return C2515C.f34653a;
    }
}
