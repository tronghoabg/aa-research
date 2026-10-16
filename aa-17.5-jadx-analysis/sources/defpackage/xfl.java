package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xfl implements lhg {
    public static final yph a = yph.c("GH.ProjPriorityMonitor");
    public static final yfy b = yfy.m("com.google.android.projection.gearhead:projection", yyk.PROJECTION, "com.google.android.projection.gearhead:car", yyk.CAR, "com.google.android.projection.gearhead:shared", yyk.SHARED);
    public final Context c;
    public final Map d;
    public final Handler e;
    public final Runnable f;
    public final Map g;
    public boolean h;
    private final Map i;

    public xfl(Context context) {
        yfy yfyVar = b;
        Handler handler = new Handler();
        this.f = new teg(this, 16);
        this.g = new HashMap();
        this.i = new HashMap();
        this.c = context;
        this.d = yfyVar;
        this.e = handler;
    }

    public final void a(String str, yyv yyvVar) {
        if (str != null) {
            Map map = this.i;
            if (map.isEmpty() || map.get(str) != yyvVar) {
                ebf.j().D(yyvVar, (yyk) this.d.get(str));
                map.put(str, yyvVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhg
    public final void c() {
        yno it = ((ylv) ((ylx) this.d).keySet()).iterator();
        while (it.hasNext()) {
            this.g.put((String) it.next(), new xfk());
        }
        this.h = true;
        this.e.post(this.f);
    }

    @Override // defpackage.lhg
    public final void d() {
        this.g.clear();
        this.i.clear();
        this.h = false;
        this.e.removeCallbacks(this.f);
    }
}
