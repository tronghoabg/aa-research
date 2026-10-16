package com.waze.insights_infra;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.an.a.af;
import com.waze.an.a.ag;
import com.waze.an.a.ah;
import com.waze.an.a.aj;
import com.waze.an.a.ak;
import com.waze.an.a.al;
import com.waze.an.a.am;
import com.waze.an.a.an;
import com.waze.an.a.ao;
import com.waze.an.a.v;
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import com.waze.jni.protos.insights_infra.SegmentInsightUpdate;
import com.waze.web.r;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InsightsInfraNativeManager extends j {
    public static final int $stable;
    public static final InsightsInfraNativeManager INSTANCE = new InsightsInfraNativeManager();
    private static final bm<SegmentInsightUpdate> _segmentInsightUpdates;
    private static final bq<SegmentInsightUpdate> segmentInsightUpdates;

    static {
        bm<SegmentInsightUpdate> bmVarE = bu.e(1, 0, null, 6);
        _segmentInsightUpdates = bmVarE;
        segmentInsightUpdates = ai.S(bmVarE);
        $stable = 8;
    }

    private InsightsInfraNativeManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfigResponse(com.waze.ap.b.d dVar) {
        if (dVar == null) {
            com.waze.shared_infra.i.h.j("null insights config response");
            return;
        }
        byte[] byteArray = dVar.toByteArray();
        x.e(byteArray, "toByteArray(...)");
        com.waze.shared_infra.i.h.h("setting insights config response, size=" + byteArray.length);
        setConfigResponseNTV(byteArray);
    }

    private final SegmentInsightInfo.Type toProto(ao aoVar) {
        if (aoVar instanceof an) {
            return SegmentInsightInfo.Type.TRAFFIC;
        }
        if (aoVar instanceof am) {
            return SegmentInsightInfo.Type.SPEED_BUMP;
        }
        if (aoVar instanceof com.waze.an.a.ai) {
            return SegmentInsightInfo.Type.DANGEROUS_CURVE;
        }
        if (aoVar instanceof ak) {
            return SegmentInsightInfo.Type.HOV_LANE;
        }
        if (aoVar instanceof ah) {
            return SegmentInsightInfo.Type.CARPOOL_LANE;
        }
        if (aoVar instanceof ag) {
            return SegmentInsightInfo.Type.BUS_LANE;
        }
        if (aoVar instanceof aj) {
            return SegmentInsightInfo.Type.ENFORCEMENT_ZONE;
        }
        if (aoVar instanceof af) {
            return SegmentInsightInfo.Type.AVERAGE_SPEED_CAMERA;
        }
        if (aoVar instanceof al) {
            return SegmentInsightInfo.Type.SCHOOL_ZONE;
        }
        throw new h.i();
    }

    public final bq<SegmentInsightUpdate> getSegmentInsightUpdates() {
        return segmentInsightUpdates;
    }

    public final native void initNativeLayerNTV();

    public final void initialize() {
        initNativeLayerNTV();
    }

    public final void onSegmentApproachEnd(v vVar) {
        x.f(vVar, TtmlNode.ATTR_ID);
        InsightsInfraNativeManager insightsInfraNativeManager = this;
        byte[] byteArray = toProto(vVar).toByteArray();
        x.e(byteArray, "toByteArray(...)");
        j.onSegmentApproachEnd$default(insightsInfraNativeManager, byteArray, null, 2, null);
    }

    public final native void onSegmentApproachEndNTV(byte[] bArr);

    public final void onSegmentFirstPresentation(v vVar, boolean z, boolean z2) {
        x.f(vVar, TtmlNode.ATTR_ID);
        byte[] byteArray = toProto(vVar).toByteArray();
        x.e(byteArray, "toByteArray(...)");
        j.onSegmentFirstPresentation$default(this, byteArray, z, z2, null, 8, null);
    }

    public final native void onSegmentFirstPresentationNTV(byte[] bArr, boolean z, boolean z2);

    public final void onSegmentInsightUpdated$third_party_waze_client_android_project_waze_src_main_waze(SegmentInsightUpdate segmentInsightUpdate) {
        x.f(segmentInsightUpdate, "segmentInsightUpdate");
        _segmentInsightUpdates.c(segmentInsightUpdate);
    }

    public final native void setConfigResponseNTV(byte[] bArr);

    public final void triggerLoadConfig$third_party_waze_client_android_project_waze_src_main_waze() {
        a aVar = (a) r.n(a.class);
        if (aVar == null) {
            com.waze.shared_infra.i.h.j("failed to load insights config service");
        } else {
            com.waze.shared_infra.i.h.h("loading insights config");
            aVar.a(new e(this));
        }
    }

    private final SegmentInsightInfo.Id toProto(v vVar) {
        SegmentInsightInfo.Id.Builder builderNewBuilder = SegmentInsightInfo.Id.newBuilder();
        builderNewBuilder.setSegmentId(vVar.c());
        builderNewBuilder.setSegmentType(toProto(vVar.b()));
        SegmentInsightInfo.Id idBuild = builderNewBuilder.build();
        x.e(idBuild, "build(...)");
        return idBuild;
    }
}
