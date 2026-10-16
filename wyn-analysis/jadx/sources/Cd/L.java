package Cd;

import ef.C2515C;
import ff.AbstractC2641B;
import io.ktor.utils.io.InterfaceC2886t;
import java.nio.charset.Charset;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r7.AbstractC3935e;
import xd.C4511c;

/* loaded from: classes5.dex */
public final class L extends AbstractC3471j implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public int f2012a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Gd.a f2013b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ InterfaceC2886t f2014c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Sd.a f2015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Charset f2016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Charset charset, InterfaceC3103c interfaceC3103c) {
        super(5, interfaceC3103c);
        this.f2016e = charset;
    }

    @Override // tf.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        L l10 = new L(this.f2016e, (InterfaceC3103c) obj5);
        l10.f2013b = (Gd.a) obj2;
        l10.f2014c = (InterfaceC2886t) obj3;
        l10.f2015d = (Sd.a) obj4;
        return l10.invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Gd.a aVar;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.f2012a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Gd.a aVar3 = this.f2013b;
            InterfaceC2886t interfaceC2886t = this.f2014c;
            if (!AbstractC3340k.a(this.f2015d.f11061a, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(String.class))) {
                return null;
            }
            this.f2013b = aVar3;
            this.f2014c = null;
            this.f2012a = 1;
            Object objM = io.ktor.utils.io.N.m(interfaceC2886t, this);
            if (objM == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj = objM;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f2013b;
            Fe.e.U(obj);
        }
        Pf.i iVar = (Pf.i) obj;
        C4511c c4511cC = aVar.c();
        vg.b bVar = N.f2018a;
        Charset charset = AbstractC2641B.f(c4511cC.e());
        if (charset == null) {
            charset = this.f2016e;
        }
        N.f2018a.s("Reading response body for " + c4511cC.d().getUrl() + " as String with charset " + charset);
        AbstractC3340k.e(iVar, "<this>");
        AbstractC3340k.e(charset, "charset");
        return charset.equals(Bf.a.f1670a) ? Pf.j.g(iVar) : AbstractC3935e.u(charset.newDecoder(), iVar);
    }
}
