package defpackage;

/* loaded from: classes3.dex */
public final class ainc extends afan {
    private int index = -1;
    final /* synthetic */ aind this$0;

    public ainc(aind aindVar) {
        this.this$0 = aindVar;
    }

    @Override // defpackage.afan
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
        Object obj = this.this$0.data[this.index];
        obj.getClass();
        setNext(obj);
    }
}
