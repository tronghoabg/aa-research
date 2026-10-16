package defpackage;

import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public final /* synthetic */ class uxu implements aezk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uxu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aezk, java.lang.Object] */
    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            return (zgt) this.a.a();
        }
        if (i == 1) {
            return ((zwm) this.a).b();
        }
        if (i == 2) {
            Object obj = this.a;
            int i2 = ((yls) obj).c;
            yfl yflVarJ = yfq.j(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                yflVarJ.i((zim) ((aezk) ((yfq) obj).get(i3)).a());
            }
            return yfq.q(yflVarJ.g());
        }
        if (i == 3) {
            return lau.a().a((Context) this.a, "connectivity_logger_state");
        }
        if (i == 4) {
            return xue.d(xue.c(afbg.a), (xue) ((rju) this.a).b);
        }
        Object obj2 = this.a;
        if (i == 5) {
            return ((zwm) obj2).b();
        }
        aafi aafiVar = (aafi) obj2;
        aafiVar.c.a();
        String str = aafi.a;
        if (zrn.e(str, 2)) {
            Log.v(str, "getUiRaycaster()");
        }
        aagn aagnVar = null;
        if (!aafiVar.g && !aafiVar.m.i() && aafiVar.c() != null) {
            aagnVar = aafiVar.l;
        }
        if (aagnVar != null) {
            return aagnVar;
        }
        throw new IllegalStateException("Raycaster requested before View layout.");
    }
}
