package n2;

import A7.C0237b0;
import N1.C0754c;
import N1.C0765n;
import N1.O;
import N1.Q;
import Q1.x;
import U1.C0855z;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import k2.n0;
import l8.AbstractC3409K;
import l8.C3442x;
import l8.d0;
import l8.e0;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f40885j = new C3442x(new A0.f(18));

    /* renamed from: c, reason: collision with root package name */
    public final Object f40886c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f40887d;

    /* renamed from: e, reason: collision with root package name */
    public final ad.r f40888e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40889f;

    /* renamed from: g, reason: collision with root package name */
    public C3586i f40890g;

    /* renamed from: h, reason: collision with root package name */
    public final C0237b0 f40891h;

    /* renamed from: i, reason: collision with root package name */
    public C0754c f40892i;

    public o(Context context) {
        ad.r rVar = new ad.r();
        int i5 = C3586i.f40847A;
        C3586i c3586i = new C3586i(new C3585h(context));
        this.f40886c = new Object();
        this.f40887d = context.getApplicationContext();
        this.f40888e = rVar;
        this.f40890g = c3586i;
        this.f40892i = C0754c.f8139e;
        boolean zI = x.I(context);
        this.f40889f = zI;
        if (!zI && x.f9724a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            this.f40891h = audioManager == null ? null : new C0237b0(audioManager.getSpatializer(), 11);
        }
        boolean z2 = this.f40890g.f40852v;
    }

    public static int c(C0765n c0765n, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(c0765n.f8223d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(c0765n.f8223d);
        if (strF2 == null || strF == null) {
            return (z2 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        int i5 = x.f9724a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean h(C3586i c3586i, int i5, C0765n c0765n) {
        if ((i5 & 3584) == 0) {
            return false;
        }
        Q q4 = c3586i.f8112m;
        if (q4.f8084c && (i5 & 2048) == 0) {
            return false;
        }
        if (q4.f8083b) {
            boolean z2 = (c0765n.f8213F == 0 && c0765n.f8214G == 0) ? false : true;
            boolean z10 = (i5 & Segment.SHARE_MINIMUM) != 0;
            if (z2 && !z10) {
                return false;
            }
        }
        return true;
    }

    public static Pair i(int i5, R1.q qVar, int[][][] iArr, l lVar, Comparator comparator) {
        RandomAccess randomAccessN;
        R1.q qVar2 = qVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < qVar2.f10157a) {
            if (i5 == ((int[]) qVar2.f10158b)[i10]) {
                n0 n0Var = ((n0[]) qVar2.f10159c)[i10];
                for (int i11 = 0; i11 < n0Var.f39128a; i11++) {
                    O oA = n0Var.a(i11);
                    e0 e0VarC = lVar.c(i10, oA, iArr[i10][i11]);
                    int i12 = oA.f8073a;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        m mVar = (m) e0VarC.get(i13);
                        int iA = mVar.a();
                        if (!zArr[i13] && iA != 0) {
                            boolean z2 = true;
                            if (iA == 1) {
                                randomAccessN = AbstractC3409K.n(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i14 = i13 + 1;
                                while (i14 < i12) {
                                    boolean z10 = z2;
                                    m mVar2 = (m) e0VarC.get(i14);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i14] = z10;
                                    }
                                    i14++;
                                    z2 = z10;
                                }
                                randomAccessN = arrayList2;
                            }
                            arrayList.add(randomAccessN);
                        }
                    }
                }
            }
            i10++;
            qVar2 = qVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((m) list.get(i15)).f40869c;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(mVar3.f40868b, iArr2), Integer.valueOf(mVar3.f40867a));
    }

    @Override // n2.s
    public final void a() {
        C0237b0 c0237b0;
        C3587j c3587j;
        synchronized (this.f40886c) {
            try {
                if (x.f9724a >= 32 && (c0237b0 = this.f40891h) != null && (c3587j = (C3587j) c0237b0.f815e) != null && ((Handler) c0237b0.f814d) != null) {
                    ((Spatializer) c0237b0.f813c).removeOnSpatializerStateChangedListener(c3587j);
                    ((Handler) c0237b0.f814d).removeCallbacksAndMessages(null);
                    c0237b0.f814d = null;
                    c0237b0.f815e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f40895a = null;
        this.f40896b = null;
    }

    @Override // n2.s
    public final void b(C0754c c0754c) {
        boolean zEquals;
        synchronized (this.f40886c) {
            zEquals = this.f40892i.equals(c0754c);
            this.f40892i = c0754c;
        }
        if (zEquals) {
            return;
        }
        e();
    }

    public final C3586i d() {
        C3586i c3586i;
        synchronized (this.f40886c) {
            c3586i = this.f40890g;
        }
        return c3586i;
    }

    public final void e() {
        boolean z2;
        C0855z c0855z;
        C0237b0 c0237b0;
        synchronized (this.f40886c) {
            try {
                z2 = this.f40890g.f40852v && !this.f40889f && x.f9724a >= 32 && (c0237b0 = this.f40891h) != null && c0237b0.f812b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (c0855z = this.f40895a) == null) {
            return;
        }
        c0855z.f12218i.e(10);
    }

    public final void g() {
        synchronized (this.f40886c) {
            this.f40890g.getClass();
        }
    }

    public final void j(C3586i c3586i) {
        boolean zEquals;
        synchronized (this.f40886c) {
            zEquals = this.f40890g.equals(c3586i);
            this.f40890g = c3586i;
        }
        if (zEquals) {
            return;
        }
        if (c3586i.f40852v && this.f40887d == null) {
            Q1.k.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C0855z c0855z = this.f40895a;
        if (c0855z != null) {
            c0855z.f12218i.e(10);
        }
    }
}
