package com.waze.settings.tree.views;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.settings.de;
import com.waze.sharedui.views.ai;
import com.waze.sharedui.views.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends aj {

    /* renamed from: f, reason: collision with root package name */
    private String f37643f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37644g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.settings.tree.d.k f37645h;

    /* renamed from: i, reason: collision with root package name */
    private de f37646i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        setPadding(com.waze.shared_infra.i.h.r(16), com.waze.shared_infra.i.h.r(16), com.waze.shared_infra.i.h.r(16), com.waze.shared_infra.i.h.r(16));
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        final int i2 = 1;
        B(new ai(this) { // from class: com.waze.settings.tree.views.q

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f37637a;

            {
                this.f37637a = this;
            }

            @Override // com.waze.sharedui.views.ai
            public final void a(Editable editable) {
                int i3 = i2;
                s sVar = this.f37637a;
                if (i3 != 0) {
                    s.b(sVar, editable);
                } else {
                    s.c(sVar);
                }
            }
        });
        final int i3 = 0;
        C(new ai(this) { // from class: com.waze.settings.tree.views.q

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f37637a;

            {
                this.f37637a = this;
            }

            @Override // com.waze.sharedui.views.ai
            public final void a(Editable editable) {
                int i32 = i3;
                s sVar = this.f37637a;
                if (i32 != 0) {
                    s.b(sVar, editable);
                } else {
                    s.c(sVar);
                }
            }
        });
    }

    static final void b(s sVar, Editable editable) {
        com.waze.settings.tree.d.k kVar = sVar.f37645h;
        com.waze.settings.tree.d.k kVar2 = null;
        if (kVar == null) {
            h.g.b.x.j("settingEditText");
            kVar = null;
        }
        if (kVar.e() && !sVar.f37644g) {
            sVar.l();
            sVar.f37644g = true;
        }
        String str = sVar.f37643f;
        String string = editable.toString();
        sVar.f37643f = string;
        if (h.g.b.x.n(string, str)) {
            return;
        }
        com.waze.settings.tree.d.k kVar3 = sVar.f37645h;
        if (kVar3 == null) {
            h.g.b.x.j("settingEditText");
            kVar3 = null;
        }
        com.waze.settings.tree.c.h hVarD = kVar3.d();
        s sVar2 = sVar;
        com.waze.settings.tree.d.k kVar4 = sVar.f37645h;
        if (kVar4 == null) {
            h.g.b.x.j("settingEditText");
        } else {
            kVar2 = kVar4;
        }
        hVarD.c(sVar2, sVar.f37643f, str);
    }

    static final void c(s sVar) {
        de deVar = sVar.f37646i;
        if (deVar == null) {
            h.g.b.x.j("page");
            deVar = null;
        }
        deVar.k().R(false);
    }

    static final void d(s sVar, String str, com.waze.settings.tree.d.k kVar, de deVar) {
        if (h.g.b.x.n(sVar.f37643f, str)) {
            return;
        }
        com.waze.search.v2.o.i(kVar, deVar, str, sVar.f37643f);
    }

    public final void a(final com.waze.settings.tree.d.k kVar, final de deVar) {
        h.g.b.x.f(kVar, "setting");
        h.g.b.x.f(deVar, "page");
        this.f37645h = kVar;
        this.f37646i = deVar;
        final String strB = kVar.d().b();
        this.f37643f = strB;
        this.f37644g = false;
        kVar.d().a().observe(deVar.h(), new f(new com.waze.r.d(this, 1), 2, (char[]) null));
        com.waze.settings.tree.d dVarM = kVar.m();
        h.g.b.x.d(dVarM, "null cannot be cast to non-null type com.waze.settings.tree.IconSource.Id");
        p(((com.waze.settings.tree.a) dVarM).a());
        setTag(kVar.s());
        int iC = kVar.c();
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) g().getLayoutParams();
        g().setFilters(new InputFilter[0]);
        layoutParams.width = 0;
        if (iC == 0) {
            g().setInputType(1);
        } else if (iC == 1) {
            g().setInputType(524321);
        } else if (iC == 2) {
            g().setInputType(129);
            o("••••••");
        } else if (iC == 3) {
            g().setInputType(2);
            g().setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});
            layoutParams.width = -2;
            g().setLetterSpacing(2.0f);
            layoutParams.rightMargin = (int) (getContext().getResources().getDisplayMetrics().density * 20.0f);
            o("＿＿");
        } else if (iC != 4) {
            g().setInputType(524289);
        } else {
            g().setInputType(0);
            g().setOnClickListener(null);
        }
        g().setLayoutParams(layoutParams);
        if (kVar.t() != null) {
            o(kVar.t());
        }
        deVar.A(new View.OnClickListener() { // from class: com.waze.settings.tree.views.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.d(this.f37639a, strB, kVar, deVar);
            }
        });
        deVar.k().R(false);
    }
}
