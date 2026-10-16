package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aecm implements defpackage.aebh {
    private final /* synthetic */ int a;

    public aecm(int i) {
        this.a = i;
    }

    @Override // defpackage.aebh
    public final defpackage.aebg a(int i) {
        if (this.a != 0) {
            return new defpackage.adse(java.nio.ByteBuffer.allocateDirect(java.lang.Math.min(1048576, i)));
        }
        return new defpackage.aecl(new defpackage.ajny(), java.lang.Math.min(1048576, ((i + 8191) / 8192) * 8192));
    }
}
