package defpackage;

/* loaded from: classes3.dex */
public final class tmq {
    public static final /* synthetic */ int a = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    static {
        /*
            int[] r0 = defpackage.abqv.a()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = 0
            r5 = 86
            if (r2 >= r5) goto L1a
            r5 = r0[r2]
            int r6 = r5 + (-1)
            if (r5 == 0) goto L19
            int r3 = java.lang.Math.max(r3, r6)
            int r2 = r2 + 1
            goto L7
        L19:
            throw r4
        L1a:
            int r3 = r3 + 1
            adoi[] r0 = new defpackage.adoi[r3]
            int[] r2 = defpackage.abqv.a()
        L22:
            if (r1 >= r5) goto L5e
            r3 = r2[r1]
            int r6 = r3 + (-1)
            if (r3 == 0) goto L5d
            r3 = 17
            if (r6 == r3) goto L4d
            r3 = 27
            if (r6 == r3) goto L4d
            r3 = 78
            if (r6 == r3) goto L4d
            r3 = 82
            if (r6 == r3) goto L4d
            if (r6 == r5) goto L4d
            r3 = 87
            if (r6 == r3) goto L4d
            switch(r6) {
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L4d;
                default: goto L43;
            }
        L43:
            switch(r6) {
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                default: goto L46;
            }
        L46:
            switch(r6) {
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                default: goto L49;
            }
        L49:
            switch(r6) {
                case 56: goto L4d;
                case 57: goto L4d;
                case 58: goto L4d;
                case 59: goto L4d;
                case 60: goto L4d;
                case 61: goto L4d;
                case 62: goto L4d;
                case 63: goto L4d;
                case 64: goto L4d;
                case 65: goto L4d;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L4d;
                case 72: goto L4d;
                case 73: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L5a
        L4d:
            adoi r3 = new adoi
            r3.<init>()
            r0[r6] = r3
            int r6 = defpackage.yfq.d
            yfq r6 = defpackage.yls.a
            r3.a = r6
        L5a:
            int r1 = r1 + 1
            goto L22
        L5d:
            throw r4
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmq.<clinit>():void");
    }
}
