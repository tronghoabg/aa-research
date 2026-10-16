package com.waze.jni.protos.search;

import com.waze.jni.protos.search.CategoryProductsResult;
import com.waze.jni.protos.search.CategoryProductsResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CategoryProductsResultKtKt {
    /* renamed from: -initializecategoryProductsResult, reason: not valid java name */
    public static final CategoryProductsResult m28272initializecategoryProductsResult(l<? super CategoryProductsResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CategoryProductsResultKt.Dsl.Companion companion = CategoryProductsResultKt.Dsl.Companion;
        CategoryProductsResult.Builder builderNewBuilder = CategoryProductsResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CategoryProductsResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CategoryProductsResult copy(CategoryProductsResult categoryProductsResult, l<? super CategoryProductsResultKt.Dsl, ab> lVar) {
        x.f(categoryProductsResult, "<this>");
        x.f(lVar, "block");
        CategoryProductsResultKt.Dsl.Companion companion = CategoryProductsResultKt.Dsl.Companion;
        CategoryProductsResult.Builder builder = categoryProductsResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        CategoryProductsResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
