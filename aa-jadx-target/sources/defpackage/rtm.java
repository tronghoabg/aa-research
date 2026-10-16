package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rtm {
    public final android.util.SparseArray a;
    final /* synthetic */ com.google.android.gms.car.senderprotocol.Channel b;

    public rtm(com.google.android.gms.car.senderprotocol.Channel channel) {
        this.b = channel;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.a = sparseArray;
        sparseArray.put(8, new defpackage.rtl(this, 1));
        sparseArray.put(9, new defpackage.rtl(this, 0));
    }
}
