package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class adpq extends admr {
    public static final adis b;
    public final Intent c;
    public final UserHandle d;
    public final Context e;
    public final Executor f;
    public final adnw g;
    public final admq h;
    public adpp i;
    public boolean j;
    public zgp k;
    public adqs l;
    private final Executor m;
    private boolean n;

    static {
        adis adisVar = adis.a;
        adqn adqnVar = new adqn(adis.a);
        adqnVar.c(adoe.c, true);
        b = adqnVar.a();
    }

    public adpq(Intent intent, admm admmVar) {
        this.c = intent;
        UserHandle userHandle = (UserHandle) admmVar.a(adoe.b);
        this.d = userHandle;
        Context context = (Context) admmVar.a(adoe.a);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.e = userHandle != null ? f(applicationContext, userHandle) : applicationContext;
        Executor executor = admmVar.f;
        executor.getClass();
        this.f = executor;
        this.m = new zhb(executor);
        this.g = admmVar.c;
        this.h = admmVar.d;
    }

    private static Context f(Context context, UserHandle userHandle) {
        try {
            return adqq.p(context, userHandle);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalArgumentException("TARGET_ANDROID_USER NameResolver.Arg requires SDK_INT >= R and @SystemApi visibility");
        }
    }

    @Override // defpackage.admr
    public final String a() {
        return "localhost";
    }

    @Override // defpackage.admr
    public final void b() {
        woy.aa(this.l != null, "Not started!");
        e();
    }

    @Override // defpackage.admr
    public final void c() {
        this.g.c();
        if (this.n) {
            return;
        }
        this.n = true;
        this.m.execute(new aabr(this, 20));
    }

    @Override // defpackage.admr
    public final void d(adqs adqsVar) {
        woy.aa(this.l == null, "Already started!");
        woy.aa(!this.n, "Resolver is shutdown");
        this.l = adqsVar;
        this.m.execute(new aabr(this, 18));
        e();
    }

    public final void e() {
        adnw adnwVar = this.g;
        adnwVar.c();
        if (this.n) {
            return;
        }
        if (this.k != null) {
            this.j = true;
            return;
        }
        zgp zgpVarAc = wub.ac(new adpm(this, 0), this.m);
        this.k = zgpVarAc;
        zgpVarAc.c(new aabr(this, 19), adnwVar);
    }
}
