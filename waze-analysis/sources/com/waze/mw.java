package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class mw extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final mw f30524a = new mw();

    mw() {
        super(1, ConfigManager.class, "runOnConfigSynced", "runOnConfigSynced(Ljava/lang/Runnable;)V", 0);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        ConfigManager.runOnConfigSynced((Runnable) obj);
        return h.ab.f48028a;
    }
}
