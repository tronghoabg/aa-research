package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahga {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahga[] $VALUES;
    public static final ahfz Companion;
    private static final Map<Integer, ahga> entryById;
    private final int id;
    public static final ahga UNKNOWN = new ahga("UNKNOWN", 0, 0);
    public static final ahga CLASS = new ahga("CLASS", 1, 1);
    public static final ahga FILE_FACADE = new ahga("FILE_FACADE", 2, 2);
    public static final ahga SYNTHETIC_CLASS = new ahga("SYNTHETIC_CLASS", 3, 3);
    public static final ahga MULTIFILE_CLASS = new ahga("MULTIFILE_CLASS", 4, 4);
    public static final ahga MULTIFILE_CLASS_PART = new ahga("MULTIFILE_CLASS_PART", 5, 5);

    private static final /* synthetic */ ahga[] $values() {
        return new ahga[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
    }

    static {
        ahga[] ahgaVarArr$values = $values();
        $VALUES = ahgaVarArr$values;
        $ENTRIES = affa.p(ahgaVarArr$values);
        Companion = new ahfz(null);
        ahga[] ahgaVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(ahgaVarArrValues.length), 16));
        for (ahga ahgaVar : ahgaVarArrValues) {
            linkedHashMap.put(Integer.valueOf(ahgaVar.id), ahgaVar);
        }
        entryById = linkedHashMap;
    }

    private ahga(String str, int i, int i2) {
        this.id = i2;
    }

    public static final ahga getById(int i) {
        return Companion.getById(i);
    }

    public static ahga valueOf(String str) {
        return (ahga) Enum.valueOf(ahga.class, str);
    }

    public static ahga[] values() {
        return (ahga[]) $VALUES.clone();
    }
}
