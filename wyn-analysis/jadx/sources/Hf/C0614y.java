package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0614y extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0615z f5229a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0615z f5231c;

    /* renamed from: d, reason: collision with root package name */
    public int f5232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614y(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5231c = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5230b = obj;
        this.f5232d |= Integer.MIN_VALUE;
        return this.f5231c.emit(null, this);
    }
}
