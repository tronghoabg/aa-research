package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class aebm implements aeah {
    private final /* synthetic */ int a;

    public aebm(int i) {
        this.a = i;
    }

    @Override // defpackage.aeah
    public final aeag a(int i) {
        if (this.a != 0) {
            return new adre(ByteBuffer.allocateDirect(Math.min(1048576, i)));
        }
        return new aebl(new ajmy(), Math.min(1048576, ((i + 8191) / 8192) * 8192));
    }
}
