package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class abmz {
    public final int a;
    public final Object b;

    public abmz(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        this.a = byteBuffer.position();
    }

    public abmz(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public abmz(int i, bag bagVar) {
        this.a = i;
        this.b = bagVar;
    }
}
