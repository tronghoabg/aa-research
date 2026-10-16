package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.EtaLabelRequest;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelRequestKt {
    public static final EtaLabelRequestKt INSTANCE = new EtaLabelRequestKt();

    private EtaLabelRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EtaLabelRequest.Builder _builder;

        /* compiled from: WazeSource */
        public final class PinAlignmentsToGenerateProxy extends c {
            private PinAlignmentsToGenerateProxy() {
            }
        }

        private Dsl(EtaLabelRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EtaLabelRequest _build() {
            EtaLabelRequest etaLabelRequestBuild = this._builder.build();
            x.e(etaLabelRequestBuild, "build(...)");
            return etaLabelRequestBuild;
        }

        public final /* synthetic */ void addAllPinAlignmentsToGenerate(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPinAlignmentsToGenerate(iterable);
        }

        public final /* synthetic */ void addPinAlignmentsToGenerate(a aVar, EtaLabelDefinitions.PinAlignment pinAlignment) {
            x.f(aVar, "<this>");
            x.f(pinAlignment, "value");
            this._builder.addPinAlignmentsToGenerate(pinAlignment);
        }

        public final void clearLabelData() {
            this._builder.clearLabelData();
        }

        public final /* synthetic */ void clearPinAlignmentsToGenerate(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPinAlignmentsToGenerate();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final EtaLabelData getLabelData() {
            EtaLabelData labelData = this._builder.getLabelData();
            x.e(labelData, "getLabelData(...)");
            return labelData;
        }

        public final EtaLabelData getLabelDataOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EtaLabelRequestKtKt.getLabelDataOrNull(dsl._builder);
        }

        public final /* synthetic */ a getPinAlignmentsToGenerate() {
            List<EtaLabelDefinitions.PinAlignment> pinAlignmentsToGenerateList = this._builder.getPinAlignmentsToGenerateList();
            x.e(pinAlignmentsToGenerateList, "getPinAlignmentsToGenerateList(...)");
            return new a(pinAlignmentsToGenerateList);
        }

        public final int getRequestId() {
            return this._builder.getRequestId();
        }

        public final boolean hasLabelData() {
            return this._builder.hasLabelData();
        }

        public final /* synthetic */ void plusAssignAllPinAlignmentsToGenerate(a<EtaLabelDefinitions.PinAlignment, PinAlignmentsToGenerateProxy> aVar, Iterable<? extends EtaLabelDefinitions.PinAlignment> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPinAlignmentsToGenerate(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignPinAlignmentsToGenerate(a<EtaLabelDefinitions.PinAlignment, PinAlignmentsToGenerateProxy> aVar, EtaLabelDefinitions.PinAlignment pinAlignment) {
            x.f(aVar, "<this>");
            x.f(pinAlignment, "value");
            addPinAlignmentsToGenerate(aVar, pinAlignment);
        }

        public final void setLabelData(EtaLabelData etaLabelData) {
            x.f(etaLabelData, "value");
            this._builder.setLabelData(etaLabelData);
        }

        public final /* synthetic */ void setPinAlignmentsToGenerate(a aVar, int i2, EtaLabelDefinitions.PinAlignment pinAlignment) {
            x.f(aVar, "<this>");
            x.f(pinAlignment, "value");
            this._builder.setPinAlignmentsToGenerate(i2, pinAlignment);
        }

        public final void setRequestId(int i2) {
            this._builder.setRequestId(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EtaLabelRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EtaLabelRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
