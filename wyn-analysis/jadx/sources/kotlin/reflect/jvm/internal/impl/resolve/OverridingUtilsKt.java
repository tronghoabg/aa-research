package kotlin.reflect.jvm.internal.impl.resolve;

import ff.o;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull l descriptorByHandle) {
        AbstractC3340k.e(collection, "<this>");
        AbstractC3340k.e(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objQ0 = o.q0(linkedList);
            SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objQ0, linkedList, descriptorByHandle, new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(smartSetCreate2));
            AbstractC3340k.d(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objH0 = o.H0(collectionExtractMembersOverridableInBothWays);
                AbstractC3340k.d(objH0, "single(...)");
                smartSetCreate.add(objH0);
            } else {
                Object objSelectMostSpecificMember = OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                AbstractC3340k.d(objSelectMostSpecificMember, "selectMostSpecificMember(...)");
                CallableDescriptor callableDescriptor = (CallableDescriptor) descriptorByHandle.invoke(objSelectMostSpecificMember);
                for (Object obj : collectionExtractMembersOverridableInBothWays) {
                    AbstractC3340k.b(obj);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) descriptorByHandle.invoke(obj))) {
                        smartSetCreate2.add(obj);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(objSelectMostSpecificMember);
            }
        }
        return smartSetCreate;
    }
}
