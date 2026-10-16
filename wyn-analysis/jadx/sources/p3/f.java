package p3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f43213a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f43214b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f43215c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f43216d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f43217e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f43218f;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f43213a = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f43214b = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f43215c = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f43216d = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f43217e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f43218f = fVarArr;
        ic.d.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f43218f.clone();
    }
}
