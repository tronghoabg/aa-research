package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0599i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0600j f5133b;

    /* renamed from: c, reason: collision with root package name */
    public int f5134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0599i(C0600j c0600j, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5133b = c0600j;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5132a = obj;
        this.f5134c |= Integer.MIN_VALUE;
        return this.f5133b.emit(null, this);
    }
}
