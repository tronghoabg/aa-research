package i0;

import N.C0740o;
import e0.AbstractC2461m;
import ef.C2515C;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class G extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f36507i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f36508j;
    public final /* synthetic */ String k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2461m f36509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f36510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC2461m f36511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f36512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f36513p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f36514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f36515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f36516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f36517t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f36518u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f36519v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(List list, int i5, String str, AbstractC2461m abstractC2461m, float f10, AbstractC2461m abstractC2461m2, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16, int i12) {
        super(2);
        this.f36507i = list;
        this.f36508j = i5;
        this.k = str;
        this.f36509l = abstractC2461m;
        this.f36510m = f10;
        this.f36511n = abstractC2461m2;
        this.f36512o = f11;
        this.f36513p = f12;
        this.f36514q = i10;
        this.f36515r = i11;
        this.f36516s = f13;
        this.f36517t = f14;
        this.f36518u = f15;
        this.f36519v = f16;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = this.k;
        float f10 = this.f36516s;
        float f11 = this.f36517t;
        gc.b.b(this.f36507i, this.f36508j, str, this.f36509l, this.f36510m, this.f36511n, this.f36512o, this.f36513p, this.f36514q, this.f36515r, f10, f11, this.f36518u, this.f36519v, (C0740o) obj, 9);
        return C2515C.f34653a;
    }
}
