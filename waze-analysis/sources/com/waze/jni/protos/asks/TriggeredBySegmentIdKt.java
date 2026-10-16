package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.TriggeredBySegmentId;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TriggeredBySegmentIdKt {
    public static final TriggeredBySegmentIdKt INSTANCE = new TriggeredBySegmentIdKt();

    private TriggeredBySegmentIdKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TriggeredBySegmentId.Builder _builder;

        private Dsl(TriggeredBySegmentId.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TriggeredBySegmentId _build() {
            TriggeredBySegmentId triggeredBySegmentIdBuild = this._builder.build();
            x.e(triggeredBySegmentIdBuild, "build(...)");
            return triggeredBySegmentIdBuild;
        }

        public final void clearSegmentId() {
            this._builder.clearSegmentId();
        }

        public final void clearSegmentType() {
            this._builder.clearSegmentType();
        }

        public final String getSegmentId() {
            String segmentId = this._builder.getSegmentId();
            x.e(segmentId, "getSegmentId(...)");
            return segmentId;
        }

        public final SegmentInsightType getSegmentType() {
            SegmentInsightType segmentType = this._builder.getSegmentType();
            x.e(segmentType, "getSegmentType(...)");
            return segmentType;
        }

        public final int getSegmentTypeValue() {
            return this._builder.getSegmentTypeValue();
        }

        public final void setSegmentId(String str) {
            x.f(str, "value");
            this._builder.setSegmentId(str);
        }

        public final void setSegmentType(SegmentInsightType segmentInsightType) {
            x.f(segmentInsightType, "value");
            this._builder.setSegmentType(segmentInsightType);
        }

        public final void setSegmentTypeValue(int i2) {
            this._builder.setSegmentTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TriggeredBySegmentId.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TriggeredBySegmentId.Builder builder, o oVar) {
            this(builder);
        }
    }
}
