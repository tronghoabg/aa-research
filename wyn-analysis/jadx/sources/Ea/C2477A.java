package ea;

import Hf.C0615z;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: ea.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2477A extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34440a;

    /* renamed from: b, reason: collision with root package name */
    public int f34441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0615z f34442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477A(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f34442c = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f34440a = obj;
        this.f34441b |= Integer.MIN_VALUE;
        return this.f34442c.emit(null, this);
    }
}
