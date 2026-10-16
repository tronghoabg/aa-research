package com.waze.search;

import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.jni.protos.VenueCategoryGroup;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.lm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SearchNativeManager extends an implements bp {
    public static final int $stable = 0;
    public static final ai Companion = new ai();
    private static final String TAG = "SearchNativeManager: ";
    private static SearchNativeManager sInstance;

    private SearchNativeManager() {
        an.initNativeLayer$default(this, null, 1, null);
    }

    public static final synchronized SearchNativeManager getInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.ab openCategoryGroupSearch$lambda$0$0(String str, VenueCategoryGroups venueCategoryGroups) {
        if (venueCategoryGroups != null) {
            for (VenueCategoryGroup venueCategoryGroup : venueCategoryGroups.getGroupsList()) {
                if (h.g.b.x.n(venueCategoryGroup.getId(), str)) {
                    com.waze.sharedui.a.e eVarE = lm.d().e();
                    h.g.b.x.c(eVarE);
                    com.waze.ui.x.u.j(eVarE, eVarE.getWindow().getDecorView());
                    t tVarD = new t().d(str);
                    venueCategoryGroup.getLabel();
                    tVarD.h(eVarE, 0);
                    return h.ab.f48028a;
                }
            }
            com.waze.shared_infra.i.h.j("SearchNativeManager: Category group is not found: ".concat(String.valueOf(str)));
        } else {
            com.waze.shared_infra.i.h.c("SearchNativeManager: Try to initiate category group search, but category groups are not available.");
        }
        return h.ab.f48028a;
    }

    static final h.ab techCodeHandle$lambda$0(h.g.a.l lVar, Boolean bool) {
        lVar.invoke(Boolean.valueOf(h.g.b.x.n(bool, true)));
        return h.ab.f48028a;
    }

    public final native byte[] getCategoryProductsNTV(String str);

    public final native void initNativeLayerNTV();

    @Override // com.waze.search.an
    public void openCategoryGroupSearch(final String str) {
        h.g.b.x.f(str, "categoryId");
        ConfigManager.runOnConfigSynced(new Runnable() { // from class: com.waze.search.ah
            @Override // java.lang.Runnable
            public final void run() {
                NativeManager.getInstance().venueProviderGetCategoryGroups(new com.waze.car_lib.o.ab(str, 11));
            }
        });
    }

    @Override // com.waze.search.bp
    public void techCodeHandle(String str, final h.g.a.l<? super Boolean, h.ab> lVar) {
        h.g.b.x.f(lVar, "callback");
        if ((str == null || !h.n.o.ah(str, "#")) && !h.g.b.x.n(str, "2##2")) {
            lVar.invoke(false);
        } else {
            techCodesManagerHandle(str, new h.g.a.l() { // from class: com.waze.search.ag
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SearchNativeManager.techCodeHandle$lambda$0(lVar, (Boolean) obj);
                }
            });
        }
    }

    public final native boolean techCodesManagerHandleNTV(String str);

    public /* synthetic */ SearchNativeManager(h.g.b.o oVar) {
        this();
    }
}
