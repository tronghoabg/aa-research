package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cx implements com.waze.shared_infra.i.i {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f23246a;

    public cx(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f23246a = configManager;
    }

    @Override // com.waze.shared_infra.i.i
    public final void a() {
        bc.sendLogsAutoConfirm$default(this.f23246a, null, 1, null);
    }
}
