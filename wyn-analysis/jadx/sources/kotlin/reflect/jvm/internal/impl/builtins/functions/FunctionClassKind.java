package kotlin.reflect.jvm.internal.impl.builtins.functions;

import ic.d;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ FunctionClassKind[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1);
    public static final FunctionClassKind KFunction = new FunctionClassKind("KFunction", 2);
    public static final FunctionClassKind KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3);
    public static final FunctionClassKind UNKNOWN = new FunctionClassKind("UNKNOWN", 4);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionClassKind getFunctionClassKind(@NotNull FunctionTypeKind functionTypeKind) {
            AbstractC3340k.e(functionTypeKind, "functionTypeKind");
            return functionTypeKind.equals(FunctionTypeKind.Function.INSTANCE) ? FunctionClassKind.Function : functionTypeKind.equals(FunctionTypeKind.SuspendFunction.INSTANCE) ? FunctionClassKind.SuspendFunction : functionTypeKind.equals(FunctionTypeKind.KFunction.INSTANCE) ? FunctionClassKind.KFunction : functionTypeKind.equals(FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        FunctionClassKind[] functionClassKindArr$values = $values();
        $VALUES = functionClassKindArr$values;
        $ENTRIES = d.t(functionClassKindArr$values);
        Companion = new Companion(null);
    }

    private FunctionClassKind(String str, int i5) {
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }
}
