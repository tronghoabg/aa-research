package com.google.firebase.messaging;

import android.content.Context;
import com.waze.ConfigManager;
import com.waze.feedback.FeedbackActivity;
import com.waze.navigate.DriveToNativeManager;
import com.waze.sdk.bd;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10245c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f10246d;

    public /* synthetic */ w(Context context, boolean z, com.google.android.gms.o.w wVar, int i2) {
        this.f10246d = i2;
        this.f10244b = context;
        this.f10243a = z;
        this.f10245c = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f10246d;
        if (i2 == 0) {
            Object obj = this.f10245c;
            y.f((Context) this.f10244b, this.f10243a, (com.google.android.gms.o.w) obj);
            return;
        }
        if (i2 == 1) {
            ((ConfigManager) this.f10244b).lambda$setConfigValueBool$0((com.waze.config.b) this.f10245c, this.f10243a);
            return;
        }
        if (i2 == 2) {
            Object obj2 = this.f10244b;
            if (this.f10243a) {
                ((FeedbackActivity) obj2).f().d((String) this.f10245c);
            }
            ((FeedbackActivity) obj2).f().c();
            return;
        }
        boolean z = this.f10243a;
        if (i2 == 3) {
            ((DriveToNativeManager) this.f10244b).lambda$drive$0((String) this.f10245c, z);
        } else {
            Object obj3 = this.f10245c;
            bd bdVar = (bd) this.f10244b;
            bdVar.f35316h.post(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: INVOKE 
                  (wrap:android.os.Handler:0x0005: IGET (r3v11 'bdVar' com.waze.sdk.bd) A[WRAPPED] (LINE:6) com.waze.sdk.bd.h android.os.Handler)
                  (wrap:java.lang.Runnable:0x0002: CONSTRUCTOR 
                  (r3v11 'bdVar' com.waze.sdk.bd)
                  (wrap:java.lang.String:0x0015: CHECK_CAST (java.lang.String) (r0v8 'obj3' java.lang.Object))
                  (r1v9 'z' boolean)
                 A[MD:(com.waze.sdk.bd, java.lang.String, boolean):void (m), WRAPPED] (LINE:3) call: com.waze.sdk.aw.<init>(com.waze.sdk.bd, java.lang.String, boolean):void type: CONSTRUCTOR)
                 VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] (LINE:8) in method: com.google.firebase.messaging.w.run():void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.waze.sdk.aw, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 33 more
                */
            /*
                this = this;
                int r0 = r3.f10246d
                if (r0 == 0) goto L53
                r1 = 1
                if (r0 == r1) goto L45
                r1 = 2
                if (r0 == r1) goto L27
                boolean r1 = r3.f10243a
                r2 = 3
                if (r0 == r2) goto L1b
                java.lang.Object r0 = r3.f10245c
                java.lang.Object r3 = r3.f10244b
                com.waze.sdk.bd r3 = (com.waze.sdk.bd) r3
                java.lang.String r0 = (java.lang.String) r0
                com.waze.sdk.bd.q(r3, r0, r1)
                return
            L1b:
                java.lang.Object r0 = r3.f10245c
                java.lang.Object r3 = r3.f10244b
                com.waze.navigate.DriveToNativeManager r3 = (com.waze.navigate.DriveToNativeManager) r3
                java.lang.String r0 = (java.lang.String) r0
                com.waze.navigate.DriveToNativeManager.$r8$lambda$PG8eTPrFf69WX6mYQKJUTDlbikg(r3, r0, r1)
                return
            L27:
                java.lang.Object r0 = r3.f10244b
                boolean r1 = r3.f10243a
                if (r1 == 0) goto L3b
                java.lang.Object r3 = r3.f10245c
                r1 = r0
                com.waze.feedback.FeedbackActivity r1 = (com.waze.feedback.FeedbackActivity) r1
                com.waze.feedback.i r1 = r1.f()
                java.lang.String r3 = (java.lang.String) r3
                r1.d(r3)
            L3b:
                com.waze.feedback.FeedbackActivity r0 = (com.waze.feedback.FeedbackActivity) r0
                com.waze.feedback.i r3 = r0.f()
                r3.c()
                return
            L45:
                boolean r0 = r3.f10243a
                java.lang.Object r1 = r3.f10245c
                java.lang.Object r3 = r3.f10244b
                com.waze.ConfigManager r3 = (com.waze.ConfigManager) r3
                com.waze.config.b r1 = (com.waze.config.b) r1
                com.waze.ConfigManager.$r8$lambda$Hz1xVKTEgTxy62qrwBr6awrhtiU(r3, r1, r0)
                return
            L53:
                java.lang.Object r0 = r3.f10245c
                boolean r1 = r3.f10243a
                java.lang.Object r3 = r3.f10244b
                android.content.Context r3 = (android.content.Context) r3
                com.google.android.gms.o.w r0 = (com.google.android.gms.o.w) r0
                com.google.firebase.messaging.y.f(r3, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.w.run():void");
        }

        public /* synthetic */ w(Object obj, Object obj2, boolean z, int i2) {
            this.f10246d = i2;
            this.f10244b = obj;
            this.f10245c = obj2;
            this.f10243a = z;
        }

        public /* synthetic */ w(boolean z, FeedbackActivity feedbackActivity, String str, int i2) {
            this.f10246d = i2;
            this.f10243a = z;
            this.f10244b = feedbackActivity;
            this.f10245c = str;
        }
    }
