package defpackage;

/* loaded from: classes.dex */
public class afzh {
    public static final afzc Companion = new afzc(null);
    private final ahnd annotationOnInvokeClassId;
    private final String classNamePrefix;
    private final boolean isInlineable;
    private final boolean isReflectType;
    private final int maxArity;
    private final ahnf packageFqName;

    public afzh(ahnf ahnfVar, String str, boolean z, ahnd ahndVar, boolean z2, int i) {
        ahnfVar.getClass();
        str.getClass();
        this.packageFqName = ahnfVar;
        this.classNamePrefix = str;
        this.isReflectType = z;
        this.annotationOnInvokeClassId = ahndVar;
        this.isInlineable = z2;
        this.maxArity = i;
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final int getMaxArity() {
        return this.maxArity;
    }

    public final ahnf getPackageFqName() {
        return this.packageFqName;
    }

    public final ahnd numberedClassId(int i) {
        return new ahnd(this.packageFqName, numberedClassName(i));
    }

    public final ahnj numberedClassName(int i) {
        return ahnj.identifier(this.classNamePrefix + i);
    }

    public String toString() {
        return this.packageFqName + '.' + this.classNamePrefix + 'N';
    }

    public /* synthetic */ afzh(ahnf ahnfVar, String str, boolean z, ahnd ahndVar, boolean z2, int i, int i2, afeu afeuVar) {
        this(ahnfVar, str, z, ahndVar, z2, (i2 & 32) != 0 ? 254 : i);
    }
}
