package com.waze.jni.protos.planned_drive;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsResponseKt {
    public static final LoadPlannedDriveOptionsResponseKt INSTANCE = new LoadPlannedDriveOptionsResponseKt();

    private LoadPlannedDriveOptionsResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LoadPlannedDriveOptionsResponse.Builder _builder;

        /* compiled from: WazeSource */
        public final class EtasProxy extends c {
            private EtasProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class TimesProxy extends c {
            private TimesProxy() {
            }
        }

        private Dsl(LoadPlannedDriveOptionsResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LoadPlannedDriveOptionsResponse _build() {
            LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponseBuild = this._builder.build();
            x.e(loadPlannedDriveOptionsResponseBuild, "build(...)");
            return loadPlannedDriveOptionsResponseBuild;
        }

        public final /* synthetic */ void addAllEtas(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEtas(iterable);
        }

        public final /* synthetic */ void addAllTimes(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllTimes(iterable);
        }

        public final /* synthetic */ void addEtas(a aVar, int i2) {
            x.f(aVar, "<this>");
            this._builder.addEtas(i2);
        }

        public final /* synthetic */ void addTimes(a aVar, long j2) {
            x.f(aVar, "<this>");
            this._builder.addTimes(j2);
        }

        public final void clearCode() {
            this._builder.clearCode();
        }

        public final /* synthetic */ void clearEtas(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEtas();
        }

        public final void clearIsTooLate() {
            this._builder.clearIsTooLate();
        }

        public final /* synthetic */ void clearTimes(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearTimes();
        }

        public final LoadPlannedDriveOptionsResponse.ResponseCode getCode() {
            LoadPlannedDriveOptionsResponse.ResponseCode code = this._builder.getCode();
            x.e(code, "getCode(...)");
            return code;
        }

        public final int getCodeValue() {
            return this._builder.getCodeValue();
        }

        public final /* synthetic */ a getEtas() {
            List<Integer> etasList = this._builder.getEtasList();
            x.e(etasList, "getEtasList(...)");
            return new a(etasList);
        }

        public final boolean getIsTooLate() {
            return this._builder.getIsTooLate();
        }

        public final /* synthetic */ a getTimes() {
            List<Long> timesList = this._builder.getTimesList();
            x.e(timesList, "getTimesList(...)");
            return new a(timesList);
        }

        public final boolean hasIsTooLate() {
            return this._builder.hasIsTooLate();
        }

        public final /* synthetic */ void plusAssignAllEtas(a<Integer, EtasProxy> aVar, Iterable<Integer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEtas(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllTimes(a<Long, TimesProxy> aVar, Iterable<Long> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllTimes(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignEtas(a<Integer, EtasProxy> aVar, int i2) {
            x.f(aVar, "<this>");
            addEtas(aVar, i2);
        }

        public final /* synthetic */ void plusAssignTimes(a<Long, TimesProxy> aVar, long j2) {
            x.f(aVar, "<this>");
            addTimes(aVar, j2);
        }

        public final void setCode(LoadPlannedDriveOptionsResponse.ResponseCode responseCode) {
            x.f(responseCode, "value");
            this._builder.setCode(responseCode);
        }

        public final void setCodeValue(int i2) {
            this._builder.setCodeValue(i2);
        }

        public final /* synthetic */ void setEtas(a aVar, int i2, int i3) {
            x.f(aVar, "<this>");
            this._builder.setEtas(i2, i3);
        }

        public final void setIsTooLate(boolean z) {
            this._builder.setIsTooLate(z);
        }

        public final /* synthetic */ void setTimes(a aVar, int i2, long j2) {
            x.f(aVar, "<this>");
            this._builder.setTimes(i2, j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LoadPlannedDriveOptionsResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LoadPlannedDriveOptionsResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
