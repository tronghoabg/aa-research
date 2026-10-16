package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class dee implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ dee(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean zK = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return (defpackage.cgm) obj;
            case 1:
                return (cgt) obj;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return (defpackage.cgo) obj;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Float f = (java.lang.Float) obj;
                ((java.lang.Float) obj2).floatValue();
                return f;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return (defpackage.ddw) obj;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return (java.lang.String) obj;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.afbk) obj;
            case 9:
                java.util.List list = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                if (list == null) {
                    return list2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 10:
                return (defpackage.ckg) obj;
            case 11:
                return (defpackage.cld) obj;
            case 12:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 13:
                return (defpackage.afbk) obj;
            case 14:
                return (defpackage.afbk) obj;
            case 15:
                return obj == null ? obj2 : obj;
            case 16:
                defpackage.wde wdeVar = (defpackage.wde) obj;
                java.lang.Throwable cancellationException = (java.lang.Throwable) obj2;
                wdeVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ((aium) wdeVar.b).b(cancellationException);
                return defpackage.afbk.a;
            case 17:
                long jIntValue = ((java.lang.Integer) obj).intValue();
                j$.time.Duration duration = (j$.time.Duration) obj2;
                duration.getClass();
                long millis = duration.toMillis();
                return millis > 0 ? defpackage.ysr.cC(java.lang.Math.min(jIntValue, millis)) : defpackage.ysr.cC(jIntValue);
            case 18:
                defpackage.nti ntiVar = (defpackage.nti) obj;
                android.content.ComponentName componentName = (android.content.ComponentName) obj2;
                ntiVar.getClass();
                if (ntiVar != defpackage.nti.a) {
                    zK = defpackage.nte.c().b().K();
                } else if (componentName == null || !defpackage.ler.a().i(defpackage.mpr.b(componentName)) || !defpackage.nte.c().b().K()) {
                    zK = false;
                }
                return java.lang.Boolean.valueOf(zK);
            case 19:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
                boolean zBooleanValue = bool2.booleanValue();
                defpackage.yqm yqmVar = defpackage.nkp.a;
                bool.getClass();
                zK = (bool.booleanValue() || zBooleanValue) ? false : true;
                defpackage.ypu ypuVarL = defpackage.nkp.a.l();
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zK);
                ypuVarL.R("setting assistant mic enabled state to: %s, hasCall: %s, isDisabled: %s", boolValueOf, bool, bool2);
                return boolValueOf;
            default:
                defpackage.nod nodVar = (defpackage.nod) obj;
                boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
                defpackage.yqm yqmVar2 = defpackage.non.a;
                if (!zBooleanValue2 || defpackage.afga.f(nodVar, defpackage.nod.a)) {
                    return nodVar;
                }
                defpackage.non.a.l().u("Disabling rail widget main action");
                nodVar.getClass();
                defpackage.niq niqVar = new defpackage.niq(14);
                defpackage.noc nocVar = nodVar.b;
                defpackage.noc nocVar2 = new defpackage.noc(nocVar.a, nocVar.c, niqVar);
                defpackage.niq niqVar2 = new defpackage.niq(15);
                defpackage.noc nocVar3 = nodVar.c;
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nodVar.d;
                boolean z = nodVar.f;
                boolean z2 = nodVar.g;
                int i = nodVar.h;
                boolean z3 = nodVar.i;
                boolean z4 = nodVar.j;
                boolean z5 = nodVar.k;
                java.lang.CharSequence charSequence = nodVar.l;
                java.lang.CharSequence charSequence2 = nodVar.m;
                defpackage.noc nocVar4 = nodVar.o;
                defpackage.noc nocVar5 = nodVar.p;
                defpackage.noc nocVar6 = nodVar.q;
                return new defpackage.nod(nocVar2, nocVar3, ghIcon, nodVar.e, z, z2, i, z3, z4, z5, nodVar.s, nodVar.t, charSequence, charSequence2, niqVar2, nocVar4, nocVar5, nocVar6, nodVar.r, nodVar.u);
        }
    }
}
