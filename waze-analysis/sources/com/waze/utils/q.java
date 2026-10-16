package com.waze.utils;

import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f44899a = com.waze.shared_infra.i.a.d("RefreshRateDisplayListener");

    /* renamed from: b, reason: collision with root package name */
    private final WindowManager f44900b;

    /* renamed from: c, reason: collision with root package name */
    private Display.Mode f44901c;

    /* renamed from: d, reason: collision with root package name */
    private final Window f44902d;

    public q(WindowManager windowManager, Window window) {
        this.f44900b = windowManager;
        this.f44902d = window;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        this.f44901c = defaultDisplay.getMode();
        a(defaultDisplay);
    }

    private final void a(Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        com.waze.shared_infra.i.e eVar = f44899a;
        int length = supportedModes.length;
        eVar.e("Total display modes found: " + length);
        Display.Mode mode = null;
        for (int i2 = 0; i2 < length; i2++) {
            Display.Mode mode2 = supportedModes[i2];
            if (mode2.getPhysicalHeight() != this.f44901c.getPhysicalHeight() || mode2.getPhysicalWidth() != this.f44901c.getPhysicalWidth()) {
                eVar.e(String.format(Locale.US, "Ignoring mode with ID = %d. Resolution doesn't match: Current: [%d, %d], Mode: [%d, %d]", Integer.valueOf(mode2.getModeId()), Integer.valueOf(this.f44901c.getPhysicalWidth()), Integer.valueOf(this.f44901c.getPhysicalHeight()), Integer.valueOf(mode2.getPhysicalWidth()), Integer.valueOf(mode2.getPhysicalHeight())));
            } else if (Math.floor(mode2.getRefreshRate()) > 60.0d) {
                eVar.e(String.format(Locale.US, "Ignoring mode with ID = %d. Refresh rate is too high: %.6f", Integer.valueOf(mode2.getModeId()), Float.valueOf(mode2.getRefreshRate())));
            } else if (mode == null || mode2.getRefreshRate() > mode.getRefreshRate()) {
                mode = mode2;
            }
        }
        if (mode == null) {
            eVar.g("No valid display modes found.");
            return;
        }
        Window window = this.f44902d;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredDisplayModeId = mode.getModeId();
        window.setAttributes(attributes);
        this.f44901c = mode;
        eVar.e("Set display mode with refresh rate: " + mode.getRefreshRate());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        a(this.f44900b.getDefaultDisplay());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
