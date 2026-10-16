package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class czq extends ViewGroup implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, cym, cix, cqg, epf, cyj, chy, dee {
    public static Class a;
    public static Method b;
    public static Method c;
    public static Runnable d;
    public static Method e;
    public static Method f;
    public final float[] A;
    public final float[] B;
    public afec C;
    public final cvq D;
    public MotionEvent E;
    public long F;
    public boolean G;
    public final afdr H;
    public dcq I;
    public final cic J;
    public final czp K;
    public final zh M;
    public final aag N;
    public aag O;
    public final cji P;
    public final cgi Q;
    public final ne R;
    public dan T;
    public final bii U;
    public final kgx V;
    public final mko W;
    private float aA;
    private float aB;
    private float aC;
    private final Runnable aD;
    private afeg aE;
    private final dbl aF;
    private final afdr aG;
    private boolean aH;
    private boolean aI;
    private View aJ;
    private final aag aK;
    private final chx aL;
    private fbf aM;
    private final kwp aN;
    private kwp aO;
    public sm aa;
    public kwp ab;
    private final bwq ac;
    private long ad;
    private final boolean ae;
    private dbr af;
    private final Runnable ag;
    private final bwq ah;
    private View ai;
    private boolean aj;
    private final cqi ak;
    private final bwq al;
    private dle am;
    private boolean an;
    private long ao;
    private final int[] ap;
    private final float[] aq;
    private final Matrix ar;
    private long as;
    private boolean at;
    private long au;
    private djx av;
    private final AtomicReference aw;
    private final bwq ax;
    private final bwq ay;
    private float az;
    public dbe g;
    public cdi h;
    public final afaz i;
    public afco j;
    public final cgs k;
    public final bwq l;
    public final bym m;
    public final cso n;
    public final cxb o;
    public final dei p;
    public final czy q;
    public final cgq r;
    public boolean s;
    public final bym t;
    public final cge u;
    public boolean v;
    public final cyp w;
    public boolean x;
    public dal y;
    public final cxp z;
    public static final czz S = new czz();
    public static final aag L = new aag(16);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, android.view.ViewGroup, cix, cym, czq, dee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [cft] */
    public czq(Context context, day dayVar) {
        super(context);
        bxp bxpVar = bxp.c;
        this.ac = new ParcelableSnapshotMutableState(dayVar, bxpVar);
        this.ad = 9205357640488583168L;
        this.ae = true;
        this.h = cde.a;
        this.i = new afaz();
        this.ag = new ne(this, 8, 0 == true ? 1 : 0);
        this.ah = new ParcelableSnapshotMutableState(dlf.w(context), bxp.a);
        cic cicVar = new cic(this, this);
        this.J = cicVar;
        this.j = dayVar.a().d();
        cgs cgsVar = new cgs();
        this.k = cgsVar;
        this.l = new ParcelableSnapshotMutableState(false, bxpVar);
        bxh bxhVar = new bxh((Object) this, 14);
        lah lahVar = byj.a;
        this.m = new bvk(bxhVar, null);
        this.n = new cso();
        cxb cxbVar = new cxb(false, 3, 0 == true ? 1 : 0);
        cxbVar.ad(cut.a);
        cxbVar.ab(r());
        cxbVar.af(q());
        cxt<czn> cxtVar = new cxt<czn>() { // from class: czq.1
            @Override // defpackage.cxt
            public final /* bridge */ /* synthetic */ cfx d() {
                return new czn(czq.this);
            }

            @Override // defpackage.cxt
            public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return czq.this.hashCode();
            }
        };
        cfy cfyVar = cicVar.d;
        cxbVar.ae((cfyVar != cfy.e ? new cft(cxtVar, cfyVar) : cxtVar).a(cgsVar.c));
        this.o = cxbVar;
        zh zhVar = zi.a;
        zh zhVar2 = new zh(6);
        this.M = zhVar2;
        dei deiVar = new dei(zhVar2, this);
        this.p = deiVar;
        mko mkoVar = new mko(cxbVar, new ddk(), zhVar2);
        this.W = mkoVar;
        czy czyVar = new czy(this);
        this.q = czyVar;
        cgq cgqVar = new cgq(this, new bgl((Object) this, 3, (short[]) null));
        this.r = cgqVar;
        this.P = new cji(this);
        kgx kgxVar = new kgx((byte[]) null, (char[]) null);
        this.V = kgxVar;
        int i = 16;
        this.N = new aag(16);
        this.ak = new cqi();
        this.aL = new chx(cxbVar);
        this.al = new ParcelableSnapshotMutableState(new Configuration(context.getResources().getConfiguration()), bxpVar);
        this.t = new bvk(new bxh((Object) this, 15), null);
        this.u = new cge(this, kgxVar);
        this.Q = new cgi(new cgn(context), mkoVar, this, deiVar, context.getPackageName());
        this.w = new cyp(new cep(this, 13));
        this.z = new cxp(cxbVar);
        this.ao = 9223372034707292159L;
        this.ap = new int[]{0, 0};
        this.aq = cki.e();
        this.ar = new Matrix();
        this.A = cki.e();
        this.B = cki.e();
        this.as = -1L;
        this.au = 9187343241974906880L;
        this.aw = new AtomicReference(null);
        this.ax = dayVar.f;
        dlr dlrVarC = chw.c(context.getResources().getConfiguration().getLayoutDirection());
        this.ay = new ParcelableSnapshotMutableState(dlrVarC == null ? dlr.a : dlrVarC, bxpVar);
        this.D = new cvq(this);
        this.U = new bii((short[]) null);
        this.aK = new aag(16);
        this.az = Float.NaN;
        this.aA = Float.NaN;
        this.aB = Float.NaN;
        this.aC = Float.NaN;
        this.R = new ne(this, 10);
        this.aD = new ne(this, 9, 0 == true ? 1 : 0);
        this.aF = new dbl(context, new cep(this, 14));
        this.aG = new bxh((Object) this, i);
        this.H = new bxh((Object) this, 17);
        addOnAttachStateChangeListener(cgqVar);
        setWillNotDraw(false);
        setFocusable(true);
        dao.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ebm.o(this, czyVar);
        setOnDragListener(cgsVar);
        if (Build.VERSION.SDK_INT >= 29) {
            dap.b(this);
        }
        if (a.P()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, true);
            this.ai = view;
            addView(view, -1);
        }
        this.aN = Build.VERSION.SDK_INT >= 31 ? new kwp((char[]) null, (byte[]) null) : null;
        this.K = new czp(this);
    }

    public static final boolean X(czq czqVar, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final boolean Z(czq czqVar, MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115 A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127 A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131 A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171 A[Catch: all -> 0x019e, TryCatch #1 {, blocks: (B:4:0x0066, B:6:0x006f, B:12:0x007c, B:14:0x0082, B:27:0x00aa, B:29:0x00b1, B:34:0x00bf, B:36:0x00c5, B:38:0x00d2, B:42:0x00de, B:44:0x00e6, B:46:0x00ea, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:55:0x0101, B:57:0x0107, B:60:0x010f, B:61:0x0115, B:63:0x011b, B:65:0x0121, B:67:0x0127, B:69:0x012d, B:71:0x0131, B:72:0x0135, B:77:0x0146, B:79:0x014a, B:81:0x0151, B:86:0x015d, B:87:0x0162, B:88:0x0167, B:90:0x0171, B:91:0x017d, B:17:0x008a, B:23:0x0096, B:26:0x009e), top: B:106:0x0066, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int ab(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.ab(android.view.MotionEvent):int");
    }

    private final djx ac() {
        djx djxVar = this.av;
        if (djxVar != null) {
            return djxVar;
        }
        djx djxVar2 = new djx(this, this, new nfh(this), new fpe(this, 1));
        this.av = djxVar2;
        return djxVar2;
    }

    private final void ad(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof czq) {
                ((czq) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                ad((ViewGroup) childAt);
            }
        }
    }

    private final void ae() {
        if (this.aj) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.aj = false;
        }
    }

    private final void af(cxb cxbVar) {
        cxbVar.H();
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            af((cxb) objArr[i2]);
        }
    }

    private final void ag(cxb cxbVar) {
        this.z.j(cxbVar, false);
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ag((cxb) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ah(android.view.ViewStructure r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.ah(android.view.ViewStructure):void");
    }

    private final void ai() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.A;
        if (i >= 29) {
            dap.a(this, fArr, this.ar, this.ap);
        } else {
            dam.a(this, fArr, this.aq, this.ap);
        }
        daq.b(fArr, this.B);
    }

    private final void aj(boolean z) {
        this.l.b(Boolean.valueOf(z));
    }

    private final void ak(Configuration configuration) {
        Configuration configurationM = M();
        if (affa.f(configurationM, configuration)) {
            return;
        }
        this.al.b(new Configuration(configuration));
        if (configurationM.fontScale == configuration.fontScale && configurationM.densityDpi == configuration.densityDpi) {
            return;
        }
        this.ah.b(dlf.w(getContext().createConfigurationContext(configuration)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void al() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.al():void");
    }

    private final boolean am(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.E) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final boolean an(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean ao(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !dap.c(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean ap(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= BitmapDescriptorFactory.HUE_RED && x <= ((float) getWidth()) && y >= BitmapDescriptorFactory.HUE_RED && y <= ((float) getHeight());
    }

    private static final long aq(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    @Override // defpackage.cym
    public final void A(cxb cxbVar, boolean z, boolean z2) {
        cxp cxpVar = this.z;
        if (!z) {
            int iAv = cxbVar.av();
            int i = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                cjn cjnVar = cxpVar.h;
                return;
            }
            if (i != 4) {
                throw new aezs();
            }
            cxb cxbVarL = cxbVar.l();
            boolean z3 = cxbVarL == null || cxbVarL.an();
            if (!z2 && (cxbVar.al() || (cxbVar.ai() && cxbVar.an() == z3 && cxbVar.an() == cxbVar.ao()))) {
                cjn cjnVar2 = cxpVar.h;
                return;
            }
            cxbVar.L();
            if (!cxbVar.D && cxbVar.ao() && z3) {
                if ((cxbVarL == null || !cxbVarL.ai()) && (cxbVarL == null || !cxbVarL.al())) {
                    cxpVar.i.x(cxbVar, 4);
                }
                if (cxpVar.c) {
                    return;
                }
                U(null);
                return;
            }
            return;
        }
        int iAv2 = cxbVar.av();
        int i2 = iAv2 - 1;
        if (iAv2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new aezs();
                        }
                    }
                }
            }
            cjn cjnVar3 = cxpVar.h;
            return;
        }
        if ((cxbVar.ak() || cxbVar.aj()) && !z2) {
            cjn cjnVar4 = cxpVar.h;
            return;
        }
        cxbVar.w.e();
        cxbVar.L();
        if (cxbVar.D) {
            return;
        }
        cxb cxbVarL2 = cxbVar.l();
        if (affa.f(cxbVar.s(), true) && ((cxbVarL2 == null || !cxbVarL2.ak()) && (cxbVarL2 == null || !cxbVarL2.aj()))) {
            cxpVar.i.x(cxbVar, 2);
        } else if (cxbVar.an() && ((cxbVarL2 == null || !cxbVarL2.ai()) && (cxbVarL2 == null || !cxbVarL2.al()))) {
            cxpVar.i.x(cxbVar, 4);
        }
        if (cxpVar.c) {
            return;
        }
        U(null);
    }

    @Override // defpackage.cym
    public final void B() {
        czy czyVar = this.q;
        czyVar.m = true;
        Handler handlerN = czyVar.n();
        if (czyVar.B() && !czyVar.q && handlerN != null) {
            czyVar.q = true;
            handlerN.post(czyVar.r);
        }
        cgq cgqVar = this.r;
        cgqVar.b = true;
        Handler handlerG = cgqVar.g();
        if (!cgqVar.n() || cgqVar.c || handlerG == null) {
            return;
        }
        cgqVar.c = true;
        handlerG.post(cgqVar.d);
    }

    @Override // defpackage.cym
    public final void C(afdr afdrVar) {
        aag aagVar = this.aK;
        if (aagVar.e(afdrVar)) {
            return;
        }
        aagVar.p(afdrVar);
    }

    @Override // defpackage.cym
    public final void D(cxb cxbVar) {
        this.z.d.b(cxbVar);
        U(null);
    }

    @Override // defpackage.cym
    public final void E(float f2) {
        if (a.P()) {
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                if (Float.isNaN(this.az) || f2 > this.az) {
                    this.az = f2;
                    return;
                }
                return;
            }
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                if (Float.isNaN(this.aA) || f2 < this.aA) {
                    this.aA = f2;
                }
            }
        }
    }

    @Override // defpackage.cym
    public final boolean F() {
        return Build.VERSION.SDK_INT >= 30 ? daq.a(this) : this.x;
    }

    @Override // defpackage.cym
    public final czl G() {
        return P().e;
    }

    @Override // defpackage.cym
    public final void H() {
        this.aj = true;
    }

    @Override // defpackage.cym
    public final fbf I() {
        fbf fbfVar = this.aM;
        if (fbfVar != null) {
            return fbfVar;
        }
        fbf fbfVar2 = new fbf(ac());
        this.aM = fbfVar2;
        return fbfVar2;
    }

    @Override // defpackage.cym
    public final wci J() {
        return (wci) this.ax.a();
    }

    @Override // defpackage.cym
    public final kwp K() {
        return P().j();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final int L(MotionEvent motionEvent) {
        Object obj;
        if (this.aH) {
            this.aH = false;
            dbp dbpVar = P().i;
            dcg.a.b(new crb(motionEvent.getMetaState()));
        }
        cqi cqiVar = this.ak;
        tj tjVarF = cqiVar.f(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (tjVarF == null) {
            this.aL.c();
            return 0;
        }
        ?? r1 = tjVarF.b;
        int size = r1.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = r1.get(size);
                if (((cqw) obj).e) {
                    if (actionMasked != 0) {
                        if (actionMasked == 5) {
                            actionMasked = 5;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        cqw cqwVar = (cqw) obj;
        if (cqwVar != null) {
            this.ad = cqwVar.d;
        }
        int iD = this.aL.d(tjVarF, this, ap(motionEvent));
        tjVarF.c = null;
        if ((actionMasked == 0 || actionMasked == 5) && (iD & 1) == 0) {
            cqiVar.d(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iD;
    }

    public final Configuration M() {
        return (Configuration) this.al.a();
    }

    public final czq N() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public final dal O() {
        dal dalVar = this.y;
        if (dalVar != null) {
            return dalVar;
        }
        dal dalVar2 = new dal(getContext());
        addView(dalVar2, -1);
        requestLayout();
        this.y = dalVar2;
        return dalVar2;
    }

    public final day P() {
        return (day) this.ac.a();
    }

    public final afeg Q() {
        afeg afegVar = this.aE;
        if (afegVar != null) {
            return afegVar;
        }
        czm czmVar = new czm(this);
        this.aE = czmVar;
        return czmVar;
    }

    public final void R(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        czy czyVar = this.q;
        if (affa.f(str, czyVar.o)) {
            int iD2 = czyVar.w.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!affa.f(str, czyVar.p) || (iD = czyVar.x.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public final void S() {
        af(this.o);
    }

    public final void T() {
        if (this.at) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.as) {
            this.as = jCurrentAnimationTimeMillis;
            ai();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.ap;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            float f4 = iArr[0];
            float f5 = iArr[1];
            this.au = (Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(f3 - f5) & 4294967295L);
        }
    }

    public final void U(cxb cxbVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (cxbVar != null) {
            while (cxbVar != null && cxbVar.aw() == 1) {
                if (!this.an) {
                    cxb cxbVarL = cxbVar.l();
                    if (cxbVarL == null) {
                        break;
                    }
                    long j = cxbVarL.p().d;
                    if (dle.j(j) && dle.i(j)) {
                        break;
                    }
                }
                cxbVar = cxbVar.l();
            }
            if (cxbVar == this.o) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void V(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        int i2 = 0;
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        int i4 = 1;
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((actionIndex < 0 || actionIndex > i6) ? i2 : i4) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            float f2 = pointerCoords.x;
            long jL = l((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jL >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jL & 4294967295L));
            i6++;
            i2 = 0;
            i4 = 1;
        }
        int buttonState = z ? 0 : motionEvent.getButtonState();
        long downTime = motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime();
        if (i != 9 && i != 7 && i != 10 && Build.VERSION.SDK_INT >= 29) {
            motionEvent.getClassification();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(downTime, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        tj tjVarF = this.ak.f(motionEventObtain, this);
        tjVarF.getClass();
        this.aL.d(tjVarF, this, true);
        motionEventObtain.recycle();
    }

    public final void W(day dayVar) {
        if (this.j != dayVar.a().d() && !this.o.v().isEmpty()) {
            crt.b("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        cec cecVar = (cec) cek.i.j();
        afec afecVarI = cecVar != null ? cecVar.i() : null;
        cec cecVarI = byx.i(cecVar);
        try {
            day dayVarP = P();
            byx.l(cecVar, cecVarI, afecVarI);
            if (affa.f(dayVar, dayVarP)) {
                return;
            }
            if (isAttachedToWindow()) {
                dayVarP.f();
                dayVar.g();
            }
            this.ac.b(dayVar);
            this.j = dayVar.a().d();
        } catch (Throwable th) {
            byx.l(cecVar, cecVarI, afecVarI);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bym, java.lang.Object] */
    public final boolean Y() {
        kwp kwpVar;
        if (Build.VERSION.SDK_INT >= 31 && (kwpVar = this.aN) != null && ((Boolean) kwpVar.a.a()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof czq) {
                return ((czq) parent).Y();
            }
        }
        return false;
    }

    public final kwp aa() {
        kwp kwpVar = this.aO;
        if (kwpVar == null) {
            kwpVar = new kwp(true != isInTouchMode() ? 2 : 1);
            this.aO = kwpVar;
        }
        return kwpVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ciu ciuVar = this.J.b;
        if (!ciuVar.A) {
            return;
        }
        if (!ciuVar.q.A) {
            crt.c("visitSubtreeIf called on an unattached node");
        }
        byw bywVar = new byw(new cfx[16]);
        cfx cfxVar = ciuVar.q;
        cfx cfxVar2 = cfxVar.u;
        if (cfxVar2 == null) {
            bzi.w(bywVar, cfxVar);
        } else {
            bywVar.n(cfxVar2);
        }
        while (true) {
            int i3 = bywVar.b;
            if (i3 == 0) {
                return;
            }
            cfx cfxVar3 = (cfx) bywVar.c(i3 - 1);
            if ((cfxVar3.s & 1024) != 0) {
                for (cfx cfxVar4 = cfxVar3; cfxVar4 != null && cfxVar4.A; cfxVar4 = cfxVar4.u) {
                    if ((cfxVar4.r & 1024) != 0) {
                        cfx cfxVarN = cfxVar4;
                        byw bywVar2 = null;
                        while (cfxVarN != null) {
                            int i4 = 0;
                            if (cfxVarN instanceof ciu) {
                                ciu ciuVar2 = (ciu) cfxVarN;
                                if (ciuVar2.A && ((cig) ciuVar2.b()).a) {
                                    super.addFocusables(arrayList, i, i2);
                                    if (ciuVar.A) {
                                        if (!ciuVar.q.A) {
                                            crt.c("visitSubtreeIf called on an unattached node");
                                        }
                                        byw bywVar3 = new byw(new cfx[16]);
                                        cfx cfxVar5 = ciuVar.q;
                                        cfx cfxVar6 = cfxVar5.u;
                                        if (cfxVar6 == null) {
                                            bzi.w(bywVar3, cfxVar5);
                                        } else {
                                            bywVar3.n(cfxVar6);
                                        }
                                        while (true) {
                                            int i5 = bywVar3.b;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            cfx cfxVar7 = (cfx) bywVar3.c(i5 - 1);
                                            if ((cfxVar7.s & 1024) != 0) {
                                                for (cfx cfxVar8 = cfxVar7; cfxVar8 != null && cfxVar8.A; cfxVar8 = cfxVar8.u) {
                                                    if ((cfxVar8.r & 1024) != 0) {
                                                        cfx cfxVarN2 = cfxVar8;
                                                        byw bywVar4 = null;
                                                        while (cfxVarN2 != null) {
                                                            if (cfxVarN2 instanceof ciu) {
                                                                ciu ciuVar3 = (ciu) cfxVarN2;
                                                                if (ciuVar3.A) {
                                                                    cie cieVarB = ciuVar3.b();
                                                                    if (ciuVar3.A && !ciuVar3.a && ((cig) cieVarB).a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((cfxVarN2.r & 1024) != 0 && (cfxVarN2 instanceof cwe)) {
                                                                int i6 = 0;
                                                                for (cfx cfxVar9 = ((cwe) cfxVarN2).C; cfxVar9 != null; cfxVar9 = cfxVar9.u) {
                                                                    if ((cfxVar9.r & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            cfxVarN2 = cfxVar9;
                                                                        } else {
                                                                            if (bywVar4 == null) {
                                                                                bywVar4 = new byw(new cfx[16]);
                                                                            }
                                                                            if (cfxVarN2 != null) {
                                                                                bywVar4.n(cfxVarN2);
                                                                            }
                                                                            bywVar4.n(cfxVar9);
                                                                            cfxVarN2 = null;
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 != 1) {
                                                                }
                                                            }
                                                            cfxVarN2 = bzi.n(bywVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            bzi.w(bywVar3, cfxVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                for (cfx cfxVar10 = ((cwe) cfxVarN).C; cfxVar10 != null; cfxVar10 = cfxVar10.u) {
                                    if ((cfxVar10.r & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cfxVarN = cfxVar10;
                                        } else {
                                            if (bywVar2 == null) {
                                                bywVar2 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar2.n(cfxVarN);
                                            }
                                            bywVar2.n(cfxVar10);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar2);
                        }
                    }
                }
            }
            bzi.w(bywVar, cfxVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        ddr ddrVarR;
        cgi cgiVar = this.Q;
        if (cgiVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValueM9m = a$$ExternalSyntheticApiModelOutline0.m9m(sparseArray.get(iKeyAt));
                cxb cxbVar = (cxb) ((zh) cgiVar.i.a).a(iKeyAt);
                if (cxbVar != null && (ddrVarR = cxbVar.r()) != null) {
                    ddf ddfVar = (ddf) ddrVarR.g(ddq.g);
                    if (ddfVar != null) {
                    }
                    ddf ddfVar2 = (ddf) ddrVarR.g(ddq.h);
                    if (ddfVar2 != null) {
                    }
                }
            }
        }
        cge cgeVar = this.u;
        if (cgeVar != null) {
            ?? r9 = cgeVar.c.a;
            if (r9.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValueM9m2 = a$$ExternalSyntheticApiModelOutline0.m9m(sparseArray.get(iKeyAt2));
                if (autofillValueM9m2.isText()) {
                    autofillValueM9m2.getTextValue().toString();
                    if (((cgj) r9.get(Integer.valueOf(iKeyAt2))) != null) {
                        throw null;
                    }
                } else {
                    if (autofillValueM9m2.isDate()) {
                        throw new aezt("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValueM9m2.isList()) {
                        throw new aezt("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValueM9m2.isToggle()) {
                        throw new aezt("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.q.z(false, i, this.ad);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.q.z(true, i, this.ad);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [cju, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            af(this.o);
        }
        v(true);
        cek.b().e();
        this.s = true;
        ?? r0 = P().p.a;
        Canvas canvas2 = ((cje) r0).a;
        ((cje) r0).a = canvas;
        this.o.C(r0, null);
        ((cje) r0).a = canvas2;
        aag aagVar = this.N;
        if (aagVar.g()) {
            int i = aagVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((cyk) aagVar.c(i2)).j();
            }
        }
        int i3 = dce.a;
        aagVar.k();
        this.s = false;
        aag aagVar2 = this.O;
        if (aagVar2 != null) {
            this.N.q(aagVar2);
            aagVar2.k();
        }
        if (a.P()) {
            if (Float.compare(this.az, this.aB) != 0) {
                float f2 = this.az;
                this.aB = f2;
                dat.a(this, f2);
            }
            View view = this.ai;
            if (view != null) {
                if (Float.compare(this.aA, this.aC) != 0) {
                    float f3 = this.aA;
                    this.aC = f3;
                    dat.a(view, f3);
                }
                if (!Float.isNaN(this.aA)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
            }
            this.az = Float.NaN;
            this.aA = Float.NaN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a9  */
    /* JADX WARN: Type inference failed for: r0v17, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v22, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v23, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46, types: [byw] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49, types: [byw] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [byw] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v74 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r37) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r6 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
    
        if (am(r19) == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.J.h(keyEvent, new bsh(this, keyEvent, 6));
        }
        dbp dbpVar = P().i;
        dcg.a.b(new crb(keyEvent.getMetaState()));
        return this.J.h(keyEvent, new blz(3)) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0202 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [cfx] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cfx] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [cfx] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [byw] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.aI = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.aI = false;
            ah(viewStructure);
        } catch (Throwable th) {
            this.aI = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object dauVar;
        cic cicVar;
        ciu ciuVarB;
        if (this.G) {
            Runnable runnable = this.aD;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.E;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || an(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.G = false;
            }
        }
        if (ao(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !am(motionEvent))) {
            return false;
        }
        int iAb = ab(motionEvent);
        if ((iAb & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
        if (z && z2) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null || (dauVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                dauVar = new dau();
            }
            if (affa.f(dauVar, new dau()) && (ciuVarB = (cicVar = this.J).b()) != null) {
                cst cstVarO = bzi.o(ciuVarB);
                if (!crt.j(cstVarO).o(cstVarO, true).g((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                    cicVar.k(false, true, 8);
                }
            }
        }
        return (iAb & 1) != 0;
    }

    @Override // defpackage.chy
    public final void eP(ciu ciuVar, ciu ciuVar2) {
        int i;
        cxx cxxVar;
        boolean z;
        cxx cxxVar2;
        boolean z2;
        if (ciuVar != null) {
            if (!ciuVar.q.A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar = ciuVar.q;
            cxb cxbVarQ = bzi.q(ciuVar);
            aap aapVar = null;
            ArrayList arrayList = null;
            while (true) {
                if (cxbVarQ == null) {
                    break;
                }
                if ((cxbVarQ.v.f.s & 2097152) != 0) {
                    while (cfxVar != null) {
                        if ((cfxVar.r & 2097152) != 0) {
                            cfx cfxVarN = cfxVar;
                            byw bywVar = null;
                            while (cfxVarN != null) {
                                if (cfxVarN instanceof cpm) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cfxVarN);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cfxVarN.r & 2097152) != 0 && (cfxVarN instanceof cwe)) {
                                    int i2 = 0;
                                    for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                        if ((cfxVar2.r & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cfxVarN = cfxVar2;
                                            } else {
                                                if (bywVar == null) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cfxVarN != null) {
                                                    bywVar.n(cfxVarN);
                                                }
                                                bywVar.n(cfxVar2);
                                                cfxVarN = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cfxVarN = bzi.n(bywVar);
                            }
                        }
                        cfxVar = cfxVar.t;
                    }
                }
                cxbVarQ = cxbVarQ.l();
                cfxVar = (cxbVarQ == null || (cxxVar2 = cxbVarQ.v) == null) ? null : cxxVar2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (ciuVar2 != null) {
                if (!ciuVar2.q.A) {
                    crt.c("visitAncestors called on an unattached node");
                }
                cfx cfxVar3 = ciuVar2.q;
                cxb cxbVarQ2 = bzi.q(ciuVar2);
                aap aapVar2 = null;
                while (cxbVarQ2 != null) {
                    if ((cxbVarQ2.v.f.s & 2097152) != 0) {
                        while (cfxVar3 != null) {
                            if ((cfxVar3.r & 2097152) != 0) {
                                cfx cfxVarN2 = cfxVar3;
                                byw bywVar2 = null;
                                while (cfxVarN2 != null) {
                                    if (cfxVarN2 instanceof cpm) {
                                        if (aapVar2 == null) {
                                            aap aapVar3 = aaq.a;
                                            aapVar2 = new aap(6);
                                        }
                                        aapVar2.j(cfxVarN2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cfxVarN2.r & 2097152) != 0 && (cfxVarN2 instanceof cwe)) {
                                        int i3 = 0;
                                        for (cfx cfxVar4 = ((cwe) cfxVarN2).C; cfxVar4 != null; cfxVar4 = cfxVar4.u) {
                                            if ((cfxVar4.r & 2097152) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cfxVarN2 = cfxVar4;
                                                } else {
                                                    if (bywVar2 == null) {
                                                        bywVar2 = new byw(new cfx[16]);
                                                    }
                                                    if (cfxVarN2 != null) {
                                                        bywVar2.n(cfxVarN2);
                                                    }
                                                    bywVar2.n(cfxVar4);
                                                    cfxVarN2 = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    cfxVarN2 = bzi.n(bywVar2);
                                }
                            }
                            cfxVar3 = cfxVar3.t;
                        }
                    }
                    cxbVarQ2 = cxbVarQ2.l();
                    cfxVar3 = (cxbVarQ2 == null || (cxxVar = cxbVarQ2.v) == null) ? null : cxxVar.e;
                }
                aapVar = aapVar2;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                cpm cpmVar = (cpm) arrayList.get(i);
                if (aapVar == null || !aapVar.a(cpmVar)) {
                    cpmVar.I();
                }
            }
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        dbr dbrVar = this.af;
        if (dbrVar != null) {
            dbq dbqVar = dbrVar.a;
            if (dbqVar.b()) {
                dbrVar.a(null);
                return;
            }
            cdg cdgVar = dbqVar.a;
            if (cdgVar.b) {
                return;
            }
            if (!cdgVar.c) {
                cdj.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cdgVar.d.d()) {
                cdj.a("Attempted to start retaining exited values with pending exited values");
            }
            cdgVar.c = false;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        czz czzVar = S;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return czzVar.l(i, this);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        cjb cjbVarB;
        if (view == null || this.z.b) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !czz.k(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (cjbVarB = this.J.c()) == null) {
            cjbVarB = chw.b(view, this);
        }
        chr chrVarA = chw.a(i);
        int i2 = chrVarA != null ? chrVarA.a : 6;
        affv affvVar = new affv();
        if (this.J.d(i2, cjbVarB, new chk(affvVar, 14)) == null) {
            return view;
        }
        Object obj = affvVar.a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || lv.q(i2) || re.m(mt.q((ciu) obj), chw.b(viewFindNextFocus, this), cjbVarB, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        if (Build.VERSION.SDK_INT < 30) {
            this.x = czz.m();
        }
        dbr dbrVar = this.af;
        if (dbrVar != null) {
            dcq dcqVar = this.I;
            dcqVar.getClass();
            dbrVar.b(dcqVar);
        }
    }

    @Override // defpackage.cix
    public final cjb g() {
        if (isFocused()) {
            return this.J.c();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return chw.b(viewFindFocus, this);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        cjb cjbVarG = g();
        if (cjbVarG == null) {
            if (affa.f(this.J.d(6, null, new cmj(11)), true)) {
                super.getFocusedRect(rect);
                return;
            } else {
                rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                return;
            }
        }
        rect.left = Math.round(cjbVarG.b);
        rect.top = Math.round(cjbVarG.c);
        rect.right = Math.round(cjbVarG.d);
        rect.bottom = Math.round(cjbVarG.e);
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.cix
    public final void h() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // defpackage.cix
    public final boolean i(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer numD = chw.d(i);
        if (numD == null) {
            crt.a("Invalid focus direction");
            throw new aezp();
        }
        cic cicVar = this.J;
        int iIntValue = numD.intValue();
        ciu ciuVarB = cicVar.b();
        if (ciuVarB == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numD2 = chw.d(i);
        if (numD2 == null) {
            crt.a("Invalid focus direction");
            throw new aezp();
        }
        int iIntValue2 = numD2.intValue();
        View viewH = bzi.q(ciuVarB).h();
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || viewH == null || !czz.k(viewH, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return chw.e(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    @Override // defpackage.cix
    public final boolean j() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // defpackage.cqg
    public final void k(float[] fArr) {
        T();
        cki.d(fArr, this.A);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.au >> 32));
        long j = this.au & 4294967295L;
        float[] fArr2 = this.aq;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        cki.c(fArr2);
        cki.g(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        czz.i(fArr, fArr2);
    }

    @Override // defpackage.crd
    public final long l(long j) {
        T();
        long jA = cki.a(this.A, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) + Float.intBitsToFloat((int) (this.au >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) + Float.intBitsToFloat((int) (this.au & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.crd
    public final long m(long j) {
        T();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.au >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.au & 4294967295L));
        return cki.a(this.B, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // defpackage.cyj
    public final void n(afdr afdrVar) {
        afaz afazVar = this.i;
        boolean zIsEmpty = afazVar.isEmpty();
        afazVar.addLast(afdrVar);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.ag);
        }
    }

    @Override // defpackage.cym
    public final cyk o(afeg afegVar, afdr afdrVar, cmi cmiVar) {
        Object obj;
        if (cmiVar != null) {
            return new dbj(cmiVar, null, this, afegVar, afdrVar);
        }
        bii biiVar = this.U;
        biiVar.l();
        while (true) {
            byw bywVar = (byw) biiVar.b;
            int i = bywVar.b;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) bywVar.c(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        cyk cykVar = (cyk) obj;
        if (cykVar != null) {
            cykVar.h(afegVar, afdrVar);
            return cykVar;
        }
        cji cjiVar = this.P;
        return new dbj(cjiVar.a(), cjiVar, this, afegVar, afdrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        cdi cdiVar;
        Object obj;
        super.onAttachedToWindow();
        cxb cxbVar = this.o;
        if (!cxbVar.am()) {
            cxbVar.y(this);
        }
        aj(true);
        if (Build.VERSION.SDK_INT < 30) {
            this.x = czz.m();
        }
        cso csoVar = this.n;
        if (csoVar != null) {
            csoVar.onViewAttachedToWindow(this);
        }
        P().g();
        ag(cxbVar);
        af(cxbVar);
        ((ces) this.w.a).c();
        czq czqVarN = N();
        if (czqVarN == null) {
            throw new IllegalStateException("Expected the view to be attached to window.");
        }
        czqVarN.n(new bxh(this, 13));
        P().b();
        eru eruVarC = P().c();
        dcq dcqVar = this.I;
        if (eruVarC == null || dcqVar == null) {
            cdiVar = null;
        } else {
            ert viewModelStore = eruVarC.getViewModelStore();
            err errVar = new err();
            esa esaVar = esa.a;
            viewModelStore.getClass();
            esaVar.getClass();
            dbs dbsVar = (dbs) new ers(viewModelStore, errVar, esaVar).b(affw.a.getOrCreateKotlinClass(dbs.class));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            zh zhVar = dbsVar.a;
            Object objA = zhVar.a(id);
            if (objA == null) {
                objA = new aag(1);
                zhVar.g(id, objA);
            }
            aag aagVar = (aag) objA;
            Object[] objArr = aagVar.a;
            int i = aagVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((dbr) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            dbr dbrVar = (dbr) obj;
            if (dbrVar == null) {
                dbrVar = new dbr();
                aagVar.p(dbrVar);
            }
            dbrVar.c = true;
            this.af = dbrVar;
            cdiVar = dbrVar.b;
        }
        if (cdiVar == null) {
            cdiVar = cde.a;
        }
        this.h = cdiVar;
        afec afecVar = this.C;
        if (afecVar != null) {
            afecVar.invoke(P());
            this.C = null;
        }
        ept lifecycle = P().b().getLifecycle();
        lifecycle.c(this);
        lifecycle.c(this.r);
        aa().p(true != isInTouchMode() ? 2 : 1);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            das.c(this);
        }
        cgi cgiVar = this.Q;
        if (cgiVar != null) {
            this.J.e.p(cgiVar);
            ((aag) this.W.c).p(cgiVar);
        }
        this.J.e.p(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        sx sxVar = (sx) this.aw.get();
        dac dacVar = (dac) (sxVar != null ? sxVar.a : null);
        if (dacVar == null) {
            return ac().b;
        }
        sx sxVar2 = (sx) dacVar.c.get();
        rhi rhiVar = (rhi) (sxVar2 != null ? sxVar2.a : null);
        return (rhiVar == null || rhiVar.a) ? false : true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ak(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        sx sxVar = (sx) this.aw.get();
        dac dacVar = (dac) (sxVar != null ? sxVar.a : null);
        int i2 = 7;
        if (dacVar == null) {
            djx djxVarAc = ac();
            if (!djxVarAc.b) {
                return null;
            }
            dje djeVar = djxVarAc.f;
            djv djvVar = djxVarAc.e;
            int i3 = djeVar.f;
            if (i3 == 1) {
                i2 = djeVar.b ? 6 : 0;
            } else if (i3 == 0) {
                i2 = 1;
            } else if (i3 == 2) {
                i2 = 2;
            } else if (i3 == 6) {
                i2 = 5;
            } else if (i3 != 5) {
                if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 4) {
                    i2 = 4;
                } else {
                    if (i3 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
            }
            editorInfo.imeOptions = i2;
            int i4 = djeVar.e;
            editorInfo.inputType = 1;
            if (!djeVar.b && (editorInfo.inputType & 15) == 1) {
                editorInfo.inputType |= 131072;
                if (i3 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 15) == 1) {
                int i5 = djeVar.c;
                boolean z = djeVar.d;
                editorInfo.inputType |= 32768;
            }
            long j = djvVar.b;
            long j2 = dfv.a;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            eds.a(editorInfo, djvVar.a());
            editorInfo.imeOptions |= 33554432;
            emr emrVar = emr.b;
            djv djvVar2 = djxVarAc.e;
            boolean z2 = djxVarAc.f.d;
            djr djrVar = new djr(djvVar2, new izj(djxVarAc));
            djxVarAc.g.add(new WeakReference(djrVar));
            return djrVar;
        }
        sx sxVar2 = (sx) dacVar.c.get();
        rhi rhiVar = (rhi) (sxVar2 != null ? sxVar2.a : null);
        if (rhiVar == null) {
            return null;
        }
        synchronized (rhiVar.e) {
            if (rhiVar.a) {
                return null;
            }
            Object obj = rhiVar.d;
            String strA = ((bip) obj).g.a();
            long j3 = ((bip) obj).g.b;
            dje djeVar2 = ((bip) obj).h;
            int i6 = djeVar2.f;
            if (i6 == 1) {
                i = djeVar2.b ? 6 : 0;
            } else if (i6 == 0) {
                i = 1;
            } else if (i6 == 2) {
                i = 2;
            } else if (i6 == 6) {
                i = 5;
            } else if (i6 == 5) {
                i = 7;
            } else if (i6 == 3) {
                i = 3;
            } else if (i6 == 4) {
                i = 4;
            } else if (i6 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            editorInfo.imeOptions = i;
            dkd dkdVar = djeVar2.g;
            if (affa.f(dkdVar, dkd.a)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(woy.bp(dkdVar, 10));
                Iterator<E> it = dkdVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dkc) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            int i7 = djeVar2.e;
            editorInfo.inputType = 1;
            if (!djeVar2.b && (editorInfo.inputType & 15) == 1) {
                editorInfo.inputType |= 131072;
                if (i6 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 15) == 1) {
                int i8 = djeVar2.c;
                boolean z3 = djeVar2.d;
                editorInfo.inputType |= 32768;
                if (Build.VERSION.SDK_INT >= 37) {
                    editorInfo.inputType |= 2097152;
                }
            }
            long j4 = dfv.a;
            editorInfo.initialSelStart = (int) (j3 >> 32);
            editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
            eds.a(editorInfo, strA);
            editorInfo.imeOptions |= 33554432;
            if (bhv.a) {
                eds.b(editorInfo, true);
                editorInfo.setSupportedHandwritingGestures(woy.bi(awx$$ExternalSyntheticApiModelOutline0.m195m$1(), awx$$ExternalSyntheticApiModelOutline0.m$5(), awx$$ExternalSyntheticApiModelOutline0.m$6(), awx$$ExternalSyntheticApiModelOutline0.m190m(), awx$$ExternalSyntheticApiModelOutline0.m$2(), awx$$ExternalSyntheticApiModelOutline0.m$3(), awx$$ExternalSyntheticApiModelOutline0.m$4()));
                editorInfo.setSupportedHandwritingGesturePreviews(woy.di(new Class[]{awx$$ExternalSyntheticApiModelOutline0.m195m$1(), awx$$ExternalSyntheticApiModelOutline0.m$5(), awx$$ExternalSyntheticApiModelOutline0.m$6(), awx$$ExternalSyntheticApiModelOutline0.m190m()}));
            } else {
                eds.b(editorInfo, false);
            }
            emr emrVar2 = emr.b;
            djv djvVar3 = ((bip) obj).g;
            boolean z4 = ((bip) obj).h.d;
            biq biqVar = new biq(djvVar3, new izj(obj), ((bip) obj).d, ((bip) obj).e, ((bip) obj).f);
            ((bip) obj).i.add(new WeakReference(biqVar));
            chk chkVar = new chk(rhiVar, 18);
            InputConnection djkVar = Build.VERSION.SDK_INT >= 34 ? new djk(biqVar, chkVar) : new djj(biqVar, chkVar);
            ((byw) rhiVar.b).n(new czc(djkVar));
            return djkVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        Object obj;
        for (long j : jArr) {
            cgq cgqVar = this.r;
            hig higVar = (hig) cgqVar.h().a((int) j);
            if (higVar != null && (obj = higVar.b) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(cgqVar.a.getAutofillId(), r2.c);
                List list = (List) ((ddu) obj).b.g(ddx.D);
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new deu(dlz.c(list, "\n", null, null, null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aj(false);
        dbl dblVar = this.aF;
        dblVar.b = 0;
        dblVar.c = true;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        dblVar.d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        cso csoVar = this.n;
        if (csoVar != null) {
            csoVar.onViewDetachedFromWindow(this);
        }
        View view = this.ai;
        if (a.P() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            aag aagVar = L;
            synchronized (aagVar) {
                aagVar.o(this);
            }
        }
        P().f();
        ces cesVar = (ces) this.w.a;
        cesVar.d();
        cesVar.a();
        ept lifecycle = P().b().getLifecycle();
        lifecycle.d(this.r);
        lifecycle.d(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        dbr dbrVar = this.af;
        if (dbrVar != null) {
            dbrVar.c = false;
        }
        this.af = null;
        if (Build.VERSION.SDK_INT >= 31) {
            das.b(this);
        }
        cgi cgiVar = this.Q;
        if (cgiVar != null) {
            ((aag) this.W.c).o(cgiVar);
            this.J.e.o(cgiVar);
        }
        dei deiVar = this.p;
        deiVar.e = deiVar.c.a(0L, 0L, null, 0, 0);
        deiVar.c();
        deiVar.g();
        this.J.e.o(this);
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        cic cicVar = this.J;
        mt.t(cicVar.b, true);
        if (cicVar.b() != null) {
            ciu ciuVarB = cicVar.b();
            cicVar.g(null);
            if (ciuVarB != null) {
                ciuVarB.l(cis.a, cis.d);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.as = 0L;
        al();
        int i = Build.VERSION.SDK_INT;
        if (i < 32 || i >= 34) {
            return;
        }
        ak(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.as = 0L;
        this.z.i(this.aG);
        this.am = null;
        al();
        dal dalVar = this.y;
        if (dalVar != null) {
            dalVar.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        cxb cxbVar = this.o;
        if (!cxbVar.am()) {
            cxbVar.y(this);
        }
        if (!isAttachedToWindow()) {
            ag(cxbVar);
        }
        long jAq = aq(i);
        long jAq2 = aq(i2);
        long jT = dlf.t((int) (jAq >>> 32), (int) (jAq & 4294967295L), (int) (jAq2 >>> 32), (int) (4294967295L & jAq2));
        dle dleVar = this.am;
        if (dleVar == null) {
            this.am = new dle(jT);
            this.an = false;
        } else if (dleVar.a != jT) {
            this.an = true;
        }
        cxp cxpVar = this.z;
        dle dleVar2 = cxpVar.g;
        if (dleVar2 == null || dleVar2.a != jT) {
            if (cxpVar.b) {
                crt.b("updateRootConstraints called while measuring");
            }
            cxpVar.g = new dle(jT);
            cxb cxbVar2 = cxpVar.a;
            if (cxbVar2.am()) {
                if (cxbVar2.j != null) {
                    cxbVar2.M();
                }
                cxbVar2.N();
                cxpVar.i.x(cxbVar2, cxbVar2.j != null ? 1 : 3);
            }
        }
        nfh nfhVar = cxpVar.i;
        if (nfhVar.u()) {
            cxb cxbVar3 = cxpVar.a;
            if (!cxbVar3.am()) {
                crt.b("performMeasureAndLayout called with unattached root");
            }
            if (!cxbVar3.an()) {
                crt.b("performMeasureAndLayout called with unplaced root");
            }
            if (cxpVar.b) {
                crt.b("performMeasureAndLayout called during measure layout");
            }
            if (cxpVar.g != null) {
                cxpVar.b = true;
                cxpVar.c = false;
                try {
                    if (!((cwf) nfhVar.c).d() && !((cwf) nfhVar.a).d()) {
                        if (cxbVar3.j != null) {
                            cxpVar.g(cxbVar3, true);
                        } else {
                            cxpVar.f(cxbVar3);
                        }
                    }
                    cxpVar.g(cxbVar3, false);
                    cxpVar.b = false;
                    cxpVar.c = false;
                    cjn cjnVar = cxpVar.h;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cxpVar.b = false;
                        cxpVar.c = false;
                        throw th2;
                    }
                }
            }
        }
        cxb cxbVar4 = this.o;
        setMeasuredDimension(cxbVar4.g(), cxbVar4.e());
        dal dalVar = this.y;
        if (dalVar != null) {
            dalVar.measure(View.MeasureSpec.makeMeasureSpec(cxbVar4.g(), 1073741824), View.MeasureSpec.makeMeasureSpec(cxbVar4.e(), 1073741824));
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.aI) {
            return;
        }
        ah(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        cqr cqrVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (cqrVar = this.K.b) == null) ? super.onResolvePointerIcon(motionEvent, i) : dan.a(getContext(), cqrVar);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.ae) {
            dlr dlrVarC = chw.c(i);
            if (dlrVarC == null) {
                dlrVarC = dlr.a;
            }
            this.ay.b(dlrVarC);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        kwp kwpVar;
        if (Build.VERSION.SDK_INT < 31 || (kwpVar = this.aN) == null) {
            return;
        }
        mko mkoVar = this.W;
        afco afcoVar = this.j;
        byw bywVar = new byw(new dde[16]);
        vq.d(mkoVar.A(), 0, new ddd(bywVar));
        bywVar.j(new czs(new afec[]{new cmj(14), new cmj(15)}, 11));
        int i = bywVar.b;
        dde ddeVar = (dde) (i == 0 ? null : bywVar.a[i - 1]);
        if (ddeVar == null) {
            return;
        }
        aitx aitxVarB = ahni.b(afcoVar);
        ddu dduVar = ddeVar.a;
        dlp dlpVar = ddeVar.c;
        dcy dcyVar = new dcy(dduVar, dlpVar, aitxVarB, kwpVar, this);
        cst cstVar = ddeVar.d;
        cjb cjbVarO = crt.j(cstVar).o(cstVar, true);
        long jD = dlpVar.d();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, ckf.d(dlf.q(cjbVarO)), new Point((int) (jD >> 32), (int) (jD & 4294967295L)), dcyVar);
        scrollCaptureTarget.setScrollBounds(ckf.d(dlpVar));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        al();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        aa().p(true != z ? 2 : 1);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        cgq cgqVar = this.r;
        if (affa.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            xb.e(cgqVar, longSparseArray);
        } else {
            cgqVar.a.post(new af(cgqVar, longSparseArray, 16));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM;
        this.aH = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || F() == (zM = czz.m())) {
            return;
        }
        this.x = zM;
        S();
    }

    @Override // defpackage.cym
    public final cyp p() {
        return this.w;
    }

    @Override // defpackage.cym
    public final dcc q() {
        return P().g;
    }

    @Override // defpackage.cym
    public final dlg r() {
        return (dlg) this.ah.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        chr chrVarA = chw.a(i);
        int i2 = chrVarA != null ? chrVarA.a : 7;
        cic cicVar = this.J;
        if (affa.f(cicVar.d(i2, rect != null ? ckf.f(rect) : null, new cia(i2, 3)), true) || affa.f(cicVar.d(i2, null, new cia(i2, 4)), true)) {
            return true;
        }
        if (hasFocus() && lv.q(i2)) {
            return cicVar.j(i2);
        }
        return false;
    }

    @Override // defpackage.cym
    public final dlr s() {
        return (dlr) this.ay.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.afeg r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.czr
            if (r0 == 0) goto L13
            r0 = r7
            czr r0 = (defpackage.czr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            czr r0 = new czr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.woy.dF(r7)
            goto L4a
        L2f:
            defpackage.woy.dF(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.aw
            chk r2 = new chk
            r4 = 15
            r2.<init>(r5, r4)
            r0.c = r3
            cgb r5 = new cgb
            r3 = 0
            r5.<init>(r2, r7, r6, r3)
            java.lang.Object r5 = defpackage.ahni.a(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            aezp r5 = new aezp
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.t(afeg, afck):java.lang.Object");
    }

    @Override // defpackage.cym
    public final void u(cxb cxbVar, boolean z) {
        this.z.e(cxbVar, z);
    }

    @Override // defpackage.cym
    public final void v(boolean z) {
        cxp cxpVar = this.z;
        if (cxpVar.h() || cxpVar.d.c()) {
            if (cxpVar.i(z ? this.aG : this.H)) {
                requestLayout();
            }
            cxpVar.b(false);
            this.p.c();
            ae();
        }
    }

    @Override // defpackage.cym
    public final void w(cxb cxbVar, long j) {
        cxp cxpVar = this.z;
        if (!cxbVar.D) {
            cxb cxbVar2 = cxpVar.a;
            if (affa.f(cxbVar, cxbVar2)) {
                crt.b("measureAndLayout called on root");
            }
            if (!cxbVar2.am()) {
                crt.b("performMeasureAndLayout called with unattached root");
            }
            if (!cxbVar2.an()) {
                crt.b("performMeasureAndLayout called with unplaced root");
            }
            if (cxpVar.b) {
                crt.b("performMeasureAndLayout called during measure layout");
            }
            if (cxpVar.g != null) {
                cxpVar.b = true;
                cxpVar.c = false;
                try {
                    cxpVar.i.w(cxbVar);
                    if ((cxp.k(cxbVar, new dle(j)) || cxbVar.aj()) && affa.f(cxbVar.s(), true)) {
                        cxbVar.K();
                    }
                    cxpVar.d(cxbVar);
                    cxp.l(cxbVar, new dle(j));
                    if (cxbVar.ai() && cxbVar.an()) {
                        cxbVar.T();
                        cxpVar.d.b(cxbVar);
                    }
                    cxpVar.c();
                    cxpVar.b = false;
                    cxpVar.c = false;
                    cjn cjnVar = cxpVar.h;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cxpVar.b = false;
                        cxpVar.c = false;
                        throw th2;
                    }
                }
            }
            cxpVar.a();
        }
        cxp cxpVar2 = this.z;
        if (cxpVar2.h()) {
            return;
        }
        cxpVar2.b(false);
        this.p.c();
        this.H.invoke();
        ae();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[Catch: all -> 0x015c, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x0021, B:11:0x0033, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:18:0x0060, B:20:0x007f, B:23:0x0095, B:25:0x00a3, B:27:0x00ad, B:29:0x00b3, B:31:0x00c3, B:39:0x00e0, B:41:0x00e8, B:44:0x00f7, B:35:0x00ce, B:50:0x0115, B:52:0x0127, B:54:0x012d, B:58:0x013e, B:57:0x0134, B:59:0x0147), top: B:91:0x0017 }] */
    @Override // defpackage.cym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czq.x():void");
    }

    @Override // defpackage.cym
    public final void y(cxb cxbVar) {
        czy czyVar = this.q;
        czyVar.m = true;
        if (czyVar.B()) {
            czyVar.u(cxbVar);
        }
        cgq cgqVar = this.r;
        cgqVar.b = true;
        if (cgqVar.n()) {
            cgqVar.k();
        }
    }

    @Override // defpackage.cym
    public final void z(cxb cxbVar, boolean z, boolean z2, boolean z3) {
        cxb cxbVarL;
        cxb cxbVarL2;
        cxp cxpVar = this.z;
        if (!z) {
            if (cxpVar.j(cxbVar, z2) && z3) {
                U(cxbVar);
                return;
            }
            return;
        }
        if (cxbVar.j == null) {
            crt.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAv = cxbVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new aezs();
                }
                if (!cxbVar.ak() || z2) {
                    cxbVar.M();
                    cxbVar.N();
                    if (cxbVar.D) {
                        return;
                    }
                    if ((affa.f(cxbVar.s(), true) || cxp.m(cxbVar)) && ((cxbVarL = cxbVar.l()) == null || !cxbVarL.ak())) {
                        cxpVar.i.x(cxbVar, 1);
                    } else if ((cxbVar.an() || cxp.n(cxbVar)) && ((cxbVarL2 = cxbVar.l()) == null || !cxbVarL2.al())) {
                        cxpVar.i.x(cxbVar, 3);
                    }
                    if (cxpVar.c || !z3) {
                        return;
                    }
                    U(cxbVar);
                    return;
                }
                return;
            }
        }
        cxpVar.f.n(new cxo(cxbVar, true, z2));
        cjn cjnVar = cxpVar.h;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
