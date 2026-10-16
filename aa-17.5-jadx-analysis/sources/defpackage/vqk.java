package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class vqk {
    private static vqk b;
    public final Object a;

    public vqk(Context context, vqn vqnVar) {
        this.a = vqnVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(vqnVar.a);
        application.registerComponentCallbacks(vqnVar.a);
        if (Build.VERSION.SDK_INT < 37 || vqnVar.b != null) {
            return;
        }
        vqnVar.b = new vql();
        View.registerCalledFromWrongThreadListener(vqnVar.b);
    }

    public static synchronized void d(wyd wydVar) {
        woy.aa(b == null, "Delegate already set");
        b = new vqk(wydVar);
    }

    public static synchronized vqk f() {
        vqk vqkVar;
        vqkVar = b;
        if (vqkVar == null) {
            throw new IllegalStateException("ProtoDataStoreFactoryProvider not initialized");
        }
        return vqkVar;
    }

    public final void a(vqj vqjVar) {
        vqjVar.getClass();
        vqm vqmVar = ((vqn) this.a).a;
        int i = vqm.c;
        vqmVar.a.add(vqjVar);
    }

    public final void b(vqj vqjVar) {
        vqm vqmVar = ((vqn) this.a).a;
        int i = vqm.c;
        vqmVar.a.remove(vqjVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tmg] */
    public final zgt c(zgt zgtVar) {
        ?? r0 = this.a;
        return r0 == 0 ? zgtVar : r0.a();
    }

    public final wgx e(wgh wghVar) {
        return ((mie) ((wyd) this.a).a).a(wghVar);
    }

    public vqk(xxh xxhVar) {
        this.a = (tmg) xxhVar.e();
    }

    public vqk(Object obj) {
        this.a = obj;
    }
}
