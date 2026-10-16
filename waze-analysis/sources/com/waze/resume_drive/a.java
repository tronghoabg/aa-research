package com.waze.resume_drive;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a {
    public /* synthetic */ a() {
    }

    public final synchronized ResumeDriveNativeManager a() {
        ResumeDriveNativeManager resumeDriveNativeManager;
        if (ResumeDriveNativeManager.sInstance == null) {
            ResumeDriveNativeManager.sInstance = new ResumeDriveNativeManager(null);
        }
        resumeDriveNativeManager = ResumeDriveNativeManager.sInstance;
        x.d(resumeDriveNativeManager, "null cannot be cast to non-null type com.waze.resume_drive.ResumeDriveNativeManager");
        return resumeDriveNativeManager;
    }

    public /* synthetic */ a(byte[] bArr, byte[] bArr2) {
    }
}
