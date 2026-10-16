package com.waze.search;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.search.CategoryProductsResult;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class an {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCategoryProducts$default(an anVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCategoryProducts");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        anVar.getCategoryProducts(str, lVar);
    }

    static final byte[] getCategoryProducts$lambda$0(an anVar, String str) {
        h.g.b.x.d(anVar, "null cannot be cast to non-null type com.waze.search.SearchNativeManager");
        return ((SearchNativeManager) anVar).getCategoryProductsNTV(str);
    }

    static final void getCategoryProducts$lambda$1(h.g.a.l lVar, byte[] bArr) {
        CategoryProductsResult categoryProductsResult = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                categoryProductsResult = (CategoryProductsResult) CategoryProductsResult.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(categoryProductsResult);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(an anVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        anVar.initNativeLayer(lVar);
    }

    static final h.ab initNativeLayer$lambda$0(an anVar) {
        h.g.b.x.d(anVar, "null cannot be cast to non-null type com.waze.search.SearchNativeManager");
        ((SearchNativeManager) anVar).initNativeLayerNTV();
        return null;
    }

    static final void openCategoryGroupSearchJNI$lambda$0(an anVar, String str) {
        h.g.b.x.d(anVar, "null cannot be cast to non-null type com.waze.search.SearchNativeManager");
        ((SearchNativeManager) anVar).openCategoryGroupSearch(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void techCodesManagerHandle$default(an anVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: techCodesManagerHandle");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        anVar.techCodesManagerHandle(str, lVar);
    }

    static final Boolean techCodesManagerHandle$lambda$0(an anVar, String str) {
        h.g.b.x.d(anVar, "null cannot be cast to non-null type com.waze.search.SearchNativeManager");
        return Boolean.valueOf(((SearchNativeManager) anVar).techCodesManagerHandleNTV(str));
    }

    public void getCategoryProducts(String str, h.g.a.l<? super CategoryProductsResult, h.ab> lVar) {
        h.g.b.x.f(str, "categoryId");
        NativeManager.runNativeTask(new am(this, str, 1), new al(lVar, 0));
    }

    public void initNativeLayer(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.search.ak
            @Override // com.waze.hw
            public final Object a() {
                an.initNativeLayer$lambda$0(this.f35510a);
                return null;
            }
        }, lVar != null ? new al(lVar, 1) : null);
    }

    public abstract void openCategoryGroupSearch(String str);

    protected final void openCategoryGroupSearchJNI(final String str) {
        h.g.b.x.f(str, "categoryId");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.search.aj
            @Override // java.lang.Runnable
            public final void run() {
                an.openCategoryGroupSearchJNI$lambda$0(this.f35508a, str);
            }
        });
    }

    public void techCodesManagerHandle(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        h.g.b.x.f(str, "searchString");
        NativeManager.runNativeTask(new am(this, str, 0), lVar != null ? new al(lVar, 2) : null);
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }

    public final void getCategoryProducts(String str) {
        h.g.b.x.f(str, "categoryId");
        getCategoryProducts$default(this, str, null, 2, null);
    }

    public final void techCodesManagerHandle(String str) {
        h.g.b.x.f(str, "searchString");
        techCodesManagerHandle$default(this, str, null, 2, null);
    }
}
