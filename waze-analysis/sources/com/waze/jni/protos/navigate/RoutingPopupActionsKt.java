package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingPopupActions;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingPopupActionsKt {
    public static final RoutingPopupActionsKt INSTANCE = new RoutingPopupActionsKt();

    private RoutingPopupActionsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RoutingPopupActions.Builder _builder;

        private Dsl(RoutingPopupActions.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RoutingPopupActions _build() {
            RoutingPopupActions routingPopupActionsBuild = this._builder.build();
            x.e(routingPopupActionsBuild, "build(...)");
            return routingPopupActionsBuild;
        }

        public final void clearPopupId() {
            this._builder.clearPopupId();
        }

        public final void clearPopupKey() {
            this._builder.clearPopupKey();
        }

        public final void clearPrimaryAction() {
            this._builder.clearPrimaryAction();
        }

        public final void clearSecondaryAction() {
            this._builder.clearSecondaryAction();
        }

        public final String getPopupId() {
            String popupId = this._builder.getPopupId();
            x.e(popupId, "getPopupId(...)");
            return popupId;
        }

        public final String getPopupKey() {
            String popupKey = this._builder.getPopupKey();
            x.e(popupKey, "getPopupKey(...)");
            return popupKey;
        }

        public final String getPrimaryAction() {
            String primaryAction = this._builder.getPrimaryAction();
            x.e(primaryAction, "getPrimaryAction(...)");
            return primaryAction;
        }

        public final String getSecondaryAction() {
            String secondaryAction = this._builder.getSecondaryAction();
            x.e(secondaryAction, "getSecondaryAction(...)");
            return secondaryAction;
        }

        public final void setPopupId(String str) {
            x.f(str, "value");
            this._builder.setPopupId(str);
        }

        public final void setPopupKey(String str) {
            x.f(str, "value");
            this._builder.setPopupKey(str);
        }

        public final void setPrimaryAction(String str) {
            x.f(str, "value");
            this._builder.setPrimaryAction(str);
        }

        public final void setSecondaryAction(String str) {
            x.f(str, "value");
            this._builder.setSecondaryAction(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RoutingPopupActions.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RoutingPopupActions.Builder builder, o oVar) {
            this(builder);
        }
    }
}
