package com.waze.design_components.cta_bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.content.ContextCompat;
import com.google.android.material.datepicker.ac;
import com.waze.R;
import com.waze.asks.ad;
import com.waze.design_components.button.WazeButton;
import h.ab;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CallToActionBar extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private l f23412a;

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f23413b;

    /* renamed from: c, reason: collision with root package name */
    private int f23414c;

    /* renamed from: d, reason: collision with root package name */
    private WazeButton f23415d;

    /* renamed from: e, reason: collision with root package name */
    private WazeButton f23416e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f23417f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.design_components.d f23418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionBar(Context context, AttributeSet attributeSet, int i2) {
        Object next;
        super(context, attributeSet, i2);
        x.f(context, "context");
        this.f23417f = h.g.a(new ad(this, 20));
        int[] iArr = com.waze.design_components.a.f23282a;
        x.e(iArr, "CallToActionBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        h hVar = h.f23438a;
        int i3 = typedArrayObtainStyledAttributes.getInt(1, hVar.b());
        f fVar = f.f23434a;
        Iterator it = h.a.i.i(fVar, hVar, i.f23439a, e.f23433a, k.f23441a, d.f23432a, j.f23440a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((l) next).b() == i3) {
                    break;
                }
            }
        }
        f fVar2 = (l) next;
        this.f23412a = fVar2 == null ? fVar : fVar2;
        this.f23414c = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.background_default));
        String string = typedArrayObtainStyledAttributes.getString(5);
        String string2 = typedArrayObtainStyledAttributes.getString(10);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        float f2 = typedArrayObtainStyledAttributes.getFloat(6, 1.0f);
        float f3 = typedArrayObtainStyledAttributes.getFloat(11, 1.0f);
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.f23300a;
        com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.f23300a;
        com.waze.design_components.b.d dVarH = com.waze.x.g.h(typedArrayObtainStyledAttributes.getInt(3, dVar2.a()));
        com.waze.design_components.b.e eVar = com.waze.design_components.b.e.f23312a;
        com.waze.design_components.b.e eVar2 = com.waze.design_components.b.e.f23312a;
        com.waze.design_components.b.e eVarG = com.waze.x.g.g(typedArrayObtainStyledAttributes.getInt(4, eVar2.a()));
        com.waze.design_components.b.d dVarH2 = com.waze.x.g.h(typedArrayObtainStyledAttributes.getInt(8, dVar2.a()));
        com.waze.design_components.b.e eVarG2 = com.waze.x.g.g(typedArrayObtainStyledAttributes.getInt(9, eVar2.a()));
        l lVar = this.f23412a;
        if (lVar == null) {
            x.j("buttonsConfig");
            lVar = null;
        }
        if (lVar.a() == 1) {
            String str = string == null ? "Text" : string;
            l lVar2 = this.f23412a;
            if (lVar2 == null) {
                x.j("buttonsConfig");
                lVar2 = null;
            }
            this.f23418g = new b(str, z, lVar2.c(), f2, dVarH, eVarG, null, 64);
        } else {
            String str2 = string == null ? "Text" : string;
            l lVar3 = this.f23412a;
            if (lVar3 == null) {
                x.j("buttonsConfig");
                lVar3 = null;
            }
            b bVar = new b(str2, z, lVar3.c(), f2, dVarH, eVarG, null, 64);
            String str3 = string2 == null ? "Text" : string2;
            l lVar4 = this.f23412a;
            if (lVar4 == null) {
                x.j("buttonsConfig");
                lVar4 = null;
            }
            com.waze.design_components.button.g gVarD = lVar4.d();
            x.c(gVarD);
            b bVar2 = new b(str3, z2, gVarD, f3, dVarH2, eVarG2, null, 64);
            l lVar5 = this.f23412a;
            if (lVar5 == null) {
                x.j("buttonsConfig");
                lVar5 = null;
            }
            g gVarE = lVar5.e();
            x.c(gVarE);
            this.f23418g = new c(bVar, bVar2, gVarE);
        }
        q();
        typedArrayObtainStyledAttributes.recycle();
    }

    static final ab a(View.OnClickListener onClickListener, CallToActionBar callToActionBar) {
        WazeButton wazeButton = callToActionBar.f23415d;
        if (wazeButton == null) {
            x.j("firstButton");
            wazeButton = null;
        }
        onClickListener.onClick(wazeButton);
        return ab.f48028a;
    }

    static final ab b(View.OnClickListener onClickListener, CallToActionBar callToActionBar) {
        WazeButton wazeButton = callToActionBar.f23415d;
        if (wazeButton == null) {
            x.j("firstButton");
            wazeButton = null;
        }
        onClickListener.onClick(wazeButton);
        return ab.f48028a;
    }

    static final ab c(View.OnClickListener onClickListener, CallToActionBar callToActionBar) {
        onClickListener.onClick(callToActionBar.f23416e);
        return ab.f48028a;
    }

    private final LinearLayout.LayoutParams m(float f2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, getContext().getResources().getDimensionPixelSize(R.dimen.call_to_action_bar_button_height));
        layoutParams.weight = f2;
        return layoutParams;
    }

    private final LinearLayout.LayoutParams n() {
        return new LinearLayout.LayoutParams(-1, getContext().getResources().getDimensionPixelSize(R.dimen.call_to_action_bar_button_height));
    }

    private final LinearLayout o() {
        LinearLayout linearLayout = this.f23413b;
        if (linearLayout != null) {
            return linearLayout;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final WazeButton p() {
        WazeButton wazeButton = this.f23416e;
        if (wazeButton != null) {
            return wazeButton;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void q() {
        LinearLayout linearLayout = this.f23413b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        removeAllViews();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.call_to_action_bar_layout, (ViewGroup) this, false);
        x.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f23413b = (LinearLayout) viewInflate;
        o().setBackgroundColor(this.f23414c);
        addView(this.f23413b);
        WazeButton wazeButton = this.f23415d;
        if (wazeButton != null) {
            wazeButton.b();
        }
        WazeButton wazeButton2 = this.f23416e;
        if (wazeButton2 != null) {
            wazeButton2.b();
        }
        com.waze.design_components.d dVar = this.f23418g;
        WazeButton wazeButton3 = null;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            Context context = getContext();
            x.e(context, "getContext(...)");
            WazeButton wazeButton4 = new WazeButton(context, null, 0, 6, null);
            wazeButton4.setId(R.id.ctaFirstButtonId);
            b bVar = (b) dVar;
            wazeButton4.f(bVar.e());
            wazeButton4.h(bVar.h());
            wazeButton4.g(bVar.f(), bVar.g());
            wazeButton4.d(bVar.j());
            wazeButton4.setOnClickListener(new ac(dVar, 8));
            this.f23415d = wazeButton4;
            LinearLayout linearLayoutO = o();
            WazeButton wazeButton5 = this.f23415d;
            if (wazeButton5 == null) {
                x.j("firstButton");
            } else {
                wazeButton3 = wazeButton5;
            }
            linearLayoutO.addView(wazeButton3);
            return;
        }
        if (!(dVar instanceof c)) {
            throw new h.i();
        }
        Context context2 = getContext();
        x.e(context2, "getContext(...)");
        WazeButton wazeButton6 = new WazeButton(context2, null, 0, 6, null);
        wazeButton6.setId(R.id.ctaFirstButtonId);
        c cVar = (c) dVar;
        wazeButton6.f(cVar.d().e());
        wazeButton6.h(cVar.d().h());
        wazeButton6.g(cVar.d().f(), cVar.d().g());
        wazeButton6.d(cVar.d().j());
        wazeButton6.setOnClickListener(new ac(dVar, 9));
        this.f23415d = wazeButton6;
        Context context3 = getContext();
        x.e(context3, "getContext(...)");
        WazeButton wazeButton7 = new WazeButton(context3, null, 0, 6, null);
        wazeButton7.setId(R.id.ctaSecondButtonId);
        wazeButton7.f(cVar.e().e());
        wazeButton7.h(cVar.e().h());
        wazeButton7.g(cVar.e().f(), cVar.e().g());
        wazeButton7.d(cVar.e().j());
        wazeButton7.setOnClickListener(new ac(dVar, 10));
        this.f23416e = wazeButton7;
        com.waze.design_components.d dVar2 = this.f23418g;
        if (dVar2 == null) {
            x.j("data");
            dVar2 = null;
        }
        c cVar2 = dVar2 instanceof c ? (c) dVar2 : null;
        if (cVar2 != null) {
            g gVarF = cVar2.f();
            g gVar = g.f23435a;
            if (gVarF == gVar) {
                o().setOrientation(1);
            } else {
                o().setOrientation(0);
            }
            g gVarF2 = cVar.f();
            WazeButton wazeButton8 = this.f23415d;
            if (gVarF2 == gVar) {
                if (wazeButton8 == null) {
                    x.j("firstButton");
                    wazeButton8 = null;
                }
                wazeButton8.setLayoutParams(n());
                p().setLayoutParams(n());
            } else {
                if (wazeButton8 == null) {
                    x.j("firstButton");
                    wazeButton8 = null;
                }
                wazeButton8.setLayoutParams(m(cVar2.d().d()));
                p().setLayoutParams(m(cVar2.e().d()));
            }
        }
        LinearLayout linearLayoutO2 = o();
        WazeButton wazeButton9 = this.f23415d;
        if (wazeButton9 == null) {
            x.j("firstButton");
        } else {
            wazeButton3 = wazeButton9;
        }
        linearLayoutO2.addView(wazeButton3);
        o().addView((Space) this.f23417f.getValue());
        o().addView(this.f23416e);
    }

    public final void d() {
        p().b();
    }

    public final void e(boolean z) {
        c cVarG;
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            cVarG = b.k((b) dVar, null, z, null, 125);
        } else {
            if (!(dVar instanceof c)) {
                throw new h.i();
            }
            c cVar = (c) dVar;
            cVarG = c.g(cVar, b.k(cVar.d(), null, z, null, 125), null, 6);
        }
        this.f23418g = cVarG;
        q();
    }

    public final void f(String str) {
        c cVarG;
        x.f(str, "text");
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            cVarG = b.k((b) dVar, str, false, null, 126);
        } else {
            if (!(dVar instanceof c)) {
                throw new h.i();
            }
            c cVar = (c) dVar;
            cVarG = c.g(cVar, b.k(cVar.d(), str, false, null, 126), null, 6);
        }
        this.f23418g = cVarG;
        q();
    }

    public final void g(View.OnClickListener onClickListener) {
        c cVarG;
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            cVarG = b.k((b) dVar, null, false, new a(onClickListener, this, 0), 63);
        } else {
            if (!(dVar instanceof c)) {
                throw new h.i();
            }
            c cVar = (c) dVar;
            cVarG = c.g(cVar, b.k(cVar.d(), null, false, new a(onClickListener, this, 2), 63), null, 6);
        }
        this.f23418g = cVarG;
        q();
    }

    public final void h(View.OnClickListener onClickListener) {
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            return;
        }
        if (!(dVar instanceof c)) {
            throw new h.i();
        }
        c cVar = (c) dVar;
        this.f23418g = c.g(cVar, null, b.k(cVar.e(), null, false, new a(onClickListener, this, 1), 63), 5);
        q();
    }

    public final void i(boolean z) {
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            return;
        }
        if (!(dVar instanceof c)) {
            throw new h.i();
        }
        c cVar = (c) dVar;
        this.f23418g = c.g(cVar, null, b.k(cVar.e(), null, z, null, 125), 5);
        q();
    }

    public final void j(String str) {
        x.f(str, "text");
        com.waze.design_components.d dVar = this.f23418g;
        if (dVar == null) {
            x.j("data");
            dVar = null;
        }
        if (dVar instanceof b) {
            return;
        }
        if (!(dVar instanceof c)) {
            throw new h.i();
        }
        c cVar = (c) dVar;
        this.f23418g = c.g(cVar, null, b.k(cVar.e(), str, false, null, 126), 5);
        q();
    }

    public final void k(long j2, long j3, com.waze.design_components.button.timer.d dVar) {
        p().i(j2, j3, dVar);
    }

    public final void l(com.waze.design_components.d dVar) {
        x.f(dVar, "ctaBarData");
        this.f23418g = dVar;
        q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionBar(Context context) {
        this(context, null);
        x.f(context, "context");
    }
}
