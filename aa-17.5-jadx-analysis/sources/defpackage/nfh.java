package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class nfh {
    public final Object a;
    public final Object b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public nfh(List list) {
        List<wga> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.c = new HashMap();
        this.b = new HashMap();
        this.a = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wfv wfvVar = (wfv) it.next();
            if (TextUtils.isEmpty(wfvVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                wfv wfvVar2 = (wfv) this.c.put(wfvVar.e(), wfvVar);
                if (wfvVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + wfvVar2.getClass().getCanonicalName() + " with " + wfvVar.getClass().getCanonicalName());
                }
            }
        }
        for (wga wgaVar : list2) {
            if (TextUtils.isEmpty(wgaVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                wga wgaVar2 = (wga) this.b.put(wgaVar.a(), wgaVar);
                if (wgaVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + wgaVar2.getClass().getCanonicalName() + " with " + wgaVar.getClass().getCanonicalName());
                }
            }
        }
        this.a.addAll(list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    private final rdx E(Uri uri) throws IOException {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        Pattern pattern = wfp.a;
        yfl yflVar2 = new yfl(4);
        String encodedFragment = uri.getEncodedFragment();
        yfq yfqVarN = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? yls.a : yfq.n(xxx.d("+").b().g(encodedFragment.substring(10)));
        int size = yfqVarN.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) yfqVarN.get(i2);
            Matcher matcher = wfp.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            yflVar2.i(matcher.group(1));
        }
        yfq yfqVarG = yflVar2.g();
        int i3 = ((yls) yfqVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) yfqVarG.get(i4);
            wga wgaVar = (wga) this.b.get(str2);
            if (wgaVar == null) {
                throw new wfj("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            yflVar.i(wgaVar);
        }
        yfq yfqVarH = yflVar.g().h();
        weu weuVar = new weu();
        weuVar.a = this;
        String scheme = uri.getScheme();
        wfv wfvVar = (wfv) this.c.get(scheme);
        if (wfvVar == null) {
            throw new wfj(String.format("Requested backend isn't registered: %s", scheme));
        }
        weuVar.b = wfvVar;
        weuVar.d = this.a;
        weuVar.c = yfqVarH;
        weuVar.e = uri;
        if (!yfqVarH.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strB = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = yfqVarH.listIterator(yfqVarH.size());
                while (listIterator.hasPrevious()) {
                    strB = ((wga) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        weuVar.f = uri;
        return new rdx(weuVar);
    }

    public static nfh a() {
        return (nfh) mki.a.i(nfh.class);
    }

    public final int A() {
        return ((byd) this.b).e();
    }

    public final int B() {
        return ((byd) this.c).e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void C(izj izjVar) {
        ((CopyOnWriteArrayList) this.c).add(izjVar);
        this.a.run();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void D(izj izjVar) {
        ((CopyOnWriteArrayList) this.c).remove(izjVar);
        if (((ebe) this.b.remove(izjVar)) != null) {
            throw null;
        }
        this.a.run();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void b(mqc mqcVar, CarRegionId carRegionId) {
        if (mqcVar != null && this.c.add(Pair.create(carRegionId, mqcVar))) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_CONTEXT, yzy.tq);
            rrbVarH.p(mqcVar.a());
            rrbVarH.n(carRegionId);
            ohsVarJ.F(rrbVarH.l());
        }
    }

    public final boolean c(xyc xycVar) {
        if (((vpz) this.c).a().booleanValue()) {
            return ((vqe) this.b).c.a == 2;
        }
        return vqs.c((Context) this.a, (vqt) xycVar.gu());
    }

    public final Object d(Uri uri, wev wevVar) throws IOException {
        return wevVar.a(E(uri));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wfv] */
    public final void e(Uri uri) throws IOException {
        rdx rdxVarE = E(uri);
        rdxVarE.d.g((Uri) rdxVarE.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wfv] */
    public final void f(Uri uri, Uri uri2) throws IOException {
        rdx rdxVarE = E(uri);
        ?? r0 = rdxVarE.d;
        rdx rdxVarE2 = E(uri2);
        if (r0 != rdxVarE2.d) {
            throw new wfj("Cannot rename file across backends");
        }
        r0.h((Uri) rdxVarE.a, (Uri) rdxVarE2.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wfv] */
    public final boolean g(Uri uri) throws IOException {
        rdx rdxVarE = E(uri);
        return rdxVarE.d.f((Uri) rdxVarE.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afdr, java.lang.Object] */
    public final ProjectionWindowAnimationChoreography h(Intent intent, CarRegionId carRegionId, boolean z) {
        if (nsr.c().b().m() == nsv.e && affa.f(CarRegionId.a, carRegionId) && (intent.getFlags() & 1048576) == 0) {
            lgw lgwVarA = lem.a();
            ComponentName componentNameA = lgv.a().a(mpz.b);
            if (lgwVarA.i(componentNameA != null ? mpl.b(componentNameA) : null) && intent.getBooleanExtra("EXTRA_STARTED_BY_DASHBOARD", false)) {
                return (ProjectionWindowAnimationChoreography) this.b.invoke();
            }
            if (z) {
                return (ProjectionWindowAnimationChoreography) this.a.invoke();
            }
        }
        return null;
    }

    public final yfy i(nso nsoVar) {
        return yfy.l(CarRegionId.a, new ProjectionWindowAnimationParams(R.anim.coolwalk_app_switch_enter, false, null, 0), nsoVar.r((nsn) this.c), new ProjectionWindowAnimationParams(R.anim.coolwalk_no_op_app_switch_exit, false, null, 0));
    }

    public final void j(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((bt) ((izj) it.next()).a).Z(menu, menuInflater);
        }
    }

    public final void k(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((bt) ((izj) it.next()).a).ab(menu);
        }
    }

    public final boolean l(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (((bt) ((izj) it.next()).a).aa(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void m(dqo dqoVar) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.clear();
        int size = dqoVar.aL.size();
        for (int i = 0; i < size; i++) {
            dqn dqnVar = (dqn) dqoVar.aL.get(i);
            if (dqnVar.W() == 3 || dqnVar.X() == 3) {
                arrayList.add(dqnVar);
            }
        }
        dqoVar.c();
    }

    public final boolean n(dqx dqxVar, dqn dqnVar, int i) {
        dqw dqwVar = (dqw) this.b;
        dqwVar.i = dqnVar.W();
        dqwVar.j = dqnVar.X();
        dqwVar.a = dqnVar.j();
        dqwVar.b = dqnVar.h();
        dqwVar.g = false;
        dqwVar.h = i;
        int i2 = dqwVar.i;
        int i3 = dqwVar.j;
        boolean z = i2 == 3 && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
        boolean z2 = i3 == 3 && dqnVar.ah > BitmapDescriptorFactory.HUE_RED;
        if (z && dqnVar.E[0] == 4) {
            dqwVar.i = 1;
        }
        if (z2 && dqnVar.E[1] == 4) {
            dqwVar.j = 1;
        }
        dqxVar.b(dqnVar, dqwVar);
        dqnVar.M(dqwVar.c);
        dqnVar.B(dqwVar.d);
        dqnVar.P = dqwVar.f;
        dqnVar.x(dqwVar.e);
        dqwVar.h = 0;
        return dqwVar.g;
    }

    public final void o(dqo dqoVar, int i, int i2, int i3) {
        int i4 = dqoVar.am;
        int i5 = dqoVar.an;
        dqoVar.J(0);
        dqoVar.I(0);
        dqoVar.M(i2);
        dqoVar.B(i3);
        dqoVar.J(i4);
        dqoVar.I(i5);
        Object obj = this.a;
        ((dqo) obj).b = i;
        ((dqv) obj).ae();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final InputMethodManager p() {
        return (InputMethodManager) this.b.a();
    }

    public final void q(int i, int i2, int i3, int i4) {
        p().updateSelection((View) this.c, i, i2, i3, i4);
    }

    public final void r(dhr dhrVar, Object obj) {
        dhm dhmVar = new dhm(dhrVar);
        synchronized (this.c) {
            if (obj == null) {
                ((aan) this.a).m(dhmVar, new dhl(null));
            } else {
                ((zu) this.b).c(dhmVar, new dhl(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.dhr r6, defpackage.afec r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dhn
            if (r0 == 0) goto L13
            r0 = r8
            dhn r0 = (defpackage.dhn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dhn r0 = new dhn
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dhm r6 = r0.c
            defpackage.woy.dF(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r8)
            dhm r8 = new dhm
            r8.<init>(r6)
            java.lang.Object r6 = r5.c
            monitor-enter(r6)
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L8b
            zu r2 = (defpackage.zu) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.b(r8)     // Catch: java.lang.Throwable -> L8b
            dhl r2 = (defpackage.dhl) r2     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L52
            java.lang.Object r2 = r5.a     // Catch: java.lang.Throwable -> L8b
            aan r2 = (defpackage.aan) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8b
            dhl r2 = (defpackage.dhl) r2     // Catch: java.lang.Throwable -> L8b
        L52:
            if (r2 == 0) goto L58
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r6)
            return r5
        L58:
            monitor-exit(r6)
            r0.c = r8
            r0.b = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 == r1) goto L8a
            r4 = r8
            r8 = r6
            r6 = r4
        L66:
            java.lang.Object r7 = r5.c
            monitor-enter(r7)
            if (r8 != 0) goto L79
            java.lang.Object r5 = r5.a     // Catch: java.lang.Throwable -> L87
            dhl r0 = new dhl     // Catch: java.lang.Throwable -> L87
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L87
            aan r5 = (defpackage.aan) r5     // Catch: java.lang.Throwable -> L87
            r5.m(r6, r0)     // Catch: java.lang.Throwable -> L87
            goto L85
        L79:
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L87
            dhl r0 = new dhl     // Catch: java.lang.Throwable -> L87
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L87
            zu r5 = (defpackage.zu) r5     // Catch: java.lang.Throwable -> L87
            r5.c(r6, r0)     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r7)
            return r8
        L87:
            r5 = move-exception
            monitor-exit(r7)
            throw r5
        L8a:
            return r1
        L8b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfh.s(dhr, afec, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bym, java.lang.Object] */
    public final boolean t() {
        if (this.b.a() != this.c) {
            return true;
        }
        Object obj = this.a;
        return obj != null && ((nfh) obj).t();
    }

    public final boolean u() {
        return (((cwf) this.a).d() && ((cwf) this.c).d() && ((cwf) this.b).d()) ? false : true;
    }

    public final boolean v(cxb cxbVar) {
        return cxbVar.j != null && (((cwf) this.a).c(cxbVar) || ((cwf) this.b).c(cxbVar));
    }

    public final void w(cxb cxbVar) {
        ((cwf) this.a).e(cxbVar);
        ((cwf) this.b).e(cxbVar);
        ((cwf) this.c).e(cxbVar);
    }

    public final void x(cxb cxbVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ((cwf) this.a).b(cxbVar);
            ((cwf) this.c).b(cxbVar);
            return;
        }
        if (i2 == 1) {
            ((cwf) this.b).b(cxbVar);
            ((cwf) this.c).b(cxbVar);
        } else {
            if (i2 != 2) {
                if (cxbVar.j != null) {
                    ((cwf) this.c).b(cxbVar);
                    return;
                } else {
                    ((cwf) this.b).b(cxbVar);
                    return;
                }
            }
            if (cxbVar.j != null) {
                ((cwf) this.c).b(cxbVar);
            } else {
                ((cwf) this.a).b(cxbVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [azh, java.lang.Object] */
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        azf azfVar = (azf) ((aan) this.a).a(obj);
        if (azfVar != null) {
            return azfVar.b;
        }
        ?? Invoke = this.c.invoke();
        int iA = Invoke.a(obj);
        if (iA == -1) {
            return null;
        }
        return Invoke.c(iA);
    }

    public final afeg z(int i, Object obj, Object obj2) {
        aan aanVar = (aan) this.a;
        azf azfVar = (azf) aanVar.a(obj);
        if (azfVar != null && azfVar.c == i && affa.f(azfVar.b, obj2)) {
            return azfVar.a();
        }
        azf azfVar2 = new azf(this, i, obj, obj2);
        aanVar.m(obj, azfVar2);
        return azfVar2.a();
    }

    public nfh(nsn nsnVar) {
        this.c = nsnVar;
        this.b = new deh(this, 17);
        this.a = new deh(this, 18);
    }

    public nfh() {
        this.c = Collections.newSetFromMap(new nfg());
        yph yphVar = mpd.a;
        mpc mpcVar = ((mpd) mki.a.i(mpd.class)).h;
        this.b = mpcVar;
        ComponentName componentName = nxo.a;
        eqm eqmVar = ((nxo) mki.a.i(nxo.class)).b;
        mqc mqcVar = new mqc(nxo.a, mpz.f);
        afco afcoVar = tby.a;
        eqj eqjVarA = eqy.a(tby.s(eqmVar, new eqm(mqcVar), eqy.b(mpcVar, new ltd(CarRegionId.a, 9))));
        this.a = eqjVarA;
        mpcVar.fE((lhm) mki.a.i(lhm.class), new kkl(this, 4));
        eqjVarA.fE((lhm) mki.a.i(lhm.class), new kkl(this, 5));
    }

    public nfh(int i, int i2) {
        this.b = new ParcelableSnapshotMutableIntState(i);
        this.c = new ParcelableSnapshotMutableIntState(i2);
        this.a = new azo(i, 90, 200);
    }

    public nfh(abms abmsVar, String str, String str2) {
        this.b = ytq.e;
        this.a = wub.L(new jbk(this, abmsVar, 10, null));
        this.c = wub.L(new qei(this, str, str2, 2));
    }

    public nfh(cdm cdmVar, afdr afdrVar) {
        this.b = cdmVar;
        this.c = afdrVar;
        long[] jArr = aao.a;
        this.a = new aan(6);
    }

    public nfh(Context context, vqe vqeVar, aezk aezkVar) {
        this.a = context;
        this.b = vqeVar;
        this.c = aezkVar;
    }

    public nfh(afdr afdrVar) {
        this.c = new cco();
        this.a = new ccq();
        this.b = new bws(this, afdrVar, 0);
    }

    public nfh(char[] cArr, byte[] bArr) {
        this.a = new cwf();
        this.b = new cwf();
        this.c = new cwf();
    }

    public nfh(bym bymVar, nfh nfhVar) {
        this.b = bymVar;
        this.a = nfhVar;
        this.c = bymVar.a();
    }

    public nfh(byte[] bArr, byte[] bArr2) {
        this.b = new zu(16);
        long[] jArr = aao.a;
        this.a = new aan(6);
        this.c = new dka();
    }

    public nfh(View view) {
        this.c = view;
        this.b = woy.dH(3, new deh(this, 4));
        this.a = new kwp(view);
    }

    public nfh(char[] cArr) {
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
    }

    public nfh(dqo dqoVar) {
        this.c = new ArrayList();
        this.b = new dqw();
        this.a = dqoVar;
    }

    public nfh(Runnable runnable) {
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.a = runnable;
    }
}
