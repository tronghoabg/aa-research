package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rgh {
    public static final ypf a = ols.R("CAR.BT.A2DP");
    public final Supplier b;
    private final Context c;

    public rgh(Context context, Supplier supplier) {
        this.c = context;
        this.b = supplier;
    }

    public final void a(String str, int i) {
        Context context = this.c;
        rgk rgkVarA = rgk.a(context);
        rgkVarA.getClass();
        woy.aa(rgkVarA.f(context, new rgg(this, i, rgkVarA, str), 2), "Couldn't get A2DP proxy");
    }

    public final void b(String str) {
        if (!c()) {
            a.h().ai(8013).u("Missing permissions for removePolicyAndEnable");
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        wgx wgxVarD = d();
        pgv pgvVar = new pgv(str, atomicBoolean, 3);
        zfq zfqVar = zfq.a;
        wub.ah(wgxVarD.a(pgvVar, zfqVar), new oyu(this, atomicBoolean, str, 2), zfqVar);
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT < 31 || dup.c(this.c, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final wgx d() {
        wgg wggVarA = wgh.a();
        Pattern pattern = wez.a;
        wey weyVar = new wey(this.c);
        weyVar.b("bluetooth_atwodp_policy");
        weyVar.c("bluetooth_atwodp_policy.pb");
        wggVarA.d(weyVar.a());
        wggVarA.c(rhh.a);
        wggVarA.a = wgj.a;
        return vqk.f().e(wggVarA.a());
    }
}
