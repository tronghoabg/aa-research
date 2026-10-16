package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jqj implements java.lang.Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ java.util.Map c;
    final /* synthetic */ android.os.ParcelFileDescriptor d;
    final /* synthetic */ defpackage.rxf e;
    final /* synthetic */ defpackage.jqk f;

    public jqj(defpackage.jqk jqkVar, long j, java.util.List list, java.util.Map map, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        this.a = j;
        this.b = list;
        this.c = map;
        this.d = parcelFileDescriptor;
        this.e = rxfVar;
        this.f = jqkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.e.a(this.a, this.b, this.c, this.d, this.e);
    }
}
