package defpackage;

/* loaded from: classes2.dex */
public final class hxi implements hxc {
    private final /* synthetic */ int a;

    public hxi(int i) {
        this.a = i;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ int a(Object obj) {
        return this.a != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // defpackage.hxc
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }

    @Override // defpackage.hxc
    public final String d() {
        return this.a != 0 ? "ByteArrayPool" : "IntegerArrayPool";
    }
}
