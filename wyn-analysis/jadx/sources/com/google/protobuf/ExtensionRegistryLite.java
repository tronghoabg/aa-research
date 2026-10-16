package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<C1804i0, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLiteA;
        if (!doFullRuntimeInheritanceCheck) {
            return EMPTY_REGISTRY_LITE;
        }
        ExtensionRegistryLite extensionRegistryLite = emptyRegistry;
        if (extensionRegistryLite != null) {
            return extensionRegistryLite;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLiteA = emptyRegistry;
                if (extensionRegistryLiteA == null) {
                    extensionRegistryLiteA = AbstractC1798g0.a("getEmptyRegistry");
                    if (extensionRegistryLiteA == null) {
                        extensionRegistryLiteA = EMPTY_REGISTRY_LITE;
                    }
                    emptyRegistry = extensionRegistryLiteA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLiteA;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        if (!doFullRuntimeInheritanceCheck) {
            return new ExtensionRegistryLite();
        }
        ExtensionRegistryLite extensionRegistryLiteA = AbstractC1798g0.a("newInstance");
        return extensionRegistryLiteA != null ? extensionRegistryLiteA : new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z2) {
        eagerlyParseMessageSets = z2;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new C1804i0(generatedExtension.getNumber(), generatedExtension.getContainingTypeDefaultInstance()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i5) {
        return (GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new C1804i0(i5, containingtype));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = DesugarCollections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls;
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (doFullRuntimeInheritanceCheck && (cls = AbstractC1798g0.f27682a) != null && cls.isAssignableFrom(getClass())) {
            try {
                getClass().getMethod("add", AbstractC1801h0.f27684a).invoke(this, extensionLite);
            } catch (Exception e7) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e7);
            }
        }
    }

    public ExtensionRegistryLite(boolean z2) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
