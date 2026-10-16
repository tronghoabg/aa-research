package kotlin.reflect.jvm.internal.impl.descriptors;

import E5.Q;
import ef.C2527k;
import ff.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public abstract class ValueClassRepresentation<Type extends SimpleTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean containsPropertyWithName(@NotNull Name name);

    @NotNull
    public abstract List<C2527k> getUnderlyingPropertyNamesToTypes();

    @NotNull
    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(@NotNull l transform) {
        AbstractC3340k.e(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), (SimpleTypeMarker) transform.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            throw new Q((byte) 0, 9);
        }
        List<C2527k> underlyingPropertyNamesToTypes = getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(p.a0(underlyingPropertyNamesToTypes, 10));
        for (C2527k c2527k : underlyingPropertyNamesToTypes) {
            arrayList.add(new C2527k((Name) c2527k.f34671a, transform.invoke((SimpleTypeMarker) c2527k.f34672b)));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }

    private ValueClassRepresentation() {
    }
}
