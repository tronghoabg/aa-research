package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class nyh implements mnd {
    private static final yph a = yph.c("GH.AppProvider");
    private final String b;

    protected nyh(String str) {
        this.b = str;
    }

    public static final yfq m(Collection collection, abrh abrhVar) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (resolveInfo.serviceInfo != null) {
                ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                if (kmo.b(abrhVar, componentName)) {
                    yflVar.i(componentName);
                } else {
                    ((ype) a.l().ai((char) 5546)).y("%s is not allowed by filter", componentName.flattenToString());
                }
            }
        }
        return yflVar.g();
    }

    protected static final yfq n(Collection collection) {
        abnp abnpVarN = abrh.a.n();
        abnpVarN.t();
        abrh abrhVar = (abrh) abnpVarN.b;
        abrhVar.c = 4;
        abrhVar.b |= 1;
        return m(collection, (abrh) abnpVarN.q());
    }

    public abstract yfq b(qrn qrnVar, nyj nyjVar);

    @Override // defpackage.mnd
    public void h(PrintWriter printWriter) {
        printWriter.printf("Provider: %s\n", this.b);
        fr(printWriter);
    }

    public final String l(nyj nyjVar) {
        return this.b.concat(nyjVar.toString());
    }

    public final String toString() {
        return this.b;
    }

    protected void fr(PrintWriter printWriter) {
    }
}
