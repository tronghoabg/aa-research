package defpackage;

/* loaded from: classes2.dex */
public class akbb implements akba {
    private final akba a;

    public akbb() {
        this.a = new akaw();
    }

    public final Object j(String str, Class cls) {
        Object objV = v(str);
        if (objV == null) {
            return null;
        }
        return cls.cast(objV);
    }

    public final ajpa k() {
        return (ajpa) j("http.connection", ajpa.class);
    }

    public final ajpe l() {
        return (ajpe) j("http.target_host", ajpe.class);
    }

    @Override // defpackage.akba
    public final Object v(String str) {
        return this.a.v(str);
    }

    @Override // defpackage.akba
    public final void x(String str, Object obj) {
        this.a.x(str, obj);
    }

    public akbb(akba akbaVar) {
        this.a = akbaVar;
    }
}
