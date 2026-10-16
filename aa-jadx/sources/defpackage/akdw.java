package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akdw extends defpackage.akdv implements java.io.Serializable, defpackage.akdu {
    private static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile defpackage.akdd b;

    public akdw(long j, defpackage.akdd akddVar) {
        java.util.Map map = defpackage.akdi.a;
        this.b = akddVar;
        this.a = j;
        if (this.a == Long.MIN_VALUE || this.a == Long.MAX_VALUE) {
            this.b = this.b.a();
        }
    }

    @Override // defpackage.akdu
    public final long a() {
        return this.a;
    }

    @Override // defpackage.akdu
    public final defpackage.akdd b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public akdw() {
        this(java.lang.System.currentTimeMillis(), defpackage.aker.N());
        org.jni_zero.CommonApis commonApis = defpackage.akdi.b;
    }
}
