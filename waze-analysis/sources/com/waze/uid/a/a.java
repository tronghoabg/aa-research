package com.waze.uid.a;

import com.waze.R;
import h.a.i;
import h.d.b;
import h.g.b.x;
import i.b.a.m;
import i.b.a.o;
import i.b.a.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44033a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f44034b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f44035c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f44036d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f44037e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.b.a f44038f;

    static {
        a aVar = new a("VERIFY_EMAIL", 0, new com.waze.sharedui.b.a(p.WAZE_ADDED_EMAIL, m.SIGNUP, o.ENABLED, "", i.i(Integer.valueOf(R.string.SIGNUP_EMAIL_EMAIL_TITLE), Integer.valueOf(R.string.SIGNUP_EMAIL_CONSENT_CHECKBOX_LABEL), Integer.valueOf(R.string.SIGNUP_EMAIL_EMAIL_PLACEHOLDER), Integer.valueOf(R.string.AUTH_FLOW_NEXT_BUTTON))));
        f44033a = aVar;
        a aVar2 = new a("CONNECT_EMAIL", 1, new com.waze.sharedui.b.a(p.WAZE_ADDED_EMAIL, m.SIGNUP, o.ENABLED, "", i.i(Integer.valueOf(R.string.VERIFY_EMAIL_INBOX_TITLE), Integer.valueOf(R.string.VERIFY_EMAIL_INBOX_SUBTITLE_PS), Integer.valueOf(R.string.VERIFY_EMAIL_INBOX_OPEN), Integer.valueOf(R.string.VERIFY_EMAIL_HAVING_TROUBLE))));
        f44034b = aVar2;
        p pVar = p.WAZE_ADDED_ADDED_FIRST_NAME;
        m mVar = m.SIGNUP;
        o oVar = o.TYPED;
        Integer numValueOf = Integer.valueOf(R.string.CUI_ONBOARDING_ADD_NAME_TITLE);
        Integer numValueOf2 = Integer.valueOf(R.string.CUI_ONBOARDING_ADD_NAME_MESSAGE);
        Integer numValueOf3 = Integer.valueOf(R.string.CUI_ONBOARDING_ADD_NAME_FIRST_NAME_HINT);
        Integer numValueOf4 = Integer.valueOf(R.string.CUI_ONBOARDING_ADD_NAME_LAST_NAME_HINT);
        Integer numValueOf5 = Integer.valueOf(R.string.CUI_ONBOARDING_ADD_NAME_NEXT);
        a aVar3 = new a("ADD_FIRST_NAME", 2, new com.waze.sharedui.b.a(pVar, mVar, oVar, "", i.i(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5)));
        f44035c = aVar3;
        a aVar4 = new a("ADD_LAST_NAME", 3, new com.waze.sharedui.b.a(p.WAZE_ADDED_LAST_NAME, m.SIGNUP, o.TYPED, "", i.i(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5)));
        f44036d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f44037e = aVarArr;
        b.a(aVarArr);
    }

    private a(String str, int i2, com.waze.sharedui.b.a aVar) {
        this.f44038f = aVar;
    }

    public static a[] values() {
        return (a[]) f44037e.clone();
    }

    public final com.waze.sharedui.b.a a(String str) {
        x.f(str, "selectedOption");
        return com.waze.sharedui.b.a.f(this.f44038f, str);
    }
}
