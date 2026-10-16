package com.google.firebase.crashlytics.a.e;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag extends bh {

    /* renamed from: a, reason: collision with root package name */
    private final String f9318a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9319b;

    /* synthetic */ ag(String str, byte[] bArr) {
        this.f9318a = str;
        this.f9319b = bArr;
    }

    @Override // com.google.firebase.crashlytics.a.e.bh
    public final String a() {
        return this.f9318a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bh
    public final byte[] b() {
        return this.f9319b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bh) {
            bh bhVar = (bh) obj;
            if (this.f9318a.equals(bhVar.a())) {
                if (Arrays.equals(this.f9319b, bhVar instanceof ag ? ((ag) bhVar).f9319b : bhVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9318a.hashCode() ^ 1000003;
        return Arrays.hashCode(this.f9319b) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f9318a + ", contents=" + Arrays.toString(this.f9319b) + "}";
    }
}
