package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0595e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0596f f5120b;

    /* renamed from: c, reason: collision with root package name */
    public int f5121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0595e(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5120b = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5119a = obj;
        this.f5121c |= Integer.MIN_VALUE;
        return this.f5120b.emit(null, this);
    }
}
