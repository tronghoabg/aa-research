package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes2.dex */
final class pkv implements ComponentCallbacks2 {
    final /* synthetic */ pkx a;

    public pkv(pkx pkxVar) {
        this.a = pkxVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ((ynz) ((ynz) pkx.a.d()).ai((char) 6756)).u("ComponentCallbacks2: onConfigurationChanged()");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ((ynz) ((ynz) pkx.a.d()).ai((char) 6757)).u("ComponentCallbacks2: onLowMemory()");
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ((ynz) ((ynz) pkx.a.d()).ai(6758)).w("ComponentCallbacks2: onTrimMemory() level: %d", i);
        if (i >= 80) {
            this.a.b(pkw.a);
            return;
        }
        if (i >= 60) {
            this.a.b(pkw.b);
            return;
        }
        if (i >= 40) {
            this.a.b(pkw.c);
            return;
        }
        if (i >= 20) {
            this.a.b(pkw.d);
            return;
        }
        if (i >= 15) {
            this.a.b(pkw.e);
        } else if (i >= 10) {
            this.a.b(pkw.f);
        } else if (i >= 5) {
            this.a.b(pkw.g);
        }
    }
}
