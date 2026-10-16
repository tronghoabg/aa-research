package ue;

import C8.i;
import Ef.E;
import a9.C1342b;
import com.moloco.sdk.internal.publisher.nativead.model.g;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: ue.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4289a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public c f46788a;

    /* renamed from: b, reason: collision with root package name */
    public int f46789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f46790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f46791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1342b f46792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4289a(i iVar, g gVar, C1342b c1342b, int i5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46790c = iVar;
        this.f46791d = gVar;
        this.f46792e = c1342b;
        this.f46793f = i5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1342b c1342b = this.f46792e;
        return new C4289a(this.f46790c, this.f46791d, c1342b, this.f46793f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4289a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
    
        if (r0 != r3) goto L61;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.C4289a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
