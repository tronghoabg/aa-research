package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akdo implements java.io.Serializable {
    public static final defpackage.akdo a = new defpackage.akdn("eras", (byte) 1);
    public static final defpackage.akdo b = new defpackage.akdn("centuries", (byte) 2);
    public static final defpackage.akdo c = new defpackage.akdn("weekyears", (byte) 3);
    public static final defpackage.akdo d = new defpackage.akdn("years", (byte) 4);
    public static final defpackage.akdo e = new defpackage.akdn("months", (byte) 5);
    public static final defpackage.akdo f = new defpackage.akdn("weeks", (byte) 6);
    public static final defpackage.akdo g = new defpackage.akdn("days", (byte) 7);
    public static final defpackage.akdo h = new defpackage.akdn("halfdays", (byte) 8);
    public static final defpackage.akdo i = new defpackage.akdn("hours", (byte) 9);
    public static final defpackage.akdo j = new defpackage.akdn("minutes", (byte) 10);
    public static final defpackage.akdo k = new defpackage.akdn("seconds", (byte) 11);
    public static final defpackage.akdo l = new defpackage.akdn("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final java.lang.String m;

    protected akdo(java.lang.String str) {
        this.m = str;
    }

    public abstract defpackage.akdm a(defpackage.akdd akddVar);

    public final java.lang.String toString() {
        return this.m;
    }
}
