package defpackage;

/* loaded from: classes2.dex */
public final class pzg implements pzl {
    public static final Long a = 101L;
    public static final Long b = 999999999L;
    private final xxh c;
    private final pzk d;
    private final Long e;

    public pzg(xxh xxhVar, pzk pzkVar, Long l) {
        this.c = xxhVar;
        this.d = pzkVar;
        this.e = l;
    }

    @Override // defpackage.pzl
    public final long a() {
        return this.e.longValue();
    }

    @Override // defpackage.pzl
    public final pzk b() {
        return this.d;
    }

    @Override // defpackage.pzl
    public final xxh c() {
        return this.c;
    }

    @Override // defpackage.pzl
    public final String d() {
        return this.d.toString();
    }

    @Override // defpackage.pzl
    public final void e() {
    }
}
