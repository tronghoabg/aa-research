package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cmz extends android.view.View {
    public static final /* synthetic */ int j = 0;
    private static final android.view.ViewOutlineProvider k = new defpackage.cmy();
    public boolean a;
    public android.graphics.Outline b;
    public boolean c;
    public defpackage.dlo d;
    public defpackage.dlz e;
    public defpackage.affc f;
    public defpackage.cmq g;
    public float h;
    public float i;
    private final defpackage.cmj l;
    private final defpackage.khb m;

    public cmz(android.view.View view, defpackage.khb khbVar, defpackage.cmj cmjVar) {
        super(view.getContext());
        this.m = khbVar;
        this.l = cmjVar;
        setOutlineProvider(k);
        this.c = true;
        this.d = defpackage.cmk.a;
        this.e = defpackage.dlz.a;
        this.f = defpackage.cms.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [ckc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ckc, java.lang.Object] */
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
    @Override // android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.h > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || this.i > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            int iSave = canvas.save();
            canvas.translate(this.h, this.i);
            defpackage.khb khbVar = this.m;
            ?? r7 = khbVar.a;
            defpackage.cjm cjmVar = (defpackage.cjm) r7;
            android.graphics.Canvas canvas2 = cjmVar.a;
            cjmVar.a = canvas;
            defpackage.cmj cmjVar = this.l;
            defpackage.dlo dloVar = this.d;
            defpackage.dlz dlzVar = this.e;
            float width = getWidth();
            float height = getHeight();
            long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(width)) << 32;
            long jFloatToRawIntBits2 = 4294967295L & ((long) java.lang.Float.floatToRawIntBits(height));
            defpackage.cmq cmqVar = this.g;
            defpackage.affc affcVar = this.f;
            defpackage.cmi cmiVar = cmjVar.b;
            defpackage.dlo dloVarC = cmiVar.c();
            defpackage.dlz dlzVarD = cmiVar.d();
            defpackage.ckc ckcVarB = cmiVar.b();
            long jA = cmiVar.a();
            defpackage.cmq cmqVar2 = cmiVar.a;
            cmiVar.f(dloVar);
            cmiVar.g(dlzVar);
            cmiVar.e(r7);
            cmiVar.h(jFloatToRawIntBits | jFloatToRawIntBits2);
            cmiVar.a = cmqVar;
            r7.g();
            try {
                affcVar.invoke(cmjVar);
                r7.e();
                defpackage.cmi cmiVar2 = cmjVar.b;
                cmiVar2.f(dloVarC);
                cmiVar2.g(dlzVarD);
                cmiVar2.e(ckcVarB);
                cmiVar2.h(jA);
                cmiVar2.a = cmqVar2;
                ((defpackage.cjm) khbVar.a).a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (java.lang.Throwable th) {
                r7.e();
                defpackage.cmi cmiVar3 = cmjVar.b;
                cmiVar3.f(dloVarC);
                cmiVar3.g(dlzVarD);
                cmiVar3.e(ckcVarB);
                cmiVar3.h(jA);
                cmiVar3.a = cmqVar2;
                throw th;
            }
        } else {
            defpackage.khb khbVar2 = this.m;
            ?? r3 = khbVar2.a;
            defpackage.cjm cjmVar2 = (defpackage.cjm) r3;
            android.graphics.Canvas canvas3 = cjmVar2.a;
            cjmVar2.a = canvas;
            defpackage.cmj cmjVar2 = this.l;
            defpackage.dlo dloVar2 = this.d;
            defpackage.dlz dlzVar2 = this.e;
            float width2 = getWidth();
            float height2 = getHeight();
            long jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(width2)) << 32;
            long jFloatToRawIntBits4 = 4294967295L & ((long) java.lang.Float.floatToRawIntBits(height2));
            defpackage.cmq cmqVar3 = this.g;
            defpackage.affc affcVar2 = this.f;
            defpackage.cmi cmiVar4 = cmjVar2.b;
            defpackage.dlo dloVarC2 = cmiVar4.c();
            defpackage.dlz dlzVarD2 = cmiVar4.d();
            defpackage.ckc ckcVarB2 = cmiVar4.b();
            long jA2 = cmiVar4.a();
            defpackage.cmq cmqVar4 = cmiVar4.a;
            cmiVar4.f(dloVar2);
            cmiVar4.g(dlzVar2);
            cmiVar4.e(r3);
            cmiVar4.h(jFloatToRawIntBits3 | jFloatToRawIntBits4);
            cmiVar4.a = cmqVar3;
            r3.g();
            try {
                affcVar2.invoke(cmjVar2);
                r3.e();
                defpackage.cmi cmiVar5 = cmjVar2.b;
                cmiVar5.f(dloVarC2);
                cmiVar5.g(dlzVarD2);
                cmiVar5.e(ckcVarB2);
                cmiVar5.h(jA2);
                cmiVar5.a = cmqVar4;
                ((defpackage.cjm) khbVar2.a).a = canvas3;
            } catch (java.lang.Throwable th2) {
                r3.e();
                defpackage.cmi cmiVar6 = cmjVar2.b;
                cmiVar6.f(dloVarC2);
                cmiVar6.g(dlzVarD2);
                cmiVar6.e(ckcVarB2);
                cmiVar6.h(jA2);
                cmiVar6.a = cmqVar4;
                throw th2;
            }
        }
        this.a = false;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
