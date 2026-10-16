package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import kotlinx.b.d.a.ai;
import okhttp3.ac;
import okhttp3.aj;
import okhttp3.al;
import okhttp3.ap;
import okhttp3.aq;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a implements ac {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55982a = new a(0);

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f55983b;

    private a(int i2) {
        this.f55983b = i2;
    }

    @Override // okhttp3.ac
    public final aq c(okhttp3.internal.d.g gVar) {
        if (this.f55983b == 0) {
            x.f(gVar, "chain");
            return okhttp3.internal.d.g.j(gVar, 0, gVar.i().n(gVar), null, 61).g(gVar.e());
        }
        x.f(gVar, "chain");
        okhttp3.f fVarD = gVar.d();
        System.currentTimeMillis();
        al alVarF = gVar.f();
        x.f(alVarF, "request");
        if (ai.e(alVarF) != null && alVarF.e().a()) {
            alVarF = null;
        }
        if ((fVarD instanceof j ? (j) fVarD : null) == null) {
            w wVar = w.f56345a;
        }
        al alVarE = ai.e(alVarF);
        if (alVarE != null) {
            aq aqVarG = gVar.g(alVarE);
            return new ap(aqVarG).c(ai.f(null)).h(ai.f(aqVarG)).n();
        }
        aq aqVarN = new ap().l(gVar.f()).j(aj.f55874b).d(504).g("Unsatisfiable Request (only-if-cached)").b(okhttp3.internal.b.f55957c).m(-1L).k(System.currentTimeMillis()).n();
        x.f(fVarD, NotificationCompat.CATEGORY_CALL);
        x.f(aqVarN, "response");
        return aqVarN;
    }

    public a(int i2, byte[] bArr) {
        this.f55983b = i2;
    }
}
