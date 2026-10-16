package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ef extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: a, reason: collision with root package name */
    private final ee f47413a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f47414b;

    public ef(ee eeVar, cm cmVar) {
        super(ee.h(eeVar), eeVar.j());
        this.f47413a = eeVar;
        this.f47414b = cmVar;
    }

    public final cm a() {
        return this.f47414b;
    }

    public final ee b() {
        return this.f47413a;
    }

    public ef(ee eeVar) {
        this(eeVar, null);
    }
}
