package com.waze;

import android.app.Activity;
import com.waze.config.ConfigValues;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.reports.AddPlaceFlowActivity;
import com.waze.reports.EditPlaceFlowActivity;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class dc implements com.waze.ab.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23278a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23279b;

    protected dc(MainActivity mainActivity, int i2, byte[] bArr) {
        this.f23279b = i2;
        Objects.requireNonNull(mainActivity);
        this.f23278a = mainActivity;
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [com.waze.ab.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.waze.settings.dd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v9, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.ab.q
    public final void onClick(boolean z) {
        int i2 = 0;
        switch (this.f23279b) {
            case 0:
                ((el) this.f23278a).M().shutDown();
                break;
            case 1:
                if (z) {
                    Object obj = this.f23278a;
                    MainActivity mainActivity = (MainActivity) obj;
                    if (mainActivity.u != null) {
                        com.waze.ae.e.a(((com.waze.modules.navigation.bp) com.waze.web.r.h(com.waze.modules.navigation.bp.class)).b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.r, new com.waze.modules.navigation.ai(mainActivity.u))).a(), ((android.support.v4.app.dd) obj).getLifecycle(), new dg(this, i2));
                        break;
                    }
                }
                break;
            case 2:
                if (z) {
                    ix.h((Activity) this.f23278a, 0);
                    break;
                }
                break;
            case 3:
                ((SpeechRecognizerActivity) this.f23278a).finish();
                break;
            case 4:
                this.f23278a.a(z ? com.waze.modules.navigation.x.f30504b : com.waze.modules.navigation.x.f30503a);
                break;
            case 5:
                ?? r6 = this.f23278a;
                if (!z) {
                    r6.invoke(com.waze.planned_drive.ca.f33294a);
                    break;
                } else {
                    r6.invoke(com.waze.planned_drive.ca.f33295b);
                    break;
                }
            case 6:
                ((PlannedDriveFragment) this.f23278a).F(com.waze.planned_drive.y.f33375b);
                break;
            case 7:
                ((PlannedDriveFragment) this.f23278a).r.q();
                break;
            case 8:
                AddPlaceFlowActivity.v((AddPlaceFlowActivity) this.f23278a, z);
                break;
            case 9:
                ((AddPlaceFlowActivity) this.f23278a).finish();
                break;
            case 10:
                ((AddPlaceFlowActivity) this.f23278a).finish();
                break;
            case 11:
                EditPlaceFlowActivity.v((EditPlaceFlowActivity) this.f23278a, z);
                break;
            case 12:
                this.f23278a.onClick(z);
                break;
            case 13:
                if (z) {
                    com.waze.sdk.bd.d().F((String) this.f23278a);
                    break;
                }
                break;
            case 14:
                this.f23278a.a().b(0);
                break;
            case 15:
                if (z) {
                    ((com.waze.settings.ds) this.f23278a).N(false);
                    break;
                }
                break;
            case 16:
                ((com.waze.settings.ds) this.f23278a).f().setConfigValueBool(ConfigValues.CONFIG_VALUE_DANGER_ZONE_ALERTS, !z);
                break;
            case 17:
                RequestAlwaysLocationDialogActivity.m((RequestAlwaysLocationDialogActivity) this.f23278a, z);
                break;
            default:
                this.f23278a.invoke(z ? com.waze.modules.navigation.w.f30500b : com.waze.modules.navigation.w.f30499a);
                break;
        }
    }

    public /* synthetic */ dc(Object obj, int i2) {
        this.f23279b = i2;
        this.f23278a = obj;
    }
}
