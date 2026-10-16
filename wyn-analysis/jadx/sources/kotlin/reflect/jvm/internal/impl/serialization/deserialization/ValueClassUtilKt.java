package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ef.C2527k;
import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, tf.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Nullable
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r62, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull l typeDeserializer, @NotNull l typeOfPublicProperty) {
        SimpleTypeMarker simpleTypeMarker;
        ?? multiFieldValueClassUnderlyingTypeList;
        AbstractC3340k.e(r62, "<this>");
        AbstractC3340k.e(nameResolver, "nameResolver");
        AbstractC3340k.e(typeTable, "typeTable");
        AbstractC3340k.e(typeDeserializer, "typeDeserializer");
        AbstractC3340k.e(typeOfPublicProperty, "typeOfPublicProperty");
        if (r62.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r62.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r62.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r62, typeTable);
            if ((typeInlineClassUnderlyingType != null && (simpleTypeMarker = (SimpleTypeMarker) typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (simpleTypeMarker = (SimpleTypeMarker) typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, simpleTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r62.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r62.getMultiFieldValueClassUnderlyingNameList();
        AbstractC3340k.d(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        for (Integer num : list) {
            AbstractC3340k.b(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        C2527k c2527k = new C2527k(Integer.valueOf(r62.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r62.getMultiFieldValueClassUnderlyingTypeCount()));
        if (c2527k.equals(new C2527k(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r62.getMultiFieldValueClassUnderlyingTypeIdList();
            AbstractC3340k.d(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList(p.a0(list2, 10));
            for (Integer num2 : list2) {
                AbstractC3340k.b(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!c2527k.equals(new C2527k(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r62.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r62.getMultiFieldValueClassUnderlyingTypeList();
        }
        AbstractC3340k.b(multiFieldValueClassUnderlyingTypeList);
        Iterable iterable = (Iterable) multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(o.Z0(arrayList, arrayList2));
    }
}
