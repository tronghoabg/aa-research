package com.waze.jni.protos.settings;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.settings.NotificationCategoryListProto;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationCategoryListProtoKt {
    public static final NotificationCategoryListProtoKt INSTANCE = new NotificationCategoryListProtoKt();

    private NotificationCategoryListProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NotificationCategoryListProto.Builder _builder;

        /* compiled from: WazeSource */
        public final class CategoriesProxy extends c {
            private CategoriesProxy() {
            }
        }

        private Dsl(NotificationCategoryListProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NotificationCategoryListProto _build() {
            NotificationCategoryListProto notificationCategoryListProtoBuild = this._builder.build();
            x.e(notificationCategoryListProtoBuild, "build(...)");
            return notificationCategoryListProtoBuild;
        }

        public final /* synthetic */ void addAllCategories(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllCategories(iterable);
        }

        public final /* synthetic */ void addCategories(a aVar, NotificationCategoryProto notificationCategoryProto) {
            x.f(aVar, "<this>");
            x.f(notificationCategoryProto, "value");
            this._builder.addCategories(notificationCategoryProto);
        }

        public final /* synthetic */ void clearCategories(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearCategories();
        }

        public final /* synthetic */ a getCategories() {
            List<NotificationCategoryProto> categoriesList = this._builder.getCategoriesList();
            x.e(categoriesList, "getCategoriesList(...)");
            return new a(categoriesList);
        }

        public final /* synthetic */ void plusAssignAllCategories(a<NotificationCategoryProto, CategoriesProxy> aVar, Iterable<NotificationCategoryProto> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllCategories(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignCategories(a<NotificationCategoryProto, CategoriesProxy> aVar, NotificationCategoryProto notificationCategoryProto) {
            x.f(aVar, "<this>");
            x.f(notificationCategoryProto, "value");
            addCategories(aVar, notificationCategoryProto);
        }

        public final /* synthetic */ void setCategories(a aVar, int i2, NotificationCategoryProto notificationCategoryProto) {
            x.f(aVar, "<this>");
            x.f(notificationCategoryProto, "value");
            this._builder.setCategories(i2, notificationCategoryProto);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NotificationCategoryListProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NotificationCategoryListProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
