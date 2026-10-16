package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ymc extends yhe {
    public static ymc p(yfq yfqVar, ygr ygrVar, ygr ygrVar2) {
        return ((long) yfqVar.size()) > (((long) ygrVar.size()) * ((long) ygrVar2.size())) / 2 ? new ydu(yfqVar, ygrVar, ygrVar2) : new yms(yfqVar, ygrVar, ygrVar2);
    }

    @Override // defpackage.ybz
    public final /* bridge */ /* synthetic */ Collection b() {
        if (!e()) {
            return new ymb(this);
        }
        int i = yfq.d;
        return yls.a;
    }

    @Override // defpackage.ybz
    public final /* bridge */ /* synthetic */ Set d() {
        return e() ? yly.a : new yma(this);
    }

    public abstract yni i(int i);

    public abstract Object j(int i);

    @Override // defpackage.yhe
    abstract Object writeReplace();
}
