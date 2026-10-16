package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

/* loaded from: classes.dex */
public final class tcd implements zge {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public tcd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) throws InterruptedException {
        if (this.b != 0) {
            ((ohb) this.a).b(th);
        } else {
            ((eqj) this.a).j(new tgn(th));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.enterprise.connectedapps.internal.Bundler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, qdc] */
    @Override // defpackage.zge
    public final void b(Object obj) throws InterruptedException {
        if (this.b == 0) {
            ((eqj) this.a).j(new tgo(obj));
            return;
        }
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        Object obj2 = this.a;
        ohb ohbVar = (ohb) obj2;
        ohbVar.c.c(bundle, "result", obj, (BundlerType) ohbVar.b);
        try {
            new qdp(((ohb) obj2).a).makeBundleCall(bundle);
        } catch (RuntimeException e) {
            ohbVar.b(new qdl("Error when writing result of future", e));
        } catch (qdl unused) {
            Log.e("FutureResult", "Connection was dropped before response");
        }
    }
}
