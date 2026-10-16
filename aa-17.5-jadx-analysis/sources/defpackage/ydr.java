package defpackage;

/* loaded from: classes3.dex */
abstract class ydr<K, V> extends yfw<K, V> {
    private final int a;

    public ydr(int i) {
        this.a = i;
    }

    public abstract yfy a();

    public abstract Object b(int i);

    @Override // defpackage.yfw
    public final ygr d() {
        return this.a == ((ylx) a()).d ? a().keySet() : new ygc(this);
    }

    @Override // defpackage.yfw
    public final yno e() {
        return new ydq(this);
    }

    @Override // defpackage.yfy, java.util.Map
    public final V get(Object obj) {
        Integer num = (Integer) a().get(obj);
        if (num == null) {
            return null;
        }
        return (V) b(num.intValue());
    }

    @Override // java.util.Map
    public final int size() {
        return this.a;
    }

    @Override // defpackage.yfw, defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
