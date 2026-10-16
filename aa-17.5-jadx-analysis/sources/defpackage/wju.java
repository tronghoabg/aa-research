package defpackage;

import android.content.Intent;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* loaded from: classes3.dex */
public final class wju extends om {
    final /* synthetic */ SurveyActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wju(SurveyActivity surveyActivity) {
        super(true);
        this.a = surveyActivity;
    }

    @Override // defpackage.om
    public final void b() {
        wjx wjxVar = this.a.m;
        wjxVar.o(6);
        if (wjxVar.j) {
            wjxVar.u.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        wjxVar.u.finish();
    }
}
