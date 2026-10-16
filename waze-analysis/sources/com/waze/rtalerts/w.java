package com.waze.rtalerts;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class w implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35164b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35165c;

    public /* synthetic */ w(Object obj, int i2, int i3) {
        this.f35165c = i3;
        this.f35164b = obj;
        this.f35163a = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f35165c;
        int i3 = this.f35163a;
        if (i2 != 0) {
            d.onAlertClicked$lambda$0((d) this.f35164b, i3);
            return null;
        }
        x.sendComment$lambda$0((x) this.f35164b, i3);
        return null;
    }
}
