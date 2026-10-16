package com.waze.e;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23620a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23621b;

    public /* synthetic */ a(c cVar, int i2) {
        this.f23621b = i2;
        this.f23620a = cVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        if (this.f23621b != 0) {
            c.i(this.f23620a, (AddressItem) obj);
        } else {
            c.j(this.f23620a, (AddressItem) obj);
        }
    }
}
