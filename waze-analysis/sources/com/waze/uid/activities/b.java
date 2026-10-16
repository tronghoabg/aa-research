package com.waze.uid.activities;

import com.waze.R;
import com.waze.uid.stats.UidStatsSender$OnboardingContext;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f44071a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f44072b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f44073c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f44074d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f44075e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f44076f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f44077g;

    /* renamed from: h, reason: collision with root package name */
    private final int f44078h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f44079i;

    /* renamed from: j, reason: collision with root package name */
    private final int f44080j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f44081k;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f44082l;

    static {
        Integer numValueOf = Integer.valueOf(R.drawable.addid);
        Integer numValueOf2 = Integer.valueOf(R.string.ADD_EMAIL_AS_MESSAGE);
        Integer numValueOf3 = Integer.valueOf(R.string.ADD_EMAIL_AS_EMAIL_BUTTON);
        UidStatsSender$OnboardingContext uidStatsSender$OnboardingContext = UidStatsSender$OnboardingContext.WAZE_ONBOARDING;
        b bVar = new b("REGISTERED", 0, numValueOf, R.string.ADD_EMAIL_AS_TITLE, numValueOf2, R.string.ADD_EMAIL_AS_GOOGLE_BUTTON, numValueOf3, null, 64);
        f44071a = bVar;
        b bVar2 = new b("UNREGISTERED", 1, null, R.string.REGISTER_ACCOUNT_AS_TITLE, Integer.valueOf(R.string.REGISTER_ACCOUNT_AS_MESSAGE), R.string.REGISTER_ACCOUNT_AS_GOOGLE_BUTTON, Integer.valueOf(R.string.REGISTER_ACCOUNT_AS_EMAIL_BUTTON), null, 64);
        f44072b = bVar2;
        b bVar3 = new b("EDIT_ID_CORE", 2, numValueOf, R.string.UID_EDIT_ID_AS_TITLE, Integer.valueOf(R.string.UID_EDIT_ID_AS_MESSAGE), R.string.UID_EDIT_ID_AS_GOOGLE_BUTTON, Integer.valueOf(R.string.UID_EDIT_ID_AS_EMAIL_BUTTON), null, 64);
        f44073c = bVar3;
        Integer numValueOf4 = Integer.valueOf(R.string.SIGNUP_MENU_EMAIL);
        Integer numValueOf5 = Integer.valueOf(R.string.SIGNUP_MENU_SKIP);
        b bVar4 = new b("SIGNUP_LOGIN", 3, null, R.string.SIGNUP_LOGIN_MENU_TITLE, null, R.string.SIGNUP_MENU_GOOGLE, numValueOf4, numValueOf5);
        f44074d = bVar4;
        b bVar5 = new b("SIGNUP_LOGIN_GOOGLE_ONLY", 4, null, R.string.SIGNUP_LOGIN_MENU_TITLE, null, R.string.SIGNUP_MENU_GOOGLE, null, numValueOf5, 16);
        f44075e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f44076f = bVarArr;
        h.d.b.a(bVarArr);
    }

    private b(String str, int i2, Integer num, int i3, Integer num2, int i4, Integer num3, Integer num4) {
        this.f44077g = num;
        this.f44078h = i3;
        this.f44079i = num2;
        this.f44080j = i4;
        this.f44081k = num3;
        this.f44082l = num4;
    }

    public static b[] values() {
        return (b[]) f44076f.clone();
    }

    public final int a() {
        return this.f44080j;
    }

    public final int b() {
        return this.f44078h;
    }

    public final Integer c() {
        return this.f44081k;
    }

    public final Integer d() {
        return this.f44077g;
    }

    public final Integer e() {
        return this.f44079i;
    }

    public final Integer f() {
        return this.f44082l;
    }

    public final void g(com.waze.uid.stats.h hVar) {
        x.f(hVar, "action");
        com.waze.uid.d.q.f44463a.a().c().a(hVar, a.i(this), a.h(this));
    }

    /* synthetic */ b(String str, int i2, Integer num, int i3, Integer num2, int i4, Integer num3, Integer num4, int i5) {
        this(str, i2, num, i3, num2, i4, (i5 & 16) != 0 ? null : num3, (i5 & 64) != 0 ? null : num4);
    }
}
