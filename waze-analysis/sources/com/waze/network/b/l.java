package com.waze.network.b;

import com.waze.ResultStruct;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32075b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32076c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str) {
        super(null);
        int i2 = ResultStruct.MIN_NETWORK_ERROR_CODE;
        this.f32075b = i2;
        this.f32076c = str;
        this.f32077d = null;
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return this.f32075b;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32076c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f32075b != lVar.f32075b || !h.g.b.x.n(this.f32076c, lVar.f32076c)) {
            return false;
        }
        String str = lVar.f32077d;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        String str = this.f32076c;
        return ((this.f32075b * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "Other(errorCode=" + this.f32075b + ", errorMessage=" + this.f32076c + ", searchPattern=null)";
    }
}
