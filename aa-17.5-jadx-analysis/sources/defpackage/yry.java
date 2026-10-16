package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class yry extends yrw {
    public yry(ypl yplVar, int i) {
        super(yplVar, i);
    }

    @Override // defpackage.yrw
    public final void a(ysa ysaVar, Object obj) throws IOException {
        ysaVar.d(Integer.valueOf(obj.hashCode()), ypk.HEX, this.b);
    }
}
