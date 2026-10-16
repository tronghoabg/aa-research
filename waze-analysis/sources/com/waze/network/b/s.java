package com.waze.network.b;

import com.waze.ResultStruct;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f32095a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(byte[] bArr) {
        super(null, null);
        int i2 = ResultStruct.MIN_NETWORK_ERROR_CODE;
        h.g.b.x.f("error sending request", "message");
        this.f32095a = i2;
        this.f32096b = "error sending request";
    }

    public final int a() {
        return this.f32095a;
    }

    public final String b() {
        return this.f32096b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f32095a == sVar.f32095a && h.g.b.x.n(this.f32096b, sVar.f32096b);
    }

    public final int hashCode() {
        return (this.f32095a * 31) + this.f32096b.hashCode();
    }

    public final String toString() {
        return "Other(errorCode=" + this.f32095a + ", message=" + this.f32096b + ")";
    }

    public s() {
        this(null);
    }
}
