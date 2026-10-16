package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoadSignKt {
    public static final NavigationRoadSignKt INSTANCE = new NavigationRoadSignKt();

    private NavigationRoadSignKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationRoadSign.Builder _builder;

        /* compiled from: WazeSource */
        public final class ExitSignProxy extends c {
            private ExitSignProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class RoadShieldProxy extends c {
            private RoadShieldProxy() {
            }
        }

        private Dsl(NavigationRoadSign.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationRoadSign _build() {
            NavigationRoadSign navigationRoadSignBuild = this._builder.build();
            x.e(navigationRoadSignBuild, "build(...)");
            return navigationRoadSignBuild;
        }

        public final /* synthetic */ void addAllExitSign(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllExitSign(iterable);
        }

        public final /* synthetic */ void addAllRoadShield(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllRoadShield(iterable);
        }

        public final /* synthetic */ void addExitSign(a aVar, NavigationExitSign navigationExitSign) {
            x.f(aVar, "<this>");
            x.f(navigationExitSign, "value");
            this._builder.addExitSign(navigationExitSign);
        }

        public final /* synthetic */ void addRoadShield(a aVar, NavigationRoadShield navigationRoadShield) {
            x.f(aVar, "<this>");
            x.f(navigationRoadShield, "value");
            this._builder.addRoadShield(navigationRoadShield);
        }

        public final /* synthetic */ void clearExitSign(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearExitSign();
        }

        public final void clearPrimaryMarkup() {
            this._builder.clearPrimaryMarkup();
        }

        public final /* synthetic */ void clearRoadShield(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearRoadShield();
        }

        public final void clearSecondaryMarkup() {
            this._builder.clearSecondaryMarkup();
        }

        public final void clearTextRepresentation() {
            this._builder.clearTextRepresentation();
        }

        public final /* synthetic */ a getExitSign() {
            List<NavigationExitSign> exitSignList = this._builder.getExitSignList();
            x.e(exitSignList, "getExitSignList(...)");
            return new a(exitSignList);
        }

        public final String getPrimaryMarkup() {
            String primaryMarkup = this._builder.getPrimaryMarkup();
            x.e(primaryMarkup, "getPrimaryMarkup(...)");
            return primaryMarkup;
        }

        public final /* synthetic */ a getRoadShield() {
            List<NavigationRoadShield> roadShieldList = this._builder.getRoadShieldList();
            x.e(roadShieldList, "getRoadShieldList(...)");
            return new a(roadShieldList);
        }

        public final String getSecondaryMarkup() {
            String secondaryMarkup = this._builder.getSecondaryMarkup();
            x.e(secondaryMarkup, "getSecondaryMarkup(...)");
            return secondaryMarkup;
        }

        public final String getTextRepresentation() {
            String textRepresentation = this._builder.getTextRepresentation();
            x.e(textRepresentation, "getTextRepresentation(...)");
            return textRepresentation;
        }

        public final /* synthetic */ void plusAssignAllExitSign(a<NavigationExitSign, ExitSignProxy> aVar, Iterable<NavigationExitSign> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllExitSign(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllRoadShield(a<NavigationRoadShield, RoadShieldProxy> aVar, Iterable<NavigationRoadShield> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllRoadShield(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignExitSign(a<NavigationExitSign, ExitSignProxy> aVar, NavigationExitSign navigationExitSign) {
            x.f(aVar, "<this>");
            x.f(navigationExitSign, "value");
            addExitSign(aVar, navigationExitSign);
        }

        public final /* synthetic */ void plusAssignRoadShield(a<NavigationRoadShield, RoadShieldProxy> aVar, NavigationRoadShield navigationRoadShield) {
            x.f(aVar, "<this>");
            x.f(navigationRoadShield, "value");
            addRoadShield(aVar, navigationRoadShield);
        }

        public final /* synthetic */ void setExitSign(a aVar, int i2, NavigationExitSign navigationExitSign) {
            x.f(aVar, "<this>");
            x.f(navigationExitSign, "value");
            this._builder.setExitSign(i2, navigationExitSign);
        }

        public final void setPrimaryMarkup(String str) {
            x.f(str, "value");
            this._builder.setPrimaryMarkup(str);
        }

        public final /* synthetic */ void setRoadShield(a aVar, int i2, NavigationRoadShield navigationRoadShield) {
            x.f(aVar, "<this>");
            x.f(navigationRoadShield, "value");
            this._builder.setRoadShield(i2, navigationRoadShield);
        }

        public final void setSecondaryMarkup(String str) {
            x.f(str, "value");
            this._builder.setSecondaryMarkup(str);
        }

        public final void setTextRepresentation(String str) {
            x.f(str, "value");
            this._builder.setTextRepresentation(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationRoadSign.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationRoadSign.Builder builder, o oVar) {
            this(builder);
        }
    }
}
