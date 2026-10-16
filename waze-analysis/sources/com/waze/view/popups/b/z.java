package com.waze.view.popups.b;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwner;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.reports.eb;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f45290a = org.a.b.b.d.a(this);

    /* renamed from: b, reason: collision with root package name */
    private final h.f f45291b = h.g.b(h.h.f48130a, new w((ComponentCallbacks) this, 2));

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f45292c;

    public z() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.waze.view.popups.b.v
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                z.d(this.f45284a, (Boolean) obj);
            }
        });
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f45292c = activityResultLauncherRegisterForActivityResult;
    }

    static final ab b(z zVar) throws Resources.NotFoundException {
        zVar.e(new d(false));
        return ab.f48028a;
    }

    static final void d(z zVar, Boolean bool) {
        h.g.b.x.f(bool, "isCameraGranted");
        if (bool.booleanValue()) {
            ConfigManager.getInstance().setConfigValueBool(ConfigValues.CONFIG_VALUE_PERMISSIONS_CAMERA, true);
            zVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(h hVar) throws Resources.NotFoundException {
        View view = getView();
        if (view == null) {
            a().b(hVar);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.main_slide_down_bottom);
        animationLoadAnimation.setAnimationListener(new x(this, hVar));
        view.startAnimation(animationLoadAnimation);
    }

    private final void f() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("KEY_SAVE_PATH")) == null) {
            return;
        }
        eb ebVar = new eb();
        ebVar.u(string);
        ebVar.y();
        ebVar.t(new y(this));
        ebVar.x();
        bv childFragmentManager = getChildFragmentManager();
        h.g.b.x.e(childFragmentManager, "getChildFragmentManager(...)");
        ch chVarU = childFragmentManager.u();
        h.g.b.x.e(chVarU, "beginTransaction(...)");
        chVarU.F(R.id.container, ebVar);
        chVarU.g();
    }

    public final m a() {
        return (m) this.f45291b.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f45290a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        h.g.b.x.f(layoutInflater, "inflater");
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = layoutInflater.getContext();
        }
        h.g.b.x.c(context);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(R.id.container);
        return fragmentContainerView;
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        if (requireActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f();
            if (bundle == null) {
                view.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.main_slide_up_bottom));
            }
        } else {
            this.f45292c.launch("android.permission.CAMERA");
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.waze.ad.a.j.r(this, viewLifecycleOwner, new w(this, 0));
    }
}
