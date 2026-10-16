package u0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.applovin.shadow.okio.Segment;
import com.wynauto.wyn.R;
import d0.C2384c;
import ef.C2515C;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k1.C3115b;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4413f;
import x.C4430w;
import x0.AbstractC4436f;
import x0.AbstractC4444n;
import x0.C4431a;
import x0.C4437g;
import x0.C4438h;
import x0.C4440j;
import x0.C4441k;
import x0.C4442l;
import x0.C4447q;
import x0.InterfaceC4439i;

/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4195s extends C3115b {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f46337z = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d, reason: collision with root package name */
    public final C4188n f46338d;

    /* renamed from: e, reason: collision with root package name */
    public int f46339e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f46340f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f46341g;

    /* renamed from: h, reason: collision with root package name */
    public final ad.L f46342h;

    /* renamed from: i, reason: collision with root package name */
    public int f46343i;

    /* renamed from: j, reason: collision with root package name */
    public final C4430w f46344j;
    public final C4430w k;

    /* renamed from: l, reason: collision with root package name */
    public int f46345l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f46346m;

    /* renamed from: n, reason: collision with root package name */
    public final C4413f f46347n;

    /* renamed from: o, reason: collision with root package name */
    public final Gf.e f46348o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46349p;

    /* renamed from: q, reason: collision with root package name */
    public C4192p f46350q;

    /* renamed from: r, reason: collision with root package name */
    public Object f46351r;

    /* renamed from: s, reason: collision with root package name */
    public final C4413f f46352s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f46353t;

    /* renamed from: u, reason: collision with root package name */
    public C4194q f46354u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f46355v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC3307c f46356w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f46357x;

    /* renamed from: y, reason: collision with root package name */
    public final B.F f46358y;

    public C4195s(C4188n view) {
        AbstractC3340k.e(view, "view");
        this.f46338d = view;
        this.f46339e = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f46340f = (AccessibilityManager) systemService;
        this.f46341g = new Handler(Looper.getMainLooper());
        this.f46342h = new ad.L(new l1.f(this), 13);
        this.f46343i = Integer.MIN_VALUE;
        this.f46344j = new C4430w();
        this.k = new C4430w();
        this.f46345l = -1;
        this.f46347n = new C4413f(0);
        this.f46348o = ic.d.a(-1, 6, null);
        this.f46349p = true;
        ff.w wVar = ff.w.f35433a;
        this.f46351r = wVar;
        this.f46352s = new C4413f(0);
        this.f46353t = new LinkedHashMap();
        this.f46354u = new C4194q(view.getSemanticsOwner().a(), wVar);
        view.addOnAttachStateChangeListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T(this, 4));
        this.f46356w = new RunnableC3307c(this, 15);
        this.f46357x = new ArrayList();
        this.f46358y = new B.F(this, 18);
    }

    public static CharSequence C(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i5 = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i5 = 99999;
        }
        return charSequence.subSequence(0, i5);
    }

    public static String q(C4441k c4441k) {
        z0.b bVar;
        if (c4441k == null) {
            return null;
        }
        C4447q c4447q = AbstractC4444n.f47616a;
        C4437g c4437g = c4441k.f47603e;
        if (c4437g.a(c4447q)) {
            return AbstractC2641B.s((List) c4437g.c(c4447q));
        }
        if (c4437g.a(AbstractC4436f.f47585g)) {
            z0.b bVar2 = (z0.b) Fe.e.F(c4437g, AbstractC4444n.f47632r);
            if (bVar2 != null) {
                return bVar2.f48269a;
            }
            return null;
        }
        List list = (List) Fe.e.F(c4437g, AbstractC4444n.f47631q);
        if (list == null || (bVar = (z0.b) ff.o.s0(list)) == null) {
            return null;
        }
        return bVar.f48269a;
    }

    public static /* synthetic */ void w(C4195s c4195s, int i5, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        c4195s.v(i5, i10, num, null);
    }

    public final void A(t0.t tVar, C4413f c4413f) {
        C4438h c4438hV;
        C4437g c4437gJ;
        if (tVar.r() && !this.f46338d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(tVar)) {
            C4438h c4438hV2 = S3.f.v(tVar);
            t0.t tVar2 = null;
            if (c4438hV2 == null) {
                t0.t tVarJ = tVar.j();
                while (true) {
                    if (tVarJ == null) {
                        tVarJ = null;
                        break;
                    } else if (S3.f.v(tVarJ) != null) {
                        break;
                    } else {
                        tVarJ = tVarJ.j();
                    }
                }
                c4438hV2 = tVarJ != null ? S3.f.v(tVarJ) : null;
                if (c4438hV2 == null) {
                    return;
                }
            }
            if (!c4438hV2.j().f47594b) {
                t0.t tVarJ2 = tVar.j();
                while (true) {
                    if (tVarJ2 != null) {
                        C4438h c4438hV3 = S3.f.v(tVarJ2);
                        if (c4438hV3 != null && (c4437gJ = c4438hV3.j()) != null && c4437gJ.f47594b) {
                            tVar2 = tVarJ2;
                            break;
                        }
                        tVarJ2 = tVarJ2.j();
                    } else {
                        break;
                    }
                }
                if (tVar2 != null && (c4438hV = S3.f.v(tVar2)) != null) {
                    c4438hV2 = c4438hV;
                }
            }
            int i5 = ((C4440j) ((InterfaceC4439i) ((Z.j) c4438hV2.f15789c))).f47597a;
            if (c4413f.add(Integer.valueOf(i5))) {
                w(this, t(i5), 2048, 1, 8);
            }
        }
    }

    public final boolean B(C4441k c4441k, int i5, int i10, boolean z2) {
        String strQ;
        C4437g c4437g = c4441k.f47603e;
        C4447q c4447q = AbstractC4436f.f47584f;
        if (c4437g.a(c4447q) && Q.a(c4441k)) {
            tf.q qVar = (tf.q) ((C4431a) c4441k.f47603e.c(c4447q)).f47568b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i5), Integer.valueOf(i10), Boolean.valueOf(z2))).booleanValue();
            }
        } else if ((i5 != i10 || i10 != this.f46345l) && (strQ = q(c4441k)) != null) {
            if (i5 < 0 || i5 != i10 || i10 > strQ.length()) {
                i5 = -1;
            }
            this.f46345l = i5;
            boolean z10 = strQ.length() > 0;
            int i11 = c4441k.f47604f;
            u(m(t(i11), z10 ? Integer.valueOf(this.f46345l) : null, z10 ? Integer.valueOf(this.f46345l) : null, z10 ? Integer.valueOf(strQ.length()) : null, strQ));
            y(i11);
            return true;
        }
        return false;
    }

    @Override // k1.C3115b
    public final ad.L b(View host) {
        AbstractC3340k.e(host, "host");
        return this.f46342h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (Ef.H.m(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:34:0x0081, B:36:0x0086, B:37:0x0095, B:39:0x009c, B:40:0x00a5, B:20:0x0044), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b6 -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(lf.AbstractC3464c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4195s.j(lf.c):java.lang.Object");
    }

    public final void k(long j8, boolean z2) {
        C4447q c4447q;
        Collection currentSemanticsNodes = p().values();
        AbstractC3340k.e(currentSemanticsNodes, "currentSemanticsNodes");
        if (C2384c.a(j8, C2384c.f33933d)) {
            return;
        }
        if (Float.isNaN(C2384c.b(j8)) || Float.isNaN(C2384c.c(j8))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        if (z2) {
            c4447q = AbstractC4444n.f47628n;
        } else {
            if (z2) {
                throw new E5.Q((byte) 0, 9);
            }
            c4447q = AbstractC4444n.f47627m;
        }
        Collection<C4187m0> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return;
        }
        for (C4187m0 c4187m0 : collection) {
            Rect rect = c4187m0.f46259b;
            float f10 = rect.left;
            float f11 = rect.top;
            float f12 = rect.right;
            float f13 = rect.bottom;
            if (C2384c.b(j8) >= f10 && C2384c.b(j8) < f12 && C2384c.c(j8) >= f11 && C2384c.c(j8) < f13 && Fe.e.F(c4187m0.f46258a.f(), c4447q) != null) {
                throw new ClassCastException();
            }
        }
    }

    public final AccessibilityEvent l(int i5, int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        AbstractC3340k.d(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        C4188n c4188n = this.f46338d;
        accessibilityEventObtain.setPackageName(c4188n.getContext().getPackageName());
        accessibilityEventObtain.setSource(c4188n, i5);
        C4187m0 c4187m0 = (C4187m0) p().get(Integer.valueOf(i5));
        if (c4187m0 != null) {
            accessibilityEventObtain.setPassword(c4187m0.f46258a.f().a(AbstractC4444n.f47636v));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent m(int i5, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent accessibilityEventL = l(i5, Segment.SIZE);
        if (num != null) {
            accessibilityEventL.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventL.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventL.setItemCount(num3.intValue());
        }
        if (str != null) {
            accessibilityEventL.getText().add(str);
        }
        return accessibilityEventL;
    }

    public final int n(C4441k c4441k) {
        C4437g c4437g = c4441k.f47603e;
        C4447q c4447q = AbstractC4444n.f47616a;
        if (!c4437g.a(AbstractC4444n.f47616a)) {
            C4447q c4447q2 = AbstractC4444n.f47633s;
            C4437g c4437g2 = c4441k.f47603e;
            if (c4437g2.a(c4447q2)) {
                ((z0.o) c4437g2.c(c4447q2)).getClass();
                return (int) (4294967295L & 0);
            }
        }
        return this.f46345l;
    }

    public final int o(C4441k c4441k) {
        C4437g c4437g = c4441k.f47603e;
        C4447q c4447q = AbstractC4444n.f47616a;
        if (!c4437g.a(AbstractC4444n.f47616a)) {
            C4447q c4447q2 = AbstractC4444n.f47633s;
            C4437g c4437g2 = c4441k.f47603e;
            if (c4437g2.a(c4447q2)) {
                ((z0.o) c4437g2.c(c4447q2)).getClass();
                return (int) (0 >> 32);
            }
        }
        return this.f46345l;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map p() {
        if (this.f46349p) {
            C4442l semanticsOwner = this.f46338d.getSemanticsOwner();
            AbstractC3340k.e(semanticsOwner, "<this>");
            C4441k c4441kA = semanticsOwner.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            t0.t tVar = c4441kA.f47605g;
            if (tVar.f45528s && tVar.r()) {
                Region region = new Region();
                region.set(e0.z.r(c4441kA.d()));
                Q.g(region, c4441kA, linkedHashMap, c4441kA);
            }
            this.f46351r = linkedHashMap;
            this.f46349p = false;
        }
        return this.f46351r;
    }

    public final boolean r() {
        AccessibilityManager accessibilityManager = this.f46340f;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void s(t0.t tVar) {
        if (this.f46347n.add(tVar)) {
            this.f46348o.c(C2515C.f34653a);
        }
    }

    public final int t(int i5) {
        if (i5 == this.f46338d.getSemanticsOwner().a().f47604f) {
            return -1;
        }
        return i5;
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!r()) {
            return false;
        }
        View view = this.f46338d;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean v(int i5, int i10, Integer num, List list) {
        if (i5 == Integer.MIN_VALUE || !r()) {
            return false;
        }
        AccessibilityEvent accessibilityEventL = l(i5, i10);
        if (num != null) {
            accessibilityEventL.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventL.setContentDescription(AbstractC2641B.s(list));
        }
        return u(accessibilityEventL);
    }

    public final void x(int i5, int i10, String str) {
        AccessibilityEvent accessibilityEventL = l(t(i5), 32);
        accessibilityEventL.setContentChangeTypes(i10);
        if (str != null) {
            accessibilityEventL.getText().add(str);
        }
        u(accessibilityEventL);
    }

    public final void y(int i5) {
        C4192p c4192p = this.f46350q;
        if (c4192p != null) {
            C4441k c4441k = c4192p.f46323a;
            if (i5 != c4441k.f47604f) {
                return;
            }
            if (SystemClock.uptimeMillis() - c4192p.f46328f <= 1000) {
                AccessibilityEvent accessibilityEventL = l(t(c4441k.f47604f), 131072);
                accessibilityEventL.setFromIndex(c4192p.f46326d);
                accessibilityEventL.setToIndex(c4192p.f46327e);
                accessibilityEventL.setAction(c4192p.f46324b);
                accessibilityEventL.setMovementGranularity(c4192p.f46325c);
                accessibilityEventL.getText().add(q(c4441k));
                u(accessibilityEventL);
            }
        }
        this.f46350q = null;
    }

    public final void z(C4441k c4441k, C4194q c4194q) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listE = c4441k.e(false);
        int size = listE.size();
        int i5 = 0;
        while (true) {
            t0.t tVar = c4441k.f47605g;
            if (i5 >= size) {
                Iterator it = c4194q.f46330b.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        s(tVar);
                        return;
                    }
                }
                List listE2 = c4441k.e(false);
                int size2 = listE2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    C4441k c4441k2 = (C4441k) listE2.get(i10);
                    if (p().containsKey(Integer.valueOf(c4441k2.f47604f))) {
                        Object obj = this.f46353t.get(Integer.valueOf(c4441k2.f47604f));
                        AbstractC3340k.b(obj);
                        z(c4441k2, (C4194q) obj);
                    }
                }
                return;
            }
            C4441k c4441k3 = (C4441k) listE.get(i5);
            if (p().containsKey(Integer.valueOf(c4441k3.f47604f))) {
                LinkedHashSet linkedHashSet2 = c4194q.f46330b;
                int i11 = c4441k3.f47604f;
                if (!linkedHashSet2.contains(Integer.valueOf(i11))) {
                    s(tVar);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(i11));
            }
            i5++;
        }
    }
}
