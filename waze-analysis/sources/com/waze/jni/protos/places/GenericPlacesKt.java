package com.waze.jni.protos.places;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.places.GenericPlaces;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlacesKt {
    public static final GenericPlacesKt INSTANCE = new GenericPlacesKt();

    private GenericPlacesKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GenericPlaces.Builder _builder;

        /* compiled from: WazeSource */
        public final class GenericPlacesProxy extends c {
            private GenericPlacesProxy() {
            }
        }

        private Dsl(GenericPlaces.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GenericPlaces _build() {
            GenericPlaces genericPlacesBuild = this._builder.build();
            x.e(genericPlacesBuild, "build(...)");
            return genericPlacesBuild;
        }

        public final /* synthetic */ void addAllGenericPlaces(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllGenericPlaces(iterable);
        }

        public final /* synthetic */ void addGenericPlaces(a aVar, GenericPlace genericPlace) {
            x.f(aVar, "<this>");
            x.f(genericPlace, "value");
            this._builder.addGenericPlaces(genericPlace);
        }

        public final /* synthetic */ void clearGenericPlaces(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearGenericPlaces();
        }

        public final /* synthetic */ a getGenericPlaces() {
            List<GenericPlace> genericPlacesList = this._builder.getGenericPlacesList();
            x.e(genericPlacesList, "getGenericPlacesList(...)");
            return new a(genericPlacesList);
        }

        public final /* synthetic */ void plusAssignAllGenericPlaces(a<GenericPlace, GenericPlacesProxy> aVar, Iterable<GenericPlace> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllGenericPlaces(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignGenericPlaces(a<GenericPlace, GenericPlacesProxy> aVar, GenericPlace genericPlace) {
            x.f(aVar, "<this>");
            x.f(genericPlace, "value");
            addGenericPlaces(aVar, genericPlace);
        }

        public final /* synthetic */ void setGenericPlaces(a aVar, int i2, GenericPlace genericPlace) {
            x.f(aVar, "<this>");
            x.f(genericPlace, "value");
            this._builder.setGenericPlaces(i2, genericPlace);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GenericPlaces.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GenericPlaces.Builder builder, o oVar) {
            this(builder);
        }
    }
}
