package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;
import defpackage.adii;
import defpackage.whu;
import defpackage.wia;
import defpackage.wox;

/* loaded from: classes3.dex */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        SurveyPromptBannerWrapper surveyPromptBannerWrapper;
        int i3;
        wox woxVar = wia.c;
        if (wia.c(adii.a.gu().b(wia.b))) {
            surveyPromptBannerWrapper = this;
            i3 = i;
            i2 = whu.b(surveyPromptBannerWrapper, findViewById(R.id.survey_prompt_banner), i3, i2, findViewById(R.id.survey_prompt_header), null, false);
        } else {
            surveyPromptBannerWrapper = this;
            i3 = i;
        }
        super.onMeasure(i3, i2);
    }
}
