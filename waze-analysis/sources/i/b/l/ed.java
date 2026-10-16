package i.b.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    public static final ed f48678a;

    /* renamed from: b, reason: collision with root package name */
    public static final ed f48679b;

    /* renamed from: c, reason: collision with root package name */
    public static final ed f48680c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ed[] f48681d;

    static {
        ed edVar = new ed("PASSWORD_CREDENTIAL", 0);
        f48678a = edVar;
        ed edVar2 = new ed("TOKEN_CREDENTIAL", 1);
        f48679b = edVar2;
        ed edVar3 = new ed("CREDENTIAL_NOT_SET", 2);
        f48680c = edVar3;
        f48681d = new ed[]{edVar, edVar2, edVar3};
    }

    public static ed[] values() {
        return (ed[]) f48681d.clone();
    }
}
