package Af;

import ef.C2515C;
import ef.C2527k;
import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;

/* loaded from: classes5.dex */
public final class w extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f1328a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f1329b;

    /* renamed from: c, reason: collision with root package name */
    public int f1330c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2527k f1332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f1333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.p f1334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C2527k c2527k, j jVar, tf.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1332e = c2527k;
        this.f1333f = jVar;
        this.f1334g = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        w wVar = new w(this.f1332e, this.f1333f, this.f1334g, interfaceC3103c);
        wVar.f1331d = obj;
        return wVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        m mVar = (m) this.f1331d;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1330c;
        Object obj2 = this.f1332e;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f1331d = mVar;
            this.f1330c = 1;
            mVar.c(obj2, this);
            return aVar;
        }
        if (i5 == 1) {
            Fe.e.U(obj);
            it = this.f1333f.iterator();
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f1329b;
            obj2 = this.f1328a;
            Fe.e.U(obj);
        }
        if (!it.hasNext()) {
            return C2515C.f34653a;
        }
        Object objInvoke = this.f1334g.invoke(obj2, it.next());
        this.f1331d = mVar;
        this.f1328a = objInvoke;
        this.f1329b = it;
        this.f1330c = 2;
        mVar.c(objInvoke, this);
        return aVar;
    }
}
