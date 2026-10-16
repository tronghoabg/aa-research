package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ydl implements java.util.function.BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ ydl(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 2) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 3) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            odn odnVar = (odn) obj;
            java.util.Iterator it = ((odn) obj2).a.iterator();
            while (it.hasNext()) {
                odnVar.n((ymu) it.next());
            }
            return odnVar;
        }
        if (i == 1) {
            defpackage.yhx yhxVar = (defpackage.yhx) obj;
            defpackage.yhx yhxVar2 = (defpackage.yhx) obj2;
            defpackage.yqm yqmVar = defpackage.tht.a;
            yhxVar.getClass();
            yhxVar2.getClass();
            return new defpackage.ynm(yhxVar, yhxVar2).f();
        }
        if (i == 2) {
            defpackage.ygr ygrVar = (defpackage.ygr) obj;
            defpackage.ygr ygrVar2 = (defpackage.ygr) obj2;
            ygrVar.a(ygrVar2.a, ygrVar2.b);
            return ygrVar;
        }
        if (i == 3) {
            defpackage.yhv yhvVar = (defpackage.yhv) obj;
            yhvVar.l((defpackage.yhv) obj2);
            return yhvVar;
        }
        if (i == 4) {
            defpackage.ydr ydrVar = (defpackage.ydr) obj;
            defpackage.ydr ydrVar2 = (defpackage.ydr) obj2;
            if (ydrVar.a == null) {
                return ydrVar2;
            }
            java.util.EnumMap enumMap = ydrVar2.a;
            if (enumMap != null) {
                j$.util.Map.-EL.forEach(enumMap, new pdt(ydrVar, 2));
            }
            return ydrVar;
        }
        if (i == 5) {
            defpackage.yha yhaVar = (defpackage.yha) obj;
            yhaVar.e((defpackage.yha) obj2);
            return yhaVar;
        }
        j$.util.stream.Collector collector = defpackage.yds.a;
        throw new java.lang.IllegalArgumentException("Multiple values for key: " + java.lang.String.valueOf(obj) + ", " + java.lang.String.valueOf(obj2));
    }
}
