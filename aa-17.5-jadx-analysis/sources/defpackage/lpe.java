package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class lpe implements afec {
    public final /* synthetic */ qrn a;
    public final /* synthetic */ Map b;
    private final /* synthetic */ int c;

    public /* synthetic */ lpe(qrn qrnVar, Map map, int i) {
        this.c = i;
        this.a = qrnVar;
        this.b = map;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.c != 0) {
            Map map = this.b;
            return lpq.j(this.a, (yfq) obj, map);
        }
        Map map2 = this.b;
        return lpq.j(this.a, (yfq) obj, map2);
    }
}
