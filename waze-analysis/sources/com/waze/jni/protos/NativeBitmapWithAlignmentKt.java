package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.NativeBitmapWithAlignment;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeBitmapWithAlignmentKt {
    public static final NativeBitmapWithAlignmentKt INSTANCE = new NativeBitmapWithAlignmentKt();

    private NativeBitmapWithAlignmentKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeBitmapWithAlignment.Builder _builder;

        private Dsl(NativeBitmapWithAlignment.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeBitmapWithAlignment _build() {
            NativeBitmapWithAlignment nativeBitmapWithAlignmentBuild = this._builder.build();
            x.e(nativeBitmapWithAlignmentBuild, "build(...)");
            return nativeBitmapWithAlignmentBuild;
        }

        public final void clearAlignment() {
            this._builder.clearAlignment();
        }

        public final void clearBitmap() {
            this._builder.clearBitmap();
        }

        public final EtaLabelDefinitions.PinAlignment getAlignment() {
            EtaLabelDefinitions.PinAlignment alignment = this._builder.getAlignment();
            x.e(alignment, "getAlignment(...)");
            return alignment;
        }

        public final int getAlignmentValue() {
            return this._builder.getAlignmentValue();
        }

        public final NativeBitmap getBitmap() {
            NativeBitmap bitmap = this._builder.getBitmap();
            x.e(bitmap, "getBitmap(...)");
            return bitmap;
        }

        public final NativeBitmap getBitmapOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NativeBitmapWithAlignmentKtKt.getBitmapOrNull(dsl._builder);
        }

        public final boolean hasBitmap() {
            return this._builder.hasBitmap();
        }

        public final void setAlignment(EtaLabelDefinitions.PinAlignment pinAlignment) {
            x.f(pinAlignment, "value");
            this._builder.setAlignment(pinAlignment);
        }

        public final void setAlignmentValue(int i2) {
            this._builder.setAlignmentValue(i2);
        }

        public final void setBitmap(NativeBitmap nativeBitmap) {
            x.f(nativeBitmap, "value");
            this._builder.setBitmap(nativeBitmap);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeBitmapWithAlignment.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeBitmapWithAlignment.Builder builder, o oVar) {
            this(builder);
        }
    }
}
