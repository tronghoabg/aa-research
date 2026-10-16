package com.waze.reports;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import com.waze.view.anim.SelectorBg;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dh implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ di f33839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33840b;

    /* synthetic */ dh(di diVar, int i2) {
        Objects.requireNonNull(diVar);
        this.f33839a = diVar;
        this.f33840b = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        di diVar = this.f33839a;
        int i2 = this.f33840b;
        if (diVar.N(i2)) {
            return;
        }
        int i3 = diVar.f33849i;
        if (i3 == i2) {
            diVar.m();
            diVar.k();
            return;
        }
        if (i3 >= 0) {
            ((TextView) diVar.r[i3].findViewById(R.id.reportGenericButtonText)).setText(diVar.f33841a.c(diVar.f()[diVar.f33849i], new Object[0]));
            ((ImageView) diVar.r[diVar.f33849i].findViewById(R.id.reportGenericButtonImage)).setImageResource(diVar.e()[diVar.f33849i]);
            diVar.r[diVar.f33849i].setSelected(false);
            ((SelectorBg) diVar.r[diVar.f33849i].findViewById(R.id.reportGenericButtonSelector)).b();
        }
        diVar.f33849i = i2;
        view.setSelected(true);
        ((SelectorBg) view.findViewById(R.id.reportGenericButtonSelector)).a();
        diVar.i(i2);
    }
}
