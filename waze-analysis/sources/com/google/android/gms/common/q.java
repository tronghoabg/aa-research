package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.aq;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class q extends ap {

    /* renamed from: a, reason: collision with root package name */
    private final int f5120a;

    protected q(byte[] bArr) {
        av.c(bArr.length == 25);
        this.f5120a = Arrays.hashCode(bArr);
    }

    protected static byte[] d(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    @Override // com.google.android.gms.common.internal.aq
    public final int b() {
        return this.f5120a;
    }

    @Override // com.google.android.gms.common.internal.aq
    public final com.google.android.gms.g.c c() {
        return com.google.android.gms.g.b.b(e());
    }

    abstract byte[] e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof aq)) {
            return false;
        }
        try {
            aq aqVar = (aq) obj;
            if (aqVar.b() != this.f5120a) {
                return false;
            }
            return Arrays.equals(e(), (byte[]) com.google.android.gms.g.b.c(aqVar.c()));
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return false;
        }
    }

    public final int hashCode() {
        return this.f5120a;
    }
}
