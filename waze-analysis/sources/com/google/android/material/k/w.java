package com.google.android.material.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final y f6723a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6724b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6725c;

    public w(y yVar, float f2, float f3) {
        this.f6723a = yVar;
        this.f6724b = f2;
        this.f6725c = f3;
    }

    final float a() {
        y yVar = this.f6723a;
        return (float) Math.toDegrees(Math.atan((yVar.f6734b - this.f6725c) / (yVar.f6733a - this.f6724b)));
    }
}
