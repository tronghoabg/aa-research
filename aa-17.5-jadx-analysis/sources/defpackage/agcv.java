package defpackage;

import defpackage.ailx;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agcv<Type extends ailx> extends agej<Type> {
    private final Map<ahnj, Type> map;
    private final List<aezu<ahnj, Type>> underlyingPropertyNamesToTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public agcv(List<? extends aezu<ahnj, ? extends Type>> list) {
        super(null);
        list.getClass();
        this.underlyingPropertyNamesToTypes = list;
        this.map = woy.bc(getUnderlyingPropertyNamesToTypes());
    }

    public List<aezu<ahnj, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.underlyingPropertyNamesToTypes;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + ')';
    }
}
