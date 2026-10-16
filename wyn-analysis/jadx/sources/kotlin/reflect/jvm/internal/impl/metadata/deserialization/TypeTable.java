package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import ff.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class TypeTable {

    @NotNull
    private final List<ProtoBuf.Type> types;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        AbstractC3340k.e(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            AbstractC3340k.d(typeList2, "getTypeList(...)");
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            int i5 = 0;
            for (Object obj : list) {
                int i10 = i5 + 1;
                if (i5 < 0) {
                    AbstractC3935e.P();
                    throw null;
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i5 >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i5 = i10;
            }
            typeList = arrayList;
        }
        AbstractC3340k.d(typeList, "run(...)");
        this.types = typeList;
    }

    @NotNull
    public final ProtoBuf.Type get(int i5) {
        return this.types.get(i5);
    }
}
