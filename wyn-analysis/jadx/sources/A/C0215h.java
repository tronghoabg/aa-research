package A;

import N.C0718d;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: A.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f157a;

    /* renamed from: b, reason: collision with root package name */
    public final long f158b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3343n f159c;

    /* renamed from: d, reason: collision with root package name */
    public final N.Y f160d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0221n f161e;

    /* renamed from: f, reason: collision with root package name */
    public long f162f;

    /* renamed from: g, reason: collision with root package name */
    public long f163g;

    /* renamed from: h, reason: collision with root package name */
    public final N.Y f164h;

    /* JADX WARN: Multi-variable type inference failed */
    public C0215h(Object obj, S3.e typeConverter, AbstractC0221n initialVelocityVector, long j8, Object obj2, long j10, tf.a aVar) {
        AbstractC3340k.e(typeConverter, "typeConverter");
        AbstractC3340k.e(initialVelocityVector, "initialVelocityVector");
        this.f157a = obj2;
        this.f158b = j10;
        this.f159c = (AbstractC3343n) aVar;
        N.P p10 = N.P.f7730f;
        this.f160d = C0718d.G(obj, p10);
        this.f161e = AbstractC0226t.c(initialVelocityVector);
        this.f162f = j8;
        this.f163g = Long.MIN_VALUE;
        this.f164h = C0718d.G(Boolean.TRUE, p10);
    }
}
