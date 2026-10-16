package kotlin.reflect.jvm.internal.impl.name;

import Bf.i;
import com.qonversion.android.sdk.internal.Constants;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final i SANITIZE_AS_JAVA_INVALID_CHARACTERS = new i("[^\\p{L}\\p{Digit}]");

    @NotNull
    private static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    private NameUtils() {
    }

    @NotNull
    public static final Name contextReceiverName(int i5) {
        Name nameIdentifier = Name.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i5);
        AbstractC3340k.d(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.c(name, Constants.USER_ID_SEPARATOR);
    }
}
