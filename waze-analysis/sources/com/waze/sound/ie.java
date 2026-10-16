package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ie implements ic {

    /* renamed from: a, reason: collision with root package name */
    private final ik f40223a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.c f40224b;

    /* renamed from: c, reason: collision with root package name */
    private final iv f40225c;

    /* renamed from: d, reason: collision with root package name */
    private final fm f40226d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40227e;

    public ie(ik ikVar, com.waze.sound.a.c cVar, iv ivVar, fm fmVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(ikVar, "voiceFilesDataSource");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(ivVar, "voiceFilesProvider");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(eVar, "logger");
        this.f40223a = ikVar;
        this.f40224b = cVar;
        this.f40225c = ivVar;
        this.f40226d = fmVar;
        this.f40227e = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.ic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.jni.protos.sound.VoiceAssetRequest r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ie.a(com.waze.jni.protos.sound.VoiceAssetRequest, h.c.e):java.lang.Object");
    }

    @Override // com.waze.sound.ic
    public final void b(String str) {
        h.g.b.x.f(str, "url");
        this.f40227e.a("playVoiceAsset called. URL: ".concat(String.valueOf(str)));
        com.waze.sharedui.e.e.h(this.f40226d, str, com.waze.sharedui.api.i.d(str), null, 28);
    }
}
