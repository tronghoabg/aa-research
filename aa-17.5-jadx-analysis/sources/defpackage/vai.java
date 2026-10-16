package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vai implements uzy {
    private final uzy a;
    private final Map b = new HashMap();

    public vai(uzy uzyVar) {
        new WeakHashMap();
        this.a = uzyVar;
    }

    private final vae h(vae vaeVar) {
        vah vahVar = new vah(this, vaeVar, 0);
        synchronized (this) {
            this.b.put(vaeVar, vahVar);
        }
        return vahVar;
    }

    @Override // defpackage.uzy
    public final int a() {
        throw null;
    }

    @Override // defpackage.uzy
    public final zgp b() {
        throw null;
    }

    @Override // defpackage.uzy
    public final Object c() {
        return (GmmAccount) this.a.c();
    }

    @Override // defpackage.uzy
    public final void d(vae vaeVar, Executor executor) {
        this.a.d(h(vaeVar), executor);
    }

    @Override // defpackage.uzy
    public final void e(vae vaeVar, Executor executor) {
        this.a.e(h(vaeVar), executor);
    }

    @Override // defpackage.uzy
    public final void f(vae vaeVar) {
        vae vaeVar2;
        synchronized (this) {
            vaeVar2 = (vae) this.b.remove(vaeVar);
        }
        if (vaeVar2 != null) {
            this.a.f(vaeVar2);
        }
    }

    @Override // defpackage.uzy
    public final boolean g(vae vaeVar) {
        boolean zContainsKey;
        synchronized (this) {
            zContainsKey = this.b.containsKey(vaeVar);
        }
        return zContainsKey;
    }
}
