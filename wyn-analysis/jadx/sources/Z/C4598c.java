package z;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4598c extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f48208i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.k f48209j;
    public final /* synthetic */ C4605j k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C4606k f48210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f48211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V.d f48212n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f48213o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4598c(boolean z2, Z.k kVar, C4605j c4605j, C4606k c4606k, String str, V.d dVar, int i5) {
        super(2);
        this.f48208i = z2;
        this.f48209j = kVar;
        this.k = c4605j;
        this.f48210l = c4606k;
        this.f48211m = str;
        this.f48212n = dVar;
        this.f48213o = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f48213o | 1;
        V.d dVar = this.f48212n;
        C4605j c4605j = this.k;
        C4606k c4606k = this.f48210l;
        Fe.c.b(this.f48208i, this.f48209j, c4605j, c4606k, this.f48211m, dVar, (C0740o) obj, i5);
        return C2515C.f34653a;
    }
}
