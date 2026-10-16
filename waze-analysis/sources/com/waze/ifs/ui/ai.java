package com.waze.ifs.ui;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.fe;
import android.widget.ImageView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends fe {

    /* renamed from: a, reason: collision with root package name */
    private final ab f24510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ab abVar) {
        super(abVar);
        h.g.b.x.f(abVar, "wazeCard");
        this.f24510a = abVar;
    }

    public final void a(boolean z) {
        float f2 = this.itemView.getContext().getResources().getDisplayMetrics().density;
        float f3 = 6.0f * f2;
        ab abVar = this.f24510a;
        abVar.setSelected(z);
        if (z) {
            abVar.a(f2, f3);
        } else {
            abVar.a(f3, f2);
        }
    }

    public final void b(ah ahVar) {
        h.g.b.x.f(ahVar, "option");
        ab abVar = this.f24510a;
        abVar.f24494f.setText(ahVar.c());
        Drawable drawableB = ahVar.b();
        if (drawableB != null) {
            abVar.f24491c.setImageDrawable(drawableB);
        } else {
            abVar.f24491c.setVisibility(8);
        }
        Drawable drawableA = ahVar.a();
        if (drawableA != null) {
            ImageView imageView = abVar.f24492d;
            imageView.setImageDrawable(drawableA);
            imageView.setVisibility(0);
        } else {
            abVar.f24492d.setVisibility(8);
        }
        abVar.setSelected(false);
        abVar.setVisibility(0);
    }
}
