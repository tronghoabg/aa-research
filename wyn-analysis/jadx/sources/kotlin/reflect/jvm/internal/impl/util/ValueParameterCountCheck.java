package kotlin.reflect.jvm.internal.impl.util;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f;

/* loaded from: classes5.dex */
public abstract class ValueParameterCountCheck implements Check {

    @NotNull
    private final String description;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* renamed from: n, reason: collision with root package name */
        private final int f39777n;

        /* JADX WARN: Illegal instructions before constructor call */
        public AtLeast(int i5) {
            StringBuilder sbL = f.l(i5, "must have at least ", " value parameter");
            sbL.append(i5 > 1 ? "s" : "");
            super(sbL.toString(), null);
            this.f39777n = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f39777n;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* renamed from: n, reason: collision with root package name */
        private final int f39778n;

        public Equals(int i5) {
            super(AbstractC0279p0.i(i5, "must have exactly ", " value parameters"), null);
            this.f39778n = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f39778n;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {

        @NotNull
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {

        @NotNull
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    private ValueParameterCountCheck(String str) {
        this.description = str;
    }
}
