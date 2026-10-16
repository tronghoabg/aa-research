package com.google.android.gms.common.internal;

import android.content.ComponentName;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final String f26618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26619b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f26620c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26621d;

    public U(ComponentName componentName) {
        this.f26618a = null;
        this.f26619b = null;
        AbstractC1732v.i(componentName);
        this.f26620c = componentName;
        this.f26621d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return AbstractC1732v.m(this.f26618a, u10.f26618a) && AbstractC1732v.m(this.f26619b, u10.f26619b) && AbstractC1732v.m(this.f26620c, u10.f26620c) && this.f26621d == u10.f26621d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26618a, this.f26619b, this.f26620c, 4225, Boolean.valueOf(this.f26621d)});
    }

    public final String toString() {
        String str = this.f26618a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f26620c;
        AbstractC1732v.i(componentName);
        return componentName.flattenToString();
    }

    public U(String str, String str2, boolean z2) {
        AbstractC1732v.f(str);
        this.f26618a = str;
        AbstractC1732v.f(str2);
        this.f26619b = str2;
        this.f26620c = null;
        this.f26621d = z2;
    }
}
