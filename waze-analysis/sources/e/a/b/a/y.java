package e.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.UserHandle;
import com.google.d.d.bs;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import e.a.cx;
import e.a.da;
import e.a.db;
import e.a.dc;
import e.a.dd;
import e.a.dt;
import e.a.ee;
import e.a.ef;
import e.a.eg;
import e.a.el;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends dd {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a.c f46454b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f46455c;

    /* renamed from: d, reason: collision with root package name */
    private final UserHandle f46456d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f46457e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f46458f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f46459g;

    /* renamed from: h, reason: collision with root package name */
    private final el f46460h;

    /* renamed from: i, reason: collision with root package name */
    private final dc f46461i;

    /* renamed from: j, reason: collision with root package name */
    private x f46462j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f46463k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f46464l;
    private bm m;
    private dt n;

    static {
        e.a.a aVarA = e.a.c.a();
        aVarA.c(e.a.b.c.f46469c, true);
        f46454b = aVarA.a();
    }

    y(Intent intent, cx cxVar) {
        this.f46455c = intent;
        UserHandle userHandle = (UserHandle) cxVar.f(e.a.b.c.f46468b);
        this.f46456d = userHandle;
        Context context = (Context) cxVar.f(e.a.b.c.f46467a);
        com.google.d.b.an.C(context, "SOURCE_ANDROID_CONTEXT");
        Context applicationContext = context.getApplicationContext();
        this.f46457e = userHandle != null ? l(applicationContext, userHandle) : applicationContext;
        Executor executorG = cxVar.g();
        com.google.d.b.an.C(executorG, "NameResolver.Args.getOffloadExecutor()");
        this.f46458f = executorG;
        this.f46459g = cf.z(executorG);
        this.f46460h = cxVar.e();
        this.f46461i = cxVar.c();
    }

    public static /* synthetic */ db e(y yVar) throws ef {
        PackageManager packageManager = yVar.f46457e.getPackageManager();
        Intent intent = yVar.f46455c;
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 268435456);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new ef(ee.f47409i.g("Service not found for intent ".concat(String.valueOf(String.valueOf(intent)))));
        }
        Intent intent2 = new Intent();
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                intent2.addCategory(it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            intent2.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
            e.a.b.a aVar = new e.a.b.a();
            aVar.b(intent2);
            aVar.c(yVar.f46456d);
            arrayList.add(new e.a.ai(aVar.a(), f46454b));
        }
        da daVarC = db.c();
        daVarC.b(eg.c(arrayList));
        daVarC.d(yVar.f46461i.a(bs.f()));
        return daVarC.a();
    }

    public static /* synthetic */ void h(y yVar) {
        el elVar = yVar.f46460h;
        elVar.d();
        com.google.d.b.an.u(yVar.m != null);
        com.google.d.b.an.u(yVar.m.isDone());
        dt dtVar = yVar.n;
        com.google.d.b.an.B(dtVar);
        bd.q(yVar.m, new c(yVar, dtVar, 2), elVar);
        yVar.m = null;
        if (yVar.f46464l) {
            yVar.f46464l = false;
            yVar.m();
        }
    }

    public static /* synthetic */ void i(y yVar) {
        x xVar = yVar.f46462j;
        if (xVar != null) {
            yVar.f46457e.unregisterReceiver(xVar);
            yVar.f46462j = null;
        }
    }

    public static /* synthetic */ void j(y yVar) {
        com.google.d.b.an.v(yVar.f46462j == null, "Already registered!");
        yVar.f46462j = new x(yVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addDataScheme("package");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        Context context = yVar.f46457e;
        context.registerReceiver(yVar.f46462j, intentFilter);
        context.registerReceiver(yVar.f46462j, new IntentFilter("android.intent.action.USER_UNLOCKED"));
    }

    private static Context l(Context context, UserHandle userHandle) {
        try {
            return ar.a(context, userHandle);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalArgumentException("TARGET_ANDROID_USER NameResolver.Arg requires SDK_INT >= R and @SystemApi visibility");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        el elVar = this.f46460h;
        elVar.d();
        if (this.f46463k) {
            return;
        }
        if (this.m != null) {
            this.f46464l = true;
            return;
        }
        bm bmVarK = bd.k(new Callable() { // from class: e.a.b.a.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y.e(this.f46449a);
            }
        }, this.f46459g);
        this.m = bmVarK;
        bmVarK.addListener(new Runnable() { // from class: e.a.b.a.u
            @Override // java.lang.Runnable
            public final void run() {
                y.h(this.f46450a);
            }
        }, elVar);
    }

    @Override // e.a.dd
    public final String a() {
        return "localhost";
    }

    @Override // e.a.dd
    public final void b() {
        com.google.d.b.an.v(this.n != null, "Not started!");
        m();
    }

    @Override // e.a.dd
    public final void c() {
        this.f46460h.d();
        if (this.f46463k) {
            return;
        }
        this.f46463k = true;
        this.f46459g.execute(new Runnable() { // from class: e.a.b.a.v
            @Override // java.lang.Runnable
            public final void run() {
                y.i(this.f46451a);
            }
        });
    }

    @Override // e.a.dd
    public final void d(dt dtVar) {
        com.google.d.b.an.v(this.n == null, "Already started!");
        com.google.d.b.an.v(!this.f46463k, "Resolver is shutdown");
        this.n = dtVar;
        this.f46459g.execute(new Runnable() { // from class: e.a.b.a.s
            @Override // java.lang.Runnable
            public final void run() {
                y.j(this.f46448a);
            }
        });
        m();
    }
}
