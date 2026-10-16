package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azs {
    public final defpackage.zo a;
    public final long b;
    public final defpackage.axk c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ defpackage.cft g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ defpackage.axx k;
    final /* synthetic */ defpackage.azp l;
    final /* synthetic */ defpackage.cfy m;
    private final defpackage.azp n;

    public azs(long j, boolean z, defpackage.axk axkVar, defpackage.azp azpVar, int i, int i2, defpackage.cft cftVar, defpackage.cfy cfyVar, int i3, int i4, long j2, defpackage.axx axxVar) {
        this.d = z;
        this.l = azpVar;
        this.e = i;
        this.f = i2;
        this.g = cftVar;
        this.m = cfyVar;
        this.h = i3;
        this.i = i4;
        this.j = j2;
        this.k = axxVar;
        defpackage.zo zoVar = defpackage.zp.a;
        this.a = new defpackage.zo(6);
        this.c = axkVar;
        this.n = azpVar;
        this.b = defpackage.dln.d(0, z ? defpackage.dlm.b(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : defpackage.dlm.a(j));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final defpackage.axp a(int i, long j) {
        java.util.List list;
        defpackage.axk axkVar = this.c;
        java.lang.Object objD = axkVar.d(i);
        axkVar.c(i);
        defpackage.zo zoVar = this.a;
        java.util.List list2 = (java.util.List) zoVar.a(i);
        if (list2 == null) {
            java.util.List listR = this.n.r(i);
            int size = listR.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((defpackage.ctx) listR.get(i2)).v(j));
            }
            zoVar.g(i, arrayList);
            list = arrayList;
        } else {
            list = list2;
        }
        return new defpackage.axp(i, list, this.d, this.g, this.m, this.l.p(), this.h, this.i, i != this.e + (-1) ? this.f : 0, this.j, objD, this.k.k, j);
    }

    public final defpackage.sns b() {
        return this.c.b;
    }
}
