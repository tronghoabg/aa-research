package c4;

import Ef.E;
import b4.m;
import ef.C2515C;
import h4.l;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1555h f19609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f19610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f19611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.h f19612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G f19614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X3.c f19615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1551d(C1555h c1555h, G g9, G g10, h4.h hVar, Object obj, G g11, X3.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f19609b = c1555h;
        this.f19610c = g9;
        this.f19611d = g10;
        this.f19612e = hVar;
        this.f19613f = obj;
        this.f19614g = g11;
        this.f19615h = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1551d(this.f19609b, this.f19610c, this.f19611d, this.f19612e, this.f19613f, this.f19614g, this.f19615h, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1551d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f19608a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        m mVar = (m) this.f19610c.f39740a;
        X3.b bVar = (X3.b) this.f19611d.f39740a;
        l lVar = (l) this.f19614g.f39740a;
        this.f19608a = 1;
        Object objA = C1555h.a(this.f19609b, mVar, bVar, this.f19612e, this.f19613f, lVar, this.f19615h, this);
        return objA == aVar ? aVar : objA;
    }
}
