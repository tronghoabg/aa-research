package com.google.android.gms.common.internal;

import android.os.Bundle;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bk implements com.google.android.gms.common.api.f {

    /* renamed from: a, reason: collision with root package name */
    public static final bk f5039a = new bj().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f5040b;

    public static bj b() {
        return new bj();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f5040b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bk) {
            return Objects.equals(this.f5040b, ((bk) obj).f5040b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5040b});
    }
}
