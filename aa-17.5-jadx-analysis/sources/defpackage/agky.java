package defpackage;

/* loaded from: classes3.dex */
public final class agky extends agkf implements agzg {
    private final Enum<?> value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agky(ahnj ahnjVar, Enum<?> r3) {
        super(ahnjVar, null);
        r3.getClass();
        this.value = r3;
    }

    public ahnj getEntryName() {
        return ahnj.identifier(this.value.name());
    }

    public ahnd getEnumClassId() {
        Class<?> enclosingClass = this.value.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return agkc.getClassId(enclosingClass);
    }
}
