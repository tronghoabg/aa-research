package defpackage;

import android.content.Context;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.JavaCronetProvider;

/* loaded from: classes3.dex */
public final class uzj {
    private static final yob a = yob.c("com/google/android/libraries/geo/systems/network/cronet/CronetEngineBuilderFactory");
    private final Context b;
    private final Context c;
    private final boolean d;
    private final sm e;

    public uzj(Context context, Context context2, xxh xxhVar, xxh xxhVar2) {
        this.b = context;
        this.c = context2;
        this.e = (sm) ((xxm) xxhVar).a;
        this.d = ((Boolean) xxhVar2.d(false)).booleanValue();
    }

    private final ExperimentalCronetEngine.Builder b() {
        return (ExperimentalCronetEngine.Builder) new JavaCronetProvider(this.c).createBuilder();
    }

    private final void c() {
    }

    public final ExperimentalCronetEngine.Builder a() {
        if (this.d) {
            return b();
        }
        for (CronetProvider cronetProvider : CronetProvider.getAllProviders(this.c)) {
            try {
            } catch (LinkageError | RuntimeException e) {
                Throwable cause = e.getCause();
                yob yobVar = a;
                ((ynz) ((ynz) ((ynz) yobVar.g()).p(e)).ai((char) 9728)).u("Exception trying to create ExperimentalCronetEngine.Builder");
                if (e instanceof UnsatisfiedLinkError) {
                    c();
                } else if (e instanceof VerifyError) {
                    c();
                } else if (e instanceof LinkageError) {
                    c();
                } else if (cause instanceof skk) {
                    ((ynz) ((ynz) yobVar.f()).ai((char) 9730)).u("GMSCore Cronet not available on this device.");
                    c();
                } else if (cause instanceof skl) {
                    ((ynz) ((ynz) yobVar.f()).ai((char) 9729)).u("GMSCore CronetProvider not installed; Google Play Services update is required.");
                    sjv.a.i(this.b, ((skl) cause).a);
                    c();
                } else {
                    c();
                }
            }
            if (cronetProvider.isEnabled()) {
                return (ExperimentalCronetEngine.Builder) cronetProvider.createBuilder();
            }
            continue;
        }
        return b();
    }
}
