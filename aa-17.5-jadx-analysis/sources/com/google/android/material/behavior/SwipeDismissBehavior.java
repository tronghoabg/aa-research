package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.dsg;
import defpackage.ebm;
import defpackage.edf;
import defpackage.eem;
import defpackage.een;
import defpackage.wlp;
import defpackage.wlq;
import defpackage.ykd;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends dsg<V> {
    public een a;
    public boolean b;
    public ykd f;
    private boolean g;
    public int c = 2;
    public float d = BitmapDescriptorFactory.HUE_RED;
    public float e = 0.5f;
    private final eem h = new wlp(this);

    public static float K(float f) {
        return Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, f), 1.0f);
    }

    public boolean J(View view) {
        return true;
    }

    @Override // defpackage.dsg
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zK = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zK = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = zK;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (zK) {
            een eenVarB = this.a;
            if (eenVarB == null) {
                eenVarB = een.b(coordinatorLayout, this.h);
                this.a = eenVarB;
            }
            if (!this.b && eenVarB.i(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsg
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        ebm.l(view, 1048576);
        if (!J(view)) {
            return false;
        }
        ebm.u(view, edf.i, new wlq(this));
        return false;
    }

    @Override // defpackage.dsg
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }
}
