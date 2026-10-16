package com.waze.navigate;

import android.os.Handler;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class NavigateNativeManager extends cx implements fl, fm {
    public static final int UH_CHECK_ROUTING_RESULTS = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    private static NavigateNativeManager mInstance = new NavigateNativeManager();
    private com.waze.ifs.a.f handlers = new com.waze.ifs.a.f();

    private NavigateNativeManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void ClearPreviewsNTV();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SetSimpleParkingPoiPositionNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$SetSimpleParkingPoiPosition$0(int i2, int i3, boolean z);

    public static NavigateNativeManager instance() {
        return mInstance;
    }

    static /* synthetic */ void lambda$showOneOffNavigationSettingsPopup$0(com.waze.shared_infra.o.a aVar, String str, String str2, com.waze.sharedui.a.e eVar) {
        if (eVar instanceof com.waze.ifs.ui.a) {
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(aVar.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_POPUP_TITLE_PS, str));
            oVar.P(str2);
            oVar.J(new cw(0));
            oVar.M(aVar.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_POPUP_BUTTON, new Object[0]));
            oVar.z(aVar.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_POPUP_CHECKBOX, new Object[0]));
            oVar.y(false);
            com.waze.z.a.d.ai.r(oVar, (com.waze.ifs.ui.a) eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void navigateToParkingNTV(byte[] bArr, byte[] bArr2);

    public void ClearPreviews() {
        NativeManager.Post(new e(this, 1));
    }

    public native void InitNTV();

    public void SetSimpleParkingPoiPosition(final int i2, final int i3, final boolean z) {
        NativeManager.Post(new Runnable() { // from class: com.waze.navigate.cv
            @Override // java.lang.Runnable
            public final void run() {
                this.f31201a.lambda$SetSimpleParkingPoiPosition$0(i2, i3, z);
            }
        });
    }

    protected native boolean isUsingOneOffNavigationSettingsNTV();

    @Override // com.waze.navigate.fl
    public boolean isVenueCategoryWithImplicitParking(String str) {
        return isVenueCategoryWithImplicitParkingNTV(str);
    }

    public native boolean isVenueCategoryWithImplicitParkingNTV(String str);

    public void navigateToParking(com.waze.reports.ed edVar, com.waze.reports.ed edVar2) {
        NativeManager.Post(new bl(this, edVar, edVar2, 1));
    }

    public void setUpdateHandler(int i2, Handler handler) {
        this.handlers.b(i2, handler);
    }

    void showOneOffNavigationSettingsPopup() {
        if (ConfigValues.CONFIG_VALUE_TRANSPORTATION_NAVIGATION_SETTINGS_POPUP_DONT_SHOW_AGAIN.b().booleanValue()) {
            return;
        }
        final String strE = com.waze.sdk.bi.d().e();
        if (com.waze.shared_infra.i.h.p(strE)) {
            return;
        }
        final com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        final String str = String.format(aVarA.c(R.string.TRANSPORT_SDK_NAVIGATION_SETTINGS_POPUP_BODY_PS_PL, new Object[0]), strE, ConfigValues.CONFIG_VALUE_TRANSPORTATION_LEARN_MORE_URL.b());
        com.waze.uid.d.q.b().f44467e.p(new com.waze.uid.d.b() { // from class: com.waze.navigate.cu
            @Override // com.waze.uid.d.b
            public final void a(com.waze.sharedui.a.e eVar) {
                NavigateNativeManager.lambda$showOneOffNavigationSettingsPopup$0(aVarA, strE, str, eVar);
            }
        });
    }

    public void unsetUpdateHandler(int i2, Handler handler) {
        this.handlers.c(i2, handler);
    }
}
