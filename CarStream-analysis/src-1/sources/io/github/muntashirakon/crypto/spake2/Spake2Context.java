package io.github.muntashirakon.crypto.spake2;

import javax.security.auth.Destroyable;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class Spake2Context implements Destroyable {
    public static final int MAX_KEY_SIZE = 64;
    public static final int MAX_MSG_SIZE = 32;
    private final long mCtx;
    private boolean mDisablePasswordScalarHack;
    private boolean mIsDestroyed;
    private final byte[] mMyMsg = new byte[32];

    static {
        System.loadLibrary("spake2");
    }

    public Spake2Context(Spake2Role spake2Role, byte[] bArr, byte[] bArr2) {
        long jAllocNewContext = allocNewContext(spake2Role.ordinal(), bArr, bArr2);
        this.mCtx = jAllocNewContext;
        if (jAllocNewContext == 0) {
            throw new UnsupportedOperationException("Could not allocate native context");
        }
    }

    private static native long allocNewContext(int i, byte[] bArr, byte[] bArr2);

    private static native void destroy(long j);

    private static native byte[] generateMessage(long j, byte[] bArr);

    private static native byte[] processMessage(long j, byte[] bArr);

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.mIsDestroyed = true;
        destroy(this.mCtx);
    }

    public byte[] generateMessage(byte[] bArr) {
        if (this.mIsDestroyed) {
            throw new IllegalStateException("The context was destroyed.");
        }
        byte[] bArrGenerateMessage = generateMessage(this.mCtx, bArr);
        if (bArrGenerateMessage == null) {
            throw new IllegalStateException("Generated empty message");
        }
        System.arraycopy(bArrGenerateMessage, 0, this.mMyMsg, 0, 32);
        return bArrGenerateMessage;
    }

    public byte[] getMyMsg() {
        return this.mMyMsg;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    public boolean isDisablePasswordScalarHack() {
        return this.mDisablePasswordScalarHack;
    }

    public byte[] processMessage(byte[] bArr) {
        if (this.mIsDestroyed) {
            throw new IllegalStateException("The context was destroyed.");
        }
        byte[] bArrProcessMessage = processMessage(this.mCtx, bArr);
        if (bArrProcessMessage != null) {
            return bArrProcessMessage;
        }
        throw new IllegalStateException("No key was returned");
    }

    public void setDisablePasswordScalarHack(boolean z) {
        this.mDisablePasswordScalarHack = z;
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
