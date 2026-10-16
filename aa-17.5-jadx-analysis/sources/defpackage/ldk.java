package defpackage;

import android.os.PersistableBundle;
import com.google.android.apps.auto.components.feedback.hats.HatsDownloadService;
import com.google.android.libraries.surveys.SurveyData;

/* loaded from: classes2.dex */
public final class ldk {
    final /* synthetic */ String a;
    final /* synthetic */ PersistableBundle b;
    final /* synthetic */ HatsDownloadService c;
    final /* synthetic */ int d;

    public ldk(HatsDownloadService hatsDownloadService, String str, int i, PersistableBundle persistableBundle) {
        this.a = str;
        this.d = i;
        this.b = persistableBundle;
        this.c = hatsDownloadService;
    }

    public final void a(String str, whf whfVar) {
        zaa zaaVar;
        ((ype) ((ype) HatsDownloadService.a.g()).ai(3737)).M("Failed to download HaTS survey with ID %s: %s", str, whfVar);
        if (this.d == 1) {
            kzd.j().e(false, null, null);
        }
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hr);
        rrbVarH.x(str);
        int iOrdinal = whfVar.ordinal();
        if (iOrdinal == 0) {
            zaaVar = zaa.HATS_BACKEND_TIMEOUT;
        } else if (iOrdinal == 1) {
            zaaVar = zaa.HATS_FAILED_TO_FETCH_SURVEY;
        } else if (iOrdinal == 2) {
            zaaVar = zaa.HATS_NO_AVAILABLE_SURVEY;
        } else if (iOrdinal == 3) {
            zaaVar = zaa.HATS_TRIGGER_ID_NOT_SET;
        } else {
            if (iOrdinal != 4) {
                throw new RuntimeException(null, null);
            }
            zaaVar = zaa.HATS_UNSUPPORTED_CRONET_ENGINE;
        }
        rrbVarH.v(zaaVar);
        ohsVarJ.F(rrbVarH.l());
        HatsDownloadService hatsDownloadService = this.c;
        hatsDownloadService.jobFinished(hatsDownloadService.c, false);
    }

    public final void b(SurveyData surveyData) {
        ((ype) ((ype) HatsDownloadService.a.f()).ai(3738)).y("Downloaded HaTS survey with data trigger %s", surveyData.a().a);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hq);
        rrbVarH.x(this.a);
        ohsVarJ.F(rrbVarH.l());
        int i = this.d - 1;
        PersistableBundle persistableBundle = this.b;
        if (i != 1) {
            kzd.j().e(true, surveyData, persistableBundle);
        } else {
            kzd.j().b(surveyData, persistableBundle);
        }
        HatsDownloadService hatsDownloadService = this.c;
        hatsDownloadService.jobFinished(hatsDownloadService.c, false);
    }
}
