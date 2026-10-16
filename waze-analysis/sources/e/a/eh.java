package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eh extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: a, reason: collision with root package name */
    private final ee f47417a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f47418b;

    public eh(ee eeVar, cm cmVar) {
        super(ee.h(eeVar), eeVar.j());
        this.f47417a = eeVar;
        this.f47418b = cmVar;
    }

    public final cm a() {
        return this.f47418b;
    }

    public final ee b() {
        return this.f47417a;
    }

    public eh(ee eeVar) {
        this(eeVar, null);
    }
}
