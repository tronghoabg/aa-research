package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.projection.gearhead.R;
import defpackage.adhn;
import defpackage.adhz;
import defpackage.ep;
import defpackage.om;
import defpackage.vuf;
import defpackage.whn;
import defpackage.wia;
import defpackage.wju;
import defpackage.wjx;
import defpackage.wjy;
import defpackage.wkd;
import defpackage.wox;

/* loaded from: classes3.dex */
public class SurveyActivity extends ep implements wjy {
    public wjx m;
    private final om n = new wju(this);

    @Override // defpackage.wjv
    public final void c() {
        this.m.e();
    }

    @Override // defpackage.wjv
    public final void d() {
        ImageButton imageButton = (ImageButton) this.m.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // defpackage.wip
    public final void e() {
        this.m.f();
    }

    @Override // defpackage.wiq
    public final void f(boolean z, Fragment fragment) {
        wjx wjxVar = this.m;
        if (wjxVar.j || wkd.g(fragment) != wjxVar.d.c) {
            return;
        }
        wjxVar.i(z);
    }

    @Override // defpackage.wip
    public final void g(boolean z) {
        this.m.i(z);
    }

    @Override // defpackage.wjv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.wjv
    public final boolean i() {
        return this.m.m();
    }

    @Override // defpackage.wip
    public final void j() {
        this.m.j(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        wjx wjxVar = this.m;
        if (wia.b == null) {
            return;
        }
        if (wia.d()) {
            whn whnVarC = wjxVar.c();
            if (wjxVar.u.isFinishing() && whnVarC != null) {
                vuf.h.l(whnVarC);
            }
        } else if (wjxVar.u.isFinishing()) {
            vuf.h.k();
        }
        wjxVar.p.removeCallbacks(wjxVar.q);
    }

    @Override // defpackage.ob, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        wjx wjxVar = this.m;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            wjxVar.u.finish();
        }
        if (intent.hasExtra("IsPausing")) {
            wjxVar.g(intent.getBooleanExtra("IsPausing", false));
        }
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        wjx wjxVar = this.m;
        wox woxVar = wia.c;
        if (wia.b(adhz.d(wia.b))) {
            SurveyViewPager surveyViewPager = wjxVar.d;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", wjxVar.a());
        }
        bundle.putBoolean("IsSubmitting", wjxVar.j);
        bundle.putParcelable("Answer", wjxVar.e);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", wjxVar.f);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wox woxVar = wia.c;
        boolean zC = adhn.c(this);
        wjx wjxVar = this.m;
        if (!zC) {
            return wjxVar.n(motionEvent);
        }
        if (wjxVar.n(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.wjy
    public final Activity b() {
        return this;
    }
}
