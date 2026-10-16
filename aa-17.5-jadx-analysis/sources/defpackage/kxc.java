package defpackage;

/* loaded from: classes.dex */
public final class kxc extends Exception {
    public final ywj a;

    public kxc(String str, ywj ywjVar, Throwable th) {
        super("GH.Assistant.CarMsngr: ".concat(str), th);
        this.a = ywjVar;
    }

    public kxc(ywj ywjVar) {
        super("GH.Assistant.CarMsngr: Message manager must be initialized for use.");
        this.a = ywjVar;
    }
}
