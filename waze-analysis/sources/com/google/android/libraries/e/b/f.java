package com.google.android.libraries.e.b;

import com.google.b.d.b.ah;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ag {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5858c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f5859d;

    public /* synthetic */ f(g gVar, int i2, List list, int i3) {
        this.f5859d = i3;
        this.f5856a = gVar;
        this.f5857b = i2;
        this.f5858c = list;
    }

    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        if (this.f5859d == 0) {
            List list = this.f5858c;
            return g.d(this.f5856a, this.f5857b, list);
        }
        int i2 = this.f5857b;
        List list2 = this.f5858c;
        g gVar = this.f5856a;
        return bd.a(list2).b(ah.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: RETURN 
              (wrap:com.google.d.m.a.bm:0x000c: INVOKE 
              (wrap:com.google.d.m.a.bb:0x0000: INVOKE (r1v0 'list2' java.util.List) STATIC call: com.google.d.m.a.bd.a(java.lang.Iterable):com.google.d.m.a.bb A[MD:(java.lang.Iterable):com.google.d.m.a.bb (m), WRAPPED] (LINE:1))
              (wrap:com.google.d.m.a.af:0x0009: INVOKE 
              (wrap:com.google.d.m.a.af:0x0006: CONSTRUCTOR 
              (r2v3 'gVar' com.google.android.libraries.e.b.g)
              (wrap:com.google.v.fi:0x0004: CHECK_CAST (com.google.v.fi) (r3v0 'obj' java.lang.Object))
              (r0v2 'i2' int)
              (r1v0 'list2' java.util.List)
             A[MD:(com.google.android.libraries.e.b.g, com.google.v.fi, int, java.util.List):void (m), WRAPPED] (LINE:7) call: com.google.android.libraries.e.b.e.<init>(com.google.android.libraries.e.b.g, com.google.v.fi, int, java.util.List):void type: CONSTRUCTOR)
             STATIC call: com.google.b.d.b.ah.a(com.google.d.m.a.af):com.google.d.m.a.af A[MD:(com.google.d.m.a.af):com.google.d.m.a.af (m), WRAPPED] (LINE:10))
              (wrap:java.util.concurrent.Executor:0x000d: IGET (r2v3 'gVar' com.google.android.libraries.e.b.g) A[WRAPPED] (LINE:14) com.google.android.libraries.e.b.g.b java.util.concurrent.Executor)
             VIRTUAL call: com.google.d.m.a.bb.b(com.google.d.m.a.af, java.util.concurrent.Executor):com.google.d.m.a.bm A[MD:(com.google.d.m.a.af, java.util.concurrent.Executor):com.google.d.m.a.bm (m), WRAPPED] (LINE:16))
             (LINE:16) in method: com.google.android.libraries.e.b.f.apply(java.lang.Object):com.google.d.m.a.bm, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.libraries.e.b.e, state: NOT_LOADED
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
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 19 more
            */
        /*
            this = this;
            int r0 = r2.f5859d
            if (r0 == 0) goto L11
            com.google.v.fi r3 = (com.google.v.fi) r3
            int r0 = r2.f5857b
            java.util.List r1 = r2.f5858c
            com.google.android.libraries.e.b.g r2 = r2.f5856a
            com.google.d.m.a.bm r2 = com.google.android.libraries.e.b.g.c(r2, r1, r0, r3)
            return r2
        L11:
            java.util.List r3 = r2.f5858c
            int r0 = r2.f5857b
            com.google.android.libraries.e.b.g r2 = r2.f5856a
            com.google.d.m.a.bm r2 = com.google.android.libraries.e.b.g.d(r2, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.e.b.f.apply(java.lang.Object):com.google.d.m.a.bm");
    }

    public /* synthetic */ f(g gVar, List list, int i2, int i3) {
        this.f5859d = i3;
        this.f5856a = gVar;
        this.f5858c = list;
        this.f5857b = i2;
    }
}
