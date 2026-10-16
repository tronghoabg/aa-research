package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ac.r;
import com.waze.br;
import com.waze.main_screen.bottom_bars.scrollable_eta.s;
import com.waze.navigate.NavResultData;
import com.waze.resources.ResourcesNativeManager;
import l.a.ud;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends h {

    /* renamed from: b, reason: collision with root package name */
    private TextView f26040b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f26041c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f26042d;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup f26043e;

    /* renamed from: f, reason: collision with root package name */
    private br f26044f;

    public static /* synthetic */ void l(j jVar) {
        s sVar = jVar.f26030a;
        if (sVar != null) {
            sVar.j();
        }
        br brVar = jVar.f26044f;
        if (brVar.f17254d != null) {
            com.waze.messages.c cVar = new com.waze.messages.c();
            cVar.w = brVar.f17255e;
            cVar.D = brVar.f17256f;
            r.f13870a.a().a(cVar, ud.CARD, new com.waze.ac.k(com.waze.ac.n.f13866a, brVar.f17253c));
            jVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(jVar.f26044f.f17254d)));
        }
    }

    private final boolean m() {
        br brVar = this.f26044f;
        return brVar == null || brVar.f17251a == null;
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void a(boolean z) {
        this.f26043e.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        this.f26040b.setTextColor(ContextCompat.getColor(getContext(), R.color.content_default));
        this.f26041c.setTextColor(ContextCompat.getColor(getContext(), R.color.content_default));
        this.f26042d.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.generic_eta_card, (ViewGroup) this, false);
        this.f26040b = (TextView) viewInflate.findViewById(R.id.lblCardTitle);
        this.f26041c = (TextView) viewInflate.findViewById(R.id.lblCardBody);
        this.f26042d = (ImageView) viewInflate.findViewById(R.id.etaCardImage);
        this.f26043e = (ViewGroup) viewInflate.findViewById(R.id.etaCardLabelContainer);
        addView(viewInflate);
        setVisibility(8);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void d() {
        if (m()) {
            return;
        }
        com.waze.messages.c cVar = new com.waze.messages.c();
        br brVar = this.f26044f;
        cVar.w = brVar.f17255e;
        cVar.D = brVar.f17256f;
        r.f13870a.a().d(cVar, new com.waze.ac.k(com.waze.ac.n.f13866a, brVar.f17253c));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void f(NavResultData navResultData) {
        if (m()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f26040b.setText(this.f26044f.f17251a);
        this.f26041c.setText(this.f26044f.f17252b);
        String str = this.f26044f.f17253c;
        if (str != null && !str.isEmpty()) {
            this.f26042d.setVisibility(0);
            String lowerCase = this.f26044f.f17253c.toLowerCase();
            Bitmap encBitmap = ResourcesNativeManager.getInstance().getEncBitmap(NativeManager.getInstance().getEncImagePath(lowerCase));
            if (encBitmap != null) {
                this.f26042d.setImageBitmap(encBitmap);
            } else {
                this.f26042d.setImageDrawable(ResourcesNativeManager.getInstance().getSkinDrawable(getResources(), lowerCase));
            }
        }
        setOnClickListener(new com.waze.feedback.b(this, 12));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void g() {
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void h() {
    }

    public final void k(br brVar) {
        this.f26044f = brVar;
        f(null);
    }
}
