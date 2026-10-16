package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.navigate.NavigationItemList;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItemListKt {
    public static final NavigationItemListKt INSTANCE = new NavigationItemListKt();

    private NavigationItemListKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationItemList.Builder _builder;

        /* compiled from: WazeSource */
        public final class NavigationItemProxy extends c {
            private NavigationItemProxy() {
            }
        }

        private Dsl(NavigationItemList.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationItemList _build() {
            NavigationItemList navigationItemListBuild = this._builder.build();
            x.e(navigationItemListBuild, "build(...)");
            return navigationItemListBuild;
        }

        public final /* synthetic */ void addAllNavigationItem(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllNavigationItem(iterable);
        }

        public final /* synthetic */ void addNavigationItem(a aVar, NavigationItem navigationItem) {
            x.f(aVar, "<this>");
            x.f(navigationItem, "value");
            this._builder.addNavigationItem(navigationItem);
        }

        public final /* synthetic */ void clearNavigationItem(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearNavigationItem();
        }

        public final /* synthetic */ a getNavigationItem() {
            List<NavigationItem> navigationItemList = this._builder.getNavigationItemList();
            x.e(navigationItemList, "getNavigationItemList(...)");
            return new a(navigationItemList);
        }

        public final /* synthetic */ void plusAssignAllNavigationItem(a<NavigationItem, NavigationItemProxy> aVar, Iterable<NavigationItem> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllNavigationItem(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignNavigationItem(a<NavigationItem, NavigationItemProxy> aVar, NavigationItem navigationItem) {
            x.f(aVar, "<this>");
            x.f(navigationItem, "value");
            addNavigationItem(aVar, navigationItem);
        }

        public final /* synthetic */ void setNavigationItem(a aVar, int i2, NavigationItem navigationItem) {
            x.f(aVar, "<this>");
            x.f(navigationItem, "value");
            this._builder.setNavigationItem(i2, navigationItem);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationItemList.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationItemList.Builder builder, o oVar) {
            this(builder);
        }
    }
}
