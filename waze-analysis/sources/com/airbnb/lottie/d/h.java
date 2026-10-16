package com.airbnb.lottie.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f2283a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2284b;

    public h(String str, float f2) {
        this.f2284b = str;
        this.f2283a = f2;
    }

    public final boolean a(String str) {
        String str2 = this.f2284b;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() + (-1)).equalsIgnoreCase(str);
    }
}
