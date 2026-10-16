package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;

/* loaded from: classes3.dex */
public final /* synthetic */ class xdl implements eqn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ xdl(CancellationSignal cancellationSignal, eqm eqmVar, ComponentName componentName, String str, Bundle bundle, int i) {
        this.f = i;
        this.d = cancellationSignal;
        this.e = eqmVar;
        this.b = componentName;
        this.a = str;
        this.c = bundle;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) throws Resources.NotFoundException {
        if (this.f != 0) {
            Boolean bool = (Boolean) obj;
            yph yphVar = lsc.a;
            boolean zIsCanceled = ((CancellationSignal) this.d).isCanceled();
            Object obj2 = this.e;
            if (zIsCanceled) {
                ((eqj) obj2).m(false);
                return;
            }
            if (!bool.booleanValue()) {
                ((eqj) obj2).m(true);
                return;
            }
            Object obj3 = this.c;
            Object obj4 = this.a;
            mlq.f().c(4, lnm.b((ComponentName) this.b, (String) obj4, (Bundle) obj3));
            ((eqj) obj2).m(false);
            return;
        }
        krz krzVar = (krz) obj;
        Context context = (Context) this.b;
        xdb xdbVar = new xdb(krr.a.b(context, krzVar), krr.b.b(context, krzVar), krr.q.b(context, krzVar), krr.v.b(context, krzVar), krr.w.b(context, krzVar), krr.D.b(context, krzVar), krr.m.b(context, krzVar));
        xdm xdmVar = (xdm) this.a;
        xdmVar.g = xdbVar;
        if (!xdmVar.h) {
            View view = (View) this.c;
            view.findViewById(R.id.keyboard_layout).setBackgroundColor(xdmVar.g.c);
            ((GradientDrawable) ((LayerDrawable) view.findViewById(R.id.keyboard_shadow).getBackground()).findDrawableByLayerId(R.id.background_layer)).setColor(xdmVar.g.c);
        }
        Object obj5 = this.e;
        ((FrameLayout) this.d).setBackgroundColor(xdmVar.g.c);
        ((TextView) xdmVar.f).setTextColor(xdmVar.g.e);
        ((TextView) obj5).setTextColor(xdmVar.g.e);
        ProjectionKeyboardLayout projectionKeyboardLayout = xdmVar.e;
        projectionKeyboardLayout.i = xdmVar.g;
        if (projectionKeyboardLayout.b) {
            projectionKeyboardLayout.b();
        } else {
            ((ype) ((ype) ProjectionKeyboardLayout.a.f()).ai((char) 10143)).u("Cannot apply GM3 theme to projection keyboard in legacy theme.");
        }
    }

    public /* synthetic */ xdl(xdm xdmVar, Context context, View view, FrameLayout frameLayout, TextView textView, int i) {
        this.f = i;
        this.a = xdmVar;
        this.b = context;
        this.c = view;
        this.d = frameLayout;
        this.e = textView;
    }
}
