package android.support.v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f321a;

    /* renamed from: b, reason: collision with root package name */
    private final List f322b;

    /* renamed from: c, reason: collision with root package name */
    private final List f323c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f324d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f325e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f326f;

    public da(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        this.f321a = viewGroup;
        this.f322b = new ArrayList();
        this.f323c = new ArrayList();
    }

    public static final da b(ViewGroup viewGroup, bv bvVar) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        h.g.b.x.f(bvVar, "fragmentManager");
        bi biVarAU = bvVar.aU();
        h.g.b.x.e(biVarAU, "getSpecialEffectsControllerFactory(...)");
        return a.a.M(viewGroup, biVarAU);
    }

    public static /* synthetic */ void c(da daVar, cw cwVar) {
        daVar.f322b.remove(cwVar);
        daVar.f323c.remove(cwVar);
    }

    public static /* synthetic */ void d(da daVar, cw cwVar) {
        if (daVar.f322b.contains(cwVar)) {
            cy cyVarE = cwVar.e();
            View view = cwVar.c().mView;
            h.g.b.x.e(view, "mView");
            cyVarE.a(view, daVar.f321a);
        }
    }

    private final cz s(ar arVar) {
        Object next;
        Iterator it = this.f322b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cz czVar = (cz) next;
            if (h.g.b.x.n(czVar.c(), arVar) && !czVar.n()) {
                break;
            }
        }
        return (cz) next;
    }

    private final cz t(ar arVar) {
        Object next;
        Iterator it = this.f323c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cz czVar = (cz) next;
            if (h.g.b.x.n(czVar.c(), arVar) && !czVar.n()) {
                break;
            }
        }
        return (cz) next;
    }

    private final void u(cy cyVar, cx cxVar, cd cdVar) {
        List list = this.f322b;
        synchronized (list) {
            ar arVarC = cdVar.c();
            h.g.b.x.e(arVarC, "getFragment(...)");
            cz czVarS = s(arVarC);
            if (czVarS == null) {
                if (cdVar.c().mTransitioning || cdVar.c().mRemoving) {
                    ar arVarC2 = cdVar.c();
                    h.g.b.x.e(arVarC2, "getFragment(...)");
                    czVarS = t(arVarC2);
                } else {
                    czVarS = null;
                }
            }
            if (czVarS != null) {
                czVarS.k(cyVar, cxVar);
            } else {
                final cw cwVar = new cw(cyVar, cxVar, cdVar);
                list.add(cwVar);
                cwVar.g(new Runnable() { // from class: android.support.v4.app.ct
                    @Override // java.lang.Runnable
                    public final void run() {
                        da.d(this.f292a, cwVar);
                    }
                });
                cwVar.g(new Runnable() { // from class: android.support.v4.app.cu
                    @Override // java.lang.Runnable
                    public final void run() {
                        da.c(this.f294a, cwVar);
                    }
                });
            }
        }
    }

    private final void v(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cz) list.get(i2)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h.a.i.aD(arrayList, ((cz) it.next()).f());
        }
        List listAo = h.a.i.ao(h.a.i.au(arrayList));
        int size2 = listAo.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cv) listAo.get(i3)).n(this.f321a);
        }
    }

    private final void w() {
        for (cz czVar : this.f322b) {
            if (czVar.d() == cx.f300b) {
                View viewRequireView = czVar.c().requireView();
                h.g.b.x.e(viewRequireView, "requireView(...)");
                cy cyVar = cy.f303a;
                czVar.k(android.support.v4.media.a.b.b(viewRequireView.getVisibility()), cx.f299a);
            }
        }
    }

    private final void x(Map map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    h.g.b.x.c(childAt);
                    x(map, childAt);
                }
            }
        }
    }

    private static void y(ArrayMap arrayMap, Collection collection) {
        h.a.i.aR(arrayMap.entrySet(), new com.airbnb.lottie.b.q(collection, 1));
    }

    public final cx a(cd cdVar) {
        h.g.b.x.f(cdVar, "fragmentStateManager");
        ar arVarC = cdVar.c();
        h.g.b.x.e(arVarC, "getFragment(...)");
        cz czVarS = s(arVarC);
        cx cxVarD = czVarS != null ? czVarS.d() : null;
        cz czVarT = t(arVarC);
        return (cxVarD == null || cxVarD.ordinal() == 0) ? czVarT != null ? czVarT.d() : null : cxVarD;
    }

    public final void e(cz czVar) {
        h.g.b.x.f(czVar, "operation");
        if (czVar.m()) {
            cy cyVarE = czVar.e();
            View viewRequireView = czVar.c().requireView();
            h.g.b.x.e(viewRequireView, "requireView(...)");
            cyVarE.a(viewRequireView, this.f321a);
            czVar.r();
        }
    }

    public final void f(List list) {
        h.g.b.x.f(list, "operations");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            h.a.i.aD(arrayList, ((cz) it.next()).f());
        }
        List listAo = h.a.i.ao(h.a.i.au(arrayList));
        int size = listAo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cv) listAo.get(i2)).c(this.f321a);
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            e((cz) list.get(i3));
        }
        List listAo2 = h.a.i.ao(list2);
        int size3 = listAo2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            cz czVar = (cz) listAo2.get(i4);
            if (czVar.f().isEmpty()) {
                czVar.a();
            }
        }
    }

    public final void g() {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        List list = this.f323c;
        v(list);
        f(list);
    }

    public final void h(cy cyVar, cd cdVar) {
        h.g.b.x.f(cyVar, "finalState");
        h.g.b.x.f(cdVar, "fragmentStateManager");
        if (bv.aM(2)) {
            ar arVarC = cdVar.c();
            Objects.toString(arVarC);
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment ".concat(String.valueOf(arVarC)));
        }
        u(cyVar, cx.f300b, cdVar);
    }

    public final void i(cd cdVar) {
        h.g.b.x.f(cdVar, "fragmentStateManager");
        if (bv.aM(2)) {
            ar arVarC = cdVar.c();
            Objects.toString(arVarC);
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment ".concat(String.valueOf(arVarC)));
        }
        u(cy.f305c, cx.f299a, cdVar);
    }

    public final void j(cd cdVar) {
        h.g.b.x.f(cdVar, "fragmentStateManager");
        if (bv.aM(2)) {
            ar arVarC = cdVar.c();
            Objects.toString(arVarC);
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment ".concat(String.valueOf(arVarC)));
        }
        u(cy.f303a, cx.f301c, cdVar);
    }

    public final void k(cd cdVar) {
        h.g.b.x.f(cdVar, "fragmentStateManager");
        if (bv.aM(2)) {
            ar arVarC = cdVar.c();
            Objects.toString(arVarC);
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment ".concat(String.valueOf(arVarC)));
        }
        u(cy.f304b, cx.f299a, cdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0630 A[Catch: all -> 0x082b, LOOP:28: B:200:0x062a->B:202:0x0630, LOOP_END, TryCatch #0 {, blocks: (B:11:0x0019, B:12:0x0029, B:14:0x0030, B:16:0x003f, B:20:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0058, B:26:0x0062, B:28:0x0068, B:29:0x007e, B:34:0x00a1, B:36:0x00a9, B:30:0x0082, B:32:0x0088, B:33:0x009e, B:37:0x00ad, B:39:0x00b6, B:42:0x00c5, B:44:0x00d4, B:45:0x00db, B:47:0x00e8, B:48:0x00ef, B:49:0x00f6, B:51:0x00fc, B:53:0x0118, B:57:0x0120, B:58:0x012b, B:60:0x0131, B:62:0x014d, B:66:0x0155, B:68:0x015e, B:69:0x016b, B:70:0x0187, B:72:0x018d, B:73:0x01c8, B:74:0x01ce, B:76:0x01d4, B:83:0x01ee, B:84:0x01fd, B:85:0x020a, B:87:0x0210, B:89:0x021d, B:90:0x0221, B:91:0x0230, B:93:0x0236, B:95:0x0243, B:96:0x0247, B:97:0x0252, B:99:0x0258, B:103:0x0267, B:104:0x0296, B:203:0x0641, B:204:0x0657, B:206:0x065d, B:207:0x0671, B:208:0x067e, B:210:0x0684, B:212:0x069b, B:214:0x069f, B:215:0x06a3, B:217:0x06b3, B:219:0x06b9, B:220:0x06c7, B:222:0x06cf, B:223:0x06d2, B:224:0x06de, B:225:0x06e2, B:227:0x06e8, B:229:0x06f8, B:231:0x06fe, B:233:0x070e, B:235:0x0714, B:236:0x0722, B:237:0x072d, B:239:0x0735, B:241:0x073b, B:243:0x074d, B:245:0x0757, B:248:0x0761, B:249:0x0765, B:251:0x076b, B:255:0x077b, B:256:0x0789, B:258:0x078f, B:259:0x079f, B:263:0x07ac, B:264:0x07b4, B:266:0x07ba, B:271:0x07cf, B:273:0x07d7, B:275:0x07f7, B:280:0x0819, B:282:0x0822, B:277:0x0800, B:279:0x080d, B:108:0x02a1, B:110:0x02cb, B:112:0x02d1, B:116:0x02e1, B:118:0x0328, B:120:0x0335, B:121:0x033c, B:122:0x0341, B:124:0x0350, B:126:0x037b, B:128:0x038e, B:129:0x03b7, B:131:0x03bf, B:132:0x03cf, B:134:0x03d5, B:135:0x03eb, B:136:0x03fb, B:138:0x0401, B:139:0x0417, B:141:0x0430, B:143:0x0436, B:145:0x044d, B:157:0x049e, B:159:0x04be, B:161:0x04c4, B:162:0x04d6, B:183:0x054c, B:185:0x0562, B:165:0x04e7, B:167:0x04fc, B:169:0x0502, B:170:0x0506, B:172:0x0510, B:174:0x0516, B:177:0x0524, B:179:0x053a, B:181:0x0546, B:182:0x0549, B:148:0x045e, B:150:0x0473, B:151:0x0477, B:153:0x0481, B:156:0x0495, B:125:0x0366, B:190:0x05e2, B:192:0x05ea, B:194:0x05f3, B:195:0x05f7, B:197:0x05fd, B:199:0x0609, B:200:0x062a, B:202:0x0630), top: B:288:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.da.l():void");
    }

    public final void m() {
        if (bv.aM(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f321a;
        List list = this.f322b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            w();
            v(list);
            List<cz> listAq = h.a.i.aq(this.f323c);
            Iterator it = listAq.iterator();
            while (it.hasNext()) {
                ((cz) it.next()).l(false);
            }
            for (cz czVar : listAq) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : k.e(viewGroup, "Container ", " is not attached to window. ")) + "Cancelling running operation " + czVar);
                }
                czVar.i(viewGroup);
            }
            List<cz> listAq2 = h.a.i.aq(list);
            Iterator it2 = listAq2.iterator();
            while (it2.hasNext()) {
                ((cz) it2.next()).l(false);
            }
            for (cz czVar2 : listAq2) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : k.e(viewGroup, "Container ", " is not attached to window. ")) + "Cancelling pending operation " + czVar2);
                }
                czVar2.i(viewGroup);
            }
        }
    }

    public final void n() {
        if (this.f326f) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f326f = false;
            l();
        }
    }

    public final void o() {
        Object objPrevious;
        List list = this.f322b;
        synchronized (list) {
            w();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                cz czVar = (cz) objPrevious;
                cy cyVar = cy.f303a;
                View view = czVar.c().mView;
                h.g.b.x.e(view, "mView");
                cy cyVarC = android.support.v4.media.a.b.c(view);
                cy cyVarE = czVar.e();
                cy cyVar2 = cy.f304b;
                if (cyVarE == cyVar2 && cyVarC != cyVar2) {
                    break;
                }
            }
            cz czVar2 = (cz) objPrevious;
            ar arVarC = czVar2 != null ? czVar2.c() : null;
            this.f326f = arVarC != null ? arVarC.isPostponed() : false;
        }
    }

    public final void p(BackEventCompat backEventCompat) {
        h.g.b.x.f(backEventCompat, "backEvent");
        if (bv.aM(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEventCompat.getProgress());
        }
        List list = this.f323c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h.a.i.aD(arrayList, ((cz) it.next()).f());
        }
        List listAo = h.a.i.ao(h.a.i.au(arrayList));
        int size = listAo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cv) listAo.get(i2)).d(backEventCompat, this.f321a);
        }
    }

    public final void q(boolean z) {
        this.f325e = z;
    }

    public final boolean r() {
        return !this.f322b.isEmpty();
    }
}
