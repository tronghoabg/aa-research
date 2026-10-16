package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class M extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0615z f5054a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5055b;

    /* renamed from: c, reason: collision with root package name */
    public int f5056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0615z f5057d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5057d = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5055b = obj;
        this.f5056c |= Integer.MIN_VALUE;
        return this.f5057d.emit(null, this);
    }
}
