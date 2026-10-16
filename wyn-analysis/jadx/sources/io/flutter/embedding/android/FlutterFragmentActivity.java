package io.flutter.embedding.android;

import a2.v;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import java.util.List;
import ka.AbstractC3256n;
import kc.f;
import kc.g;
import kc.h;
import kc.j;
import kc.k;
import kc.l;
import lc.C3458b;
import uc.C4281r;

/* loaded from: classes5.dex */
public class FlutterFragmentActivity extends FragmentActivity implements h, g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f36966c = View.generateViewId();

    /* renamed from: b, reason: collision with root package name */
    public l f36967b;

    public final String A() {
        try {
            Bundle bundleD = D();
            if (bundleD != null) {
                return bundleD.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final int C() {
        if (getIntent().hasExtra("background_mode")) {
            return AbstractC3256n.u(getIntent().getStringExtra("background_mode"));
        }
        return 1;
    }

    public final Bundle D() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // kc.h
    public final C3458b a() {
        return null;
    }

    @Override // kc.g
    public final void b(C3458b c3458b) {
        l lVar = this.f36967b;
        if (lVar == null || !lVar.f39493b.f39467f) {
            A6.h.H(c3458b);
        }
    }

    public final String l() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleD = D();
            if (bundleD != null) {
                return bundleD.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final String n() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        this.f36967b.onActivityResult(i5, i10, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        l lVar = this.f36967b;
        if (lVar.G("onBackPressed")) {
            f fVar = lVar.f39493b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                ((C4281r) c3458b.f40259i.f17489b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i5;
        boolean z2;
        l lVar;
        boolean z10;
        boolean z11;
        int i10;
        try {
            Bundle bundleD = D();
            if (bundleD != null && (i10 = bundleD.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i10);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterFragmentActivity", "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
        this.f36967b = (l) getSupportFragmentManager().C("flutter_fragment");
        super.onCreate(bundle);
        if (C() == 2) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int i11 = f36966c;
        frameLayout.setId(i11);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
        if (this.f36967b == null) {
            this.f36967b = (l) getSupportFragmentManager().C("flutter_fragment");
        }
        if (this.f36967b == null) {
            int iC = C();
            int i12 = C() == 1 ? 1 : 2;
            int i13 = iC == 1 ? 1 : 2;
            boolean z12 = i12 == 1;
            if (getIntent().getStringExtra("cached_engine_id") != null) {
                getIntent().getStringExtra("cached_engine_id");
                getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                String stringExtra = getIntent().getStringExtra("cached_engine_id");
                int i14 = l.f39491e;
                try {
                    Bundle bundleD2 = D();
                    z11 = (bundleD2 == null || !bundleD2.containsKey("flutter_deeplinking_enabled")) ? true : bundleD2.getBoolean("flutter_deeplinking_enabled");
                } catch (PackageManager.NameNotFoundException unused2) {
                    z11 = false;
                }
                str = "flutter_fragment";
                boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                try {
                    i5 = i11;
                    lVar = (l) l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (lVar == null) {
                        throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + l.class.getCanonicalName() + ") does not match the expected return type.");
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("cached_engine_id", stringExtra);
                    bundle2.putBoolean("destroy_engine_with_fragment", booleanExtra);
                    bundle2.putBoolean("handle_deeplinking", z11);
                    bundle2.putString("flutterview_render_mode", AbstractC3256n.r(i12));
                    bundle2.putString("flutterview_transparency_mode", AbstractC3256n.s(i13));
                    bundle2.putBoolean("should_attach_engine_to_activity", true);
                    bundle2.putBoolean("should_automatically_handle_on_back_pressed", true);
                    bundle2.putBoolean("should_delay_first_android_view_draw", z12);
                    lVar.setArguments(bundle2);
                } catch (Exception e7) {
                    throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + l.class.getName() + ")", e7);
                }
            } else {
                str = "flutter_fragment";
                i5 = i11;
                getIntent().getStringExtra("cached_engine_group_id");
                s();
                if (A() != null) {
                    A();
                }
                l();
                n();
                if (getIntent().getStringExtra("cached_engine_group_id") != null) {
                    String stringExtra2 = getIntent().getStringExtra("cached_engine_group_id");
                    int i15 = l.f39491e;
                    k kVar = new k(stringExtra2);
                    kVar.f39484b = s();
                    kVar.f39485c = l();
                    try {
                        Bundle bundleD3 = D();
                        z10 = (bundleD3 == null || !bundleD3.containsKey("flutter_deeplinking_enabled")) ? true : bundleD3.getBoolean("flutter_deeplinking_enabled");
                    } catch (PackageManager.NameNotFoundException unused3) {
                        z10 = false;
                    }
                    kVar.f39486d = z10;
                    kVar.f39487e = i12;
                    kVar.f39488f = i13;
                    kVar.f39490h = z12;
                    kVar.f39489g = true;
                    try {
                        lVar = (l) l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (lVar == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + l.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        lVar.setArguments(kVar.a());
                    } catch (Exception e10) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + l.class.getName() + ")", e10);
                    }
                } else {
                    int i16 = l.f39491e;
                    j jVar = new j();
                    jVar.f39473a = "main";
                    jVar.f39474b = null;
                    jVar.f39476d = "/";
                    jVar.f39477e = false;
                    jVar.f39478f = null;
                    jVar.f39479g = null;
                    jVar.f39480h = 1;
                    jVar.f39481i = 2;
                    jVar.f39482j = false;
                    jVar.k = false;
                    jVar.f39473a = s();
                    jVar.f39474b = A();
                    jVar.f39475c = (List) getIntent().getSerializableExtra("dart_entrypoint_args");
                    jVar.f39476d = l();
                    jVar.f39478f = n();
                    jVar.f39479g = v.v(getIntent());
                    try {
                        Bundle bundleD4 = D();
                        z2 = (bundleD4 == null || !bundleD4.containsKey("flutter_deeplinking_enabled")) ? true : bundleD4.getBoolean("flutter_deeplinking_enabled");
                    } catch (PackageManager.NameNotFoundException unused4) {
                        z2 = false;
                    }
                    jVar.f39477e = z2;
                    jVar.f39480h = i12;
                    jVar.f39481i = i13;
                    jVar.k = z12;
                    jVar.f39482j = true;
                    try {
                        l lVar2 = (l) l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (lVar2 == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + l.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        lVar2.setArguments(jVar.a());
                        lVar = lVar2;
                    } catch (Exception e11) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + l.class.getName() + ")", e11);
                    }
                }
            }
            this.f36967b = lVar;
            e0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1409a c1409a = new C1409a(supportFragmentManager);
            c1409a.e(i5, this.f36967b, str, 1);
            c1409a.d(false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l lVar = this.f36967b;
        if (lVar.G("onNewIntent")) {
            lVar.f39493b.j(intent);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        l lVar = this.f36967b;
        if (lVar.G("onPostResume")) {
            lVar.f39493b.k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        this.f36967b.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        this.f36967b.onTrimMemory(i5);
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        l lVar = this.f36967b;
        if (lVar.G("onUserLeaveHint")) {
            lVar.f39493b.r();
        }
    }

    public final String s() {
        String string;
        try {
            Bundle bundleD = D();
            string = bundleD != null ? bundleD.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    @Override // kc.g
    public final void c(C3458b c3458b) {
    }
}
