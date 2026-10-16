package e.a.f.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String[] f47542a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f47543b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47544c;

    public b(c cVar) {
        boolean z = cVar.f47557b;
        this.f47542a = cVar.f47559e;
        this.f47543b = cVar.f47560f;
        this.f47544c = cVar.f47558c;
    }

    public final c a() {
        return new c(this, null);
    }

    public final void e(a... aVarArr) {
        String[] strArr = new String[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            strArr[i2] = aVarArr[i2].bb;
        }
        this.f47542a = strArr;
    }

    public final void f(String... strArr) throws CloneNotSupportedException {
        this.f47542a = strArr == null ? null : (String[]) strArr.clone();
    }

    public final void g() {
        this.f47544c = true;
    }

    public final void h(n... nVarArr) {
        String[] strArr = new String[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            strArr[i2] = nVarArr[i2].f47603f;
        }
        this.f47543b = strArr;
    }

    public final void i(String... strArr) throws CloneNotSupportedException {
        this.f47543b = strArr == null ? null : (String[]) strArr.clone();
    }
}
