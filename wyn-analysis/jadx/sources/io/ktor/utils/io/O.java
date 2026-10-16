package io.ktor.utils.io;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class O extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f37366b;

    /* renamed from: c, reason: collision with root package name */
    public int f37367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p10, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f37366b = p10;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37365a = obj;
        this.f37367c |= Integer.MIN_VALUE;
        return this.f37366b.f(this);
    }
}
