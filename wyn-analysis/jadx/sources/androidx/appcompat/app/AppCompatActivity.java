package androidx.appcompat.app;

import A6.h;
import T3.m;
import X0.AbstractC1277e;
import Y0.e;
import a1.AbstractC1312b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.V;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import g1.AbstractC2665a;
import g1.C2668d;
import i3.c;
import j$.util.Objects;
import j.C3070g;
import j.C3071h;
import j.H;
import j.i;
import j.l;
import j.q;
import j.w;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import o.C3623d;
import o.C3628i;
import q.C3830p;
import q.o1;
import q.t1;
import tg.b;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements i {

    /* renamed from: b, reason: collision with root package name */
    public w f17756b;

    public AppCompatActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new C3070g(this, 0));
        addOnContextAvailableListener(new C3071h(this));
    }

    public final l C() {
        if (this.f17756b == null) {
            m mVar = l.f38464a;
            this.f17756b = new w(this, null, this, this);
        }
        return this.f17756b;
    }

    public final void D() {
        V.h(getWindow().getDecorView(), this);
        V.i(getWindow().getDecorView(), this);
        b.O(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC3340k.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        w wVar = (w) C();
        wVar.v();
        ((ViewGroup) wVar.f38505A.findViewById(android.R.id.content)).addView(view, layoutParams);
        wVar.f38539m.a(wVar.f38538l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        w wVar = (w) C();
        wVar.f38518O = true;
        int i5 = wVar.f38522S;
        if (i5 == -100) {
            i5 = l.f38465b;
        }
        int iD = wVar.D(context, i5);
        if (l.c(context) && l.c(context)) {
            if (!AbstractC2665a.b()) {
                synchronized (l.f38472i) {
                    try {
                        C2668d c2668d = l.f38466c;
                        if (c2668d == null) {
                            if (l.f38467d == null) {
                                l.f38467d = C2668d.b(h.G(context));
                            }
                            if (!l.f38467d.f35497a.isEmpty()) {
                                l.f38466c = l.f38467d;
                            }
                        } else if (!c2668d.equals(l.f38467d)) {
                            C2668d c2668d2 = l.f38466c;
                            l.f38467d = c2668d2;
                            h.D(context, c2668d2.f35497a.a());
                        }
                    } finally {
                    }
                }
            } else if (!l.f38469f) {
                l.f38464a.execute(new c(context, 2));
            }
        }
        C2668d c2668dO = w.o(context);
        Configuration configuration = null;
        if (w.f38504k0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(w.s(context, iD, c2668dO, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C3623d) {
            try {
                ((C3623d) context).a(w.s(context, iD, c2668dO, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (w.f38503j0) {
            int i10 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    if (i10 >= 24) {
                        q.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i10 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i35 = configuration3.uiMode & 15;
                    int i36 = configuration4.uiMode & 15;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 48;
                    int i38 = configuration4.uiMode & 48;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.screenWidthDp;
                    int i40 = configuration4.screenWidthDp;
                    if (i39 != i40) {
                        configuration.screenWidthDp = i40;
                    }
                    int i41 = configuration3.screenHeightDp;
                    int i42 = configuration4.screenHeightDp;
                    if (i41 != i42) {
                        configuration.screenHeightDp = i42;
                    }
                    int i43 = configuration3.smallestScreenWidthDp;
                    int i44 = configuration4.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration.smallestScreenWidthDp = i44;
                    }
                    int i45 = configuration3.densityDpi;
                    int i46 = configuration4.densityDpi;
                    if (i45 != i46) {
                        configuration.densityDpi = i46;
                    }
                }
            }
            Configuration configurationS = w.s(context, iD, c2668dO, configuration, true);
            C3623d c3623d = new C3623d(context, 2132017778);
            c3623d.a(configurationS);
            try {
                if (context.getTheme() != null) {
                    AbstractC1312b.n(c3623d.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c3623d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((w) C()).B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        ((w) C()).B();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w wVar = (w) C();
        wVar.v();
        return wVar.f38538l.findViewById(i5);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w wVar = (w) C();
        if (wVar.f38542p == null) {
            wVar.B();
            H h10 = wVar.f38541o;
            wVar.f38542p = new C3628i(h10 != null ? h10.e0() : wVar.k);
        }
        return wVar.f38542p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i5 = t1.f43917a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        C().b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        w wVar = (w) C();
        if (wVar.f38510F && wVar.f38552z) {
            wVar.B();
            H h10 = wVar.f38541o;
            if (h10 != null) {
                h10.h0(h10.f38389e.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C3830p c3830pA = C3830p.a();
        Context context = wVar.k;
        synchronized (c3830pA) {
            c3830pA.f43866a.l(context);
        }
        wVar.f38521R = new Configuration(wVar.k.getResources().getConfiguration());
        wVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentA;
        if (!super.onMenuItemSelected(i5, menuItem)) {
            w wVar = (w) C();
            wVar.B();
            H h10 = wVar.f38541o;
            if (menuItem.getItemId() != 16908332 || h10 == null || (((o1) h10.f38394j).f43851b & 4) == 0 || (intentA = AbstractC1277e.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = AbstractC1277e.a(this);
            if (intentA2 == null) {
                intentA2 = AbstractC1277e.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = AbstractC1277e.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = AbstractC1277e.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e7);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!e.startActivities(this, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((w) C()).v();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        w wVar = (w) C();
        wVar.B();
        H h10 = wVar.f38541o;
        if (h10 != null) {
            h10.f38408y = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ((w) C()).m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        w wVar = (w) C();
        wVar.B();
        H h10 = wVar.f38541o;
        if (h10 != null) {
            h10.f38408y = false;
            mc.b bVar = h10.f38407x;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i5) {
        super.onTitleChanged(charSequence, i5);
        C().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((w) C()).B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i5) {
        D();
        C().i(i5);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i5) {
        super.setTheme(i5);
        ((w) C()).f38523T = i5;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void supportInvalidateOptionsMenu() {
        C().b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        D();
        C().j(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        C().k(view, layoutParams);
    }
}
