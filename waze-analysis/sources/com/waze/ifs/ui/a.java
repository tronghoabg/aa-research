package com.waze.ifs.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.waze.FreeMapAppActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class a extends com.waze.sharedui.a.e {

    /* renamed from: f, reason: collision with root package name */
    private com.waze.shared_infra.i.e f24481f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.view.navbar.p f24482g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.utils.q f24483h;

    /* renamed from: i, reason: collision with root package name */
    protected final Set f24484i = ConcurrentHashMap.newKeySet();

    /* renamed from: j, reason: collision with root package name */
    protected int f24485j;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.google_assistant.b f24486k;

    protected final void aA() {
        Intent intent = new Intent(this, (Class<?>) FreeMapAppActivity.class);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            Bundle extras = intent2.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.setFlags(intent2.getFlags());
        }
        startActivity(intent);
        finish();
    }

    public final boolean aB() {
        return this.f24485j == 1;
    }

    public final boolean aC() {
        com.waze.view.navbar.p pVar = this.f24482g;
        return pVar != null && pVar.s();
    }

    public final void ax(b bVar) {
        Set set = this.f24484i;
        if (set.contains(bVar)) {
            return;
        }
        set.add(bVar);
    }

    protected void ay() {
        setResult(3);
        finish();
    }

    public final void az(b bVar) {
        Set set = this.f24484i;
        if (set.contains(bVar)) {
            set.remove(bVar);
        }
    }

    protected int bq() {
        return -1;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e2) {
            this.f24481f.c("dispatch touch event crashed see b/395537480", e2);
            return true;
        }
    }

    protected boolean f() {
        return true;
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator it = this.f24484i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i2, i3);
        }
        if (f() && i3 == 3) {
            ay();
        }
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24485j = configuration.orientation;
        Dialog dialog = this.x;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        KeyEvent.Callback callback = this.x;
        if (callback instanceof com.waze.ab.g) {
            ((com.waze.ab.g) callback).a();
        }
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (bq() >= 0) {
            requestWindowFeature(bq());
        }
        this.f24485j = getResources().getConfiguration().orientation;
        super.onCreate(bundle);
        this.f24481f = com.waze.shared_infra.i.a.d("ActivityBase");
        this.f24486k = new com.waze.google_assistant.b();
        WindowManager windowManager = (WindowManager) getSystemService(WindowManager.class);
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (windowManager == null) {
            this.f24481f.g("Cannot register refresh rate listener - window manager is null.");
            return;
        }
        if (displayManager == null) {
            this.f24481f.g("Cannot register refresh rate listener - display manager is null.");
            return;
        }
        Handler handler = new Handler();
        com.waze.utils.q qVar = new com.waze.utils.q(windowManager, getWindow());
        this.f24483h = qVar;
        displayManager.registerDisplayListener(qVar, handler);
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f24483h != null) {
            DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(this.f24483h);
            } else {
                this.f24481f.g("Could not unregister refresh rate listener. DisplayManager is null.");
            }
        }
        aH();
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.waze.view.navbar.p pVar = this.f24482g;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.waze.view.navbar.p pVar = this.f24482g;
        if (pVar == null) {
            pVar = new com.waze.view.navbar.p(getWindow());
            this.f24482g = pVar;
        }
        pVar.q();
    }

    @Override // com.waze.sharedui.a.e, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.waze.google_assistant.b bVar = this.f24486k;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.waze.sharedui.a.e, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.waze.google_assistant.b bVar = this.f24486k;
        if (bVar != null) {
            bVar.c();
        }
    }
}
