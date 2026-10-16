package l4;

import A.AbstractC0213f;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.m0;
import vf.AbstractC4345a;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3386b extends I {

    /* renamed from: i, reason: collision with root package name */
    public final DialogC3391g f39946i;

    /* renamed from: j, reason: collision with root package name */
    public final int f39947j;
    public DialogC3391g k;

    public C3386b(DialogC3391g dialogC3391g, int i5) {
        this.f39946i = dialogC3391g;
        this.f39947j = i5;
        EnumC3388d enumC3388d = dialogC3391g.f39988c.f39966f;
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        this.f39946i.f39988c.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.I
    public final void onBindViewHolder(m0 m0Var, int i5) {
        ViewOnClickListenerC3385a viewOnClickListenerC3385a = (ViewOnClickListenerC3385a) m0Var;
        View view = viewOnClickListenerC3385a.itemView;
        DialogC3391g dialogC3391g = this.f39946i;
        dialogC3391g.f39988c.getClass();
        C3389e c3389e = dialogC3391g.f39988c;
        int i10 = c3389e.f39957B;
        viewOnClickListenerC3385a.itemView.setEnabled(true);
        int iF = AbstractC0213f.f(dialogC3391g.f40000p);
        CompoundButton compoundButton = viewOnClickListenerC3385a.f39944c;
        if (iF != 1) {
            if (iF != 2) {
                throw null;
            }
            throw null;
        }
        RadioButton radioButton = (RadioButton) compoundButton;
        boolean z2 = c3389e.f39980u == i5;
        int i11 = c3389e.f39973n;
        int iH = AbstractC4345a.h(0.3f, AbstractC4345a.y(AbstractC4345a.D(radioButton.getContext(), R.attr.textColorPrimary, 0)) ? -16777216 : -1);
        radioButton.setButtonTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC4345a.D(radioButton.getContext(), com.wynauto.wyn.R.attr.colorControlNormal, 0), i11, iH, iH}));
        radioButton.setChecked(z2);
        radioButton.setEnabled(true);
        throw null;
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f39947j, viewGroup, false);
        DialogC3391g dialogC3391g = this.f39946i;
        C3389e c3389e = dialogC3391g.f39988c;
        c3389e.getClass();
        Drawable drawableE = AbstractC4345a.E(c3389e.f39961a, com.wynauto.wyn.R.attr.md_list_selector);
        if (drawableE == null) {
            drawableE = AbstractC4345a.E(dialogC3391g.getContext(), com.wynauto.wyn.R.attr.md_list_selector);
        }
        viewInflate.setBackground(drawableE);
        return new ViewOnClickListenerC3385a(viewInflate, this);
    }
}
