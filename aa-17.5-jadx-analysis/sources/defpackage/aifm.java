package defpackage;

/* loaded from: classes3.dex */
public final class aifm implements aihp {
    public static final aifm INSTANCE = new aifm();

    private aifm() {
    }

    @Override // defpackage.aihp
    public aihr toAttributes(agfk agfkVar, aiid aiidVar, agbi agbiVar) {
        agfkVar.getClass();
        return agfkVar.isEmpty() ? aihr.Companion.getEmpty() : aihr.Companion.create(woy.bg(new aifh(agfkVar)));
    }
}
