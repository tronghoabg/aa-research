package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class etf extends android.os.Handler {
    final /* synthetic */ defpackage.eth a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etf(defpackage.eth ethVar, android.os.Looper looper) {
        super(looper);
        this.a = ethVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int size;
        defpackage.tc[] tcVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        defpackage.eth ethVar = this.a;
        while (true) {
            synchronized (ethVar.b) {
                java.util.ArrayList arrayList = ethVar.c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                tcVarArr = new defpackage.tc[size];
                arrayList.toArray(tcVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                defpackage.tc tcVar = tcVarArr[i];
                java.util.ArrayList arrayList2 = (java.util.ArrayList) tcVar.b;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.etg etgVar = (defpackage.etg) arrayList2.get(i2);
                    if (!etgVar.d) {
                        etgVar.b.onReceive(ethVar.a, (android.content.Intent) tcVar.a);
                    }
                }
            }
        }
    }
}
