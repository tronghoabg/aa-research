package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.util.Log;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.i;
import h.a.r;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FragmentStrictMode {
    private static final String TAG = "FragmentStrictMode";
    public static final FragmentStrictMode INSTANCE = new FragmentStrictMode();
    private static Policy defaultPolicy = Policy.LAX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class Flag {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag PENALTY_LOG = new Flag("PENALTY_LOG", 0);
        public static final Flag PENALTY_DEATH = new Flag("PENALTY_DEATH", 1);
        public static final Flag DETECT_FRAGMENT_REUSE = new Flag("DETECT_FRAGMENT_REUSE", 2);
        public static final Flag DETECT_FRAGMENT_TAG_USAGE = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
        public static final Flag DETECT_WRONG_NESTED_HIERARCHY = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
        public static final Flag DETECT_RETAIN_INSTANCE_USAGE = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
        public static final Flag DETECT_SET_USER_VISIBLE_HINT = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
        public static final Flag DETECT_TARGET_FRAGMENT_USAGE = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
        public static final Flag DETECT_WRONG_FRAGMENT_CONTAINER = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);

        private static final /* synthetic */ Flag[] $values() {
            return new Flag[]{PENALTY_LOG, PENALTY_DEATH, DETECT_FRAGMENT_REUSE, DETECT_FRAGMENT_TAG_USAGE, DETECT_WRONG_NESTED_HIERARCHY, DETECT_RETAIN_INSTANCE_USAGE, DETECT_SET_USER_VISIBLE_HINT, DETECT_TARGET_FRAGMENT_USAGE, DETECT_WRONG_FRAGMENT_CONTAINER};
        }

        static {
            Flag[] flagArr$values = $values();
            $VALUES = flagArr$values;
            $ENTRIES = b.a(flagArr$values);
        }

        private Flag(String str, int i2) {
        }

        public static a<Flag> getEntries() {
            return $ENTRIES;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public interface OnViolationListener {
        void onViolation(Violation violation);
    }

    private FragmentStrictMode() {
    }

    private final Policy getNearestPolicy(ar arVar) {
        while (arVar != null) {
            if (arVar.isAdded()) {
                x.e(arVar.getParentFragmentManager(), "getParentFragmentManager(...)");
            }
            arVar = arVar.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void handlePolicyViolation(final Policy policy, final Violation violation) {
        ar fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (policy.getFlags$fragment().contains(Flag.PENALTY_LOG)) {
            Log.d(TAG, "Policy violation in ".concat(String.valueOf(name)), violation);
        }
        if (policy.getListener$fragment() != null) {
            runOnHostThread(fragment, new Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    policy.getListener$fragment().onViolation(violation);
                }
            });
        }
        if (policy.getFlags$fragment().contains(Flag.PENALTY_DEATH)) {
            runOnHostThread(fragment, new Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$1(name, violation);
                }
            });
        }
    }

    static final void handlePolicyViolation$lambda$1(String str, Violation violation) {
        Log.e(TAG, "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(str)), violation);
        throw violation;
    }

    private final void logIfDebuggingEnabled(Violation violation) {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(violation.getFragment().getClass().getName())), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFragmentReuse(ar arVar, String str) {
        x.f(arVar, "fragment");
        x.f(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(arVar, str);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentReuseViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFragmentTagUsage(ar arVar, ViewGroup viewGroup) {
        x.f(arVar, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(arVar, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentTagUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onGetRetainInstanceUsage(ar arVar) {
        x.f(arVar, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(arVar);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onGetTargetFragmentRequestCodeUsage(ar arVar) {
        x.f(arVar, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(arVar);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onGetTargetFragmentUsage(ar arVar) {
        x.f(arVar, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(arVar);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSetRetainInstanceUsage(ar arVar) {
        x.f(arVar, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(arVar);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSetTargetFragmentUsage(ar arVar, ar arVar2, int i2) {
        x.f(arVar, "violatingFragment");
        x.f(arVar2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(arVar, arVar2, i2);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSetUserVisibleHint(ar arVar, boolean z) {
        x.f(arVar, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(arVar, z);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setUserVisibleHintViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWrongFragmentContainer(ar arVar, ViewGroup viewGroup) {
        x.f(arVar, "fragment");
        x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(arVar, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWrongNestedHierarchy(ar arVar, ar arVar2, int i2) {
        x.f(arVar, "fragment");
        x.f(arVar2, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(arVar, arVar2, i2);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongNestedHierarchyViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(arVar);
        if (nearestPolicy.getFlags$fragment().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, arVar.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongNestedHierarchyViolation);
        }
    }

    private final void runOnHostThread(ar arVar, Runnable runnable) {
        if (!arVar.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerJ = arVar.getParentFragmentManager().p().j();
        if (x.n(handlerJ.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerJ.post(runnable);
        }
    }

    private final boolean shouldHandlePolicyViolation(Policy policy, Class<? extends ar> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = policy.getMAllowedViolations$fragment().get(cls.getName());
        if (set == null) {
            return true;
        }
        return (x.n(cls2.getSuperclass(), Violation.class) || !i.ax(set, cls2.getSuperclass())) && !set.contains(cls2);
    }

    public final Policy getDefaultPolicy() {
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPolicyViolation(Violation violation) {
        x.f(violation, "violation");
        logIfDebuggingEnabled(violation);
        ar fragment = violation.getFragment();
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), violation.getClass())) {
            handlePolicyViolation(nearestPolicy, violation);
        }
    }

    public final void setDefaultPolicy(Policy policy) {
        x.f(policy, "<set-?>");
        defaultPolicy = policy;
    }

    /* compiled from: WazeSource */
    public final class Policy {
        public static final Companion Companion = new Companion(null);
        public static final Policy LAX = new Policy(e.c.d.a.p(), null, r.j());
        private final Set<Flag> flags;
        private final OnViolationListener listener;
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(Set<? extends Flag> set, OnViolationListener onViolationListener, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            x.f(set, "flags");
            x.f(map, "allowedViolations");
            this.flags = set;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<Flag> getFlags$fragment() {
            return this.flags;
        }

        public final OnViolationListener getListener$fragment() {
            return this.listener;
        }

        public final Map<String, Set<Class<? extends Violation>>> getMAllowedViolations$fragment() {
            return this.mAllowedViolations;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* compiled from: WazeSource */
        /* loaded from: classes3.dex */
        public final class Builder {
            private OnViolationListener listener;
            private final Set<Flag> flags = new LinkedHashSet();
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            public final Builder allowViolation(String str, Class<? extends Violation> cls) {
                x.f(str, "fragmentClass");
                x.f(cls, "violationClass");
                LinkedHashSet linkedHashSet = this.mAllowedViolations.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(cls);
                this.mAllowedViolations.put(str, linkedHashSet);
                return this;
            }

            public final Policy build() {
                if (this.listener == null && !this.flags.contains(Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new Policy(this.flags, this.listener, this.mAllowedViolations);
            }

            public final Builder detectFragmentReuse() {
                this.flags.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            public final Builder detectFragmentTagUsage() {
                this.flags.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            public final Builder detectRetainInstanceUsage() {
                this.flags.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            public final Builder detectSetUserVisibleHint() {
                this.flags.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            public final Builder detectTargetFragmentUsage() {
                this.flags.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            public final Builder detectWrongFragmentContainer() {
                this.flags.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            public final Builder detectWrongNestedHierarchy() {
                this.flags.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            public final Builder penaltyDeath() {
                this.flags.add(Flag.PENALTY_DEATH);
                return this;
            }

            public final Builder penaltyListener(OnViolationListener onViolationListener) {
                x.f(onViolationListener, "listener");
                this.listener = onViolationListener;
                return this;
            }

            public final Builder penaltyLog() {
                this.flags.add(Flag.PENALTY_LOG);
                return this;
            }

            public final Builder allowViolation(Class<? extends ar> cls, Class<? extends Violation> cls2) {
                x.f(cls, "fragmentClass");
                x.f(cls2, "violationClass");
                String name = cls.getName();
                x.c(name);
                allowViolation(name, cls2);
                return this;
            }
        }
    }
}
