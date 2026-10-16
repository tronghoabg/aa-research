package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.r2;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class p1 extends r2 {

    /* renamed from: n, reason: collision with root package name */
    private final q1 f22472n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f22473o;

    public p1(q1 q1Var, Context context) {
        super(r2.c.DETAIL);
        this.f22472n = q1Var;
        this.f22473o = context;
        this.f22644c = r();
        this.f22645d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + o7.a(this.f22472n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f22472n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f22472n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return AbstractC1650m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f22473o);
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return true;
    }
}
