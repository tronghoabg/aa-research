package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeValidatedEditText extends ad {

    /* renamed from: d, reason: collision with root package name */
    private z f39169d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39170e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39171f;

    /* renamed from: g, reason: collision with root package name */
    private m f39172g;

    /* renamed from: h, reason: collision with root package name */
    private y f39173h;

    /* renamed from: i, reason: collision with root package name */
    private y f39174i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f39175j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeValidatedEditText(Context context, AttributeSet attributeSet, int i2) {
        int color;
        int color2;
        int color3;
        super(context, attributeSet, i2);
        h.g.b.x.f(context, "context");
        y yVar = y.f39287a;
        this.f39173h = yVar;
        this.f39174i = yVar;
        this.f39175j = new Runnable() { // from class: com.waze.sharedui.views.aq
            @Override // java.lang.Runnable
            public final void run() {
                WazeValidatedEditText.z(this.f39219a);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39069g);
        h.g.b.x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f39169d = typedArrayObtainStyledAttributes.getInt(1, -1) == j.f39248a.ordinal() ? new l() : new a();
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(7, -1);
            String strC = resourceId != -1 ? com.waze.shared_infra.o.b.a().c(resourceId, new Object[0]) : typedArrayObtainStyledAttributes.getString(7);
            if (strC != null) {
                this.f39172g = new ar(strC);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
            g().setHint(resourceId2 != -1 ? com.waze.shared_infra.o.b.a().c(resourceId2, new Object[0]) : typedArrayObtainStyledAttributes.getString(2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6) && (color3 = typedArrayObtainStyledAttributes.getColor(6, -1)) != -1) {
            this.f39187a = color3;
        }
        if (typedArrayObtainStyledAttributes.hasValue(4) && (color2 = typedArrayObtainStyledAttributes.getColor(4, -1)) != -1) {
            g().setTextColor(color2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && (color = typedArrayObtainStyledAttributes.getColor(8, -1)) != -1) {
            this.f39188b = color;
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(9, -1.0f);
            if (dimension != -1.0f) {
                this.f39189c = dimension;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39068f);
        h.g.b.x.e(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.hasValue(3)) {
            int i3 = typedArrayObtainStyledAttributes2.getInt(3, 1);
            WazeEditTextBase wazeEditTextBaseG = g();
            wazeEditTextBaseG.f39154a = i3;
            wazeEditTextBaseG.getContext();
            wazeEditTextBaseG.i();
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            this.f39170e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            p(typedArrayObtainStyledAttributes.getResourceId(3, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            g().setInputType(typedArrayObtainStyledAttributes.getInt(0, 1));
        }
        typedArrayObtainStyledAttributes2.recycle();
        typedArrayObtainStyledAttributes.recycle();
        g().addTextChangedListener(new ah(this, 2));
        f().setVisibility(0);
        f().getLayoutParams().height = com.waze.shared_infra.i.h.r(30);
        f().getLayoutParams().width = com.waze.shared_infra.i.h.r(30);
        s(0, R.drawable.error_icon);
        n();
        r(null, new com.waze.profile.m(this, 18));
    }

    static final void z(WazeValidatedEditText wazeValidatedEditText) {
        wazeValidatedEditText.c(wazeValidatedEditText.f39173h);
    }

    public final void A() {
        m mVar = this.f39172g;
        if (mVar != null) {
            w(mVar.a(i()));
        }
    }

    public final boolean B() {
        return this.f39171f;
    }

    public final boolean C() {
        return this.f39170e;
    }

    public final void D() {
        this.f39171f = true;
    }

    public final y a() {
        String string = g().getText().toString();
        h.g.b.x.f(string, "text");
        Runnable runnable = this.f39175j;
        removeCallbacks(runnable);
        z zVar = this.f39169d;
        if (zVar == null) {
            h.g.b.x.j("textValidator");
            zVar = null;
        }
        y yVarA = zVar.a(string);
        this.f39173h = yVarA;
        y yVar = this.f39174i;
        if (yVarA != yVar) {
            if (yVar != y.f39287a || this.f39173h == y.f39288b) {
                post(runnable);
            } else {
                postDelayed(runnable, 0L);
            }
        }
        return this.f39173h;
    }

    public final void b(m mVar) {
        this.f39172g = mVar;
    }

    public final void c(y yVar) {
        h.g.b.x.f(yVar, "textStatus");
        if (h() != ac.DISABLED) {
            y yVar2 = y.f39287a;
            int iOrdinal = yVar.ordinal();
            t(iOrdinal != 1 ? iOrdinal != 2 ? ac.EMPTY : ac.ERROR : ac.FOCUS);
        }
        if (yVar != y.f39289c) {
            k(true);
        }
        this.f39174i = yVar;
    }

    public final void d(z zVar) {
        this.f39169d = zVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        return g().requestFocus(i2, rect);
    }

    @Override // com.waze.sharedui.views.ad
    public final void t(ac acVar) {
        removeCallbacks(this.f39175j);
        super.t(acVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeValidatedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WazeValidatedEditText(Context context) {
        this(context, null, 0, 6, null);
        h.g.b.x.f(context, "context");
    }

    public /* synthetic */ WazeValidatedEditText(Context context, AttributeSet attributeSet, int i2, int i3, h.g.b.o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
