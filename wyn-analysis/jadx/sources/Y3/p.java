package Y3;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class p extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16664a;

    /* renamed from: b, reason: collision with root package name */
    public int f16665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f16666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f16666c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f16664a = obj;
        this.f16665b |= Integer.MIN_VALUE;
        return this.f16666c.emit(null, this);
    }
}
