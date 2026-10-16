package com.waze.sdk;

import android.view.View;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f35393a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f35394b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f35395c;

    n(ae aeVar, int[] iArr, boolean z) {
        this.f35393a = iArr;
        this.f35394b = z;
        Objects.requireNonNull(aeVar);
        this.f35395c = aeVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ae aeVar = this.f35395c;
        aeVar.removeOnLayoutChangeListener(this);
        int[] iArr = new int[2];
        aeVar.f35224j.findViewById(R.id.audioPanelOpenAppImage).getLocationOnScreen(iArr);
        int[] iArr2 = this.f35393a;
        int i10 = iArr2[0] - iArr[0];
        int i11 = iArr2[1] - iArr[1];
        aeVar.f35221g.setTranslationX(i10);
        aeVar.f35221g.setTranslationY(i11);
        aeVar.am(this.f35394b, aeVar.f35222h.getWidth(), aeVar.getWidth(), aeVar.f35222h.getHeight(), aeVar.getHeight(), i10, i11);
    }
}
