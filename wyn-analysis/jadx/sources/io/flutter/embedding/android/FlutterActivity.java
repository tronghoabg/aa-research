package io.flutter.embedding.android;

import A6.h;
import Kb.a;
import N2.j;
import a2.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1457v;
import g2.C2690k;
import java.util.List;
import ka.AbstractC3256n;
import kc.b;
import kc.e;
import kc.f;
import lc.C3458b;
import org.apache.tika.utils.StringUtils;
import uc.C4281r;

/* loaded from: classes5.dex */
public class FlutterActivity extends Activity implements e, InterfaceC1457v {

    /* renamed from: e, reason: collision with root package name */
    public static final int f36961e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f36962a = false;

    /* renamed from: b, reason: collision with root package name */
    public f f36963b;

    /* renamed from: c, reason: collision with root package name */
    public final C1459x f36964c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f36965d;

    public FlutterActivity() {
        int i5 = Build.VERSION.SDK_INT;
        this.f36965d = i5 < 33 ? null : i5 >= 34 ? new b(this) : new a(this, 3);
        this.f36964c = new C1459x(this);
    }

    @Override // kc.e
    public final String A() {
        try {
            Bundle bundleJ = j();
            if (bundleJ != null) {
                return bundleJ.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // kc.e, kc.h
    public final C3458b a() {
        return null;
    }

    public void b(C3458b c3458b) {
        if (this.f36963b.f39467f) {
            return;
        }
        h.H(c3458b);
    }

    @Override // kc.e
    public final void d() {
    }

    @Override // kc.e
    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // kc.e
    public final List f() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final int g() {
        if (getIntent().hasExtra("background_mode")) {
            return AbstractC3256n.u(getIntent().getStringExtra("background_mode"));
        }
        return 1;
    }

    @Override // kc.e
    public final Activity getActivity() {
        return this;
    }

    @Override // kc.e
    public final Context getContext() {
        return this;
    }

    @Override // kc.e, androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        return this.f36964c;
    }

    @Override // kc.e
    public final String h() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // kc.e
    public final boolean i() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : h() == null;
    }

    public final Bundle j() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // kc.e
    public final void k() {
        Log.w("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + this.f36963b.f39463b + " evicted by another attaching activity");
        f fVar = this.f36963b;
        if (fVar != null) {
            fVar.h();
            this.f36963b.i();
        }
    }

    @Override // kc.e
    public final String l() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleJ = j();
            if (bundleJ != null) {
                return bundleJ.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // kc.e
    public final j m(Activity activity, C3458b c3458b) {
        return new j(this, c3458b.f40261l, this);
    }

    @Override // kc.e
    public final String n() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // kc.e
    public final v o() {
        return v.v(getIntent());
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        if (u("onActivityResult")) {
            this.f36963b.e(i5, i10, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (u("onBackPressed")) {
            f fVar = this.f36963b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                ((C4281r) c3458b.f40259i.f17489b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i5;
        try {
            Bundle bundleJ = j();
            if (bundleJ != null && (i5 = bundleJ.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i5);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            w(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        f fVar = new f(this);
        this.f36963b = fVar;
        fVar.f();
        this.f36963b.m(bundle);
        this.f36964c.f(EnumC1449m.ON_CREATE);
        if (g() == 2) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(this.f36963b.g(f36961e, p() == 1));
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (u("onDestroy")) {
            this.f36963b.h();
            this.f36963b.i();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f36965d);
            this.f36962a = false;
        }
        f fVar = this.f36963b;
        if (fVar != null) {
            fVar.f39462a = null;
            fVar.f39463b = null;
            fVar.f39464c = null;
            fVar.f39465d = null;
            this.f36963b = null;
        }
        this.f36964c.f(EnumC1449m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (u("onNewIntent")) {
            this.f36963b.j(intent);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (u("onPause")) {
            f fVar = this.f36963b;
            fVar.c();
            fVar.f39462a.getClass();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                C2690k c2690k = c3458b.f40257g;
                c2690k.f(3, c2690k.f35615a);
            }
        }
        this.f36964c.f(EnumC1449m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (u("onPostResume")) {
            this.f36963b.k();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (u("onRequestPermissionsResult")) {
            this.f36963b.l(i5, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36964c.f(EnumC1449m.ON_RESUME);
        if (u("onResume")) {
            f fVar = this.f36963b;
            fVar.c();
            fVar.f39462a.getClass();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                C2690k c2690k = c3458b.f40257g;
                c2690k.f(2, c2690k.f35615a);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (u("onSaveInstanceState")) {
            this.f36963b.n(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f36964c.f(EnumC1449m.ON_START);
        if (u("onStart")) {
            this.f36963b.o();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (u("onStop")) {
            this.f36963b.p();
        }
        this.f36964c.f(EnumC1449m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        if (u("onTrimMemory")) {
            this.f36963b.q(i5);
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (u("onUserLeaveHint")) {
            this.f36963b.r();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (u("onWindowFocusChanged")) {
            this.f36963b.s(z2);
        }
    }

    @Override // kc.e
    public final int p() {
        return g() == 1 ? 1 : 2;
    }

    @Override // kc.e
    public final int q() {
        return g() == 1 ? 1 : 2;
    }

    @Override // kc.e
    public final boolean r() {
        return false;
    }

    @Override // kc.e
    public final String s() {
        String string;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleJ = j();
            string = bundleJ != null ? bundleJ.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    @Override // kc.e
    public final boolean t() {
        try {
            Bundle bundleJ = j();
            if (bundleJ == null || !bundleJ.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return bundleJ.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean u(String str) {
        f fVar = this.f36963b;
        if (fVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        }
        if (fVar.f39470i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after detach.");
        return false;
    }

    @Override // kc.e
    public final boolean v() {
        return this.f36962a;
    }

    @Override // kc.e
    public final void w(boolean z2) {
        if (z2 && !this.f36962a) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f36965d);
                this.f36962a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f36962a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f36965d);
        this.f36962a = false;
    }

    @Override // kc.e
    public final String x() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // kc.e
    public final boolean y() {
        return true;
    }

    @Override // kc.e
    public final boolean z() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (h() != null || this.f36963b.f39467f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // kc.e, kc.g
    public final void c(C3458b c3458b) {
    }
}
