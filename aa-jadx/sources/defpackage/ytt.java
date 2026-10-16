package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ytt extends defpackage.ytq {
    @Override // defpackage.ytq, defpackage.yua
    public final defpackage.ytz b(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(length + length).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            byteBufferOrder.putChar(charSequence.charAt(i));
        }
        return a(byteBufferOrder.array());
    }

    @Override // defpackage.ytq, defpackage.yua
    public final defpackage.yub c(int i) {
        defpackage.ysr.aX(i >= 0);
        return new defpackage.yts(this, i);
    }

    @Override // defpackage.yua
    public final defpackage.yub e() {
        return c(32);
    }
}
