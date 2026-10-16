package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ytc extends defpackage.ytb {
    public static final java.util.Map c;
    private final defpackage.yqp d;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.yqp.class);
        for (defpackage.yqp yqpVar : defpackage.yqp.values()) {
            defpackage.ytc[] ytcVarArr = new defpackage.ytc[10];
            for (int i = 0; i < 10; i++) {
                ytcVarArr[i] = new defpackage.ytc(i, yqpVar, defpackage.yqq.a);
            }
            enumMap.put(yqpVar, ytcVarArr);
        }
        c = j$.util.DesugarCollections.unmodifiableMap(enumMap);
    }

    public ytc(int i, defpackage.yqp yqpVar, defpackage.yqq yqqVar) {
        super(yqqVar, i);
        yqpVar.getClass();
        this.d = yqpVar;
        if (yqqVar.c()) {
            return;
        }
        int i2 = yqpVar.l;
        i2 = yqqVar.d() ? i2 & 65503 : i2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        yqqVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.ytb
    public final void a(defpackage.ytf ytfVar, java.lang.Object obj) {
        ytfVar.d(obj, this.d, this.b);
    }
}
