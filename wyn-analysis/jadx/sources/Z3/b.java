package Z3;

import cg.C1618g;
import cg.H;
import cg.InterfaceC1620i;
import cg.o;
import java.io.IOException;
import zg.C4681u;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16957b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Object f16958c;

    public /* synthetic */ b(H h10) {
        super(h10);
    }

    @Override // cg.o, cg.H
    public final long read(C1618g c1618g, long j8) throws Exception {
        switch (this.f16957b) {
            case 0:
                try {
                    return super.read(c1618g, j8);
                } catch (Exception e7) {
                    this.f16958c = e7;
                    throw e7;
                }
            default:
                try {
                    return super.read(c1618g, j8);
                } catch (IOException e10) {
                    ((C4681u) this.f16958c).f48644f = e10;
                    throw e10;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C4681u c4681u, InterfaceC1620i interfaceC1620i) {
        super(interfaceC1620i);
        this.f16958c = c4681u;
    }
}
