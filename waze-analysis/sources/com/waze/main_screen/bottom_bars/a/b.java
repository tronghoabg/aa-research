package com.waze.main_screen.bottom_bars.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.navigate.bx;
import com.waze.ui.minimized_eta_bar.MinimizedEtaBar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends com.waze.main_screen.bottom_bars.a {

    /* renamed from: a, reason: collision with root package name */
    private MinimizedEtaBar f25921a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25922b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        x.f(context, "context");
        this.f25923c = true;
        j();
    }

    static final void i(b bVar) {
        bVar.b(1);
    }

    private final void j() {
        MinimizedEtaBar minimizedEtaBar;
        MinimizedEtaBar minimizedEtaBar2;
        MinimizedEtaBar minimizedEtaBar3 = this.f25921a;
        String strB = minimizedEtaBar3 != null ? minimizedEtaBar3.b() : null;
        MinimizedEtaBar minimizedEtaBar4 = this.f25921a;
        String strC = minimizedEtaBar4 != null ? minimizedEtaBar4.c() : null;
        MinimizedEtaBar minimizedEtaBar5 = this.f25921a;
        String strA = minimizedEtaBar5 != null ? minimizedEtaBar5.a() : null;
        MinimizedEtaBar minimizedEtaBar6 = this.f25921a;
        Boolean boolValueOf = minimizedEtaBar6 != null ? Boolean.valueOf(minimizedEtaBar6.j()) : null;
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.eta_compact_bar_component_widget, (ViewGroup) this, true);
        MinimizedEtaBar minimizedEtaBar7 = (MinimizedEtaBar) findViewById(R.id.compactEtaBar);
        this.f25921a = minimizedEtaBar7;
        if (this.f25922b) {
            if (strB != null && minimizedEtaBar7 != null) {
                minimizedEtaBar7.e(strB);
            }
            if (strC != null && (minimizedEtaBar2 = this.f25921a) != null) {
                minimizedEtaBar2.g(strC);
            }
            if (strA != null && (minimizedEtaBar = this.f25921a) != null) {
                minimizedEtaBar.d(strA);
            }
            if (boolValueOf != null) {
                boolean zBooleanValue = boolValueOf.booleanValue();
                MinimizedEtaBar minimizedEtaBar8 = this.f25921a;
                if (minimizedEtaBar8 != null) {
                    minimizedEtaBar8.f(zBooleanValue);
                }
            }
        }
        k();
    }

    private final void k() {
        if (this.f25923c) {
            setOnClickListener(new a(this, 0));
        } else {
            setOnClickListener(null);
        }
    }

    public final void c() {
        this.f25922b = true;
    }

    public final void d() {
        j();
    }

    public final void e(boolean z) {
        this.f25923c = z;
        k();
    }

    public final void f(int i2, int i3) {
        MinimizedEtaBar minimizedEtaBar = this.f25921a;
        if (minimizedEtaBar != null) {
            minimizedEtaBar.h(i2, i3);
        }
    }

    public final void g(int i2) {
        MinimizedEtaBar minimizedEtaBar = this.f25921a;
        if (minimizedEtaBar != null) {
            minimizedEtaBar.i(i2);
        }
    }

    public final void h(bx bxVar) {
        x.f(bxVar, "etaBarModel");
        MinimizedEtaBar minimizedEtaBar = this.f25921a;
        if (minimizedEtaBar != null) {
            minimizedEtaBar.e(bxVar.b());
        }
        MinimizedEtaBar minimizedEtaBar2 = this.f25921a;
        if (minimizedEtaBar2 != null) {
            minimizedEtaBar2.g(bxVar.c());
        }
        MinimizedEtaBar minimizedEtaBar3 = this.f25921a;
        if (minimizedEtaBar3 != null) {
            minimizedEtaBar3.d(bxVar.a());
        }
        MinimizedEtaBar minimizedEtaBar4 = this.f25921a;
        if (minimizedEtaBar4 != null) {
            minimizedEtaBar4.f(bxVar.e());
        }
    }
}
