package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ijs implements ijq {
    public static final yph a = yph.c("CAR.SERVICE");
    public static final ygr b = ygr.t("com.google.android.projection.gearhead:projection", "com.google.android.projection.gearhead:car", "com.google.android.gms:car", "com.google.android.tts", "com.google.android.apps.maps", "com.google.android.projection.gearhead:shared", new String[0]);
    public static final yfy c = yfy.m("com.google.android.projection.gearhead:projection", rru.a, "com.google.android.projection.gearhead:car", rru.b, "com.google.android.gms:car", rru.c);
    public final Context d;
    public final Set e;
    public final xyc f;
    public final Runnable g;
    public final Object h;
    public final Map i;
    public final SimpleDateFormat j;
    public final Map k;
    public final Map l;
    public final Set m;
    public boolean n;

    public ijs(Context context, xyc xycVar) {
        ygr ygrVar = b;
        yfy yfyVar = c;
        this.g = new ne(this, 14, null);
        this.h = new Object();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashSet();
        this.d = context;
        this.e = ygrVar;
        this.i = yfyVar;
        this.f = xycVar;
        this.j = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);
    }

    @Override // defpackage.ijq
    public final void a(PrintWriter printWriter) {
        printWriter.println("Dumping History of projecting process");
        synchronized (this.h) {
            for (Map.Entry entry : this.k.entrySet()) {
                printWriter.println("For process " + ((String) entry.getKey()));
                Iterator<E> it = ((ydx) entry.getValue()).iterator();
                while (it.hasNext()) {
                    printWriter.println((String) it.next());
                }
            }
        }
    }
}
