package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class mlx {
    public rza a;
    public final Context d;
    private mlu g;
    private final Handler h;
    private final Set f = new LinkedHashSet();
    public rel e = mlu.a();
    public boolean b = false;
    public final mlw c = new mlw(this);

    public mlx(Context context) {
        this.h = new Handler(context.getMainLooper());
        this.d = context;
    }

    public final void a() {
        mlu mluVarC = this.e.c();
        if (mluVarC.equals(this.g)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mlv) arrayList.get(i)).b(mluVarC);
        }
        this.g = mluVarC;
    }

    public final void b(mlv mlvVar) {
        this.f.add(mlvVar);
        mlvVar.b(this.e.c());
    }

    public final void c(mlv mlvVar) {
        this.f.remove(mlvVar);
    }

    public final void d() {
        if (this.b) {
            Iterator it = this.a.a().entrySet().iterator();
            while (it.hasNext()) {
                this.e.e((ryv) ((Map.Entry) it.next()).getValue());
                a();
            }
            this.h.postDelayed(new mhr(this, 5), 500L);
        }
    }
}
