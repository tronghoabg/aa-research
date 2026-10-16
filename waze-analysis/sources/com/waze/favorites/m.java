package com.waze.favorites;

import com.waze.navigate.AddressItem;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f23810a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23811b;

    public /* synthetic */ m(h.g.a.l lVar, int i2) {
        this.f23811b = i2;
        this.f23810a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f23811b;
        if (i2 == 0) {
            this.f23810a.invoke((AddressItem) obj);
            return;
        }
        if (i2 == 1) {
            o.getFavorites$lambda$1(this.f23810a, (byte[]) obj);
        } else if (i2 == 2) {
            this.f23810a.invoke((AddressItem) obj);
        } else if (i2 != 3) {
            o.isHomeWorkSet$lambda$1(this.f23810a, (byte[]) obj);
        } else {
            this.f23810a.invoke((ab) obj);
        }
    }
}
