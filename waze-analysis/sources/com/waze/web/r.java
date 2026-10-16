package com.waze.web;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import e.a.dw;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {
    public static final void a(WazeTextView wazeTextView, int i2, h.g.a.l lVar) {
        x.f(wazeTextView, "<this>");
        c(wazeTextView, i2, lVar);
    }

    public static final void b(final WazeTextView wazeTextView, int i2, final h.g.a.l lVar, final p pVar) {
        x.f(wazeTextView, "<this>");
        Context context = wazeTextView.getContext();
        x.e(context, "getContext(...)");
        int iC = com.waze.design_components.g.b.c(context, 48);
        int iB = h.h.a.b(wazeTextView.getContext().getResources().getDimension(R.dimen.destination_cell_margin_default));
        Context context2 = wazeTextView.getContext();
        x.e(context2, "getContext(...)");
        int iC2 = iB + com.waze.design_components.g.b.c(context2, 8);
        wazeTextView.setMinHeight(iC);
        wazeTextView.setPaddingRelative(iC2, 0, 0, 0);
        int color = ContextCompat.getColor(wazeTextView.getContext(), R.color.content_p2);
        wazeTextView.setTextColor(color);
        wazeTextView.setTextSize(2, 14.0f);
        TextPaint paint = wazeTextView.getPaint();
        if (paint != null) {
            paint.setUnderlineText(true);
        }
        wazeTextView.setGravity(16);
        wazeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.outline_info, 0, 0, 0);
        TextViewCompat.setCompoundDrawableTintList(wazeTextView, ColorStateList.valueOf(color));
        Context context3 = wazeTextView.getContext();
        x.e(context3, "getContext(...)");
        wazeTextView.setCompoundDrawablePadding(com.waze.design_components.g.b.c(context3, 6));
        wazeTextView.setText(com.waze.shared_infra.o.b.a().c(i2, new Object[0]));
        wazeTextView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.web.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p pVar2 = pVar;
                if (pVar2 != null) {
                    h.g.a.l lVar2 = lVar;
                    Context context4 = wazeTextView.getContext();
                    x.d(context4, "null cannot be cast to non-null type android.app.Activity");
                    int i3 = SimpleWebActivity.f45474g;
                    b bVar = new b((Activity) context4);
                    bVar.f45481b = pVar2.a();
                    bVar.f45482c = pVar2.b();
                    bVar.a();
                    if (lVar2 != null) {
                        lVar2.invoke(pVar2.b());
                    }
                }
            }
        });
    }

    public static /* synthetic */ void c(WazeTextView wazeTextView, int i2, h.g.a.l lVar) {
        b(wazeTextView, i2, lVar, o.f45512a);
    }

    public static void d(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void e(Object obj) {
        obj.getClass();
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final Object h(Class cls) {
        x.f(cls, "clazz");
        return m(cls);
    }

    public static final Object i(Class cls) {
        x.f(cls, "clazz");
        return n(cls);
    }

    public static final h.f j(Class cls) {
        x.f(cls, "clazz");
        return o(cls);
    }

    public static final org.a.d.a k() {
        dw.e();
        return org.a.d.b.a.a();
    }

    public static final Object l(Class cls, h.g.a.a aVar) {
        x.f(cls, "clazz");
        return k().f(h.g.b.o.y(cls), aVar);
    }

    public static /* synthetic */ Object m(Class cls) {
        return l(cls, null);
    }

    public static /* synthetic */ Object n(Class cls) {
        x.f(cls, "clazz");
        return k().h(h.g.b.o.y(cls));
    }

    public static final h.f o(Class cls) {
        x.f(cls, "clazz");
        return h.g.b(h.h.f48130a, new com.waze.uid.state_impl.username_login.h(cls, 2));
    }

    public static /* synthetic */ org.a.d.g.a p(h.g.a.l lVar) {
        x.f(lVar, "moduleDeclaration");
        org.a.d.g.a aVar = new org.a.d.g.a(null);
        lVar.invoke(aVar);
        return aVar;
    }

    public static final void q(org.a.d.c.d dVar, h.l.c cVar) {
        x.f(dVar, "<this>");
        x.f(cVar, "clazz");
        dVar.a().b().h(h.a.i.ag(dVar.a().b().a(), cVar));
        dVar.b().g(org.a.b.c.a.b(cVar, dVar.a().b().e(), dVar.a().b().f()), dVar.a());
    }

    public static final void r(org.a.d.c.d dVar, h.l.c[] cVarArr) {
        x.f(dVar, "<this>");
        x.f(cVarArr, "classes");
        org.a.d.c.a aVarB = dVar.a().b();
        aVarB.h(h.a.i.ah(aVarB.a(), cVarArr));
        for (h.l.c cVar : cVarArr) {
            dVar.b().g(org.a.b.c.a.b(cVar, dVar.a().b().e(), dVar.a().b().f()), dVar.a());
        }
    }

    public static final void s(org.a.d.c.d dVar, h.g.a.l lVar) {
        x.f(dVar, "<this>");
        x.f(lVar, "onClose");
        dVar.a().b().g(new org.a.d.c.b(lVar));
    }

    public static final Object t(org.a.d.k.b bVar, Class cls) {
        x.f(bVar, "<this>");
        x.f(cls, "clazz");
        return u(bVar, cls);
    }

    public static /* synthetic */ Object u(org.a.d.k.b bVar, Class cls) {
        x.f(bVar, "<this>");
        x.f(cls, "clazz");
        return bVar.a(h.g.b.o.y(cls), null, null);
    }
}
