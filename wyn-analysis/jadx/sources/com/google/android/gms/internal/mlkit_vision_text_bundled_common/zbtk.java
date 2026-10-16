package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zbtk extends zbst {
    private static final Logger zbb = Logger.getLogger(zbtk.class.getName());
    private static final boolean zbc = zbws.zbx();
    zbtl zba;

    private zbtk() {
        throw null;
    }

    public static int zbA(zbvm zbvmVar) {
        int iZbo = zbvmVar.zbo();
        return zbD(iZbo) + iZbo;
    }

    public static int zbB(zbvm zbvmVar, zbvx zbvxVar) {
        int iZbj = ((zbsj) zbvmVar).zbj(zbvxVar);
        return zbD(iZbj) + iZbj;
    }

    public static int zbC(String str) {
        int length;
        try {
            length = zbwv.zbc(str);
        } catch (zbwu unused) {
            length = str.getBytes(zbuo.zba).length;
        }
        return zbD(length) + length;
    }

    public static int zbD(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public static int zbE(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    @Deprecated
    public static int zbz(int i5, zbvm zbvmVar, zbvx zbvxVar) {
        int iZbD = zbD(i5 << 3);
        return ((zbsj) zbvmVar).zbj(zbvxVar) + iZbD + iZbD;
    }

    public final void zbF() {
        if (zba() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zbG(String str, zbwu zbwuVar) throws IOException {
        zbb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zbwuVar);
        byte[] bytes = str.getBytes(zbuo.zba);
        try {
            int length = bytes.length;
            zbw(length);
            zbn(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zbti(e7);
        }
    }

    public abstract int zba();

    public abstract void zbb(byte b5) throws IOException;

    public abstract void zbd(int i5, boolean z2) throws IOException;

    public abstract void zbe(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void zbf(int i5, zbtc zbtcVar) throws IOException;

    public abstract void zbg(zbtc zbtcVar) throws IOException;

    public abstract void zbh(int i5, int i10) throws IOException;

    public abstract void zbi(int i5) throws IOException;

    public abstract void zbj(int i5, long j8) throws IOException;

    public abstract void zbk(long j8) throws IOException;

    public abstract void zbl(int i5, int i10) throws IOException;

    public abstract void zbm(int i5) throws IOException;

    public abstract void zbn(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void zbo(int i5, zbvm zbvmVar, zbvx zbvxVar) throws IOException;

    public abstract void zbp(zbvm zbvmVar) throws IOException;

    public abstract void zbq(int i5, zbvm zbvmVar) throws IOException;

    public abstract void zbr(int i5, zbtc zbtcVar) throws IOException;

    public abstract void zbs(int i5, String str) throws IOException;

    public abstract void zbt(String str) throws IOException;

    public abstract void zbu(int i5, int i10) throws IOException;

    public abstract void zbv(int i5, int i10) throws IOException;

    public abstract void zbw(int i5) throws IOException;

    public abstract void zbx(int i5, long j8) throws IOException;

    public abstract void zby(long j8) throws IOException;

    public /* synthetic */ zbtk(zbtj zbtjVar) {
    }
}
