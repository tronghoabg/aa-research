package com.waze.jni.protos.insights_infra;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.insights_infra.SegmentInsightUpdate;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightUpdateKt {
    public static final SegmentInsightUpdateKt INSTANCE = new SegmentInsightUpdateKt();

    private SegmentInsightUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SegmentInsightUpdate.Builder _builder;

        /* compiled from: WazeSource */
        public final class InfoProxy extends c {
            private InfoProxy() {
            }
        }

        private Dsl(SegmentInsightUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SegmentInsightUpdate _build() {
            SegmentInsightUpdate segmentInsightUpdateBuild = this._builder.build();
            x.e(segmentInsightUpdateBuild, "build(...)");
            return segmentInsightUpdateBuild;
        }

        public final /* synthetic */ void addAllInfo(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllInfo(iterable);
        }

        public final /* synthetic */ void addInfo(a aVar, SegmentInsightInfo segmentInsightInfo) {
            x.f(aVar, "<this>");
            x.f(segmentInsightInfo, "value");
            this._builder.addInfo(segmentInsightInfo);
        }

        public final /* synthetic */ void clearInfo(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearInfo();
        }

        public final /* synthetic */ a getInfo() {
            List<SegmentInsightInfo> infoList = this._builder.getInfoList();
            x.e(infoList, "getInfoList(...)");
            return new a(infoList);
        }

        public final /* synthetic */ void plusAssignAllInfo(a<SegmentInsightInfo, InfoProxy> aVar, Iterable<SegmentInsightInfo> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllInfo(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignInfo(a<SegmentInsightInfo, InfoProxy> aVar, SegmentInsightInfo segmentInsightInfo) {
            x.f(aVar, "<this>");
            x.f(segmentInsightInfo, "value");
            addInfo(aVar, segmentInsightInfo);
        }

        public final /* synthetic */ void setInfo(a aVar, int i2, SegmentInsightInfo segmentInsightInfo) {
            x.f(aVar, "<this>");
            x.f(segmentInsightInfo, "value");
            this._builder.setInfo(i2, segmentInsightInfo);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SegmentInsightUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SegmentInsightUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
