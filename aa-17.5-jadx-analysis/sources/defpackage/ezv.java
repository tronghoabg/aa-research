package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ezv {
    public static final /* synthetic */ int h = 0;
    private static final String[] i = {"INSERT", "UPDATE", "DELETE"};
    public final ezc a;
    public final Map b;
    public final boolean c;
    public final eyv e;
    public final erb g;
    private final Map j;
    private final afec k;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public afdr f = new eup(5);
    public final Map d = new LinkedHashMap();

    public ezv(ezc ezcVar, Map map, Map map2, String[] strArr, boolean z, afec afecVar) {
        this.a = ezcVar;
        this.j = map;
        this.b = map2;
        this.c = z;
        this.k = afecVar;
        int i2 = 0;
        String[] strArr2 = new String[7];
        while (true) {
            String lowerCase = null;
            if (i2 >= 7) {
                break;
            }
            String lowerCase2 = strArr[i2].toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.d.put(lowerCase2, Integer.valueOf(i2));
            String str = (String) this.j.get(strArr[i2]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
            i2++;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.j.entrySet()) {
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Map map3 = this.d;
                map3.put(lowerCase4, woy.aY(map3, lowerCase3));
            }
        }
        this.e = new eyv();
        this.g = new erb((byte[]) null, (byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eyx r5, defpackage.afck r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ezl
            if (r0 == 0) goto L13
            r0 = r6
            ezl r0 = (defpackage.ezl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ezl r0 = new ezl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            afcr r6 = defpackage.afcr.a
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.a
            java.util.Set r5 = (java.util.Set) r5
            defpackage.woy.dF(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.a
            eyx r5 = (defpackage.eyx) r5
            defpackage.woy.dF(r4)
            goto L54
        L3e:
            defpackage.woy.dF(r4)
            ewc r4 = new ewc
            r1 = 8
            r4.<init>(r1)
            r0.a = r5
            r0.d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 == r6) goto L69
        L54:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L68
            r0.a = r4
            r0.d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.eqs.e(r5, r1, r0)
            if (r5 == r6) goto L69
        L68:
            return r4
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.a(eyx, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afck r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ezp
            if (r0 == 0) goto L13
            r0 = r11
            ezp r0 = (defpackage.ezp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ezp r0 = new ezp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            sx r0 = r0.d
            defpackage.woy.dF(r11)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r10 = move-exception
            goto Lc6
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.woy.dF(r11)
            ezc r11 = r10.a
            sx r2 = r11.j
            boolean r5 = r2.s()
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.m     // Catch: java.lang.Throwable -> Lc4
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lc4
            if (r5 != 0) goto L50
            afbg r10 = defpackage.afbg.a     // Catch: java.lang.Throwable -> Lc4
            r2.r()
            return r10
        L50:
            afdr r5 = r10.f     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lc4
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lc4
            if (r5 != 0) goto L64
            afbg r10 = defpackage.afbg.a     // Catch: java.lang.Throwable -> Lc4
            r2.r()
            return r10
        L64:
            dmx r5 = new dmx     // Catch: java.lang.Throwable -> Lc4
            r6 = 6
            r7 = 0
            r5.<init>(r10, r7, r6, r7)     // Catch: java.lang.Throwable -> Lc4
            r0.d = r2     // Catch: java.lang.Throwable -> Lc4
            r0.c = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r11 = r11.r(r5, r0)     // Catch: java.lang.Throwable -> Lc4
            if (r11 == r1) goto Lc3
            r0 = r2
        L76:
            java.util.Set r11 = (java.util.Set) r11     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lbf
            erb r1 = r10.g     // Catch: java.lang.Throwable -> L2a
            r11.getClass()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8a
            goto Lba
        L8a:
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L2a
        L8c:
            r2 = r1
            ajab r2 = (defpackage.ajab) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L2a
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2a
            r8 = r3
        L9a:
            if (r8 >= r6) goto Lb1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r11.contains(r9)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto Laa
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
            int r9 = r9 + r4
            goto Lac
        Laa:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
        Lac:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2a
            int r8 = r8 + 1
            goto L9a
        Lb1:
            r5 = r1
            ajab r5 = (defpackage.ajab) r5     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r5.e(r2, r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8c
        Lba:
            afec r10 = r10.k     // Catch: java.lang.Throwable -> L2a
            r10.invoke(r11)     // Catch: java.lang.Throwable -> L2a
        Lbf:
            r0.r()
            return r11
        Lc3:
            return r1
        Lc4:
            r10 = move-exception
            r0 = r2
        Lc6:
            r0.r()
            throw r10
        Lca:
            afbg r10 = defpackage.afbg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.b(afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (defpackage.eqs.e(r13, r15, r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (defpackage.eqs.e(r7, r15, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c8 -> B:27:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eyx r13, int r14, defpackage.afck r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.c(eyx, int, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:19:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eyx r9, int r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ezr
            if (r0 == 0) goto L13
            r0 = r11
            ezr r0 = (defpackage.ezr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ezr r0 = new ezr
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.b
            int r9 = r0.a
            java.lang.String[] r10 = r0.g
            java.lang.String r2 = r0.f
            faf r4 = r0.h
            defpackage.woy.dF(r11)
            r11 = r10
            r10 = r4
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.woy.dF(r11)
            java.lang.String[] r8 = r8.l
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.ezv.i
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4c:
            if (r9 >= r8) goto L7f
            r4 = r11[r9]
            java.lang.String r4 = defpackage.eqs.d(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = r10
            faf r5 = (defpackage.faf) r5
            r0.h = r5
            r0.f = r2
            r0.g = r11
            r0.a = r9
            r0.b = r8
            r0.e = r3
            java.lang.Object r4 = defpackage.eqs.e(r10, r4, r0)
            if (r4 != r1) goto L7d
            return r1
        L7d:
            int r9 = r9 + r3
            goto L4c
        L7f:
            afak r8 = defpackage.afak.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.d(eyx, int, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.afck r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ezs
            if (r0 == 0) goto L13
            r0 = r8
            ezs r0 = (defpackage.ezs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ezs r0 = new ezs
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            sx r7 = r0.d
            defpackage.woy.dF(r8)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.woy.dF(r8)
            ezc r8 = r7.a
            sx r2 = r8.j
            boolean r4 = r2.s()
            if (r4 == 0) goto L5e
            ezu r4 = new ezu     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r6 = 0
            r4.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L57
            r0.d = r2     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r8.r(r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 == r1) goto L56
            r7 = r2
        L52:
            r7.r()
            goto L5e
        L56:
            return r1
        L57:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L5a:
            r7.r()
            throw r8
        L5e:
            afak r7 = defpackage.afak.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.e(afck):java.lang.Object");
    }

    public final void f(afdr afdrVar, afdr afdrVar2) {
        afdrVar.getClass();
        afdrVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            aitx aitxVar = this.a.a;
            if (aitxVar == null) {
                affa.d("coroutineScope");
                aitxVar = null;
            }
            ahnc.d(aitxVar, new aitw("Room Invalidation Tracker Refresh"), 0, new ehs(this, afdrVar2, (afck) null, 6), 2);
        }
    }
}
