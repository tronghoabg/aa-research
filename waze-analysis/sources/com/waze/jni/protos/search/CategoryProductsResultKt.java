package com.waze.jni.protos.search;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.search.CategoryProductsResult;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CategoryProductsResultKt {
    public static final CategoryProductsResultKt INSTANCE = new CategoryProductsResultKt();

    private CategoryProductsResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CategoryProductsResult.Builder _builder;

        /* compiled from: WazeSource */
        public final class ProductProxy extends c {
            private ProductProxy() {
            }
        }

        private Dsl(CategoryProductsResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CategoryProductsResult _build() {
            CategoryProductsResult categoryProductsResultBuild = this._builder.build();
            x.e(categoryProductsResultBuild, "build(...)");
            return categoryProductsResultBuild;
        }

        public final /* synthetic */ void addAllProduct(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllProduct(iterable);
        }

        public final /* synthetic */ void addProduct(a aVar, CategoryProductResult categoryProductResult) {
            x.f(aVar, "<this>");
            x.f(categoryProductResult, "value");
            this._builder.addProduct(categoryProductResult);
        }

        public final /* synthetic */ void clearProduct(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearProduct();
        }

        public final /* synthetic */ a getProduct() {
            List<CategoryProductResult> productList = this._builder.getProductList();
            x.e(productList, "getProductList(...)");
            return new a(productList);
        }

        public final /* synthetic */ void plusAssignAllProduct(a<CategoryProductResult, ProductProxy> aVar, Iterable<CategoryProductResult> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllProduct(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignProduct(a<CategoryProductResult, ProductProxy> aVar, CategoryProductResult categoryProductResult) {
            x.f(aVar, "<this>");
            x.f(categoryProductResult, "value");
            addProduct(aVar, categoryProductResult);
        }

        public final /* synthetic */ void setProduct(a aVar, int i2, CategoryProductResult categoryProductResult) {
            x.f(aVar, "<this>");
            x.f(categoryProductResult, "value");
            this._builder.setProduct(i2, categoryProductResult);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CategoryProductsResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CategoryProductsResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
