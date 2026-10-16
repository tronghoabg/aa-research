package com.waze.ads.c;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import com.airbnb.lottie.b.q;
import com.google.android.material.internal.o;
import com.waze.NativeManager;
import com.waze.a.aa;
import com.waze.a.z;
import com.waze.sharedui.profile.AgeRestrictionMode;
import com.waze.ui.a.u;
import com.waze.web.SimpleWebActivity;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class e {
    public /* synthetic */ e(byte[] bArr) {
    }

    public static /* synthetic */ ab a(Context context, String str, ManagedActivityResultLauncher managedActivityResultLauncher, State state) {
        String strD = i(state).d();
        if (strD == null) {
            strD = "";
        }
        managedActivityResultLauncher.launch(SimpleWebActivity.z(context, str, strD));
        return ab.f48028a;
    }

    static ab b(h.g.a.a aVar, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        aa aaVar;
        Window window;
        x.f(navBackStackEntry, "$unused$var$");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(167105013, i2, -1, "com.waze.ads.presentation.adDialogDestination.<anonymous> (AdDialogDestination.kt:51)");
        }
        ViewParent parent = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
        byte[] bArr = null;
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        if (dialogWindowProvider != null && (window = dialogWindowProvider.getWindow()) != null) {
            window.setDimAmount(0.0f);
            window.setWindowAnimations(R.style.Animation.InputMethod);
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        String strB = com.waze.ui.r.a.c.c.b(com.waze.R.string.AD_ABOUT_TITLE, composer, 0);
        ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
        boolean zChanged = composer.changed(aVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new q(aVar, 15);
            composer.updateRememberedValue(objRememberedValue);
        }
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue, composer, 0);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        CreationExtras creationExtrasF = org.chromium.support_lib_boundary.a.b.f(current);
        org.a.d.k.b bVarA = org.a.c.a.a(composer);
        int i4 = ar.f48106a;
        m mVar = (m) org.a.b.c.a.a(new h.g.b.m(m.class), current.getViewModelStore(), creationExtrasF, bVarA, null);
        State stateCollectAsState = SnapshotStateKt.collectAsState(mVar.i(), null, composer, 0, 1);
        u uVarI = i(stateCollectAsState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new com.google.firebase.sessions.x(17);
            composer.updateRememberedValue(objRememberedValue2);
        }
        h.g.a.l lVar = (h.g.a.l) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(mVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (h.l.f) new d(mVar);
            composer.updateRememberedValue(objRememberedValue3);
        }
        h.g.a.l lVar2 = (h.g.a.l) objRememberedValue3;
        boolean zChangedInstance2 = composer.changedInstance(mVar);
        Object objRememberedValue4 = composer.rememberedValue();
        int i5 = 2;
        if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (h.l.f) new c((Object) mVar, 2, (char[]) null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        aa aaVar2 = new aa((h.g.a.a) objRememberedValue4, aVar, i5, bArr);
        boolean zChangedInstance3 = composer.changedInstance(mVar);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (h.l.f) new c((Object) mVar, 3, (short[]) null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        aa aaVar3 = new aa((h.g.a.a) objRememberedValue5, aVar, i5, bArr);
        boolean zChangedInstance4 = composer.changedInstance(mVar);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = (h.l.f) new c(mVar, 4, (int[]) null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        aa aaVar4 = new aa((h.g.a.a) objRememberedValue6, aVar, i5, bArr);
        boolean zChangedInstance5 = composer.changedInstance(mVar);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChangedInstance5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
            objRememberedValue7 = (h.l.f) new c(mVar, 5, (boolean[]) null);
            composer.updateRememberedValue(objRememberedValue7);
        }
        aa aaVar5 = new aa((h.g.a.a) objRememberedValue7, aVar, 2, bArr);
        boolean zChangedInstance6 = composer.changedInstance(mVar) | composer.changedInstance(context) | composer.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
            i3 = 2;
            objRememberedValue8 = new z(mVar, context, managedActivityResultLauncherRememberLauncherForActivityResult, i3);
            composer.updateRememberedValue(objRememberedValue8);
        } else {
            i3 = 2;
        }
        aa aaVar6 = new aa((h.g.a.a) objRememberedValue8, aVar, i3, bArr);
        boolean zChangedInstance7 = composer.changedInstance(mVar) | composer.changed(aVar);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
            objRememberedValue9 = new aa(mVar, aVar, 3, bArr);
            composer.updateRememberedValue(objRememberedValue9);
        }
        h.g.a.a aVar3 = (h.g.a.a) objRememberedValue9;
        boolean zChangedInstance8 = composer.changedInstance(mVar);
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChangedInstance8 || objRememberedValue10 == Composer.Companion.getEmpty()) {
            aVar2 = aVar3;
            objRememberedValue10 = (h.l.f) new c((Object) mVar, 1, (byte[]) null);
            composer.updateRememberedValue(objRememberedValue10);
        } else {
            aVar2 = aVar3;
        }
        h.g.a.a aVar4 = (h.g.a.a) objRememberedValue10;
        boolean zChangedInstance9 = composer.changedInstance(mVar);
        Object objRememberedValue11 = composer.rememberedValue();
        if (zChangedInstance9 || objRememberedValue11 == Composer.Companion.getEmpty()) {
            objRememberedValue11 = (h.l.f) new c(mVar, 0);
            composer.updateRememberedValue(objRememberedValue11);
        }
        aa aaVar7 = new aa((h.g.a.a) objRememberedValue11, aVar, 2, null);
        boolean zChangedInstance10 = composer.changedInstance(context) | composer.changed(strB) | composer.changed(stateCollectAsState) | composer.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance10 || objRememberedValue12 == Composer.Companion.getEmpty()) {
            aaVar = aaVar6;
            Object bVar = new b(context, strB, managedActivityResultLauncherRememberLauncherForActivityResult, stateCollectAsState, 0);
            composer.updateRememberedValue(bVar);
            objRememberedValue12 = bVar;
        } else {
            aaVar = aaVar6;
        }
        com.waze.ui.a.l.e(uVarI, lVar, lVar2, aaVar2, aaVar3, aaVar4, aaVar5, aaVar, aVar2, aVar4, aaVar7, new aa((h.g.a.a) objRememberedValue12, aVar, 2, null), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 48, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    public static boolean c(com.waze.b.z zVar) {
        x.f(zVar, "<this>");
        return zVar.a() != AgeRestrictionMode.INVALID;
    }

    public static h.f d(com.waze.app_nav.a.b bVar) {
        x.f(bVar, "<this>");
        return h.g.a(new com.waze.ads.b(bVar, 6));
    }

    public static void e() {
        NativeManager nativeManager = NativeManager.getInstance();
        Objects.requireNonNull(nativeManager);
        NativeManager.Post(new o(nativeManager, 8));
    }

    public static void f(String str) {
        NativeManager.Post(new com.google.android.libraries.phenotype.client.stable.x(NativeManager.getInstance(), str, 8));
    }

    public static void g(final String str, final int i2, final boolean z, final String str2, final String str3, final String str4) {
        final NativeManager nativeManager = NativeManager.getInstance();
        NativeManager.Post(new Runnable() { // from class: com.waze.d.a

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f23254f = "";

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                boolean z2 = z;
                String str5 = str2;
                String str6 = this.f23254f;
                nativeManager.logAnalyticsAdsContextSearchInitNTV(str, -1, -1, i3, z2, str5, str6, str3, str4);
            }
        });
    }

    public static void h(final int i2, final String str, final String str2, final String str3) {
        final NativeManager nativeManager = NativeManager.getInstance();
        NativeManager.Post(new Runnable() { // from class: com.waze.d.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f23258b = "ADS_DISPLAYED";

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f23259c = "ADS_CATEGORY_AUTOCOMPLETE_INFO";

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f23262f = "";

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                String str4 = str;
                NativeManager nativeManager2 = nativeManager;
                String str5 = this.f23262f;
                nativeManager2.logAnalyticsAdsSearchEventNTV(this.f23258b, this.f23259c, -1, -1, i3, false, str4, str5, str2, str3);
            }
        });
    }

    private static u i(State state) {
        return (u) state.getValue();
    }

    private e() {
        throw null;
    }
}
