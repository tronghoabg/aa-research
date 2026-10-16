package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class G extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0600j f5039b;

    /* renamed from: c, reason: collision with root package name */
    public int f5040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0600j c0600j, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5039b = c0600j;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5038a = obj;
        this.f5040c |= Integer.MIN_VALUE;
        return this.f5039b.emit(null, this);
    }
}
