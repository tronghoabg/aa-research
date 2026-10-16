package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rkr extends rjt {
    private final rkj a;
    private final rox b = new rox(new nxt(4));

    public rkr(rkj rkjVar) {
        this.a = rkjVar;
    }

    @Override // defpackage.rjt
    public final yfq a() throws qrz {
        return yfq.o((List) this.b.b(new rct(this.a, 11)));
    }

    @Override // defpackage.rjt
    public final boolean b() throws qrz {
        return ((Boolean) this.b.b(new rdw(this.a, 6))).booleanValue();
    }
}
