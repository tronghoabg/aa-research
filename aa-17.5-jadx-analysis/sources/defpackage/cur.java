package defpackage;

/* loaded from: classes.dex */
final class cur implements cuq {
    private final cvh a;
    private final csm b;
    private final cvh c;
    private final csm d;
    private final /* synthetic */ int e;
    private final Object f;

    public cur(cuq[] cuqVarArr, int i) {
        this.e = i;
        this.f = cuqVarArr;
        int length = cuqVarArr.length;
        cvh[] cvhVarArr = new cvh[length];
        for (int i2 = 0; i2 < length; i2++) {
            cvhVarArr[i2] = ((cuq[]) this.f)[i2].c();
        }
        this.a = new cvh(new cuz(cvhVarArr, 5));
        int length2 = ((cuq[]) this.f).length;
        csm[] csmVarArr = new csm[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            csmVarArr[i3] = ((cuq[]) this.f)[i3].b();
        }
        this.b = new csm(new cuz(csmVarArr, 1));
        int length3 = ((cuq[]) this.f).length;
        cvh[] cvhVarArr2 = new cvh[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            cvhVarArr2[i4] = ((cuq[]) this.f)[i4].d();
        }
        this.c = new cvh(new cuz(cvhVarArr2, 4));
        int length4 = ((cuq[]) this.f).length;
        csm[] csmVarArr2 = new csm[length4];
        for (int i5 = 0; i5 < length4; i5++) {
            csmVarArr2[i5] = ((cuq[]) this.f)[i5].a();
        }
        this.d = new csm(new alx(csmVarArr2, 20));
    }

    @Override // defpackage.cuq
    public final csm a() {
        return this.d;
    }

    @Override // defpackage.cuq
    public final csm b() {
        return this.b;
    }

    @Override // defpackage.cuq
    public final cvh c() {
        return this.a;
    }

    @Override // defpackage.cuq
    public final cvh d() {
        return this.c;
    }

    public final String toString() {
        int i = this.e;
        Object obj = this.f;
        if (i != 0) {
            return woy.dy((Object[]) obj, null, "innermostOf(", ")", null, 57);
        }
        return "RectRulers(" + ((String) obj) + ")";
    }

    public cur(String str, int i) {
        this.e = i;
        this.f = str;
        this.a = new cvh(null);
        this.b = new csm(null);
        this.c = new cvh(null);
        this.d = new csm(null);
    }
}
