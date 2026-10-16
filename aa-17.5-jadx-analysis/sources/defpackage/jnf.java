package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class jnf {
    public static final yph a = yph.c("GH.HeroSim");

    public static final izm a(int i, short s, abow abowVar, boolean z) {
        return new izm(i, new jcn(b(abowVar, s), null, false), true, z, new izn(true, false, 0));
    }

    public static final ByteBuffer b(abow abowVar, short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(abowVar.m() + 2);
        byteBufferAllocate.getClass();
        byteBufferAllocate.putShort(s);
        abnd abndVarH = abnd.H(byteBufferAllocate);
        try {
            abowVar.R(abndVarH);
            abndVarH.c();
            byteBufferAllocate.position(0);
            return byteBufferAllocate;
        } catch (IOException e) {
            throw new AssertionError("Serializing " + abowVar.getClass().getName() + " threw an IOException (should never happen)", e);
        }
    }
}
