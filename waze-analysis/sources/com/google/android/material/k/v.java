package com.google.android.material.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final y f6719a;

    /* renamed from: b, reason: collision with root package name */
    private final y f6720b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6721c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6722d;

    public v(y yVar, y yVar2, float f2, float f3) {
        this.f6719a = yVar;
        this.f6720b = yVar2;
        this.f6721c = f2;
        this.f6722d = f3;
    }

    final float a() {
        y yVar = this.f6719a;
        y yVar2 = this.f6720b;
        return (float) Math.toDegrees(Math.atan((yVar2.f6734b - yVar.f6734b) / (yVar2.f6733a - yVar.f6733a)));
    }

    final float b() {
        y yVar = this.f6719a;
        return (float) Math.toDegrees(Math.atan((yVar.f6734b - this.f6722d) / (yVar.f6733a - this.f6721c)));
    }
}
