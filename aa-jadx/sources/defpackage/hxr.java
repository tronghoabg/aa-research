package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxr implements defpackage.hxl {
    private final /* synthetic */ int a;

    public hxr(int i) {
        this.a = i;
    }

    @Override // defpackage.hxl
    public final /* synthetic */ int a(java.lang.Object obj) {
        return this.a != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // defpackage.hxl
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.hxl
    public final /* synthetic */ java.lang.Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }

    @Override // defpackage.hxl
    public final java.lang.String d() {
        return this.a != 0 ? "ByteArrayPool" : "IntegerArrayPool";
    }
}
