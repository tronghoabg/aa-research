package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.NotificationCategoryProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationCategoryProtoKt {
    public static final NotificationCategoryProtoKt INSTANCE = new NotificationCategoryProtoKt();

    private NotificationCategoryProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NotificationCategoryProto.Builder _builder;

        private Dsl(NotificationCategoryProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NotificationCategoryProto _build() {
            NotificationCategoryProto notificationCategoryProtoBuild = this._builder.build();
            x.e(notificationCategoryProtoBuild, "build(...)");
            return notificationCategoryProtoBuild;
        }

        public final void clearIsEnabled() {
            this._builder.clearIsEnabled();
        }

        public final void clearLanguageDescription() {
            this._builder.clearLanguageDescription();
        }

        public final void clearLanguageName() {
            this._builder.clearLanguageName();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final boolean getIsEnabled() {
            return this._builder.getIsEnabled();
        }

        public final String getLanguageDescription() {
            String languageDescription = this._builder.getLanguageDescription();
            x.e(languageDescription, "getLanguageDescription(...)");
            return languageDescription;
        }

        public final String getLanguageName() {
            String languageName = this._builder.getLanguageName();
            x.e(languageName, "getLanguageName(...)");
            return languageName;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final void setIsEnabled(boolean z) {
            this._builder.setIsEnabled(z);
        }

        public final void setLanguageDescription(String str) {
            x.f(str, "value");
            this._builder.setLanguageDescription(str);
        }

        public final void setLanguageName(String str) {
            x.f(str, "value");
            this._builder.setLanguageName(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NotificationCategoryProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NotificationCategoryProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
