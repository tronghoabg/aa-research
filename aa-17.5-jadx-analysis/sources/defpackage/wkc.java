package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;

/* loaded from: classes3.dex */
public final class wkc extends fig {
    final /* synthetic */ SurveyViewPager a;

    public wkc(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.fig, defpackage.fie
    public final void b(int i) {
        SurveyViewPager surveyViewPager = this.a;
        surveyViewPager.invalidate();
        wii wiiVarS = surveyViewPager.s();
        if (wiiVarS != null) {
            wiiVarS.e();
            wiiVarS.d();
            View view = wiiVarS.getView();
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        surveyViewPager.requestLayout();
    }
}
