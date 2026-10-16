package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vtx implements defpackage.zgm {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vtx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.concurrent.Callable] */
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
    @Override // defpackage.zgm
    public final defpackage.zhs a() throws java.io.IOException {
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            defpackage.vtz vtzVar = (defpackage.vtz) this.a;
            return (!vtzVar.p() || vtzVar.c.getAndSet(true)) ? defpackage.zho.a : vtzVar.r(6, (defpackage.vtk) vtzVar.b.a(), ((defpackage.vtn) vtzVar.e.a()).f);
        }
        if (i == 1) {
            int i3 = defpackage.tnx.a;
            defpackage.zim zimVar = new defpackage.zim((java.util.concurrent.Callable) this.a);
            zimVar.run();
            return zimVar;
        }
        int i4 = 0;
        if (i == 2) {
            defpackage.vtz vtzVar2 = (defpackage.vtz) this.a;
            if (vtzVar2.p()) {
                defpackage.vtm vtmVar = vtzVar2.f;
                if (((java.util.concurrent.atomic.AtomicBoolean) vtmVar.g).getAndSet(false)) {
                    vtmVar.e.execute(new defpackage.zim(new defpackage.vws(vtmVar, i2)));
                } else {
                    defpackage.zhs zhsVar = defpackage.zho.a;
                }
            }
            return defpackage.zho.a;
        }
        if (i == 3) {
            java.lang.Object obj = this.a;
            defpackage.rzu rzuVar = new defpackage.rzu(obj, 17);
            android.content.Context context = ((defpackage.vup) obj).b;
            int i5 = defpackage.tnx.a;
            return defpackage.tnx.b(context, new defpackage.vtx(java.util.concurrent.Executors.callable(rzuVar, null), i2), defpackage.zgt.INSTANCE);
        }
        long jRound = 0;
        if (i == 4) {
            java.lang.Object obj2 = this.a;
            defpackage.vvz vvzVar = (defpackage.vvz) obj2;
            java.util.concurrent.ScheduledFuture scheduledFuture = vvzVar.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                vvzVar.j = null;
            }
            defpackage.aclm aclmVar = vvzVar.a;
            if (((defpackage.vvu) aclmVar.a()).e) {
                defpackage.zhw zhwVar = vvzVar.c;
                defpackage.rzu rzuVar2 = new defpackage.rzu(obj2, 18);
                if (((defpackage.vvu) aclmVar.a()).f) {
                    jRound = java.lang.Math.round(vvzVar.e.nextDouble() * ((java.lang.Long) vvzVar.d.a()).longValue());
                }
                vvzVar.j = zhwVar.scheduleWithFixedDelay(rzuVar2, jRound, ((java.lang.Long) vvzVar.d.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            return defpackage.zho.a;
        }
        if (i == 5) {
            java.lang.Object obj3 = this.a;
            defpackage.whl whlVar = new defpackage.whl(obj3, i4);
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            int i6 = defpackage.zgh.c;
            defpackage.zhs zhsVar2 = ((defpackage.who) obj3).a;
            defpackage.zgf zgfVar = new defpackage.zgf(zhsVar2, whlVar);
            zhsVar2.c(zgfVar, defpackage.ysr.ch(zgtVar, zgfVar));
            defpackage.zgg zggVar = new defpackage.zgg(zgfVar, new defpackage.xye());
            zgfVar.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
            return zggVar;
        }
        defpackage.who whoVar = (defpackage.who) this.a;
        defpackage.zhs zhsVar3 = whoVar.a;
        defpackage.ysr.bn(zhsVar3.isDone(), "Future was expected to be done: %s", zhsVar3);
        android.net.Uri uriBuild = defpackage.sqs.bD((android.net.Uri) defpackage.a.K(zhsVar3), ".version").buildUpon().fragment("").build();
        new defpackage.riu(12).fF();
        defpackage.wgr wgrVar = new defpackage.wgr();
        wgrVar.b();
        java.io.File file = (java.io.File) whoVar.i.d(uriBuild, wgrVar);
        defpackage.ysr.h(file);
        android.os.ParcelFileDescriptor parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open(file, 939524096);
        try {
            int fd = parcelFileDescriptorOpen.getFd();
            if (com.google.android.libraries.storage.protostore.MappedCounterCacheVersion.nativeFileTruncate(fd) != 0) {
                throw new java.io.IOException("Failed to truncate counter file");
            }
            long jNativeMmap = com.google.android.libraries.storage.protostore.MappedCounterCacheVersion.nativeMmap(fd, true);
            if (jNativeMmap < 0) {
                throw new java.io.IOException("Failed to mmap counter file");
            }
            com.google.android.libraries.storage.protostore.MappedCounterCacheVersion mappedCounterCacheVersion = new com.google.android.libraries.storage.protostore.MappedCounterCacheVersion(jNativeMmap);
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return new defpackage.zho(mappedCounterCacheVersion);
        } catch (java.lang.Throwable th) {
            if (parcelFileDescriptorOpen == null) {
                throw th;
            }
            try {
                parcelFileDescriptorOpen.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
