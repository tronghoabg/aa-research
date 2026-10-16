package ya;

import J9.C0664x;
import S3.s;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f48048b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static g f48049c;

    /* renamed from: a, reason: collision with root package name */
    public L8.i f48050a;

    public static g c() {
        g gVar;
        synchronized (f48048b) {
            AbstractC1732v.k("MlKitContext has not been initialized", f48049c != null);
            gVar = f48049c;
            AbstractC1732v.i(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (f48048b) {
            AbstractC1732v.k("MlKitContext is already initialized", f48049c == null);
            g gVar2 = new g();
            f48049c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM = new s(12, context, new S3.l(MlKitComponentDiscoveryService.class)).m();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0664x c0664x = L8.f.f6999O8;
            arrayList.addAll(arrayListM);
            arrayList2.add(L8.b.c(context, Context.class, new Class[0]));
            arrayList2.add(L8.b.c(gVar2, g.class, new Class[0]));
            L8.i iVar = new L8.i(executor, arrayList, arrayList2, c0664x);
            gVar2.f48050a = iVar;
            iVar.i(true);
            gVar = f48049c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        AbstractC1732v.k("MlKitContext has been deleted", f48049c == this);
        AbstractC1732v.i(this.f48050a);
        return this.f48050a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
