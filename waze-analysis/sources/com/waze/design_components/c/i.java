package com.waze.design_components.c;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ap;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.authentication.am;
import com.waze.car_lib.r;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.design_components.text_view.WazeTextView;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends ap {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23395a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f23396b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f23397c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f23398d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f23399e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f23400f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f23401g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f23402h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f23403i;

    /* renamed from: j, reason: collision with root package name */
    private j f23404j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context, 0);
        x.f(context, "context");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeDialog");
        x.e(eVarD, "create(...)");
        this.f23395a = eVarD;
        this.f23396b = h.g.a(new am(this, 5));
        this.f23397c = h.g.a(new am(this, 6));
        this.f23398d = h.g.a(new am(this, 7));
        this.f23399e = h.g.a(new am(this, 8));
        this.f23400f = h.g.a(new am(this, 9));
        this.f23401g = h.g.a(new am(this, 10));
        this.f23402h = h.g.a(new am(this, 11));
        this.f23403i = h.g.a(new am(this, 12));
    }

    static final ab a(i iVar, h.g.a.a aVar, b bVar) {
        iVar.dismiss();
        aVar.invoke();
        j jVar = iVar.f23404j;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        jVar.d().invoke(bVar);
        return ab.f48028a;
    }

    static final void e(i iVar) {
        iVar.dismiss();
        j jVar = iVar.f23404j;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        jVar.d().invoke(b.f23379c);
    }

    static final void f(i iVar) {
        j jVar = iVar.f23404j;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        jVar.d().invoke(b.f23379c);
    }

    private final CheckBox g() {
        return (CheckBox) this.f23401g.getValue();
    }

    private final ImageView h() {
        return (ImageView) this.f23399e.getValue();
    }

    private final ConstraintLayout i() {
        return (ConstraintLayout) this.f23398d.getValue();
    }

    private final WazeTextView j() {
        return (WazeTextView) this.f23402h.getValue();
    }

    private final void k() {
        d dVarA;
        j jVar = this.f23404j;
        j jVar2 = null;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        c cVarA = jVar.a();
        if (cVarA == null) {
            i().setVisibility(8);
        } else {
            i().setVisibility(0);
            h().setVisibility(0);
            j jVar3 = this.f23404j;
            if (jVar3 == null) {
                x.j("dialogData");
                jVar3 = null;
            }
            c cVarA2 = jVar3.a();
            int iA = (cVarA2 == null || (dVarA = cVarA2.a()) == null) ? 0 : dVarA.a();
            ImageView imageViewH = h();
            ViewGroup.LayoutParams layoutParams = imageViewH.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ConstraintLayout.LayoutParams layoutParams3 = layoutParams2;
            Context context = getContext();
            x.e(context, "getContext(...)");
            layoutParams3.height = com.waze.design_components.g.b.c(context, iA);
            Context context2 = getContext();
            x.e(context2, "getContext(...)");
            layoutParams3.width = com.waze.design_components.g.b.c(context2, iA);
            imageViewH.setLayoutParams(layoutParams2);
            j jVar4 = this.f23404j;
            if (jVar4 == null) {
                x.j("dialogData");
                jVar4 = null;
            }
            jVar4.a();
            com.bumptech.glide.e.i iVar = new com.bumptech.glide.e.i();
            com.waze.design_components.d dVarB = cVarA.b();
            ImageView imageViewH2 = h();
            if (dVarB instanceof com.waze.design_components.b.b) {
                com.bumptech.glide.c.g(imageViewH2);
                throw null;
            }
            if (dVarB instanceof com.waze.design_components.b.a) {
                x.e(com.bumptech.glide.c.g(imageViewH2).c().e(Integer.valueOf(((com.waze.design_components.b.a) dVarB).d())).i(iVar).k(imageViewH2), "into(...)");
            } else {
                if (dVarB instanceof com.waze.design_components.b.c) {
                    com.bumptech.glide.c.g(imageViewH2);
                    throw null;
                }
                imageViewH2.setImageBitmap(null);
            }
        }
        WazeTextView wazeTextView = (WazeTextView) this.f23400f.getValue();
        j jVar5 = this.f23404j;
        if (jVar5 == null) {
            x.j("dialogData");
            jVar5 = null;
        }
        wazeTextView.setText(jVar5.c());
        WazeTextView wazeTextViewJ = j();
        j jVar6 = this.f23404j;
        if (jVar6 == null) {
            x.j("dialogData");
            jVar6 = null;
        }
        wazeTextViewJ.setText(jVar6.b());
        j().setMovementMethod(LinkMovementMethod.getInstance());
        j jVar7 = this.f23404j;
        if (jVar7 == null) {
            x.j("dialogData");
            jVar7 = null;
        }
        CharSequence charSequenceB = jVar7.b();
        if (charSequenceB == null || charSequenceB.length() == 0) {
            j().setVisibility(8);
        } else {
            j().setVisibility(0);
        }
        if (this.f23404j == null) {
            x.j("dialogData");
        }
        g().setVisibility(8);
        g().setOnCheckedChangeListener(null);
        CallToActionBar callToActionBar = (CallToActionBar) this.f23403i.getValue();
        j jVar8 = this.f23404j;
        if (jVar8 == null) {
            x.j("dialogData");
        } else {
            jVar2 = jVar8;
        }
        callToActionBar.l(jVar2.f());
    }

    public final void b(j jVar) {
        com.waze.design_components.cta_bar.c cVarG;
        x.f(jVar, "wazeDialogData");
        this.f23404j = jVar;
        j jVar2 = null;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        com.waze.design_components.d dVarF = jVar.f();
        if (dVarF instanceof com.waze.design_components.cta_bar.b) {
            com.waze.design_components.cta_bar.b bVar = (com.waze.design_components.cta_bar.b) dVarF;
            final h.g.a.a aVarI = bVar.i();
            final b bVar2 = b.f23377a;
            cVarG = com.waze.design_components.cta_bar.b.k(bVar, null, false, new h.g.a.a() { // from class: com.waze.design_components.c.h
                @Override // h.g.a.a
                public final Object invoke() {
                    return i.a(this.f23392a, aVarI, bVar2);
                }
            }, 63);
        } else {
            if (!(dVarF instanceof com.waze.design_components.cta_bar.c)) {
                throw new h.i();
            }
            com.waze.design_components.cta_bar.c cVar = (com.waze.design_components.cta_bar.c) dVarF;
            com.waze.design_components.cta_bar.b bVarD = cVar.d();
            final h.g.a.a aVarI2 = cVar.d().i();
            final b bVar3 = b.f23377a;
            com.waze.design_components.cta_bar.b bVarK = com.waze.design_components.cta_bar.b.k(bVarD, null, false, new h.g.a.a() { // from class: com.waze.design_components.c.h
                @Override // h.g.a.a
                public final Object invoke() {
                    return i.a(this.f23392a, aVarI2, bVar3);
                }
            }, 63);
            com.waze.design_components.cta_bar.b bVarE = cVar.e();
            final h.g.a.a aVarI3 = cVar.e().i();
            final b bVar4 = b.f23378b;
            cVarG = com.waze.design_components.cta_bar.c.g(cVar, bVarK, com.waze.design_components.cta_bar.b.k(bVarE, null, false, new h.g.a.a() { // from class: com.waze.design_components.c.h
                @Override // h.g.a.a
                public final Object invoke() {
                    return i.a(this.f23392a, aVarI3, bVar4);
                }
            }, 63), 4);
        }
        j jVar3 = this.f23404j;
        if (jVar3 == null) {
            x.j("dialogData");
        } else {
            jVar2 = jVar3;
        }
        this.f23404j = j.g(jVar2, cVarG);
        if (isShowing()) {
            k();
        }
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.waze_dialog_frame);
        if (getWindow() != null) {
            Window window = getWindow();
            x.c(window);
            window.setBackgroundDrawableResource(R.drawable.waze_dialog_background_shape);
            r rVar = new r(13);
            WindowManager.LayoutParams attributes = window.getAttributes();
            x.c(attributes);
            rVar.invoke(attributes);
            window.setAttributes(attributes);
        } else {
            this.f23395a.b("Window is null. This can affect the dialog appearance.");
        }
        j jVar = this.f23404j;
        j jVar2 = null;
        if (jVar == null) {
            x.j("dialogData");
            jVar = null;
        }
        if (jVar.e()) {
            int i2 = 0;
            ((ConstraintLayout) this.f23396b.getValue()).setOnClickListener(new e(this, i2));
            ((ConstraintLayout) this.f23397c.getValue()).setOnClickListener(new com.waze.inbox.e(1));
            setOnCancelListener(new f(this, i2));
            j jVar3 = this.f23404j;
            if (jVar3 == null) {
                x.j("dialogData");
            } else {
                jVar2 = jVar3;
            }
            setCanceledOnTouchOutside(jVar2.e());
        } else {
            setOnKeyListener(new g());
        }
        k();
    }
}
