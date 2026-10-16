package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class yhc<K, V> extends defpackage.yhe<K, V> {
    private transient defpackage.yhx a;
    private transient defpackage.yhx c;
    private transient defpackage.ygm d;

    public defpackage.yhx d() {
        return new defpackage.yhi(this);
    }

    public abstract defpackage.yot e();

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: f */
    public final defpackage.yhx entrySet() {
        defpackage.yhx yhxVar = this.a;
        if (yhxVar != null) {
            return yhxVar;
        }
        defpackage.yhb yhbVar = new defpackage.yhb(this);
        this.a = yhbVar;
        return yhbVar;
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: g */
    public final defpackage.yhx keySet() {
        defpackage.yhx yhxVar = this.c;
        if (yhxVar != null) {
            return yhxVar;
        }
        defpackage.yhx yhxVarD = d();
        this.c = yhxVarD;
        return yhxVarD;
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: gc */
    public final defpackage.ygm values() {
        defpackage.ygm ygmVar = this.d;
        if (ygmVar != null) {
            return ygmVar;
        }
        defpackage.yhm yhmVar = new defpackage.yhm(this);
        this.d = yhmVar;
        return yhmVar;
    }

    @Override // defpackage.yhe
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
