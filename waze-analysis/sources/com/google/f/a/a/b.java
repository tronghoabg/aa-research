package com.google.f.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    UNKNOWN(0),
    NONE(1),
    BASE64(2),
    WEBSAFE(3),
    BASE64_URL(4),
    WEBSAFE_BASE64_URL(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f8799h;

    b(int i2) {
        this.f8799h = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 == 2) {
            return BASE64;
        }
        if (i2 == 3) {
            return WEBSAFE;
        }
        if (i2 == 4) {
            return BASE64_URL;
        }
        if (i2 != 5) {
            return null;
        }
        return WEBSAFE_BASE64_URL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f8799h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8799h);
    }
}
