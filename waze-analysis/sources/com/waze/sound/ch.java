package com.waze.sound;

import android.media.AudioRecord;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ch extends com.waze.h.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39660a;

    public ch(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f39660a = eVar;
    }

    @Override // com.waze.h.b.a
    public final com.waze.h.b.e a(com.waze.h.c.a aVar) {
        h.g.b.x.f(aVar, "audioConfig");
        com.waze.h.c.c cVarC = aVar.c();
        h.g.b.x.f(cVarC, "<this>");
        com.waze.h.c.b bVar = com.waze.h.c.b.f24340a;
        com.waze.h.c.c cVar = com.waze.h.c.c.f24346a;
        if (cVarC.ordinal() != 0) {
            throw new h.i();
        }
        int iC = com.waze.i.a.c(aVar.b());
        int minBufferSize = AudioRecord.getMinBufferSize(aVar.d().a(), 16, iC);
        if (minBufferSize <= 0) {
            com.waze.shared_infra.i.e eVar = this.f39660a;
            eVar.b("Failed to get `getMinBufferSize`(=" + minBufferSize + ") for " + aVar);
            Integer numA = aVar.b().a();
            if (numA != null) {
                numA.intValue();
            } else {
                eVar.b("Cannot calculate fallback buffer size for compressed format: " + aVar.b() + ", using 2 bytes per sample.");
            }
            int iA = aVar.d().a();
            minBufferSize = (iA + iA) * aVar.c().a();
            eVar.e("Attempting to use a fallback buffer size (" + minBufferSize + ")");
        }
        int i2 = minBufferSize;
        return new cg(new AudioRecord(6, aVar.d().a(), 16, iC, i2), i2, aVar);
    }
}
