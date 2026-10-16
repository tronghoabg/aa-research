package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.v;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class AnnotationUtilKt {

    @NotNull
    private static final Name DEPRECATED_LEVEL_NAME;

    @NotNull
    private static final Name DEPRECATED_MESSAGE_NAME;

    @NotNull
    private static final Name DEPRECATED_REPLACE_WITH_NAME;

    @NotNull
    private static final Name REPLACE_WITH_EXPRESSION_NAME;

    @NotNull
    private static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name nameIdentifier = Name.identifier(PglCryptUtils.KEY_MESSAGE);
        AbstractC3340k.d(nameIdentifier, "identifier(...)");
        DEPRECATED_MESSAGE_NAME = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        AbstractC3340k.d(nameIdentifier2, "identifier(...)");
        DEPRECATED_REPLACE_WITH_NAME = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier(AppLovinEventTypes.USER_COMPLETED_LEVEL);
        AbstractC3340k.d(nameIdentifier3, "identifier(...)");
        DEPRECATED_LEVEL_NAME = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        AbstractC3340k.d(nameIdentifier4, "identifier(...)");
        REPLACE_WITH_EXPRESSION_NAME = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        AbstractC3340k.d(nameIdentifier5, "identifier(...)");
        REPLACE_WITH_IMPORTS_NAME = nameIdentifier5;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String message, @NotNull String replaceWith, @NotNull String level, boolean z2) {
        AbstractC3340k.e(kotlinBuiltIns, "<this>");
        AbstractC3340k.e(message, "message");
        AbstractC3340k.e(replaceWith, "replaceWith");
        AbstractC3340k.e(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, AbstractC2640A.R(new C2527k(REPLACE_WITH_EXPRESSION_NAME, new StringValue(replaceWith)), new C2527k(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(v.f35432a, new AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        C2527k c2527k = new C2527k(DEPRECATED_MESSAGE_NAME, new StringValue(message));
        C2527k c2527k2 = new C2527k(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = DEPRECATED_LEVEL_NAME;
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.deprecationLevel);
        AbstractC3340k.d(classId, "topLevel(...)");
        Name nameIdentifier = Name.identifier(level);
        AbstractC3340k.d(nameIdentifier, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, AbstractC2640A.R(c2527k, c2527k2, new C2527k(name, new EnumValue(classId, nameIdentifier))), z2);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = "";
        }
        if ((i5 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z2);
    }
}
