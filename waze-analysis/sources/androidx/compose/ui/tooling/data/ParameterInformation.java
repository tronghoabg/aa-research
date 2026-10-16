package androidx.compose.ui.tooling.data;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ParameterInformation {
    public static final int $stable = 8;
    private final boolean compared;
    private final boolean fromDefault;
    private final String inlineClass;
    private final String name;
    private final boolean stable;

    /* renamed from: static, reason: not valid java name */
    private final boolean f48static;
    private final Object value;

    public ParameterInformation(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.name = str;
        this.value = obj;
        this.fromDefault = z;
        this.f48static = z2;
        this.compared = z3;
        this.inlineClass = str2;
        this.stable = z4;
    }

    public static /* synthetic */ ParameterInformation copy$default(ParameterInformation parameterInformation, String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = parameterInformation.name;
        }
        if ((i2 & 2) != 0) {
            obj = parameterInformation.value;
        }
        if ((i2 & 4) != 0) {
            z = parameterInformation.fromDefault;
        }
        if ((i2 & 8) != 0) {
            z2 = parameterInformation.f48static;
        }
        if ((i2 & 16) != 0) {
            z3 = parameterInformation.compared;
        }
        if ((i2 & 32) != 0) {
            str2 = parameterInformation.inlineClass;
        }
        if ((i2 & 64) != 0) {
            z4 = parameterInformation.stable;
        }
        String str3 = str2;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z;
        return parameterInformation.copy(str, obj, z7, z2, z6, str3, z5);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.fromDefault;
    }

    public final boolean component4() {
        return this.f48static;
    }

    public final boolean component5() {
        return this.compared;
    }

    public final String component6() {
        return this.inlineClass;
    }

    public final boolean component7() {
        return this.stable;
    }

    public final ParameterInformation copy(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        return new ParameterInformation(str, obj, z, z2, z3, str2, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        return x.n(this.name, parameterInformation.name) && x.n(this.value, parameterInformation.value) && this.fromDefault == parameterInformation.fromDefault && this.f48static == parameterInformation.f48static && this.compared == parameterInformation.compared && x.n(this.inlineClass, parameterInformation.inlineClass) && this.stable == parameterInformation.stable;
    }

    public final boolean getCompared() {
        return this.compared;
    }

    public final boolean getFromDefault() {
        return this.fromDefault;
    }

    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getStable() {
        return this.stable;
    }

    public final boolean getStatic() {
        return this.f48static;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        int iHashCode2 = (((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + ParameterInformation$$ExternalSyntheticBackport0.m(this.fromDefault)) * 31) + ParameterInformation$$ExternalSyntheticBackport0.m(this.f48static)) * 31) + ParameterInformation$$ExternalSyntheticBackport0.m(this.compared)) * 31;
        String str = this.inlineClass;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + ParameterInformation$$ExternalSyntheticBackport0.m(this.stable);
    }

    public String toString() {
        return "ParameterInformation(name=" + this.name + ", value=" + this.value + ", fromDefault=" + this.fromDefault + ", static=" + this.f48static + ", compared=" + this.compared + ", inlineClass=" + this.inlineClass + ", stable=" + this.stable + ')';
    }
}
