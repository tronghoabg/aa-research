package com.waze;

import android.view.View;
import com.waze.navigate.AddressItem;
import com.waze.sharedui.views.OvalButton;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class fg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23877e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f23878f;

    public /* synthetic */ fg(com.waze.view.popups.a.h hVar, int i2, com.waze.shared_infra.o.a aVar, AddressItem addressItem, int i3, int i4) {
        this.f23878f = i4;
        this.f23875c = hVar;
        this.f23873a = i2;
        this.f23876d = aVar;
        this.f23877e = addressItem;
        this.f23874b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f23878f != 0) {
            int i2 = this.f23874b;
            Object obj = this.f23877e;
            ?? r1 = this.f23876d;
            com.waze.view.popups.a.h.w((com.waze.view.popups.a.h) this.f23875c, this.f23873a, r1, (AddressItem) obj, i2);
            return;
        }
        Object obj2 = this.f23877e;
        int i3 = this.f23874b;
        MessageBoxNativeManager.lambda$openChoiceBottomDialog$1((AtomicInteger) this.f23875c, (OvalButton) this.f23876d, this.f23873a, i3, (com.waze.sharedui.d.a) obj2, view);
    }

    public /* synthetic */ fg(AtomicInteger atomicInteger, OvalButton ovalButton, int i2, int i3, com.waze.sharedui.d.a aVar, int i4) {
        this.f23878f = i4;
        this.f23875c = atomicInteger;
        this.f23876d = ovalButton;
        this.f23873a = i2;
        this.f23874b = i3;
        this.f23877e = aVar;
    }
}
