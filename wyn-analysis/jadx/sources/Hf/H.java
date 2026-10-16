package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class H extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public I f5041a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5042b;

    /* renamed from: c, reason: collision with root package name */
    public int f5043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f5044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i5, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5044d = i5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5042b = obj;
        this.f5043c |= Integer.MIN_VALUE;
        return this.f5044d.emit(null, this);
    }
}
