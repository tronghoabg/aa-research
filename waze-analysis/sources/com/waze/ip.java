package com.waze;

import com.waze.jni.protos.map.MapPopupNativeInfo;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ip implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu f24809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MapPopupNativeInfo.DetailsPopupInfo f24813e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f24814f;

    ip(NativeManager nativeManager, int i2, int i3, int i4, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo, int i5) {
        this.f24814f = i5;
        this.f24811c = i2;
        this.f24812d = i3;
        this.f24810b = i4;
        this.f24813e = detailsPopupInfo;
        Objects.requireNonNull(nativeManager);
        this.f24809a = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24814f != 0) {
            ((NativeManager) this.f24809a).showDetailsPopup(this.f24811c, this.f24812d, this.f24810b, this.f24813e);
        } else {
            MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = this.f24813e;
            int i2 = this.f24812d;
            int i3 = this.f24811c;
            iu.showDetailsPopupJNI$lambda$0(this.f24809a, this.f24810b, i3, i2, detailsPopupInfo);
        }
    }

    public /* synthetic */ ip(iu iuVar, int i2, int i3, int i4, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo, int i5) {
        this.f24814f = i5;
        this.f24809a = iuVar;
        this.f24810b = i2;
        this.f24811c = i3;
        this.f24812d = i4;
        this.f24813e = detailsPopupInfo;
    }
}
