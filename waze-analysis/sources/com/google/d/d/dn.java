package com.google.d.d;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dn extends v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map.Entry f7542a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dp f7543b;

    dn(Map.Entry entry, dp dpVar) {
        this.f7542a = entry;
        this.f7543b = dpVar;
    }

    @Override // com.google.d.d.v, java.util.Map.Entry
    public final Object getKey() {
        return this.f7542a.getKey();
    }

    @Override // com.google.d.d.v, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.f7542a;
        return this.f7543b.a(entry.getKey(), entry.getValue());
    }
}
