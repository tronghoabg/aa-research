package A;

import N.C0718d;
import N.K0;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class O implements K0 {

    /* renamed from: a, reason: collision with root package name */
    public final S3.e f59a;

    /* renamed from: b, reason: collision with root package name */
    public final N.Y f60b;

    /* renamed from: c, reason: collision with root package name */
    public final N.Y f61c;

    /* renamed from: d, reason: collision with root package name */
    public final N.Y f62d;

    /* renamed from: e, reason: collision with root package name */
    public final N.Y f63e;

    /* renamed from: f, reason: collision with root package name */
    public final N.Y f64f;

    /* renamed from: g, reason: collision with root package name */
    public final N.Y f65g;

    /* renamed from: h, reason: collision with root package name */
    public final N.Y f66h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0221n f67i;

    /* renamed from: j, reason: collision with root package name */
    public final F f68j;
    public final /* synthetic */ U k;

    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    public O(U u10, Object obj, AbstractC0221n initialVelocityVector, S3.e typeConverter, String label) {
        AbstractC3340k.e(initialVelocityVector, "initialVelocityVector");
        AbstractC3340k.e(typeConverter, "typeConverter");
        AbstractC3340k.e(label, "label");
        this.k = u10;
        this.f59a = typeConverter;
        N.P p10 = N.P.f7730f;
        N.Y yG = C0718d.G(obj, p10);
        this.f60b = yG;
        Object objInvoke = null;
        this.f61c = C0718d.G(AbstractC0226t.i(7, null), p10);
        this.f62d = C0718d.G(new L(b(), typeConverter, obj, yG.getValue(), initialVelocityVector), p10);
        this.f63e = C0718d.G(Boolean.TRUE, p10);
        this.f64f = C0718d.G(0L, p10);
        this.f65g = C0718d.G(Boolean.FALSE, p10);
        this.f66h = C0718d.G(obj, p10);
        this.f67i = initialVelocityVector;
        Float f10 = (Float) f0.f154a.get(typeConverter);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            AbstractC0221n abstractC0221n = (AbstractC0221n) ((AbstractC3343n) typeConverter.f10941b).invoke(obj);
            int iB = abstractC0221n.b();
            for (int i5 = 0; i5 < iB; i5++) {
                abstractC0221n.e(fFloatValue, i5);
            }
            objInvoke = ((AbstractC3343n) this.f59a.f10942c).invoke(abstractC0221n);
        }
        this.f68j = AbstractC0226t.i(3, objInvoke);
    }

    public static void c(O o7, Object obj, boolean z2, int i5) {
        if ((i5 & 1) != 0) {
            obj = o7.f66h.getValue();
        }
        Object obj2 = obj;
        if ((i5 & 2) != 0) {
            z2 = false;
        }
        InterfaceC0227u interfaceC0227uB = (!z2 || (o7.b() instanceof F)) ? o7.b() : o7.f68j;
        o7.f62d.setValue(new L(interfaceC0227uB, o7.f59a, obj2, o7.f60b.getValue(), o7.f67i));
        U u10 = o7.k;
        Boolean bool = Boolean.TRUE;
        N.Y y10 = u10.f85g;
        y10.setValue(bool);
        if (!u10.d()) {
            return;
        }
        ListIterator listIterator = u10.f86h.listIterator();
        long jMax = 0;
        while (true) {
            X.v vVar = (X.v) listIterator;
            if (!vVar.hasNext()) {
                y10.setValue(Boolean.FALSE);
                return;
            }
            O o10 = (O) vVar.next();
            jMax = Math.max(jMax, o10.a().f51h);
            o10.f66h.setValue(o10.a().a(0L));
            o10.f67i = o10.a().b(0L);
        }
    }

    public final L a() {
        return (L) this.f62d.getValue();
    }

    public final InterfaceC0227u b() {
        return (InterfaceC0227u) this.f61c.getValue();
    }

    public final void d(Object obj, Object obj2, InterfaceC0227u animationSpec) {
        AbstractC3340k.e(animationSpec, "animationSpec");
        this.f60b.setValue(obj2);
        this.f61c.setValue(animationSpec);
        if (AbstractC3340k.a(a().f46c, obj) && AbstractC3340k.a(a().f47d, obj2)) {
            return;
        }
        c(this, obj, false, 2);
    }

    public final void e(Object obj, InterfaceC0227u animationSpec) {
        AbstractC3340k.e(animationSpec, "animationSpec");
        N.Y y10 = this.f60b;
        boolean zA = AbstractC3340k.a(y10.getValue(), obj);
        N.Y y11 = this.f65g;
        if (!zA || ((Boolean) y11.getValue()).booleanValue()) {
            y10.setValue(obj);
            this.f61c.setValue(animationSpec);
            N.Y y12 = this.f63e;
            c(this, null, !((Boolean) y12.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            y12.setValue(bool);
            this.f64f.setValue(Long.valueOf(((Number) this.k.f83e.getValue()).longValue()));
            y11.setValue(bool);
        }
    }

    @Override // N.K0
    public final Object getValue() {
        return this.f66h.getValue();
    }
}
