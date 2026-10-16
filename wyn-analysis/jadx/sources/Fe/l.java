package Fe;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class l extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4097a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f4099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4099c = mVar;
        this.f4100d = str;
        this.f4101e = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        l lVar = new l(this.f4099c, this.f4100d, this.f4101e, interfaceC3103c);
        lVar.f4098b = obj;
        return lVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[Catch: b -> 0x0015, TryCatch #0 {b -> 0x0015, blocks: (B:6:0x0011, B:28:0x005e, B:13:0x0024, B:21:0x0049, B:23:0x004d, B:25:0x0051, B:33:0x0095, B:35:0x00af, B:16:0x0038, B:18:0x003c), top: B:41:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
