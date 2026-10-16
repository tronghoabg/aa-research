package defpackage;

import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class xab implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xab(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, veg] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, zwl] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, zxe] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, vip] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, vgv] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, xbn] */
    @Override // java.lang.Runnable
    public final void run() {
        sm smVar;
        int i = 0;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                LauncherAppSettingsActivity launcherAppSettingsActivity = (LauncherAppSettingsActivity) this.a;
                mo moVarH = launcherAppSettingsActivity.o.h(launcherAppSettingsActivity.A((mrg) this.b));
                if (moVarH != null) {
                    View view = moVarH.a;
                    view.setPressed(true);
                    view.postOnAnimationDelayed(new wxj(moVarH, 5), 350L);
                    return;
                }
                return;
            case 1:
                Object obj = this.a;
                wzt wztVar = (wzt) this.b;
                wztVar.b = (ArrayList) obj;
                wztVar.notifyDataSetChanged();
                return;
            case 2:
                Object obj2 = this.b;
                Object obj3 = this.a;
                LauncherAppSettingsActivity launcherAppSettingsActivity2 = (LauncherAppSettingsActivity) obj3;
                int iA = launcherAppSettingsActivity2.A((mrg) obj2);
                if (iA != -1) {
                    launcherAppSettingsActivity2.o.X(Math.min(iA + 1, launcherAppSettingsActivity2.q.e.size() - 1));
                    launcherAppSettingsActivity2.u.postDelayed(new xab(obj3, obj2, i), 750L);
                    return;
                }
                return;
            case 3:
                bc activity = ((Fragment) this.a).getActivity();
                if (activity == null) {
                    return;
                }
                this.b.a(activity);
                return;
            case 4:
                ((yom) this.a).a.remove(this.b);
                return;
            case 5:
                ((zis) this.b).o((admc) this.a);
                return;
            case 6:
                Object obj4 = this.a;
                zis zisVar = (zis) this.b;
                zisVar.c.add(new zip(zisVar, obj4));
                zisVar.l();
                return;
            case 7:
                try {
                    this.a.run();
                    return;
                } catch (Throwable th) {
                    zis zisVar2 = (zis) this.b;
                    zisVar2.h = true;
                    adqq adqqVar = zisVar2.j;
                    if (adqqVar != null) {
                        adqqVar.a(adnq.c(th), new admc());
                        adqq adqqVar2 = zisVar2.i;
                        if (adqqVar2 == null || zisVar2.e.e != 4) {
                            return;
                        }
                        adqqVar2.i(null, th);
                        return;
                    }
                    return;
                }
            case 8:
                zio zioVar = (zio) this.b;
                if (zioVar.a) {
                    return;
                }
                zioVar.c.be((admc) this.a);
                return;
            case 9:
                zio zioVar2 = (zio) this.b;
                if (zioVar2.a) {
                    return;
                }
                zioVar2.c.g(this.a);
                return;
            case 10:
                ((ziy) this.b).a.be((admc) this.a);
                return;
            case 11:
                ((ziy) this.b).a.g(this.a);
                return;
            case 12:
                zvf zvfVar = (zvf) this.b;
                zxf zxfVar = zvfVar.d;
                Object obj5 = this.a;
                zxj zxjVar = (zxj) obj5;
                zxe zxeVarG = zxfVar.g(zxjVar);
                zxjVar.a = zxeVarG;
                zvfVar.h.execute(new xab(zxeVarG, obj5, 13, bArr));
                return;
            case 13:
                int i2 = zvf.i;
                this.b.a(((zxj) this.a).b);
                return;
            case 14:
                ((zvf) this.a).g.b(null, this.b, true);
                return;
            case 15:
                ?? r0 = this.a;
                boolean z = ((zvf) r0).c;
                ?? r7 = this.b;
                if (z) {
                    return;
                }
                try {
                    r7.a(r0);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            case 16:
                List listD = this.b.g().d();
                Map map = ((zwz) this.a).e;
                for (zwv zwvVar : map.keySet()) {
                    if (listD.contains(zwvVar)) {
                        ((View) map.get(zwvVar)).setVisibility(0);
                    } else {
                        ((View) map.get(zwvVar)).setVisibility(4);
                    }
                }
                return;
            case 17:
                Object obj6 = this.b;
                zvm zvmVar = (zvm) obj6;
                vfu vfuVar = zvmVar.d;
                Object obj7 = this.a;
                if (vfuVar != null) {
                    synchronized (obj6) {
                        smVar = ((zvm) obj6).e;
                    }
                    try {
                        ((zvm) obj6).d.f(new zvk(smVar, (sm) obj7, ((zvm) obj6).b));
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
                zvs zvsVar = zvmVar.c;
                if (zvsVar != null) {
                    zvsVar.post(new xab(zvsVar, obj7, 18, bArr));
                    return;
                }
                return;
            case 18:
                zvs zvsVar2 = (zvs) this.b;
                sm smVar2 = zvsVar2.b;
                if (smVar2 != null) {
                    Object obj8 = this.a;
                    sm smVar3 = (sm) obj8;
                    int I = smVar2.I(smVar3);
                    if (zrn.e("INDOOR", 3)) {
                        Log.d("INDOOR", "onIndoorLevelActivated: " + obj8.toString() + ", " + I);
                    }
                    if (zvs.f(zvsVar2.c, smVar3)) {
                        zvsVar2.e(zvsVar2.c, I);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((zwq) this.b).b.o((String) this.a);
                return;
            default:
                zwz zwzVar = (zwz) this.a;
                zwzVar.i.a();
                Object obj9 = this.b;
                zwv zwvVar2 = (zwv) obj9;
                zwu zwuVarB = zwzVar.b(zwvVar2);
                if (zwuVarB != null && zwvVar2.u()) {
                    zwuVarB.f();
                    zwzVar.c.remove(obj9);
                } else if (zwuVarB != null) {
                    ymf ymfVar = zwzVar.f;
                    String str = zwvVar2.a;
                    if (ymfVar.s(str)) {
                        Iterator it = ymfVar.c(str).iterator();
                        while (it.hasNext()) {
                            zwuVarB.e(((Integer) it.next()).intValue());
                        }
                    }
                }
                zwzVar.f.E(zwvVar2.a);
                return;
        }
    }

    public /* synthetic */ xab(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public xab(wzt wztVar, ArrayList arrayList, int i) {
        this.c = i;
        this.a = arrayList;
        this.b = wztVar;
    }

    public xab(yom yomVar, yol yolVar, int i) {
        this.c = i;
        this.b = yolVar;
        this.a = yomVar;
    }
}
