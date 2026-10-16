package com.waze.jni.protos.rtalerts;

import com.waze.jni.protos.location.ProviderPosition;
import com.waze.jni.protos.rtalerts.ReportLocationProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ReportLocationProtoKt {
    public static final ReportLocationProtoKt INSTANCE = new ReportLocationProtoKt();

    private ReportLocationProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ReportLocationProto.Builder _builder;

        private Dsl(ReportLocationProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ReportLocationProto _build() {
            ReportLocationProto reportLocationProtoBuild = this._builder.build();
            x.e(reportLocationProtoBuild, "build(...)");
            return reportLocationProtoBuild;
        }

        public final void clearFromNodeDbId() {
            this._builder.clearFromNodeDbId();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearToNodeDbId() {
            this._builder.clearToNodeDbId();
        }

        public final long getFromNodeDbId() {
            return this._builder.getFromNodeDbId();
        }

        public final ProviderPosition getPosition() {
            ProviderPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final ProviderPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ReportLocationProtoKtKt.getPositionOrNull(dsl._builder);
        }

        public final long getToNodeDbId() {
            return this._builder.getToNodeDbId();
        }

        public final boolean hasFromNodeDbId() {
            return this._builder.hasFromNodeDbId();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasToNodeDbId() {
            return this._builder.hasToNodeDbId();
        }

        public final void setFromNodeDbId(long j2) {
            this._builder.setFromNodeDbId(j2);
        }

        public final void setPosition(ProviderPosition providerPosition) {
            x.f(providerPosition, "value");
            this._builder.setPosition(providerPosition);
        }

        public final void setToNodeDbId(long j2) {
            this._builder.setToNodeDbId(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ReportLocationProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ReportLocationProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
