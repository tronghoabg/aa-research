package com.google.android.libraries.c.a;

import androidx.credentials.GetCustomCredentialOption;
import com.google.android.gms.o.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends GetCustomCredentialOption {

    /* renamed from: a, reason: collision with root package name */
    private final String f5800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", ag.h(str, str2), ag.h(str, str2), true, true, null, 32, null);
        x.f(str, "serverClientId");
        this.f5800a = str;
        this.f5801b = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }

    public final String a() {
        return this.f5801b;
    }

    public final String b() {
        return this.f5800a;
    }
}
