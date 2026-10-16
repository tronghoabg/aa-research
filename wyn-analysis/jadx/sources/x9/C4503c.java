package x9;

import C8.k;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4503c implements InterfaceC4505e, f {

    /* renamed from: a, reason: collision with root package name */
    public final k f47864a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f47865b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.b f47866c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f47867d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f47868e;

    public C4503c(Context context, String str, Set set, O9.b bVar, Executor executor) {
        this.f47864a = new k(context, 1, str);
        this.f47867d = set;
        this.f47868e = executor;
        this.f47866c = bVar;
        this.f47865b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f47864a.get();
        if (!gVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        gVar.g();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? Y0.a.g(this.f47865b) : true) {
            return Tasks.call(this.f47868e, new CallableC4502b(this, 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.f47867d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? Y0.a.g(this.f47865b) : true) {
            Tasks.call(this.f47868e, new CallableC4502b(this, 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
