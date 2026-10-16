package com.waze.jni.protos.search;

import com.waze.jni.protos.search.CategoryProductResult;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CategoryProductResultKt {
    public static final CategoryProductResultKt INSTANCE = new CategoryProductResultKt();

    private CategoryProductResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CategoryProductResult.Builder _builder;

        private Dsl(CategoryProductResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CategoryProductResult _build() {
            CategoryProductResult categoryProductResultBuild = this._builder.build();
            x.e(categoryProductResultBuild, "build(...)");
            return categoryProductResultBuild;
        }

        public final void clearIcon() {
            this._builder.clearIcon();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearLabel() {
            this._builder.clearLabel();
        }

        public final void clearPriceFormat() {
            this._builder.clearPriceFormat();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final String getIcon() {
            String icon = this._builder.getIcon();
            x.e(icon, "getIcon(...)");
            return icon;
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final String getLabel() {
            String label = this._builder.getLabel();
            x.e(label, "getLabel(...)");
            return label;
        }

        public final String getPriceFormat() {
            String priceFormat = this._builder.getPriceFormat();
            x.e(priceFormat, "getPriceFormat(...)");
            return priceFormat;
        }

        public final String getType() {
            String type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final boolean hasIcon() {
            return this._builder.hasIcon();
        }

        public final boolean hasId() {
            return this._builder.hasId();
        }

        public final boolean hasLabel() {
            return this._builder.hasLabel();
        }

        public final boolean hasPriceFormat() {
            return this._builder.hasPriceFormat();
        }

        public final boolean hasType() {
            return this._builder.hasType();
        }

        public final void setIcon(String str) {
            x.f(str, "value");
            this._builder.setIcon(str);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setLabel(String str) {
            x.f(str, "value");
            this._builder.setLabel(str);
        }

        public final void setPriceFormat(String str) {
            x.f(str, "value");
            this._builder.setPriceFormat(str);
        }

        public final void setType(String str) {
            x.f(str, "value");
            this._builder.setType(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CategoryProductResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CategoryProductResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
