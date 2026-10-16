package com.waze.view.popups.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f45153a;

    ac(af afVar) {
        Objects.requireNonNull(afVar);
        this.f45153a = afVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        ((ImageView) this.f45153a.findViewById(R.id.userDetailsFrieldProfile)).setImageDrawable(new com.waze.sharedui.views.i(bitmap, 0));
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
