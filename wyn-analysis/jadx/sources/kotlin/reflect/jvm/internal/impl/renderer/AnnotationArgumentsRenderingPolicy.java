package kotlin.reflect.jvm.internal.impl.renderer;

import ic.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AnnotationArgumentsRenderingPolicy {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final AnnotationArgumentsRenderingPolicy NO_ARGUMENTS = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final AnnotationArgumentsRenderingPolicy UNLESS_EMPTY = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $values() {
        return new AnnotationArgumentsRenderingPolicy[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr$values = $values();
        $VALUES = annotationArgumentsRenderingPolicyArr$values;
        $ENTRIES = d.t(annotationArgumentsRenderingPolicyArr$values);
    }

    private AnnotationArgumentsRenderingPolicy(String str, int i5, boolean z2, boolean z10) {
        this.includeAnnotationArguments = z2;
        this.includeEmptyAnnotationArguments = z10;
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i5, boolean z2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i5, (i10 & 1) != 0 ? false : z2, (i10 & 2) != 0 ? false : z10);
    }
}
