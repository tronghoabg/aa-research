package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationRoadShield;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoadShieldKt {
    public static final NavigationRoadShieldKt INSTANCE = new NavigationRoadShieldKt();

    private NavigationRoadShieldKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationRoadShield.Builder _builder;

        private Dsl(NavigationRoadShield.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationRoadShield _build() {
            NavigationRoadShield navigationRoadShieldBuild = this._builder.build();
            x.e(navigationRoadShieldBuild, "build(...)");
            return navigationRoadShieldBuild;
        }

        public final void clearDirection() {
            this._builder.clearDirection();
        }

        public final void clearResourceName() {
            this._builder.clearResourceName();
        }

        public final void clearText() {
            this._builder.clearText();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getDirection() {
            String direction = this._builder.getDirection();
            x.e(direction, "getDirection(...)");
            return direction;
        }

        public final String getResourceName() {
            String resourceName = this._builder.getResourceName();
            x.e(resourceName, "getResourceName(...)");
            return resourceName;
        }

        public final String getText() {
            String text = this._builder.getText();
            x.e(text, "getText(...)");
            return text;
        }

        public final int getType() {
            return this._builder.getType();
        }

        public final void setDirection(String str) {
            x.f(str, "value");
            this._builder.setDirection(str);
        }

        public final void setResourceName(String str) {
            x.f(str, "value");
            this._builder.setResourceName(str);
        }

        public final void setText(String str) {
            x.f(str, "value");
            this._builder.setText(str);
        }

        public final void setType(int i2) {
            this._builder.setType(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationRoadShield.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationRoadShield.Builder builder, o oVar) {
            this(builder);
        }
    }
}
