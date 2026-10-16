package defpackage;

import android.app.Dialog;
import android.content.Intent;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.gms.carsetup.FirstActivityImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class urg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ urg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final int a() {
        return ((ppm) this.b).a().b;
    }

    public final long b() {
        return ((ppe) this.a).a().g;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aitx, java.lang.Object] */
    public final void c(afeh afehVar) {
        Object obj = this.a;
        obj.getClass();
        whk whkVar = (whk) obj;
        ((qx) this.b).f(tii.b((qn) whkVar.c, whkVar.a, whkVar.b, afehVar));
    }

    public final void d() {
        ((slv) ((rgq) this.a).a).b();
        Dialog dialog = (Dialog) this.b;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public final void e(boolean z) {
        rbe.h(new lvn((FirstActivityImpl) this.a, z, (Intent) this.b, 5));
    }

    public final void f() {
        int i = ((MenuItem) ((adqy) this.a).c).b.getInt("audio_route");
        ohs ohsVarJ = ebf.j();
        odo odoVarA = odn.a();
        yzz yzzVar = yzz.PHONE_AUDIO_ROUTE_SELECTOR;
        yzy yzyVar = i != 1 ? i != 2 ? i != 4 ? i != 8 ? yzy.aq : yzy.ao : yzy.an : yzy.am : yzy.ap;
        Object obj = this.b;
        ohsVarJ.F(odoVarA.k(yzzVar, yzyVar).l());
        ebf.A().t(i);
        ((juf) ((onc) obj).h.a).g(true);
    }

    public urg(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public urg(Object obj, Object obj2, char[] cArr) {
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ urg(onc oncVar, adqy adqyVar) {
        this.b = oncVar;
        this.a = adqyVar;
    }
}
