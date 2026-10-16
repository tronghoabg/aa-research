package com.waze.jni.protos.settings;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.settings.VoiceDataList;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceDataListKt {
    public static final VoiceDataListKt INSTANCE = new VoiceDataListKt();

    private VoiceDataListKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VoiceDataList.Builder _builder;

        /* compiled from: WazeSource */
        public final class VoicesProxy extends c {
            private VoicesProxy() {
            }
        }

        private Dsl(VoiceDataList.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VoiceDataList _build() {
            VoiceDataList voiceDataListBuild = this._builder.build();
            x.e(voiceDataListBuild, "build(...)");
            return voiceDataListBuild;
        }

        public final /* synthetic */ void addAllVoices(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllVoices(iterable);
        }

        public final /* synthetic */ void addVoices(a aVar, VoiceData voiceData) {
            x.f(aVar, "<this>");
            x.f(voiceData, "value");
            this._builder.addVoices(voiceData);
        }

        public final /* synthetic */ void clearVoices(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearVoices();
        }

        public final /* synthetic */ a getVoices() {
            List<VoiceData> voicesList = this._builder.getVoicesList();
            x.e(voicesList, "getVoicesList(...)");
            return new a(voicesList);
        }

        public final /* synthetic */ void plusAssignAllVoices(a<VoiceData, VoicesProxy> aVar, Iterable<VoiceData> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllVoices(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignVoices(a<VoiceData, VoicesProxy> aVar, VoiceData voiceData) {
            x.f(aVar, "<this>");
            x.f(voiceData, "value");
            addVoices(aVar, voiceData);
        }

        public final /* synthetic */ void setVoices(a aVar, int i2, VoiceData voiceData) {
            x.f(aVar, "<this>");
            x.f(voiceData, "value");
            this._builder.setVoices(i2, voiceData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VoiceDataList.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VoiceDataList.Builder builder, o oVar) {
            this(builder);
        }
    }
}
