package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afhr extends defpackage.afhs implements java.io.Serializable {
    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return afhq.a;
    }

    @Override // defpackage.afhs
    public final int c(int i) {
        return defpackage.afhs.b.c(i);
    }

    @Override // defpackage.afhs
    public final long d() {
        return defpackage.afhs.b.d();
    }

    @Override // defpackage.afhs
    public final long gH() {
        return defpackage.afhs.b.gH();
    }
}
