package com.google.d.f;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    private final String f7867b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7868c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7869d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7870e;

    /* renamed from: f, reason: collision with root package name */
    private int f7871f = 0;

    /* synthetic */ q(String str, String str2, int i2, String str3) {
        this.f7867b = str;
        this.f7868c = str2;
        this.f7869d = i2;
        this.f7870e = str3;
    }

    @Override // com.google.d.f.r
    public final int a() {
        return (char) this.f7869d;
    }

    @Override // com.google.d.f.r
    public final String b() {
        return this.f7867b.replace('/', '.');
    }

    @Override // com.google.d.f.r
    public final String c() {
        String str = this.f7870e;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.d.f.r
    public final String d() {
        return this.f7868c;
    }

    @Override // com.google.d.f.r
    public final String e() {
        return this.f7870e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f7868c.equals(qVar.f7868c) && this.f7869d == qVar.f7869d) {
                String str = this.f7867b;
                String str2 = qVar.f7867b;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            char cCharAt = str.charAt(i2);
                            char cCharAt2 = str2.charAt(i2);
                            if (cCharAt == cCharAt2 || ((cCharAt & 65534) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f7871f;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((this.f7868c.hashCode() + 4867) * 31) + this.f7869d;
        this.f7871f = iHashCode;
        return iHashCode;
    }
}
