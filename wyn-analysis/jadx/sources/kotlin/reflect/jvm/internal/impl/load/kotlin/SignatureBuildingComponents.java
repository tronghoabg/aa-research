package kotlin.reflect.jvm.internal.impl.load.kotlin;

import ff.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final CharSequence invoke(@NotNull String it) {
            AbstractC3340k.e(it, "it");
            return SignatureBuildingComponents.INSTANCE.escapeClassName(it);
        }
    }

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String escapeClassName(String str) {
        return str.length() > 1 ? AbstractC3256n.f(';', "L", str) : str;
    }

    @NotNull
    public final String[] constructors(@NotNull String... signatures) {
        AbstractC3340k.e(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final Set<String> inClass(@NotNull String internalName, @NotNull String... signatures) {
        AbstractC3340k.e(internalName, "internalName");
        AbstractC3340k.e(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    @NotNull
    public final Set<String> inJavaLang(@NotNull String name, @NotNull String... signatures) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(signatures, "signatures");
        return inClass(javaLang(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public final Set<String> inJavaUtil(@NotNull String name, @NotNull String... signatures) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(signatures, "signatures");
        return inClass(javaUtil(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public final String javaFunction(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return "java/util/function/".concat(name);
    }

    @NotNull
    public final String javaLang(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return "java/lang/".concat(name);
    }

    @NotNull
    public final String javaUtil(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return "java/util/".concat(name);
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String name, @NotNull List<String> parameters, @NotNull String ret) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(parameters, "parameters");
        AbstractC3340k.e(ret, "ret");
        return name + '(' + o.w0(parameters, "", null, null, AnonymousClass1.INSTANCE, 30) + ')' + escapeClassName(ret);
    }

    @NotNull
    public final String signature(@NotNull String internalName, @NotNull String jvmDescriptor) {
        AbstractC3340k.e(internalName, "internalName");
        AbstractC3340k.e(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
