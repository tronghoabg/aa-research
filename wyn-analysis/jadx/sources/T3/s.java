package T3;

import A7.V0;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f11437g = J3.r.f("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final U3.j f11438a = new U3.j();

    /* renamed from: b, reason: collision with root package name */
    public final Context f11439b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.p f11440c;

    /* renamed from: d, reason: collision with root package name */
    public final J3.q f11441d;

    /* renamed from: e, reason: collision with root package name */
    public final t f11442e;

    /* renamed from: f, reason: collision with root package name */
    public final b7.k f11443f;

    public s(Context context, S3.p pVar, J3.q qVar, t tVar, b7.k kVar) {
        this.f11439b = context;
        this.f11440c = pVar;
        this.f11441d = qVar;
        this.f11442e = tVar;
        this.f11443f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f11440c.f10992q || Build.VERSION.SDK_INT >= 31) {
            this.f11438a.i(null);
            return;
        }
        U3.j jVar = new U3.j();
        b7.k kVar = this.f11443f;
        ((V0) kVar.f19398d).execute(new r(0, this, jVar));
        jVar.addListener(new L7.b(this, false, jVar, 8), (V0) kVar.f19398d);
    }
}
