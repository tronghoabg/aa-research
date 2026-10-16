package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.settings.SettingsHOVActivity;
import com.waze.settings.SettingsHOVSearchActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ay implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31024a;

    public /* synthetic */ ay(int i2) {
        this.f31024a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f31024a;
        if (i2 == 0) {
            NativeManager.getInstance().CloseProgressPopup();
            return;
        }
        if (i2 == 1) {
            int i3 = SettingsHOVActivity.f36681f;
            NativeManager.getInstance().CloseProgressPopup();
            return;
        }
        if (i2 == 2) {
            int i4 = SettingsHOVActivity.f36681f;
            NativeManager.getInstance().CloseProgressPopup();
        } else if (i2 == 3) {
            int i5 = SettingsHOVSearchActivity.f36686f;
            NativeManager.getInstance().CloseProgressPopup();
        } else if (i2 != 4) {
            com.waze.sharedui.web.g.c(new com.waze.web.n());
        } else {
            NativeManager.getInstance().CloseProgressPopup();
        }
    }
}
