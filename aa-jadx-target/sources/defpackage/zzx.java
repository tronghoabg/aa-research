package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zzx {
    private static defpackage.zzx c;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public zzx(android.content.Context context, float f, vjx vjxVar, utu utuVar, pte pteVar) {
        vjx.n(new uyf((byte[]) null)).getClass();
        this.a = new pkv(vjxVar);
        this.b = new pkx();
        new ttr(new ttu(context.getResources().getDisplayMetrics(), f));
        new pkw(vjxVar, utuVar, pteVar, this, j$.util.Optional.empty());
    }

    public static synchronized defpackage.zzx p(android.content.Context context) {
        defpackage.zzx zzxVar;
        zzxVar = c;
        if (zzxVar == null) {
            zzxVar = new defpackage.zzx(context);
            c = zzxVar;
        }
        return zzxVar;
    }

    public final float a() {
        return ((com.google.android.libraries.maps.model.StrokeStyle.Builder) this.b).build().getWidth();
    }

    public final int b() {
        return ((java.lang.Integer) ((com.google.android.libraries.maps.model.StrokeStyle.Builder) this.b).getColors().first).intValue();
    }

    public final void c(boolean z) {
        ((com.google.android.libraries.maps.model.StrokeStyle.Builder) this.b).visible(z);
    }

    public final void d(float f) {
        ((com.google.android.libraries.maps.model.StrokeStyle.Builder) this.b).width(f);
    }

    public final boolean e() {
        return ((com.google.android.libraries.maps.model.StrokeStyle.Builder) this.b).isVisible();
    }

    public final java.lang.String f() {
        return ((java.lang.String) this.a) + ", " + ((java.lang.String) this.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.libraries.maps.model.RuntimeRemoteException */
    public final ujm g(java.util.Map map) throws com.google.android.libraries.maps.model.RuntimeRemoteException {
        defpackage.xyn xynVarH;
        defpackage.xyn xynVarH2;
        defpackage.xyn xynVarH3;
        defpackage.yhe yheVar = zwb.a;
        zwa zwaVar = new zwa();
        if (map.containsKey("?_")) {
            zwaVar.b = "DATASET";
            zwaVar.d = (java.lang.String) map.get("?_");
            java.util.HashMap map2 = new java.util.HashMap();
            defpackage.yot it = ((defpackage.ymz) ((defpackage.ync) map).entrySet()).iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!((java.lang.String) entry.getKey()).equals("?_")) {
                    map2.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
            zwaVar.b(map2);
        } else {
            zwaVar.b = (java.lang.String) zwb.a.get(map.get("_?f"));
            zwaVar.c = (java.lang.String) map.get("_?p");
        }
        java.lang.Object obj = this.b;
        zwaVar.f = (zzw) obj;
        zwb zwbVarA = zwaVar.a();
        if (zwbVarA == null) {
            return null;
        }
        java.lang.String str = zwbVarA.b;
        if (str.equals("DATASET")) {
            str = zwbVarA.c;
        }
        com.google.android.libraries.maps.model.internal.IStyleFactory iStyleFactory = (com.google.android.libraries.maps.model.internal.IStyleFactory) ((defpackage.yhe) this.a).get(str);
        if (iStyleFactory == null) {
            return null;
        }
        try {
            com.google.android.libraries.maps.model.FeatureStyle style = iStyleFactory.getStyle(zwbVarA);
            if (style != null) {
                defpackage.abor aborVarN = yww.a.n();
                if (style.getFillColor() != null) {
                    aborVarN.L(2);
                }
                if (style.getStrokeColor() != null) {
                    aborVarN.L(3);
                }
                if (style.getStrokeWidth() != null) {
                    aborVarN.L(4);
                }
                if (style.getPointRadius() != null) {
                    aborVarN.L(5);
                }
                aaix aaixVar = aaix.fN;
                defpackage.abor aborVarN2 = yxa.a.n();
                aborVarN2.t();
                yxa yxaVar = aborVarN2.b;
                yww ywwVarQ = aborVarN.q();
                ywwVarQ.getClass();
                yxaVar.c = ywwVarQ;
                yxaVar.b = 3;
                ((zzw) obj).c(aaixVar, aborVarN2.q());
            }
            if (style == null) {
                return null;
            }
            java.lang.Integer fillColor = style.getFillColor();
            java.lang.Integer strokeColor = style.getStrokeColor();
            java.lang.Float strokeWidth = style.getStrokeWidth();
            java.lang.Float pointRadius = style.getPointRadius();
            defpackage.xyn xynVarH4 = defpackage.xxe.a;
            if (fillColor != null) {
                fillColor.intValue();
                xynVarH = defpackage.xyn.h(fillColor);
            } else {
                xynVarH = xynVarH4;
            }
            if (strokeColor != null) {
                strokeColor.intValue();
                xynVarH2 = defpackage.xyn.h(strokeColor);
            } else {
                xynVarH2 = xynVarH4;
            }
            if (strokeWidth != null) {
                strokeWidth.floatValue();
                xynVarH3 = defpackage.xyn.h(strokeWidth);
            } else {
                xynVarH3 = xynVarH4;
            }
            if (pointRadius != null) {
                pointRadius.floatValue();
                xynVarH4 = defpackage.xyn.h(pointRadius);
            }
            return new ujm(xynVarH, xynVarH2, xynVarH3, xynVarH4);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized android.graphics.Bitmap h(zut zutVar) {
        ajmp ajmpVar;
        ajmpVar = (ajmp) this.a.get(zutVar);
        zlv.e(ajmpVar != null, "Unmanaged descriptor");
        return (android.graphics.Bitmap) ajmpVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final android.graphics.Bitmap i(zut zutVar) {
        java.lang.Object obj;
        synchronized (this) {
            ajmp ajmpVar = (ajmp) this.a.get(zutVar);
            if (ajmpVar != null) {
                ajmpVar.a++;
                return (android.graphics.Bitmap) ajmpVar.b;
            }
            android.graphics.Bitmap bitmapA = zutVar.a((defpackage.gka) this.b);
            synchronized (this) {
                ?? r1 = this.a;
                ajmp ajmpVar2 = (ajmp) r1.get(zutVar);
                if (ajmpVar2 == null) {
                    ajmpVar2 = new ajmp(bitmapA);
                    r1.put(zutVar, ajmpVar2);
                } else {
                    ajmpVar2.a++;
                }
                obj = ajmpVar2.b;
            }
            return (android.graphics.Bitmap) obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void j(zut zutVar) {
        ?? r0 = this.a;
        ajmp ajmpVar = (ajmp) r0.get(zutVar);
        if (ajmpVar == null) {
            zsr.b("Unmanaged Bitmap descriptor");
            return;
        }
        int i = ajmpVar.a;
        if (i == 1) {
            r0.remove(zutVar);
        } else {
            ajmpVar.a = i - 1;
        }
    }

    public final java.util.Map k(java.lang.CharSequence charSequence) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : ((defpackage.xzd) this.b).g(charSequence)) {
            java.util.Iterator itH = ((defpackage.xzd) this.a).h(str);
            defpackage.ysr.bc(itH.hasNext(), "Chunk [%s] is not a valid entry", str);
            java.lang.String str2 = (java.lang.String) itH.next();
            defpackage.ysr.bc(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
            defpackage.ysr.bc(itH.hasNext(), "Chunk [%s] is not a valid entry", str);
            linkedHashMap.put(str2, (java.lang.String) itH.next());
            defpackage.ysr.bc(!itH.hasNext(), "Chunk [%s] is not a valid entry", str);
        }
        return j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
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
    
        r1 = defpackage.a.g(r3, xwl.a, xwl.b);
        r2.a.o(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        ((java.util.concurrent.atomic.AtomicInteger) r8.b).addAndGet(r4);
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
            java.lang.Object r1 = r8.a     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            r2 = r1
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.peek()     // Catch: java.lang.Throwable -> L5c
            xwm r2 = (xwm) r2     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            return
        L11:
            java.util.concurrent.atomic.AtomicReference r3 = r2.b     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L62
            xwl r5 = xwl.c     // Catch: java.lang.Throwable -> L62
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
            defpackage.ysr.bj(r6)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L62
            xwl r1 = xwl.a     // Catch: java.lang.Throwable -> L60
            xwl r5 = xwl.b     // Catch: java.lang.Throwable -> L60
            boolean r1 = defpackage.a.g(r3, r1, r5)     // Catch: java.lang.Throwable -> L60
            zif r3 = r2.a     // Catch: java.lang.Throwable -> L60
            r3.o(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L55
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L60
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzx.l(java.lang.Thread):void");
    }

    public final void m(int i, xwn xwnVar) throws java.lang.Throwable {
        ((java.util.concurrent.atomic.AtomicInteger) this.b).addAndGet(i);
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (xwnVar.d == threadCurrentThread) {
            return;
        }
        l(threadCurrentThread);
    }

    public final boolean n(int i) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        if (i == 0) {
            return true;
        }
        do {
            atomicInteger = (java.util.concurrent.atomic.AtomicInteger) this.b;
            i2 = atomicInteger.get();
            if (i2 <= 0) {
                break;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 - 1));
        return i2 > 0;
    }

    public final boolean o() {
        for (boolean z : (boolean[]) this.b) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public zzx(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public zzx(java.lang.String str) {
        this.a = str == null ? "" : str;
        this.b = "";
    }

    public zzx(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public zzx(com.google.android.libraries.maps.model.StrokeStyle strokeStyle, defpackage.zzx zzxVar) {
        this.b = new com.google.android.libraries.maps.model.StrokeStyle.Builder(strokeStyle);
        this.a = strokeStyle.getStamp() != null ? new zzl(strokeStyle.getStamp(), zzxVar) : null;
    }

    public zzx(odn odnVar, zpd zpdVar) {
        zsi zsiVar = new zsi(zpdVar, new zqb());
        this.a = odnVar;
        this.b = zsiVar;
    }

    public zzx(byte[] bArr, byte[] bArr2) {
        this.b = new android.graphics.Rect();
        this.a = new android.graphics.Rect();
    }

    public zzx(defpackage.gka gkaVar) {
        zlv.n(gkaVar, "contextManager");
        this.b = gkaVar;
        this.a = new java.util.HashMap();
    }

    private zzx(android.content.Context context) {
        defpackage.knf knfVar = new defpackage.knf(context, "vn_dev_settings");
        this.a = context;
        this.b = knfVar;
    }

    public zzx(xrr xrrVar) {
        this.a = xrrVar;
        this.b = new java.util.LinkedHashMap();
    }

    public zzx(byte[] bArr) {
        this.a = new zvq(android.os.Looper.getMainLooper());
        this.b = new zvr(android.os.Looper.getMainLooper());
    }

    public zzx(char[] cArr) {
        this.a = new java.util.ArrayDeque();
        this.b = new java.util.concurrent.atomic.AtomicInteger(4);
    }

    public zzx() {
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.a = defpackage.ysr.t();
    }
}
