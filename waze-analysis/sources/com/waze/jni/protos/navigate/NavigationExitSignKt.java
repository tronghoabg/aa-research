package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationExitSign;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationExitSignKt {
    public static final NavigationExitSignKt INSTANCE = new NavigationExitSignKt();

    private NavigationExitSignKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationExitSign.Builder _builder;

        private Dsl(NavigationExitSign.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationExitSign _build() {
            NavigationExitSign navigationExitSignBuild = this._builder.build();
            x.e(navigationExitSignBuild, "build(...)");
            return navigationExitSignBuild;
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

            public final /* synthetic */ Dsl _create(NavigationExitSign.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationExitSign.Builder builder, o oVar) {
            this(builder);
        }
    }
}
