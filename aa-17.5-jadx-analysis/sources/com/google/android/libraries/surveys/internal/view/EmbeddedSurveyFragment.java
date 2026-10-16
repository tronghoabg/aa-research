package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.ImageButton;
import com.google.android.projection.gearhead.R;
import defpackage.bt;
import defpackage.whi;
import defpackage.wjy;
import defpackage.wkd;

/* loaded from: classes3.dex */
public class EmbeddedSurveyFragment extends Fragment implements wjy {
    private whi a;

    @Override // defpackage.wjv
    public final bt a() {
        return getChildFragmentManager();
    }

    @Override // defpackage.wjy
    public final /* bridge */ /* synthetic */ Activity b() {
        return super.getActivity();
    }

    @Override // defpackage.wjv
    public final void d() {
        ImageButton imageButton = (ImageButton) this.a.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // defpackage.wip
    public final void e() {
        this.a.g();
    }

    @Override // defpackage.wiq
    public final void f(boolean z, Fragment fragment) {
        whi whiVar = this.a;
        if (whiVar.j || wkd.g(fragment) != whiVar.e.c || whiVar.k.k) {
            return;
        }
        whiVar.h(z);
    }

    @Override // defpackage.wip
    public final void g(boolean z) {
        this.a.h(z);
    }

    @Override // defpackage.wjv
    public final boolean h() {
        return true;
    }

    @Override // defpackage.wjv
    public final boolean i() {
        return this.a.l();
    }

    @Override // defpackage.wip
    public final void j() {
        this.a.j(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0225  */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r31, android.view.ViewGroup r32, android.os.Bundle r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        SurveyViewPager surveyViewPager = this.a.e;
        bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        bundle.putBoolean("IsSubmitting", this.a.j);
        bundle.putParcelable("Answer", this.a.f);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", this.a.g);
    }

    @Override // defpackage.wjv
    public final void c() {
    }
}
