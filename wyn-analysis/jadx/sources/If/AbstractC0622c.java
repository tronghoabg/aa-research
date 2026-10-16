package If;

import Hf.InterfaceC0602l;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import lf.AbstractC3462a;

/* renamed from: If.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0622c {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3103c[] f5463a = new InterfaceC3103c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final H6.g f5464b = new H6.g("NULL", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final H6.g f5465c = new H6.g("UNINITIALIZED", 1);

    public static /* synthetic */ InterfaceC0602l a(w wVar, Ff.e eVar, int i5, Gf.a aVar, int i10) {
        InterfaceC3108h interfaceC3108h = eVar;
        if ((i10 & 1) != 0) {
            interfaceC3108h = C3109i.f38759a;
        }
        if ((i10 & 2) != 0) {
            i5 = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = Gf.a.f4780a;
        }
        return wVar.a(interfaceC3108h, i5, aVar);
    }

    public static final Object b(InterfaceC3108h interfaceC3108h, Object obj, Object obj2, tf.p pVar, InterfaceC3103c frame) {
        Object objInvoke;
        Object objN = Jf.b.n(interfaceC3108h, obj2);
        try {
            D d3 = new D(frame, interfaceC3108h);
            if (pVar instanceof AbstractC3462a) {
                K.e(2, pVar);
                objInvoke = pVar.invoke(obj, d3);
            } else {
                objInvoke = A6.h.S(pVar, obj, d3);
            }
            Jf.b.g(interfaceC3108h, objN);
            if (objInvoke == kf.a.f39711a) {
                AbstractC3340k.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            Jf.b.g(interfaceC3108h, objN);
            throw th;
        }
    }
}
