package com.waze.j;

import com.waze.navigate.AddressItem;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h implements com.waze.menus.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f24901a;

    h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f24901a = iVar;
    }

    @Override // com.waze.menus.m
    public final int a() {
        i iVar = this.f24901a;
        return (true != iVar.f24911j ? 16384 : 0) | iVar.f24910i | 32768;
    }

    @Override // com.waze.menus.m
    public final AddressItem[] b() {
        return this.f24901a.f24907f;
    }
}
