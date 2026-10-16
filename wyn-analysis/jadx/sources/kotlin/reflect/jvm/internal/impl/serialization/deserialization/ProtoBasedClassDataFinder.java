package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ff.AbstractC2641B;
import ff.p;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    @NotNull
    private final Map<ClassId, ProtoBuf.Class> classIdToProto;

    @NotNull
    private final l classSource;

    @NotNull
    private final BinaryVersion metadataVersion;

    @NotNull
    private final NameResolver nameResolver;

    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment proto, @NotNull NameResolver nameResolver, @NotNull BinaryVersion metadataVersion, @NotNull l classSource) {
        AbstractC3340k.e(proto, "proto");
        AbstractC3340k.e(nameResolver, "nameResolver");
        AbstractC3340k.e(metadataVersion, "metadataVersion");
        AbstractC3340k.e(classSource, "classSource");
        this.nameResolver = nameResolver;
        this.metadataVersion = metadataVersion;
        this.classSource = classSource;
        List<ProtoBuf.Class> class_List = proto.getClass_List();
        AbstractC3340k.d(class_List, "getClass_List(...)");
        List<ProtoBuf.Class> list = class_List;
        int iD = AbstractC2641B.D(p.a0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD < 16 ? 16 : iD);
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.nameResolver, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.classIdToProto = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        AbstractC3340k.e(classId, "classId");
        ProtoBuf.Class r02 = this.classIdToProto.get(classId);
        if (r02 == null) {
            return null;
        }
        return new ClassData(this.nameResolver, r02, this.metadataVersion, (SourceElement) this.classSource.invoke(classId));
    }

    @NotNull
    public final Collection<ClassId> getAllClassIds() {
        return this.classIdToProto.keySet();
    }
}
