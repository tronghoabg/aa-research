package defpackage;

/* loaded from: classes3.dex */
final class ahpn implements ahny {
    private ahny bytes;
    int bytesRemaining;
    private final ahpm pieces;
    final /* synthetic */ ahpp this$0;

    /* JADX WARN: Type inference failed for: r0v2, types: [ahny] */
    private ahpn(ahpp ahppVar) {
        this.this$0 = ahppVar;
        ahpm ahpmVar = new ahpm(ahppVar);
        this.pieces = ahpmVar;
        this.bytes = ahpmVar.next().iterator2();
        this.bytesRemaining = ahppVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.bytesRemaining > 0;
    }

    @Override // java.util.Iterator
    public Byte next() {
        return Byte.valueOf(nextByte());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ahny] */
    @Override // defpackage.ahny
    public byte nextByte() {
        if (!this.bytes.hasNext()) {
            this.bytes = this.pieces.next().iterator2();
        }
        this.bytesRemaining--;
        return this.bytes.nextByte();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
