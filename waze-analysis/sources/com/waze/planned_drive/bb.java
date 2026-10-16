package com.waze.planned_drive;

import com.waze.jni.protos.planned_drive.PlannedDriveResponse;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bb implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33231a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33232b;

    public /* synthetic */ bb(Object obj, int i2) {
        this.f33232b = i2;
        this.f33231a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.jni.a
    public final void a(Object obj) {
        int i2 = this.f33232b;
        if (i2 == 0) {
            this.f33231a.invoke((h.ab) obj);
            return;
        }
        if (i2 == 1) {
            ay.z((ay) this.f33231a, (PlannedDriveResponse) obj);
            return;
        }
        if (i2 == 2) {
            this.f33231a.invoke((h.ab) obj);
            return;
        }
        if (i2 == 3) {
            this.f33231a.invoke((h.ab) obj);
        } else if (i2 == 4) {
            this.f33231a.invoke((h.ab) obj);
        } else if (i2 != 5) {
            this.f33231a.invoke((h.ab) obj);
        } else {
            this.f33231a.invoke((Integer) obj);
        }
    }
}
