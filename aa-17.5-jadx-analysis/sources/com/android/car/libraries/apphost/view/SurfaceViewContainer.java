package com.android.car.libraries.apphost.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import defpackage.ajmd;
import defpackage.hln;
import defpackage.ili;

/* loaded from: classes2.dex */
public class SurfaceViewContainer extends SurfaceView implements hln {
    public boolean b;
    public ajmd c;
    private boolean d;
    private boolean e;
    private final SurfaceHolder.Callback f;

    public SurfaceViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.f = new ili(this, 1);
    }

    @Override // defpackage.hln
    public final int a() {
        if (this.b) {
            return getResources().getDisplayMetrics().densityDpi;
        }
        return 0;
    }

    @Override // defpackage.hln
    public final Surface b() {
        if (this.b) {
            return getHolder().getSurface();
        }
        if (!Log.isLoggable("CarApp.H.Tem", 2)) {
            return null;
        }
        Log.v("CarApp.H.Tem", "Surface is not ready for use");
        return null;
    }

    @Override // defpackage.hln
    public final void c() {
        super.onWindowVisibilityChanged(8);
    }

    @Override // defpackage.hln
    public final void d() {
        if (Build.VERSION.SDK_INT >= 30 && !this.d) {
            if (this.e) {
                setZOrderOnTop(true);
            }
            getHolder().setFormat(-2);
            this.d = true;
        }
    }

    @Override // defpackage.hln
    public final void e() {
        super.onWindowVisibilityChanged(0);
    }

    @Override // defpackage.hln
    public final void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.d) {
            if (this.e) {
                setZOrderOnTop(false);
            }
            this.d = false;
        }
    }

    @Override // defpackage.hln
    public final void g() {
        this.e = false;
    }

    @Override // defpackage.hln
    public final void h(ajmd ajmdVar) {
        this.c = ajmdVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getHolder().addCallback(this.f);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHolder().removeCallback(this.f);
    }

    public SurfaceViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SurfaceViewContainer(Context context) {
        this(context, null);
    }
}
