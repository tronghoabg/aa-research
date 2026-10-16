package kotlin.reflect.jvm.internal.impl.util;

import Bf.i;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class Checks {

    @NotNull
    private final l additionalCheck;

    @NotNull
    private final Check[] checks;

    @Nullable
    private final Name name;

    @Nullable
    private final Collection<Name> nameList;

    @Nullable
    private final i regex;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // tf.l
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "$this$null");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // tf.l
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "$this$null");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC3343n implements l {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // tf.l
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            AbstractC3340k.e(functionDescriptor, "$this$null");
            return null;
        }
    }

    private Checks(Name name, i iVar, Collection<Name> collection, l lVar, Check... checkArr) {
        this.name = name;
        this.regex = iVar;
        this.nameList = collection;
        this.additionalCheck = lVar;
        this.checks = checkArr;
    }

    @NotNull
    public final CheckResult checkAll(@NotNull FunctionDescriptor functionDescriptor) {
        AbstractC3340k.e(functionDescriptor, "functionDescriptor");
        for (Check check : this.checks) {
            String strInvoke = check.invoke(functionDescriptor);
            if (strInvoke != null) {
                return new CheckResult.IllegalSignature(strInvoke);
            }
        }
        String str = (String) this.additionalCheck.invoke(functionDescriptor);
        return str != null ? new CheckResult.IllegalSignature(str) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(@NotNull FunctionDescriptor functionDescriptor) {
        AbstractC3340k.e(functionDescriptor, "functionDescriptor");
        if (this.name != null && !AbstractC3340k.a(functionDescriptor.getName(), this.name)) {
            return false;
        }
        if (this.regex != null) {
            String strAsString = functionDescriptor.getName().asString();
            AbstractC3340k.d(strAsString, "asString(...)");
            if (!this.regex.b(strAsString)) {
                return false;
            }
        }
        Collection<Name> collection = this.nameList;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, l lVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (i5 & 4) != 0 ? AnonymousClass2.INSTANCE : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Name name, @NotNull Check[] checks, @NotNull l additionalChecks) {
        this(name, (i) null, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(checks, "checks");
        AbstractC3340k.e(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(i iVar, Check[] checkArr, l lVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, checkArr, (i5 & 4) != 0 ? AnonymousClass3.INSTANCE : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull i regex, @NotNull Check[] checks, @NotNull l additionalChecks) {
        this((Name) null, regex, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC3340k.e(regex, "regex");
        AbstractC3340k.e(checks, "checks");
        AbstractC3340k.e(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, l lVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (i5 & 4) != 0 ? AnonymousClass4.INSTANCE : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> nameList, @NotNull Check[] checks, @NotNull l additionalChecks) {
        this((Name) null, (i) null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        AbstractC3340k.e(nameList, "nameList");
        AbstractC3340k.e(checks, "checks");
        AbstractC3340k.e(additionalChecks, "additionalChecks");
    }
}
