package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: B.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328t extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1475a;

    /* renamed from: b, reason: collision with root package name */
    public int f1476b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C.e f1478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D.i f1480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N.V f1481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N.V f1482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0328t(C.e eVar, long j8, D.i iVar, N.V v2, N.V v10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1478d = eVar;
        this.f1479e = j8;
        this.f1480f = iVar;
        this.f1481g = v2;
        this.f1482h = v10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N.V v2 = this.f1482h;
        C0328t c0328t = new C0328t(this.f1478d, this.f1479e, this.f1480f, this.f1481g, v2, interfaceC3103c);
        c0328t.f1477c = obj;
        return c0328t;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0328t) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r11.a(r2, r19) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r11.a(r4, r19) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0328t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
