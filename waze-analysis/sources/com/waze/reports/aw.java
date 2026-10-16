package com.waze.reports;

import android.widget.ScrollView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw implements com.waze.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f33654a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScrollView f33655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ScrollView f33656c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ax f33657d;

    aw(ax axVar, boolean z, ScrollView scrollView, ScrollView scrollView2) {
        this.f33654a = z;
        this.f33655b = scrollView;
        this.f33656c = scrollView2;
        Objects.requireNonNull(axVar);
        this.f33657d = axVar;
    }

    @Override // com.waze.f.a.b
    public final void a() throws NoSuchMethodException, SecurityException {
        boolean z = this.f33654a;
        ax axVar = this.f33657d;
        if (z) {
            axVar.f33661d--;
        } else {
            axVar.f33661d++;
        }
        ax axVar2 = this.f33657d;
        axVar2.f33663f = false;
        axVar2.V();
    }

    @Override // com.waze.f.a.b
    public final void b(double d2) {
        int i2 = this.f33654a ? (int) ((this.f33657d.f33668k * 40.0f) - d2) : (int) d2;
        this.f33655b.scrollTo(0, i2);
        ScrollView scrollView = this.f33656c;
        if (scrollView != null) {
            scrollView.scrollTo(0, i2);
        }
    }
}
