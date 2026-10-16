package Cd;

import ef.C2515C;
import java.nio.charset.Charset;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class K extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Fd.c f2008a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Charset f2011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(String str, Charset charset, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2010c = str;
        this.f2011d = charset;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        K k = new K(this.f2010c, this.f2011d, (InterfaceC3103c) obj3);
        k.f2008a = (Fd.c) obj;
        k.f2009b = obj2;
        return k.invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
