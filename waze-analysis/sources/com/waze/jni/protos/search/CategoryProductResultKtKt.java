package com.waze.jni.protos.search;

import com.waze.jni.protos.search.CategoryProductResult;
import com.waze.jni.protos.search.CategoryProductResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CategoryProductResultKtKt {
    /* renamed from: -initializecategoryProductResult, reason: not valid java name */
    public static final CategoryProductResult m28264initializecategoryProductResult(l<? super CategoryProductResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CategoryProductResultKt.Dsl.Companion companion = CategoryProductResultKt.Dsl.Companion;
        CategoryProductResult.Builder builderNewBuilder = CategoryProductResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CategoryProductResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CategoryProductResult copy(CategoryProductResult categoryProductResult, l<? super CategoryProductResultKt.Dsl, ab> lVar) {
        x.f(categoryProductResult, "<this>");
        x.f(lVar, "block");
        CategoryProductResultKt.Dsl.Companion companion = CategoryProductResultKt.Dsl.Companion;
        CategoryProductResult.Builder builder = categoryProductResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        CategoryProductResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
