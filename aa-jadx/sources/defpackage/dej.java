package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dej<T> {
    public final java.lang.String a;
    public final defpackage.affg b;
    public boolean c;

    public /* synthetic */ dej(java.lang.String str) {
        this(str, new defpackage.dee(15));
    }

    public final java.lang.String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public dej(java.lang.String str, defpackage.affg affgVar) {
        this.a = str;
        this.b = affgVar;
    }

    public dej(java.lang.String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public dej(java.lang.String str, boolean z, defpackage.affg affgVar) {
        this(str, affgVar);
        this.c = z;
    }
}
