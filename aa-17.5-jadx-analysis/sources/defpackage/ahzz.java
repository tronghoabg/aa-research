package defpackage;

/* loaded from: classes3.dex */
public final class ahzz {
    public static final ahnd getClassId(ahld ahldVar, int i) {
        ahldVar.getClass();
        return ahnd.Companion.fromString(ahldVar.getQualifiedClassName(i), ahldVar.isLocalClassName(i));
    }

    public static final ahnj getName(ahld ahldVar, int i) {
        ahldVar.getClass();
        return ahnj.guessByFirstCharacter(ahldVar.getString(i));
    }
}
