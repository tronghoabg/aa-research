package C6;

import A7.C0295v;
import Af.q;
import E5.H0;
import E5.I;
import E5.J0;
import E5.Q;
import E5.n0;
import E5.q0;
import G6.L;
import K8.C0690b;
import K8.M;
import L8.r;
import L8.t;
import L8.u;
import N1.C0765n;
import N1.N;
import Pc.C0799o;
import Pc.C0800p;
import Q1.x;
import S3.s;
import U1.C0850u;
import U1.P;
import W9.o;
import Y2.B;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import b1.AbstractC1492a;
import c7.C1566b;
import c7.C1568d;
import c7.C1575k;
import c7.C1576l;
import c7.ExecutorC1572h;
import com.applovin.impl.T0;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.M0;
import com.wynauto.wyn.R;
import f6.C2613z;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.H;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import l8.j0;
import l9.InterfaceC3447c;
import p7.C3773c;
import p9.EnumC3784e;
import q.AbstractC3827n0;
import q.C3830p;
import q.O0;
import q.e1;
import r9.S;
import u6.v;

/* loaded from: classes3.dex */
public final class l implements L8.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1844a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1845b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1846c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1847d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1848e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1849f;

    public l(Context context, String str) {
        String strConcat;
        this.f1844a = context.getApplicationContext();
        this.f1845b = str;
        this.f1849f = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = C3773c.a(context).c(0, context.getPackageName()).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            strConcat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e7) {
            int i5 = L.f4523b;
            H6.l.d("Unable to get package version name for reporting", e7);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f1848e = strConcat;
    }

    public static void C(Drawable drawable, int i5, PorterDuff.Mode mode) {
        int[] iArr = AbstractC3827n0.f43839a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C3830p.f43864b;
        }
        drawableMutate.setColorFilter(C3830p.c(i5, mode));
    }

    public static boolean l(int i5, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i5) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList n(Context context, int i5) {
        int iC = e1.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{e1.f43762b, e1.f43764d, e1.f43763c, e1.f43766f}, new int[]{e1.b(context, R.attr.colorButtonNormal), AbstractC1492a.b(iC, i5), AbstractC1492a.b(iC, i5), i5});
    }

    public static C2613z q(I i5, AbstractC3409K abstractC3409K, C2613z c2613z, H0 h02) {
        int iB;
        J0 j0O0 = i5.o0();
        i5.Q0();
        if (i5.f3089j0.f3499a.p()) {
            iB = 0;
        } else {
            q0 q0Var = i5.f3089j0;
            iB = q0Var.f3499a.b(q0Var.f3500b.f35112a);
        }
        Object objL = j0O0.p() ? null : j0O0.l(iB);
        int iB2 = (i5.x0() || j0O0.p()) ? -1 : j0O0.f(iB, h02, false).b(v.y(i5.m0()) - h02.f3043e);
        for (int i10 = 0; i10 < abstractC3409K.size(); i10++) {
            C2613z c2613z2 = (C2613z) abstractC3409K.get(i10);
            if (v(c2613z2, objL, i5.x0(), i5.j0(), i5.k0(), iB2)) {
                return c2613z2;
            }
        }
        if (abstractC3409K.isEmpty() && c2613z != null && v(c2613z, objL, i5.x0(), i5.j0(), i5.k0(), iB2)) {
            return c2613z;
        }
        return null;
    }

    public static H r(C0850u c0850u, AbstractC3409K abstractC3409K, H h10, N1.L l10) {
        int iB;
        N nO0 = c0850u.o0();
        c0850u.S0();
        if (c0850u.f12152d0.f11977a.p()) {
            iB = 0;
        } else {
            P p10 = c0850u.f12152d0;
            iB = p10.f11977a.b(p10.f11978b.f38903a);
        }
        Object objL = nO0.p() ? null : nO0.l(iB);
        int iB2 = (c0850u.v0() || nO0.p()) ? -1 : nO0.f(iB, l10, false).b(x.K(c0850u.m0()) - l10.f8052e);
        for (int i5 = 0; i5 < abstractC3409K.size(); i5++) {
            H h11 = (H) abstractC3409K.get(i5);
            if (w(h11, objL, c0850u.v0(), c0850u.j0(), c0850u.k0(), iB2)) {
                return h11;
            }
        }
        if (abstractC3409K.isEmpty() && h10 != null && w(h10, objL, c0850u.v0(), c0850u.j0(), c0850u.k0(), iB2)) {
            return h10;
        }
        return null;
    }

    public static LayerDrawable s(O0 o02, Context context, int i5) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i5);
        Drawable drawableF = o02.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = o02.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean v(C2613z c2613z, Object obj, boolean z2, int i5, int i10, int i11) {
        if (!c2613z.f35112a.equals(obj)) {
            return false;
        }
        int i12 = c2613z.f35113b;
        if (z2 && i12 == i5 && c2613z.f35114c == i10) {
            return true;
        }
        return !z2 && i12 == -1 && c2613z.f35116e == i11;
    }

    public static boolean w(H h10, Object obj, boolean z2, int i5, int i10, int i11) {
        if (!h10.f38903a.equals(obj)) {
            return false;
        }
        int i12 = h10.f38904b;
        if (z2 && i12 == i5 && h10.f38905c == i10) {
            return true;
        }
        return !z2 && i12 == -1 && h10.f38907e == i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.l.A(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Set B(Class cls) {
        return e(t.a(cls));
    }

    public Task D(String str, String str2, Bundle bundle) {
        int i5;
        try {
            A(str, str2, bundle);
            C1566b c1566b = (C1566b) this.f1846c;
            M2.e eVar = c1566b.f19676c;
            int iE = eVar.e();
            ExecutorC1572h executorC1572h = ExecutorC1572h.f19689c;
            if (iE < 12000000) {
                return eVar.f() != 0 ? c1566b.a(bundle).continueWithTask(executorC1572h, new X2.j(7, c1566b, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C1576l c1576lK = C1576l.k(c1566b.f19675b);
            synchronized (c1576lK) {
                i5 = c1576lK.f19705a;
                c1576lK.f19705a = i5 + 1;
            }
            return c1576lK.l(new C1575k(i5, 1, bundle, 1)).continueWith(executorC1572h, C1568d.f19682b);
        } catch (InterruptedException | ExecutionException e7) {
            return Tasks.forException(e7);
        }
    }

    public void E(J0 j02) {
        E4.n nVar = new E4.n(4, 18);
        if (((AbstractC3409K) this.f1845b).isEmpty()) {
            j(nVar, (C2613z) this.f1848e, j02);
            if (!Fe.b.v((C2613z) this.f1849f, (C2613z) this.f1848e)) {
                j(nVar, (C2613z) this.f1849f, j02);
            }
            if (!Fe.b.v((C2613z) this.f1847d, (C2613z) this.f1848e) && !Fe.b.v((C2613z) this.f1847d, (C2613z) this.f1849f)) {
                j(nVar, (C2613z) this.f1847d, j02);
            }
        } else {
            for (int i5 = 0; i5 < ((AbstractC3409K) this.f1845b).size(); i5++) {
                j(nVar, (C2613z) ((AbstractC3409K) this.f1845b).get(i5), j02);
            }
            if (!((AbstractC3409K) this.f1845b).contains((C2613z) this.f1847d)) {
                j(nVar, (C2613z) this.f1847d, j02);
            }
        }
        this.f1846c = nVar.e();
    }

    public void F(N n10) {
        E4.n nVar = new E4.n(4, 18);
        if (((AbstractC3409K) this.f1845b).isEmpty()) {
            k(nVar, (H) this.f1848e, n10);
            if (!Fe.b.v((H) this.f1849f, (H) this.f1848e)) {
                k(nVar, (H) this.f1849f, n10);
            }
            if (!Fe.b.v((H) this.f1847d, (H) this.f1848e) && !Fe.b.v((H) this.f1847d, (H) this.f1849f)) {
                k(nVar, (H) this.f1847d, n10);
            }
        } else {
            for (int i5 = 0; i5 < ((AbstractC3409K) this.f1845b).size(); i5++) {
                k(nVar, (H) ((AbstractC3409K) this.f1845b).get(i5), n10);
            }
            if (!((AbstractC3409K) this.f1845b).contains((H) this.f1847d)) {
                k(nVar, (H) this.f1847d, n10);
            }
        }
        this.f1846c = nVar.e();
    }

    public Task G(String str, Boolean bool) {
        Task taskJ;
        if (zzag.zzc(str)) {
            str = "*";
        }
        if (!bool.booleanValue() && (taskJ = J(str)) != null) {
            return taskJ;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1848e;
        return firebaseAuth.f27287e.zza(firebaseAuth.k, "RECAPTCHA_ENTERPRISE").continueWithTask(new s(11, (Object) this, str));
    }

    public Task H(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        if (zzag.zzc(str)) {
            str = "*";
        }
        Task taskJ = J(str);
        if (bool.booleanValue() || taskJ == null) {
            taskJ = G(str, bool);
        }
        return taskJ.continueWithTask(new C0690b(recaptchaAction, 5));
    }

    public boolean I() {
        String strZzb;
        zzagm zzagmVar = (zzagm) this.f1846c;
        if (zzagmVar == null || (strZzb = zzagmVar.zzb("PHONE_PROVIDER")) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }

    public Task J(String str) {
        Task task;
        synchronized (this.f1844a) {
            task = (Task) ((HashMap) this.f1845b).get(str);
        }
        return task;
    }

    @Override // L8.c
    public Object a(Class cls) {
        if (((Set) this.f1844a).contains(t.a(cls))) {
            Object objA = ((L8.c) this.f1849f).a(cls);
            return !cls.equals(InterfaceC3447c.class) ? objA : new u((Set) this.f1848e, (InterfaceC3447c) objA);
        }
        throw new Q("Attempting to request an undeclared dependency " + cls + ".", 3);
    }

    @Override // L8.c
    public Object b(t tVar) {
        if (((Set) this.f1844a).contains(tVar)) {
            return ((L8.c) this.f1849f).b(tVar);
        }
        throw new Q("Attempting to request an undeclared dependency " + tVar + ".", 3);
    }

    @Override // L8.c
    public O9.b c(Class cls) {
        return f(t.a(cls));
    }

    @Override // L8.c
    public r d(t tVar) {
        if (((Set) this.f1846c).contains(tVar)) {
            return ((L8.c) this.f1849f).d(tVar);
        }
        throw new Q("Attempting to request an undeclared dependency Deferred<" + tVar + ">.", 3);
    }

    @Override // L8.c
    public Set e(t tVar) {
        if (((Set) this.f1847d).contains(tVar)) {
            return ((L8.c) this.f1849f).e(tVar);
        }
        throw new Q("Attempting to request an undeclared dependency Set<" + tVar + ">.", 3);
    }

    @Override // L8.c
    public O9.b f(t tVar) {
        if (((Set) this.f1845b).contains(tVar)) {
            return ((L8.c) this.f1849f).f(tVar);
        }
        throw new Q("Attempting to request an undeclared dependency Provider<" + tVar + ">.", 3);
    }

    @Override // L8.c
    public r g(Class cls) {
        return d(t.a(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(lf.AbstractC3464c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.acm.eventprocessing.g
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.acm.eventprocessing.g r0 = (com.moloco.sdk.acm.eventprocessing.g) r0
            int r1 = r0.f28400e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28400e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.g r0 = new com.moloco.sdk.acm.eventprocessing.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28398c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28400e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Nf.d r1 = r0.f28397b
            C6.l r0 = r0.f28396a
            Fe.e.U(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            Fe.e.U(r5)
            r0.f28396a = r4
            java.lang.Object r5 = r4.f1849f
            Nf.d r5 = (Nf.d) r5
            r0.f28397b = r5
            r0.f28400e = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r4
            r1 = r5
        L49:
            r5 = 0
            java.lang.Object r2 = r0.f1848e     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L57
            r3 = 0
            r2.cancel(r3)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L60
        L57:
            r0.i()     // Catch: java.lang.Throwable -> L55
            ef.C r0 = ef.C2515C.f34653a     // Catch: java.lang.Throwable -> L55
            r1.a(r5)
            return r0
        L60:
            r1.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.l.h(lf.c):java.lang.Object");
    }

    public void i() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f1848e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            com.applovin.adview.a aVar = new com.applovin.adview.a(this, 10);
            long j8 = ((com.moloco.sdk.acm.n) this.f1845b).f28457c;
            this.f1848e = ((ScheduledExecutorService) this.f1846c).scheduleWithFixedDelay(aVar, j8, j8, TimeUnit.SECONDS);
        }
    }

    public void j(E4.n nVar, C2613z c2613z, J0 j02) {
        if (c2613z == null) {
            return;
        }
        if (j02.b(c2613z.f35112a) != -1) {
            nVar.v(c2613z, j02);
            return;
        }
        J0 j03 = (J0) ((j0) this.f1846c).get(c2613z);
        if (j03 != null) {
            nVar.v(c2613z, j03);
        }
    }

    public void k(E4.n nVar, H h10, N n10) {
        if (h10 == null) {
            return;
        }
        if (n10.b(h10.f38903a) != -1) {
            nVar.v(h10, n10);
            return;
        }
        N n11 = (N) ((j0) this.f1846c).get(h10);
        if (n11 != null) {
            nVar.v(h10, n11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(lf.AbstractC3464c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.acm.eventprocessing.i
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.acm.eventprocessing.i r0 = (com.moloco.sdk.acm.eventprocessing.i) r0
            int r1 = r0.f28406e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28406e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.i r0 = new com.moloco.sdk.acm.eventprocessing.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28404c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28406e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Nf.d r1 = r0.f28403b
            C6.l r0 = r0.f28402a
            Fe.e.U(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            Fe.e.U(r5)
            r0.f28402a = r4
            java.lang.Object r5 = r4.f1849f
            Nf.d r5 = (Nf.d) r5
            r0.f28403b = r5
            r0.f28406e = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r4
            r1 = r5
        L49:
            r5 = 0
            r0.i()     // Catch: java.lang.Throwable -> L53
            ef.C r0 = ef.C2515C.f34653a     // Catch: java.lang.Throwable -> L53
            r1.a(r5)
            return r0
        L53:
            r0 = move-exception
            r1.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.l.m(lf.c):java.lang.Object");
    }

    public v9.u o(int i5) {
        HashMap map = (HashMap) this.f1845b;
        v9.u uVar = (v9.u) map.get(Integer.valueOf(i5));
        if (uVar != null) {
            return uVar;
        }
        v9.u uVar2 = new v9.u();
        map.put(Integer.valueOf(i5), uVar2);
        return uVar2;
    }

    public Task p(Task task) {
        return task.continueWith(new T0(1), new S8.b(this, 12));
    }

    public ColorStateList t(Context context, int i5) {
        if (i5 == R.drawable.abc_edit_text_material) {
            return Y0.e.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i5 == 2131230836) {
            return Y0.e.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i5 != R.drawable.abc_switch_thumb_material) {
            if (i5 == R.drawable.abc_btn_default_mtrl_shape) {
                return n(context, e1.c(context, R.attr.colorButtonNormal));
            }
            if (i5 == R.drawable.abc_btn_borderless_material) {
                return n(context, 0);
            }
            if (i5 == R.drawable.abc_btn_colored_material) {
                return n(context, e1.c(context, R.attr.colorAccent));
            }
            if (i5 == 2131230831 || i5 == R.drawable.abc_spinner_textfield_background_material) {
                return Y0.e.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (l(i5, (int[]) this.f1845b)) {
                return e1.d(context, R.attr.colorControlNormal);
            }
            if (l(i5, (int[]) this.f1848e)) {
                return Y0.e.getColorStateList(context, R.color.abc_tint_default);
            }
            if (l(i5, (int[]) this.f1849f)) {
                return Y0.e.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i5 == R.drawable.abc_seekbar_thumb_material) {
                return Y0.e.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = e1.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = e1.f43762b;
            iArr2[0] = e1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = e1.f43765e;
            iArr2[1] = e1.c(context, R.attr.colorControlActivated);
            iArr[2] = e1.f43766f;
            iArr2[2] = e1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = e1.f43762b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = e1.f43765e;
            iArr2[1] = e1.c(context, R.attr.colorControlActivated);
            iArr[2] = e1.f43766f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean u(int i5) {
        return x(i5) != null;
    }

    public S x(int i5) {
        v9.u uVar = (v9.u) ((HashMap) this.f1845b).get(Integer.valueOf(i5));
        if (uVar == null || uVar.f47117a == 0) {
            return (S) ((HashMap) ((n0) this.f1844a).f3474d).get(Integer.valueOf(i5));
        }
        return null;
    }

    public void y(int i5, s9.h hVar, s9.k kVar) {
        if (u(i5)) {
            v9.u uVarO = o(i5);
            boolean zA = ((ad.L) ((n0) this.f1844a).f3472b).p(i5).f19805a.a(hVar);
            HashMap map = uVarO.f47118b;
            if (zA) {
                EnumC3784e enumC3784e = EnumC3784e.f43347a;
                uVarO.f47119c = true;
                map.put(hVar, enumC3784e);
            } else {
                uVarO.f47119c = true;
                map.remove(hVar);
            }
            Set hashSet = (Set) ((HashMap) this.f1847d).get(hVar);
            if (hashSet == null) {
                hashSet = new HashSet();
                ((HashMap) this.f1847d).put(hVar, hashSet);
            }
            hashSet.add(Integer.valueOf(i5));
            if (kVar != null) {
                ((HashMap) this.f1846c).put(hVar, kVar);
            }
        }
    }

    public void z(int i5) {
        HashMap map = (HashMap) this.f1845b;
        A6.c.z(map.get(Integer.valueOf(i5)) != null && ((v9.u) map.get(Integer.valueOf(i5))).f47117a == 0, "Should only reset active targets", new Object[0]);
        map.put(Integer.valueOf(i5), new v9.u());
        Iterator it = ((ad.L) ((n0) this.f1844a).f3472b).p(i5).iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return;
            } else {
                y(i5, (s9.h) c0295v.next(), null);
            }
        }
    }

    public l(com.moloco.sdk.internal.services.events.c customUserEventBuilderService, List list, List list2, List list3) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s();
        L0 vastTracker = M0.a();
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(vastTracker, "vastTracker");
        this.f1844a = customUserEventBuilderService;
        this.f1845b = list;
        this.f1846c = list2;
        this.f1847d = list3;
        this.f1848e = sVar;
        this.f1849f = vastTracker;
    }

    public l(String adUnitId, C1906u bid, com.moloco.sdk.internal.publisher.nativead.model.h ortbResponse, com.moloco.sdk.internal.services.u uVar, com.moloco.sdk.internal.services.events.c cVar, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar, G0 g02, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(bid, "bid");
        AbstractC3340k.e(ortbResponse, "ortbResponse");
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f1845b = adUnitId;
        this.f1844a = bid;
        this.f1846c = ortbResponse;
        this.f1847d = g02;
        this.f1848e = tg.b.a(null, uVar, cVar, new q(bid, 10), new q(this, 11), adFormatType, cVar2, null, 1632);
        Object obj = ortbResponse.f29191d;
        Object obj2 = ortbResponse.f29190c;
        S3.n nVar2 = new S3.n();
        nVar2.f10970a = obj2;
        nVar2.f10971b = obj;
        nVar2.f10972c = nVar;
        nVar2.f10973d = new LinkedHashSet();
        this.f1849f = nVar2;
    }

    public l(B b5, com.moloco.sdk.acm.n nVar, Kd.a coroutineScope) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        AbstractC3340k.e(scheduler, "scheduler");
        AbstractC3340k.e(coroutineScope, "coroutineScope");
        this.f1844a = b5;
        this.f1845b = nVar;
        this.f1846c = scheduler;
        this.f1847d = coroutineScope;
        this.f1849f = Nf.e.a();
    }

    public l(s8.g gVar, FirebaseAuth firebaseAuth) {
        M m10 = new M();
        this.f1844a = new Object();
        this.f1845b = new HashMap();
        this.f1847d = gVar;
        this.f1848e = firebaseAuth;
        this.f1849f = m10;
    }

    public l(L8.b bVar, L8.c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (L8.l lVar : bVar.f6992c) {
            int i5 = lVar.f7019c;
            boolean z2 = i5 == 0;
            int i10 = lVar.f7018b;
            t tVar = lVar.f7017a;
            if (z2) {
                if (i10 == 2) {
                    hashSet4.add(tVar);
                } else {
                    hashSet.add(tVar);
                }
            } else if (i5 == 2) {
                hashSet3.add(tVar);
            } else if (i10 == 2) {
                hashSet5.add(tVar);
            } else {
                hashSet2.add(tVar);
            }
        }
        Set set = bVar.f6996g;
        if (!set.isEmpty()) {
            hashSet.add(t.a(InterfaceC3447c.class));
        }
        this.f1844a = DesugarCollections.unmodifiableSet(hashSet);
        this.f1845b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f1846c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f1847d = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f1848e = set;
        this.f1849f = cVar;
    }

    public l() {
        this.f1844a = new int[]{2131230846, 2131230844, 2131230770};
        this.f1845b = new int[]{2131230794, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1846c = new int[]{2131230843, 2131230845, 2131230787, R.drawable.abc_text_cursor_material, 2131230840, 2131230841, 2131230842};
        this.f1847d = new int[]{2131230819, R.drawable.abc_cab_background_internal_bg, 2131230818};
        this.f1848e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1849f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public l(s9.f fVar, n0 n0Var) {
        this.f1845b = new HashMap();
        this.f1846c = new HashMap();
        this.f1847d = new HashMap();
        this.f1848e = new HashMap();
        this.f1849f = fVar;
        this.f1844a = n0Var;
    }

    public l(d2.m mVar, MediaFormat mediaFormat, C0765n c0765n, Surface surface, MediaCrypto mediaCrypto, Dd.c cVar) {
        this.f1844a = mVar;
        this.f1845b = mediaFormat;
        this.f1846c = c0765n;
        this.f1847d = surface;
        this.f1848e = mediaCrypto;
        this.f1849f = cVar;
    }

    public l(s8.g gVar, o oVar, O9.b bVar, O9.b bVar2, P9.d dVar) {
        gVar.a();
        C1566b c1566b = new C1566b(gVar.f45328a);
        this.f1844a = gVar;
        this.f1845b = oVar;
        this.f1846c = c1566b;
        this.f1847d = bVar;
        this.f1848e = bVar2;
        this.f1849f = dVar;
    }

    public l(String str, dd.j jVar, dd.m mVar, C0800p c0800p, C0799o c0799o, Object obj) {
        this.f1845b = str;
        this.f1844a = jVar;
        this.f1846c = mVar;
        this.f1847d = c0800p;
        this.f1848e = c0799o;
        this.f1849f = obj;
    }

    public l(H0 h02) {
        this.f1844a = h02;
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f1845b = e0.f40101e;
        this.f1846c = j0.f40119g;
    }

    public l(N1.L l10) {
        this.f1844a = l10;
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f1845b = e0.f40101e;
        this.f1846c = j0.f40119g;
    }
}
