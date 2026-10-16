package com.waze.reports;

import android.view.View;
import android.widget.TextView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cu implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33811b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33812c;

    cu(f fVar, String str, int i2) {
        this.f33812c = i2;
        this.f33810a = str;
        Objects.requireNonNull(fVar);
        this.f33811b = fVar;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f33812c;
        if (i2 == 0) {
            di diVar = (di) this.f33810a;
            diVar.L();
            cw cwVar = new cw(diVar, (TextView) this.f33811b, 0);
            com.waze.sharedui.g.i iVar = new com.waze.sharedui.g.i(diVar.getContext(), diVar.f33841a.c(R.string.DURATION, new Object[0]), com.waze.sharedui.g.f.COLUMN_TEXT);
            iVar.k(new dg(diVar, diVar.f33842b, cwVar, iVar));
            iVar.show();
            return;
        }
        if (i2 == 1) {
            f fVar = (f) this.f33811b;
            fVar.f33922a.ao((String) this.f33810a);
            fVar.f();
            return;
        }
        Object obj = this.f33811b;
        if (i2 != 2) {
            eb.w((String) this.f33810a, (eb) obj);
            return;
        }
        com.waze.reports_v2.d.e eVar = com.waze.reports_v2.d.e.f34569c;
        di diVar2 = (di) obj;
        int iH = diVar2.h();
        this.f33810a.P(eVar, diVar2.a(), iH, null);
        diVar2.L();
        diVar2.S(new da(diVar2));
    }

    public /* synthetic */ cu(Object obj, Object obj2, int i2) {
        this.f33812c = i2;
        this.f33810a = obj;
        this.f33811b = obj2;
    }

    public /* synthetic */ cu(di diVar, com.waze.reports_v2.d.j jVar, int i2) {
        this.f33812c = i2;
        this.f33811b = diVar;
        this.f33810a = jVar;
    }
}
