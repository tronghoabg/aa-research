package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import h6.C2782a;
import h6.C2783b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l6.InterfaceC3396b;
import s6.C4015b;
import s6.C4016c;
import s6.E;
import s6.K;
import u6.v;
import xg.g;

/* loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f26267a;

    /* renamed from: b, reason: collision with root package name */
    public C4016c f26268b;

    /* renamed from: c, reason: collision with root package name */
    public float f26269c;

    /* renamed from: d, reason: collision with root package name */
    public float f26270d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26271e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26272f;

    /* renamed from: g, reason: collision with root package name */
    public int f26273g;

    /* renamed from: h, reason: collision with root package name */
    public E f26274h;

    /* renamed from: i, reason: collision with root package name */
    public View f26275i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26267a = Collections.EMPTY_LIST;
        this.f26268b = C4016c.f45126g;
        this.f26269c = 0.0533f;
        this.f26270d = 0.08f;
        this.f26271e = true;
        this.f26272f = true;
        C4015b c4015b = new C4015b(context);
        this.f26274h = c4015b;
        this.f26275i = c4015b;
        addView(c4015b);
        this.f26273g = 1;
    }

    private List<C2783b> getCuesWithStylingPreferencesApplied() {
        if (this.f26271e && this.f26272f) {
            return this.f26267a;
        }
        ArrayList arrayList = new ArrayList(this.f26267a.size());
        for (int i5 = 0; i5 < this.f26267a.size(); i5++) {
            C2782a c2782aA = ((C2783b) this.f26267a.get(i5)).a();
            if (!this.f26271e) {
                c2782aA.f36162n = false;
                CharSequence charSequence = c2782aA.f36150a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c2782aA.f36150a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c2782aA.f36150a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC3396b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                g.L(c2782aA);
            } else if (!this.f26272f) {
                g.L(c2782aA);
            }
            arrayList.add(c2782aA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (v.f46721a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C4016c getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i5 = v.f46721a;
        C4016c c4016c = C4016c.f45126g;
        if (i5 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c4016c;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i5 >= 21) {
            return new C4016c(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C4016c(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & E> void setView(T t10) {
        removeView(this.f26275i);
        View view = this.f26275i;
        if (view instanceof K) {
            ((K) view).f45116b.destroy();
        }
        this.f26275i = t10;
        this.f26274h = t10;
        addView(t10);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f26274h.a(getCuesWithStylingPreferencesApplied(), this.f26268b, this.f26269c, this.f26270d);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.f26272f = z2;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.f26271e = z2;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f26270d = f10;
        c();
    }

    public void setCues(List<C2783b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f26267a = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f26269c = f10;
        c();
    }

    public void setStyle(C4016c c4016c) {
        this.f26268b = c4016c;
        c();
    }

    public void setViewType(int i5) {
        if (this.f26273g == i5) {
            return;
        }
        if (i5 == 1) {
            setView(new C4015b(getContext()));
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new K(getContext()));
        }
        this.f26273g = i5;
    }
}
