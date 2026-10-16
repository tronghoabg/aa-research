package com.waze.config;

import com.google.v.eu;
import com.waze.NativeManager;
import i.b.l.fj;
import i.b.l.il;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class dn {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAndroidAutoAvailableReportCategories$default(dn dnVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndroidAutoAvailableReportCategories");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        dnVar.getAndroidAutoAvailableReportCategories(lVar);
    }

    static final byte[] getAndroidAutoAvailableReportCategories$lambda$0(dn dnVar) {
        h.g.b.x.d(dnVar, "null cannot be cast to non-null type com.waze.config.PreferencesConfigNativeManager");
        return ((PreferencesConfigNativeManager) dnVar).getAndroidAutoAvailableReportCategoriesNTV();
    }

    static final void getAndroidAutoAvailableReportCategories$lambda$1(h.g.a.l lVar, byte[] bArr) {
        fj fjVar = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                fjVar = (fj) fj.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(fjVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAvailableReportCategories$default(dn dnVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAvailableReportCategories");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        dnVar.getAvailableReportCategories(lVar);
    }

    static final byte[] getAvailableReportCategories$lambda$0(dn dnVar) {
        h.g.b.x.d(dnVar, "null cannot be cast to non-null type com.waze.config.PreferencesConfigNativeManager");
        return ((PreferencesConfigNativeManager) dnVar).getAvailableReportCategoriesNTV();
    }

    static final void getAvailableReportCategories$lambda$1(h.g.a.l lVar, byte[] bArr) {
        fj fjVar = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                fjVar = (fj) fj.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(fjVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWebUrlWhiteList$default(dn dnVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWebUrlWhiteList");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        dnVar.getWebUrlWhiteList(lVar);
    }

    static final byte[] getWebUrlWhiteList$lambda$0(dn dnVar) {
        h.g.b.x.d(dnVar, "null cannot be cast to non-null type com.waze.config.PreferencesConfigNativeManager");
        return ((PreferencesConfigNativeManager) dnVar).getWebUrlWhiteListNTV();
    }

    static final void getWebUrlWhiteList$lambda$1(h.g.a.l lVar, byte[] bArr) {
        il ilVar = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                ilVar = (il) il.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(ilVar);
            }
        }
    }

    static final void onPreferencesConfigSyncedJNI$lambda$0(dn dnVar) {
        h.g.b.x.d(dnVar, "null cannot be cast to non-null type com.waze.config.PreferencesConfigNativeManager");
        ((PreferencesConfigNativeManager) dnVar).onPreferencesConfigSynced();
    }

    public void getAndroidAutoAvailableReportCategories(h.g.a.l<? super fj, h.ab> lVar) {
        NativeManager.runNativeTask(new dm(this, 2), new dl(lVar, 3));
    }

    public void getAvailableReportCategories(h.g.a.l<? super fj, h.ab> lVar) {
        NativeManager.runNativeTask(new dm(this, 1), new dl(lVar, 0));
    }

    public void getWebUrlWhiteList(h.g.a.l<? super il, h.ab> lVar) {
        NativeManager.runNativeTask(new dm(this, 0), new dl(lVar, 2));
    }

    protected final void onPreferencesConfigSyncedJNI() {
        NativeManager.runMainThreadTask(new dk(this, 3));
    }

    public final void getAndroidAutoAvailableReportCategories() {
        getAndroidAutoAvailableReportCategories$default(this, null, 1, null);
    }

    public final void getAvailableReportCategories() {
        getAvailableReportCategories$default(this, null, 1, null);
    }

    public final void getWebUrlWhiteList() {
        getWebUrlWhiteList$default(this, null, 1, null);
    }
}
