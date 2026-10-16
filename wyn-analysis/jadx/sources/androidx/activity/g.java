package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class g implements InterfaceC1455t {

    /* renamed from: c, reason: collision with root package name */
    public static int f17705c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f17706d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f17707e;

    /* renamed from: f, reason: collision with root package name */
    public static Field f17708f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17709a;

    /* renamed from: b, reason: collision with root package name */
    public ComponentActivity f17710b;

    public /* synthetic */ g() {
        this.f17709a = 4;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        switch (this.f17709a) {
            case 0:
                if (enumC1449m == EnumC1449m.ON_DESTROY) {
                    this.f17710b.mContextAwareHelper.f34730b = null;
                    if (!this.f17710b.isChangingConfigurations()) {
                        this.f17710b.getViewModelStore().a();
                    }
                    l lVar = (l) this.f17710b.mReportFullyDrawnExecutor;
                    ComponentActivity componentActivity = lVar.f17717d;
                    componentActivity.getWindow().getDecorView().removeCallbacks(lVar);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                    return;
                }
                return;
            case 1:
                if (enumC1449m == EnumC1449m.ON_STOP) {
                    Window window = this.f17710b.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ComponentActivity componentActivity2 = this.f17710b;
                componentActivity2.ensureViewModelStore();
                componentActivity2.getLifecycle().c(this);
                return;
            case 3:
                if (enumC1449m != EnumC1449m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                w wVar = this.f17710b.mOnBackPressedDispatcher;
                OnBackInvokedDispatcher invoker = i.a((ComponentActivity) interfaceC1457v);
                wVar.getClass();
                AbstractC3340k.e(invoker, "invoker");
                wVar.f17747e = invoker;
                wVar.c(wVar.f17749g);
                return;
            default:
                if (enumC1449m != EnumC1449m.ON_DESTROY) {
                    return;
                }
                if (f17705c == 0) {
                    try {
                        f17705c = 2;
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        f17707e = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                        f17708f = declaredField2;
                        declaredField2.setAccessible(true);
                        Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                        f17706d = declaredField3;
                        declaredField3.setAccessible(true);
                        f17705c = 1;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (f17705c == 1) {
                    InputMethodManager inputMethodManager = (InputMethodManager) this.f17710b.getSystemService("input_method");
                    try {
                        Object obj = f17706d.get(inputMethodManager);
                        if (obj == null) {
                            return;
                        }
                        synchronized (obj) {
                            try {
                                View view = (View) f17707e.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        f17708f.set(inputMethodManager, null);
                                        inputMethodManager.isActive();
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            } catch (IllegalAccessException unused4) {
                            } finally {
                            }
                        }
                        return;
                    } catch (IllegalAccessException unused5) {
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ g(ComponentActivity componentActivity, int i5) {
        this.f17709a = i5;
        this.f17710b = componentActivity;
    }
}
