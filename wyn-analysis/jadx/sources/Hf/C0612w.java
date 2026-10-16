package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0612w extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5211a;

    /* renamed from: b, reason: collision with root package name */
    public int f5212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0611v f5213c;

    /* renamed from: d, reason: collision with root package name */
    public C0611v f5214d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f5215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612w(C0611v c0611v, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5213c = c0611v;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5211a = obj;
        this.f5212b |= Integer.MIN_VALUE;
        return this.f5213c.collect(null, this);
    }
}
