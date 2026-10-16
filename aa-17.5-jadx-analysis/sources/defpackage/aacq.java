package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureStyle;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.StrokeStyle;
import com.google.android.libraries.maps.model.internal.IStyleFactory;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class aacq {
    private static aacq c;
    public final Object a;
    public final Object b;

    public aacq(Context context, float f, std stdVar, usy usyVar, psj psjVar) {
        vja.q(new uxj(null)).getClass();
        this.a = new pkb(stdVar);
        this.b = new pkd();
        new tsv(new tsy(context.getResources().getDisplayMetrics(), f));
        new pkc(stdVar, usyVar, psjVar, this, Optional.empty());
    }

    public static synchronized aacq q(Context context) {
        aacq aacqVar;
        aacqVar = c;
        if (aacqVar == null) {
            aacqVar = new aacq(context);
            c = aacqVar;
        }
        return aacqVar;
    }

    public final float a() {
        return ((StrokeStyle.Builder) this.a).build().getWidth();
    }

    public final int b() {
        return ((Integer) ((StrokeStyle.Builder) this.a).getColors().first).intValue();
    }

    public final void c(boolean z) {
        ((StrokeStyle.Builder) this.a).visible(z);
    }

    public final void d(float f) {
        ((StrokeStyle.Builder) this.a).width(f);
    }

    public final boolean e() {
        return ((StrokeStyle.Builder) this.a).isVisible();
    }

    public final String f() {
        return ((String) this.a) + ", " + ((String) this.b);
    }

    public final uir g(Map map) {
        xxh xxhVarH;
        xxh xxhVarH2;
        xxh xxhVarH3;
        yfy yfyVar = zuy.a;
        zux zuxVar = new zux();
        if (map.containsKey("?_")) {
            zuxVar.b = FeatureType.DATASET;
            zuxVar.d = (String) map.get("?_");
            HashMap map2 = new HashMap();
            yno it = ((ylu) ((ylx) map).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((String) entry.getKey()).equals("?_")) {
                    map2.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            zuxVar.b(map2);
        } else {
            zuxVar.b = (String) zuy.a.get(map.get("_?f"));
            zuxVar.c = (String) map.get("_?p");
        }
        Object obj = this.b;
        zuxVar.f = (zys) obj;
        zuy zuyVarA = zuxVar.a();
        if (zuyVarA == null) {
            return null;
        }
        String str = zuyVarA.b;
        if (str.equals(FeatureType.DATASET)) {
            str = zuyVarA.c;
        }
        IStyleFactory iStyleFactory = (IStyleFactory) ((yfy) this.a).get(str);
        if (iStyleFactory == null) {
            return null;
        }
        try {
            FeatureStyle style = iStyleFactory.getStyle(zuyVarA);
            if (style != null) {
                abnp abnpVarN = yvr.a.n();
                if (style.getFillColor() != null) {
                    abnpVarN.L(2);
                }
                if (style.getStrokeColor() != null) {
                    abnpVarN.L(3);
                }
                if (style.getStrokeWidth() != null) {
                    abnpVarN.L(4);
                }
                if (style.getPointRadius() != null) {
                    abnpVarN.L(5);
                }
                aahu aahuVar = aahu.FEATURE_STYLE_WITH_OPTIONS;
                abnp abnpVarN2 = yvv.a.n();
                abnpVarN2.t();
                yvv yvvVar = (yvv) abnpVarN2.b;
                yvr yvrVar = (yvr) abnpVarN.q();
                yvrVar.getClass();
                yvvVar.c = yvrVar;
                yvvVar.b = 3;
                ((zys) obj).c(aahuVar, (yvv) abnpVarN2.q());
            }
            if (style == null) {
                return null;
            }
            Integer fillColor = style.getFillColor();
            Integer strokeColor = style.getStrokeColor();
            Float strokeWidth = style.getStrokeWidth();
            Float pointRadius = style.getPointRadius();
            xxh xxhVarH4 = xvy.a;
            if (fillColor != null) {
                fillColor.intValue();
                xxhVarH = xxh.h(fillColor);
            } else {
                xxhVarH = xxhVarH4;
            }
            if (strokeColor != null) {
                strokeColor.intValue();
                xxhVarH2 = xxh.h(strokeColor);
            } else {
                xxhVarH2 = xxhVarH4;
            }
            if (strokeWidth != null) {
                strokeWidth.floatValue();
                xxhVarH3 = xxh.h(strokeWidth);
            } else {
                xxhVarH3 = xxhVarH4;
            }
            if (pointRadius != null) {
                pointRadius.floatValue();
                xxhVarH4 = xxh.h(pointRadius);
            }
            return new uir(xxhVarH, xxhVarH2, xxhVarH3, xxhVarH4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Bitmap h(ztq ztqVar) {
        ajlp ajlpVar;
        ajlpVar = (ajlp) this.a.get(ztqVar);
        zkt.e(ajlpVar != null, "Unmanaged descriptor");
        return (Bitmap) ajlpVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final Bitmap i(ztq ztqVar) {
        Object obj;
        synchronized (this) {
            ajlp ajlpVar = (ajlp) this.a.get(ztqVar);
            if (ajlpVar != null) {
                ajlpVar.a++;
                return (Bitmap) ajlpVar.b;
            }
            Bitmap bitmapA = ztqVar.a((gjt) this.b);
            synchronized (this) {
                ?? r1 = this.a;
                ajlp ajlpVar2 = (ajlp) r1.get(ztqVar);
                if (ajlpVar2 == null) {
                    ajlpVar2 = new ajlp(bitmapA);
                    r1.put(ztqVar, ajlpVar2);
                } else {
                    ajlpVar2.a++;
                }
                obj = ajlpVar2.b;
            }
            return (Bitmap) obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void j(ztq ztqVar) {
        ?? r0 = this.a;
        ajlp ajlpVar = (ajlp) r0.get(ztqVar);
        if (ajlpVar == null) {
            zrn.b("Unmanaged Bitmap descriptor");
            return;
        }
        int i = ajlpVar.a;
        if (i == 1) {
            r0.remove(ztqVar);
        } else {
            ajlpVar.a = i - 1;
        }
    }

    public final Map k(CharSequence charSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : ((xxx) this.a).g(charSequence)) {
            Iterator itH = ((xxx) this.b).h(str);
            woy.S(itH.hasNext(), "Chunk [%s] is not a valid entry", str);
            String str2 = (String) itH.next();
            woy.S(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
            woy.S(itH.hasNext(), "Chunk [%s] is not a valid entry", str);
            linkedHashMap.put(str2, (String) itH.next());
            woy.S(!itH.hasNext(), "Chunk [%s] is not a valid entry", str);
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r2.d != r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        r2.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r1 = defpackage.a.h(r3, defpackage.xvf.a, defpackage.xvf.b);
        r2.a.o(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        ((java.util.concurrent.atomic.AtomicInteger) r8.a).addAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r2.d != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r2.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        r2.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Thread r9) throws java.lang.Throwable {
        /*
            r8 = this;
        L0:
            r0 = 0
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            r2 = r1
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.peek()     // Catch: java.lang.Throwable -> L5c
            xvg r2 = (defpackage.xvg) r2     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            return
        L11:
            java.util.concurrent.atomic.AtomicReference r3 = r2.b     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L62
            xvf r5 = defpackage.xvf.c     // Catch: java.lang.Throwable -> L62
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L1f
            r4 = r6
            goto L20
        L1f:
            r4 = r7
        L20:
            boolean r5 = r8.n(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L2e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.Thread r8 = r2.d
            if (r8 != r9) goto L2d
            r2.d = r0
        L2d:
            return
        L2e:
            r2.d = r9     // Catch: java.lang.Throwable -> L62
            r5 = r1
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> L62
            if (r2 != r5) goto L3a
            goto L3b
        L3a:
            r6 = r7
        L3b:
            defpackage.woy.Z(r6)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            xvf r1 = defpackage.xvf.a     // Catch: java.lang.Throwable -> L60
            xvf r5 = defpackage.xvf.b     // Catch: java.lang.Throwable -> L60
            boolean r1 = defpackage.a.h(r3, r1, r5)     // Catch: java.lang.Throwable -> L60
            zhc r3 = r2.a     // Catch: java.lang.Throwable -> L60
            r3.o(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L55
            java.lang.Object r1 = r8.a     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1     // Catch: java.lang.Throwable -> L60
            r1.addAndGet(r4)     // Catch: java.lang.Throwable -> L60
        L55:
            java.lang.Thread r1 = r2.d
            if (r1 != r9) goto L0
            r2.d = r0
            goto L0
        L5c:
            r8 = move-exception
            r2 = r0
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            throw r8     // Catch: java.lang.Throwable -> L60
        L60:
            r8 = move-exception
            goto L66
        L62:
            r8 = move-exception
            goto L5e
        L64:
            r8 = move-exception
            r2 = r0
        L66:
            if (r2 == 0) goto L6e
            java.lang.Thread r1 = r2.d
            if (r1 != r9) goto L6e
            r2.d = r0
        L6e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacq.l(java.lang.Thread):void");
    }

    public final void m(int i, xvh xvhVar) throws Throwable {
        ((AtomicInteger) this.a).addAndGet(i);
        Thread threadCurrentThread = Thread.currentThread();
        if (xvhVar.d == threadCurrentThread) {
            return;
        }
        l(threadCurrentThread);
    }

    public final boolean n(int i) {
        AtomicInteger atomicInteger;
        int i2;
        if (i == 0) {
            return true;
        }
        do {
            atomicInteger = (AtomicInteger) this.a;
            i2 = atomicInteger.get();
            if (i2 <= 0) {
                break;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 - 1));
        return i2 > 0;
    }

    public final boolean o() {
        for (boolean z : (boolean[]) this.a) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    public final boolean p() {
        String packageName;
        if (vuf.g == null) {
            vuf.g = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        if (!vuf.g.booleanValue()) {
            return false;
        }
        Object obj = this.b;
        String strS = vuf.S();
        if (strS == null) {
            return true;
        }
        ?? r4 = this.a;
        int size = r4.size();
        if (size == 0) {
            packageName = ((Context) obj).getPackageName();
        } else {
            if (size != 1) {
                throw new IllegalArgumentException("More than 1 custom main process specified");
            }
            String strA = ((wds) yrm.ao(r4)).a();
            woy.S(strA.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA);
            packageName = String.valueOf(((Context) obj).getPackageName()).concat(String.valueOf(strA));
        }
        return strS.equals(packageName);
    }

    public aacq(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public aacq(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public aacq(String str) {
        this.a = str == null ? "" : str;
        this.b = "";
    }

    public aacq(char[] cArr, byte[] bArr) {
        this.b = "c";
        this.a = "d";
    }

    public aacq(ackk ackkVar) {
        this.a = new AtomicBoolean(false);
        this.b = ackkVar;
    }

    public aacq(Context context, byte[] bArr) {
        this.a = new vre();
        this.b = context;
    }

    public aacq(StrokeStyle strokeStyle, aacq aacqVar) {
        this.a = new StrokeStyle.Builder(strokeStyle);
        this.b = strokeStyle.getStamp() != null ? new zyh(strokeStyle.getStamp(), aacqVar) : null;
    }

    public aacq(oct octVar, zob zobVar) {
        zre zreVar = new zre(zobVar, new zoy());
        this.a = octVar;
        this.b = zreVar;
    }

    public aacq(Context context, Map map) {
        this.b = context;
        this.a = map.keySet();
    }

    public aacq(Context context, vja vjaVar, Executor executor) {
        context.getClass();
        vjaVar.getClass();
        this.b = context;
        this.a = executor;
    }

    public aacq(gjt gjtVar) {
        zkt.n(gjtVar, "contextManager");
        this.b = gjtVar;
        this.a = new HashMap();
    }

    public aacq(Context context, Executor executor) {
        context.getClass();
        this.a = executor;
        hss hssVarC = hrt.c(context);
        hssVarC.getClass();
        this.b = hssVarC;
    }

    public aacq(byte[] bArr, byte[] bArr2) {
        this.a = new Rect();
        this.b = new Rect();
    }

    public aacq(byte[] bArr) {
        this.b = new zun(Looper.getMainLooper());
        this.a = new zuo(Looper.getMainLooper());
    }

    private aacq(Context context) {
        kmy kmyVar = new kmy(context, "vn_dev_settings");
        this.b = context;
        this.a = kmyVar;
    }

    public aacq(xqq xqqVar) {
        this.b = xqqVar;
        this.a = new LinkedHashMap();
    }

    public aacq(char[] cArr) {
        this.b = new ArrayDeque();
        this.a = new AtomicInteger(4);
    }

    public aacq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public aacq() {
        this.a = new ConcurrentHashMap();
        this.b = yrm.t();
    }
}
