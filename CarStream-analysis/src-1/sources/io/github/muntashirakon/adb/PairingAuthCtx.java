package io.github.muntashirakon.adb;

import defpackage.a4;
import defpackage.b4;
import defpackage.f4;
import defpackage.h1;
import defpackage.m9;
import defpackage.u4;
import defpackage.v4;
import defpackage.w1;
import io.github.muntashirakon.crypto.spake2.Spake2Context;
import io.github.muntashirakon.crypto.spake2.Spake2Role;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.security.auth.Destroyable;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
class PairingAuthCtx implements Destroyable {
    public static final int GCM_IV_LENGTH = 12;
    private static final int HKDF_KEY_LENGTH = 16;
    private final byte[] mMsg;
    private final Spake2Context mSpake2Ctx;
    private static final byte[] CLIENT_NAME = StringCompat.getBytes("adb pair client\u0000", "UTF-8");
    private static final byte[] SERVER_NAME = StringCompat.getBytes("adb pair server\u0000", "UTF-8");
    private static final byte[] INFO = StringCompat.getBytes("adb pairing_auth aes-128-gcm key", "UTF-8");
    private final byte[] mSecretKey = new byte[16];
    private long mDecIv = 0;
    private long mEncIv = 0;
    private boolean mIsDestroyed = false;

    private PairingAuthCtx(Spake2Context spake2Context, byte[] bArr) {
        this.mSpake2Ctx = spake2Context;
        this.mMsg = spake2Context.generateMessage(bArr);
    }

    public static PairingAuthCtx createAlice(byte[] bArr) {
        try {
            return new PairingAuthCtx(new Spake2Context(Spake2Role.Alice, CLIENT_NAME, SERVER_NAME), bArr);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return null;
        }
    }

    public static PairingAuthCtx createBob(byte[] bArr) {
        try {
            return new PairingAuthCtx(new Spake2Context(Spake2Role.Bob, SERVER_NAME, CLIENT_NAME), bArr);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] encryptDecrypt(boolean r28, byte[] r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.muntashirakon.adb.PairingAuthCtx.encryptDecrypt(boolean, byte[], byte[]):byte[]");
    }

    public byte[] decrypt(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        long j = this.mDecIv;
        this.mDecIv = 1 + j;
        return encryptDecrypt(false, bArr, byteBufferOrder.putLong(j).array());
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.mIsDestroyed = true;
        Arrays.fill(this.mSecretKey, (byte) 0);
        this.mSpake2Ctx.destroy();
    }

    public byte[] encrypt(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        long j = this.mEncIv;
        this.mEncIv = 1 + j;
        return encryptDecrypt(true, bArr, byteBufferOrder.putLong(j).array());
    }

    public byte[] getMsg() {
        return this.mMsg;
    }

    public boolean initCipher(byte[] bArr) {
        byte[] bArrProcessMessage;
        if (this.mIsDestroyed || (bArrProcessMessage = this.mSpake2Ctx.processMessage(bArr)) == null) {
            return false;
        }
        m9 m9Var = new m9();
        m9Var.l = new int[64];
        ((a4) b4.a.get()).getClass();
        m9Var.i();
        u4 u4Var = new u4();
        v4 v4Var = new v4();
        v4Var.a = m9Var;
        v4Var.b = 64;
        v4Var.e = new byte[64];
        v4Var.f = new byte[96];
        u4Var.a = v4Var;
        u4Var.b = 32;
        byte[] bArr2 = INFO;
        byte[] bArrG = w1.g(bArrProcessMessage);
        byte[] bArrG2 = bArr2 == null ? new byte[0] : w1.g(bArr2);
        byte[] bArrG3 = w1.g(bArrG);
        v4Var.b(new h1(new byte[32]));
        m9Var.k(bArrG3, 0, bArrG3.length);
        byte[] bArr3 = new byte[32];
        v4Var.a(bArr3);
        v4Var.b(new h1(bArr3));
        u4Var.c = w1.g(bArrG2);
        u4Var.e = 0;
        u4Var.d = new byte[32];
        byte[] bArr4 = this.mSecretKey;
        int length = bArr4.length;
        if (length > 8160) {
            throw new f4("HKDF may only be used for 255 * HashLen bytes of output");
        }
        u4Var.a();
        int i = u4Var.e % 32;
        int iMin = Math.min(32 - i, length);
        System.arraycopy(u4Var.d, i, bArr4, 0, iMin);
        u4Var.e += iMin;
        int i2 = length - iMin;
        while (i2 > 0) {
            u4Var.a();
            int iMin2 = Math.min(32, i2);
            System.arraycopy(u4Var.d, 0, bArr4, iMin, iMin2);
            u4Var.e += iMin2;
            i2 -= iMin2;
            iMin += iMin2;
        }
        return true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }
}
