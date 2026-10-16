package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import ef.C2527k;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ReadPackageFragmentKt {
    @NotNull
    public static final C2527k readBuiltinsPackageFragment(@NotNull InputStream inputStream) throws IOException {
        ProtoBuf.PackageFragment from;
        AbstractC3340k.e(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion from2 = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (from2.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteNewInstance);
            } else {
                from = null;
            }
            C2527k c2527k = new C2527k(from, from2);
            inputStream.close();
            return c2527k;
        } finally {
        }
    }
}
