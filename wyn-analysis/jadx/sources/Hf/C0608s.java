package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0608s extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5190a;

    /* renamed from: b, reason: collision with root package name */
    public int f5191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0609t f5192c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5193d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f5194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0608s(C0609t c0609t, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5192c = c0609t;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5190a = obj;
        this.f5191b |= Integer.MIN_VALUE;
        return this.f5192c.collect(null, this);
    }
}
