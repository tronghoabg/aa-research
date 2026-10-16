package defpackage;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class agke {
    private agke() {
    }

    public final agkf create(Object obj, ahnj ahnjVar) {
        obj.getClass();
        return agkc.isEnumClassOrSpecializedEnumEntryClass(obj.getClass()) ? new agky(ahnjVar, (Enum) obj) : obj instanceof Annotation ? new agkg(ahnjVar, (Annotation) obj) : obj instanceof Object[] ? new agkj(ahnjVar, (Object[]) obj) : obj instanceof Class ? new agku(ahnjVar, (Class) obj) : new agla(ahnjVar, obj);
    }

    public /* synthetic */ agke(afeu afeuVar) {
        this();
    }
}
