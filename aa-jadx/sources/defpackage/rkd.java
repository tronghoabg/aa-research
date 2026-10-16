package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rkd implements defpackage.sme {
    public final com.google.android.gms.common.api.Status a;
    public final java.lang.Object b;
    private final /* synthetic */ int c;

    public rkd(com.google.android.gms.common.api.Status status, java.io.InputStream inputStream, int i) {
        this.c = i;
        this.a = status;
        this.b = inputStream;
    }

    @Override // defpackage.sme
    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    public rkd(com.google.android.gms.common.api.Status status, java.util.List list, int i) {
        this.c = i;
        this.a = status;
        this.b = list;
    }
}
