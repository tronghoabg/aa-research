package com.waze.uid.d;

import com.waze.R;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f44458a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f44459b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f44460c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.config.d f44461d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44462e;

    static {
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_SIGNUP_UID_EMAIL_VERIFICATION_HC_URL;
        x.e(dVar, "CONFIG_VALUE_SIGNUP_UID_EMAIL_VERIFICATION_HC_URL");
        n nVar = new n("EMAIL_VERIFICATION", 0, dVar, R.string.UID_HELP_CENTER_EMAIL_VERIFICATION_TITLE);
        f44458a = nVar;
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_SIGNUP_UID_ADD_ID_PROFILE_EXISTS_HC_URL;
        x.e(dVar2, "CONFIG_VALUE_SIGNUP_UID_…_ID_PROFILE_EXISTS_HC_URL");
        n nVar2 = new n("ADD_ID_PROFILE_EXISTS", 1, dVar2, R.string.UID_HELP_CENTER_ADD_ID_PROFILE_EXISTS_TITLE);
        f44459b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f44460c = nVarArr;
        h.d.b.a(nVarArr);
    }

    private n(String str, int i2, com.waze.config.d dVar, int i3) {
        this.f44461d = dVar;
        this.f44462e = i3;
    }

    public static n[] values() {
        return (n[]) f44460c.clone();
    }

    public final int a() {
        return this.f44462e;
    }

    public final com.waze.config.d b() {
        return this.f44461d;
    }

    public final String c() {
        String strB = this.f44461d.b();
        x.e(strB, "getValue(...)");
        return strB;
    }
}
