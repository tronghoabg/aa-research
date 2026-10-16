package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class agah {
    public static final defpackage.agac Companion = new defpackage.agac(null);
    private final defpackage.ahod annotationOnInvokeClassId;
    private final java.lang.String classNamePrefix;
    private final boolean isInlineable;
    private final boolean isReflectType;
    private final int maxArity;
    private final defpackage.ahof packageFqName;

    public agah(defpackage.ahof ahofVar, java.lang.String str, boolean z, defpackage.ahod ahodVar, boolean z2, int i) {
        ahofVar.getClass();
        str.getClass();
        this.packageFqName = ahofVar;
        this.classNamePrefix = str;
        this.isReflectType = z;
        this.annotationOnInvokeClassId = ahodVar;
        this.isInlineable = z2;
        this.maxArity = i;
    }

    public final java.lang.String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final int getMaxArity() {
        return this.maxArity;
    }

    public final defpackage.ahof getPackageFqName() {
        return this.packageFqName;
    }

    public final defpackage.ahod numberedClassId(int i) {
        return new defpackage.ahod(this.packageFqName, numberedClassName(i));
    }

    public final defpackage.ahoj numberedClassName(int i) {
        return defpackage.ahoj.identifier(this.classNamePrefix + i);
    }

    public java.lang.String toString() {
        return this.packageFqName + '.' + this.classNamePrefix + 'N';
    }

    public /* synthetic */ agah(defpackage.ahof ahofVar, java.lang.String str, boolean z, defpackage.ahod ahodVar, boolean z2, int i, int i2, defpackage.affu affuVar) {
        this(ahofVar, str, z, ahodVar, z2, (i2 & 32) != 0 ? 254 : i);
    }
}
