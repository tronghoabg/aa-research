package com.google.d.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f7391a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f7392b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f7393c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f7394d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f7395e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f7396f;

    /* renamed from: g, reason: collision with root package name */
    public static final z f7397g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f7398h;

    /* renamed from: i, reason: collision with root package name */
    static final z[] f7399i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ z[] f7400j;

    static {
        z zVar = new z("STRONG", 0);
        f7391a = zVar;
        z zVar2 = new z() { // from class: com.google.d.c.t
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                c(beVar, beVarA);
                return beVarA;
            }
        };
        f7392b = zVar2;
        z zVar3 = new z() { // from class: com.google.d.c.u
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                d(beVar, beVarA);
                return beVarA;
            }
        };
        f7393c = zVar3;
        z zVar4 = new z() { // from class: com.google.d.c.v
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                c(beVar, beVarA);
                d(beVar, beVarA);
                return beVarA;
            }
        };
        f7394d = zVar4;
        z zVar5 = new z("WEAK", 4);
        f7395e = zVar5;
        z zVar6 = new z() { // from class: com.google.d.c.w
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                c(beVar, beVarA);
                return beVarA;
            }
        };
        f7396f = zVar6;
        z zVar7 = new z() { // from class: com.google.d.c.x
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                d(beVar, beVarA);
                return beVarA;
            }
        };
        f7397g = zVar7;
        z zVar8 = new z() { // from class: com.google.d.c.y
            @Override // com.google.d.c.z
            final be a(aj ajVar, be beVar, be beVar2, Object obj) {
                be beVarA = super.a(ajVar, beVar, beVar2, obj);
                c(beVar, beVarA);
                d(beVar, beVarA);
                return beVarA;
            }
        };
        f7398h = zVar8;
        f7400j = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8};
        f7399i = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8};
    }

    /* synthetic */ z(String str, int i2, byte[] bArr) {
    }

    static final void c(be beVar, be beVar2) {
        beVar2.k(beVar.b());
        bd.c(beVar.h(), beVar2);
        bd.c(beVar2, beVar.f());
        bd.e(beVar);
    }

    static final void d(be beVar, be beVar2) {
        beVar2.q(beVar.c());
        bd.d(beVar.i(), beVar2);
        bd.d(beVar2, beVar.g());
        bd.f(beVar);
    }

    public static z[] values() {
        return (z[]) f7400j.clone();
    }

    be a(aj ajVar, be beVar, be beVar2, Object obj) {
        return b(ajVar, obj, beVar.a(), beVar2);
    }

    final be b(aj ajVar, Object obj, int i2, be beVar) {
        switch (ordinal()) {
            case 0:
                return new ao(obj, i2, beVar);
            case 1:
                return new am(obj, i2, beVar);
            case 2:
                return new aq(obj, i2, beVar);
            case 3:
                return new an(obj, i2, beVar);
            case 4:
                return new aw(ajVar.f7293h, obj, i2, beVar);
            case 5:
                return new au(ajVar.f7293h, obj, i2, beVar);
            case 6:
                return new ay(ajVar.f7293h, obj, i2, beVar);
            case 7:
                return new av(ajVar.f7293h, obj, i2, beVar);
            default:
                throw null;
        }
    }
}
