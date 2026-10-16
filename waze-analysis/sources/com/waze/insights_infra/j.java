package com.waze.insights_infra;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.insights_infra.SegmentInsightUpdate;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class j {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onSegmentApproachEnd$default(j jVar, byte[] bArr, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSegmentApproachEnd");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        jVar.onSegmentApproachEnd(bArr, lVar);
    }

    static final ab onSegmentApproachEnd$lambda$0(j jVar, byte[] bArr) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.insights_infra.InsightsInfraNativeManager");
        ((InsightsInfraNativeManager) jVar).onSegmentApproachEndNTV(bArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onSegmentFirstPresentation$default(j jVar, byte[] bArr, boolean z, boolean z2, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSegmentFirstPresentation");
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        jVar.onSegmentFirstPresentation(bArr, z, z2, lVar);
    }

    static final ab onSegmentFirstPresentation$lambda$0(j jVar, byte[] bArr, boolean z, boolean z2) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.insights_infra.InsightsInfraNativeManager");
        ((InsightsInfraNativeManager) jVar).onSegmentFirstPresentationNTV(bArr, z, z2);
        return null;
    }

    static final void onSegmentInsightUpdatedJNI$lambda$0(j jVar, SegmentInsightUpdate segmentInsightUpdate) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.insights_infra.InsightsInfraNativeManager");
        x.c(segmentInsightUpdate);
        ((InsightsInfraNativeManager) jVar).onSegmentInsightUpdated$third_party_waze_client_android_project_waze_src_main_waze(segmentInsightUpdate);
    }

    public void onSegmentApproachEnd(final byte[] bArr, l<? super ab, ab> lVar) {
        x.f(bArr, "serializedId");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.insights_infra.h
            @Override // com.waze.hw
            public final Object a() {
                j.onSegmentApproachEnd$lambda$0(this.f24709a, bArr);
                return null;
            }
        }, lVar != null ? new i(lVar, 0) : null);
    }

    public void onSegmentFirstPresentation(final byte[] bArr, final boolean z, final boolean z2, l<? super ab, ab> lVar) {
        x.f(bArr, "serializedId");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.insights_infra.g
            @Override // com.waze.hw
            public final Object a() {
                j.onSegmentFirstPresentation$lambda$0(this.f24705a, bArr, z, z2);
                return null;
            }
        }, lVar != null ? new i(lVar, 1) : null);
    }

    protected final void onSegmentInsightUpdatedJNI(byte[] bArr) {
        x.f(bArr, "segmentInsightUpdate");
        try {
            final SegmentInsightUpdate segmentInsightUpdate = (SegmentInsightUpdate) SegmentInsightUpdate.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.insights_infra.f
                @Override // java.lang.Runnable
                public final void run() {
                    j.onSegmentInsightUpdatedJNI$lambda$0(this.f24703a, segmentInsightUpdate);
                }
            });
        } catch (eu unused) {
        }
    }

    public void setConfigResponse(byte[] bArr) {
        x.f(bArr, "serializedConfigResponse");
        ((InsightsInfraNativeManager) this).setConfigResponseNTV(bArr);
    }

    protected final void triggerLoadConfigJNI() {
        ((InsightsInfraNativeManager) this).triggerLoadConfig$third_party_waze_client_android_project_waze_src_main_waze();
    }

    public final void onSegmentApproachEnd(byte[] bArr) {
        x.f(bArr, "serializedId");
        onSegmentApproachEnd$default(this, bArr, null, 2, null);
    }

    public final void onSegmentFirstPresentation(byte[] bArr, boolean z, boolean z2) {
        x.f(bArr, "serializedId");
        onSegmentFirstPresentation$default(this, bArr, z, z2, null, 8, null);
    }
}
