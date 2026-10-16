package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class fp implements fq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessageBoxNativeManager f23928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23930c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23931d;

    public /* synthetic */ fp(MessageBoxNativeManager messageBoxNativeManager, long j2, long j3, int i2) {
        this.f23931d = i2;
        this.f23928a = messageBoxNativeManager;
        this.f23929b = j2;
        this.f23930c = j3;
    }

    @Override // com.waze.fq
    public final void a(int i2) {
        int i3 = this.f23931d;
        if (i3 == 0) {
            long j2 = this.f23930c;
            this.f23928a.lambda$ShowAddSecondStopDialog$0(this.f23929b, j2, i2, -1);
        } else {
            long j3 = this.f23930c;
            long j4 = this.f23929b;
            if (i3 != 1) {
                this.f23928a.lambda$OpenConfirmDialogCustomTimeoutCb$0(j4, j3, i2, -1);
            } else {
                this.f23928a.lambda$ShowViaDangerZoneWarningDialog$0(j4, j3, i2, -1);
            }
        }
    }
}
