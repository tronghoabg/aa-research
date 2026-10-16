package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agfv {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agfv[] $VALUES;
    private static final Set<agfv> ALL_TARGET_SET;
    private static final List<agfv> ANNOTATION_CLASS_LIST;
    private static final List<agfv> CLASS_LIST;
    private static final List<agfv> COMPANION_OBJECT_LIST;
    public static final agfu Companion;
    private static final Set<agfv> DEFAULT_TARGET_SET;
    private static final List<agfv> ENUM_ENTRY_LIST;
    private static final List<agfv> ENUM_LIST;
    private static final List<agfv> FILE_LIST;
    private static final List<agfv> FUNCTION_LIST;
    private static final List<agfv> INTERFACE_LIST;
    private static final List<agfv> LOCAL_CLASS_LIST;
    private static final List<agfv> OBJECT_LIST;
    private static final List<agfv> PROPERTY_GETTER_LIST;
    private static final List<agfv> PROPERTY_SETTER_LIST;
    private static final Map<agfe, agfv> USE_SITE_MAPPING;
    private static final HashMap<String, agfv> map;
    private final String description;
    private final boolean isDefault;
    public static final agfv CLASS = new agfv("CLASS", 0, "class", false, 2, null);
    public static final agfv ANNOTATION_CLASS = new agfv("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final agfv TYPE_PARAMETER = new agfv("TYPE_PARAMETER", 2, "type parameter", false);
    public static final agfv PROPERTY = new agfv("PROPERTY", 3, "property", false, 2, null);
    public static final agfv FIELD = new agfv("FIELD", 4, "field", false, 2, null);
    public static final agfv LOCAL_VARIABLE = new agfv("LOCAL_VARIABLE", 5, "local variable", false, 2, null);
    public static final agfv VALUE_PARAMETER = new agfv("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
    public static final agfv CONSTRUCTOR = new agfv("CONSTRUCTOR", 7, "constructor", false, 2, null);
    public static final agfv FUNCTION = new agfv("FUNCTION", 8, "function", false, 2, null);
    public static final agfv PROPERTY_GETTER = new agfv("PROPERTY_GETTER", 9, "getter", false, 2, null);
    public static final agfv PROPERTY_SETTER = new agfv("PROPERTY_SETTER", 10, "setter", false, 2, null);
    public static final agfv TYPE = new agfv("TYPE", 11, "type usage", false);
    public static final agfv EXPRESSION = new agfv("EXPRESSION", 12, "expression", false);
    public static final agfv FILE = new agfv("FILE", 13, "file", false);
    public static final agfv TYPEALIAS = new agfv("TYPEALIAS", 14, "typealias", false);
    public static final agfv TYPE_PROJECTION = new agfv("TYPE_PROJECTION", 15, "type projection", false);
    public static final agfv STAR_PROJECTION = new agfv("STAR_PROJECTION", 16, "star projection", false);
    public static final agfv PROPERTY_PARAMETER = new agfv("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final agfv CLASS_ONLY = new agfv("CLASS_ONLY", 18, "class", false);
    public static final agfv OBJECT = new agfv("OBJECT", 19, "object", false);
    public static final agfv STANDALONE_OBJECT = new agfv("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final agfv COMPANION_OBJECT = new agfv("COMPANION_OBJECT", 21, "companion object", false);
    public static final agfv INTERFACE = new agfv("INTERFACE", 22, "interface", false);
    public static final agfv ENUM_CLASS = new agfv("ENUM_CLASS", 23, "enum class", false);
    public static final agfv ENUM_ENTRY = new agfv("ENUM_ENTRY", 24, "enum entry", false);
    public static final agfv LOCAL_CLASS = new agfv("LOCAL_CLASS", 25, "local class", false);
    public static final agfv LOCAL_FUNCTION = new agfv("LOCAL_FUNCTION", 26, "local function", false);
    public static final agfv MEMBER_FUNCTION = new agfv("MEMBER_FUNCTION", 27, "member function", false);
    public static final agfv COMPANION_MEMBER_FUNCTION = new agfv("COMPANION_MEMBER_FUNCTION", 28, "companion member function", false);
    public static final agfv TOP_LEVEL_FUNCTION = new agfv("TOP_LEVEL_FUNCTION", 29, "top level function", false);
    public static final agfv COMPANION_EXTENSION_FUNCTION = new agfv("COMPANION_EXTENSION_FUNCTION", 30, "companion extension function", false);
    public static final agfv MEMBER_PROPERTY = new agfv("MEMBER_PROPERTY", 31, "member property", false);
    public static final agfv COMPANION_MEMBER_PROPERTY = new agfv("COMPANION_MEMBER_PROPERTY", 32, "companion member property", false);
    public static final agfv MEMBER_PROPERTY_WITH_BACKING_FIELD = new agfv("MEMBER_PROPERTY_WITH_BACKING_FIELD", 33, "member property with backing field", false);
    public static final agfv MEMBER_PROPERTY_WITH_DELEGATE = new agfv("MEMBER_PROPERTY_WITH_DELEGATE", 34, "member property with delegate", false);
    public static final agfv MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new agfv("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "member property without backing field or delegate", false);
    public static final agfv TOP_LEVEL_PROPERTY = new agfv("TOP_LEVEL_PROPERTY", 36, "top level property", false);
    public static final agfv COMPANION_EXTENSION_PROPERTY = new agfv("COMPANION_EXTENSION_PROPERTY", 37, "companion extension property", false);
    public static final agfv TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new agfv("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 38, "top level property with backing field", false);
    public static final agfv TOP_LEVEL_PROPERTY_WITH_DELEGATE = new agfv("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 39, "top level property with delegate", false);
    public static final agfv TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new agfv("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 40, "top level property without backing field or delegate", false);
    public static final agfv BACKING_FIELD = new agfv("BACKING_FIELD", 41, "backing field", false, 2, null);
    public static final agfv INITIALIZER = new agfv("INITIALIZER", 42, "initializer", false);
    public static final agfv DESTRUCTURING_DECLARATION = new agfv("DESTRUCTURING_DECLARATION", 43, "destructuring declaration", false);
    public static final agfv LAMBDA_EXPRESSION = new agfv("LAMBDA_EXPRESSION", 44, "lambda expression", false);
    public static final agfv ANONYMOUS_FUNCTION = new agfv("ANONYMOUS_FUNCTION", 45, "anonymous function", false);
    public static final agfv OBJECT_LITERAL = new agfv("OBJECT_LITERAL", 46, "object literal", false);

    private static final /* synthetic */ agfv[] $values() {
        return new agfv[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, COMPANION_MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, COMPANION_EXTENSION_FUNCTION, MEMBER_PROPERTY, COMPANION_MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, COMPANION_EXTENSION_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    static {
        agfv[] agfvVarArr$values = $values();
        $VALUES = agfvVarArr$values;
        $ENTRIES = affa.p(agfvVarArr$values);
        Companion = new agfu(null);
        map = new HashMap<>();
        for (agfv agfvVar : getEntries()) {
            map.put(agfvVar.name(), agfvVar);
        }
        afdf<agfv> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (agfv agfvVar2 : entries) {
            if (agfvVar2.isDefault) {
                arrayList.add(agfvVar2);
            }
        }
        DEFAULT_TARGET_SET = woy.cl(arrayList);
        ALL_TARGET_SET = woy.cl(getEntries());
        agfv agfvVar3 = CLASS;
        ANNOTATION_CLASS_LIST = woy.bi(ANNOTATION_CLASS, agfvVar3);
        LOCAL_CLASS_LIST = woy.bi(LOCAL_CLASS, agfvVar3);
        CLASS_LIST = woy.bi(CLASS_ONLY, agfvVar3);
        agfv agfvVar4 = OBJECT;
        COMPANION_OBJECT_LIST = woy.bi(COMPANION_OBJECT, agfvVar4, agfvVar3);
        OBJECT_LIST = woy.bi(STANDALONE_OBJECT, agfvVar4, agfvVar3);
        INTERFACE_LIST = woy.bi(INTERFACE, agfvVar3);
        ENUM_LIST = woy.bi(ENUM_CLASS, agfvVar3);
        agfv agfvVar5 = PROPERTY;
        agfv agfvVar6 = FIELD;
        ENUM_ENTRY_LIST = woy.bi(ENUM_ENTRY, agfvVar5, agfvVar6);
        agfv agfvVar7 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = woy.bg(agfvVar7);
        agfv agfvVar8 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = woy.bg(agfvVar8);
        FUNCTION_LIST = woy.bg(FUNCTION);
        agfv agfvVar9 = FILE;
        FILE_LIST = woy.bg(agfvVar9);
        agfe agfeVar = agfe.CONSTRUCTOR_PARAMETER;
        agfv agfvVar10 = VALUE_PARAMETER;
        USE_SITE_MAPPING = woy.ba(new aezu(agfeVar, agfvVar10), new aezu(agfe.FIELD, agfvVar6), new aezu(agfe.PROPERTY, agfvVar5), new aezu(agfe.FILE, agfvVar9), new aezu(agfe.PROPERTY_GETTER, agfvVar8), new aezu(agfe.PROPERTY_SETTER, agfvVar7), new aezu(agfe.RECEIVER, agfvVar10), new aezu(agfe.SETTER_PARAMETER, agfvVar10), new aezu(agfe.PROPERTY_DELEGATE_FIELD, agfvVar6));
    }

    public /* synthetic */ agfv(String str, int i, String str2, boolean z, int i2, afeu afeuVar) {
        this(str, i, str2, z | (!((i2 & 2) == 0)));
    }

    public static afdf<agfv> getEntries() {
        return $ENTRIES;
    }

    public static agfv valueOf(String str) {
        return (agfv) Enum.valueOf(agfv.class, str);
    }

    public static agfv[] values() {
        return (agfv[]) $VALUES.clone();
    }

    private agfv(String str, int i, String str2, boolean z) {
        this.description = str2;
        this.isDefault = z;
    }
}
