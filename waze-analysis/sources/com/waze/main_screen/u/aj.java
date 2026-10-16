package com.waze.main_screen.u;

import com.waze.resume_drive.ResumeDriveNativeManager;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final ResumeDriveNativeManager f27683a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f27684b;

    public aj(ResumeDriveNativeManager resumeDriveNativeManager) {
        h.g.b.x.f(resumeDriveNativeManager, "resumeDriveNativeManager");
        this.f27683a = resumeDriveNativeManager;
        this.f27684b = resumeDriveNativeManager.getLocationStateFlow();
    }

    public final ch a() {
        return this.f27684b;
    }

    public final void b() {
        com.waze.resume_drive.m.cancelResumedDrive$default(this.f27683a, 4, null, 2, null);
    }
}
