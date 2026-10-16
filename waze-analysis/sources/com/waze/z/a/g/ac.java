package com.waze.z.a.g;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac implements aa {

    /* renamed from: a, reason: collision with root package name */
    private final h.o.a f46063a;

    /* renamed from: b, reason: collision with root package name */
    private final s f46064b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f46065c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f46066d;

    /* renamed from: e, reason: collision with root package name */
    private final h.o.a f46067e;

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f46068f;

    public /* synthetic */ ac(boolean z, h.o.a aVar, s sVar, h.g.a.a aVar2, h.g.a.a aVar3, h.o.a aVar4) {
        h.g.b.x.f(sVar, "wazeTooltipDimensions");
        this.f46063a = aVar;
        this.f46064b = sVar;
        this.f46065c = aVar2;
        this.f46066d = aVar3;
        this.f46067e = aVar4;
        this.f46068f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // com.waze.z.a.g.aa
    public final s a() {
        return this.f46064b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (kotlinx.coroutines.aj.r(r4, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.z.a.g.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.z.a.g.ab
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.z.a.g.ab r0 = (com.waze.z.a.g.ab) r0
            int r1 = r0.f46062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46062c = r1
            goto L18
        L13:
            com.waze.z.a.g.ab r0 = new com.waze.z.a.g.ab
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f46060a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f46062c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            e.b.c.b(r8)
            goto L59
        L36:
            e.b.c.b(r8)
            androidx.compose.runtime.MutableState r8 = r7.f46068f
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L48
            goto L7e
        L48:
            h.o.a r8 = r7.f46067e
            if (r8 == 0) goto L59
            long r5 = r8.w()
            r0.f46062c = r4
            java.lang.Object r8 = kotlinx.coroutines.aj.r(r5, r0)
            if (r8 != r1) goto L59
            goto L7d
        L59:
            androidx.compose.runtime.MutableState r8 = r7.f46068f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.setValue(r2)
            h.g.a.a r8 = r7.f46065c
            if (r8 == 0) goto L69
            r8.invoke()
        L69:
            h.o.a r8 = r7.f46063a
            if (r8 == 0) goto L7e
            long r4 = r8.w()
            r0.f46062c = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.r(r4, r0)
            if (r8 == r1) goto L7d
        L79:
            r7.c()
            goto L7e
        L7d:
            return r1
        L7e:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.g.ac.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.z.a.g.aa
    public final void c() {
        MutableState mutableState = this.f46068f;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            h.g.a.a aVar = this.f46066d;
            if (aVar != null) {
                aVar.invoke();
            }
            mutableState.setValue(false);
        }
    }

    @Override // com.waze.z.a.g.aa
    public final boolean d() {
        return ((Boolean) this.f46068f.getValue()).booleanValue();
    }
}
