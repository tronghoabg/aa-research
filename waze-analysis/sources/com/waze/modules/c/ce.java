package com.waze.modules.c;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ce extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final cg f29938a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ce(com.waze.sharedui.e.c cVar, com.waze.av.a.p pVar, cg cgVar, int i2, boolean z, int i3) {
        com.waze.sharedui.e.b bVarC;
        com.waze.sharedui.e.b bVarC2;
        h.g.b.x.f(cVar, "originLocation");
        h.g.b.x.f(pVar, "destination");
        h.g.b.x.f(cgVar, "useCase");
        com.waze.shared_infra.h.c cVarF = cVar.f();
        com.waze.sharedui.e.a aVarG = cVar.g();
        Long lValueOf = null;
        Long lValueOf2 = (aVarG == null || (bVarC2 = aVarG.c()) == null) ? null : Long.valueOf(bVarC2.a());
        com.waze.sharedui.e.a aVarG2 = cVar.g();
        if (aVarG2 != null && (bVarC = aVarG2.c()) != null) {
            lValueOf = Long.valueOf(bVarC.b());
        }
        Long l2 = lValueOf;
        int i4 = i3 & 128;
        int i5 = i3 & 16;
        boolean z2 = ((i3 & 512) == 0) & z;
        this(cgVar, cVarF, lValueOf2, l2, pVar, i5 != 0 ? 3 : i2, null, i4 != 0, false, z2);
    }

    public final cg a() {
        return this.f29938a;
    }

    public /* synthetic */ ce(cg cgVar, com.waze.shared_infra.h.c cVar, Long l2, Long l3, com.waze.av.a.p pVar, int i2, com.waze.google_assistant.an anVar, boolean z, int i3) {
        this(cgVar, cVar, l2, l3, pVar, (i3 & 64) != 0 ? 3 : i2, (i3 & 128) != 0 ? null : anVar, (i3 & 512) != 0, ((i3 & 1024) == 0) & z, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(cg cgVar, com.waze.shared_infra.h.c cVar, Long l2, Long l3, com.waze.av.a.p pVar, int i2, com.waze.google_assistant.an anVar, boolean z, boolean z2, boolean z3) {
        super(cVar, l2, l3, pVar, i2, anVar, z, z2, z3);
        h.g.b.x.f(cgVar, "useCase");
        h.g.b.x.f(cVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(pVar, "destination");
        this.f29938a = cgVar;
    }
}
