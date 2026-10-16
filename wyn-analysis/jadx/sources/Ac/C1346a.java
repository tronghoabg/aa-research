package ac;

import A7.W0;
import C8.i;
import Ef.C0502n;
import Ef.H;
import Ef.S;
import Jf.n;
import Lf.e;
import N1.D;
import U5.f;
import a9.C1341a;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import b1.C1494c;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.nativead.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.wynauto.wyn.R;
import e0.C2450b;
import f6.W;
import g2.C2674D;
import g2.C2685f;
import g2.C2686g;
import g2.RunnableC2695p;
import g2.q;
import g2.s;
import g2.u;
import g2.v;
import h6.InterfaceC2787f;
import io.ktor.utils.io.T;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import k1.C3119f;
import k1.InterfaceC3116c;
import k1.h0;
import k1.i0;
import k1.j0;
import k1.k0;
import k1.l0;
import k1.r;
import k1.v0;
import k2.b0;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import l8.AbstractC3409K;
import m2.InterfaceC3481c;
import nb.InterfaceC3613b;
import nb.c;
import o2.h;
import o2.j;
import o2.o;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p.C3753d;
import p.SubMenuC3749D;
import p.ViewOnKeyListenerC3754e;
import p.k;
import p.m;
import p.w;
import pb.RunnableC3790a;
import q.C3816i;
import q.C3828o;
import q.G0;
import q.v1;
import q2.C3861e;
import r9.K;
import re.C3977a;
import tc.g;
import u1.C4212a;
import u1.InterfaceC4213b;
import uc.C4276m;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import wa.C4398a;
import x3.InterfaceC4459b;
import zg.C4668g;
import zg.InterfaceC4664c;
import zg.InterfaceC4667f;
import zg.Q;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1346a implements OnCompleteListener, W, h, b0, r, o, InterfaceC3116c, InterfaceC2787f, InterfaceC3481c, G0, InterfaceC3613b, w, q2.r, r9.w, InterfaceC4279p, InterfaceC4213b, InterfaceC4459b, InterfaceC4667f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17488a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17489b;

    public /* synthetic */ C1346a(int i5, boolean z2) {
        this.f17488a = i5;
    }

    public static String G(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.left);
        sb2.append(',');
        sb2.append(rect.top);
        sb2.append(',');
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public static String I(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public static String K(String str) {
        return N0.a.h("Thread - ", Thread.currentThread().getName(), StringUtils.SPACE, str);
    }

    @Override // o2.h
    public void A(j jVar, long j8, long j10) {
        C2685f c2685f = (C2685f) jVar;
        s sVar = (s) this.f17489b;
        if (sVar.n() == 0) {
            if (sVar.f35679v) {
                return;
            }
            s.l(sVar);
            return;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = sVar.f35663e;
            if (i5 >= arrayList.size()) {
                break;
            }
            g2.r rVar = (g2.r) arrayList.get(i5);
            if (rVar.f35653a.f35650b == c2685f) {
                rVar.a();
                break;
            }
            i5++;
        }
        sVar.f35662d.f35641o = 1;
    }

    @Override // q2.r
    public void B() {
        C3861e c3861e = (C3861e) this.f17489b;
        if (c3861e.f44006P0 != null) {
            c3861e.Q0(0, 1);
        }
    }

    @Override // k2.b0
    public void C() {
        s sVar = (s) this.f17489b;
        sVar.f35660b.post(new RunnableC2695p(sVar, 1));
    }

    @Override // q.G0
    public void D(k kVar, m mVar) {
        ViewOnKeyListenerC3754e viewOnKeyListenerC3754e = (ViewOnKeyListenerC3754e) this.f17489b;
        viewOnKeyListenerC3754e.f43004f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC3754e.f43006h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (kVar == ((C3753d) arrayList.get(i5)).f42998b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 == -1) {
            return;
        }
        int i10 = i5 + 1;
        viewOnKeyListenerC3754e.f43004f.postAtTime(new W0(this, i10 < arrayList.size() ? (C3753d) arrayList.get(i10) : null, mVar, kVar, 24), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // o2.h
    public f E(j jVar, long j8, long j10, IOException iOException, int i5) {
        C2685f c2685f = (C2685f) jVar;
        s sVar = (s) this.f17489b;
        if (!sVar.f35676s) {
            sVar.k = iOException;
        } else if (iOException.getCause() instanceof BindException) {
            int i10 = sVar.f35678u;
            sVar.f35678u = i10 + 1;
            if (i10 < 3) {
                return o2.m.f41317d;
            }
        } else {
            sVar.f35669l = new T(c2685f.f35578b.f35690b.toString(), iOException);
        }
        return o2.m.f41318e;
    }

    @Override // p.w
    public boolean F(k kVar) {
        C3816i c3816i = (C3816i) this.f17489b;
        if (kVar == c3816i.f43792c) {
            return false;
        }
        ((SubMenuC3749D) kVar).f42979A.getClass();
        c3816i.getClass();
        w wVar = c3816i.f43794e;
        if (wVar != null) {
            return wVar.F(kVar);
        }
        return false;
    }

    public void H(K3.r screenMetrics) {
        AbstractC3340k.e(screenMetrics, "screenMetrics");
        StringBuilder sb2 = new StringBuilder("\n                mraidbridge.setScreenSize(");
        sb2.append(I((Rect) screenMetrics.f6513c));
        sb2.append(");\n                mraidbridge.setMaxSize(");
        sb2.append(I((Rect) screenMetrics.f6515e));
        sb2.append(");\n                mraidbridge.setCurrentPosition(");
        Rect rect = (Rect) screenMetrics.f6517g;
        sb2.append(G(rect));
        sb2.append(");\n                mraidbridge.setDefaultPosition(");
        sb2.append(G((Rect) screenMetrics.f6519i));
        sb2.append(");\n                mraidbridge.notifySizeChangeEvent(");
        sb2.append(I(rect));
        sb2.append(");\n            ");
        J(sb2.toString());
    }

    public void J(String str) {
        e eVar = S.f3698a;
        H.D(H.c(n.f6132a), null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.e(this, str, null), 3);
    }

    public void L(T t10) {
        boolean z2 = t10 instanceof u;
        s sVar = (s) this.f17489b;
        if (!z2 || sVar.f35679v) {
            sVar.f35669l = t10;
        } else {
            s.l(sVar);
        }
    }

    public void M(long j8, AbstractC3409K abstractC3409K) {
        C2685f c2685f;
        ArrayList arrayList = new ArrayList(abstractC3409K.size());
        for (int i5 = 0; i5 < abstractC3409K.size(); i5++) {
            String path = ((C2674D) abstractC3409K.get(i5)).f35521c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i10 = 0; i10 < ((s) this.f17489b).f35664f.size(); i10++) {
            if (!arrayList.contains(((q) ((s) this.f17489b).f35664f.get(i10)).f35650b.f35578b.f35690b.getPath())) {
                v vVar = (v) ((s) this.f17489b).f35665g.f26356b;
                vVar.f35685m = false;
                vVar.t();
                if (((s) this.f17489b).m()) {
                    s sVar = (s) this.f17489b;
                    sVar.f35674q = true;
                    sVar.f35671n = -9223372036854775807L;
                    sVar.f35670m = -9223372036854775807L;
                    sVar.f35672o = -9223372036854775807L;
                }
            }
        }
        for (int i11 = 0; i11 < abstractC3409K.size(); i11++) {
            C2674D c2674d = (C2674D) abstractC3409K.get(i11);
            s sVar2 = (s) this.f17489b;
            Uri uri = c2674d.f35521c;
            int i12 = 0;
            while (true) {
                ArrayList arrayList2 = sVar2.f35663e;
                if (i12 >= arrayList2.size()) {
                    c2685f = null;
                    break;
                }
                if (!((g2.r) arrayList2.get(i12)).f35656d) {
                    q qVar = ((g2.r) arrayList2.get(i12)).f35653a;
                    if (qVar.f35650b.f35578b.f35690b.equals(uri)) {
                        c2685f = qVar.f35650b;
                        break;
                    }
                }
                i12++;
            }
            if (c2685f != null) {
                long j10 = c2674d.f35519a;
                if (j10 != -9223372036854775807L) {
                    C2686g c2686g = c2685f.f35584h;
                    c2686g.getClass();
                    if (!c2686g.f35595h) {
                        c2685f.f35584h.f35596i = j10;
                    }
                }
                int i13 = c2674d.f35520b;
                C2686g c2686g2 = c2685f.f35584h;
                c2686g2.getClass();
                if (!c2686g2.f35595h) {
                    c2685f.f35584h.f35597j = i13;
                }
                if (((s) this.f17489b).m()) {
                    s sVar3 = (s) this.f17489b;
                    if (sVar3.f35671n == sVar3.f35670m) {
                        long j11 = c2674d.f35519a;
                        c2685f.k = j8;
                        c2685f.f35587l = j11;
                    }
                }
            }
        }
        if (!((s) this.f17489b).m()) {
            s sVar4 = (s) this.f17489b;
            long j12 = sVar4.f35672o;
            if (j12 == -9223372036854775807L || !sVar4.f35679v) {
                return;
            }
            sVar4.d(j12);
            ((s) this.f17489b).f35672o = -9223372036854775807L;
            return;
        }
        s sVar5 = (s) this.f17489b;
        long j13 = sVar5.f35671n;
        long j14 = sVar5.f35670m;
        if (j13 == j14) {
            sVar5.f35671n = -9223372036854775807L;
            sVar5.f35670m = -9223372036854775807L;
        } else {
            sVar5.f35671n = -9223372036854775807L;
            sVar5.d(j14);
        }
    }

    public void N(String str, IOException iOException) {
        ((s) this.f17489b).k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    public void O(String message) {
        AbstractC3340k.e(message, "message");
        C3977a c3977a = (C3977a) ((i) this.f17489b).f1941d;
        ae.a aVar = c3977a.f44801a;
        ae.a aVar2 = ae.a.f17623b;
        if (aVar.f17625a == 0) {
            Log.v(c3977a.f44802b, K(message));
        }
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        return -1;
    }

    @Override // k1.InterfaceC3116c
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f17489b).setLinkUri(uri);
    }

    @Override // k1.InterfaceC3116c
    public C3119f build() {
        return new C3119f(new l(((ContentInfo.Builder) this.f17489b).build()));
    }

    @Override // f6.W
    public long c() {
        long jMin = Long.MAX_VALUE;
        for (W w2 : (W[]) this.f17489b) {
            long jC = w2.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // f6.W
    public boolean e() {
        for (W w2 : (W[]) this.f17489b) {
            if (w2.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        return (List) this.f17489b;
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        return 0L;
    }

    @Override // p.w
    public void l(k kVar, boolean z2) {
        if (kVar instanceof SubMenuC3749D) {
            ((SubMenuC3749D) kVar).f42980z.k().c(false);
        }
        w wVar = ((C3816i) this.f17489b).f43794e;
        if (wVar != null) {
            wVar.l(kVar, z2);
        }
    }

    @Override // q.G0
    public void m(k kVar, m mVar) {
        ((ViewOnKeyListenerC3754e) this.f17489b).f43004f.removeCallbacksAndMessages(kVar);
    }

    @Override // f6.W
    public long n() {
        long jMin = Long.MAX_VALUE;
        for (W w2 : (W[]) this.f17489b) {
            long jN = w2.n();
            if (jN != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jN);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // f6.W
    public void o(long j8) {
        for (W w2 : (W[]) this.f17489b) {
            w2.o(j8);
        }
    }

    @Override // nb.InterfaceC3613b
    public void onAdLoaded() {
        switch (this.f17488a) {
            case 16:
                RunnableC3790a runnableC3790a = (RunnableC3790a) this.f17489b;
                ((ConcurrentHashMap) ((pb.b) runnableC3790a.f43450c).f1971b).put(((c) runnableC3790a.f43449b).f41000a, (rb.f) runnableC3790a.f43451d);
                break;
            default:
                RunnableC3790a runnableC3790a2 = (RunnableC3790a) this.f17489b;
                ((ConcurrentHashMap) ((pb.b) runnableC3790a2.f43450c).f1971b).put(((c) runnableC3790a2.f43449b).f41000a, (vb.c) runnableC3790a2.f43451d);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((CountDownLatch) this.f17489b).countDown();
    }

    @Override // zg.InterfaceC4667f
    public void onFailure(InterfaceC4664c call, Throwable th) {
        switch (this.f17488a) {
            case 27:
                ((C4668g) this.f17489b).completeExceptionally(th);
                break;
            default:
                AbstractC3340k.f(call, "call");
                ((C0502n) this.f17489b).resumeWith(Fe.e.z(th));
                break;
        }
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        String str = c4278o.f46759a;
        str.getClass();
        C3828o c3828o = (C3828o) this.f17489b;
        if (!str.equals("get")) {
            if (!str.equals("put")) {
                ((g) interfaceC4280q).c();
                return;
            } else {
                c3828o.f43849f = (byte[]) c4278o.f46760b;
                ((g) interfaceC4280q).a(null);
                return;
            }
        }
        c3828o.f43848e = true;
        if (!c3828o.f43847d && c3828o.f43846c) {
            c3828o.f43845b = (g) interfaceC4280q;
        } else {
            ((g) interfaceC4280q).a(C3828o.d((byte[]) c3828o.f43849f));
        }
    }

    @Override // zg.InterfaceC4667f
    public void onResponse(InterfaceC4664c call, Q q4) {
        switch (this.f17488a) {
            case 27:
                boolean zD = q4.f48595a.d();
                C4668g c4668g = (C4668g) this.f17489b;
                if (!zD) {
                    c4668g.completeExceptionally(new E5.Q(q4));
                    break;
                } else {
                    c4668g.complete(q4.f48596b);
                    break;
                }
            default:
                AbstractC3340k.f(call, "call");
                ((C0502n) this.f17489b).resumeWith(q4);
                break;
        }
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return 1;
    }

    @Override // q2.r
    public void q() {
        C3861e c3861e = (C3861e) this.f17489b;
        Surface surface = c3861e.f44006P0;
        if (surface != null) {
            X2.j jVar = c3861e.f43995E0;
            Handler handler = (Handler) jVar.f16075b;
            if (handler != null) {
                handler.post(new com.applovin.impl.W(jVar, surface, SystemClock.elapsedRealtime(), 2));
            }
            c3861e.f44009S0 = true;
        }
    }

    @Override // r9.w
    public void run() {
        ((K) this.f17489b).P("build overlays", new RunnableC3307c(this, 10));
    }

    @Override // k1.InterfaceC3116c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f17489b).setExtras(bundle);
    }

    @Override // o2.o
    public Object t(Uri uri, S1.j jVar) throws XmlPullParserException, D {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f17489b).newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            return (j2.c) new j2.g(uri.toString()).h(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e7) {
            throw D.b(null, e7);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // u1.InterfaceC4213b
    public Object u(C4212a c4212a) {
        return ((AbstractC3343n) this.f17489b).invoke(c4212a);
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        v0 v0VarB;
        boolean z10;
        boolean z11;
        int iD = v0Var.d();
        j.w wVar = (j.w) this.f17489b;
        wVar.getClass();
        int iD2 = v0Var.d();
        ActionBarContextView actionBarContextView = wVar.f38548v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wVar.f38548v.getLayoutParams();
            if (wVar.f38548v.isShown()) {
                if (wVar.f38532c0 == null) {
                    wVar.f38532c0 = new Rect();
                    wVar.f38533d0 = new Rect();
                }
                Rect rect = wVar.f38532c0;
                Rect rect2 = wVar.f38533d0;
                rect.set(v0Var.b(), v0Var.d(), v0Var.c(), v0Var.a());
                ViewGroup viewGroup = wVar.f38505A;
                Method method = v1.f43927a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i5 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = wVar.f38505A;
                WeakHashMap weakHashMap = k1.S.f38779a;
                v0 v0VarA = k1.K.a(viewGroup2);
                int iB = v0VarA == null ? 0 : v0VarA.b();
                int iC = v0VarA == null ? 0 : v0VarA.c();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z11 = true;
                }
                Context context = wVar.k;
                if (i5 <= 0 || wVar.f38507C != null) {
                    View view2 = wVar.f38507C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            wVar.f38507C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    wVar.f38507C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    wVar.f38505A.addView(wVar.f38507C, -1, layoutParams);
                }
                View view4 = wVar.f38507C;
                boolean z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = wVar.f38507C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? Y0.e.getColor(context, R.color.abc_decor_view_status_guard_light) : Y0.e.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!wVar.f38512H && z12) {
                    iD2 = 0;
                }
                z2 = z12;
                z10 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
                z10 = true;
            } else {
                z2 = false;
                z10 = false;
            }
            if (z10) {
                wVar.f38548v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = wVar.f38507C;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = v0Var.b();
            int iC2 = v0Var.c();
            int iA = v0Var.a();
            int i14 = Build.VERSION.SDK_INT;
            l0 k0Var = i14 >= 34 ? new k0(v0Var) : i14 >= 30 ? new j0(v0Var) : i14 >= 29 ? new i0(v0Var) : new h0(v0Var);
            k0Var.g(C1494c.b(iB2, iD2, iC2, iA));
            v0VarB = k0Var.b();
        } else {
            v0VarB = v0Var;
        }
        WeakHashMap weakHashMap2 = k1.S.f38779a;
        WindowInsets windowInsetsF = v0VarB.f();
        if (windowInsetsF == null) {
            return v0VarB;
        }
        WindowInsets windowInsetsB = k1.H.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? v0.g(view, windowInsetsB) : v0VarB;
    }

    @Override // o2.h
    public /* bridge */ /* synthetic */ void w(j jVar, long j8, long j10, boolean z2) {
    }

    @Override // k1.InterfaceC3116c
    public void x(int i5) {
        ((ContentInfo.Builder) this.f17489b).setFlags(i5);
    }

    @Override // f6.W
    public boolean z(long j8) {
        boolean z2;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z10;
            }
            z2 = false;
            for (W w2 : (W[]) this.f17489b) {
                long jC2 = w2.c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= j8;
                if (jC2 == jC || z11) {
                    z2 |= w2.z(j8);
                }
            }
            z10 |= z2;
        } while (z2);
        return z10;
    }

    public /* synthetic */ C1346a(Object obj, int i5) {
        this.f17488a = i5;
        this.f17489b = obj;
    }

    public C1346a(mc.b bVar) {
        this.f17488a = 22;
        C1341a c1341a = new C1341a();
        C4281r c4281r = new C4281r(bVar, "flutter/navigation", C4276m.f46758a, null);
        this.f17489b = c4281r;
        c4281r.b(c1341a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1346a(tf.l produceNewData) {
        this.f17488a = 24;
        AbstractC3340k.e(produceNewData, "produceNewData");
        this.f17489b = (AbstractC3343n) produceNewData;
    }

    public C1346a(int i5) {
        this.f17488a = i5;
        switch (i5) {
            case 8:
                try {
                    this.f17489b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e7) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
                }
            case 12:
                this.f17489b = new C4398a(24);
                return;
            case 15:
                this.f17489b = null;
                return;
            default:
                this.f17489b = new C2450b();
                return;
        }
    }

    public C1346a(ClipData clipData, int i5) {
        this.f17488a = 9;
        this.f17489b = e1.c.i(clipData, i5);
    }
}
