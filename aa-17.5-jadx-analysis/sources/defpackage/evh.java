package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class evh extends evl {
    private final Class r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evh(Class cls) {
        super(cls, null);
        cls.getClass();
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" is not an Enum type."));
        }
    }

    @Override // defpackage.evl, defpackage.evm
    public final String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.evl, defpackage.evm
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String str) {
        Object obj;
        str.getClass();
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int i = 0;
        while (true) {
            if (i >= enumConstants.length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (afyh.R(((Enum) obj).name(), str)) {
                break;
            }
            i++;
        }
        Enum r2 = (Enum) obj;
        if (r2 != null) {
            return r2;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + ".");
    }
}
