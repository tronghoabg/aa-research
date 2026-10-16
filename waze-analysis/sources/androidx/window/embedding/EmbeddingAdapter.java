package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.camera.video.AudioStats;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.Bounds;
import androidx.window.core.ExtensionsUtil$$ExternalSyntheticApiModelOutline0;
import androidx.window.core.PredicateAdapter;
import androidx.window.embedding.DividerAttributes;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.EmbeddingAnimationBackground;
import androidx.window.embedding.EmbeddingAnimationParams;
import androidx.window.embedding.EmbeddingConfiguration;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.AnimationParams;
import androidx.window.extensions.embedding.DividerAttributes;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPinRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import androidx.window.extensions.embedding.WindowAttributes;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import androidx.window.layout.util.DensityCompatHelper;
import androidx.window.reflection.JFunction2;
import androidx.window.reflection.Predicate2;
import e.a.b.a.ap$$ExternalSyntheticApiModelOutline1;
import e.c.d.a;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k;
import h.n.o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingAdapter {
    public static final Companion Companion = new Companion(null);
    private static final Binder INVALID_SPLIT_INFO_TOKEN;
    private static final String RULE_TAG_PREFIX;
    private static final String TAG;
    private final VendorApiLevel1Impl api1Impl;
    private final VendorApiLevel2Impl api2Impl;
    private final VendorApiLevel3Impl api3Impl;
    private EmbeddingConfiguration embeddingConfiguration;
    private final PredicateAdapter predicateAdapter;

    /* compiled from: WazeSource */
    final class VendorApiLevel2Impl {
        public VendorApiLevel2Impl() {
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            x.f(splitInfo, "splitInfo");
            VendorApiLevel1Impl vendorApiLevel1Impl = EmbeddingAdapter.this.api1Impl;
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            x.e(primaryActivityStack, "getPrimaryActivityStack(...)");
            ActivityStack activityStackTranslateCompat = vendorApiLevel1Impl.translateCompat(primaryActivityStack);
            VendorApiLevel1Impl vendorApiLevel1Impl2 = EmbeddingAdapter.this.api1Impl;
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            x.e(secondaryActivityStack, "getSecondaryActivityStack(...)");
            ActivityStack activityStackTranslateCompat2 = vendorApiLevel1Impl2.translateCompat(secondaryActivityStack);
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            x.e(splitAttributes, "getSplitAttributes(...)");
            return new SplitInfo(activityStackTranslateCompat, activityStackTranslateCompat2, EmbeddingAdapter.this.translate$window(splitAttributes));
        }
    }

    /* compiled from: WazeSource */
    final class VendorApiLevel3Impl {
        public VendorApiLevel3Impl() {
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            x.f(splitInfo, "splitInfo");
            VendorApiLevel1Impl vendorApiLevel1Impl = EmbeddingAdapter.this.api1Impl;
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            x.e(primaryActivityStack, "getPrimaryActivityStack(...)");
            ActivityStack activityStackTranslateCompat = vendorApiLevel1Impl.translateCompat(primaryActivityStack);
            VendorApiLevel1Impl vendorApiLevel1Impl2 = EmbeddingAdapter.this.api1Impl;
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            x.e(secondaryActivityStack, "getSecondaryActivityStack(...)");
            ActivityStack activityStackTranslateCompat2 = vendorApiLevel1Impl2.translateCompat(secondaryActivityStack);
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            x.e(splitAttributes, "getSplitAttributes(...)");
            SplitAttributes splitAttributesTranslate$window = EmbeddingAdapter.this.translate$window(splitAttributes);
            IBinder token = splitInfo.getToken();
            x.e(token, "getToken(...)");
            return new SplitInfo(activityStackTranslateCompat, activityStackTranslateCompat2, splitAttributesTranslate$window, token);
        }
    }

    static {
        int i2 = ar.f48106a;
        TAG = new m(EmbeddingAdapter.class).c();
        RULE_TAG_PREFIX = "ae-gen:";
        INVALID_SPLIT_INFO_TOKEN = new Binder();
    }

    public EmbeddingAdapter(PredicateAdapter predicateAdapter) {
        x.f(predicateAdapter, "predicateAdapter");
        this.predicateAdapter = predicateAdapter;
        this.api1Impl = new VendorApiLevel1Impl(this, predicateAdapter);
        this.api2Impl = new VendorApiLevel2Impl();
        this.api3Impl = new VendorApiLevel3Impl();
    }

    public static /* synthetic */ void getEmbeddingConfiguration$annotations() {
    }

    private final int getExtensionVersion() {
        return WindowSdkExtensions.Companion.getInstance().getExtensionVersion();
    }

    private final androidx.window.extensions.embedding.ActivityRule translateActivityRule(final ActivityRule activityRule, Class<?> cls) {
        if (getExtensionVersion() < 2) {
            return this.api1Impl.translateActivityRuleCompat(activityRule, cls);
        }
        ActivityRule.Builder shouldAlwaysExpand = new ActivityRule.Builder(new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda8
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateActivityRule$lambda$0(activityRule, (Activity) obj);
            }
        }, new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda9
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateActivityRule$lambda$1(activityRule, (Intent) obj);
            }
        }).setShouldAlwaysExpand(activityRule.getAlwaysExpand());
        x.e(shouldAlwaysExpand, "setShouldAlwaysExpand(...)");
        String tag = activityRule.getTag();
        if (tag == null) {
            tag = Companion.generateTag(activityRule);
        }
        shouldAlwaysExpand.setTag(tag);
        androidx.window.extensions.embedding.ActivityRule activityRuleBuild = shouldAlwaysExpand.build();
        x.e(activityRuleBuild, "build(...)");
        return activityRuleBuild;
    }

    static final boolean translateActivityRule$lambda$0(ActivityRule activityRule, Activity activity) {
        x.f(activity, "activity");
        Set<ActivityFilter> filters = activityRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    static final boolean translateActivityRule$lambda$1(ActivityRule activityRule, Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        Set<ActivityFilter> filters = activityRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    static final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributesCalculator$lambda$0(EmbeddingAdapter embeddingAdapter, l lVar, androidx.window.extensions.embedding.SplitAttributesCalculatorParams splitAttributesCalculatorParams) {
        x.f(splitAttributesCalculatorParams, "oemParams");
        return embeddingAdapter.translateSplitAttributes((SplitAttributes) lVar.invoke(embeddingAdapter.translate(splitAttributesCalculatorParams)));
    }

    private final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRule(final Context context, final SplitPairRule splitPairRule, Class<?> cls) {
        if (getExtensionVersion() < 2) {
            return this.api1Impl.translateSplitPairRuleCompat(context, splitPairRule, cls);
        }
        Predicate2 predicate2 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda5
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$0(splitPairRule, (Pair) obj);
            }
        };
        Predicate2 predicate22 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda6
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$1(splitPairRule, (Pair) obj);
            }
        };
        Predicate2 predicate23 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda7
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$2(splitPairRule, context, ap$$ExternalSyntheticApiModelOutline1.m29305m(obj));
            }
        };
        String tag = splitPairRule.getTag();
        SplitPairRule.Builder shouldClearTop = new SplitPairRule.Builder(predicate2, predicate22, predicate23).setDefaultSplitAttributes(translateSplitAttributes(splitPairRule.getDefaultSplitAttributes())).setFinishPrimaryWithSecondary(translateFinishBehavior(splitPairRule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(translateFinishBehavior(splitPairRule.getFinishSecondaryWithPrimary())).setShouldClearTop(splitPairRule.getClearTop());
        x.e(shouldClearTop, "setShouldClearTop(...)");
        if (tag == null) {
            tag = Companion.generateTag(splitPairRule);
        }
        shouldClearTop.setTag(tag);
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = shouldClearTop.build();
        x.e(splitPairRuleBuild, "build(...)");
        return splitPairRuleBuild;
    }

    static final boolean translateSplitPairRule$lambda$0(SplitPairRule splitPairRule, Pair pair) {
        x.f(pair, "activitiesPair");
        Set<SplitPairFilter> filters = splitPairRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            x.e(obj, "first");
            Object obj2 = pair.second;
            x.e(obj2, "second");
            if (splitPairFilter.matchesActivityPair((Activity) obj, (Activity) obj2)) {
                return true;
            }
        }
        return false;
    }

    static final boolean translateSplitPairRule$lambda$1(SplitPairRule splitPairRule, Pair pair) {
        x.f(pair, "activityIntentPair");
        Set<SplitPairFilter> filters = splitPairRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            x.e(obj, "first");
            Object obj2 = pair.second;
            x.e(obj2, "second");
            if (splitPairFilter.matchesActivityIntentPair((Activity) obj, (Intent) obj2)) {
                return true;
            }
        }
        return false;
    }

    static final boolean translateSplitPairRule$lambda$2(SplitPairRule splitPairRule, Context context, WindowMetrics windowMetrics) {
        x.f(windowMetrics, "windowMetrics");
        return splitPairRule.checkParentMetrics$window(context, windowMetrics);
    }

    static final boolean translateSplitPinRule$lambda$0(SplitPinRule splitPinRule, Context context, WindowMetrics windowMetrics) {
        x.f(windowMetrics, "windowMetrics");
        return splitPinRule.checkParentMetrics$window(context, windowMetrics);
    }

    private final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRule(final Context context, final SplitPlaceholderRule splitPlaceholderRule, Class<?> cls) {
        if (getExtensionVersion() < 2) {
            return this.api1Impl.translateSplitPlaceholderRuleCompat(context, splitPlaceholderRule, cls);
        }
        Predicate2 predicate2 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda2
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$0(splitPlaceholderRule, (Activity) obj);
            }
        };
        Predicate2 predicate22 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda3
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$1(splitPlaceholderRule, (Intent) obj);
            }
        };
        Predicate2 predicate23 = new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda4
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$2(splitPlaceholderRule, context, ap$$ExternalSyntheticApiModelOutline1.m29305m(obj));
            }
        };
        String tag = splitPlaceholderRule.getTag();
        SplitPlaceholderRule.Builder finishPrimaryWithPlaceholder = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), predicate2, predicate22, predicate23).setSticky(splitPlaceholderRule.isSticky()).setDefaultSplitAttributes(translateSplitAttributes(splitPlaceholderRule.getDefaultSplitAttributes())).setFinishPrimaryWithPlaceholder(translateFinishBehavior(splitPlaceholderRule.getFinishPrimaryWithPlaceholder()));
        x.e(finishPrimaryWithPlaceholder, "setFinishPrimaryWithPlaceholder(...)");
        if (tag == null) {
            tag = Companion.generateTag(splitPlaceholderRule);
        }
        finishPrimaryWithPlaceholder.setTag(tag);
        androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = finishPrimaryWithPlaceholder.build();
        x.e(splitPlaceholderRuleBuild, "build(...)");
        return splitPlaceholderRuleBuild;
    }

    static final boolean translateSplitPlaceholderRule$lambda$0(SplitPlaceholderRule splitPlaceholderRule, Activity activity) {
        x.f(activity, "activity");
        Set<ActivityFilter> filters = splitPlaceholderRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    static final boolean translateSplitPlaceholderRule$lambda$1(SplitPlaceholderRule splitPlaceholderRule, Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        Set<ActivityFilter> filters = splitPlaceholderRule.getFilters();
        if ((filters instanceof Collection) && filters.isEmpty()) {
            return false;
        }
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    static final boolean translateSplitPlaceholderRule$lambda$2(SplitPlaceholderRule splitPlaceholderRule, Context context, WindowMetrics windowMetrics) {
        x.f(windowMetrics, "windowMetrics");
        return splitPlaceholderRule.checkParentMetrics$window(context, windowMetrics);
    }

    private final SplitAttributes.SplitType translateSplitType(SplitAttributes.SplitType splitType) {
        if (getExtensionVersion() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (x.n(splitType, SplitAttributes.SplitType.SPLIT_TYPE_HINGE)) {
            return ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13433m((Object) new SplitAttributes.SplitType.HingeSplitType(translateSplitType(SplitAttributes.SplitType.SPLIT_TYPE_EQUAL)));
        }
        if (x.n(splitType, SplitAttributes.SplitType.SPLIT_TYPE_EXPAND)) {
            return ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13433m((Object) new SplitAttributes.SplitType.ExpandContainersSplitType());
        }
        float value$window = splitType.getValue$window();
        double d2 = value$window;
        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE && d2 < 1.0d) {
            return ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13433m((Object) new SplitAttributes.SplitType.RatioSplitType(value$window));
        }
        throw new IllegalArgumentException("Unsupported SplitType: " + splitType + " with value: " + splitType.getValue$window());
    }

    private final EmbeddingAnimationBackground translateToJetpackAnimationBackground(AnimationBackground animationBackground) {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        return ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13449m((Object) animationBackground) ? EmbeddingAnimationBackground.Companion.createColorBackground(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13422m((Object) animationBackground).getColor()) : EmbeddingAnimationBackground.DEFAULT;
    }

    private final EmbeddingAnimationParams.AnimationSpec translateToJetpackAnimationSpec(int i2) {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(7);
        return i2 == 0 ? EmbeddingAnimationParams.AnimationSpec.JUMP_CUT : EmbeddingAnimationParams.AnimationSpec.DEFAULT;
    }

    private final AnimationBackground translateToOemAnimationBackground(EmbeddingAnimationBackground embeddingAnimationBackground) {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        if (embeddingAnimationBackground instanceof EmbeddingAnimationBackground.ColorBackground) {
            AnimationBackground.ColorBackground colorBackgroundCreateColorBackground = AnimationBackground.createColorBackground(((EmbeddingAnimationBackground.ColorBackground) embeddingAnimationBackground).getColor());
            x.c(colorBackgroundCreateColorBackground);
            return ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13426m((Object) colorBackgroundCreateColorBackground);
        }
        AnimationBackground animationBackground = AnimationBackground.ANIMATION_BACKGROUND_DEFAULT;
        x.c(animationBackground);
        return animationBackground;
    }

    private final int translateToOemAnimationResId(EmbeddingAnimationParams.AnimationSpec animationSpec) {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(7);
        return x.n(animationSpec, EmbeddingAnimationParams.AnimationSpec.JUMP_CUT) ? 0 : -1;
    }

    public final EmbeddingConfiguration getEmbeddingConfiguration() {
        return this.embeddingConfiguration;
    }

    public final void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration) {
        this.embeddingConfiguration = embeddingConfiguration;
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Context context, Set<? extends EmbeddingRule> set) {
        androidx.window.extensions.embedding.EmbeddingRule embeddingRuleM13430m;
        x.f(context, "context");
        x.f(set, "rules");
        Class<?> clsPredicateClassOrNull$window = this.predicateAdapter.predicateClassOrNull$window();
        if (clsPredicateClassOrNull$window == null) {
            return a.p();
        }
        Set<? extends EmbeddingRule> set2 = set;
        ArrayList arrayList = new ArrayList(i.q(set2, 10));
        for (EmbeddingRule embeddingRule : set2) {
            if (embeddingRule instanceof SplitPairRule) {
                embeddingRuleM13430m = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13430m((Object) translateSplitPairRule(context, (SplitPairRule) embeddingRule, clsPredicateClassOrNull$window));
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                embeddingRuleM13430m = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13430m((Object) translateSplitPlaceholderRule(context, (SplitPlaceholderRule) embeddingRule, clsPredicateClassOrNull$window));
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                embeddingRuleM13430m = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13430m((Object) translateActivityRule((ActivityRule) embeddingRule, clsPredicateClassOrNull$window));
            }
            arrayList.add(embeddingRuleM13430m);
        }
        return i.au(arrayList);
    }

    public final SplitAttributes translate$window(androidx.window.extensions.embedding.SplitAttributes splitAttributes) {
        SplitAttributes.SplitType splitTypeRatio;
        SplitAttributes.LayoutDirection layoutDirection;
        x.f(splitAttributes, "splitAttributes");
        SplitAttributes.Builder builder = new SplitAttributes.Builder();
        SplitAttributes.SplitType splitType = splitAttributes.getSplitType();
        x.e(splitType, "getSplitType(...)");
        if (ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m$3(splitType)) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_HINGE;
        } else if (ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m$1(splitType)) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_EXPAND;
        } else {
            if (!ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m$2(splitType)) {
                Objects.toString(splitType);
                throw new IllegalArgumentException("Unknown split type: ".concat(String.valueOf(splitType)));
            }
            splitTypeRatio = SplitAttributes.SplitType.Companion.ratio(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13431m((Object) splitType).getRatio());
        }
        SplitAttributes.Builder splitType2 = builder.setSplitType(splitTypeRatio);
        int layoutDirection2 = splitAttributes.getLayoutDirection();
        if (layoutDirection2 == 0) {
            layoutDirection = SplitAttributes.LayoutDirection.LEFT_TO_RIGHT;
        } else if (layoutDirection2 == 1) {
            layoutDirection = SplitAttributes.LayoutDirection.RIGHT_TO_LEFT;
        } else if (layoutDirection2 == 3) {
            layoutDirection = SplitAttributes.LayoutDirection.LOCALE;
        } else if (layoutDirection2 == 4) {
            layoutDirection = SplitAttributes.LayoutDirection.TOP_TO_BOTTOM;
        } else {
            if (layoutDirection2 != 5) {
                throw new IllegalArgumentException("Unknown layout direction: " + layoutDirection2);
            }
            layoutDirection = SplitAttributes.LayoutDirection.BOTTOM_TO_TOP;
        }
        SplitAttributes.Builder layoutDirection3 = splitType2.setLayoutDirection(layoutDirection);
        int extensionVersion = getExtensionVersion();
        if (extensionVersion >= 5 && extensionVersion < 7) {
            EmbeddingAnimationParams.Builder builder2 = new EmbeddingAnimationParams.Builder();
            AnimationBackground animationBackground = splitAttributes.getAnimationBackground();
            x.e(animationBackground, "getAnimationBackground(...)");
            layoutDirection3.setAnimationParams(builder2.setAnimationBackground(translateToJetpackAnimationBackground(animationBackground)).build());
        }
        if (getExtensionVersion() >= 7) {
            EmbeddingAnimationParams.Builder builder3 = new EmbeddingAnimationParams.Builder();
            AnimationBackground animationBackground2 = splitAttributes.getAnimationParams().getAnimationBackground();
            x.e(animationBackground2, "getAnimationBackground(...)");
            layoutDirection3.setAnimationParams(builder3.setAnimationBackground(translateToJetpackAnimationBackground(animationBackground2)).setOpenAnimation(translateToJetpackAnimationSpec(splitAttributes.getAnimationParams().getOpenAnimationResId())).setCloseAnimation(translateToJetpackAnimationSpec(splitAttributes.getAnimationParams().getCloseAnimationResId())).setChangeAnimation(translateToJetpackAnimationSpec(splitAttributes.getAnimationParams().getChangeAnimationResId())).build());
        }
        if (getExtensionVersion() >= 6) {
            layoutDirection3.setDividerAttributes(translateToJetpackDividerAttributes(splitAttributes.getDividerAttributes()));
        }
        return layoutDirection3.build();
    }

    public final int translateFinishBehavior(SplitRule.FinishBehavior finishBehavior) {
        x.f(finishBehavior, "behavior");
        if (x.n(finishBehavior, SplitRule.FinishBehavior.NEVER)) {
            return 0;
        }
        if (x.n(finishBehavior, SplitRule.FinishBehavior.ALWAYS)) {
            return 1;
        }
        if (x.n(finishBehavior, SplitRule.FinishBehavior.ADJACENT)) {
            return 2;
        }
        Objects.toString(finishBehavior);
        throw new IllegalArgumentException("Unknown finish behavior:".concat(String.valueOf(finishBehavior)));
    }

    public final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributes(SplitAttributes splitAttributes) {
        int i2;
        x.f(splitAttributes, "splitAttributes");
        if (getExtensionVersion() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SplitAttributes.Builder splitType = new SplitAttributes.Builder().setSplitType(translateSplitType(splitAttributes.getSplitType()));
        SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
        if (x.n(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
            i2 = 3;
        } else if (x.n(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
            i2 = 0;
        } else if (x.n(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
            i2 = 1;
        } else if (x.n(layoutDirection, SplitAttributes.LayoutDirection.TOP_TO_BOTTOM)) {
            i2 = 4;
        } else {
            if (!x.n(layoutDirection, SplitAttributes.LayoutDirection.BOTTOM_TO_TOP)) {
                throw new IllegalArgumentException("Unsupported layoutDirection:" + splitAttributes + ".layoutDirection");
            }
            i2 = 5;
        }
        SplitAttributes.Builder layoutDirection2 = splitType.setLayoutDirection(i2);
        x.e(layoutDirection2, "setLayoutDirection(...)");
        if (getExtensionVersion() >= 5) {
            layoutDirection2.setWindowAttributes(translateWindowAttributes$window());
        }
        int extensionVersion = getExtensionVersion();
        if (extensionVersion >= 5 && extensionVersion < 7) {
            layoutDirection2.setAnimationBackground(translateToOemAnimationBackground(splitAttributes.getAnimationParams().getAnimationBackground()));
        }
        if (getExtensionVersion() >= 7) {
            AnimationParams animationParamsBuild = new AnimationParams.Builder().setAnimationBackground(translateToOemAnimationBackground(splitAttributes.getAnimationParams().getAnimationBackground())).setOpenAnimationResId(translateToOemAnimationResId(splitAttributes.getAnimationParams().getOpenAnimation())).setCloseAnimationResId(translateToOemAnimationResId(splitAttributes.getAnimationParams().getCloseAnimation())).setChangeAnimationResId(translateToOemAnimationResId(splitAttributes.getAnimationParams().getChangeAnimation())).build();
            x.e(animationParamsBuild, "build(...)");
            layoutDirection2.setAnimationParams(animationParamsBuild);
        }
        if (getExtensionVersion() >= 6) {
            layoutDirection2.setDividerAttributes(translateToOemDividerAttributes(splitAttributes.getDividerAttributes()));
        }
        androidx.window.extensions.embedding.SplitAttributes splitAttributesBuild = layoutDirection2.build();
        x.e(splitAttributesBuild, "build(...)");
        return splitAttributesBuild;
    }

    public final JFunction2<androidx.window.extensions.embedding.SplitAttributesCalculatorParams, androidx.window.extensions.embedding.SplitAttributes> translateSplitAttributesCalculator(final l<? super SplitAttributesCalculatorParams, SplitAttributes> lVar) {
        x.f(lVar, "calculator");
        return new JFunction2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda1
            @Override // androidx.window.reflection.JFunction2, androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return EmbeddingAdapter.translateSplitAttributesCalculator$lambda$0(this.f$0, lVar, ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13436m(obj));
            }
        };
    }

    public final androidx.window.extensions.embedding.SplitPinRule translateSplitPinRule(final Context context, final SplitPinRule splitPinRule) {
        x.f(context, "context");
        x.f(splitPinRule, "splitPinRule");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        SplitPinRule.Builder builder = new SplitPinRule.Builder(translateSplitAttributes(splitPinRule.getDefaultSplitAttributes()), new Predicate2() { // from class: androidx.window.embedding.EmbeddingAdapter$$ExternalSyntheticLambda0
            @Override // androidx.window.reflection.Predicate2, androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPinRule$lambda$0(splitPinRule, context, ap$$ExternalSyntheticApiModelOutline1.m29305m(obj));
            }
        });
        builder.setSticky(splitPinRule.isSticky());
        String tag = splitPinRule.getTag();
        if (tag == null) {
            tag = Companion.generateTag(splitPinRule);
        }
        builder.setTag(tag);
        androidx.window.extensions.embedding.SplitPinRule splitPinRuleBuild = builder.build();
        x.e(splitPinRuleBuild, "build(...)");
        return splitPinRuleBuild;
    }

    public final DividerAttributes translateToJetpackDividerAttributes(androidx.window.extensions.embedding.DividerAttributes dividerAttributes) {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(6);
        if (dividerAttributes == null) {
            return DividerAttributes.NO_DIVIDER;
        }
        int dividerType = dividerAttributes.getDividerType();
        if (dividerType == 1) {
            return new DividerAttributes.FixedDividerAttributes.Builder().setWidthDp(dividerAttributes.getWidthDp()).setColor(dividerAttributes.getDividerColor()).build();
        }
        if (dividerType == 2) {
            return new DividerAttributes.DraggableDividerAttributes.Builder().setWidthDp(dividerAttributes.getWidthDp()).setColor(dividerAttributes.getDividerColor()).setDragRange((dividerAttributes.getPrimaryMinRatio() == -1.0f && dividerAttributes.getPrimaryMaxRatio() == -1.0f) ? DividerAttributes.DragRange.DRAG_RANGE_SYSTEM_DEFAULT : new DividerAttributes.DragRange.SplitRatioDragRange(dividerAttributes.getPrimaryMinRatio(), dividerAttributes.getPrimaryMaxRatio())).setDraggingToFullscreenAllowed(getExtensionVersion() >= 7 && dividerAttributes.isDraggingToFullscreenAllowed()).build();
        }
        Log.w(TAG, "Unknown divider type " + dividerAttributes + ".dividerType, default to fixed divider type");
        return new DividerAttributes.FixedDividerAttributes.Builder().setWidthDp(dividerAttributes.getWidthDp()).setColor(dividerAttributes.getDividerColor()).build();
    }

    public final androidx.window.extensions.embedding.DividerAttributes translateToOemDividerAttributes(DividerAttributes dividerAttributes) {
        int i2;
        x.f(dividerAttributes, "dividerAttributes");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(6);
        if (dividerAttributes == DividerAttributes.NO_DIVIDER) {
            return null;
        }
        if (dividerAttributes instanceof DividerAttributes.FixedDividerAttributes) {
            i2 = 1;
        } else {
            if (!(dividerAttributes instanceof DividerAttributes.DraggableDividerAttributes)) {
                Objects.toString(dividerAttributes);
                throw new IllegalArgumentException("Unknown divider attributes ".concat(String.valueOf(dividerAttributes)));
            }
            i2 = 2;
        }
        DividerAttributes.Builder widthDp = new DividerAttributes.Builder(i2).setDividerColor(dividerAttributes.getColor()).setWidthDp(dividerAttributes.getWidthDp());
        x.e(widthDp, "setWidthDp(...)");
        if (dividerAttributes instanceof DividerAttributes.DraggableDividerAttributes) {
            DividerAttributes.DraggableDividerAttributes draggableDividerAttributes = (DividerAttributes.DraggableDividerAttributes) dividerAttributes;
            if (draggableDividerAttributes.getDragRange() instanceof DividerAttributes.DragRange.SplitRatioDragRange) {
                widthDp.setPrimaryMinRatio(((DividerAttributes.DragRange.SplitRatioDragRange) draggableDividerAttributes.getDragRange()).getMinRatio()).setPrimaryMaxRatio(((DividerAttributes.DragRange.SplitRatioDragRange) draggableDividerAttributes.getDragRange()).getMaxRatio());
            }
            if (getExtensionVersion() >= 7) {
                widthDp.setDraggingToFullscreenAllowed(draggableDividerAttributes.isDraggingToFullscreenAllowed());
            }
        }
        if (getExtensionVersion() == 7 && dividerAttributes.getWidthDp() == 0) {
            widthDp.setWidthDp(1);
        }
        return widthDp.build();
    }

    public final WindowAttributes translateWindowAttributes$window() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        EmbeddingConfiguration embeddingConfiguration = this.embeddingConfiguration;
        return new WindowAttributes(true != x.n(embeddingConfiguration != null ? embeddingConfiguration.getDimAreaBehavior() : null, EmbeddingConfiguration.DimAreaBehavior.ON_ACTIVITY_STACK) ? 2 : 1);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final String generateTag(EmbeddingRule embeddingRule) {
            x.f(embeddingRule, "rule");
            return String.valueOf(getRULE_TAG_PREFIX()).concat(String.valueOf(Integer.toHexString(embeddingRule.hashCode())));
        }

        public final Binder getINVALID_SPLIT_INFO_TOKEN() {
            return EmbeddingAdapter.INVALID_SPLIT_INFO_TOKEN;
        }

        public final String getRULE_TAG_PREFIX() {
            return EmbeddingAdapter.RULE_TAG_PREFIX;
        }

        public final boolean isTagGenerated(String str) {
            x.f(str, "tag");
            String strX = o.x(str, getRULE_TAG_PREFIX());
            return (x.n(strX, str) || o.g(strX, 16) == null) ? false : true;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class VendorApiLevel1Impl {
        private final PredicateAdapter predicateAdapter;
        final /* synthetic */ EmbeddingAdapter this$0;

        public VendorApiLevel1Impl(EmbeddingAdapter embeddingAdapter, PredicateAdapter predicateAdapter) {
            x.f(predicateAdapter, "predicateAdapter");
            this.this$0 = embeddingAdapter;
            this.predicateAdapter = predicateAdapter;
        }

        private final boolean isSplitAttributesSupported(SplitAttributes splitAttributes) {
            double value$window = splitAttributes.getSplitType().getValue$window();
            return value$window >= AudioStats.AUDIO_AMPLITUDE_NONE && value$window <= 1.0d && splitAttributes.getSplitType().getValue$window() != 1.0f && c.aj(new SplitAttributes.LayoutDirection[]{SplitAttributes.LayoutDirection.LEFT_TO_RIGHT, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT, SplitAttributes.LayoutDirection.LOCALE}, splitAttributes.getLayoutDirection());
        }

        private final SplitPairRule.Builder setDefaultSplitAttributesCompat(SplitPairRule.Builder builder, SplitAttributes splitAttributes) {
            k<Float, Integer> kVarTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) kVarTranslateSplitAttributesCompatInternal.a()).floatValue();
            int iIntValue = ((Number) kVarTranslateSplitAttributesCompatInternal.b()).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }

        private final Object translateActivityIntentPredicates(final Set<SplitPairFilter> set) {
            int i2 = ar.f48106a;
            return this.predicateAdapter.buildPairPredicate(new m(Activity.class), new m(Intent.class), new p() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(EmbeddingAdapter.VendorApiLevel1Impl.translateActivityIntentPredicates$lambda$0(set, (Activity) obj, (Intent) obj2));
                }
            });
        }

        static final boolean translateActivityIntentPredicates$lambda$0(Set set, Activity activity, Intent intent) {
            x.f(activity, "first");
            x.f(intent, "second");
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                    return true;
                }
            }
            return false;
        }

        private final Object translateActivityPairPredicates(final Set<SplitPairFilter> set) {
            int i2 = ar.f48106a;
            return this.predicateAdapter.buildPairPredicate(new m(Activity.class), new m(Activity.class), new p() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(EmbeddingAdapter.VendorApiLevel1Impl.translateActivityPairPredicates$lambda$0(set, (Activity) obj, (Activity) obj2));
                }
            });
        }

        static final boolean translateActivityPairPredicates$lambda$0(Set set, Activity activity, Activity activity2) {
            x.f(activity, "first");
            x.f(activity2, "second");
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                    return true;
                }
            }
            return false;
        }

        private final Object translateActivityPredicates(final Set<ActivityFilter> set) {
            int i2 = ar.f48106a;
            return this.predicateAdapter.buildPredicate(new m(Activity.class), new l() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(EmbeddingAdapter.VendorApiLevel1Impl.translateActivityPredicates$lambda$0(set, (Activity) obj));
                }
            });
        }

        static final boolean translateActivityPredicates$lambda$0(Set set, Activity activity) {
            x.f(activity, "activity");
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                    return true;
                }
            }
            return false;
        }

        private final Object translateIntentPredicates(final Set<ActivityFilter> set) {
            int i2 = ar.f48106a;
            return this.predicateAdapter.buildPredicate(new m(Intent.class), new l() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(EmbeddingAdapter.VendorApiLevel1Impl.translateIntentPredicates$lambda$0(set, (Intent) obj));
                }
            });
        }

        static final boolean translateIntentPredicates$lambda$0(Set set, Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                    return true;
                }
            }
            return false;
        }

        private final Object translateParentMetricsPredicate(final Context context, final SplitRule splitRule) {
            int i2 = ar.f48106a;
            return this.predicateAdapter.buildPredicate(new m(ap$$ExternalSyntheticApiModelOutline1.m29307m()), new l() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(EmbeddingAdapter.VendorApiLevel1Impl.translateParentMetricsPredicate$lambda$0(splitRule, context, ap$$ExternalSyntheticApiModelOutline1.m29305m(obj)));
                }
            });
        }

        static final boolean translateParentMetricsPredicate$lambda$0(SplitRule splitRule, Context context, WindowMetrics windowMetrics) {
            x.f(windowMetrics, "windowMetrics");
            return splitRule.checkParentMetrics$window(context, windowMetrics);
        }

        private final k<Float, Integer> translateSplitAttributesCompatInternal(SplitAttributes splitAttributes) {
            int i2 = 3;
            if (!isSplitAttributesSupported(splitAttributes)) {
                return new k<>(Float.valueOf(0.0f), 3);
            }
            Float fValueOf = Float.valueOf(splitAttributes.getSplitType().getValue$window());
            SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            if (!x.n(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
                if (x.n(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
                    i2 = 0;
                } else {
                    if (!x.n(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
                        throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                    }
                    i2 = 1;
                }
            }
            return new k<>(fValueOf, Integer.valueOf(i2));
        }

        public final PredicateAdapter getPredicateAdapter() {
            return this.predicateAdapter;
        }

        public final SplitAttributes getSplitAttributesCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            x.f(splitInfo, "splitInfo");
            return new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window(splitInfo.getSplitRatio())).setLayoutDirection(SplitAttributes.LayoutDirection.LOCALE).build();
        }

        public final androidx.window.extensions.embedding.ActivityRule translateActivityRuleCompat(ActivityRule activityRule, Class<?> cls) {
            x.f(activityRule, "rule");
            x.f(cls, "predicateClass");
            androidx.window.extensions.embedding.ActivityRule activityRuleBuild = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m13451m(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13442m().getConstructor(cls, cls).newInstance(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters()))).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
            x.e(activityRuleBuild, "build(...)");
            return activityRuleBuild;
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            x.f(splitInfo, "splitInfo");
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            x.e(primaryActivityStack, "getPrimaryActivityStack(...)");
            ActivityStack activityStackTranslateCompat = translateCompat(primaryActivityStack);
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            x.e(secondaryActivityStack, "getSecondaryActivityStack(...)");
            return new SplitInfo(activityStackTranslateCompat, translateCompat(secondaryActivityStack), getSplitAttributesCompat(splitInfo));
        }

        public final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRuleCompat(Context context, SplitPairRule splitPairRule, Class<?> cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            x.f(context, "context");
            x.f(splitPairRule, "rule");
            x.f(cls, "predicateClass");
            Object objNewInstance = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m().getConstructor(cls, cls, cls).newInstance(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate(context, splitPairRule));
            x.e(objNewInstance, "newInstance(...)");
            SplitPairRule.Builder builderM13454m = EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m13454m(objNewInstance);
            setDefaultSplitAttributesCompat(builderM13454m, splitPairRule.getDefaultSplitAttributes());
            androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = builderM13454m.setShouldClearTop(splitPairRule.getClearTop()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(splitPairRule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(this.this$0.translateFinishBehavior(splitPairRule.getFinishSecondaryWithPrimary())).build();
            x.e(splitPairRuleBuild, "build(...)");
            return splitPairRuleBuild;
        }

        public final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRuleCompat(Context context, SplitPlaceholderRule splitPlaceholderRule, Class<?> cls) {
            x.f(context, "context");
            x.f(splitPlaceholderRule, "rule");
            x.f(cls, "predicateClass");
            SplitPlaceholderRule.Builder finishPrimaryWithSecondary = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13439m(EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$1().getConstructor(Intent.class, cls, cls, cls).newInstance(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate(context, splitPlaceholderRule))).setSticky(splitPlaceholderRule.isSticky()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(splitPlaceholderRule.getFinishPrimaryWithPlaceholder()));
            x.e(finishPrimaryWithSecondary, "setFinishPrimaryWithSecondary(...)");
            setDefaultSplitAttributesCompat(finishPrimaryWithSecondary, splitPlaceholderRule.getDefaultSplitAttributes());
            androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = finishPrimaryWithSecondary.build();
            x.e(splitPlaceholderRuleBuild, "build(...)");
            return splitPlaceholderRuleBuild;
        }

        private final SplitPlaceholderRule.Builder setDefaultSplitAttributesCompat(SplitPlaceholderRule.Builder builder, SplitAttributes splitAttributes) {
            k<Float, Integer> kVarTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) kVarTranslateSplitAttributesCompatInternal.a()).floatValue();
            int iIntValue = ((Number) kVarTranslateSplitAttributesCompatInternal.b()).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }

        public final ActivityStack translateCompat(androidx.window.extensions.embedding.ActivityStack activityStack) {
            x.f(activityStack, "activityStack");
            List activities = activityStack.getActivities();
            x.e(activities, "getActivities(...)");
            return new ActivityStack(activities, activityStack.isEmpty());
        }
    }

    public final SplitAttributesCalculatorParams translate(androidx.window.extensions.embedding.SplitAttributesCalculatorParams splitAttributesCalculatorParams) {
        x.f(splitAttributesCalculatorParams, "params");
        WindowMetrics parentWindowMetrics = splitAttributesCalculatorParams.getParentWindowMetrics();
        x.e(parentWindowMetrics, "getParentWindowMetrics(...)");
        Configuration parentConfiguration = splitAttributesCalculatorParams.getParentConfiguration();
        x.e(parentConfiguration, "getParentConfiguration(...)");
        WindowLayoutInfo parentWindowLayoutInfo = splitAttributesCalculatorParams.getParentWindowLayoutInfo();
        x.e(parentWindowLayoutInfo, "getParentWindowLayoutInfo(...)");
        androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = splitAttributesCalculatorParams.getDefaultSplitAttributes();
        x.e(defaultSplitAttributes, "getDefaultSplitAttributes(...)");
        boolean zAreDefaultConstraintsSatisfied = splitAttributesCalculatorParams.areDefaultConstraintsSatisfied();
        String splitRuleTag = null;
        if (splitAttributesCalculatorParams.getSplitRuleTag() != null) {
            Companion companion = Companion;
            String splitRuleTag2 = splitAttributesCalculatorParams.getSplitRuleTag();
            x.c(splitRuleTag2);
            if (!companion.isTagGenerated(splitRuleTag2)) {
                splitRuleTag = splitAttributesCalculatorParams.getSplitRuleTag();
            }
        }
        String str = splitRuleTag;
        androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window = WindowMetricsCalculator.Companion.translateWindowMetrics$window(parentWindowMetrics, DensityCompatHelper.Companion.getInstance().density(parentConfiguration, parentWindowMetrics));
        return new SplitAttributesCalculatorParams(windowMetricsTranslateWindowMetrics$window, parentConfiguration, ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window(windowMetricsTranslateWindowMetrics$window, parentWindowLayoutInfo), translate$window(defaultSplitAttributes), zAreDefaultConstraintsSatisfied, str);
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        int extensionVersion = getExtensionVersion();
        if (extensionVersion == 1) {
            return this.api1Impl.translateCompat(splitInfo);
        }
        if (extensionVersion == 2) {
            return this.api2Impl.translateCompat(splitInfo);
        }
        if (extensionVersion < 3 || extensionVersion >= 5) {
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            x.e(primaryActivityStack, "getPrimaryActivityStack(...)");
            ActivityStack activityStackTranslate$window = translate$window(primaryActivityStack);
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            x.e(secondaryActivityStack, "getSecondaryActivityStack(...)");
            ActivityStack activityStackTranslate$window2 = translate$window(secondaryActivityStack);
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            x.e(splitAttributes, "getSplitAttributes(...)");
            SplitAttributes splitAttributesTranslate$window = translate$window(splitAttributes);
            SplitInfo.Token splitInfoToken = splitInfo.getSplitInfoToken();
            x.e(splitInfoToken, "getSplitInfoToken(...)");
            return new SplitInfo(activityStackTranslate$window, activityStackTranslate$window2, splitAttributesTranslate$window, splitInfoToken);
        }
        return this.api3Impl.translateCompat(splitInfo);
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        x.f(list, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(translate(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13438m(it.next())));
        }
        return arrayList;
    }

    public final ParentContainerInfo translate$window(androidx.window.extensions.embedding.ParentContainerInfo parentContainerInfo) {
        x.f(parentContainerInfo, "parentContainerInfo");
        Configuration configuration = parentContainerInfo.getConfiguration();
        x.e(configuration, "getConfiguration(...)");
        DensityCompatHelper companion = DensityCompatHelper.Companion.getInstance();
        Configuration configuration2 = parentContainerInfo.getConfiguration();
        x.e(configuration2, "getConfiguration(...)");
        WindowMetrics windowMetrics = parentContainerInfo.getWindowMetrics();
        x.e(windowMetrics, "getWindowMetrics(...)");
        float fDensity = companion.density(configuration2, windowMetrics);
        WindowMetricsCalculator.Companion companion2 = WindowMetricsCalculator.Companion;
        WindowMetrics windowMetrics2 = parentContainerInfo.getWindowMetrics();
        x.e(windowMetrics2, "getWindowMetrics(...)");
        androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window = companion2.translateWindowMetrics$window(windowMetrics2, fDensity);
        Bounds bounds = new Bounds(windowMetricsTranslateWindowMetrics$window.getBounds());
        ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
        WindowLayoutInfo windowLayoutInfo = parentContainerInfo.getWindowLayoutInfo();
        x.e(windowLayoutInfo, "getWindowLayoutInfo(...)");
        return new ParentContainerInfo(bounds, extensionsWindowLayoutInfoAdapter.translate$window(windowMetricsTranslateWindowMetrics$window, windowLayoutInfo), configuration, fDensity);
    }

    public final ActivityStack translate$window(androidx.window.extensions.embedding.ActivityStack activityStack) {
        x.f(activityStack, "activityStack");
        int extensionVersion = getExtensionVersion();
        if (extensionVersion <= 0 || extensionVersion >= 5) {
            List activities = activityStack.getActivities();
            x.e(activities, "getActivities(...)");
            return new ActivityStack(activities, activityStack.isEmpty(), activityStack.getActivityStackToken());
        }
        return this.api1Impl.translateCompat(activityStack);
    }

    public final List<ActivityStack> translate$window(List<? extends androidx.window.extensions.embedding.ActivityStack> list) {
        x.f(list, "activityStacks");
        List<? extends androidx.window.extensions.embedding.ActivityStack> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(translate$window(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m(it.next())));
        }
        return arrayList;
    }
}
