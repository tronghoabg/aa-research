package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Bf.r;
import Va.M6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final FunctionTypeKindExtractor Default = new FunctionTypeKindExtractor(AbstractC3935e.D(FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE));

    @NotNull
    private final List<FunctionTypeKind> kinds;

    @NotNull
    private final Map<FqName, List<FunctionTypeKind>> knownKindsByPackageFqName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.Default;
        }

        private Companion() {
        }
    }

    public static final class KindWithArity {
        private final int arity;

        @NotNull
        private final FunctionTypeKind kind;

        public KindWithArity(@NotNull FunctionTypeKind kind, int i5) {
            AbstractC3340k.e(kind, "kind");
            this.kind = kind;
            this.arity = i5;
        }

        @NotNull
        public final FunctionTypeKind component1() {
            return this.kind;
        }

        public final int component2() {
            return this.arity;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return AbstractC3340k.a(this.kind, kindWithArity.kind) && this.arity == kindWithArity.arity;
        }

        @NotNull
        public final FunctionTypeKind getKind() {
            return this.kind;
        }

        public int hashCode() {
            return (this.kind.hashCode() * 31) + this.arity;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
            sb2.append(this.kind);
            sb2.append(", arity=");
            return M6.r(sb2, this.arity, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> kinds) {
        AbstractC3340k.e(kinds, "kinds");
        this.kinds = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.knownKindsByPackageFqName = linkedHashMap;
    }

    private final Integer toInt(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = str.charAt(i10) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i5 = (i5 * 10) + iCharAt;
        }
        return Integer.valueOf(i5);
    }

    @Nullable
    public final FunctionTypeKind getFunctionalClassKind(@NotNull FqName packageFqName, @NotNull String className) {
        AbstractC3340k.e(packageFqName, "packageFqName");
        AbstractC3340k.e(className, "className");
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(packageFqName, className);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    @Nullable
    public final KindWithArity getFunctionalClassKindWithArity(@NotNull FqName packageFqName, @NotNull String className) {
        AbstractC3340k.e(packageFqName, "packageFqName");
        AbstractC3340k.e(className, "className");
        List<FunctionTypeKind> list = this.knownKindsByPackageFqName.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (r.k0(className, functionTypeKind.getClassNamePrefix(), false)) {
                String strSubstring = className.substring(functionTypeKind.getClassNamePrefix().length());
                AbstractC3340k.d(strSubstring, "substring(...)");
                Integer num = toInt(strSubstring);
                if (num != null) {
                    return new KindWithArity(functionTypeKind, num.intValue());
                }
            }
        }
        return null;
    }
}
