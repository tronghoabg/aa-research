package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.abxn;
import defpackage.abye;
import defpackage.abys;
import defpackage.adic;
import defpackage.fhy;
import defpackage.unj;
import defpackage.whc;
import defpackage.whu;
import defpackage.wia;
import defpackage.wii;
import defpackage.wjy;
import defpackage.wjz;
import defpackage.wkc;
import defpackage.wkd;
import defpackage.wox;

/* loaded from: classes3.dex */
public class SurveyViewPager extends ViewPager {
    public wjy h;

    public SurveyViewPager(Context context) {
        super(context);
        B();
    }

    private final View A() {
        wii wiiVarS;
        if (this.b == null || (wiiVarS = s()) == null) {
            return null;
        }
        return wiiVarS.getView();
    }

    private final void B() {
        wkc wkcVar = new wkc(this);
        d(wkcVar);
        post(new unj(this, wkcVar, 19, null));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        wox woxVar = wia.c;
        if (wia.c(adic.a.gu().a(wia.b))) {
            View viewA = A();
            if (viewA == null) {
                super.onMeasure(i, i2);
                return;
            }
            wjy wjyVar = this.h;
            View viewFindViewById = wjyVar != null ? wjyVar.b().findViewById(R.id.survey_controls_container) : null;
            wjy wjyVar2 = this.h;
            super.onMeasure(i, whu.b(this, viewA, i, i2, viewA.findViewById(R.id.survey_question_header_logo_text), viewFindViewById, wjyVar2 == null || wjyVar2.h()));
            return;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        View viewA2 = A();
        if (viewA2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        viewA2.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewA2.getMeasuredHeight();
        Rect rect = new Rect();
        viewA2.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - viewA2.findViewById(R.id.survey_question_header_logo_text).getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, iHeight - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final wii s() {
        wjy wjyVar = this.h;
        if (wjyVar == null) {
            return null;
        }
        int i = this.c;
        for (Fragment fragment : wjyVar.a().l()) {
            if (wkd.g(fragment) == i && (fragment instanceof wii)) {
                return (wii) fragment;
            }
        }
        return null;
    }

    public final abye t() {
        wii wiiVarS = s();
        if (wiiVarS == null) {
            return null;
        }
        return wiiVarS.c();
    }

    public final void u() {
        q(this.b.e() - 1);
        s().d();
    }

    public final void v(int i) {
        q(i);
        s().d();
    }

    public final void w(String str) {
        wii wiiVarS = s();
        if (wiiVarS != null) {
            wiiVarS.f(str);
        } else {
            post(new unj(this, str, 18));
        }
    }

    public final boolean x() {
        return this.c == 0;
    }

    public final boolean y() {
        fhy fhyVar = this.b;
        if (fhyVar == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if (wia.a() && s() != null) {
            wkd wkdVar = (wkd) fhyVar;
            if (wkdVar.i(this.c) != null && (wkdVar.i(this.c).b & 1) != 0) {
                abys abysVar = ((wkd) this.b).i(this.c).k;
                if (abysVar == null) {
                    abysVar = abys.a;
                }
                abxn abxnVar = abysVar.d;
                if (abxnVar == null) {
                    abxnVar = abxn.a;
                }
                int iAz = a.az(abxnVar.b);
                return iAz != 0 && iAz == 5;
            }
        }
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b))) {
            return this.c == ((wkd) fhyVar).e() + (-2);
        }
        wkd wkdVar2 = (wkd) fhyVar;
        return this.c == wkdVar2.e() - (wkdVar2.g == whc.a ? 2 : 1);
    }

    public final boolean z() {
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b))) {
            return this.c == this.b.e() + (-1);
        }
        fhy fhyVar = this.b;
        if (fhyVar != null) {
            return ((wjz) ((wkd) fhyVar).e.get(this.c)).b == 5;
        }
        Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
        return false;
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        B();
    }
}
