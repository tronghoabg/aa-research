package com.waze.jni.protos.map;

import com.waze.jni.protos.map.DisplayRect;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DisplayRectKt {
    public static final DisplayRectKt INSTANCE = new DisplayRectKt();

    private DisplayRectKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DisplayRect.Builder _builder;

        private Dsl(DisplayRect.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DisplayRect _build() {
            DisplayRect displayRectBuild = this._builder.build();
            x.e(displayRectBuild, "build(...)");
            return displayRectBuild;
        }

        public final void clearBottomRightX() {
            this._builder.clearBottomRightX();
        }

        public final void clearBottomRightY() {
            this._builder.clearBottomRightY();
        }

        public final void clearTag() {
            this._builder.clearTag();
        }

        public final void clearTopLeftX() {
            this._builder.clearTopLeftX();
        }

        public final void clearTopLeftY() {
            this._builder.clearTopLeftY();
        }

        public final int getBottomRightX() {
            return this._builder.getBottomRightX();
        }

        public final int getBottomRightY() {
            return this._builder.getBottomRightY();
        }

        public final String getTag() {
            String tag = this._builder.getTag();
            x.e(tag, "getTag(...)");
            return tag;
        }

        public final int getTopLeftX() {
            return this._builder.getTopLeftX();
        }

        public final int getTopLeftY() {
            return this._builder.getTopLeftY();
        }

        public final void setBottomRightX(int i2) {
            this._builder.setBottomRightX(i2);
        }

        public final void setBottomRightY(int i2) {
            this._builder.setBottomRightY(i2);
        }

        public final void setTag(String str) {
            x.f(str, "value");
            this._builder.setTag(str);
        }

        public final void setTopLeftX(int i2) {
            this._builder.setTopLeftX(i2);
        }

        public final void setTopLeftY(int i2) {
            this._builder.setTopLeftY(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DisplayRect.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DisplayRect.Builder builder, o oVar) {
            this(builder);
        }
    }
}
