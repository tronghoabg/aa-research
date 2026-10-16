package com.carstream.tech.box;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.media.ControllerService;
import com.carstream.tech.phone.ModeActivity;
import defpackage.l;
import defpackage.q;
import defpackage.t6;
import defpackage.xc;
import defpackage.z6;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class BoxActivity extends Activity {
    private static final int REQ_PERMS = 11;
    private final t6 aaListener = new l(this, 1);
    private q carHost;
    private CarScreen screen;

    private void goImmersive() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ControllerService controllerService = z6.a;
        z6.b(this.aaListener);
        getWindow().addFlags(128);
        try {
            goImmersive();
        } catch (Throwable th) {
            String.valueOf(th);
        }
        try {
            CarScreen carScreen = new CarScreen();
            this.screen = carScreen;
            carScreen.markOnDevice();
            this.carHost = new q(this);
            this.screen.setContext(this);
            this.screen.attach(this.carHost);
            this.screen.onCreate(bundle);
        } catch (Throwable th2) {
            this.screen = null;
            String.valueOf(th2);
            finish();
        }
        xc.a(this, 11);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        z6.j.remove(this.aaListener);
        if (isFinishing()) {
            ModeActivity.quenLuaChon();
        }
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onDestroy();
            this.screen = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        CarScreen carScreen = this.screen;
        if (carScreen == null || !carScreen.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        CarScreen carScreen = this.screen;
        if (carScreen == null || !carScreen.onKeyLongPress(i, keyEvent)) {
            return super.onKeyLongPress(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        CarScreen carScreen = this.screen;
        if (carScreen == null || !carScreen.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 11) {
            return;
        }
        z6.w();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        CarScreen carScreen = this.screen;
        if (carScreen == null) {
            return;
        }
        this.carHost.c = false;
        carScreen.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            this.carHost.c = true;
            carScreen.onStop();
        }
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            try {
                goImmersive();
            } catch (Throwable unused) {
            }
        }
        CarScreen carScreen = this.screen;
        if (carScreen != null) {
            carScreen.onWindowFocusChanged(z, true);
        }
    }
}
