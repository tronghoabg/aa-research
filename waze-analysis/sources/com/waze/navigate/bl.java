package com.waze.navigate;

import com.waze.jni.protos.navigate.TollPriceInformation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31116c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31117d;

    bl(NavigateNativeManager navigateNativeManager, com.waze.reports.ed edVar, com.waze.reports.ed edVar2, int i2) {
        this.f31117d = i2;
        this.f31115b = edVar;
        this.f31114a = edVar2;
        Objects.requireNonNull(navigateNativeManager);
        this.f31116c = navigateNativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f31117d;
        if (i2 == 0) {
            Object obj = this.f31116c;
            bt.searchResultsJNI$lambda$0((bt) this.f31114a, (String) this.f31115b, (AddressItem) obj);
            return;
        }
        Object obj2 = this.f31116c;
        if (i2 != 1) {
            ds.onTollInfoUpdateJNI$lambda$0((ds) this.f31114a, (String) this.f31115b, (TollPriceInformation) obj2);
        } else {
            ((NavigateNativeManager) obj2).navigateToParkingNTV(((com.waze.reports.ed) this.f31115b).an(), ((com.waze.reports.ed) this.f31114a).an());
        }
    }

    public /* synthetic */ bl(Object obj, String str, Object obj2, int i2) {
        this.f31117d = i2;
        this.f31114a = obj;
        this.f31115b = str;
        this.f31116c = obj2;
    }
}
