package com.google.android.datatransport.cct.a;

import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends ac {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4053a;

    /* renamed from: b, reason: collision with root package name */
    private final List f4054b;

    /* synthetic */ r(byte[] bArr, List list) {
        this.f4053a = bArr;
        this.f4054b = list;
    }

    @Override // com.google.android.datatransport.cct.a.ac
    public final List a() {
        return this.f4054b;
    }

    @Override // com.google.android.datatransport.cct.a.ac
    public final byte[] b() {
        return this.f4053a;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            if (Arrays.equals(this.f4053a, acVar instanceof r ? ((r) acVar).f4053a : acVar.b()) && ((list = this.f4054b) != null ? list.equals(acVar.a()) : acVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f4053a) ^ 1000003;
        List list = this.f4054b;
        return (list == null ? 0 : list.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        List list = this.f4054b;
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f4053a) + ", encryptedBlob=" + String.valueOf(list) + "}";
    }
}
