package A;

import N.C0718d;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;

/* renamed from: A.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212e {

    /* renamed from: a, reason: collision with root package name */
    public final S3.e f141a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f142b;

    /* renamed from: c, reason: collision with root package name */
    public final C0217j f143c;

    /* renamed from: d, reason: collision with root package name */
    public final N.Y f144d;

    /* renamed from: e, reason: collision with root package name */
    public final N.Y f145e;

    /* renamed from: f, reason: collision with root package name */
    public final A f146f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0221n f147g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0221n f148h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0221n f149i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0221n f150j;

    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.internal.n, tf.l] */
    public C0212e(Object obj, S3.e typeConverter, Object obj2) {
        AbstractC3340k.e(typeConverter, "typeConverter");
        this.f141a = typeConverter;
        this.f142b = obj2;
        this.f143c = new C0217j(typeConverter, obj, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        Boolean bool = Boolean.FALSE;
        N.P p10 = N.P.f7730f;
        this.f144d = C0718d.G(bool, p10);
        this.f145e = C0718d.G(obj, p10);
        this.f146f = new A();
        new F(1500.0f, obj2);
        AbstractC0221n abstractC0221n = (AbstractC0221n) ((AbstractC3343n) typeConverter.f10941b).invoke(obj);
        int iB = abstractC0221n.b();
        for (int i5 = 0; i5 < iB; i5++) {
            abstractC0221n.e(Float.NEGATIVE_INFINITY, i5);
        }
        this.f147g = abstractC0221n;
        AbstractC0221n abstractC0221n2 = (AbstractC0221n) ((AbstractC3343n) this.f141a.f10941b).invoke(obj);
        int iB2 = abstractC0221n2.b();
        for (int i10 = 0; i10 < iB2; i10++) {
            abstractC0221n2.e(Float.POSITIVE_INFINITY, i10);
        }
        this.f148h = abstractC0221n2;
        this.f149i = abstractC0221n;
        this.f150j = abstractC0221n2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.internal.n, tf.l] */
    public static final Object a(C0212e c0212e, Object obj) {
        AbstractC0221n abstractC0221n = c0212e.f147g;
        AbstractC0221n abstractC0221n2 = c0212e.f149i;
        boolean zA = AbstractC3340k.a(abstractC0221n2, abstractC0221n);
        AbstractC0221n abstractC0221n3 = c0212e.f150j;
        if (!zA || !AbstractC3340k.a(abstractC0221n3, c0212e.f148h)) {
            S3.e eVar = c0212e.f141a;
            AbstractC0221n abstractC0221n4 = (AbstractC0221n) ((AbstractC3343n) eVar.f10941b).invoke(obj);
            int iB = abstractC0221n4.b();
            boolean z2 = false;
            for (int i5 = 0; i5 < iB; i5++) {
                if (abstractC0221n4.a(i5) < abstractC0221n2.a(i5) || abstractC0221n4.a(i5) > abstractC0221n3.a(i5)) {
                    abstractC0221n4.e(android.support.v4.media.session.b.R(abstractC0221n4.a(i5), abstractC0221n2.a(i5), abstractC0221n3.a(i5)), i5);
                    z2 = true;
                }
            }
            if (z2) {
                return ((AbstractC3343n) eVar.f10942c).invoke(abstractC0221n4);
            }
        }
        return obj;
    }

    public static final void b(C0212e c0212e) {
        C0217j c0217j = c0212e.f143c;
        ((AbstractC0221n) c0217j.f171g).d();
        c0217j.f166b = Long.MIN_VALUE;
        c0212e.f144d.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.n, tf.l] */
    public static Object c(C0212e c0212e, Object obj, InterfaceC0216i animationSpec, InterfaceC3103c interfaceC3103c) {
        Object objInvoke = ((AbstractC3343n) c0212e.f141a.f10942c).invoke((AbstractC0221n) c0212e.f143c.f171g);
        Object objD = c0212e.d();
        AbstractC3340k.e(animationSpec, "animationSpec");
        S3.e typeConverter = c0212e.f141a;
        AbstractC3340k.e(typeConverter, "typeConverter");
        return A.a(c0212e.f146f, new C0209b(c0212e, objInvoke, new L(animationSpec, typeConverter, objD, obj, (AbstractC0221n) ((AbstractC3343n) typeConverter.f10941b).invoke(objInvoke)), c0212e.f143c.f166b, null), interfaceC3103c);
    }

    public final Object d() {
        return ((N.Y) this.f143c.f170f).getValue();
    }

    public final Object e(Comparable comparable, AbstractC3471j abstractC3471j) {
        Object objA = A.a(this.f146f, new C0210c(this, comparable, null), abstractC3471j);
        return objA == kf.a.f39711a ? objA : C2515C.f34653a;
    }

    public final Object f(AbstractC3471j abstractC3471j) {
        Object objA = A.a(this.f146f, new C0211d(this, null), abstractC3471j);
        return objA == kf.a.f39711a ? objA : C2515C.f34653a;
    }
}
