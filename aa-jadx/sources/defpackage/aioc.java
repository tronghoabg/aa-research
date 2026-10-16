package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aioc extends defpackage.afbn {
    private int index = -1;
    final /* synthetic */ defpackage.aiod this$0;

    public aioc(defpackage.aiod aiodVar) {
        this.this$0 = aiodVar;
    }

    @Override // defpackage.afbn
    protected void computeNext() {
        do {
            int i = this.index + 1;
            this.index = i;
            if (i >= this.this$0.data.length) {
                break;
            }
        } while (this.this$0.data[this.index] == null);
        if (this.index >= this.this$0.data.length) {
            done();
            return;
        }
        java.lang.Object obj = this.this$0.data[this.index];
        obj.getClass();
        setNext(obj);
    }
}
