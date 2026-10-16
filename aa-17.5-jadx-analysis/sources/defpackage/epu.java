package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.auto.client.activity.ghost.GhostActivity;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class epu implements epy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public epu(affq affqVar, Fragment fragment, int i) {
        this.c = i;
        this.b = affqVar;
        this.a = fragment;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aivh, java.lang.Object] */
    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        int i = this.c;
        if (i == 0) {
            eps epsVarA = eqaVar.getLifecycle().a();
            Object obj = this.a;
            if (epsVarA == eps.a) {
                this.b.s(null);
                ((fgp) obj).a();
                return;
            }
            fgp fgpVar = (fgp) obj;
            if (eqaVar.getLifecycle().a().compareTo((eps) fgpVar.d) < 0) {
                ((epg) fgpVar.b).a = true;
                return;
            }
            epg epgVar = (epg) fgpVar.b;
            if (epgVar.a) {
                if (epgVar.b) {
                    throw new IllegalStateException("Cannot resume a finished dispatcher");
                }
                epgVar.a = false;
                epgVar.a();
                return;
            }
            return;
        }
        if (i == 1) {
            if (eprVar.a().a(eps.d)) {
                ((affq) this.b).a = false;
                ((Fragment) this.a).getLifecycle().d(this);
                return;
            }
            return;
        }
        if (i == 2) {
            if (eprVar == this.b) {
                ((afdr) this.a.a()).invoke();
                return;
            }
            return;
        }
        Object obj2 = this.a;
        if (i != 3) {
            if (obj2 != null) {
                Object obj3 = this.b;
                String strName = eprVar.a().name();
                yop yopVarL = GhostActivity.m.l();
                String strFlattenToShortString = ((GhostActivity) obj3).o().flattenToShortString();
                zjc zjcVar = zjc.a;
                yopVarL.M("GhostActivity for %s %s", new zjd(zjcVar, strFlattenToShortString), new zjd(zjcVar, strName));
                ((TextView) obj2).setText(strName);
                return;
            }
            return;
        }
        Object obj4 = this.b;
        if (eprVar == epr.ON_RESUME) {
            evp evpVar = (evp) obj4;
            if (((List) evpVar.f().d.b()).contains(obj2)) {
                if (ewh.k()) {
                    Log.v("FragmentNavigator", a.bw(eqaVar, obj2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching RESUMED"));
                }
                evpVar.f().c((euq) obj2);
            }
        }
        if (eprVar == epr.ON_DESTROY) {
            if (ewh.k()) {
                Log.v("FragmentNavigator", a.bw(eqaVar, obj2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching DESTROYED"));
            }
            ((evp) obj4).f().c((euq) obj2);
        }
    }

    public /* synthetic */ epu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ epu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
