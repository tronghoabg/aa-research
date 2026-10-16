package com.waze.sharedui.a;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import com.google.d.d.ab;
import com.google.d.d.dw;
import com.waze.app_nav.hub.af;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class e extends af {
    private static final dw aaL = ab.I();
    private List aaM;
    protected Dialog x;
    protected final String w = "waze.".concat(String.valueOf(String.valueOf(getClass())));
    private final List aaN = new ArrayList();
    protected final d y = new d(this);

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f38781i = false;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f38782j = false;
    private volatile boolean aaO = false;

    public static final void aN(int i2, a aVar) {
        aaL.y(Integer.valueOf(i2), aVar);
    }

    private final synchronized void f() {
        List list = this.aaM;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.aaM = null;
        }
    }

    protected boolean D(Message message) {
        return false;
    }

    public final synchronized void aD(Runnable runnable) {
        if (this.aaM == null) {
            this.aaM = new ArrayList();
        }
        this.aaM.add(runnable);
    }

    protected final void aE() {
        EdgeToEdge.enable(this, SystemBarStyle.auto(0, 0), SystemBarStyle.auto(0, 0));
    }

    public final void aF(Runnable runnable) {
        if (this.f38781i) {
            this.y.post(runnable);
        } else {
            aD(runnable);
        }
    }

    public final void aG(Runnable runnable, long j2) {
        this.y.postDelayed(runnable, j2);
    }

    public final void aH() {
        Dialog dialog = this.x;
        if (dialog != null) {
            Log.d(this.w, "Removing dialog: " + dialog.toString() + ", Class: " + this.x.getClass().getSimpleName());
            this.x.dismiss();
        }
        this.x = null;
    }

    public final synchronized void aI(Dialog dialog) {
        this.x = dialog;
    }

    public final synchronized boolean aJ() {
        Dialog dialog = this.x;
        if (dialog != null) {
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final boolean aK() {
        return this.f38781i;
    }

    public final boolean aL() {
        return this.f38782j;
    }

    public final synchronized void aM() {
        List list = this.aaM;
        if (list == null) {
            return;
        }
        list.remove((Object) null);
    }

    public boolean bs() {
        return this.aaO;
    }

    public boolean bt() {
        return true;
    }

    protected void h() {
    }

    protected void i() {
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        dw dwVar = aaL;
        Iterator it = dwVar.c(Integer.valueOf(i2)).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(i2);
        }
        dwVar.d(Integer.valueOf(i2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List list = this.aaN;
        if (list.size() > 0) {
            ((b) list.remove(0)).a();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
        i();
    }

    @Override // com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        this.aaO = true;
    }

    @Override // com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.aaO = false;
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f38781i = false;
    }

    @Override // com.waze.app_nav.hub.af, android.support.v7.app.o, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        h();
        i();
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f38781i = true;
        f();
    }

    @Override // android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f38782j = true;
    }

    @Override // android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f38782j = false;
    }
}
