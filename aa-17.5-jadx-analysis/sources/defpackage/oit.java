package defpackage;

import android.os.Build;
import android.view.View;
import j$.time.ZoneId;

/* loaded from: classes.dex */
public final class oit {
    public final Object a;
    public final Object b;
    public final Object c;

    public oit(wra wraVar, View view) {
        this.a = Build.VERSION.SDK_INT >= 34 ? new wrd() : Build.VERSION.SDK_INT >= 33 ? new wrb() : null;
        this.b = wraVar;
        this.c = view;
    }

    public static oit a() {
        return (oit) mki.a.c(oit.class, yfq.s(mkh.a, mkh.b, mkh.c), new lfu(14));
    }

    public final void b() {
        Object obj = this.a;
        if (obj != null) {
            ((wrb) obj).c((View) this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wra] */
    public final void c() {
        Object obj = this.a;
        if (obj != null) {
            ((wrb) obj).b(this.b, (View) this.c, false);
        }
    }

    public oit(rob robVar, aezk aezkVar, aezk aezkVar2) {
        this.c = robVar;
        this.a = aezkVar;
        this.b = aezkVar2;
    }

    public oit() {
        this.a = ZoneId.systemDefault();
        this.b = xvx.a;
        this.c = new tme();
    }
}
