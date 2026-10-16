package com.waze.jni.protos.settings;

import com.google.v.b.b;
import com.google.v.b.c;
import com.waze.jni.protos.settings.SearchByVoiceDataProto;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SearchByVoiceDataProtoKt {
    public static final SearchByVoiceDataProtoKt INSTANCE = new SearchByVoiceDataProtoKt();

    private SearchByVoiceDataProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SearchByVoiceDataProto.Builder _builder;

        /* compiled from: WazeSource */
        public final class SearchVoicesByKeyProxy extends c {
            private SearchVoicesByKeyProxy() {
            }
        }

        private Dsl(SearchByVoiceDataProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SearchByVoiceDataProto _build() {
            SearchByVoiceDataProto searchByVoiceDataProtoBuild = this._builder.build();
            x.e(searchByVoiceDataProtoBuild, "build(...)");
            return searchByVoiceDataProtoBuild;
        }

        public final /* synthetic */ void clearSearchVoicesByKey(b bVar) {
            x.f(bVar, "<this>");
            this._builder.clearSearchVoicesByKey();
        }

        public final /* synthetic */ b getSearchVoicesByKeyMap() {
            Map<String, String> searchVoicesByKeyMap = this._builder.getSearchVoicesByKeyMap();
            x.e(searchVoicesByKeyMap, "getSearchVoicesByKeyMap(...)");
            return new b(searchVoicesByKeyMap);
        }

        public final /* synthetic */ void putAllSearchVoicesByKey(b bVar, Map map) {
            x.f(bVar, "<this>");
            x.f(map, "map");
            this._builder.putAllSearchVoicesByKey(map);
        }

        public final void putSearchVoicesByKey(b<String, String, SearchVoicesByKeyProxy> bVar, String str, String str2) {
            x.f(bVar, "<this>");
            x.f(str, "key");
            x.f(str2, "value");
            this._builder.putSearchVoicesByKey(str, str2);
        }

        public final /* synthetic */ void removeSearchVoicesByKey(b bVar, String str) {
            x.f(bVar, "<this>");
            x.f(str, "key");
            this._builder.removeSearchVoicesByKey(str);
        }

        public final /* synthetic */ void setSearchVoicesByKey(b<String, String, SearchVoicesByKeyProxy> bVar, String str, String str2) {
            x.f(bVar, "<this>");
            x.f(str, "key");
            x.f(str2, "value");
            putSearchVoicesByKey(bVar, str, str2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SearchByVoiceDataProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SearchByVoiceDataProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
