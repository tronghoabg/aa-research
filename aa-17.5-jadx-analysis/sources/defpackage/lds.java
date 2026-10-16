package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class lds {
    public final Object a;

    public lds(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ecd(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new ecb(i, interpolator, j);
        }
    }

    public static void V(View view, ebx ebxVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(ebxVar != null ? new ecc(ebxVar) : null);
            return;
        }
        Interpolator interpolator = ecb.a;
        View.OnApplyWindowInsetsListener ecaVar = ebxVar != null ? new eca(view, ebxVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, ecaVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(ecaVar);
        }
    }

    public static lds a() {
        return (lds) mki.a.i(lds.class);
    }

    public static int n(abos abosVar, Object obj, Object obj2) {
        return abnl.a((abqd) abosVar.c, 1, obj) + abnl.a((abqd) abosVar.d, 2, obj2);
    }

    public static void o(abnd abndVar, abos abosVar, Object obj, Object obj2) throws IOException {
        abnl.f(abndVar, (abqd) abosVar.c, 1, obj);
        abnl.f(abndVar, (abqd) abosVar.d, 2, obj2);
    }

    public final void A(int i, Object obj) throws IOException {
        boolean z = obj instanceof abms;
        Object obj2 = this.a;
        if (z) {
            ((abnd) obj2).q(i, (abms) obj);
        } else {
            ((abnd) obj2).p(i, (abow) obj);
        }
    }

    public final void B(int i, int i2) throws IOException {
        ((abnd) this.a).i(i, i2);
    }

    public final void C(int i, long j) throws IOException {
        ((abnd) this.a).k(i, j);
    }

    public final void D(int i, int i2) throws IOException {
        ((abnd) this.a).u(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void E(int i, long j) throws IOException {
        ((abnd) this.a).w(i, (j >> 63) ^ (j + j));
    }

    public final void F(int i, String str) throws IOException {
        ((abnd) this.a).r(i, str);
    }

    public final void G(int i, int i2) throws IOException {
        ((abnd) this.a).u(i, i2);
    }

    public final void H(int i, long j) throws IOException {
        ((abnd) this.a).w(i, j);
    }

    public final synchronized void I(int i) {
        Object obj = this.a;
        Integer num = (Integer) ((SparseArray) obj).get(i);
        ((SparseArray) obj).put(i, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
    }

    public final synchronized void J(jfg jfgVar) {
        int i = 0;
        while (true) {
            Object obj = this.a;
            if (i < ((SparseArray) obj).size()) {
                int iKeyAt = ((SparseArray) obj).keyAt(i);
                int iIntValue = ((Integer) ((SparseArray) obj).valueAt(i)).intValue();
                if (iIntValue > 0) {
                    yzy yzyVar = (yzy) jep.b.get(Integer.valueOf(iKeyAt));
                    yzyVar.getClass();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_SENSOR, yzyVar);
                    rrbVarH.w(iIntValue);
                    jfgVar.b((rrc) rrbVarH.l());
                }
                i++;
            } else {
                ((SparseArray) obj).clear();
            }
        }
    }

    public final jhf K() {
        imz imzVar = (imz) this.a;
        if (imzVar.isEmpty()) {
            return null;
        }
        return (jhf) imzVar.peek();
    }

    public final jhf L(imy imyVar) {
        jhf jhfVar;
        do {
            imz imzVar = (imz) this.a;
            if (imzVar.isEmpty()) {
                return null;
            }
            jhfVar = (jhf) imzVar.pop();
        } while (!imyVar.a(jhfVar));
        return jhfVar;
    }

    public final void M(jhf jhfVar) {
        ((imz) this.a).push(jhfVar);
    }

    public final void N(jhf jhfVar) {
        ((imz) this.a).remove(jhfVar);
    }

    public final boolean O(jhf jhfVar) {
        return jhfVar == K();
    }

    public final Object P() {
        return ((WeakReference) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void Q() {
        ?? r2 = this.a;
        int size = r2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((czd) ((izj) ((ArrayList) r2).get(size)).a).e();
            }
        }
    }

    public final float R() {
        return ((ece) this.a).g();
    }

    public final float S() {
        return ((ece) this.a).h();
    }

    public final int T() {
        return ((ece) this.a).i();
    }

    public final long U() {
        return ((ece) this.a).j();
    }

    public final void W(float f) {
        ((ece) this.a).k(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(defpackage.dhr r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhf
            if (r0 == 0) goto L13
            r0 = r7
            dhf r0 = (defpackage.dhf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhf r0 = new dhf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)
            goto L7d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.woy.dF(r7)
            return r7
        L38:
            defpackage.woy.dF(r7)
            boolean r7 = r6 instanceof defpackage.dhe
            if (r7 == 0) goto L51
            dhe r6 = (defpackage.dhe) r6
            dhd r7 = r6.a
            java.lang.Object r5 = r5.a
            r0.c = r4
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r5 = r7.b(r5, r6, r0)
            if (r5 != r1) goto L50
            goto L7c
        L50:
            return r5
        L51:
            boolean r7 = r6 instanceof defpackage.dii
            if (r7 == 0) goto L8e
            r7 = r6
            dii r7 = (defpackage.dii) r7
            java.lang.Object r2 = r5.a
            r0.a = r6
            r0.c = r3
            aitg r3 = new aitg
            afck r0 = defpackage.affa.s(r0)
            r3.<init>(r0, r4)
            r3.z()
            int r0 = r7.a
            dhg r4 = new dhg
            r4.<init>(r3, r7)
            android.content.Context r2 = (android.content.Context) r2
            defpackage.dvb.c(r2, r0, r4)
            java.lang.Object r7 = r3.k()
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            dii r6 = (defpackage.dii) r6
            dic r6 = r6.b
            java.lang.Object r5 = r5.a
            int r0 = defpackage.dij.a
            android.content.Context r5 = (android.content.Context) r5
            android.graphics.Typeface r5 = defpackage.dij.a(r7, r6, r5)
            return r5
        L8e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unknown font type: "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lds.X(dhr, afck):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object Y(dhr dhrVar) {
        if (dhrVar instanceof dhe) {
            dhe dheVar = (dhe) dhrVar;
            return dheVar.a.a((Context) this.a, dheVar);
        }
        if (!(dhrVar instanceof dii)) {
            return null;
        }
        dii diiVar = (dii) dhrVar;
        int i = diiVar.c;
        Object obj = this.a;
        int i2 = diiVar.a;
        int i3 = dvb.a;
        Context context = (Context) obj;
        Typeface typefaceD = context.isRestricted() ? null : dvb.d(context, i2, new TypedValue(), 0, null, false, false);
        typefaceD.getClass();
        dic dicVar = diiVar.b;
        int i4 = dij.a;
        return dij.a(typefaceD, dicVar, context);
    }

    public final void Z() {
        synchronized (this) {
            ((zh) this.a).f();
        }
    }

    public final void b(boolean z) {
        ((AtomicBoolean) this.a).set(z);
    }

    public final boolean c() {
        return ((AtomicBoolean) this.a).get();
    }

    public final boolean d() {
        return ((CarUiInfo) this.a).a;
    }

    public final boolean e() {
        return ((CarUiInfo) this.a).d;
    }

    public final boolean f() {
        return ((CarUiInfo) this.a).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r2) throws defpackage.qrz, defpackage.qsa {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1853877803: goto Lba;
                case -1367610710: goto La5;
                case -905948230: goto L90;
                case 3237038: goto L7b;
                case 93166550: goto L6a;
                case 371381096: goto L55;
                case 1554862541: goto L3f;
                case 1643637855: goto L2d;
                case 1830376762: goto L1b;
                case 1837886952: goto L9;
                default: goto L7;
            }
        L7:
            goto Lcb
        L9:
            java.lang.String r0 = "car_bluetooth_conn"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            roa r1 = defpackage.ols.j(r1)
            goto Lcc
        L1b:
            java.lang.String r0 = "app_focus"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            roe r1 = defpackage.ols.s(r1)
            goto Lcc
        L2d:
            java.lang.String r0 = "car_call_service"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            qrh r1 = defpackage.ols.k(r1)
            goto Lcc
        L3f:
            java.lang.String r0 = "car_display_service"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rce r1 = r1.a()
            rjt r1 = r1.f()
            goto Lcc
        L55:
            java.lang.String r0 = "car_control_service"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rce r1 = r1.a()
            rij r1 = r1.e()
            goto Lcc
        L6a:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rnx r1 = defpackage.ols.i(r1)
            goto Lcc
        L7b:
            java.lang.String r0 = "info"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rce r1 = r1.a()
            rod r1 = r1.v()
            goto Lcc
        L90:
            java.lang.String r0 = "sensor"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rce r1 = r1.a()
            roj r1 = r1.y()
            goto Lcc
        La5:
            java.lang.String r0 = "car_1p"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rce r1 = r1.a()
            roc r1 = r1.u()
            goto Lcc
        Lba:
            java.lang.String r0 = "car_navigation_service"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r1.a
            qrn r1 = (defpackage.qrn) r1
            rog r1 = defpackage.oni.e(r1)
            goto Lcc
        Lcb:
            r1 = 0
        Lcc:
            if (r1 == 0) goto Lcf
            return r1
        Lcf:
            java.lang.String r1 = "could not find a manager for the given serviceName:  serviceName = "
            java.lang.String r1 = r1.concat(r2)
            qsa r2 = new qsa
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lds.g(java.lang.String):java.lang.Object");
    }

    public final rob h(int i) throws qrz, qsa {
        return ((qrn) this.a).a().t(new CarDisplayId(i));
    }

    public final int i() {
        long j = ((ajcs) ((aisx) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object j() {
        while (true) {
            aisx aisxVar = (aisx) this.a;
            ajcs ajcsVar = (ajcs) aisxVar.a;
            Object objB = ajcsVar.b();
            if (objB != ajcs.a) {
                return objB;
            }
            aisxVar.d(ajcsVar, ajcsVar.c());
        }
    }

    public final void k() {
        while (true) {
            aisx aisxVar = (aisx) this.a;
            ajcs ajcsVar = (ajcs) aisxVar.a;
            if (ajcsVar.d()) {
                return;
            } else {
                aisxVar.d(ajcsVar, ajcsVar.c());
            }
        }
    }

    public final boolean l(Object obj) {
        while (true) {
            aisx aisxVar = (aisx) this.a;
            ajcs ajcsVar = (ajcs) aisxVar.a;
            int iA = ajcsVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            aisxVar.d(ajcsVar, ajcsVar.c());
        }
    }

    public final aisx m(int i) {
        return ((aisx[]) this.a)[i];
    }

    public final void p(int i, boolean z) throws IOException {
        ((abnd) this.a).f(i, z);
    }

    public final void q(int i, abms abmsVar) throws IOException {
        ((abnd) this.a).g(i, abmsVar);
    }

    public final void r(int i, double d) throws IOException {
        ((abnd) this.a).J(i, d);
    }

    public final void s(int i, int i2) throws IOException {
        ((abnd) this.a).m(i, i2);
    }

    public final void t(int i, int i2) throws IOException {
        ((abnd) this.a).i(i, i2);
    }

    public final void u(int i, long j) throws IOException {
        ((abnd) this.a).k(i, j);
    }

    public final void v(int i, float f) throws IOException {
        ((abnd) this.a).L(i, f);
    }

    public final void w(int i, Object obj, abpl abplVar) throws IOException {
        abnd abndVar = (abnd) this.a;
        abndVar.t(i, 3);
        abplVar.m((abmd) obj, this);
        abndVar.t(i, 4);
    }

    public final void x(int i, int i2) throws IOException {
        ((abnd) this.a).m(i, i2);
    }

    public final void y(int i, long j) throws IOException {
        ((abnd) this.a).w(i, j);
    }

    public final void z(int i, Object obj, abpl abplVar) throws IOException {
        abmd abmdVar = (abmd) obj;
        abnd abndVar = (abnd) this.a;
        abndVar.t(i, 2);
        abndVar.v(abmdVar.e(abplVar));
        abplVar.m(abmdVar, this);
    }

    public lds(abqd abqdVar, Object obj, abqd abqdVar2, Object obj2) {
        this.a = new abos(abqdVar, obj, abqdVar2, obj2);
    }

    public lds(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public lds(int i) {
        aisx[] aisxVarArr = new aisx[i];
        for (int i2 = 0; i2 < i; i2++) {
            aisxVarArr[i2] = new aisx(null, aisy.a);
        }
        this.a = aisxVarArr;
    }

    public lds(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new zh(6);
    }

    public lds(Context context) {
        this.a = context.getApplicationContext();
    }

    public lds(abnd abndVar) {
        this.a = abndVar;
        abndVar.a = this;
    }

    public lds(char[] cArr) {
        this.a = new aisx(new ajcs(8, false), aisy.a);
    }

    public lds(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0L);
        this.a = new ecd(windowInsetsAnimation);
    }

    public lds(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public lds(Object obj) {
        this.a = new WeakReference(obj);
    }

    public lds(byte[] bArr, byte[] bArr2) {
        this.a = new imz();
    }

    public lds(short[] sArr) {
        this.a = new SparseArray();
    }

    public lds() {
        this.a = new AtomicBoolean();
    }

    public lds(byte[] bArr) {
        this.a = new HashMap();
    }

    public lds(qrn qrnVar) {
        this.a = qrnVar;
        new ConcurrentHashMap();
    }
}
