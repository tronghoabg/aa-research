package com.waze.authentication;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class AuthNativeManager extends e implements org.a.d.a.a {
    public static final int $stable;
    public static final AuthNativeManager INSTANCE;
    private static aj credentialsRepository;
    private static final h.f credentialsRepositoryProvider$delegate;
    private static final AtomicBoolean isInitialized;
    private static final h.f passwordEncrypter$delegate;
    private static boolean wasInitializedToLegacyCredentialsRepository;

    static {
        AuthNativeManager authNativeManager = new AuthNativeManager();
        INSTANCE = authNativeManager;
        isInitialized = new AtomicBoolean(false);
        credentialsRepositoryProvider$delegate = h.g.b(h.h.f48130a, new b(authNativeManager, 1));
        passwordEncrypter$delegate = h.g.b(h.h.f48130a, new b(authNativeManager, 0));
        $stable = 8;
    }

    private AuthNativeManager() {
    }

    private final al getCredentialsRepositoryProvider() {
        return (al) credentialsRepositoryProvider$delegate.getValue();
    }

    private final ar getPasswordEncrypter() {
        return (ar) passwordEncrypter$delegate.getValue();
    }

    private final native void initNativeLayerNTV();

    public static final void initialize() {
        if (isInitialized.getAndSet(true)) {
            return;
        }
        AuthNativeManager authNativeManager = INSTANCE;
        authNativeManager.initNativeLayerNTV();
        authNativeManager.setCredentialsRepository(com.waze.a.af.n(authNativeManager.getCredentialsRepositoryProvider()), authNativeManager.getCredentialsRepositoryProvider().a(ak.f15720b));
    }

    private final void setCredentialsRepository(aj ajVar, aj ajVar2) {
        if (ajVar2 != null) {
            h.g.b.x.f(ajVar2, "source");
            h.g.b.x.f(ajVar, "destination");
            List listA = ajVar2.a();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                ajVar.c((ax) it.next());
            }
            ajVar2.b();
            listA.size();
        }
        credentialsRepository = ajVar;
        boolean z = ajVar instanceof ap;
        wasInitializedToLegacyCredentialsRepository = z;
        selectCredentialsStorageMode(z);
    }

    public final String decryptPassword$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        return getPasswordEncrypter().a(str);
    }

    public final String encryptPassword$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        return getPasswordEncrypter().b(str);
    }

    @Override // org.a.d.a.a
    public /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final String getLoginToken$third_party_waze_client_android_project_waze_src_main_waze() {
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        h.g.b.x.f(ajVar, "<this>");
        List listA = ajVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof j) {
                arrayList.add(obj);
            }
        }
        j jVar = (j) h.a.i.R(arrayList);
        String strA = jVar != null ? jVar.a() : null;
        return strA == null ? "" : strA;
    }

    public final String getPassword$third_party_waze_client_android_project_waze_src_main_waze() {
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        h.g.b.x.f(ajVar, "<this>");
        k kVarO = com.waze.a.af.o(ajVar);
        String strA = kVarO != null ? kVarO.a() : null;
        return strA == null ? "" : strA;
    }

    public final String getUsername$third_party_waze_client_android_project_waze_src_main_waze() {
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        h.g.b.x.f(ajVar, "<this>");
        k kVarO = com.waze.a.af.o(ajVar);
        String strB = kVarO != null ? kVarO.b() : null;
        return strB == null ? "" : strB;
    }

    public final boolean getWasInitializedToLegacyCredentialsRepository() {
        return wasInitializedToLegacyCredentialsRepository;
    }

    public final native String loadPasswordLegacyNTV();

    public final native String loadUsernameLegacyNTV();

    public final void reset$third_party_waze_client_android_project_waze_src_main_waze() {
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        ajVar.b();
    }

    public final native void saveUsernamePasswordLegacyNTV(String str, String str2);

    public final native void selectCredentialsStorageModeNTV(boolean z);

    public final void storeLoginToken$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        h.g.b.x.f(str, "token");
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        ajVar.c(new j(str));
    }

    public final void storePassword$third_party_waze_client_android_project_waze_src_main_waze(String str, String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        aj ajVar = credentialsRepository;
        if (ajVar == null) {
            h.g.b.x.j("credentialsRepository");
            ajVar = null;
        }
        ajVar.c(new k(str, str2));
    }
}
