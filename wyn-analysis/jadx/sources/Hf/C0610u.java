package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0610u extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5202a;

    /* renamed from: b, reason: collision with root package name */
    public int f5203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0611v f5204c;

    /* renamed from: d, reason: collision with root package name */
    public C0611v f5205d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f5206e;

    /* renamed from: f, reason: collision with root package name */
    public If.z f5207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610u(C0611v c0611v, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5204c = c0611v;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5202a = obj;
        this.f5203b |= Integer.MIN_VALUE;
        return this.f5204c.collect(null, this);
    }
}
