package fd;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class y extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35398a;

    /* renamed from: b, reason: collision with root package name */
    public int f35399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f35400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f35400c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35398a = obj;
        this.f35399b |= Integer.MIN_VALUE;
        return this.f35400c.emit(null, this);
    }
}
