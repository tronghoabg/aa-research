package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends j$.util.stream.o2 {
    public final /* synthetic */ byte b;
    public java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j$.util.stream.z2 z2Var, java.lang.Object obj, byte b) {
        super(z2Var);
        this.b = b;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                if (!((java.util.HashSet) this.c).contains(obj)) {
                    ((java.util.HashSet) this.c).add(obj);
                    ((j$.util.stream.z2) this.a).accept(obj);
                }
                break;
            case 1:
                ((java.util.function.Consumer) this.c).accept(obj);
                ((j$.util.stream.z2) this.a).accept(obj);
                break;
            case 2:
                if (((java.util.function.Predicate) this.c).test(obj)) {
                    ((j$.util.stream.z2) this.a).accept(obj);
                }
                break;
            case 3:
                ((j$.util.stream.z2) this.a).accept(((java.util.function.Function) this.c).apply(obj));
                break;
            case 4:
                ((j$.util.stream.z2) this.a).accept(((java.util.function.ToIntFunction) this.c).applyAsInt(obj));
                break;
            default:
                ((j$.util.stream.z2) this.a).accept(((java.util.function.ToLongFunction) this.c).applyAsLong(obj));
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                ((j$.util.stream.z2) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public void p(long j) {
        switch (this.b) {
            case 0:
                this.c = new java.util.HashSet();
                ((j$.util.stream.z2) this.a).p(-1L);
                break;
            case 1:
            default:
                super.p(j);
                break;
            case 2:
                ((j$.util.stream.z2) this.a).p(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j$.util.stream.z2 z2Var) {
        super(z2Var);
        this.b = (byte) 0;
    }
}
