package com.carstream.tech.car;

import android.os.SystemClock;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.carstream.tech.core.web.KeepAliveFrame;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j extends WebChromeClient {
    public final /* synthetic */ CarScreen a;

    public j(CarScreen carScreen) {
        this.a = carScreen;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.a.exitFullscreen();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        ArrayList arrayList = new ArrayList();
        for (String str : permissionRequest.getResources()) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(str) || "android.webkit.resource.PROTECTED_MEDIA_ID".equals(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            Arrays.toString(permissionRequest.getResources());
            permissionRequest.deny();
        } else {
            String.valueOf(arrayList);
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        CarScreen carScreen = this.a;
        if (carScreen.fullscreenView != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        carScreen.fullscreenCallback = customViewCallback;
        if (carScreen.settingsShowing) {
            carScreen.hideSettings();
        }
        KeepAliveFrame keepAliveFrame = new KeepAliveFrame(carScreen);
        u uVar = carScreen.keeper;
        uVar.getClass();
        keepAliveFrame.a = SystemClock.elapsedRealtime() < uVar.e || uVar.a.a.keepAliveWanted;
        keepAliveFrame.addView(view, new FrameLayout.LayoutParams(-1, -1));
        carScreen.fullscreenView = keepAliveFrame;
        carScreen.fullscreenHolder = keepAliveFrame;
        carScreen.contentColumn.setVisibility(8);
        carScreen.applyRail();
        carScreen.syncSearchFab();
        carScreen.setSheetWatching(true);
        carScreen.rootLayout.addView(keepAliveFrame, new FrameLayout.LayoutParams(-1, -1));
        carScreen.keepBarAboveFullscreen();
        carScreen.giuTrenCung();
        carScreen.pageControlsShown = true;
        carScreen.js("window.__cntFullWatch=true;");
        carScreen.revealControls();
    }
}
