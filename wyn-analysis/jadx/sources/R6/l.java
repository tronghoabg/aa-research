package r6;

import A7.C0237b0;
import E5.O;
import E5.T;
import G5.C0527h;
import a9.C1341a;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import f6.Z;
import f6.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import l8.AbstractC3409K;
import l8.C3442x;
import l8.d0;
import l8.e0;
import n2.C3587j;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class l extends o {

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f44454j = new C3442x(new q6.d(3));
    public static final d0 k = new C3442x(new q6.d(4));

    /* renamed from: c, reason: collision with root package name */
    public final Object f44455c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f44456d;

    /* renamed from: e, reason: collision with root package name */
    public final C1341a f44457e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44458f;

    /* renamed from: g, reason: collision with root package name */
    public f f44459g;

    /* renamed from: h, reason: collision with root package name */
    public final C0237b0 f44460h;

    /* renamed from: i, reason: collision with root package name */
    public C0527h f44461i;

    public l(Context context) {
        C1341a c1341a = new C1341a();
        int i5 = f.f44414P;
        f fVar = new f(new C3930e(context));
        this.f44455c = new Object();
        this.f44456d = context != null ? context.getApplicationContext() : null;
        this.f44457e = c1341a;
        this.f44459g = fVar;
        this.f44461i = C0527h.f4408g;
        boolean z2 = context != null && v.x(context);
        this.f44458f = z2;
        if (!z2 && context != null && v.f46721a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            this.f44460h = audioManager != null ? new C0237b0(audioManager.getSpatializer(), 14) : null;
        }
        if (this.f44459g.f44424J && context == null) {
            AbstractC4256a.E("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void b(a0 a0Var, f fVar, HashMap map) {
        for (int i5 = 0; i5 < a0Var.f35030a; i5++) {
            p pVar = (p) fVar.f44516y.get(a0Var.a(i5));
            if (pVar != null) {
                Z z2 = pVar.f44466a;
                p pVar2 = (p) map.get(Integer.valueOf(z2.f35019c));
                if (pVar2 == null || (pVar2.f44467b.isEmpty() && !pVar.f44467b.isEmpty())) {
                    map.put(Integer.valueOf(z2.f35019c), pVar);
                }
            }
        }
    }

    public static int c(T t10, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(t10.f3230c)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(t10.f3230c);
        if (strG2 == null || strG == null) {
            return (z2 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i5 = v.f46721a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean e(int i5, boolean z2) {
        int i10 = i5 & 7;
        if (i10 != 4) {
            return z2 && i10 == 3;
        }
        return true;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i5, R1.q qVar, int[][][] iArr, i iVar, Comparator comparator) {
        RandomAccess randomAccessN;
        R1.q qVar2 = qVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < qVar2.f10157a) {
            if (i5 == ((int[]) qVar2.f10158b)[i10]) {
                a0 a0Var = ((a0[]) qVar2.f10159c)[i10];
                for (int i11 = 0; i11 < a0Var.f35030a; i11++) {
                    Z zA = a0Var.a(i11);
                    e0 e0VarA = iVar.a(i10, zA, iArr[i10][i11]);
                    int i12 = zA.f35017a;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        j jVar = (j) e0VarA.get(i13);
                        int iA = jVar.a();
                        if (!zArr[i13] && iA != 0) {
                            boolean z2 = true;
                            if (iA == 1) {
                                randomAccessN = AbstractC3409K.n(jVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(jVar);
                                int i14 = i13 + 1;
                                while (i14 < i12) {
                                    boolean z10 = z2;
                                    j jVar2 = (j) e0VarA.get(i14);
                                    if (jVar2.a() == 2 && jVar.b(jVar2)) {
                                        arrayList2.add(jVar2);
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
            iArr2[i15] = ((j) list.get(i15)).f44439c;
        }
        j jVar3 = (j) list.get(0);
        return Pair.create(new m(0, jVar3.f44438b, iArr2), Integer.valueOf(jVar3.f44437a));
    }

    @Override // r6.o
    public final void a() {
        C0237b0 c0237b0;
        C3587j c3587j;
        synchronized (this.f44455c) {
            try {
                if (v.f46721a >= 32 && (c0237b0 = this.f44460h) != null && (c3587j = (C3587j) c0237b0.f815e) != null && ((Handler) c0237b0.f814d) != null) {
                    ((Spatializer) c0237b0.f813c).removeOnSpatializerStateChangedListener(c3587j);
                    ((Handler) c0237b0.f814d).removeCallbacksAndMessages(null);
                    c0237b0.f814d = null;
                    c0237b0.f815e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44464a = null;
        this.f44465b = null;
    }

    public final f d() {
        f fVar;
        synchronized (this.f44455c) {
            fVar = this.f44459g;
        }
        return fVar;
    }

    public final void f() {
        boolean z2;
        O o7;
        C0237b0 c0237b0;
        synchronized (this.f44455c) {
            try {
                z2 = this.f44459g.f44424J && !this.f44458f && v.f46721a >= 32 && (c0237b0 = this.f44460h) != null && c0237b0.f812b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (o7 = this.f44464a) == null) {
            return;
        }
        o7.f3170h.c(10);
    }

    public final void i(f fVar) {
        boolean zEquals;
        fVar.getClass();
        synchronized (this.f44455c) {
            zEquals = this.f44459g.equals(fVar);
            this.f44459g = fVar;
        }
        if (zEquals) {
            return;
        }
        if (fVar.f44424J && this.f44456d == null) {
            AbstractC4256a.E("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        O o7 = this.f44464a;
        if (o7 != null) {
            o7.f3170h.c(10);
        }
    }
}
