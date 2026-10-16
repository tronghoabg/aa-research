package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlerterId;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterIdKt {
    public static final AlerterIdKt INSTANCE = new AlerterIdKt();

    private AlerterIdKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AlerterId.Builder _builder;

        private Dsl(AlerterId.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AlerterId _build() {
            AlerterId alerterIdBuild = this._builder.build();
            x.e(alerterIdBuild, "build(...)");
            return alerterIdBuild;
        }

        public final void clearProviderId() {
            this._builder.clearProviderId();
        }

        public final void clearUniqueId() {
            this._builder.clearUniqueId();
        }

        public final void clearUuid() {
            this._builder.clearUuid();
        }

        public final String getProviderId() {
            String providerId = this._builder.getProviderId();
            x.e(providerId, "getProviderId(...)");
            return providerId;
        }

        public final String getUniqueId() {
            String uniqueId = this._builder.getUniqueId();
            x.e(uniqueId, "getUniqueId(...)");
            return uniqueId;
        }

        public final String getUuid() {
            String uuid = this._builder.getUuid();
            x.e(uuid, "getUuid(...)");
            return uuid;
        }

        public final void setProviderId(String str) {
            x.f(str, "value");
            this._builder.setProviderId(str);
        }

        public final void setUniqueId(String str) {
            x.f(str, "value");
            this._builder.setUniqueId(str);
        }

        public final void setUuid(String str) {
            x.f(str, "value");
            this._builder.setUuid(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AlerterId.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AlerterId.Builder builder, o oVar) {
            this(builder);
        }
    }
}
