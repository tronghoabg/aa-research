package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.insights_infra.Notification;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationKt {
    public static final NotificationKt INSTANCE = new NotificationKt();

    private NotificationKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Notification.Builder _builder;

        private Dsl(Notification.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Notification _build() {
            Notification notificationBuild = this._builder.build();
            x.e(notificationBuild, "build(...)");
            return notificationBuild;
        }

        public final void clearBody() {
            this._builder.clearBody();
        }

        public final void clearIconName() {
            this._builder.clearIconName();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearTimeoutMs() {
            this._builder.clearTimeoutMs();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final String getBody() {
            String body = this._builder.getBody();
            x.e(body, "getBody(...)");
            return body;
        }

        public final String getIconName() {
            String iconName = this._builder.getIconName();
            x.e(iconName, "getIconName(...)");
            return iconName;
        }

        public final NotificationId getId() {
            NotificationId id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final NotificationId getIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NotificationKtKt.getIdOrNull(dsl._builder);
        }

        public final long getTimeoutMs() {
            return this._builder.getTimeoutMs();
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasTimeoutMs() {
            return this._builder.hasTimeoutMs();
        }

        public final void setBody(String str) {
            x.f(str, "value");
            this._builder.setBody(str);
        }

        public final void setIconName(String str) {
            x.f(str, "value");
            this._builder.setIconName(str);
        }

        public final void setId(NotificationId notificationId) {
            x.f(notificationId, "value");
            this._builder.setId(notificationId);
        }

        public final void setTimeoutMs(long j2) {
            this._builder.setTimeoutMs(j2);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Notification.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Notification.Builder builder, o oVar) {
            this(builder);
        }
    }
}
