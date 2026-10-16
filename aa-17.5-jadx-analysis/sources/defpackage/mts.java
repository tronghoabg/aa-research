package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.ProjectionWindowDragParams;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mts implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mts(bym bymVar, bym bymVar2, int i) {
        this.c = i;
        this.b = bymVar;
        this.a = bymVar2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v42, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v58, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v63, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [bwq, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz, qsa {
        int i = this.c;
        float millis = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        switch (i) {
            case 0:
                CarWindowLayoutParams carWindowLayoutParamsA = nsh.a((nso) this.a, nsn.r, new mii(18));
                if (carWindowLayoutParamsA == null) {
                    throw new IllegalStateException("Unable to create shade window params");
                }
                Object obj = this.b;
                ProjectionWindowDecorationParams projectionWindowDecorationParams = carWindowLayoutParamsA.u;
                ProjectionWindowDragParams projectionWindowDragParams = projectionWindowDecorationParams.l;
                new ArrayList();
                new ArrayList();
                int i3 = yfq.d;
                yfq yfqVar = yls.a;
                int i4 = projectionWindowDragParams.a;
                List list = projectionWindowDragParams.b;
                IBinder iBinder = projectionWindowDragParams.c;
                List list2 = projectionWindowDragParams.d;
                List list3 = projectionWindowDragParams.e;
                qzx qzxVar = ((mtv) obj).f;
                projectionWindowDecorationParams.l = new ProjectionWindowDragParams(i4, list, qzxVar == null ? null : qzxVar, list2, list3);
                nog nogVarB = nsh.b(carWindowLayoutParamsA, "DashboardShade", new mui(), lbh.d());
                if (!leh.a.a().b()) {
                    nogVarB.f = sk.AUDIO_CONTENT_BUFFER_SIZE;
                }
                return nogVarB.a();
            case 1:
                return Boolean.valueOf((affa.e(lxw.o(this.a), BitmapDescriptorFactory.HUE_RED) || ((Boolean) this.b.a()).booleanValue()) ? false : true);
            case 2:
                Object obj2 = this.b;
                Object obj3 = this.a;
                int i5 = mug.e;
                nog nogVarB2 = nsh.b((CarWindowLayoutParams) obj3, "Dashboard", (Fragment) obj2, lbh.d());
                if (!leh.a.a().b()) {
                    nogVarB2.f = sk.AUDIO_CONTENT_BUFFER_SIZE;
                }
                return nogVarB2.a();
            case 3:
                if (!((Boolean) this.a.a()).booleanValue() && !((Boolean) this.b.a()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                long millis2 = myi.g(this.b).toMillis();
                if (millis2 != 0) {
                    millis = myi.f(this.a).toMillis() / millis2;
                }
                return Float.valueOf(millis);
            case 5:
                ?? r0 = this.b;
                yph yphVar = myi.a;
                return Boolean.valueOf(((Boolean) r0.a()).booleanValue() && a.Y(((kwp) this.a).o(), 2));
            case 6:
                ?? r02 = this.a;
                yph yphVar2 = myv.a;
                ArrayList arrayList = new ArrayList(woy.bp(r02, 10));
                for (loz lozVar : r02) {
                    arrayList.add(new nbf(lozVar, lozVar.a));
                }
                ?? r12 = this.b;
                List listCh = woy.ch(arrayList);
                if (myv.b(r12) != null) {
                    if (listCh.isEmpty()) {
                        ComponentName componentNameB = myv.b(r12);
                        componentNameB.getClass();
                        listCh.add(new nbf(null, componentNameB));
                    } else {
                        Iterator it = listCh.iterator();
                        while (it.hasNext()) {
                            if (affa.f(((nbf) it.next()).b, myv.b(r12))) {
                            }
                        }
                        ComponentName componentNameB2 = myv.b(r12);
                        componentNameB2.getClass();
                        listCh.add(new nbf(null, componentNameB2));
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listCh) {
                    if (hashSet.add(myv.e((nbf) obj4))) {
                        arrayList2.add(obj4);
                    }
                }
                return woy.cd(arrayList2, 5);
            case 7:
                ?? r03 = this.b;
                yph yphVar3 = myv.a;
                r03.b(Boolean.valueOf(true));
                ?? r122 = this.a;
                Iterator it2 = r122.values().iterator();
                while (it2.hasNext()) {
                    ((aivh) it2.next()).s(null);
                }
                r122.clear();
                myv.a.l().u("MediaSwitcher paused, needs reset");
                return afak.a;
            case 8:
                ?? r04 = this.b;
                yph yphVar4 = myv.a;
                return Boolean.valueOf(((Boolean) r04.a()).booleanValue() && a.Y(((kwp) this.a).o(), 2));
            case 9:
                return Boolean.valueOf(((Boolean) this.b.a()).booleanValue() && !roc.ag(this.a).isEmpty());
            case 10:
                return Boolean.valueOf(!((Boolean) this.a.a()).booleanValue() && ((Boolean) this.b.a()).booleanValue());
            case 11:
                ?? r05 = this.b;
                aezr aezrVar = ndj.a;
                mwc.b(yzy.Hz, ndj.g(r05));
                ndp ndpVar = (ndp) this.a;
                ndpVar.b(3);
                ndpVar.a();
                szp.k(ndn.a.a().e, ndpVar.a);
                return afak.a;
            case 12:
                ?? r06 = this.b;
                yph yphVar5 = nih.a;
                ((njw) this.a).o(((Number) r06.a()).intValue());
                return afak.a;
            case 13:
                yph yphVar6 = nih.a;
                ((njw) this.a).r((Context) this.b);
                return afak.a;
            case 14:
                yph yphVar7 = nih.a;
                return Boolean.valueOf((acxa.aZ() || acxa.ba() || ((njw) this.a).n) && !affa.f(nih.a(this.b), nnl.a));
            case 15:
                ?? r07 = this.b;
                yph yphVar8 = nih.a;
                return Boolean.valueOf(((Boolean) r07.a()).booleanValue() && !lxr.x(nih.a(this.a)));
            case 16:
                ((njw) this.a).m(((Number) this.b.a()).intValue());
                mud mudVarA = mud.h.a();
                int i6 = mua.a;
                mudVarA.x();
                return afak.a;
            case 17:
                ((njw) this.a).m(((Number) this.b.a()).intValue());
                mud mudVarA2 = mud.h.a();
                int i7 = mua.a;
                mudVarA2.x();
                return afak.a;
            case 18:
                ((njw) this.a).n(((Number) this.b.a()).intValue());
                return afak.a;
            case 19:
                ((njw) this.a).n(((Number) this.b.a()).intValue());
                return afak.a;
            default:
                oct octVarB = oct.b();
                afia<?> afiaVar = niy.a[0];
                Object obj5 = this.a;
                oco ocoVarA = octVarB.a((noh) ((niy) obj5).r.getValue(obj5, afiaVar), new ocy((View) this.b));
                ocoVarA.f = new niv((Fragment) obj5, i2);
                return ocoVarA;
        }
    }

    public /* synthetic */ mts(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
