package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class Y extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5097a;

    /* renamed from: b, reason: collision with root package name */
    public int f5098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0615z f5099c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5100d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f5101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5099c = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5097a = obj;
        this.f5098b |= Integer.MIN_VALUE;
        return this.f5099c.emit(null, this);
    }
}
