package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.style.StylePropertiesKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2469a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f2470b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Set f2471c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f2472d = {80, 75, 3, 4};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f2473e = {StylePropertiesKt.ClipId, -117, 8};

    public static y a(Context context, String str, String str2) {
        h hVarA = str2 == null ? null : com.airbnb.lottie.d.g.b().a(str2);
        if (hVarA != null) {
            return new y(hVarA);
        }
        try {
            k.j jVarC = k.y.c(k.y.f(context.getAssets().open(str)));
            return p(jVarC, f2472d).booleanValue() ? f(context, new ZipInputStream(jVarC.r()), str2) : o(jVarC).booleanValue() ? b(new GZIPInputStream(jVarC.r()), str2) : b(jVarC.r(), str2);
        } catch (IOException e2) {
            return new y((Throwable) e2);
        }
    }

    public static y b(InputStream inputStream, String str) {
        return n(com.airbnb.lottie.f.a.d.e(k.y.c(k.y.f(inputStream))), str, true);
    }

    public static y c(com.airbnb.lottie.f.a.d dVar, String str) {
        return n(dVar, str, true);
    }

    public static y d(Context context, int i2) {
        return e(context, i2, q(context, i2));
    }

    public static y e(Context context, int i2, String str) {
        h hVarA = str == null ? null : com.airbnb.lottie.d.g.b().a(str);
        if (hVarA != null) {
            return new y(hVarA);
        }
        try {
            k.j jVarC = k.y.c(k.y.f(context.getResources().openRawResource(i2)));
            if (p(jVarC, f2472d).booleanValue()) {
                return f(context, new ZipInputStream(jVarC.r()), str);
            }
            if (!o(jVarC).booleanValue()) {
                return n(com.airbnb.lottie.f.a.d.e(k.y.c(k.y.f(jVarC.r()))), str, true);
            }
            try {
                return n(com.airbnb.lottie.f.a.d.e(k.y.c(k.y.f(new GZIPInputStream(jVarC.r())))), str, true);
            } catch (IOException e2) {
                return new y((Throwable) e2);
            }
        } catch (Resources.NotFoundException e3) {
            return new y((Throwable) e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0290 A[Catch: all -> 0x02a9, TryCatch #2 {all -> 0x02a9, blocks: (B:2:0x0000, B:8:0x0019, B:9:0x0020, B:12:0x0028, B:14:0x0034, B:60:0x0148, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x007a, B:26:0x0082, B:28:0x008a, B:31:0x0094, B:33:0x009c, B:36:0x00a5, B:37:0x00aa, B:55:0x010e, B:57:0x0118, B:58:0x0135, B:54:0x00ed, B:59:0x0139, B:63:0x0150, B:64:0x015e, B:65:0x0166, B:67:0x016c, B:68:0x0184, B:70:0x018a, B:75:0x019e, B:76:0x01b4, B:77:0x01bc, B:79:0x01c3, B:80:0x01d6, B:82:0x01dc, B:84:0x01f0, B:86:0x01fd, B:87:0x021d, B:89:0x0223, B:90:0x022f, B:92:0x0235, B:95:0x0244, B:97:0x025b, B:100:0x0265, B:101:0x0272, B:103:0x0288, B:105:0x0290, B:106:0x0297, B:6:0x000f, B:108:0x029e), top: B:118:0x0000, inners: #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.y f(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.m.f(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):com.airbnb.lottie.y");
    }

    public static ab g(Context context, String str, String str2) {
        return r(str2, new k(context.getApplicationContext(), str, str2, 1));
    }

    public static ab h(Context context, int i2) {
        return i(context, i2, q(context, i2));
    }

    public static ab i(Context context, final int i2, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return r(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = m.f2469a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return m.e(context2, i2, str);
            }
        });
    }

    public static ab j(Context context, String str, String str2) {
        return r(str2, new k(context, str, str2, 0));
    }

    static /* synthetic */ void k(String str, AtomicBoolean atomicBoolean) {
        Map map = f2470b;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            s();
        }
    }

    static /* synthetic */ void l(String str, AtomicBoolean atomicBoolean) {
        Map map = f2470b;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            s();
        }
    }

    public static ab m(final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.l

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f2467a = "";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = m.f2469a;
                return m.c(com.airbnb.lottie.f.a.d.e(k.y.c(k.y.f(new ByteArrayInputStream(this.f2467a.getBytes())))), str);
            }
        });
    }

    private static y n(com.airbnb.lottie.f.a.d dVar, String str, boolean z) throws IOException {
        y yVar;
        h hVarA;
        try {
            if (str == null) {
                hVarA = null;
            } else {
                try {
                    hVarA = com.airbnb.lottie.d.g.b().a(str);
                } catch (Exception e2) {
                    yVar = new y((Throwable) e2);
                }
            }
            if (hVarA != null) {
                yVar = new y(hVarA);
            } else {
                h hVarA2 = com.airbnb.lottie.f.u.a(dVar);
                if (str != null) {
                    com.airbnb.lottie.d.g.b().c(str, hVarA2);
                }
                yVar = new y(hVarA2);
            }
            if (z) {
                int i2 = com.airbnb.lottie.g.k.f2415a;
                try {
                    dVar.close();
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception unused) {
                }
            }
            return yVar;
        } catch (Throwable th) {
            if (z) {
                int i3 = com.airbnb.lottie.g.k.f2415a;
                try {
                    dVar.close();
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private static Boolean o(k.j jVar) {
        return p(jVar, f2473e);
    }

    private static Boolean p(k.j jVar, byte[] bArr) {
        try {
            k.j jVarF = jVar.F();
            for (byte b2 : bArr) {
                if (jVarF.c() != b2) {
                    return false;
                }
            }
            jVarF.close();
            return true;
        } catch (Exception unused) {
            int i2 = com.airbnb.lottie.g.c.f2396a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }

    private static String q(Context context, int i2) {
        int i3 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i3 != 32 ? "_day_" : "_night_");
        sb.append(i2);
        return sb.toString();
    }

    private static ab r(final String str, Callable callable) {
        h hVarA = str == null ? null : com.airbnb.lottie.d.g.b().a(str);
        ab abVar = hVarA != null ? new ab(hVarA) : null;
        if (str != null) {
            Map map = f2470b;
            if (map.containsKey(str)) {
                abVar = (ab) map.get(str);
            }
        }
        if (abVar != null) {
            return abVar;
        }
        final int i2 = 0;
        ab abVar2 = new ab(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i3 = 1;
            abVar2.e(new u() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.u
                public final void a(Object obj) {
                    if (i3 != 0) {
                        m.k(str, atomicBoolean);
                    } else {
                        m.l(str, atomicBoolean);
                    }
                }
            });
            abVar2.d(new u() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.u
                public final void a(Object obj) {
                    if (i2 != 0) {
                        m.k(str, atomicBoolean);
                    } else {
                        m.l(str, atomicBoolean);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f2470b;
                map2.put(str, abVar2);
                if (map2.size() == 1) {
                    s();
                }
            }
        }
        return abVar2;
    }

    private static void s() {
        ArrayList arrayList = new ArrayList(f2471c);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ac) arrayList.get(i2)).a();
        }
    }
}
