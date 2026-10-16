package com.waze.copilot.presentation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.copilot.a.ak;
import com.waze.copilot.a.ap;
import com.waze.copilot.a.au;
import com.waze.copilot.a.br;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CopilotMarketplaceViewModel extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23093a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f23094b;

    /* renamed from: c, reason: collision with root package name */
    private final au f23095c;

    /* renamed from: d, reason: collision with root package name */
    private final ak f23096d;

    /* renamed from: e, reason: collision with root package name */
    private final br f23097e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.copilot.a.o f23098f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigManager f23099g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.copilot.a.k f23100h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f23101i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f23102j;

    /* renamed from: k, reason: collision with root package name */
    private final long f23103k;

    public CopilotMarketplaceViewModel(com.waze.shared_infra.i.e eVar, ap apVar, au auVar, ak akVar, br brVar, com.waze.copilot.a.o oVar, ConfigManager configManager, com.waze.copilot.a.k kVar, com.waze.shared_infra.i.b bVar) {
        x.f(eVar, "logger");
        x.f(apVar, "incrementFTEDialogTimesShownUseCase");
        x.f(auVar, "updateCopilotAssetsUseCase");
        x.f(akVar, "getCopilotScreenUrlUseCase");
        x.f(brVar, "shouldShowFTEDialogUseCase");
        x.f(oVar, "statsSender");
        x.f(configManager, "configManager");
        x.f(bVar, "exceptionReporter");
        this.f23093a = eVar;
        this.f23094b = apVar;
        this.f23095c = auVar;
        this.f23096d = akVar;
        this.f23097e = brVar;
        this.f23098f = oVar;
        this.f23099g = configManager;
        this.f23100h = kVar;
        this.f23101i = bVar;
        this.f23102j = ck.b(new r(new com.waze.ui.g.t(null), null, null, "", s.f23156a));
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_ANDROID_DOWNLOAD_ASSETS_TIMEOUT_SEC.b();
        x.e(lB, "getValue(...)");
        this.f23103k = h.o.c.j(lB.longValue(), h.o.d.f48273d);
        eVar.a("init");
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new o(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissDialog() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f23102j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, null, null, null, null, 27)));
    }

    public static final /* synthetic */ void k(CopilotMarketplaceViewModel copilotMarketplaceViewModel) {
        bn bnVar;
        Object objD;
        do {
            bnVar = copilotMarketplaceViewModel.f23102j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, new q(R.string.MARKETPLACE_SUCCESS_MESSAGE, null, copilotMarketplaceViewModel.v(), true, 2), null, null, s.f23156a, 13)));
    }

    private final long v() {
        return this.f23099g.getConfigValueLong(ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_MESSAGES_DURATION_SECONDS) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f23102j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, new q(R.string.MARKETPLACE_GENERAL_ERROR_MESSAGE, Integer.valueOf(R.string.MARKETPLACE_BUTTON_OK), v(), false, 8), null, null, s.f23156a, 13)));
    }

    public final ch h() {
        return this.f23102j;
    }

    public final void l() {
        this.f23098f.e(com.waze.copilot.a.m.f22843a);
    }

    public final void m() {
        this.f23098f.e(com.waze.copilot.a.m.f22845c);
    }

    public final void n() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f23102j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, null, null, null, null, 29)));
    }

    public final void o() {
        this.f23098f.d();
    }

    public final void onFTEDialogClick() {
        this.f23098f.c();
        this.f23094b.a();
        dismissDialog();
    }

    public final void onFTEDialogDismiss() {
        this.f23094b.a();
        dismissDialog();
    }

    public final void p(boolean z) {
        bn bnVar;
        Object objD;
        r rVar;
        s sVar;
        p pVar;
        p pVar2;
        do {
            bnVar = this.f23102j;
            objD = bnVar.d();
            rVar = (r) objD;
            sVar = s.f23156a;
            if (!z) {
                pVar = new p(com.waze.ui.g.x.f42375b, new t(this, 2, (char[]) null), new t(this, 3, (char[]) null));
            } else if (this.f23097e.a() && x.n(this.f23100h, com.waze.copilot.a.j.f22838a)) {
                pVar = new p(com.waze.ui.g.x.f42374a, new t(this, 1, (byte[]) null), new t(this, 0));
            } else {
                pVar2 = null;
            }
            pVar2 = pVar;
        } while (!bnVar.f(objD, r.f(rVar, null, null, pVar2, null, sVar, 11)));
    }

    public final void q() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f23102j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, null, null, null, s.f23157b, 15)));
    }

    public final void r(LogRequest logRequest) {
        x.f(logRequest, "logRequest");
        String strComponent1 = logRequest.component1();
        String str = "web view log: " + logRequest.component2() + ", originalLogLevel: " + strComponent1;
        boolean zN = x.n(strComponent1, "ERROR");
        com.waze.shared_infra.i.e eVar = this.f23093a;
        if (zN) {
            eVar.g(str);
        } else {
            eVar.a(str);
        }
    }

    public final void s() {
        this.f23098f.e(com.waze.copilot.a.m.f22844b);
    }

    public final void t(UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest) {
        Object objD;
        this.f23098f.b(updateCoPilotSelectionRequest);
        Objects.toString(updateCoPilotSelectionRequest);
        this.f23093a.a("got copilot selections from web: ".concat(String.valueOf(updateCoPilotSelectionRequest)));
        if ((updateCoPilotSelectionRequest != null ? updateCoPilotSelectionRequest.getActions() : null) == null) {
            w();
            return;
        }
        bn bnVar = this.f23102j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, null, null, null, s.f23158c, 15)));
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new u(this, updateCoPilotSelectionRequest, null, 0), 3);
    }

    public final void u(UpdateWebviewHeaderRequest updateWebviewHeaderRequest) {
        String str;
        Object objD;
        x.f(updateWebviewHeaderRequest, "headerUpdateRequest");
        Objects.toString(updateWebviewHeaderRequest);
        this.f23093a.a("got header update request from web: ".concat(updateWebviewHeaderRequest.toString()));
        String shareUrl = updateWebviewHeaderRequest.getShareUrl();
        Boolean backButton = updateWebviewHeaderRequest.getBackButton();
        boolean zBooleanValue = backButton != null ? backButton.booleanValue() : true;
        Boolean closeButton = updateWebviewHeaderRequest.getCloseButton();
        this.f23098f.f(shareUrl != null, closeButton != null ? closeButton.booleanValue() : true, zBooleanValue);
        if (updateWebviewHeaderRequest.getShareUrl() != null) {
            String shareTitle = updateWebviewHeaderRequest.getShareTitle();
            if (shareTitle == null) {
                shareTitle = "";
            }
            String shareBody = updateWebviewHeaderRequest.getShareBody();
            if (shareBody == null) {
                shareBody = "";
            }
            str = shareTitle + " " + shareBody + " " + updateWebviewHeaderRequest.getShareUrl();
        } else {
            str = null;
        }
        String title = updateWebviewHeaderRequest.getTitle();
        String str2 = title != null ? title : "";
        Boolean backButton2 = updateWebviewHeaderRequest.getBackButton();
        boolean zBooleanValue2 = backButton2 != null ? backButton2.booleanValue() : true;
        Boolean closeButton2 = updateWebviewHeaderRequest.getCloseButton();
        com.waze.ui.g.t tVar = new com.waze.ui.g.t(str2, str, zBooleanValue2, closeButton2 != null ? closeButton2.booleanValue() : true);
        bn bnVar = this.f23102j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, tVar, null, null, null, null, 30)));
    }
}
