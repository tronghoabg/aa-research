package kc;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.F;
import androidx.fragment.app.FragmentActivity;
import g2.C2690k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import lc.C3458b;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes5.dex */
public class l extends F implements e, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f39491e = View.generateViewId();

    /* renamed from: b, reason: collision with root package name */
    public f f39493b;

    /* renamed from: a, reason: collision with root package name */
    public final i f39492a = new i(this);

    /* renamed from: c, reason: collision with root package name */
    public final l f39494c = this;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.x f39495d = new androidx.activity.x(this, 1);

    public l() {
        setArguments(new Bundle());
    }

    @Override // kc.e
    public final String A() {
        return getArguments().getString("dart_entrypoint_uri");
    }

    public final boolean G(String str) {
        f fVar = this.f39493b;
        if (fVar == null) {
            Log.w("FlutterFragment", "FlutterFragment " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        }
        if (fVar.f39470i) {
            return true;
        }
        Log.w("FlutterFragment", "FlutterFragment " + hashCode() + StringUtils.SPACE + str + " called after detach.");
        return false;
    }

    @Override // kc.e, kc.h
    public final C3458b a() {
        LayoutInflater.Factory activity = getActivity();
        if (!(activity instanceof h)) {
            return null;
        }
        getContext();
        return ((h) activity).a();
    }

    @Override // kc.e, kc.g
    public final void b(C3458b c3458b) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof g) {
            ((g) activity).b(c3458b);
        }
    }

    @Override // kc.e, kc.g
    public final void c(C3458b c3458b) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof g) {
            ((g) activity).c(c3458b);
        }
    }

    @Override // kc.e
    public final void d() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.l) {
            ((io.flutter.embedding.engine.renderer.l) activity).d();
        }
    }

    @Override // kc.e
    public final void e() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.l) {
            ((io.flutter.embedding.engine.renderer.l) activity).e();
        }
    }

    @Override // kc.e
    public final List f() {
        return getArguments().getStringArrayList("dart_entrypoint_args");
    }

    @Override // kc.e
    public final String h() {
        return getArguments().getString("cached_engine_id", null);
    }

    @Override // kc.e
    public final boolean i() {
        return getArguments().containsKey("enable_state_restoration") ? getArguments().getBoolean("enable_state_restoration") : h() == null;
    }

    @Override // kc.e
    public final void k() {
        Log.w("FlutterFragment", "FlutterFragment " + this + " connection to the engine " + this.f39493b.f39463b + " evicted by another attaching activity");
        f fVar = this.f39493b;
        if (fVar != null) {
            fVar.h();
            this.f39493b.i();
        }
    }

    @Override // kc.e
    public final String l() {
        return getArguments().getString("initial_route");
    }

    @Override // kc.e
    public final N2.j m(Activity activity, C3458b c3458b) {
        if (activity != null) {
            return new N2.j(getActivity(), c3458b.f40261l, this);
        }
        return null;
    }

    @Override // kc.e
    public final String n() {
        return getArguments().getString("app_bundle_path");
    }

    @Override // kc.e
    public final a2.v o() {
        String[] stringArray = getArguments().getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        a2.v vVar = new a2.v(15, false);
        vVar.f17322b = new HashSet(Arrays.asList(stringArray));
        return vVar;
    }

    @Override // androidx.fragment.app.F
    public final void onActivityResult(int i5, int i10, Intent intent) {
        if (G("onActivityResult")) {
            this.f39493b.e(i5, i10, intent);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f39494c.getClass();
        f fVar = new f(this);
        this.f39493b = fVar;
        fVar.f();
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            androidx.activity.w onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            androidx.activity.x xVar = this.f39495d;
            onBackPressedDispatcher.a(this, xVar);
            xVar.f(false);
        }
        context.registerComponentCallbacks(this);
    }

    @Override // androidx.fragment.app.F
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f39495d.f(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        this.f39493b.m(bundle);
    }

    @Override // androidx.fragment.app.F
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f39493b.g(f39491e, getArguments().getBoolean("should_delay_first_android_view_draw"));
    }

    @Override // androidx.fragment.app.F
    public final void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.f39492a);
        if (G("onDestroyView")) {
            this.f39493b.h();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        f fVar = this.f39493b;
        if (fVar == null) {
            toString();
            return;
        }
        fVar.i();
        f fVar2 = this.f39493b;
        fVar2.f39462a = null;
        fVar2.f39463b = null;
        fVar2.f39464c = null;
        fVar2.f39465d = null;
        this.f39493b = null;
    }

    @Override // androidx.fragment.app.F
    public final void onPause() {
        super.onPause();
        if (G("onPause")) {
            f fVar = this.f39493b;
            fVar.c();
            fVar.f39462a.getClass();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                C2690k c2690k = c3458b.f40257g;
                c2690k.f(3, c2690k.f35615a);
            }
        }
    }

    @Override // androidx.fragment.app.F
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (G("onRequestPermissionsResult")) {
            this.f39493b.l(i5, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onResume() {
        super.onResume();
        if (G("onResume")) {
            f fVar = this.f39493b;
            fVar.c();
            fVar.f39462a.getClass();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                C2690k c2690k = c3458b.f40257g;
                c2690k.f(2, c2690k.f35615a);
            }
        }
    }

    @Override // androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (G("onSaveInstanceState")) {
            this.f39493b.n(bundle);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStart() {
        super.onStart();
        if (G("onStart")) {
            this.f39493b.o();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStop() {
        super.onStop();
        if (G("onStop")) {
            this.f39493b.p();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        if (G("onTrimMemory")) {
            this.f39493b.q(i5);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onViewCreated(View view, Bundle bundle) {
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f39492a);
    }

    @Override // kc.e
    public final int p() {
        String string = getArguments().getString("flutterview_render_mode", "surface");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("surface")) {
            return 1;
        }
        if (string.equals("texture")) {
            return 2;
        }
        if (string.equals("image")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.RenderMode.".concat(string));
    }

    @Override // kc.e
    public final int q() {
        String string = getArguments().getString("flutterview_transparency_mode", "transparent");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("opaque")) {
            return 1;
        }
        if (string.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.TransparencyMode.".concat(string));
    }

    @Override // kc.e
    public final boolean r() {
        FragmentActivity activity;
        if (!getArguments().getBoolean("should_automatically_handle_on_back_pressed", false) || (activity = getActivity()) == null) {
            return false;
        }
        androidx.activity.x xVar = this.f39495d;
        boolean z2 = xVar.f17724a;
        if (z2) {
            xVar.f(false);
        }
        activity.getOnBackPressedDispatcher().b();
        if (z2) {
            xVar.f(true);
        }
        return true;
    }

    @Override // kc.e
    public final String s() {
        return getArguments().getString("dart_entrypoint", "main");
    }

    @Override // kc.e
    public final boolean t() {
        return getArguments().getBoolean("handle_deeplinking");
    }

    @Override // kc.e
    public final boolean v() {
        return this.f39495d.f17724a;
    }

    @Override // kc.e
    public final void w(boolean z2) {
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            this.f39495d.f(z2);
        }
    }

    @Override // kc.e
    public final String x() {
        return getArguments().getString("cached_engine_group_id", null);
    }

    @Override // kc.e
    public final boolean y() {
        return getArguments().getBoolean("should_attach_engine_to_activity");
    }

    @Override // kc.e
    public final boolean z() {
        boolean z2 = getArguments().getBoolean("destroy_engine_with_fragment", false);
        return (h() != null || this.f39493b.f39467f) ? z2 : getArguments().getBoolean("destroy_engine_with_fragment", true);
    }
}
