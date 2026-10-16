package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements java.util.function.BiConsumer, java.util.function.Supplier {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.util.function.Function function = (java.util.function.Function) this.a;
        java.util.function.Function function2 = (java.util.function.Function) this.b;
        java.util.function.BinaryOperator binaryOperator = (java.util.function.BinaryOperator) this.c;
        java.util.Set set = j$.util.stream.Collectors.a;
        j$.util.Map.EL.merge((java.util.Map) obj, function.apply(obj2), function2.apply(obj2), binaryOperator);
    }

    public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.a;
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) this.b;
        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) this.c;
        java.util.Set set = j$.util.stream.Collectors.a;
        return new j$.util.StringJoiner(charSequence, charSequence2, charSequence3);
    }
}
