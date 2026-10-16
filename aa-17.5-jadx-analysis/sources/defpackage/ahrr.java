package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahrr {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahrr[] $VALUES;
    public static final Set<ahrr> ALL;
    public static final Set<ahrr> ALL_EXCEPT_ANNOTATIONS;
    public static final ahrq Companion;
    private final boolean includeByDefault;
    public static final ahrr VISIBILITY = new ahrr("VISIBILITY", 0, true);
    public static final ahrr MODALITY = new ahrr("MODALITY", 1, true);
    public static final ahrr OVERRIDE = new ahrr("OVERRIDE", 2, true);
    public static final ahrr ANNOTATIONS = new ahrr("ANNOTATIONS", 3, false);
    public static final ahrr INNER = new ahrr("INNER", 4, true);
    public static final ahrr MEMBER_KIND = new ahrr("MEMBER_KIND", 5, true);
    public static final ahrr DATA = new ahrr("DATA", 6, true);
    public static final ahrr INLINE = new ahrr("INLINE", 7, true);
    public static final ahrr EXPECT = new ahrr("EXPECT", 8, true);
    public static final ahrr ACTUAL = new ahrr("ACTUAL", 9, true);
    public static final ahrr CONST = new ahrr("CONST", 10, true);
    public static final ahrr LATEINIT = new ahrr("LATEINIT", 11, true);
    public static final ahrr FUN = new ahrr("FUN", 12, true);
    public static final ahrr VALUE = new ahrr("VALUE", 13, true);

    private static final /* synthetic */ ahrr[] $values() {
        return new ahrr[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        ahrr[] ahrrVarArr$values = $values();
        $VALUES = ahrrVarArr$values;
        $ENTRIES = affa.p(ahrrVarArr$values);
        Companion = new ahrq(null);
        ahrr[] ahrrVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (ahrr ahrrVar : ahrrVarArrValues) {
            if (ahrrVar.includeByDefault) {
                arrayList.add(ahrrVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = woy.cl(arrayList);
        ALL = woy.di(values());
    }

    private ahrr(String str, int i, boolean z) {
        this.includeByDefault = z;
    }

    public static ahrr valueOf(String str) {
        return (ahrr) Enum.valueOf(ahrr.class, str);
    }

    public static ahrr[] values() {
        return (ahrr[]) $VALUES.clone();
    }
}
