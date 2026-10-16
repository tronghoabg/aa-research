package com.waze.main.navigate;

import android.content.res.Resources;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f25491a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25492b;

    c(e eVar, int i2, byte[] bArr) {
        this.f25492b = i2;
        Objects.requireNonNull(eVar);
        this.f25491a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        int i2 = this.f25492b;
        ViewPager viewPager = this.f25491a.f25495b;
        if (i2 != 0) {
            viewPager.setCurrentItem(0);
        } else {
            viewPager.setCurrentItem(1);
        }
    }

    c(e eVar, int i2) {
        this.f25492b = i2;
        Objects.requireNonNull(eVar);
        this.f25491a = eVar;
    }
}
