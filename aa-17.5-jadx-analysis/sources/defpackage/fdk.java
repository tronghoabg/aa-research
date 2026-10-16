package defpackage;

import android.app.Application;
import android.os.Process;

/* loaded from: classes.dex */
public final class fdk {
    public static final fdk a;
    private static final fdk e;
    public final fdj b;
    public final afec c;
    public fde d;

    static {
        fdk fdkVar = new fdk(fdc.a, new cyo(18));
        e = fdkVar;
        a = fdkVar;
    }

    public fdk(fdj fdjVar, afec afecVar) {
        fde fdeVar;
        this.b = fdjVar;
        this.c = afecVar;
        if (fdjVar.g) {
            fdeVar = fdc.b;
        } else {
            Process.myPid();
            Application.getProcessName();
            synchronized (fdjVar.f) {
                if (!fdjVar.g) {
                    fdc.b = new fde(fdjVar);
                    fdjVar.g = true;
                }
            }
            fdeVar = fdc.b;
        }
        this.d = fdeVar;
    }

    public final void a(String str) {
        ((Boolean) this.c.invoke(str)).booleanValue();
    }
}
