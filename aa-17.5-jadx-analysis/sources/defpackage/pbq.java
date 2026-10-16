package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pbq extends mdd {
    public final Context a;
    public final Set b = new HashSet();
    public final ydx c = new ydx(100);

    public pbq(Context context) {
        this.a = context;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("CarConnectionStateBroadcastReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode == -203776308) {
            if (action.equals("com.google.android.gms.car.PROJECTION_ENDED")) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((pbp) it.next()).b();
                }
                this.c.add(Pair.create(Long.valueOf(System.currentTimeMillis()), intent.getAction()));
                return;
            }
            throw new UnsupportedOperationException();
        }
        if (iHashCode == 1449022483 && action.equals("com.google.android.gms.car.PROJECTION_STARTED")) {
            for (pbp pbpVar : this.b) {
                try {
                    pbpVar.f((rrw) ols.J(intent, rrw.values()));
                } catch (rrt unused) {
                    pbpVar.f(rrw.a);
                }
            }
            this.c.add(Pair.create(Long.valueOf(System.currentTimeMillis()), intent.getAction()));
            return;
        }
        throw new UnsupportedOperationException();
    }
}
