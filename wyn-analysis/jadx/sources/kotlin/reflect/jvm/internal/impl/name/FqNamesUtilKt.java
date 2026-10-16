package kotlin.reflect.jvm.internal.impl.name;

import Bf.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class FqNamesUtilKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final <V> V findValueForMostSpecificFqname(@NotNull FqName fqName, @NotNull Map<FqName, ? extends V> values) {
        Object next;
        AbstractC3340k.e(fqName, "<this>");
        AbstractC3340k.e(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : values.entrySet()) {
            FqName key = entry.getKey();
            if (fqName.equals(key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((FqName) ((Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    Object next2 = it.next();
                    int length2 = tail((FqName) ((Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean isChildOf(@NotNull FqName fqName, @NotNull FqName packageName) {
        AbstractC3340k.e(fqName, "<this>");
        AbstractC3340k.e(packageName, "packageName");
        return AbstractC3340k.a(parentOrNull(fqName), packageName);
    }

    public static final boolean isSubpackageOf(@NotNull FqName fqName, @NotNull FqName packageName) {
        AbstractC3340k.e(fqName, "<this>");
        AbstractC3340k.e(packageName, "packageName");
        if (fqName.equals(packageName) || packageName.isRoot()) {
            return true;
        }
        String strAsString = fqName.asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        String strAsString2 = packageName.asString();
        AbstractC3340k.d(strAsString2, "asString(...)");
        return isSubpackageOf(strAsString, strAsString2);
    }

    public static final boolean isValidJavaFqName(@Nullable String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else if (i10 != 3) {
                continue;
            } else if (cCharAt == '.') {
                state = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return state != State.AFTER_DOT;
    }

    @Nullable
    public static final FqName parentOrNull(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "<this>");
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    @NotNull
    public static final FqName tail(@NotNull FqName fqName, @NotNull FqName prefix) {
        AbstractC3340k.e(fqName, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        if (!isSubpackageOf(fqName, prefix) || prefix.isRoot()) {
            return fqName;
        }
        if (fqName.equals(prefix)) {
            FqName ROOT = FqName.ROOT;
            AbstractC3340k.d(ROOT, "ROOT");
            return ROOT;
        }
        String strAsString = fqName.asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        String strSubstring = strAsString.substring(prefix.asString().length() + 1);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }

    private static final boolean isSubpackageOf(String str, String str2) {
        return r.k0(str, str2, false) && str.charAt(str2.length()) == '.';
    }
}
