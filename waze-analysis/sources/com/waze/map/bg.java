package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bh f28396a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28397b;

    public /* synthetic */ bg(bh bhVar, int i2) {
        this.f28397b = i2;
        this.f28396a = bhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28397b;
        if (i2 == 0) {
            bh.onShareDriveCanvasDraggedJNI$lambda$0(this.f28396a);
            return;
        }
        if (i2 == 1) {
            bh.onMapClickedJNI$lambda$0(this.f28396a);
            return;
        }
        bh bhVar = this.f28396a;
        if (i2 != 2) {
            bh.onShareDriveCanvasTappedJNI$lambda$0(bhVar);
        } else {
            bh.onMapDraggedJNI$lambda$0(bhVar);
        }
    }
}
