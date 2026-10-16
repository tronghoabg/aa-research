package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adkk extends defpackage.adkr implements java.io.Closeable {
    public final defpackage.adks a;
    public java.util.concurrent.ScheduledFuture b;
    private final defpackage.adkr h;
    private java.util.ArrayList i;
    private defpackage.adkl j;
    private java.lang.Throwable k;
    private boolean l;

    public adkk(defpackage.adkr adkrVar) {
        super(adkrVar, adkrVar.f);
        this.a = adkrVar.b();
        this.h = new defpackage.adkr(this, this.f);
    }

    @Override // defpackage.adkr
    public final defpackage.adkr a() {
        return this.h.a();
    }

    @Override // defpackage.adkr
    public final defpackage.adks b() {
        return this.a;
    }

    @Override // defpackage.adkr
    public final java.lang.Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.adkr
    public final void d(defpackage.adkl adklVar, java.util.concurrent.Executor executor) {
        e(new defpackage.adkn(executor, adklVar, this));
    }

    public final void e(defpackage.adkn adknVar) {
        synchronized (this) {
            if (i()) {
                adknVar.a();
            } else {
                java.util.ArrayList arrayList = this.i;
                if (arrayList == null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(adknVar);
                    defpackage.adkk adkkVar = this.e;
                    if (adkkVar != null) {
                        this.j = new defpackage.adzs(this, 1);
                        adkkVar.e(new defpackage.adkn(defpackage.adkm.INSTANCE, this.j, this));
                    }
                } else {
                    arrayList.add(adknVar);
                }
            }
        }
    }

    @Override // defpackage.adkr
    public final void f(defpackage.adkr adkrVar) {
        this.h.f(adkrVar);
    }

    @Override // defpackage.adkr
    public final void g(defpackage.adkl adklVar) {
        h(adklVar, this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(defpackage.adkl adklVar, defpackage.adkr adkrVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    defpackage.adkn adknVar = (defpackage.adkn) this.i.get(size);
                    if (adknVar.a == adklVar && adknVar.b == adkrVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    defpackage.adkk adkkVar = this.e;
                    if (adkkVar != null) {
                        adkkVar.h(this.j, adkkVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.adkr
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(java.lang.Throwable th) {
        int i;
        boolean z;
        java.util.concurrent.ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                java.util.ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                defpackage.adkl adklVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.adkn adknVar = (defpackage.adkn) arrayList.get(i2);
                    if (adknVar.b == this) {
                        adknVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    defpackage.adkn adknVar2 = (defpackage.adkn) arrayList.get(i);
                    if (adknVar2.b != this) {
                        adknVar2.a();
                    }
                }
                defpackage.adkk adkkVar = this.e;
                if (adkkVar != null) {
                    adkkVar.h(adklVar, adkkVar);
                }
            }
        }
    }

    public adkk(defpackage.adkr adkrVar, defpackage.adks adksVar) {
        super(adkrVar, adkrVar.f);
        this.a = adksVar;
        this.h = new defpackage.adkr(this, this.f);
    }
}
