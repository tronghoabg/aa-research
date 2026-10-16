package com.waze.jni.protos.resources;

import com.google.v.v;
import com.waze.jni.protos.resources.ResourceDataProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ResourceDataProtoKt {
    public static final ResourceDataProtoKt INSTANCE = new ResourceDataProtoKt();

    private ResourceDataProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ResourceDataProto.Builder _builder;

        private Dsl(ResourceDataProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ResourceDataProto _build() {
            ResourceDataProto resourceDataProtoBuild = this._builder.build();
            x.e(resourceDataProtoBuild, "build(...)");
            return resourceDataProtoBuild;
        }

        public final void clearBuffer() {
            this._builder.clearBuffer();
        }

        public final v getBuffer() {
            v buffer = this._builder.getBuffer();
            x.e(buffer, "getBuffer(...)");
            return buffer;
        }

        public final void setBuffer(v vVar) {
            x.f(vVar, "value");
            this._builder.setBuffer(vVar);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ResourceDataProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ResourceDataProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
