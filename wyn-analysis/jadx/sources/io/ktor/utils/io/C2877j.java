package io.ktor.utils.io;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: io.ktor.utils.io.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2877j extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2880m f37405b;

    /* renamed from: c, reason: collision with root package name */
    public int f37406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877j(C2880m c2880m, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f37405b = c2880m;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37404a = obj;
        this.f37406c |= Integer.MIN_VALUE;
        return this.f37405b.f(this);
    }
}
