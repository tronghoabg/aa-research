package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class jnc implements jnd {
    private final /* synthetic */ int c;
    public static final jnc b = new jnc(1);
    public static final jnc a = new jnc(0);

    private jnc(int i) {
        this.c = i;
    }

    @Override // defpackage.jnd
    public final /* synthetic */ jcn a(int i, jcn jcnVar, boolean z) {
        if (this.c != 0) {
            return jcnVar;
        }
        throw new IllegalStateException("HerosimGalMunger is stopped");
    }

    @Override // defpackage.jnd
    public final /* synthetic */ ByteBuffer c(ByteBuffer byteBuffer) {
        if (this.c != 0) {
            return byteBuffer;
        }
        throw new IllegalStateException("HerosimGalMunger is stopped");
    }

    @Override // defpackage.jnd
    public final /* synthetic */ void b() {
    }
}
