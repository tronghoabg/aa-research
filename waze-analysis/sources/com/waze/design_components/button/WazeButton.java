package com.waze.design_components.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.waze.R;
import com.waze.design_components.button.timer.WazeButtonTimer;
import h.a.r;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f23317a = r.k(new k(f.f23355c, r.k(new k(c.f23333b, d.f23338b), new k(c.f23334c, d.f23339c), new k(c.f23335d, d.f23340d))), new k(f.f23353a, r.k(new k(c.f23333b, d.f23341e), new k(c.f23334c, d.f23342f), new k(c.f23335d, d.f23343g))), new k(f.f23354b, r.k(new k(c.f23333b, d.f23344h), new k(c.f23334c, d.f23345i), new k(c.f23335d, d.f23346j))));

    /* renamed from: b, reason: collision with root package name */
    private View f23318b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f23319c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f23320d;

    /* renamed from: e, reason: collision with root package name */
    private WazeButtonTimer f23321e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.design_components.button.timer.d f23322f;

    /* renamed from: g, reason: collision with root package name */
    private g f23323g;

    /* renamed from: h, reason: collision with root package name */
    private f f23324h;

    /* renamed from: i, reason: collision with root package name */
    private e f23325i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.design_components.b.d f23326j;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.design_components.b.e f23327k;

    /* renamed from: l, reason: collision with root package name */
    private String f23328l;
    private boolean m;
    private boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeButton(Context context, AttributeSet attributeSet, int i2) {
        e eVar;
        Object next;
        f fVar;
        String strB;
        super(context, attributeSet, i2);
        x.f(context, "context");
        g gVar = g.f23358a;
        this.f23323g = gVar;
        f fVar2 = f.f23353a;
        this.f23324h = fVar2;
        e eVar2 = e.f23349a;
        this.f23325i = eVar2;
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.f23300a;
        this.f23326j = dVar;
        com.waze.design_components.b.e eVar3 = com.waze.design_components.b.e.f23312a;
        this.f23327k = eVar3;
        this.m = true;
        this.n = true;
        int[] iArr = com.waze.design_components.a.f23283b;
        x.e(iArr, "WazeButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(4, gVar.a());
        int i4 = typedArrayObtainStyledAttributes.getInt(2, fVar2.a());
        int i5 = typedArrayObtainStyledAttributes.getInt(1, eVar2.a());
        int i6 = typedArrayObtainStyledAttributes.getInt(6, dVar.a());
        int i7 = typedArrayObtainStyledAttributes.getInt(7, eVar3.a());
        Iterator<E> it = g.b().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((g) next).a() == i3) {
                    break;
                }
            }
        }
        g gVar2 = (g) next;
        this.f23323g = gVar2 != null ? gVar2 : gVar;
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i8];
            f[] fVarArr = fVarArrValues;
            if (fVar.a() == i4) {
                break;
            }
            i8++;
            fVarArrValues = fVarArr;
        }
        this.f23324h = fVar != null ? fVar : fVar2;
        e[] eVarArrValues = e.values();
        int length2 = eVarArrValues.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length2) {
                break;
            }
            e eVar4 = eVarArrValues[i9];
            if (eVar4.a() == i5) {
                eVar = eVar4;
                break;
            }
            i9++;
        }
        this.f23325i = eVar != null ? eVar : eVar2;
        this.f23326j = com.waze.x.g.h(i6);
        this.f23327k = com.waze.x.g.g(i7);
        this.m = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.n = typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            x.e(iArr, "WazeButton");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.f23328l = typedArrayObtainStyledAttributes2.getString(3);
            typedArrayObtainStyledAttributes2.recycle();
        } else {
            com.waze.design_components.g.c cVarN = com.waze.design_components.d.b.n(attributeSet, com.waze.design_components.g.d.f23465b, "wazeButtonText");
            if (cVarN.a() != null) {
                strB = com.waze.design_components.g.b.d(this).c(cVarN.a().intValue(), new Object[0]);
            } else {
                strB = cVarN.b() != null ? cVarN.b() : strB;
            }
            this.f23328l = strB;
        }
        setClickable(this.m);
        o();
    }

    static final void c(WazeButton wazeButton) {
        wazeButton.p();
    }

    static final void j(WazeButton wazeButton) {
        wazeButton.l();
    }

    private final int k() {
        f fVar = this.f23324h;
        f fVar2 = f.f23353a;
        g gVar = g.f23358a;
        int iOrdinal = fVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 2 ? R.drawable.small_button_bg : R.drawable.large_button_bg : R.drawable.normal_button_bg;
    }

    private final void l() {
        com.waze.design_components.button.timer.d dVar = this.f23322f;
        if (dVar != null) {
            dVar.a();
        } else {
            performClick();
        }
    }

    private final void m() {
        setBackgroundResource(k());
        ViewCompat.setBackgroundTintList(this, ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), !this.m ? R.color.surface_variant : this.f23323g == g.f23359b ? R.color.surface_default : this.f23325i == e.f23350b ? R.color.alarming : R.color.primary, null)));
    }

    private final void n() {
        TextView textView;
        ImageView imageView;
        int color = ResourcesCompat.getColor(getResources(), !this.m ? R.color.disabled_text : this.f23323g == g.f23358a ? R.color.on_primary : this.f23325i == e.f23350b ? R.color.alarming_variant : R.color.primary_variant, null);
        if (s() && this.n && (imageView = this.f23320d) != null) {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(color));
            ImageViewCompat.setImageTintMode(imageView, PorterDuff.Mode.SRC_IN);
        }
        if (!t() || (textView = this.f23319c) == null) {
            return;
        }
        textView.setTextColor(color);
    }

    private final void o() {
        d dVar;
        View view = this.f23318b;
        if (view != null) {
            removeView(view);
        }
        this.f23318b = null;
        this.f23319c = null;
        this.f23320d = null;
        f fVar = this.f23324h;
        boolean zT = t();
        boolean zS = s();
        c cVar = (zT && zS) ? c.f23333b : zT ? c.f23334c : zS ? c.f23335d : c.f23332a;
        Map map = (Map) f23317a.get(fVar);
        if (map == null || (dVar = (d) map.get(cVar)) == null) {
            dVar = d.f23337a;
        }
        if (dVar == d.f23337a) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(dVar.a(), (ViewGroup) this, false);
        this.f23318b = viewInflate;
        addView(viewInflate);
        if (t()) {
            this.f23319c = (TextView) findViewById(R.id.wazeButtonText);
            r();
        }
        if (s()) {
            this.f23320d = (ImageView) findViewById(R.id.wazeButtonImage);
            q();
        }
        m();
        n();
        if (this.f23321e != null) {
            post(new Runnable() { // from class: com.waze.design_components.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    WazeButton.c(this.f23331a);
                }
            });
        }
    }

    private final void p() {
        if (this.f23321e == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.button_timer_layout, (ViewGroup) this, false);
            x.d(viewInflate, "null cannot be cast to non-null type com.waze.design_components.button.timer.WazeButtonTimer");
            WazeButtonTimer wazeButtonTimer = (WazeButtonTimer) viewInflate;
            this.f23321e = wazeButtonTimer;
            addView(wazeButtonTimer, 0);
        }
        WazeButtonTimer wazeButtonTimer2 = this.f23321e;
        if (wazeButtonTimer2 != null) {
            wazeButtonTimer2.setBackgroundResource(k());
            Resources resources = getResources();
            g gVar = this.f23323g;
            f fVar = f.f23353a;
            g gVar2 = g.f23358a;
            wazeButtonTimer2.setAlpha(ResourcesCompat.getFloat(resources, gVar.ordinal() != 0 ? R.integer.button_secondary_timer_alpha : R.integer.button_primary_timer_alpha));
            ViewCompat.setBackgroundTintList(wazeButtonTimer2, ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), this.f23323g == g.f23358a ? R.color.ink_on_primary_opaque : this.f23325i == e.f23349a ? R.color.primary : R.color.alarming, null)));
        }
    }

    private final void q() {
        ImageView imageView = this.f23320d;
        if (imageView != null) {
            imageView.setImageResource(this.f23326j.c(this.f23327k));
        }
    }

    private final void r() {
        TextView textView = this.f23319c;
        if (textView != null) {
            textView.setText(this.f23328l);
        }
    }

    private final boolean s() {
        return this.f23326j != com.waze.design_components.b.d.f23300a;
    }

    private final boolean t() {
        String str = this.f23328l;
        return str != null && str.length() > 0;
    }

    public final String a() {
        return this.f23328l;
    }

    public final void b() {
        WazeButtonTimer wazeButtonTimer = this.f23321e;
        if (wazeButtonTimer != null) {
            wazeButtonTimer.c();
        }
    }

    public final void d(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        setClickable(z);
        n();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void e(e eVar) {
        x.f(eVar, "sentiment");
        if (this.f23325i == eVar) {
            return;
        }
        this.f23325i = eVar;
        n();
        m();
    }

    public final void f(g gVar) {
        x.f(gVar, "buttonType");
        this.f23323g = gVar;
        o();
    }

    public final void g(com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar) {
        x.f(dVar, "systemIcon");
        x.f(eVar, "systemIconType");
        boolean z = !s();
        boolean z2 = dVar == com.waze.design_components.b.d.f23300a;
        this.f23326j = dVar;
        this.f23327k = eVar;
        if (z != z2) {
            o();
        } else {
            q();
        }
    }

    public final void h(String str) {
        boolean z = true;
        boolean z2 = !t();
        String str2 = str;
        if (str2 != null && !o.G(str2)) {
            z = false;
        }
        this.f23328l = str;
        if (z2 != z) {
            o();
        } else {
            r();
        }
    }

    public final void i(long j2, long j3, com.waze.design_components.button.timer.d dVar) {
        p();
        this.f23322f = dVar;
        if (j2 <= j3) {
            l();
            return;
        }
        WazeButtonTimer wazeButtonTimer = this.f23321e;
        if (wazeButtonTimer != null) {
            wazeButtonTimer.d(j2, j3, new com.waze.design_components.button.timer.d() { // from class: com.waze.design_components.button.a
                @Override // com.waze.design_components.button.timer.d
                public final void a() {
                    WazeButton.j(this.f23330a);
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        Resources resources = getResources();
        f fVar = this.f23324h;
        f fVar2 = f.f23353a;
        g gVar = g.f23358a;
        int iOrdinal = fVar.ordinal();
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelOffset(iOrdinal != 0 ? iOrdinal != 2 ? R.dimen.button_small_size : R.dimen.button_large_size : R.dimen.button_normal_size), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeButton(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ WazeButton(Context context, AttributeSet attributeSet, int i2, int i3, h.g.b.o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
