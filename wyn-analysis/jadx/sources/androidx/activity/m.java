package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.V;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;

/* loaded from: classes.dex */
public class m extends Dialog implements InterfaceC1457v, y, n3.f {

    /* renamed from: a, reason: collision with root package name */
    public C1459x f17718a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.e f17719b;

    /* renamed from: c, reason: collision with root package name */
    public final w f17720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i5) {
        super(context, i5);
        AbstractC3340k.e(context, "context");
        this.f17719b = new n3.e(this);
        this.f17720c = new w(new C8.g(this, 27));
    }

    public static void a(m this$0) {
        AbstractC3340k.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3340k.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        AbstractC3340k.b(window);
        View decorView = window.getDecorView();
        AbstractC3340k.d(decorView, "window!!.decorView");
        V.h(decorView, this);
        Window window2 = getWindow();
        AbstractC3340k.b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC3340k.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC3340k.b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC3340k.d(decorView3, "window!!.decorView");
        tg.b.O(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        C1459x c1459x = this.f17718a;
        if (c1459x != null) {
            return c1459x;
        }
        C1459x c1459x2 = new C1459x(this);
        this.f17718a = c1459x2;
        return c1459x2;
    }

    @Override // androidx.activity.y
    public final w getOnBackPressedDispatcher() {
        return this.f17720c;
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        return this.f17719b.f40911b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f17720c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC3340k.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.f17720c;
            wVar.getClass();
            wVar.f17747e = onBackInvokedDispatcher;
            wVar.c(wVar.f17749g);
        }
        this.f17719b.b(bundle);
        C1459x c1459x = this.f17718a;
        if (c1459x == null) {
            c1459x = new C1459x(this);
            this.f17718a = c1459x;
        }
        c1459x.f(EnumC1449m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC3340k.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f17719b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1459x c1459x = this.f17718a;
        if (c1459x == null) {
            c1459x = new C1459x(this);
            this.f17718a = c1459x;
        }
        c1459x.f(EnumC1449m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1459x c1459x = this.f17718a;
        if (c1459x == null) {
            c1459x = new C1459x(this);
            this.f17718a = c1459x;
        }
        c1459x.f(EnumC1449m.ON_DESTROY);
        this.f17718a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        b();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC3340k.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3340k.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
