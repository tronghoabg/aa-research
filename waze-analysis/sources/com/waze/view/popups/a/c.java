package com.waze.view.popups.a;

import android.view.View;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.navigate.AddressItem;
import com.waze.sharedui.views.OvalButton;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f45187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45189c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f45190d;

    public /* synthetic */ c(com.waze.navigate.h hVar, AddressItem addressItem, com.waze.shared_infra.o.a aVar, int i2) {
        this.f45190d = i2;
        this.f45189c = hVar;
        this.f45188b = addressItem;
        this.f45187a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f45190d;
        byte[] bArr = null;
        if (i2 == 0) {
            AddressItem addressItem = (AddressItem) obj;
            if (addressItem != null) {
                Object obj2 = this.f45189c;
                Object obj3 = this.f45188b;
                Object obj4 = this.f45187a;
                ((View) obj3).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(obj4, addressItem, 17, bArr));
                ((OvalButton) obj2).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(obj4, addressItem, 18, bArr));
                return;
            }
            return;
        }
        if (i2 == 1) {
            ?? r0 = this.f45187a;
            Object obj5 = this.f45188b;
            com.waze.navigate.h.C((com.waze.navigate.h) this.f45189c, (AddressItem) obj5, r0, (DriveTo.DangerZoneType) obj);
            return;
        }
        AddressItem addressItem2 = (AddressItem) obj;
        if (addressItem2 != null) {
            Object obj6 = this.f45189c;
            Object obj7 = this.f45188b;
            Object obj8 = this.f45187a;
            ((View) obj7).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(obj8, addressItem2, 19, bArr));
            ((OvalButton) obj6).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(obj8, addressItem2, 20, bArr));
        }
    }

    public /* synthetic */ c(h hVar, View view, OvalButton ovalButton, int i2) {
        this.f45190d = i2;
        this.f45187a = hVar;
        this.f45188b = view;
        this.f45189c = ovalButton;
    }
}
