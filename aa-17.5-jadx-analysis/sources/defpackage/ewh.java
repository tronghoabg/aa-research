package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

@evo(a = "fragment")
/* loaded from: classes.dex */
public class ewh extends evp<ewf> {
    public final bt b;
    private final Context f;
    private final int g;
    private final Set h = new LinkedHashSet();
    public final List c = new ArrayList();
    public final epy d = new erc(this, 3, null);
    public final afec e = new ewm(this, 1);

    public ewh(Context context, bt btVar, int i) {
        this.f = context;
        this.b = btVar;
        this.g = i;
    }

    public static final boolean k() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    public static final void l(Fragment fragment, evr evrVar) {
        ert viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ebc.e(affw.b(ewe.class), new ewc(1), linkedHashMap);
        ((ewe) new ers(viewModelStore, ebc.d(linkedHashMap), esa.a).a(ewe.class)).a = new WeakReference(new bsh(evrVar, fragment, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.cc m(defpackage.euq r8, defpackage.eve r9) {
        /*
            r7 = this;
            euz r0 = r8.a
            r0.getClass()
            ewf r0 = (defpackage.ewf) r0
            android.os.Bundle r1 = r8.a()
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L88
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L26
            android.content.Context r3 = r7.f
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r3.concat(r0)
        L26:
            bt r3 = r7.b
            android.content.Context r4 = r7.f
            bf r5 = r3.i()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.support.v4.app.Fragment r0 = r5.a(r4, r0)
            r0.getClass()
            r0.setArguments(r1)
            w r1 = new w
            r1.<init>(r3)
            r3 = -1
            if (r9 == 0) goto L47
            int r4 = r9.f
            goto L48
        L47:
            r4 = r3
        L48:
            if (r9 == 0) goto L4d
            int r5 = r9.g
            goto L4e
        L4d:
            r5 = r3
        L4e:
            if (r9 == 0) goto L53
            int r6 = r9.h
            goto L54
        L53:
            r6 = r3
        L54:
            if (r9 == 0) goto L59
            int r9 = r9.i
            goto L5a
        L59:
            r9 = r3
        L5a:
            if (r4 != r3) goto L6a
            if (r5 != r3) goto L69
            if (r6 != r3) goto L66
            if (r9 == r3) goto L7a
            r4 = r3
            r5 = r4
            r6 = r5
            goto L6a
        L66:
            r4 = r3
            r5 = r4
            goto L6a
        L69:
            r4 = r3
        L6a:
            if (r4 != r3) goto L6d
            r4 = r2
        L6d:
            if (r5 != r3) goto L70
            r5 = r2
        L70:
            if (r6 != r3) goto L73
            r6 = r2
        L73:
            if (r9 != r3) goto L76
            goto L77
        L76:
            r2 = r9
        L77:
            r1.r(r4, r5, r6, r2)
        L7a:
            int r7 = r7.g
            java.lang.String r8 = r8.c
            r1.q(r7, r0, r8)
            r1.l(r0)
            r1.s()
            return r1
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Fragment class was not set"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewh.m(euq, eve):cc");
    }

    private final void n(String str, boolean z, boolean z2) {
        if (z2) {
            woy.cw(this.c, new ddz(str, 20));
        }
        this.c.add(new aezu(str, Boolean.valueOf(z)));
    }

    @Override // defpackage.evp
    public final /* synthetic */ euz a() {
        return new ewf(this);
    }

    @Override // defpackage.evp
    public final void d(List list, eve eveVar) {
        bt btVar = this.b;
        if (btVar.af()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            euq euqVar = (euq) it.next();
            boolean zIsEmpty = ((List) f().d.b()).isEmpty();
            if (eveVar != null && !zIsEmpty && eveVar.b) {
                Set set = this.h;
                String str = euqVar.c;
                if (set.remove(str)) {
                    btVar.J(new br(btVar, str), false);
                    f().h(euqVar);
                }
            }
            cc ccVarM = m(euqVar, eveVar);
            if (!zIsEmpty) {
                euq euqVar2 = (euq) woy.bL((List) f().d.b());
                if (euqVar2 != null) {
                    n(euqVar2.c, false, true);
                }
                String str2 = euqVar.c;
                n(str2, false, true);
                ccVarM.n(str2);
            }
            ((w) ccVarM).i(false, true);
            if (k()) {
                Objects.toString(euqVar);
                Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry ".concat(String.valueOf(euqVar)));
            }
            f().h(euqVar);
        }
    }

    @Override // defpackage.evp
    public final Bundle e() {
        Set set = this.h;
        if (set.isEmpty()) {
            return null;
        }
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        fbh.e(bundleZ, "androidx-nav-fragment:navigator:savedIds", new ArrayList(set));
        return bundleZ;
    }

    @Override // defpackage.evp
    public final void g(final evr evrVar) {
        super.g(evrVar);
        if (k()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        bt btVar = this.b;
        btVar.n(new bw() { // from class: ewd
            @Override // defpackage.bw
            public final void p(Fragment fragment) {
                Object objPrevious;
                evr evrVar2 = evrVar;
                List list = (List) evrVar2.d.b();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (affa.f(((euq) objPrevious).c, fragment.getTag())) {
                            break;
                        }
                    }
                }
                ewh ewhVar = this;
                euq euqVar = (euq) objPrevious;
                if (ewh.k()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + euqVar + " to FragmentManager " + ewhVar.b);
                }
                if (euqVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().fE(fragment, new ewg(new cib((Object) ewhVar, (Object) fragment, (Object) euqVar, 5, (char[]) null), 0));
                    fragment.getLifecycle().c(ewhVar.d);
                    ewh.l(fragment, evrVar2);
                }
            }
        });
        btVar.j.add(new glf(evrVar, this, null));
    }

    @Override // defpackage.evp
    public final void h(euq euqVar) {
        euqVar.getClass();
        bt btVar = this.b;
        if (btVar.af()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        cc ccVarM = m(euqVar, null);
        List list = (List) f().d.b();
        if (list.size() > 1) {
            euq euqVar2 = (euq) woy.bI(list, woy.bh(list) - 1);
            if (euqVar2 != null) {
                n(euqVar2.c, false, true);
            }
            String str = euqVar.c;
            n(str, true, true);
            btVar.al(str);
            n(str, false, false);
            ccVarM.n(str);
        }
        ((w) ccVarM).i(false, true);
        f().f(euqVar);
    }

    @Override // defpackage.evp
    public final void i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            Set set = this.h;
            set.clear();
            woy.cq(set, stringArrayList);
        }
    }

    @Override // defpackage.evp
    public final void j(euq euqVar, boolean z) {
        bt btVar = this.b;
        if (btVar.af()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) f().d.b();
        int iIndexOf = list.indexOf(euqVar);
        List listSubList = list.subList(iIndexOf, list.size());
        euq euqVar2 = (euq) woy.bF(list);
        euq euqVar3 = (euq) woy.bI(list, iIndexOf - 1);
        int i = 0;
        if (euqVar3 != null) {
            n(euqVar3.c, false, true);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            airp airpVarQ = afrg.q(woy.cm(this.c), new ewc(i));
            String str = ((euq) obj).c;
            aisc aiscVar = new aisc((aisd) airpVarQ);
            int i2 = 0;
            while (true) {
                if (!aiscVar.hasNext()) {
                    break;
                }
                Object next = aiscVar.next();
                if (i2 < 0) {
                    woy.bo();
                }
                if (!affa.f(str, next)) {
                    i2++;
                } else if (i2 >= 0) {
                }
            }
            if (!affa.f(str, euqVar2.c)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n(((euq) it.next()).c, true, true);
        }
        if (z) {
            for (euq euqVar4 : woy.ca(listSubList)) {
                if (affa.f(euqVar4, euqVar2)) {
                    Objects.toString(euqVar4);
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination ".concat(String.valueOf(euqVar4)));
                } else {
                    String str2 = euqVar4.c;
                    btVar.J(new bs(btVar, str2), false);
                    this.h.add(str2);
                }
            }
        } else {
            btVar.al(euqVar.c);
        }
        if (k()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + euqVar + " with savedState " + z);
        }
        f().g(euqVar, z);
    }
}
