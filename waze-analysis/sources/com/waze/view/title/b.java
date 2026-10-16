package com.waze.view.title;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TitleBar f45406a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45407b;

    b(TitleBar titleBar, int i2, byte[] bArr) {
        this.f45407b = i2;
        Objects.requireNonNull(titleBar);
        this.f45406a = titleBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f45407b;
        if (i2 == 0) {
            TitleBar titleBar = this.f45406a;
            if (titleBar.f45402g != null) {
                titleBar.f45402g.onClick(view);
                return;
            }
            return;
        }
        TitleBar titleBar2 = this.f45406a;
        if (i2 != 1) {
            if (titleBar2.f45403h != null) {
                titleBar2.f45403h.onClick(view);
            }
        } else if (titleBar2.f45402g != null) {
            titleBar2.f45402g.onClick(view);
        }
    }

    b(TitleBar titleBar, int i2) {
        this.f45407b = i2;
        Objects.requireNonNull(titleBar);
        this.f45406a = titleBar;
    }

    b(TitleBar titleBar, int i2, char[] cArr) {
        this.f45407b = i2;
        Objects.requireNonNull(titleBar);
        this.f45406a = titleBar;
    }
}
