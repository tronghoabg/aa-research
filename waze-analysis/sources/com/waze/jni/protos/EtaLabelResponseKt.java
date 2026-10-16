package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.EtaLabelResponse;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelResponseKt {
    public static final EtaLabelResponseKt INSTANCE = new EtaLabelResponseKt();

    private EtaLabelResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EtaLabelResponse.Builder _builder;

        /* compiled from: WazeSource */
        public final class NativeBitmapsProxy extends c {
            private NativeBitmapsProxy() {
            }
        }

        private Dsl(EtaLabelResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EtaLabelResponse _build() {
            EtaLabelResponse etaLabelResponseBuild = this._builder.build();
            x.e(etaLabelResponseBuild, "build(...)");
            return etaLabelResponseBuild;
        }

        public final /* synthetic */ void addAllNativeBitmaps(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllNativeBitmaps(iterable);
        }

        public final /* synthetic */ void addNativeBitmaps(a aVar, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            x.f(aVar, "<this>");
            x.f(nativeBitmapWithAlignment, "value");
            this._builder.addNativeBitmaps(nativeBitmapWithAlignment);
        }

        public final /* synthetic */ void clearNativeBitmaps(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearNativeBitmaps();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final /* synthetic */ a getNativeBitmaps() {
            List<NativeBitmapWithAlignment> nativeBitmapsList = this._builder.getNativeBitmapsList();
            x.e(nativeBitmapsList, "getNativeBitmapsList(...)");
            return new a(nativeBitmapsList);
        }

        public final int getRequestId() {
            return this._builder.getRequestId();
        }

        public final /* synthetic */ void plusAssignAllNativeBitmaps(a<NativeBitmapWithAlignment, NativeBitmapsProxy> aVar, Iterable<NativeBitmapWithAlignment> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllNativeBitmaps(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignNativeBitmaps(a<NativeBitmapWithAlignment, NativeBitmapsProxy> aVar, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            x.f(aVar, "<this>");
            x.f(nativeBitmapWithAlignment, "value");
            addNativeBitmaps(aVar, nativeBitmapWithAlignment);
        }

        public final /* synthetic */ void setNativeBitmaps(a aVar, int i2, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            x.f(aVar, "<this>");
            x.f(nativeBitmapWithAlignment, "value");
            this._builder.setNativeBitmaps(i2, nativeBitmapWithAlignment);
        }

        public final void setRequestId(int i2) {
            this._builder.setRequestId(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EtaLabelResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EtaLabelResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
