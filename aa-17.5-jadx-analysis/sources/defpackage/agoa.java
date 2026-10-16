package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agoa {
    private agnv constantValue;
    private int flags;
    private agol isInstanceType;
    private Integer parameterIndex;
    private final List<agoa> andArguments = new ArrayList(0);
    private final List<agoa> orArguments = new ArrayList(0);

    public final List<agoa> getAndArguments() {
        return this.andArguments;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final List<agoa> getOrArguments() {
        return this.orArguments;
    }

    public final void setConstantValue(agnv agnvVar) {
        this.constantValue = agnvVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setInstanceType(agol agolVar) {
        this.isInstanceType = agolVar;
    }

    public final void setParameterIndex(Integer num) {
        this.parameterIndex = num;
    }
}
