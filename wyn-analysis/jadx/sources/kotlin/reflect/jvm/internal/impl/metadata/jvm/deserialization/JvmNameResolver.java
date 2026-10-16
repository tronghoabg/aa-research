package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import ff.o;
import ff.x;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class JvmNameResolver extends JvmNameResolverBase {

    @NotNull
    private final JvmProtoBuf.StringTableTypes types;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes types, @NotNull String[] strings) {
        AbstractC3340k.e(types, "types");
        AbstractC3340k.e(strings, "strings");
        List<Integer> localNameList = types.getLocalNameList();
        Set setX0 = localNameList.isEmpty() ? x.f35434a : o.X0(localNameList);
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        AbstractC3340k.d(recordList, "getRecordList(...)");
        super(strings, setX0, JvmNameResolverKt.toExpandedRecordsList(recordList));
        this.types = types;
    }
}
