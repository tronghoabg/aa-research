package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class igc implements dzk {
    private final igb a;
    private final ige b;
    private final dzk c;

    public igc(dzk dzkVar, igb igbVar, ige igeVar) {
        this.c = dzkVar;
        this.a = igbVar;
        this.b = igeVar;
    }

    @Override // defpackage.dzk
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(objA.getClass()))));
            }
        }
        if (objA instanceof igd) {
            ((igd) objA).f().a = false;
        }
        return objA;
    }

    @Override // defpackage.dzk
    public final boolean b(Object obj) {
        if (obj instanceof igd) {
            ((igd) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
