package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class tnh {
    private final int a;

    public tnh(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.tnh) && this.a == ((defpackage.tnh) obj).a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new int[]{this.a});
    }

    public final java.lang.String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
