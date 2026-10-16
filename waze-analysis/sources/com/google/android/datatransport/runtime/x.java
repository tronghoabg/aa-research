package com.google.android.datatransport.runtime;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f4367a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4368b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.c f4369c;

    /* synthetic */ x(String str, byte[] bArr, com.google.android.datatransport.c cVar) {
        this.f4367a = str;
        this.f4368b = bArr;
        this.f4369c = cVar;
    }

    public static w a() {
        w wVar = new w();
        wVar.d(com.google.android.datatransport.c.f3905a);
        return wVar;
    }

    public final x b(com.google.android.datatransport.c cVar) {
        w wVarA = a();
        wVarA.b(this.f4367a);
        wVarA.d(cVar);
        wVarA.c(this.f4368b);
        return wVarA.a();
    }

    public final boolean c() {
        return this.f4368b != null;
    }

    public final com.google.android.datatransport.c d() {
        return this.f4369c;
    }

    public final String e() {
        return this.f4367a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f4367a.equals(xVar.f4367a)) {
                if (Arrays.equals(this.f4368b, xVar instanceof x ? xVar.f4368b : xVar.f4368b) && this.f4369c.equals(xVar.f4369c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.f4368b;
    }

    public final int hashCode() {
        int iHashCode = ((this.f4367a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4368b);
        return this.f4369c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String str = this.f4367a;
        com.google.android.datatransport.c cVar = this.f4369c;
        byte[] bArr = this.f4368b;
        return String.format("TransportContext(%s, %s, %s)", str, cVar, bArr == null ? "" : Base64.encodeToString(bArr, 2));
    }

    public x() {
        throw null;
    }
}
