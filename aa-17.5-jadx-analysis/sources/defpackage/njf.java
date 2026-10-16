package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.control.CarAction;

/* loaded from: classes.dex */
public final /* synthetic */ class njf implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ njf(aitx aitxVar, CarAction carAction, npy npyVar, int i) {
        this.d = i;
        this.b = aitxVar;
        this.c = carAction;
        this.a = npyVar;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [aitx, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            Object obj2 = (ComponentName) obj;
            Object obj3 = obj2 == null ? this.a : obj2;
            if (obj3 == null) {
                return kgq.l();
            }
            ComponentName componentName = (ComponentName) obj3;
            return new nmj(GhIcon.j(componentName), componentName, null, null, false, new lxu(obj3, this.b, this.c, 9, (short[]) null));
        }
        if (i == 1) {
            Object obj4 = (ComponentName) obj;
            Object obj5 = obj4 == null ? this.a : obj4;
            if (obj5 == null) {
                return kgq.l();
            }
            ComponentName componentName2 = (ComponentName) obj5;
            return new nmj(GhIcon.j(componentName2), componentName2, null, null, false, new lxu(this.b, this.c, obj5, 10, (byte[]) null));
        }
        if (i == 2) {
            ahnc.d(this.b, null, 0, new far((CarAction) this.c, (npy) this.a, ((Boolean) obj).booleanValue(), (afck) null, 4), 3);
            return afak.a;
        }
        if (i == 3) {
            ahnc.d(this.b, null, 0, new far((CarAction) this.c, (npy) this.a, ((Boolean) obj).booleanValue(), (afck) null, 5, (byte[]) null), 3);
            return afak.a;
        }
        if (i == 4) {
            ahnc.d(this.b, null, 0, new far((CarAction) this.c, (npy) this.a, ((Boolean) obj).booleanValue(), (afck) null, 6, (char[]) null), 3);
            return afak.a;
        }
        if (i == 5) {
            ahnc.d(this.b, null, 0, new far((CarAction) this.c, (npy) this.a, ((Boolean) obj).booleanValue(), (afck) null, 7, (short[]) null), 3);
            return afak.a;
        }
        nwc nwcVar = (nwc) obj;
        nwcVar.getClass();
        nwr nwrVar = (nwr) this.a;
        mcd.J(nwrVar, yzy.ob);
        ((affq) this.b).a = true;
        this.c.invoke(nwcVar);
        nwrVar.g.run();
        return afak.a;
    }

    public /* synthetic */ njf(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
