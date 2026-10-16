package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class j {
    public /* synthetic */ j() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.ae.e b(i.b.l.og r7, com.waze.map.d r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.j.b(i.b.l.og, com.waze.map.d):com.waze.ae.e");
    }

    public final synchronized NavigationServiceNativeManager a() {
        NavigationServiceNativeManager navigationServiceNativeManager = NavigationServiceNativeManager.instance;
        if (navigationServiceNativeManager != null) {
            return navigationServiceNativeManager;
        }
        NavigationServiceNativeManager navigationServiceNativeManager2 = new NavigationServiceNativeManager(null);
        NavigationServiceNativeManager.instance = navigationServiceNativeManager2;
        return navigationServiceNativeManager2;
    }

    public /* synthetic */ j(byte[] bArr, byte[] bArr2) {
    }
}
