package com.pgl.ssdk;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static int f32622a = -1;

    public static int a(Context context) {
        int i5 = f32622a;
        if (i5 != -1) {
            return i5;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f32622a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f32622a = -1;
            }
        } else {
            f32622a = -2;
        }
        return f32622a;
    }
}
