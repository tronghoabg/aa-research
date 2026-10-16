package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class cq {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    private boolean f;

    public cq(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private final void j() {
        for (cp cpVar : this.b) {
            if (cpVar.i == 2) {
                cpVar.h(ca.i(cpVar.a.requireView().getVisibility()), 1);
            }
        }
    }

    private final void k(Map map, View view) {
        int[] iArr = ebm.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static void l(yw ywVar, Collection collection) {
        woy.cz(ywVar.entrySet(), new bml(collection, 1), false);
    }

    public final cp a(Fragment fragment) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cp cpVar = (cp) next;
            if (affa.f(cpVar.a, fragment) && !cpVar.b) {
                break;
            }
        }
        return (cp) next;
    }

    public final cp b(Fragment fragment) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cp cpVar = (cp) next;
            if (affa.f(cpVar.a, fragment) && !cpVar.b) {
                break;
            }
        }
        return (cp) next;
    }

    public final void c(cp cpVar) {
        cpVar.getClass();
        if (cpVar.f) {
            int i = cpVar.h;
            Fragment fragment = cpVar.a;
            ca.h(i, fragment.requireView(), this.a);
            cpVar.g();
        }
    }

    public final void d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((cp) it.next()).g);
        }
        List listCf = woy.cf(woy.cl(arrayList));
        int size = listCf.size();
        for (int i = 0; i < size; i++) {
            ((cn) listCf.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((cp) list.get(i2));
        }
        List listCf2 = woy.cf(list);
        int size3 = listCf2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cp cpVar = (cp) listCf2.get(i3);
            if (cpVar.g.isEmpty()) {
                cpVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x04c5 A[Catch: all -> 0x0671, LOOP:25: B:172:0x04bf->B:174:0x04c5, LOOP_END, TryCatch #0 {, blocks: (B:11:0x0019, B:12:0x0027, B:14:0x002e, B:16:0x003a, B:20:0x0042, B:21:0x0045, B:22:0x0049, B:24:0x0050, B:26:0x005a, B:28:0x0060, B:29:0x0076, B:34:0x0099, B:36:0x009f, B:30:0x007a, B:32:0x0080, B:33:0x0096, B:37:0x00a3, B:39:0x00a9, B:42:0x00b9, B:44:0x00c5, B:45:0x00cc, B:47:0x00d4, B:48:0x00db, B:49:0x00df, B:51:0x00e5, B:53:0x00f9, B:57:0x00ff, B:58:0x010a, B:60:0x0110, B:62:0x0124, B:66:0x012a, B:68:0x0133, B:69:0x0140, B:70:0x0156, B:72:0x015c, B:73:0x017f, B:74:0x0187, B:76:0x018d, B:83:0x01a7, B:84:0x01b6, B:85:0x01bf, B:87:0x01c5, B:89:0x01d2, B:90:0x01d6, B:91:0x01df, B:93:0x01e5, B:95:0x01f2, B:96:0x01f6, B:97:0x01fc, B:99:0x0202, B:103:0x0211, B:104:0x023a, B:175:0x04d1, B:176:0x04df, B:178:0x04e5, B:179:0x04f3, B:180:0x04fc, B:182:0x0502, B:184:0x0517, B:186:0x051b, B:187:0x051f, B:189:0x0529, B:191:0x052f, B:192:0x053d, B:194:0x0542, B:195:0x0545, B:196:0x054f, B:197:0x0553, B:199:0x0559, B:201:0x0565, B:203:0x056b, B:205:0x057b, B:207:0x0581, B:208:0x058f, B:209:0x0598, B:211:0x059d, B:213:0x05a3, B:215:0x05b1, B:218:0x05b8, B:219:0x05bc, B:221:0x05c2, B:225:0x05d2, B:226:0x05db, B:228:0x05e1, B:229:0x05ed, B:233:0x05f6, B:234:0x05fb, B:236:0x0601, B:241:0x0614, B:243:0x061c, B:245:0x063c, B:251:0x065f, B:253:0x0668, B:248:0x0649, B:250:0x0653, B:108:0x0247, B:109:0x0274, B:111:0x027a, B:115:0x028c, B:117:0x02c4, B:119:0x02d1, B:120:0x02d8, B:121:0x02dd, B:123:0x02e6, B:125:0x0301, B:127:0x0310, B:128:0x0334, B:130:0x033e, B:131:0x034c, B:133:0x0352, B:134:0x0368, B:135:0x0376, B:137:0x037c, B:138:0x0392, B:140:0x039f, B:142:0x03a5, B:143:0x03b7, B:144:0x03b8, B:146:0x03d3, B:148:0x03d9, B:149:0x03eb, B:150:0x03ec, B:152:0x03f6, B:154:0x0402, B:155:0x0405, B:156:0x0408, B:158:0x041c, B:124:0x02f4, B:164:0x0488, B:166:0x048e, B:167:0x0492, B:169:0x0498, B:171:0x04a2, B:172:0x04bf, B:174:0x04c5), top: B:259:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.e():void");
    }

    public final void f() {
        if (bt.ac(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        List list = this.b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            j();
            h(list);
            ArrayList<cp> arrayList = new ArrayList(this.c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cp) it.next()).d = false;
            }
            for (cp cpVar : arrayList) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.by(cpVar, zIsAttachedToWindow ? "" : a.bm(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling running operation "));
                }
                cpVar.e(viewGroup);
            }
            ArrayList<cp> arrayList2 = new ArrayList(list);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((cp) it2.next()).d = false;
            }
            for (cp cpVar2 : arrayList2) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.by(cpVar2, zIsAttachedToWindow ? "" : a.bm(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                cpVar2.e(viewGroup);
            }
        }
    }

    public final void g() {
        Object objPrevious;
        List list = this.b;
        synchronized (list) {
            j();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                cp cpVar = (cp) objPrevious;
                View view = cpVar.a.mView;
                view.getClass();
                int iJ = ca.j(view);
                if (cpVar.h == 2 && iJ != 2) {
                    break;
                }
            }
            cp cpVar2 = (cp) objPrevious;
            Fragment fragment = cpVar2 != null ? cpVar2.a : null;
            this.e = fragment != null ? fragment.isPostponed() : false;
        }
    }

    public final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cp) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((cp) it.next()).g);
        }
        List listCf = woy.cf(woy.cl(arrayList));
        int size2 = listCf.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cn cnVar = (cn) listCf.get(i2);
            ViewGroup viewGroup = this.a;
            if (!cnVar.i) {
                cnVar.c(viewGroup);
            }
            cnVar.i = true;
        }
    }

    public final void i(int i, int i2, by byVar) {
        List list = this.b;
        synchronized (list) {
            Fragment fragment = byVar.a;
            fragment.getClass();
            cp cpVarA = a(fragment);
            if (cpVarA == null) {
                if (fragment.mTransitioning || fragment.mRemoving) {
                    fragment.getClass();
                    cpVarA = b(fragment);
                } else {
                    cpVarA = null;
                }
            }
            if (cpVarA != null) {
                cpVarA.h(i, i2);
            } else {
                co coVar = new co(i, i2, byVar);
                list.add(coVar);
                coVar.c(new aq(this, coVar, 4));
                coVar.c(new aq(this, coVar, 5));
            }
        }
    }
}
