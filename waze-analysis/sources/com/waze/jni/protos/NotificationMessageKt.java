package com.waze.jni.protos;

import com.waze.jni.protos.NotificationMessage;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationMessageKt {
    public static final NotificationMessageKt INSTANCE = new NotificationMessageKt();

    private NotificationMessageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NotificationMessage.Builder _builder;

        private Dsl(NotificationMessage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NotificationMessage _build() {
            NotificationMessage notificationMessageBuild = this._builder.build();
            x.e(notificationMessageBuild, "build(...)");
            return notificationMessageBuild;
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getMessage() {
            String message = this._builder.getMessage();
            x.e(message, "getMessage(...)");
            return message;
        }

        public final NotificationMessage.Type getType() {
            NotificationMessage.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setMessage(String str) {
            x.f(str, "value");
            this._builder.setMessage(str);
        }

        public final void setType(NotificationMessage.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NotificationMessage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NotificationMessage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
