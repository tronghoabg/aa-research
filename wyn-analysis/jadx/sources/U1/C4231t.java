package u1;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: u1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4231t extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46487a;

    /* renamed from: b, reason: collision with root package name */
    public int f46488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f46489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4231t(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f46489c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46487a = obj;
        this.f46488b |= Integer.MIN_VALUE;
        return this.f46489c.emit(null, this);
    }
}
