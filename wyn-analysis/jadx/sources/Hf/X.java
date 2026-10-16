package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class X extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5094a;

    /* renamed from: b, reason: collision with root package name */
    public int f5095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f5096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5096c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5094a = obj;
        this.f5095b |= Integer.MIN_VALUE;
        return this.f5096c.emit(null, this);
    }
}
