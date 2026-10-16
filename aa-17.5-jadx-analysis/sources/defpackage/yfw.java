package defpackage;

/* loaded from: classes.dex */
abstract class yfw<K, V> extends yfy<K, V> {
    private transient ygr a;
    private transient ygr c;
    private transient yfg d;

    public ygr d() {
        return new ygc(this);
    }

    public abstract yno e();

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: f */
    public final ygr entrySet() {
        ygr ygrVar = this.a;
        if (ygrVar != null) {
            return ygrVar;
        }
        yfv yfvVar = new yfv(this);
        this.a = yfvVar;
        return yfvVar;
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: g */
    public final ygr keySet() {
        ygr ygrVar = this.c;
        if (ygrVar != null) {
            return ygrVar;
        }
        ygr ygrVarD = d();
        this.c = ygrVarD;
        return ygrVarD;
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: gR */
    public final yfg values() {
        yfg yfgVar = this.d;
        if (yfgVar != null) {
            return yfgVar;
        }
        ygg yggVar = new ygg(this);
        this.d = yggVar;
        return yggVar;
    }

    @Override // defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
