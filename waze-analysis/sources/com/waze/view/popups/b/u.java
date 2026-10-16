package com.waze.view.popups.b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.waze.R;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f45282a = org.a.b.b.d.a(this);

    /* renamed from: b, reason: collision with root package name */
    private final h.f f45283b = h.g.b(h.h.f48130a, new w(this, 1));

    static final ab b(u uVar, View view) throws Resources.NotFoundException {
        uVar.g(view);
        return ab.f48028a;
    }

    static final void c(u uVar, View view) throws Resources.NotFoundException {
        uVar.f().b(e.f45255a);
        uVar.g(view);
    }

    static final void d(u uVar, View view) throws Resources.NotFoundException {
        uVar.f().b(g.f45257a);
        uVar.g(view);
    }

    static final void e(u uVar, View view) throws Resources.NotFoundException {
        uVar.g(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m f() {
        return (m) this.f45283b.getValue();
    }

    private final void g(View view) throws Resources.NotFoundException {
        view.findViewById(R.id.showPhotoDimmedBackground).animate().alpha(0.0f).start();
        view.findViewById(R.id.showPhotoExitButton).animate().alpha(0.0f).start();
        View viewFindViewById = view.findViewById(R.id.showPhotoContentContainer);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.pop_out_dialog);
        viewFindViewById.startAnimation(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new t(this));
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f45282a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        h.g.b.x.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.view_photo, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("KEY_IMAGE_FILE_PATH", null)) != null) {
            ((ImageView) viewInflate.findViewById(R.id.showPhotoImage)).setImageDrawable(Drawable.createFromPath(string));
        }
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(final View view, Bundle bundle) throws Resources.NotFoundException {
        h.g.b.x.f(view, "rootView");
        if (bundle == null) {
            View viewFindViewById = view.findViewById(R.id.showPhotoDimmedBackground);
            viewFindViewById.setAlpha(0.0f);
            viewFindViewById.animate().alpha(0.6f).start();
            View viewFindViewById2 = view.findViewById(R.id.showPhotoExitButton);
            viewFindViewById2.setAlpha(0.0f);
            viewFindViewById2.animate().alpha(1.0f).start();
            view.findViewById(R.id.showPhotoContentContainer).startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.pop_in_dialog));
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.waze.ad.a.j.r(this, viewLifecycleOwner, new h.g.a.a() { // from class: com.waze.view.popups.b.r
            @Override // h.g.a.a
            public final Object invoke() {
                return u.b(this.f45276a, view);
            }
        });
        final int i2 = 1;
        view.findViewById(R.id.showPhotoDelete).setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.view.popups.b.s

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f45278a;

            {
                this.f45278a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                int i3 = i2;
                if (i3 == 0) {
                    u.d(this.f45278a, view);
                    return;
                }
                View view3 = view;
                u uVar = this.f45278a;
                if (i3 != 1) {
                    u.e(uVar, view3);
                } else {
                    u.c(uVar, view3);
                }
            }
        });
        final int i3 = 0;
        view.findViewById(R.id.showPhotoRetake).setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.view.popups.b.s

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f45278a;

            {
                this.f45278a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                int i32 = i3;
                if (i32 == 0) {
                    u.d(this.f45278a, view);
                    return;
                }
                View view3 = view;
                u uVar = this.f45278a;
                if (i32 != 1) {
                    u.e(uVar, view3);
                } else {
                    u.c(uVar, view3);
                }
            }
        });
        final int i4 = 2;
        view.findViewById(R.id.showPhotoRoot).setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.view.popups.b.s

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u f45278a;

            {
                this.f45278a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                int i32 = i4;
                if (i32 == 0) {
                    u.d(this.f45278a, view);
                    return;
                }
                View view3 = view;
                u uVar = this.f45278a;
                if (i32 != 1) {
                    u.e(uVar, view3);
                } else {
                    u.c(uVar, view3);
                }
            }
        });
    }
}
