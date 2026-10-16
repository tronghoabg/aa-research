package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class C extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0600j f5021a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5022b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0600j f5024d;

    /* renamed from: e, reason: collision with root package name */
    public int f5025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C0600j c0600j, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5024d = c0600j;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5023c = obj;
        this.f5025e |= Integer.MIN_VALUE;
        return this.f5024d.emit(null, this);
    }
}
