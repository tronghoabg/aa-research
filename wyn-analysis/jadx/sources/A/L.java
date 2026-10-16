package A;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f44a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.e f45b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f46c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f47d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0221n f48e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0221n f49f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0221n f50g;

    /* renamed from: h, reason: collision with root package name */
    public final long f51h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0221n f52i;

    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.n, tf.l] */
    public L(InterfaceC0216i animationSpec, S3.e typeConverter, Object obj, Object obj2, AbstractC0221n abstractC0221n) {
        AbstractC0221n abstractC0221nC;
        AbstractC3340k.e(animationSpec, "animationSpec");
        AbstractC3340k.e(typeConverter, "typeConverter");
        c0 c0VarQ = animationSpec.q(typeConverter);
        this.f44a = c0VarQ;
        this.f45b = typeConverter;
        this.f46c = obj;
        this.f47d = obj2;
        ?? r52 = (AbstractC3343n) typeConverter.f10941b;
        AbstractC0221n abstractC0221n2 = (AbstractC0221n) r52.invoke(obj);
        this.f48e = abstractC0221n2;
        AbstractC0221n abstractC0221n3 = (AbstractC0221n) r52.invoke(obj2);
        this.f49f = abstractC0221n3;
        if (abstractC0221n != null) {
            abstractC0221nC = AbstractC0226t.c(abstractC0221n);
        } else {
            AbstractC0221n abstractC0221n4 = (AbstractC0221n) r52.invoke(obj);
            AbstractC3340k.e(abstractC0221n4, "<this>");
            abstractC0221nC = abstractC0221n4.c();
        }
        this.f50g = abstractC0221nC;
        this.f51h = c0VarQ.i(abstractC0221n2, abstractC0221n3, abstractC0221nC);
        this.f52i = c0VarQ.n(abstractC0221n2, abstractC0221n3, abstractC0221nC);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.n, tf.l] */
    public final Object a(long j8) {
        return j8 >= this.f51h ? this.f47d : ((AbstractC3343n) this.f45b.f10942c).invoke(this.f44a.h(j8, this.f48e, this.f49f, this.f50g));
    }

    public final AbstractC0221n b(long j8) {
        return j8 >= this.f51h ? this.f52i : this.f44a.f(j8, this.f48e, this.f49f, this.f50g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TargetBasedAnimation: ");
        sb2.append(this.f46c);
        sb2.append(" -> ");
        sb2.append(this.f47d);
        sb2.append(",initial velocity: ");
        sb2.append(this.f50g);
        sb2.append(", duration: ");
        return M6.s(sb2, this.f51h / 1000000, " ms");
    }
}
