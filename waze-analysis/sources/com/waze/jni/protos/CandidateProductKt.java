package com.waze.jni.protos;

import com.waze.jni.protos.CandidateProduct;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CandidateProductKt {
    public static final CandidateProductKt INSTANCE = new CandidateProductKt();

    private CandidateProductKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CandidateProduct.Builder _builder;

        private Dsl(CandidateProduct.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CandidateProduct _build() {
            CandidateProduct candidateProductBuild = this._builder.build();
            x.e(candidateProductBuild, "build(...)");
            return candidateProductBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearLastUpdated() {
            this._builder.clearLastUpdated();
        }

        public final void clearPrice() {
            this._builder.clearPrice();
        }

        public final void clearUpdatedBy() {
            this._builder.clearUpdatedBy();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final long getLastUpdated() {
            return this._builder.getLastUpdated();
        }

        public final float getPrice() {
            return this._builder.getPrice();
        }

        public final String getUpdatedBy() {
            String updatedBy = this._builder.getUpdatedBy();
            x.e(updatedBy, "getUpdatedBy(...)");
            return updatedBy;
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasLastUpdated() {
            return this._builder.hasLastUpdated();
        }

        public final boolean hasPrice() {
            return this._builder.hasPrice();
        }

        public final boolean hasUpdatedBy() {
            return this._builder.hasUpdatedBy();
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setLastUpdated(long j2) {
            this._builder.setLastUpdated(j2);
        }

        public final void setPrice(float f2) {
            this._builder.setPrice(f2);
        }

        public final void setUpdatedBy(String str) {
            x.f(str, "value");
            this._builder.setUpdatedBy(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CandidateProduct.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CandidateProduct.Builder builder, o oVar) {
            this(builder);
        }
    }
}
