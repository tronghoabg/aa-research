package com.waze.jni.protos;

import com.google.v.v;
import com.waze.jni.protos.NativeBitmap;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeBitmapKt {
    public static final NativeBitmapKt INSTANCE = new NativeBitmapKt();

    private NativeBitmapKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeBitmap.Builder _builder;

        private Dsl(NativeBitmap.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeBitmap _build() {
            NativeBitmap nativeBitmapBuild = this._builder.build();
            x.e(nativeBitmapBuild, "build(...)");
            return nativeBitmapBuild;
        }

        public final void clearBitmapBytes() {
            this._builder.clearBitmapBytes();
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final v getBitmapBytes() {
            v bitmapBytes = this._builder.getBitmapBytes();
            x.e(bitmapBytes, "getBitmapBytes(...)");
            return bitmapBytes;
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setBitmapBytes(v vVar) {
            x.f(vVar, "value");
            this._builder.setBitmapBytes(vVar);
        }

        public final void setHeight(int i2) {
            this._builder.setHeight(i2);
        }

        public final void setWidth(int i2) {
            this._builder.setWidth(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeBitmap.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeBitmap.Builder builder, o oVar) {
            this(builder);
        }
    }
}
