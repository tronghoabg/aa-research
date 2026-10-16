package com.waze.navigate;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.media3.common.PlaybackException;
import com.waze.reports.SosProvidersListActivity;
import com.waze.rtalerts.RtAlertsComments;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ai implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30990a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30991b;

    public /* synthetic */ ai(Object obj, int i2) {
        this.f30991b = i2;
        this.f30990a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30991b) {
            case 0:
                ((AutocompleteSearchActivity) this.f30990a).f30919f.setText("");
                break;
            case 1:
                com.waze.reports.dr.q((com.waze.reports.dr) this.f30990a, view);
                break;
            case 2:
                com.waze.reports.dr.B((com.waze.reports.dr) this.f30990a);
                break;
            case 3:
                com.waze.reports.dr.C((com.waze.reports.dr) this.f30990a);
                break;
            case 4:
                com.waze.reports.dr.r((com.waze.reports.dr) this.f30990a, view);
                break;
            case 5:
                SosProvidersListActivity sosProvidersListActivity = (SosProvidersListActivity) this.f30990a;
                sosProvidersListActivity.setResult(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
                sosProvidersListActivity.finish();
                break;
            case 6:
                Object obj = this.f30990a;
                ((SosProvidersListActivity) obj).setResult(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
                ((ComponentActivity) obj).onBackPressed();
                break;
            case 7:
                com.waze.reports.du duVar = (com.waze.reports.du) this.f30990a;
                ((com.waze.reports_v2.c.ds) duVar.B.getValue()).c(new com.waze.reports.dv(duVar, 1));
                break;
            case 8:
                com.waze.reports.ec.a((com.waze.reports.ec) this.f30990a);
                break;
            case 9:
                ((RtAlertsComments) this.f30990a).s();
                break;
            case 10:
                com.waze.rtalerts.l.d((com.waze.rtalerts.l) this.f30990a);
                break;
            case 11:
                com.waze.rtalerts.l.e((com.waze.rtalerts.l) this.f30990a);
                break;
            case 12:
                ((com.waze.sdk.ae) this.f30990a).f35219e.J();
                break;
            case 13:
                com.waze.sdk.ae.V((com.waze.sdk.ae) this.f30990a);
                break;
            case 14:
                com.waze.sdk.ae.ai((com.waze.sdk.ae) this.f30990a);
                break;
            case 15:
                com.waze.sdk.ae.ah((com.waze.sdk.ae) this.f30990a);
                break;
            case 16:
                com.waze.sdk.ae.X((com.waze.sdk.ae) this.f30990a);
                break;
            case 17:
                com.waze.sdk.ae.W((com.waze.sdk.ae) this.f30990a);
                break;
            case 18:
                ((com.waze.sdk.ae) this.f30990a).ag();
                break;
            case 19:
                com.waze.sdk.ae.S((com.waze.sdk.ae) this.f30990a);
                break;
            default:
                com.waze.sdk.ae.Y((com.waze.sdk.ae) this.f30990a);
                break;
        }
    }
}
