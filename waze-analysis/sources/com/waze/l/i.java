package com.waze.l;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f25095a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f25096b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f25097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(Context context, v vVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f25095a = context;
        this.f25096b = vVar;
        this.f25097c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f25095a, this.f25096b, this.f25097c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        BluetoothAdapter adapter;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object systemService = this.f25095a.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        v vVar = this.f25096b;
        boolean z = this.f25097c;
        boolean z2 = false;
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && adapter.isEnabled()) {
            z2 = true;
        }
        vVar.o(z, z2);
        return ab.f48028a;
    }
}
