package com.waze.uid.c;

import android.text.TextUtils;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap implements com.waze.sharedui.views.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ be f44215a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44216b;

    ap(be beVar, int i2) {
        this.f44216b = i2;
        this.f44215a = beVar;
    }

    @Override // com.waze.sharedui.views.m
    public final String a(String str) {
        int i2 = this.f44216b;
        if (i2 == 0) {
            String str2 = str;
            return (str2 == null || str2.length() == 0) ? ((aq) this.f44215a).f44223h.c(R.string.UID_LOGIN_EMPTY_EMAIL_USERNAME_ERROR, new Object[0]) : ((aq) this.f44215a).f44223h.c(R.string.UID_LOGIN_WRONG_EMAIL_FORMAT, new Object[0]);
        }
        if (i2 != 1) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            be beVar = this.f44215a;
            return zIsEmpty ? ((aw) beVar).f44236e.c(R.string.LOGIN_PASSWORD_EMPTY, new Object[0]) : ((aw) beVar).f44236e.c(R.string.LOGIN_PASSWORD_WRONG_MSG, new Object[0]);
        }
        boolean zF = com.google.d.b.an.f(str);
        be beVar2 = this.f44215a;
        return zF ? ((ah) beVar2).f44206d.c(R.string.UID_SIGNUP_EMAIL_VALIDATION_EMPTY, new Object[0]) : ((ah) beVar2).f44206d.c(R.string.UID_SIGNUP_EMAIL_VALIDATION_ERROR, new Object[0]);
    }
}
