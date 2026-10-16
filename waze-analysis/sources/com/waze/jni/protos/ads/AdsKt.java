package com.waze.jni.protos.ads;

import com.waze.jni.protos.ads.Ads;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdsKt {
    public static final AdsKt INSTANCE = new AdsKt();

    private AdsKt() {
    }

    /* renamed from: -initializedialog, reason: not valid java name */
    public final Ads.Dialog m25773initializedialog(l<? super DialogKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DialogKt.Dsl.Companion companion = DialogKt.Dsl.Companion;
        Ads.Dialog.Builder builderNewBuilder = Ads.Dialog.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DialogKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializenotification, reason: not valid java name */
    public final Ads.Notification m25774initializenotification(l<? super NotificationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationKt.Dsl.Companion companion = NotificationKt.Dsl.Companion;
        Ads.Notification.Builder builderNewBuilder = Ads.Notification.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class DialogKt {
        public static final DialogKt INSTANCE = new DialogKt();

        private DialogKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Ads.Dialog.Builder _builder;

            private Dsl(Ads.Dialog.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Ads.Dialog _build() {
                Ads.Dialog dialogBuild = this._builder.build();
                x.e(dialogBuild, "build(...)");
                return dialogBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Ads.Dialog.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Ads.Dialog.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class NotificationKt {
        public static final NotificationKt INSTANCE = new NotificationKt();

        private NotificationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Ads.Notification.Builder _builder;

            private Dsl(Ads.Notification.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Ads.Notification _build() {
                Ads.Notification notificationBuild = this._builder.build();
                x.e(notificationBuild, "build(...)");
                return notificationBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Ads.Notification.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Ads.Notification.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Ads.Builder _builder;

        private Dsl(Ads.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Ads _build() {
            Ads adsBuild = this._builder.build();
            x.e(adsBuild, "build(...)");
            return adsBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Ads.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Ads.Builder builder, o oVar) {
            this(builder);
        }
    }
}
