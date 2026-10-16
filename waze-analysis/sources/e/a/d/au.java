package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.ac f46625a;

    protected au(e.a.ac acVar) {
        this.f46625a = acVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        e.a.ac acVarA = this.f46625a.a();
        try {
            a();
        } finally {
            this.f46625a.b(acVarA);
        }
    }
}
