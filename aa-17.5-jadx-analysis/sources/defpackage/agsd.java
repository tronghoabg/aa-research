package defpackage;

/* loaded from: classes3.dex */
public final class agsd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf child(ahnf ahnfVar, String str) {
        return ahnfVar.child(ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf childSafe(ahnh ahnhVar, String str) {
        return ahnhVar.child(ahnj.identifier(str)).toSafe();
    }
}
