package Hf;

import Cd.C0333a;
import ef.C2515C;
import fd.C2628H;
import ff.AbstractC2641B;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4452e;

/* renamed from: Hf.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0588a0 implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5109a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5112d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0588a0(InterfaceC0602l interfaceC0602l, InterfaceC0602l interfaceC0602l2, tf.q qVar) {
        this.f5110b = interfaceC0602l;
        this.f5111c = interfaceC0602l2;
        this.f5112d = (AbstractC3471j) qVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [lf.j, tf.q] */
    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        C2515C c2515c = C2515C.f34653a;
        InterfaceC0602l interfaceC0602l = this.f5110b;
        Object obj = this.f5111c;
        Object obj2 = this.f5112d;
        switch (this.f5109a) {
            case 0:
                If.t tVar = new If.t(new InterfaceC0602l[]{interfaceC0602l, (InterfaceC0602l) obj}, new C0333a((tf.q) obj2, (InterfaceC3103c) null), interfaceC0603m, null);
                If.v vVar = new If.v(interfaceC3103c, interfaceC3103c.getContext());
                Object objL = AbstractC2641B.L(vVar, true, vVar, tVar);
                kf.a aVar = kf.a.f39711a;
                if (objL != aVar) {
                    objL = c2515c;
                }
                return objL == aVar ? objL : c2515c;
            default:
                Object objCollect = interfaceC0602l.collect(new C0600j(interfaceC0603m, (C2628H) obj, (C4452e) obj2), interfaceC3103c);
                return objCollect == kf.a.f39711a ? objCollect : c2515c;
        }
    }

    public C0588a0(InterfaceC0602l interfaceC0602l, C2628H c2628h, C4452e c4452e) {
        this.f5110b = interfaceC0602l;
        this.f5111c = c2628h;
        this.f5112d = c4452e;
    }
}
