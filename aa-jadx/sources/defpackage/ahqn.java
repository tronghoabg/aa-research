package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqn implements defpackage.ahoy {
    private defpackage.ahoy bytes;
    int bytesRemaining;
    private final defpackage.ahqm pieces;
    final /* synthetic */ defpackage.ahqp this$0;

    /* JADX WARN: Type inference failed for: r0v2, types: [ahoy] */
    private ahqn(defpackage.ahqp ahqpVar) {
        this.this$0 = ahqpVar;
        defpackage.ahqm ahqmVar = new defpackage.ahqm(ahqpVar);
        this.pieces = ahqmVar;
        this.bytes = ahqmVar.next().iterator2();
        this.bytesRemaining = ahqpVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.bytesRemaining > 0;
    }

    @Override // java.util.Iterator
    public java.lang.Byte next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ahoy] */
    @Override // defpackage.ahoy
    public byte nextByte() {
        if (!this.bytes.hasNext()) {
            this.bytes = this.pieces.next().iterator2();
        }
        this.bytesRemaining--;
        return this.bytes.nextByte();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
